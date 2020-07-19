package BusManagementSystem;

import java.util.Scanner;

public class Registeration implements Manage {

	public void registration() {
		System.out.println("-----------Registeration Page-----------");
		System.out.println();
		System.out.println();
	
		CommonUtils d= new CommonUtils();
		d.name();
		d.age();
		d.emailId();
		d.contactNumber();
		d.gender();
		d.aadhar();
		System.out.println("MESSAGE:- Registration Done Succesfully");
		System.out.println();
		System.out.println();
	
	}
	

	@Override
	public void passengerDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancellation() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void homePage() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void booking() {
		// TODO Auto-generated method stub
		
	}


}













