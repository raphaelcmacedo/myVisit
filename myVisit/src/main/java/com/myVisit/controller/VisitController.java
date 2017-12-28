package com.myVisit.controller;

import java.util.List;

import javax.swing.text.Position;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myVisit.entity.Visit;
import com.myVisit.service.VisitService;
import com.myVisit.util.RestUtil;

@RestController
@Path("position")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class VisitController {

	@Autowired
	private VisitService service;
	
	@GET
	@Path("")
	public Response listAll(){
		List<Position> positions = service.listAll();
		return RestUtil.createSuccessResponse(positions);
	}
	
	@GET
	@Path("{id}")
	public Response findById(@PathParam("id")int id){
		Position position = service.findById(id);
		return RestUtil.createSuccessResponse(position);
	}
	
	@POST
	@Path("")
	public Response create(String json){
		try{
			Visit visit = new ObjectMapper().readValue(json, Visit.class);
			service.save(visit);
			return RestUtil.createSuccessResponse(visit);	
		}catch(Exception e){
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
		}
	}
	
}
