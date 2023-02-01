package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.IUserService;
import com.app.pojos.Users;
@RestController
@RequestMapping("/user")
public class RegsitrationController {

	@Autowired
	private IUserService dao;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveUserDetail(@RequestBody Users user)
	{
		try
		{
			System.out.println("users : "+user);
			return new ResponseEntity<>(dao.saveUser(user),HttpStatus.OK);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}
}
