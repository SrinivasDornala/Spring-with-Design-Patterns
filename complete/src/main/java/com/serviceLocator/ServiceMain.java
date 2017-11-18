package com.serviceLocator;

public class ServiceMain {

	/*static {
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ServiceMain.enclosing_method()");
		}
	}*/
	public static void main(String[] args) {
		Service LoggerService = ServiceLocator.getService("LoggerService");
		LoggerService.executeService();
		LoggerService = ServiceLocator.getService("LoggerService");
		LoggerService.executeService();
	}
}
