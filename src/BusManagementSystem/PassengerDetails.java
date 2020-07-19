package BusManagementSystem;

public class PassengerDetails implements Manage  {

	public void passengerDetails()  {
		System.out.println("-----------Passenger Details Page-----------");
		System.out.println();
		System.out.println();
	
		CommonUtils d= new CommonUtils();
		d.name();
		d.age();
		d.emailId();
		d.contactNumber();
		d.gender();
		d.aadhar();
		System.out.println("MESSAGE:- Passenger added successfully");
		System.out.println();
		System.out.println();
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

	@Override
	public void booking() {
		// TODO Auto-generated method stub
		
	}


}
