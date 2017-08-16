package com.test.dto;

public class BoardInfo {
	/*
	 * `usernum` INT(5) NOT NULL AUTO_INCREMENT, `userid` VARCHAR(30) NOT NULL,
	 * `username` VARCHAR(100) NOT NULL, `age` INT(1) NOT NULL, `address`
	 * VARCHAR(200) NOT NULL, `hp1` CHAR(4) NULL DEFAULT NULL, `hp2` CHAR(4)
	 * NULL DEFAULT NULL, `hp3` CHAR(4) NULL DEFAULT NULL, `userpwd`
	 * VARCHAR(100) NOT NULL,
	 */
	private int biNum;
	private String biTitle;
	private String biContent;
	private String biPwd;
	private String creusr;
	private String credat;
	public int getBiNum() {
		return biNum;
	}
	public void setBiNum(int biNum) {
		this.biNum = biNum;
	}
	public String getBiTitle() {
		return biTitle;
	}
	public void setBiTitle(String biTitle) {
		this.biTitle = biTitle;
	}
	public String getBiContent() {
		return biContent;
	}
	public void setBiContent(String biContent) {
		this.biContent = biContent;
	}
	public String getBiPwd() {
		return biPwd;
	}
	public void setBiPwd(String biPwd) {
		this.biPwd = biPwd;
	}
	public String getCreusr() {
		return creusr;
	}
	public void setCreusr(String creusr) {
		this.creusr = creusr;
	}
	public String getCredat() {
		return credat;
	}
	public void setCredat(String credat) {
		this.credat = credat;
	}

}
