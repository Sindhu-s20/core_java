class Remote{
	
	Remoteusedfor usedfor;
	int totalButtons;
	String original;
	

	Remote()
	{
	System.out.println("running no-arg const of Remote");
	}
	Remote(Remoteusedfor usedfor,int totalButtons,String original)
	{
		this.usedfor=usedfor;
		this.totalButtons=totalButtons;
		this.original=original;
	}
	void on()
	{
		System.out.println("remort is used for on");
	}
	
	void off()
	{
		System.out.println("remort is used for off");
	}
	void increaseVolume()
	{
		System.out.println("remort is used for increaseVolume");
	}
	void decreaseVolume()
	{
		System.out.println("remort is used for decreaseVolume");
	}
	void changeChannel()
	{
		System.out.println("remort is used for changeChannel");
	}
	}