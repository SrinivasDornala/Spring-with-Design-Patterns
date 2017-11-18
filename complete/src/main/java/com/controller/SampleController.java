package com.controller;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.client.RestTemplate;

import com.consume.DBServiceObj;
import com.consume.DBServicePlayListException;
import com.dto.MessageDTO;
import com.serviceLocator.Service;
import com.serviceLocator.ServiceLocator;

@RestController
@EnableAutoConfiguration
@SessionAttributes("messagedto")
public class SampleController {

	@Autowired()
	public RestTemplate restTemplate;
	
	@RequestMapping("/sample")
	public  MessageDTO sampleMethod(@RequestParam(value="name", defaultValue="MessageService") String name,HttpServletRequest request){
		System.out.println("SampleController.sampleMethod() request address: "+ request.getLocalAddr() +" Port: "+request.getLocalPort());
		Service messageService = ServiceLocator.getService("MessageService");
		MessageDTO messagedto;
		if(request.getSession().getAttribute("messagedto")== null)
		  messagedto = new MessageDTO();
		else messagedto =(MessageDTO) request.getSession().getAttribute("messagedto");
		System.out.println("SampleController.sampleMethod() cnt "+messagedto.cnt);
		messagedto.setService(messageService.executeService());
		//messageService = ServiceLocator.getService("LoggerService");
		RestTemplate restTemplate = new RestTemplate();
		try{
	        DBServiceObj dbServiceObj = restTemplate.getForObject("http://localhost:8081/Sreeni", DBServiceObj.class);
	        messagedto.setStaffName(dbServiceObj.getStaffName());
	        messagedto.setBetList(dbServiceObj.getList());
	        messagedto.setName(dbServiceObj.getName());
		}catch(DBServicePlayListException db){
        	db.printStackTrace();
        }
        request.getSession().setAttribute("messagedto",messagedto);
		return messagedto;
	}
}
