package com.sakha.Simcard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mobile {

	@Autowired
	@Qualifier("Airtel")
	Sim sim;
	
	
		
	/**
	 * @param sim
	 */
	
	
	public Mobile(Sim sim) {
		super();
		this.sim = sim;
	}
	public Sim getSim() {
		return sim;
	}
	public void setSim(Sim sim) {
		this.sim = sim;
	}
	public void makeCall() {
		sim.call();	
		
	}
public void sendMessage() {
	sim.sendSms();
	}

public void toBrowse() {
	sim.browse();
	
}

public void sendMms() {
	sim.sendMms();
}

public void sendSms() {
	sim.sendSms();
}
public void showsupport() {
	sim.suppotedNetworks();
}

public Mobile() {
	// TODO Auto-generated constructor stub
}
}
