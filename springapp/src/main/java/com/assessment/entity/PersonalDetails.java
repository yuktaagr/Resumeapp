package com.assessment.entity;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.annotation.Id;


import javax.persistence.Entity;
import javax.persistence.Id;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class PersonalDetails {
	@Id
	private String id;
	private String name;
	private String email;
	private String phone;

	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getphoneNumber() {
		return phone;
	}
	public void setphoneNumber(String phone) {
		this.phone = phone;
	}

	
}


