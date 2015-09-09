package com.multi.enterprise.iamnext.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.multi.enterprise.iamnext.types.ServiceRequest;
import com.multi.enterprise.iamnext.types.ServiceResponse;
import com.multi.enterprise.iamnext.types.exception.ServiceException;


public interface CrudController<T> {


	@RequestMapping(value="", method=RequestMethod.POST)
	public @ResponseBody ServiceResponse<T> create(@RequestBody ServiceRequest<T> serviceRequest, HttpServletRequest request, HttpServletResponse response) throws ServiceException;
	
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE )
	public @ResponseBody ServiceResponse<T> delete(@PathVariable String id, HttpServletRequest request, HttpServletResponse response);
	
	@RequestMapping(value="", method=RequestMethod.PUT)
	public @ResponseBody ServiceResponse<T> update(@RequestBody ServiceRequest<T> serviceRequest, HttpServletRequest request, HttpServletResponse response);

	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public @ResponseBody ServiceResponse<T> getById(@PathVariable String id, HttpServletRequest request, HttpServletResponse response);
}

