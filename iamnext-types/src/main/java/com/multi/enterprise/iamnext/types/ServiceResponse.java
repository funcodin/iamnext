package com.multi.enterprise.iamnext.types;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement(name="serviceResponse")
public class ServiceResponse<T> {
	
	@XmlAttribute(name="responseContext")
	private T responseContext;
	
	@XmlAttribute(name="responseMessage")
	private String responseMessage;

	@XmlAttribute(name="status")
	private ServiceReponseStatus status;

	
	public ServiceResponse(){
	 this.status = ServiceReponseStatus.OK;	
	}
	
	public ServiceResponse(ServiceReponseStatus status, String message){
		this.status = status;
		this.responseMessage = message;
	}
	
	public ServiceResponse( T responseContext) {
		this.responseContext = responseContext;
		this.status = ServiceReponseStatus.OK;
	}
	
	/**
	 * @return the status
	 */
	public ServiceReponseStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(ServiceReponseStatus status) {
		this.status = status;
	}

	
	/**
	 * @return the responseContext
	 */
	public T getResponseContext() {
		return responseContext;
	}

	/**
	 * @param responseContext the responseContext to set
	 */
	public void setResponseContext(T responseContext) {
		this.responseContext = responseContext;
	}

	/**
	 * @return the responseMessage
	 */
	public String getResponseMessage() {
		return responseMessage;
	}

	/**
	 * @param responseMessage the responseMessage to set
	 */
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
	

}
