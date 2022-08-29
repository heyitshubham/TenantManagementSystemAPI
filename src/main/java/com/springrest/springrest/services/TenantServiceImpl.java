package com.springrest.springrest.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.TenantDao;
import com.springrest.springrest.entities.Tenant;

@Service
public class TenantServiceImpl implements TenantService {
	
	@Autowired
	private TenantDao tenantDao;
//	List<Tenant> list;
	public TenantServiceImpl(){
//		list = new ArrayList<>();
//		list.add(new Tenant(12,"Shubham", "987654567", "Khora", true, 4, 3000, 561, 671, 787, 150));
//		list.add(new Tenant(13,"Deepansh", "567876787", "Delhi", true, 7, 7772, 78, 100, 765, 562));
	}
	
	@Override
	public List<Tenant> getTenants() {
		return tenantDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Tenant getTenant(long tenantId) {
		
//		Tenant t = null;
//		for(Tenant tenant:list) {
//			if(tenant.getId() == tenantId) {
//				t = tenant;
//				break;
//			}
//		}
		return tenantDao.getOne(tenantId);
	}

	@Override
	public Tenant addTenant(Tenant tenant) {
//		list.add(tenant);
		tenantDao.save(tenant);
		return tenant;
	}

	@Override
	public Tenant updateTenant(Tenant tenant) {
//		list.forEach(e->{
//			if(e.getId() == tenant.getId()) {
//				e.setName(tenant.getName());
//				e.setPhone(tenant.getPhone());
//				e.setAddress(tenant.getAddress());
//				e.setIsActive(tenant.getIsActive());
//				e.setRoomNum(tenant.getRoomNum());
//				e.setRentAmount(tenant.getRentAmount());
//				e.setPrevReading(tenant.getPrevReading());
//				e.setCurrReading(tenant.getCurrReading());
//				e.setDueBal(tenant.getDueBal());
//				e.setMeterBill(tenant.getMeterBill());
//			}
//		});
		tenantDao.save(tenant);
		return tenant;
	}

	@Override
	public void deleteTenant(long parseLong) {
		@SuppressWarnings("deprecation")
		Tenant entity = tenantDao.getOne(parseLong);
		tenantDao.delete(entity);
//		list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	}

}
