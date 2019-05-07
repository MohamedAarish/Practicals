package com.prac.dao;

import java.awt.List;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prac.model.Cbean;

@Repository
public class DAO {

	@Autowired
	SessionFactrory fact;
	
	@Autowired
	HttpSession session;
	
	@Transactional
	public void Insert(Cbean data)
	{
		session = fact.getCurrentSession();
		List<Cbean> sign = session.createQuery("from Cbean").list();
		session.save(data);
	}
	
	@Transactional
	public boolean Validate(String umail,String pass)
	{
		session = fact.getCurrentSession();
		int chk=0;
		List<Cbean> Log = session.createQuery("from Cbean c where c.Emai="+'umail'+'"").list();
		for(Cbean obj : temp)
		{
			if(temp.getEmai().equals(umail) && temp.getPassword().equals(pass))
			{
				chk=1;
			}
		}
		if(chk==1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Transactional
	public void delete(Cbean obj)
	{
		session = fact.getCurrentSession();
		session.delete(obj);
	}
}
