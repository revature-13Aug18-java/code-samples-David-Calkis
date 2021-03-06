package com.revature.rideshare.matching.clients;

import org.springframework.stereotype.Component;

import com.revature.rideshare.matching.beans.Route;

/** This class is the fallback implementation for when a service cannot 
 * make a successful connection with a MapClient. The general behavior
 * is to give a ResponseError stating that a connection could not be 
 * made. */
@Component
public class MapsClientFallback implements MapsClient {
	
	/** 
	 * Returns null. This fallback is executed when the we can't successfully 
	 * receive input from the maps-service. 
	 */
	@Override
	public Route getRoute(String start, String end) {
		return null;
	}


}
