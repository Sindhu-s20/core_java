class LgRemote extends Remote{
	
	int warranty;
	int totalBatteries;
	
	LgRemote()
	{
    	System.out.println("running no-arg const of LgRemote");
	}
	
	LgRemote(Remoteusedfor usedfor,int totalButtons,String original)
	{
		super(usedfor,totalButtons,original);
    	System.out.println("running int const of LgRemote");
	}
	
	LgRemote(int warranty,int totalBatteries)
	{
		this.warranty=warranty;
		this.totalBatteries=totalBatteries;
    	System.out.println("running Parameter const of LgRemote");
	}
	void voiceCommand()
	{
		System.out.println("LgRemort is used for voiceCommand");
	}
	@Override
	void on()
	{
		System.out.println("remort is used for on in LgRemote");
	}
	@Override
	void increaseVolume()
	{
		System.out.println("remort is used for increaseVolume in LgRemort");
	}
}
	
