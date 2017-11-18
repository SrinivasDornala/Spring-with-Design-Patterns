package com.dto;

import java.util.List;
import java.util.Map;

public class MessageDTO extends AbstractMessage{

	public MessageDTO(){
		cnt=0;
	}
	private String service;
	private String name;
	private String staffName[];
	private List<Map<String, Object>> betList;
	public String getService() {
		cnt++;
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getStaffName() {
		return staffName;
	}
	public void setStaffName(String[] staffName) {
		this.staffName = staffName;
	}
	public List<Map<String, Object>> getBetList() {
		return betList;
	}
	public void setBetList(List<Map<String, Object>> betList) {
		this.betList = betList;
	}
}
