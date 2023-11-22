class RealmeMobile extends Mobile{
	
	double cost;
	int mobileId;
	String warranty;
	int serialNo;
	int batteryPercentage;
	int noApps;
	String model;
	String ramSize;
	int version;
	double width;
	double height;
	double length;
	
	RealmeMobile()
	{
		System.out.println("running no-arg const of RealmeMobile");
	}
	
	RealmeMobile(String name,double cost,int mobileId,String warranty,int serialNo,int batteryPercentage,int noApps,String model,String ramSize,int version)
	{
		super(name,cost,mobileId,warranty,serialNo,batteryPercentage,noApps,model,ramSize,version);
		System.out.println("running no-arg const of RealmeMobile");
	}
	
	RealmeMobile(double cost,int mobileId,String warranty,int serialNo,int batteryPercentage,int noApps,String model,String ramSize,int version,double width,double height,double length)
	{
		this.cost=cost;
		this.mobileId=mobileId;
		this.warranty=warranty;
		this.serialNo=serialNo;
		this.batteryPercentage=batteryPercentage;
		this.noApps=noApps;
		this.model=model;
		this.ramSize=ramSize;
		this.version=version;
		this.width=width;
		this.height=height;
		this.length=length;
	}
	
	void realmeMobileon()
	{
		System.out.println("RealmeMobile is on");
	}
	
	void realmeMobileoff()
	{
		System.out.println("RealmeMobile is off");
	}
	
	void realmeMobileplaysong()
	{
		System.out.println("RealmeMobile is playsong a song");
	}
	void realmeMobileapp()
	{
		System.out.println("RealmeMobile is running an app");
	}
	
	void realmeMobileRebort()
	{
		System.out.println("RealmeMobile is Rebort");
	}
	
	void realmeMobilespeed()
	{
		System.out.println("RealmeMobile is more speed");
	}
	
	void realmeMobilesize()
	{
		System.out.println("RealmeMobile is large size");
	}
	
	void vealmeMobilecall()
	{
		System.out.println("RealmeMobile is used for call");
	}
	
	void realmeMobilewifi()
	{
		System.out.println("RealmeMobile have a wifi");
	}
	
	void realmeMobilecharge()
	{
		System.out.println("RealmeMobile is charging");
	}
	void realmeMobileClick()
	{	
	System.out.println("RealmeMobile is click a selfii");
	}
	@Override
	void on()
	{
		System.out.println("RealmeMobile is on");
	}
	@Override
	void playsong()
	{
		System.out.println("RealmeMobile is playsong a song");
	}
	@Override
	void Rebort()
	{
		System.out.println("RealmeMobile is Rebort");
	}
	@Override
	void charge()
	{
		System.out.println("Mobile is charging");
	}
}
	
	
	
	

	

