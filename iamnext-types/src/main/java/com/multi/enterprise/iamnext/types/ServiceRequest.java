package com.multi.enterprise.iamnext.types;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement(name="serviceRequest")
public class ServiceRequest<T> {

	
	@XmlElement(name="requestContext")
	private T requestContext;

	/**
	 * @return the requestContext
	 */
	public T getRequestContext() {
		return requestContext;
	}

	/**
	 * @param requestContext the requestContext to set
	 */
	public void setRequestContext(T requestContext) {
		this.requestContext = requestContext;
	}
	
	
	
}
