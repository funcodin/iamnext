package com.multi.enterprise.iamnext.types.exception;

import java.io.IOException;

public class ServiceException extends IOException{

	private static final long serialVersionUID = 1L;

	
	public ServiceException( String errorMessage ){
		super(errorMessage);
	}
	
	public ServiceException(Throwable throwable, String errorMessage){
		super(errorMessage, throwable);
	}
	
}
