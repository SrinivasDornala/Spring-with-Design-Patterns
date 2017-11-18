package com.serviceLocator;

public class InitialLookUpContext {

	public Object lookUp(String jndiName){
		
		if(jndiName.equalsIgnoreCase("LoggerService")){
			System.out.println("InitialLookUpContext.lookUp() LoggerService");
			return new LoggerService();
		}else if(jndiName.equalsIgnoreCase("MessageService")){
			System.out.println("InitialLookUpContext.lookUp() MessageService");
			return new MessageService();
		}
		return null;
	}
}
