class DocterClinicp{
	
	public static void main(String args[])
		{
			System.out.println("Starting in Main");
	     Doctor doctor;
		 doctor=new Doctor();
		
		  Clinic clinic;
		  clinic=new Clinic(doctor);
		
		   clinic.displayInfo();
		System.out.println("Ending in Main");
		
}
}
