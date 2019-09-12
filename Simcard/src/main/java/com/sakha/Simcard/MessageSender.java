package com.sakha.Simcard;

import org.springframework.stereotype.Component;

@Component
public class MessageSender {
	
	

	float smsCharge;
	float mmscharge;
	
	public float getSmsCharge() {
		return smsCharge;
	}
	public void setSmsCharge(float smsCharge) {
		this.smsCharge = smsCharge;
	}
	public float getMmscharge() {
		return mmscharge;
	}
	public void setMmscharge(float mmscharge) {
		this.mmscharge = mmscharge;
	}
	
	
public void sendSms() {
	System.out.println("message has been sent");
}
public void SendMms() {
	System.out.println("mms has been sent");
}
}

	
	
	
	

