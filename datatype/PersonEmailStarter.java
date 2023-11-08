class PersonEmailStarter{

	public static void main(String[] mail)
	{
		System.out.println("Starting of the main method");
		
		Email email2=new Email();
		
		email2.setEmail("Gowri",23,"Gow","N");
		email2.showInfo();
		
		Email email=new Email();
		
		email.setEmail("mega",23,"me","m");
		email.showInfo();
		
		Email email1=new Email();
		
		email1.setEmail(".madu",3,"banu","m");
		email1.showInfo();
		
		
		
		Person person=new Person();
		person.setName("Gowri");
		person.showInfo();
		
		Email[] emailArray=new Email[4];
		emailArray[2]=email;
		emailArray[1]=email1;
		emailArray[0]=email2;
		
		Email mai=emailArray[3];
		
		
		
		System.out.println(emailArray[1]);
		Email ref=emailArray[1];
		
		
		person.showInfo();
		System.out.println("Ending of the main method");
	}
}