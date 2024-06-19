package com.classLap.demo.vo;

public class BBSVO {
	
	private String w_wr=null;
	private String w_pass=null;
	private String w_title=null;
	private String w_content=null;
	
	@Override
	public String toString() {
		return "BBSVO [w_wr=" + w_wr + ", w_pass=" + w_pass + ", w_title=" + w_title + ", w_content=" + w_content + "]";
	}
	public String getW_wr() {
		return w_wr;
	}
	public void setW_wr(String w_wr) {
		this.w_wr = w_wr;
	}
	public String getW_pass() {
		return w_pass;
	}
	public void setW_pass(String w_pass) {
		this.w_pass = w_pass;
	}
	public String getW_title() {
		return w_title;
	}
	public void setW_title(String w_title) {
		this.w_title = w_title;
	}
	public String getW_content() {
		return w_content;
	}
	public void setW_content(String w_content) {
		this.w_content = w_content;
	}
	
	
	

}
