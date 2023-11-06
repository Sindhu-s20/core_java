class Tv{
  
  String display;
  Speaker speaker;
  
  Tv()
  {
  System.out.println("*****");
  }
  Tv(String display)
  {
  this.display=display;
   }
  Tv(Speaker speaker)
  {
    this.speaker=speaker;
  System.out.println("****");
  System.out.println("this is parameter");
  System.out.println("*****");
  }
  void displayInfo()
  {
	System.out.println("tv display:" +this.display); 
     System.out.println("tv Speaker:" +this.speaker);  
	if(this.speaker!=null)
	{
		System.out.println("Max volume:"+this.speaker.maxVolume);
	}
  }
   }
  
  