package com.middleware.integration.DataProviderApp;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.middleware.integration.model.ConsignmentHeader;
import com.middleware.integration.service.TableDataProviderService;


@Path("tabledata")
public class MyResource {

	@Autowired
	TableDataProviderService tableDataProviderService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{tableName}/{indexId}")
	public Object getTableDataByIndexId(@PathParam("tableName") String tableName, @PathParam("indexId") int indexId) {
		Object var = tableDataProviderService.getTableDataByIndexId(tableName, indexId);
		System.out.println("object value = " + var);
		return var;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{tableName}")
	public ArrayList<Object> getAllConsignments(@PathParam("tableName") String tableName) {
		ArrayList<Object> var = (ArrayList<Object>) tableDataProviderService.getAllTableData(tableName);
		return var;
	}
//Adding comments!!

	/*
	 * Adding more comments to the class file in master branch  */
	/* Adding comments just to experiment GIT */
}
