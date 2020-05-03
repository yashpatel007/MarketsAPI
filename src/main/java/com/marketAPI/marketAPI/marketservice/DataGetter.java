/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marketAPI.marketAPI.marketservice;

import com.marketAPI.marketAPI.datacollector.MarketData;
import com.marketAPI.marketAPI.repository.MarketRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yash Patel
 */

@Service
public class DataGetter {
    
    @Autowired
    MarketRepository marketRepo;
    
    
     private static Map<String, String> nameAbbriviations = new HashMap<String,String>(){
        {
            put("DIJA", "Dow Jones Industrial Average");
            put("NASDAQ", "NASDAQ Composite");
            put("S&P500","S&P 500 Index");
            put("GOLD", "Gold COMEX (Jun'20)");
            put("OIL", "WTI Crude (Jun'20)");
            put("EUR-USD","EUR/USD");
            put("VIX", "CBOE Volatility Index");
            put("NYSE", "NYSE Composite");
            put("RUSS","Russell 2000 Index");
            put("SILVER", "Silver COMEX (Jul'20)");
            
        }
    
    };
     
     
       public List<MarketData> getByName(String name){
        
        if(nameAbbriviations.containsKey(name)){
        return marketRepo.findByName(nameAbbriviations.get(name));
        }
        
        return null;
    }
       
       public List<MarketData> getByDate(java.sql.Date date){
           return marketRepo.findByDate(date);
       }
       
    
    
    
    
    
}
