class HandCamer extends Camera{
	
	double weight;
	
	HandCamer()
	{
				super("cano",3.4,CameraColor.BLUE);

		System.out.println("default argument with no argument");
	}
	
	HandCamer(double weight)
	{
		this.weight=weight;
	}
	
}