package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.bo.Internaute;
import com.dao.InternauteDao;
import com.genericdao.impl.HibernateSpringGenericDaoImpl;

@Repository
public class InternauteDaoImpl extends HibernateSpringGenericDaoImpl<Internaute, Long> implements InternauteDao {


	public InternauteDaoImpl() {
		super(Internaute.class);
	}

}
