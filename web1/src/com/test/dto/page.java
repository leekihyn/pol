package com.test.dto;

public class page {

	
	private int nowPage = 1;
	
	public int getNowPage(){
		return nowPage;
	} 

	@Override
	public String toString() {
		return "page [nowPage=" + nowPage + "]";
	}
	
	
}
