package org.lba.simple;

public class MainApp {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		SimpleObject obj = new SimpleObject();
		obj.setMessage("Hello Conflict example");
		/**/
		System.out.println("Out: " + obj.toString());
	}

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
		return "SimpleObject [message=" + message + "]";
	}
}

