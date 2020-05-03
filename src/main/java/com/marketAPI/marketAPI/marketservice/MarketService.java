/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marketAPI.marketAPI.marketservice;

import com.marketAPI.marketAPI.datacollector.Data;
import com.marketAPI.marketAPI.datacollector.MarketData;
import com.marketAPI.marketAPI.repository.MarketRepository;
import java.sql.Date;
import java.sql.Time;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Timer;
import java.util.TimerTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yash Patel
 */

@Service
public class MarketService{
    
    
    @Autowired
    MarketRepository marketRepo;
      
   
    
    
    public void StoreToDB() {
        
        Data data = new Data();
       
        List<MarketData> marketdata = data.getMarketSnapshot();
        System.out.println("=====================================");
        for(MarketData md: marketdata){
            marketRepo.storeMarketRecord(md.getName(), md.getValue(),
                        md.getAbschange() , md.getPerchange(), 
                        md.getVolume(),
                        md.getDate(), md.getTime());
        }
          
        
        
    }

    
    public void startStoring() {
        
         Timer timer = new Timer();
            System.out.println("starting thread");
            timer.schedule( new TimerTask() {
                public void run() {
                        StoreToDB();
                }
            }, 0, 10*60*1000);
        
    }
    
    
  
    
}
