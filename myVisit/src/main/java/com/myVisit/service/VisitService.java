package com.myVisit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myVisit.dao.VisitDAO;

@Service
@Transactional
public class VisitService {

	
	@Autowired
	private VisitDAO dao;
}
