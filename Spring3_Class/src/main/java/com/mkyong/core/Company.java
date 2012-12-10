package com.mkyong.core;

/**
 * Spring bean
 * 
 */
public class Company {
	private String name;
	private User user;
	
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	public String toString() {
		return new StringBuilder().append("Name: "+ name).append("User: "+ user.toString()).toString();
	}

	public void printCompany() {
		System.out.println("Name: " + name);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}