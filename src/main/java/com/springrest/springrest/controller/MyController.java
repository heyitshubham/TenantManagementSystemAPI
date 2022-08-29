package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Tenant;
import com.springrest.springrest.services.TenantService;

@RestController
public class MyController {
	
	@Autowired
	private TenantService tenantService;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to my Tenant Management System API"; 
	}
	
	@GetMapping("/tenants")
	public List<Tenant> getTenants(){
		return this.tenantService.getTenants();
		
	}
	
	@GetMapping("/tenant/{tenantId}")
	public Tenant getTenant(@PathVariable String tenantId) {
		return this.tenantService.getTenant(Long.parseLong(tenantId));
	}
	
	@PostMapping("/tenants")
	public Tenant addTenant(@RequestBody Tenant tenant) {
		return this.tenantService.addTenant(tenant);
	}
	
	@PutMapping("/tenants")
	public Tenant updateTenant(@RequestBody Tenant tenant) {
		return this.tenantService.updateTenant(tenant);
	}

	@DeleteMapping("/tenant/{tenantID}")
	public ResponseEntity<HttpStatus> deleteTenant(@PathVariable String tenantId){
		try {
			this.tenantService.deleteTenant(Long.parseLong(tenantId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
