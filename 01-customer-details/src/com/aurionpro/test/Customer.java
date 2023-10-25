package com.aurionpro.test;

class Customer {
	private int custId;
	private String name;
	private String email;
	private String password;

	public Customer(int custId, String name, String email, String password) {
		this.custId = custId;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer{" + "custId=" + custId + ", name='" + name + '\'' + ", email='" + email + '\'' + ", password='"
				+ password + '\'' + '}';
	}
}

