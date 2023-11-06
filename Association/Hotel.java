class Hotel{

		String name;
		String ownerName;
		MenuCard menucard;
		void setMethod(MenuCard menucard)
		{
		this.menucard=menucard;
		}
		void displayInfo()
		{
	    System.out.println("name:" +this.name); 
		System.out.println("ownerName:" +this.ownerName);  
			System.out.println("menu:" +this.menucard);
			if(this.menucard!=null)
			 {
				System.out.println("total items:"+this.menucard.totalitems);
				System.out.println("cost:"+this.menucard.cost);
		}
	}
}

