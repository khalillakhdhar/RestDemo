package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.repositories.AdminRepository;
import com.example.demo.entities.Admin;
@RestController
public class AdminController {
@Autowired
AdminRepository adminRepository;
@GetMapping("admin")
public List<Admin> getAdmins()
{
return (List<Admin>) adminRepository.findAll();	

}
@PostMapping("admin")
public Admin addAdmin(@Valid @RequestBody Admin admin)
{
	return adminRepository.save(admin);
}
}
