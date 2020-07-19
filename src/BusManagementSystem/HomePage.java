package BusManagementSystem;

import java.util.Scanner;

public class HomePage implements Manage {
	static
	{
		System.out.println("-----------Welcome to BlueBus-----------");
		System.out.println();
		System.out.println();
	}

	public void homePage()
	{
		System.out.println("-----------Home Page-----------");
		System.out.println();
		System.out.println();
	
	Scanner s=new Scanner(System.in);
	System.out.println("press 1 for Registeration");
	System.out.println("press 2 for Booking");
	System.out.println("press 3 for Cancellation");
	try//catch Exception error if user entered different type input
	{
	int press=s.nextInt();
	if(press==1)
	{
		Manage r= new Registeration();
	    r.registration();
	}
	else if(press==2)
	{
		Manage p=new Booking();
		p.booking();
	}
	else if(press==3)
	{
		Manage p=new Cancellation();
		p.cancellation();
	}
	}
	catch(Exception e)
	{
		s.next();
		homePage();
	}
	HomePage home=new HomePage();//To return Home Page
	home.homePage();
}

	@Override
	public void passengerDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registration() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancellation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void booking() {
		// TODO Auto-generated method stub
		
	}

	
}	
