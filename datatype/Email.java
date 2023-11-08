class Email{
	
	String domain=".gmail";
	int id=2;
	String fname="mega";
	String lastname="k";
	Email email1;
	
	Email()
	{
	}
		
	void setEmail(String domain,int id,String fname,String lastname)
	{
		System.out.println("Starting  from Email");
		this.domain=domain;
		this.id=id;
		this.fname=fname;
		this.lastname=lastname;
		System.out.println("Starting  from Email");
	}
	
	void showInfo()
	{
		System.out.println("domain of the email:"+this.domain);
		System.out.println("id of the email:"+this.id);
		System.out.println("first name of the email:"+this.fname);
		System.out.println("lastname of the email:"+this.lastname);
		System.out.println("Email :"+this.email1);
		}
	

}
