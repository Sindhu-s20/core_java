class Free{
	
  String what;
  String why;
  String frefor;
  
  Free()
  {
	System.out.println("this is free class");  
  }
  
  Free(String what,String Why,String frefor)
  {
	  this.what=what;
	  this.why=why;
	  this.frefor=frefor;
	  System.out.println("free name is :"+this.what);
	  System.out.println("free reason is :"+this.why);
	  System.out.println("free cost is :"+this.frefor);
  }
  void displayInfo()
  {
	  System.out.println("free name is :"+this.what);
	  System.out.println("free reason is :"+this.why);
	  System.out.println("free cost is :"+this.frefor);
  }
}
