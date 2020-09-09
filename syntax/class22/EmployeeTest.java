package com.syntax.class22;

public class EmployeeTest {

	public static void main(String[] args) {
	
		ScrumTeam obj1 = new ScrumTeam();
		ScrumTeam.company = "Facebook";
		obj1.salary= 2000;
		obj1.getPaid();
		obj1.work();
		
		obj1.ceremonies=" presenting";
		obj1.attendsMeetings();
		obj1.workonBuildingSoftware();
		
		System.out.println();
		
		ScrumMaster obj2 = new ScrumMaster();
	//	ScrumMaster.company//have an access too
		obj2.salary= 3000;
		obj2.getPaid();
		obj2.work();
		
		obj2.quality="A";
		obj2.shieldTeam();
		obj2.doMeetings();
		
		
		obj2.salary= 3000;
		obj2.getPaid();
		obj2.work();
		
	}

}
