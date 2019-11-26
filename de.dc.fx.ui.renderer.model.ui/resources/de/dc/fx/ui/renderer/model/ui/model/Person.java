package de.dc.fx.ui.renderer.model.ui.model;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

public class Person {

	private String name;
	private String lastname;
	private String age;
	private String email;

	public Person(String name, String lastname, String age, String email) {
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
