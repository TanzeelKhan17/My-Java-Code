package com.TightEncapsulation;

public class Participant extends Embase {
	
private String email;
private String checkedIn;

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email=email;
}
public String getChekedIn() {
	return checkedIn;
}
public void setCheckedIn(String checkedIn) {
	this.checkedIn=checkedIn;
}
}
