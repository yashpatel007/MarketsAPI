/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marketAPI.marketAPI.controllers;

import com.marketAPI.marketAPI.datacollector.Data;
import com.marketAPI.marketAPI.datacollector.MarketData;
import com.marketAPI.marketAPI.marketservice.DataGetter;
import com.marketAPI.marketAPI.repository.MarketRepository;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Yash Patel
 */

@RestController
public class MarketController {
    
    @Autowired
    MarketRepository marketRepo;
    
    @Autowired
    DataGetter dataGetter;
    
    
    Data data = new Data();
    @RequestMapping("/market")
    public List<MarketData> showMarketSnapshot(){
        return data.getMarketSnapshot();
    }
    
    @RequestMapping("/all")
    public Iterable<MarketData> test(){
        return marketRepo.findAll();
    }
    
    @RequestMapping("/market/name/{name}")
    public List<MarketData> getByName(@PathVariable("name") String name){
            return dataGetter.getByName(name);
    }
    
    @RequestMapping("/market/date/{date}")
    public List<MarketData> getByDate(@PathVariable("date") String date){
        return dataGetter.getByDate(Date.valueOf(date));
    }
    
    
    
    
    
}
