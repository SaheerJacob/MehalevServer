package com.SaheerJeries.mehalev.controllers;

import javax.mail.SendFailedException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SaheerJeries.mehalev.dao.EmployeeDataDAO;
import com.SaheerJeries.mehalev.mail.MailManager;
import com.SaheerJeries.mehalev.models.EmailData;
import com.SaheerJeries.mehalev.models.ResetPasswordVM;

@RestController
@CrossOrigin(origins = "*" , allowCredentials = "true")
@RequestMapping("/sendEmail")

public class sendEmailController {

	@Autowired
	EmployeeDataDAO mail;
	
	@PostMapping("")
	public ResponseEntity<String> sendEmail(@RequestBody EmailData data) throws SendFailedException{
		try {
			mail.sendGeneralEmail(data.getToEmail(), data.getFirstName(), data.getSubject()==null ? " ":data.getSubject(), data.getText());
			return ResponseEntity.ok().body("sent");
		}catch(SendFailedException e) {
			return ResponseEntity.ok().body("can't be sent");
		}
	}
}
