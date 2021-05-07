/**
 * 
 */
package com.poc.eventconsumer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poc.eventconsumer.model.Car;
import com.poc.eventconsumer.service.FuelPriceService;

/**
 * @author sandhya.devendrappa
 *
 */
@RestController
public class EventListener {
	
	
   @Autowired
   FuelPriceService fuelPriceService;
	
	@KafkaListener(topics = "CarTopic", groupId="carGroupId",
			containerFactory="carEventListenerContainerFactory")
    public void consumeCar(Car car) {
       
		if(null!=car && car.isLidOpen()) {
			Double petrolPrice=fuelPriceService.getFulePriceForCity(car.getLocation());
			System.out.println("petrolPrice"+petrolPrice);// to do calculate Price per tank 
			
		}
       
      
    }

}
