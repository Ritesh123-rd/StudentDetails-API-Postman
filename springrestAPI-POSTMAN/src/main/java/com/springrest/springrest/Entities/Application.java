package com.springrest.springrest.Entities;

public class Application {

	private long id;
	private String name;
	private String email;
	private String phone;
	private String city;
	public Application(long id, String name, String email, String phone, String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.city = city;
	}
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		city = city;
	}
	@Override
	public String toString() {
		return "Application [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", City=" + city
				+ "]";
	}
	
	
}
