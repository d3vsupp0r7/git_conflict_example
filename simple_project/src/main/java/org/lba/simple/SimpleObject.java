package org.lba.simple;

import java.io.Serializable;

public class SimpleObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8787892550638439369L;
	private String message;
	
	/**/
	private String message2;
	
	public SimpleObject() {
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	@Override
	public String toString() {
		return "SimpleObject [message=" + message + "]";
	}
	
	
}

