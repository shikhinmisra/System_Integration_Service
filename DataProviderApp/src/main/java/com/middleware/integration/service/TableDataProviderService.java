package com.middleware.integration.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.middleware.integration.model.daoimpl.ConsignmentHeaderDaoImpl;

@Controller
public class TableDataProviderService {

	@Autowired
	ConsignmentHeaderDaoImpl consignmentHeaderDaoImpl;

	public Object getTableDataByIndexId(String tableName, int consignmentId) {

		if (tableName.equals("CONSIGNMENT_HEADER")) {
			return consignmentHeaderDaoImpl.getConsignmentDetailsById(consignmentId);
		}

		else
			return "Nothing to return";
	}

	public ArrayList<Object> getAllTableData(String tableName) {

		if (tableName.equals("CONSIGNMENT_HEADER")) {
			return consignmentHeaderDaoImpl.getAllConsignmentDetails();
		} 
		
		else
			return new ArrayList<Object>();
	}

}
