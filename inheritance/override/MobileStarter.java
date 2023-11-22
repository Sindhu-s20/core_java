class  MobileStarter{
	
	public static void main(String args[])
	{
		System.out.println("Starting main method MobileStarter");
		Mobile mob=new Mobile();
		Mobile mob1=new Mobile("realme",5000.0,67,"3year",100,33,60,"i5","3gb",900);
        mob1.on();
		mob1.off();
		mob1.playsong();
		mob1.app();
		mob1.Rebort();
		mob1.speed();
		mob1.size();
		mob1.call();
		mob1.wifi();
		mob1.charge();
		mob1.Click();
		
		RealmeMobile rm=new RealmeMobile();
		RealmeMobile rm1=new RealmeMobile(3000.0,70,"4",56,6,40,"20model","3gb",70,34.0,56.6,99.0);
       rm1.realmeMobileon();
	   rm1.realmeMobileoff();
	   rm1.realmeMobileplaysong();
	   rm1.realmeMobileapp();
	   rm1.realmeMobileRebort();
	   rm1.realmeMobilespeed();
	   rm1.realmeMobilesize();
	   rm1.vealmeMobilecall();
	   rm1.realmeMobilewifi();
	   rm1.realmeMobilecharge();
	   rm1.realmeMobileClick();
	   rm1.on();
	   rm1.playsong();
	   rm1.Rebort();
	   rm1.charge();
	    System.out.println("Ending main method MobileStarter");
	}
}
