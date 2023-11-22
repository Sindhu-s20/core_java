class Mobile{
	
	String name;
	double cost;
	int mobileId;
	String warranty;
	int serialNo;
	int batteryPercentage;
	int noApps;
	String model;
	String ramSize;
	int version;
	
	Mobile()
	{
		System.out.println("running no-arg const of Mobile");
	}
	
Mobile(String name,double cost,int mobileId,String warranty,int serialNo,int batteryPercentage,int noApps,String model,String ramSize,int version)
	
	{
		this.name=name;
		this.cost=cost;
		this.mobileId=mobileId;
		this.warranty=warranty;
		this.serialNo=serialNo;
		this.batteryPercentage=batteryPercentage;
		this.noApps=noApps;
		this.model=model;
		this.ramSize=ramSize;
		this.version=version;
		System.out.println("running parameter const of Mobile");
	}
	
	void on()
	{
		System.out.println("Mobile is on");
	}
	
	void off()
	{
		System.out.println("Mobile is off");
	}
	
	void playsong()
	{
		System.out.println("Mobile is playsong a song");
	}
	void app()
	{
		System.out.println("Mobile is running an app");
	}
	
	void Rebort()
	{
		System.out.println("Mobile is Rebort");
	}
	
	void speed()
	{
		System.out.println("Mobile is more speed");
	}
	
	void size()
	{
		System.out.println("Mobile is large size");
	}
	
	void call()
	{
		System.out.println("Mobile is used for call");
	}
	
	void wifi()
	{
		System.out.println("Mobile have a wifi");
	}
	
	void charge()
	{
		System.out.println("Mobile is charging");
	}
	void Click()
	{	
	System.out.println("Mobile is click a selfii");
	}
	}
