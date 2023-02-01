package com.app.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Users;
@Repository
@Transactional
public class UsersImplService implements IUserService {
	@Autowired
	public EntityManager mgr;
	
	@Override
	public String saveUser(Users user) {
		String msg = "Record failed in submission";
		try {
		msg = "Record saved successfully";
//		mgr.createNativeQuery("insert into t_cs_citizen_login_info (reg_year,first_name,middle_name,applicant_num,lang_cd) VALUES (?,?,?,?,?)")
//		.setParameter(1, user.getRegYear())
//		.setParameter(2, user.getFirstName())
//		.setParameter(3, user.getMiddleName())
//		.setParameter(4, 100)
//		.setParameter(5, 99).executeUpdate();
		mgr.persist(user);
		return msg;
		}
		catch(Exception ex)
		{
			System.out.println("exception "+ ex);
		}
		return msg;
	}

}
