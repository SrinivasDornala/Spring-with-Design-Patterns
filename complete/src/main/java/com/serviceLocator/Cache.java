package com.serviceLocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {

	private List<Service> services;
	public Cache(){
		services = new ArrayList<Service>();
	}
	public Service getService(String ServiceName){
		for (Service service : services) {
			if(ServiceName.equalsIgnoreCase(service.getServiceName())){
				System.out.println("Cache.getService() "+ServiceName);
				return service;
			}
		}
		return null;
	}
	
	public void addService(Service newService){
		boolean exsits = false;
		for (Service service : services) {
			if(newService.getServiceName().equalsIgnoreCase(service.getServiceName())){
				System.out.println("Cache.addService() "+newService.getServiceName());
				exsits = true;
			}
		}
		if(!exsits){
			services.add(newService);
		}
	}
}
