/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marketAPI.marketAPI.datacollector;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Yash Patel
 */
@Entity
public class MarketData {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private Double value;
    private Double abschange;
    private Double perchange;
    private Double volume;
    private java.sql.Date date;
    private java.sql.Time time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getAbschange() {
        return abschange;
    }

    public void setAbschange(Double abschange) {
        this.abschange = abschange;
    }

    public Double getPerchange() {
        return perchange;
    }

    public void setPerchange(Double perchange) {
        this.perchange = perchange;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "MarketData{" + "id=" + id + ", name=" + name + ", value=" + value + ", abschange=" + abschange + ", perchange=" + perchange + ", volume=" + volume + ", date=" + date + ", time=" + time + '}';
    }

    
}
