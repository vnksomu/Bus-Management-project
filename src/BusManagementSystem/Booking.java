package BusManagementSystem;

import java.util.Scanner;

public class Booking implements Manage {
	
	public void booking()
	{
		System.out.println("-----------Booking Page-----------");
		System.out.println();
		System.out.println();
		System.out.println("Available Bus Routs are:");
		System.out.println("bangalore to mumbai");
		System.out.println("chennai to bangalore");
		System.out.println("chennai to hydrabad");
		System.out.println();
		System.out.println();
		Scanner s= new Scanner(System.in);
	
		System.out.println("Enter From:");
			String from=s.nextLine();
		System.out.println("Enter to:");
			String to=s.nextLine();
		System.out.println("Enter numberOfPassenger:");
			PassengerDetails p=new PassengerDetails();
			int number=s.nextInt();
			
	     System.out.println("Enter Date in dd/mm/dddd format:");
			int date=s.nextInt();
		
	
		
		System.out.println("Selected Bus Route is "+from+" to "+to);
		
		
		
		if(from.equalsIgnoreCase("bangalore")&&to.equalsIgnoreCase("mumbai"))
		{
			System.out.println("List of buses available");
			System.out.println("SRS---> Press 1");
			System.out.println("Vels---> press 2");
			int press= s.nextInt();
			if(press==1)
			{
				for(int i=1; i<=number;i++)
				{
					System.out.println("passenger "+i+" Details");
					p.passengerDetails();
				}
			}
				else if(press==2)
				{
					for(int i=1; i<=number;i++)
					{
						p.passengerDetails();
					}
				}
				else
				{
					System.out.println("Invalid data Entered");
				}
			}
		
		else if(from.equalsIgnoreCase("chennai")&&to.equalsIgnoreCase("bangalore"))
		{
			System.out.println("List of buses available");
			System.out.println("kallada---> Press 1");
			System.out.println("SRM---> press 2");
			int press= s.nextInt();
			if(press==1)
			{
				for(int i=1; i<=number;i++)
				{
					System.out.println("passenger "+i+" Details");
					p.passengerDetails();
				}
			}
				else if(press==2)
				{
					for(int i=1; i<=number;i++)
					{
						p.passengerDetails();
					}
				}
				else
				{
					System.out.println("Invalid data Entered");
				}
		}
		else if(from.equalsIgnoreCase("chennai")&&to.equalsIgnoreCase("hydrabad"))
		{
			System.out.println("List of buses available");
			System.out.println("kallada---> Press 1");
			System.out.println("SRM---> press 2");
			int press= s.nextInt();
			if(press==1)
			{
				for(int i=1; i<=number;i++)
				{
					System.out.println("passenger "+i+" Details");
					p.passengerDetails();
				}
			}
				else if(press==2)
				{
					for(int i=1; i<=number;i++)
					{
						p.passengerDetails();
					}
				}
				else
				{
					System.out.println("Invalid data Entered");
				}
		}
		else
		{
			System.out.println("No Buses Available for this route");
		}
		System.out.println("MSG:- Booking Process Completed");
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
	public void cancellation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void homePage() {
		// TODO Auto-generated method stub
		
	}

}
