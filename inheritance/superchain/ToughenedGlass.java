class ToughenedGlass extends Glass{
	
	double wight;
    String ownerName;
	
	ToughenedGlass()
	{
		super(5.5,"mirror","costa","smooth",GlassType.LAMINATED);
		System.out.println("this is default constructor no-argument of ToughenedGlass");
	}
	
	ToughenedGlass(double wight,String ownerName)
	{
		this.wight=wight;
		this.ownerName=ownerName;
	}
	
}