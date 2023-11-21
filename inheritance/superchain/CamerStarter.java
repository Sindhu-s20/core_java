class CamerStarter{

	public static void main(String args[])
	{
		System.out.println("Starting main method CamerStarter");
		
		Camera camera=new Camera();
		Camera camera1=new Camera("lenovo",4.0,CameraColor.ORANGE);
		System.out.println("brand"+camera1.brand);
		System.out.println("Color"+camera1.color);
		System.out.println("Pixel"+camera1.pixel);
		camera1.setMethod(4);
		
		DigitalCamera dg=new DigitalCamera();
		HandCamer hc=new HandCamer();
		System.out.println("Ending main method CamerStarter");

		
	}

}
