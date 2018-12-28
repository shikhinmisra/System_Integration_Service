package com.middleware.integration.model.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.middleware.integration.model.ConsignmentHeader;

@Controller
public class ConsignmentHeaderDaoImpl {

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	ConsignmentHeader consignmentHeader;

	public ArrayList<Object> getAllConsignmentDetails() {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from CONSIGNMENT_HEADER");
		ArrayList<Object> consignmentHeader = (ArrayList<Object>) query.list();
		session.getTransaction().commit();
		session.close();
		return consignmentHeader;
	}

	public ConsignmentHeader getConsignmentDetailsById(int consignmentId) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		ConsignmentHeader consignmentHeader = (ConsignmentHeader) session.get(ConsignmentHeader.class, consignmentId);
		session.getTransaction().commit();
		session.close();
		return consignmentHeader;
	}

}
