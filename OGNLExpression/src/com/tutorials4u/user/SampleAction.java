package com.tutorials4u.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleAction {

	private  String[] sampleArray;
	private  List<String> sampleList = new ArrayList<String>();
	private  Map<Integer,String> sampleMap = new HashMap<Integer,String>();
	private  String carMake;
	private  User user = new User();
	private  static String STR;
	{
		sampleArray =  new String[]{"item1","item2","item3"};
		sampleList.add("listItem1");
		sampleList.add("listItem2");
		sampleList.add("listItem3");
		sampleMap.put(new Integer(1), "one");
		sampleMap.put(new Integer(2), "two");
		sampleMap.put(new Integer(3), "three");
		user.setName("Eswar");
	}
	static {
		STR = "This is a static string variable";
	}
	public String execute()
	{
		return "success";
	}
	
	public String quote()
	{
		return "Don't think, just do";
	}
	
	public static String proverb()
	{
		return "Stay Hungry. Stay Foolish";
	}
	public String[] getSampleArray() {
		return sampleArray;
	}
	public void setSampleArray(String[] sampleArray) {
		this.sampleArray = sampleArray;
	}
	public List<String> getSampleList() {
		return sampleList;
	}
	public void setSampleList(List<String> sampleList) {
		this.sampleList = sampleList;
	}
	public Map<Integer, String> getSampleMap() {
		return sampleMap;
	}
	public void setSampleMap(Map<Integer, String> sampleMap) {
		this.sampleMap = sampleMap;
	}
	public String getCarMake() {
		return carMake;
	}
	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public static String getStaticStr() {
		return STR;
	}

	public static void setStaticStr(String STR) {
		SampleAction.STR = STR;
	}
	
}
