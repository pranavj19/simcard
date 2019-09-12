package com.sakha.Simcard;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.sakha.Simcard")
@PropertySource("app.properties")		

public class Appconfig {
	@Bean("mg")
	public MessageSender getMsBean() {
	
		MessageSender mss=new MessageSender();
		mss.setMmscharge(3);
		mss.setSmsCharge(7);
		return mss;
		
	}
	
	@Bean("Airtel")
	public Airtel getAirtelBean() {
		Airtel airtel =new Airtel();
		airtel.setCallCharge(5);
		airtel.setInternetCharge(2);
		airtel.setSmsCharge(3);
		airtel.setMg(getMsBean());
		
		return airtel;
	}
	
	@Bean("Idea")
	public Idea getIdeaBean() {
		Idea idea =new Idea();
		idea.setCallCharge(5);
		idea.setInternetCharge(2);
		idea.setSmsCharge(3);
		idea.setMg1(getMsBean());
		
		return idea;
	}
	@Bean("Mobile")
	public Mobile getMobile() {
		Mobile mobile=new Mobile();
		mobile.setSim(getAirtelBean());
		return mobile;
	}
	
}
