/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marketAPI.marketAPI.repository;

import com.marketAPI.marketAPI.datacollector.MarketData;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Yash Patel
 */

@Repository
public interface MarketRepository extends  CrudRepository<MarketData, Long> {
    
    @Transactional 
    @Modifying(clearAutomatically = true)
    @Query(value = "INSERT INTO market_data (abschange,date,name,perchange,time,value,volume)"
            + " VALUES (:abschange,:date,:name,:perchange,:time,:value,:volume)",nativeQuery = true)
    public void storeMarketRecord(String name,Double value,
            Double abschange,Double perchange,
            Double volume,
            java.sql.Date date,java.sql.Time time);

    public List<MarketData> findByName(String name);
    public List<MarketData> findByDate(java.sql.Date date);
    
    
    @Query(value ="SELECT * FROM market_data WHERE name=:name and date=:date" ,nativeQuery = true)
    public List<MarketData> findByNameAndDate(String name,java.sql.Date date);
    
    
}
