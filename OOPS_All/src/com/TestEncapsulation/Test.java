package com.TestEncapsulation;

import com.TightEncapsulation.*;
//import com.Practice.*;

public class Test {
	public static void main(String[] args) {
		Organizer organizer = new Organizer();
		System.out.println(organizer);
		organizer.setId(007l);
		organizer.setName(" James Bond ");
		System.out.println(" My Name is  : "+organizer.name);
		System.out.println(" Id No       : "+organizer.id);
		
Event e = new Event(101l, " Car Expo 2022 ", " Beyound your Mind But is In your mind");
		e.setStartTime(" 10:00Am ");
		e.setEndTime(" 9:30Pm ");
		e.setStarted(" SUNDAY ");
		System.out.println();
     System.out.println(" Event Id   : "+e.getId());
     System.out.println(" Event Name  : "+e.getName());
     System.out.println(" Event Description : "+e.getDescription());
     System.out.println(" Start Time  : "+e.getStartTime());
     System.out.println(" End Time    : "+e.getEndTime());
     System.out.println(" Started Day : "+e.getStarted());
 
     Venue v =new Venue();
      v.setName(" Habibi Come To Dubaiiii ");
      v.setDescription("~~~~~ City of Desert Experiance  With Luxury Car ~~~~");
      v.setStreetAddress(" Down Town Burj Khalifa");
      v.setState(" UAE ");
      v.setCity(" Dubai ");
      v.setPincode(" 5000 ");
      
      System.out.println();
      
      System.out.println(" Venue Name : "+v.getName());
      System.out.println(" Venue Description : "+v.getDescription());
      System.out.println(" Address : "+v.getStreetAddress());
      System.out.println(" State : "+v.getState());
      System.out.println(" City : "+v.getCity());
      System.out.println(" Pincode : "+v.getPincode());
      
      Participant p = new Participant();
      System.out.println();
     p.setName(" James Gosling ");
     p.setId(2333l);
     p.setEmail(" james.java@java.com");
     p.setCheckedIn(" 11:30Am");
     
     System.out.println(" Participant Name : "+p.getName());
     System.out.println(" Participant Id No : "+p.id);
     System.out.println(" Email : "+p.getEmail());
     System.out.println(" Check In Time : "+p.getChekedIn());
     
      
      
	}
	
	

}
