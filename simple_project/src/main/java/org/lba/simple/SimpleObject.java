package org.lba.simple;

import java.io.Serializable;

public class SimpleObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8787892550638439369L;
	private String message;
	
	public SimpleObject() {
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "SimpleObject [message= FOR CONFLICT" + message + "]";
	}
	
	
}

