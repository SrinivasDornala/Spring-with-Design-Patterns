package com.serviceLocator;

public class ServiceLocator {

	private static Cache cache;
	static{
		cache = new Cache();
	}
	
	public static Service getService(String ServiceName){
		Service service = cache.getService(ServiceName);
		if(service!= null){
			return service;
		}
		InitialLookUpContext context = new InitialLookUpContext();
		Service serviceLookUp = (Service)context.lookUp(ServiceName);
		cache.addService(serviceLookUp);
		return serviceLookUp;
		
	}
}
