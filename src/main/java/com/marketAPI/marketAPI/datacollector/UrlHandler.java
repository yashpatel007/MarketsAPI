/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marketAPI.marketAPI.datacollector;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Yash Patel
 */
public class UrlHandler {
    
    private static String dataSourceBase = "https://www.cnbc.com/quotes/?symbol=";

    private static List<String> queryPattern = new ArrayList<>(List.of(".DJI",
                                        ".IXIC",
                                        ".SPX",
                                        "@GC.1",
                                        "@CL.1",
                                        "EUR=",
                                        ".VIX",
                                        ".NYA",
                                        ".RUT",
                                        "@SI.1"));
    
    // returnns to data
    public List<MarketData> getDataList(List<Elements> docsBody){
        
        List<MarketData> result=new ArrayList<>();        
        for (Elements e : docsBody){
            // extract current data/values
            HashMap<String,String> tem = extractCurrData(e);
             MarketData data = new MarketData();
            data.setName(tem.get("name"));
            data.setValue(Double.valueOf(tem.get("value")));
            data.setDate(Date.valueOf(tem.get("date")));
            data.setTime(Time.valueOf(tem.get("time")));
            data.setAbschange(Double.valueOf(tem.get("abschange")));
            data.setPerchange(Double.valueOf(tem.get("relchange")));
            
            // volume process
            if(tem.get("volume").equals("")){
                data.setVolume(null);
            }else{
                data.setVolume(Double.valueOf(tem.get("volume").replaceAll(",","")));
            }
            
            result.add(data);
        }    
        return result;
    }
    
    private HashMap<String, String> extractCurrData(Elements elements){
        HashMap<String,String> result = new HashMap<>();
        
        for (Element e: elements){
            result.put("name", e.getElementsByClass("name").text());
            result.put("value",e.getElementsByClass("last original").get(0).text());

            String delta1= e.getElementsByClass("sign-f").text();
            String delta2= e.getElementsByClass("sign-t").text();
            System.out.println(delta1);
            System.out.println(delta2);
            
            if(delta1.equals("") && delta2.equals("")){
             
                result.put("abschange","0" );
                result.put("relchange", "0");
                
            }else if(delta1.equals("")){
                
                String[] d2= delta2.split(" ");
                result.put("abschange", d2[1]);
                result.put("relchange", d2[4]);
            }else if(delta2.equals("")){
                String[] d1= delta1.split(" ");
                result.put("abschange", d1[4]);
                result.put("relchange", d1[1]);
            }
            
            result.put("volume", e.getElementsByClass("volume original").text());
            result.put("date", getTimeStamp().get("date"));
            result.put("time", getTimeStamp().get("time"));
            
        }
        
    return result;
    }
    
    public static String getDataSourceBase() {
        return dataSourceBase;
    }

    
    public Document getDocument(String url){
    Document page=null;
        try {
            page = Jsoup.connect(url).execute().parse();
            return page;
        } catch (IOException ex) {
            Logger.getLogger(UrlHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return page;
    }
    
    public List<Elements> extractDocumentBody(){
            // send a req to every url combo and store the doc body in list--> return the list
        List<Elements> result = new ArrayList<>();
        
        for(String query: queryPattern){
            // search url
            String searchUrl = dataSourceBase+query;
            // get document
            Document doc = getDocument(searchUrl);
            // filter document
            Elements  e = doc.getElementsByClass("quote-leftrail ");
            // add to result list
            result.add(e);
        }
    return result;
    }
    
     private HashMap<String,String> getTimeStamp(){
        
        DateTimeFormatter etdateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter ettimeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        ZoneId etZoneId = ZoneId.of("America/New_York");
        LocalDateTime currentDateTime = LocalDateTime.now();
        ZonedDateTime currentETTime = currentDateTime.atZone(etZoneId); //ET Time 
        HashMap<String,String> result = new HashMap<>();
        result.put("date",currentETTime.format(etdateFormat));
        result.put("time", currentDateTime.format(ettimeFormat));
        
        return result;
    }
   
}
