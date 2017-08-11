package com.test.dto;

import java.util.List;

public class Goods {

	private int giNum;
	private String giName;
	private String giDesc; 
	private int viNum;
	private String viName;
	private String command;   
	private String page;     
	
	@Override
	public String toString() { 
		return "Goods [giNum=" + giNum + ", giName=" + giName + ", giDesc=" + giDesc + ", viNum=" + viNum + ", viName="
				+ viName + ", command=" + command + ", page=" + page + "]";
	}

	public String getCommand(){
		return command;
	}
	
	public int getGiNum() {
		return giNum; 
	} 
	
	public void setGiNum(int giNum) {
		this.giNum = giNum;
	}
	public String getGiName() {
		return giName;
	}
	public void setGiName(String giName) {
		this.giName = giName;
	}
	public String getGiDesc() {
		return giDesc;
	}
	public void setGiDesc(String giDesc) {
		this.giDesc = giDesc;
	}
	public int getViNum() {
		return viNum;
	}
	public void setViNum(int viNum) {
		this.viNum = viNum;
	}
	public String getViName() {
		return viName;
	}
	public void setViName(String viName) {
		this.viName = viName;
	}
	

}
