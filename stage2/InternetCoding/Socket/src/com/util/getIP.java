package com.util;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class getIP
{
	public static void main(String[] args) throws UnknownHostException
	{
		InetAddress host = InetAddress.getLocalHost();
		String ip = host.getHostAddress();
		System.out.println("the ip address is: "+ip);
	}
	
}