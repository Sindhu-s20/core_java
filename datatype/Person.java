class Person{
	String name;
	Email[] email;
	
	Person()
	{
		
	}
	 
	 void setName(String name)
	 {
		 
		 this.name=name;
	 }
	 
	 void setMail(Email[] email)
	 {
		 this.email=email;
	 }
	 void showInfo()
	 {
		 System.out.println("name of person:"+this.name);
		 System.out.println(" person email:"+this.email);
		 if(this.email!=null)
		{
			for(int i=0; i<this.email.length; i++)
			{
			    Email ref=this.email[i];
				System.out.println("Ref :"+ref );
				
			}
	 }
	 
	 
}
}
