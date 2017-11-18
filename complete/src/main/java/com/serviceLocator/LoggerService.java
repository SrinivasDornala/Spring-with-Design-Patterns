package com.serviceLocator;

public class LoggerService implements Service {

	@Override
	public String getServiceName() {
		// TODO Auto-generated method stub
		return "LoggerService";
	}

	@Override
	public String executeService() {
		// TODO Auto-generated method stub
		System.out.println("LoggerService.executeService()");
		return "LoggerService execute ";
		
	}

}
