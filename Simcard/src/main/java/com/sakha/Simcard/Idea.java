package com.sakha.Simcard;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
@Component("Idea")
public class Idea implements Sim {
	
	
	float callCharge;
	float smsCharge;
	int internetCharge;
	MessageSender mg1;
	List<String> list1=new ArrayList<>();
	
public Idea() {
	// TODO Auto-generated constructor stub
}
	

	/**
 * @param callCharge
 * @param smsCharge
 * @param internetCharge
 * @param mg1
 * @param list1
 */
public Idea(float callCharge, float smsCharge, int internetCharge, MessageSender mg1, List<String> list1) {
	super();
	this.callCharge = callCharge;
	this.smsCharge = smsCharge;
	this.internetCharge = internetCharge;
	this.mg1 = mg1;
	this.list1 = list1;
}


	public float getCallCharge() {
		return callCharge;
	}


	public void setCallCharge(float callCharge) {
		this.callCharge = callCharge;
	}


	public float getSmsCharge() {
		return smsCharge;
	}


	public void setSmsCharge(float smsCharge) {
		this.smsCharge = smsCharge;
	}


	public int getInternetCharge() {
		return internetCharge;
	}


	public void setInternetCharge(int internetCharge) {
		this.internetCharge = internetCharge;
	}


	public List<String> getList1() {
		return list1;
	}


	public void setList1(List<String> list1) {
		this.list1 = list1;
	}


	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("Browsing speed"+internetCharge);
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("callCharge"+callCharge);
	}

	@Override
	public void sendSms() {
		// TODO Auto-generated method stub
		System.out.println("Message sent "+"smsCharge"+smsCharge);
		mg1.sendSms();
		
	}

	@Override
	public void sendMms() {
		// TODO Auto-generated method stub
		mg1.SendMms();
		
	}
	public MessageSender getMg1() {
		return mg1;
	}
	public void setMg1(MessageSender mg1) {
		this.mg1 = mg1;
	}
	@Override
	public void suppotedNetworks() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setcallcharge(float callCharge) {
		// TODO Auto-generated method stub
		
	}
	

}
