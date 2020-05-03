/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marketAPI.marketAPI.datacollector;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Yash Patel
 */

public class Data {
    
    private static UrlHandler urlHandler = new UrlHandler();
    public List<MarketData> getMarketSnapshot(){
        List<Elements> docsBody = urlHandler.extractDocumentBody();
        return urlHandler.getDataList(docsBody);    
    }
    
    
         
}
