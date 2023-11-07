class Agent
{
  int id;
  String name;
  String company;
  Tent tent;
     void openTent(Tent tent)
     {
		 	 
	     System.out.println("serial number is:"+tent.slNo);
		 System.out.println("color of tent is:"+tent.color);
		 System.out.println("width of tent is:"+tent.width);
		 System.out.println("height of the tent is:"+tent.height);
     }
	 
	 
  void closeTent(Tent tent)
  {
	     System.out.println("serial number is:"+tent.slNo);
		 System.out.println("color of tent is:"+tent.color);
		 System.out.println("width of tent is:"+tent.width);
		 System.out.println("height of the tent is:"+tent.height);
  }
	 
	 void showInfo()
  {
	     System.out.println("id of the agent:"+this.id);
		 System.out.println("cname of the agent:"+this.name);
		 System.out.println("company name of the agent:"+this.company);
		 
  }
  
}
