class GlassStarter{

		public static void main(String args[])
	   {
		System.out.println("Starting main method CamerStarter");
		
		Glass glass =new Glass();
		Glass glass1 =new Glass(4.5,"bottel","coach","hard",GlassType.TINTED);
		System.out.println("length"+glass1.length);
		System.out.println("thickness"+glass1.thickness);
		System.out.println("type"+glass1.type);
		System.out.println("usage"+glass1.usage);
		System.out.println("brand"+glass1.brand);
		
		LaminatedGlass lg=new LaminatedGlass();
		LaminatedGlass lg1=new LaminatedGlass(900,8);
		System.out.println("cost"+lg1.cost);
		System.out.println("warranty"+lg1.warranty);

		ToughenedGlass tg=new ToughenedGlass();
		ToughenedGlass tg1=new ToughenedGlass(6.5,"rama");
		System.out.println("wight"+tg1.wight);
		System.out.println("ownerName"+tg1.ownerName);

		TintedGlass ting=new TintedGlass();
		GorillaGlass gg=new GorillaGlass();
		
		System.out.println("Endinging main method CamerStarter");
	   }

}
