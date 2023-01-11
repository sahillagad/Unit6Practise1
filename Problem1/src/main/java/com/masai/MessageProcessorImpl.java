package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class MessageProcessorImpl implements MessageProcessor{

	@Autowired
	@Qualifier(value ="twitterService")
	MessageService messageService;

	
	@Override
	public void processMessage(String message) {
		
		messageService.sendMessage(message);
		
	}


}
