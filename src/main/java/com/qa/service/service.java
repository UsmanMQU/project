package com.qa.service;
import Bae1.application.account;
import java.util.HashMap;
import java.util.Map;

public class service 
{
	private int counter = 1;
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
}
