package com.sakha.Simcard;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("Airtel")
public class Airtel implements Sim {
	
	
	//@Value("${smsCharge}")
	float smsCharge;
	//@Value("${callCharge}")
	float callCharge;
	//@Value("${internetCharge}")
	int internetCharge;
	
	@Autowired
	MessageSender mg;
	List<String> list=new ArrayList<>();
	
	
	
	

	public Airtel() {
		// TODO Auto-generated constructor stub
	}

	




	public float getSmsCharge() {
		return smsCharge;
	}






	public void setSmsCharge(float smsCharge) {
		this.smsCharge = smsCharge;
	}






	public float getCallCharge() {
		return callCharge;
	}






	public void setCallCharge(float callCharge) {
		this.callCharge = callCharge;
	}






	public int getInternetCharge() {
		return internetCharge;
	}






	public void setInternetCharge(int internetCharge) {
		this.internetCharge = internetCharge;
	}






	public MessageSender getMg() {
		return mg;
	}






	public void setMg(MessageSender mg) {
		this.mg = mg;
	}






	public List<String> getList() {
		return list;
	}






	public void setList(List<String> list) {
		this.list = list;
	}






	/**
	 * @param callCharge
	 * @param smsCharge
	 * @param internetCharge
	 * @param mg
	 * @param list
	 */
	public Airtel(float smsCharge,float callCharge, int internetCharge, MessageSender mg) {
		super();
		this.callCharge = callCharge;
		this.smsCharge = smsCharge;
		this.internetCharge = internetCharge;
		this.mg = mg;
		
	}








	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("Browsing speed"+internetCharge);
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("calling"+"" + callCharge);
	}

	

	@Override
	public void sendMms() {
		// TODO Auto-generated method stub
		mg.SendMms();
		
		
	}


	@Override
	public void suppotedNetworks() {
		// TODO Auto-generated method stub
		//list.add("Volte");
		//list.add("4g");
		//list.add("3g");
//		System.out.println("Supported networks are: ");
//		suppotedNetworks.foreach(
//		(k,v)->System.out.println("");
		System.out.println(list);
		System.out.println(callCharge);
		
	
	}






	@Override
	public void sendSms() {
		// TODO Auto-generated method stub
		System.out.println(smsCharge);
		
	}






	@Override
	public void setcallcharge(float callCharge) {
		// TODO Auto-generated method stub
		
	}

	
		
}
	
	
	

