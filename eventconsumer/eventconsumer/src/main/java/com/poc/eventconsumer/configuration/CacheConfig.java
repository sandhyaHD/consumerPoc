/**
 * 
 */
package com.poc.eventconsumer.configuration;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;

/**
 * @author sandhya.devendrappa
 *
 */
@Configuration

public class CacheConfig {
	@Bean
	public Config hazelCastConfig() {
		Config config = new Config();
		MapConfig mapConfig = new MapConfig();
		
		config.setInstanceName("hazelcast-instance")
		.addMapConfig(mapConfig.setName("petrolpricecache")
		.setTimeToLiveSeconds(24*60*60));
		

	    return config;
	}

}
