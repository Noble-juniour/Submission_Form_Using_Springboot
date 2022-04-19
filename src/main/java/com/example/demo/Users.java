package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Users {
	@Id
	
   private int userid;
   private String username;
   private String useremail;
   private String Residence;



public int getUserid() {
 		return userid;
 	}
public void setUserid(int userid) {
 		this.userid = userid;
 	}
 public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getUseremail() {
	return useremail;
}
public void setUseremail(String useremail) {
	this.useremail = useremail;
}
public String getResidence() {
	return Residence;
}
public void setResidence(String residence) {
	Residence = residence;
}
@Override
	public String toString() {
		return "Users [userid=" + userid + ", username=" + username + ", useremail=" + useremail + ", Residence="
				+ Residence + "]";
	}
}
