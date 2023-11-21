class Camera{

	String brand;
	CameraColor color;
	                      // CameraColor color=CameraColor.BLUE;  declre the enum reference with color
	double pixel;
	int battteryDuration;
	
	Camera()
	{
		
	System.out.println("default argument with no-argument Camer");
	
	}
	
	Camera(String brand,double pixel,CameraColor color)
	{
		this.brand=brand;
		this.pixel=pixel;
		this.color=color;
		System.out.println("this is parameter constructor");
	}
	 void setMethod(int battteryDuration)
	 {
		this.battteryDuration=battteryDuration;
	 }
	
}
