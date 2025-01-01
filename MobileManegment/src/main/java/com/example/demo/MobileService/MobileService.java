package com.example.demo.MobileService;

import com.example.demo.model.Mobile;


public class MobileService {

	public void addMobile(Mobile m) {
		
		System.out.println("added mobile in shop");
		
		
		
	}
	
	public  Mobile getMobile(int price) {
		
		System.out.println("get mobile from shop");
		Mobile m =new Mobile();
		m.setBrand("iphone");
		m.setModel("iphone 16");
		m.setPrice(200000);
		
		return m ;
		
		
	}
	
	
	
	
	
	
	
}
