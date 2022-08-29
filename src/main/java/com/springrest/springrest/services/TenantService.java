package com.springrest.springrest.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Tenant;

@Service
public interface TenantService {
	
	public List<Tenant> getTenants();
	
	public Tenant getTenant(long tenantId);

	public Tenant addTenant(Tenant tenant);

	public Tenant updateTenant(Tenant tenant);

	public void deleteTenant(long parseLong);


}
