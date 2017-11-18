package com.serviceLocator;

public class MessageService implements Service {

	@Override
	public String getServiceName() {
		// TODO Auto-generated method stub
		return "MessageService";
	}

	@Override
	public String executeService() {
		// TODO Auto-generated method stub
		System.out.println("MessageService.executeService()");
		return "MessageService Execute";
	}

}
