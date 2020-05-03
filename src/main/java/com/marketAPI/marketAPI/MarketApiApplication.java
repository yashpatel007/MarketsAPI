package com.marketAPI.marketAPI;

import com.marketAPI.marketAPI.datacollector.Data;
import com.marketAPI.marketAPI.marketservice.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.springframework.web.server.adapter.WebHttpHandlerBuilder.applicationContext;

@SpringBootApplication
public class MarketApiApplication {
        
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(MarketApiApplication.class, args);
                
                MarketService service = applicationContext.getBean(MarketService.class);
                service.startStoring();
                
	}

}
