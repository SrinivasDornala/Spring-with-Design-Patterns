package com.consume;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DBServiceObj {

	String name;
	String staffName[];
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
	List<Map<String, Object>> list;
	public List<Map<String, Object>> getList() {
		return list;
	}
	public void setList(List<Map<String, Object>> list) {
		this.list = list;
	} 

}
