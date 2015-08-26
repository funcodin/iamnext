package com.multi.enterprise.iamnext.types;

import java.util.Date;

public interface Entity {

	public int getId();
	
	public Date getCreatedDate();
	
	public void setCreatedDate( Date createdDate );
	
	public Date getModifiedDate();
	
	public void setModifiedDate(Date modifiedDate );
	
}
