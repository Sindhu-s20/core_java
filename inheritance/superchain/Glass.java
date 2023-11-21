class Glass
{
	
	double length;
	String thickness;
	GlassType type;
	String usage;
	String brand;
	
	Glass()
	{
		System.out.println("this is default constructor no-argument of Glass");
	}
	
	Glass(double length,String usage,String brand,String thickness,GlassType type)
	{
		this.length=length;
		this.usage=usage;
		this.brand=brand;
		this.thickness=thickness;
		this.type=type;
	}
}