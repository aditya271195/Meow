package com.qualiteehub.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qualiteehub.entity.Member;

@Repository
public class GymDaoImpl implements IGymDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public int registerMember(Member member) {
		System.out.println("In Dao");
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(member);
		session.getTransaction().commit();
		session.close();
		return 0;
	}

}
