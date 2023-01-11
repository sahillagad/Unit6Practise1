package com.masai;

import org.springframework.stereotype.Service;

@Service
public class SmsService implements MessageService{

	@Override
	public void sendMessage(String message) {

	System.out.println("SMS : "+message);
		
	}
}
