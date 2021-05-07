/**
 * 
 */
package com.poc.eventconsumer.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author sandhya.devendrappa
 *
 */
@Service
public class FuelPriceService {

	
	 private static final Map<String, Double> fuelPriceMap = new HashMap<String, Double>();
	    static {
	    	fuelPriceMap.put("Allahabad", 89.54);
	    	fuelPriceMap.put("Agra", 88.54);
	    	fuelPriceMap.put("Bangalore",90.23 );
	    	fuelPriceMap.put("Mumbai",92.11 );
	    	fuelPriceMap.put("Kolkata",80.00 );
	    	fuelPriceMap.put("Chennai", 90.00);
	    	fuelPriceMap.put("Varanasi",89.23 );
	  
	    	
	    }
	    
	@Cacheable(value="petrolpricecache" ,unless="#result==null")
	public Double getFulePriceForCity(String location) {
		Double avgPrice=90.00;
		if(location!=null)
			return fuelPriceMap.get(location);
		return avgPrice;
	}

}
