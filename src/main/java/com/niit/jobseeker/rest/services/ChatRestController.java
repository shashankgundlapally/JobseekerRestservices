package com.niit.jobseeker.rest.services;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.niit.jobseeker.model.Message;
import com.niit.jobseeker.model.OutputMessage;

@Controller
public class ChatRestController {

	@MessageMapping("/chat")
	@SendTo("/topic/message")
	public OutputMessage sendMessage(Message message){
		return new OutputMessage(message,new Date());
	}
	}
