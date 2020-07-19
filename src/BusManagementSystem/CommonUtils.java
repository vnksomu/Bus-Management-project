package BusManagementSystem;

import java.util.Scanner;

 class CommonUtils{
	Scanner s= new Scanner(System.in);
	public void name()
	
	{
		System.out.println("name: ");
		String name=s.next();
	}
	
	public void age()
	{
		
		System.out.println("age: ");
		try
		{
		int age=s.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(" Enter Age in Number Format");
			s.next();
			age();
		}
		
	}
	
	public void emailId()
	{
		System.out.println("Email: ");
	
			String email=s.next();
			if(email.contains(".com"))
			{}
			else
			{
				System.out.println("Enter Correct mail id:");
				emailId();
			}
		
	}
	
	public void contactNumber()
	{   long num = 0;
		System.out.println("contactNumber: ");
		try
		{
	        num=s.nextLong();
	    	int count=0;
			while(num>0) 
			{
				num=num/10;
				count++;
			}
		
			if(count==10) {}
			else
				{
				System.out.println("Entered digit is: "+count);
				System.out.println("Provide 10 digit phone number");
		        contactNumber();
		            
				}
			
		}
		catch(Exception e)
		{
			System.out.println("Provide 10 digit phone number..");
			s.nextLine();
			contactNumber();
		}
	
	
		
	}
	public void gender()
	{
		System.out.println("Gener: press 1 for male or press 2 for female");
		try {
		int cn=s.nextInt();
		if(cn==1)
			System.out.println("Male");
		else if(cn==2)
			System.out.println("Female");
		else
		{
			gender();
		}
		}
		catch(Exception e)
		{
			s.next();
			gender();
		}
	}
	public void aadhar()
	{
		long num=0;
		System.out.println("Aadhar card Number: ");
		try
		{
	        num=s.nextLong();
	        int count=0;
			while(num>0) 
			{
				num=num/10;
				count++;
			}
		
			if(count==12) {}
			else
				{
				System.out.println("Entered digit is: "+count);
				System.out.println("Provive 12 digit Aadhar number");
		        aadhar();
		            
				}
		   }
		catch(Exception e)
		{
			System.out.println("Provive 12 digit Aadhar number..");
			s.next();
			aadhar();
		}
    }

	
}

