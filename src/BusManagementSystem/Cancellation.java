package BusManagementSystem;

import java.util.Scanner;

public class Cancellation implements Manage {
    Scanner s= new Scanner(System.in);
    public void cancellation()  
	{
		System.out.println("Enter 6 digit Tcket Id");
		int id=s.nextInt();
		 if(id>99999&&id<1000000)
		{
			System.out.println("Are you sure to cancel tickets?");
			System.out.println("Pree 1 for YES (or) Press any key for REJECT");
			int yes=s.nextInt();
			if(yes==1)
			{
				System.out.println("20% Amount will be deducted. Press 1 for Accept (or) Press 2 for Reject");
				int press=s.nextInt();
				if(press==1)
				{
				System.out.println("Ticket Canncellation done Successfully. Amount will be Refunded within 24 hours" );
				}
				else
				{

					HomePage home=new HomePage();// To return home page
					home.homePage();
				}
			}
			else
			{
				HomePage home=new HomePage();// To return home page
				home.homePage();
			}
		}
		else
		{
			System.out.println("Invalid Ticket Id Entered");
		}
		 System.out.println();
		 System.out.println();

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
	public void homePage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void booking() {
		// TODO Auto-generated method stub
		
	}


}
