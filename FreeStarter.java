class FreeStarter{

		public static void main(String args[])
		{
		System.out.println("Starting of the main method");
		Free free=new Free();
		free.displayInfo();
		
		System.out.println("******");
		Free free1=new Free("course","money","All");
		free1.displayInfo();
		
		System.out.println("******");
		Free free2=new Free("food","health","All");
		free2.displayInfo();
		}
}
