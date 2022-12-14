package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.springrest.springrest.entities.Tenant;

@EnableJpaRepositories
public interface TenantDao extends JpaRepository<Tenant, Long>{

}
