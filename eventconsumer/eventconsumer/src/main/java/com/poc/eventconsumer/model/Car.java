/**
 * 
 */
package com.poc.eventconsumer.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author sandhya.devendrappa
 *
 */

public class Car {

	Boolean lidOpen;

	String location;

	public Boolean isLidOpen() {
		return lidOpen;
	}

	public void setLidOpen(Boolean lidOpen) {
		this.lidOpen = lidOpen;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
