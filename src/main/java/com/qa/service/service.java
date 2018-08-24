package com.qa.service;
import Bae1.application.account;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

public class service 
{
	private int counter = 1;
	private JSONObject json;
	private Map<Integer, account> map;
	public service()
	{
		map = new HashMap<Integer, account>();		
	}
	
	public void addAccount(account acc)
	{
		map.put(counter, acc);    	
    	counter++;
	}
	
	public account retrive(int no)
	{
		return map.get(no);
	}
	
	public String a()
	{
		json = new JSONObject(map);
		return json.toString();		
	}
	public int times()
	{
		String[] accountArray = json.toString().split("firstName=John");
	    int counter=-1;
	    for(String name : accountArray)
	    {
	   	   counter++;    	   
	    }
	    System.out.println("There are " + counter + " John(s)");
		return counter;
	}
}
