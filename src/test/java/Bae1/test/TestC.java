package Bae1.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.service.service;

import Bae1.application.account;
import junit.framework.TestCase;


public class TestC  
{
	private static service send;
	@BeforeClass
	
	public static void setup1()
	{
		account Usman = new account("John", "John", 1);
        account Usman2 = new account("John", "John", 2);
        send = new service();
        send.addAccount(Usman);
        send.addAccount(Usman2);
        send.a();
        send.times("firstName=John");
	}
	
	@Test
	public void testing()
	{
		assertEquals(send.times("firstName=John"),2);
	}
	
	
	
}
