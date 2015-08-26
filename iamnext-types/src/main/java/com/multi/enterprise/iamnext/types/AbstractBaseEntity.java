package com.multi.enterprise.iamnext.types;

import java.util.Date;

import com.multi.enterprise.iamnext.types.location.Address;


public abstract class AbstractBaseEntity implements Entity{

	protected int id;
	protected Date createdDate;
	protected Date modifiedDate;
	
		
	public int getId() {
		return this.id;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
	 this.createdDate = createdDate;	
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	
	
	
	
}
