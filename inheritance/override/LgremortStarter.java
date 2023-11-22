class LgremortStarter{
   public static void main(String args[])
	{
		System.out.println("Starting main method CamerStarter");
		
		Remote remote=new Remote();
		Remote remote1=new Remote(Remoteusedfor.ON,20,"left");
		remote.on();
		remote.off();
		remote.increaseVolume();
		remote.decreaseVolume();
		remote.changeChannel();
		System.out.println("usedfor"+remote1.usedfor);
		System.out.println("totalButtons"+remote1.totalButtons);
		System.out.println("original"+remote1.original);
		
		
		LgRemote Lgr= new LgRemote();
		LgRemote Lgr1= new LgRemote(6,8);
		Lgr.voiceCommand();
		Lgr.on();
		Lgr.increaseVolume();
		System.out.println("warranty"+Lgr1.warranty);
		System.out.println("totalBatteries"+Lgr1.totalBatteries);


		

		System.out.println("Endinging main method CamerStarter");
	}

}