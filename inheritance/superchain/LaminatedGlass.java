class LaminatedGlass extends Glass{
	
			double cost;
			int warranty;
	 LaminatedGlass()
			{
					super(4.5,"bottel","coach","hard",GlassType.TINTED);
					System.out.println("default argument with no-argument LaminatedGlass");

			}
  	LaminatedGlass(double cost,int warranty)
	{
		this.cost=cost;
		this.warranty=warranty;
	}
}
