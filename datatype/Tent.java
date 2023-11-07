class Tent{
	int slNo;
	String color;
    double width;
    int height;
	Tent tent;
	 
	 void open(int slNo,String color,double width,int height)
	 {
		 this.slNo=slNo;
		 this.color=color;
		 this.width=width;
		 this.height=height;
		 this.tent=tent;
		 
	 }
	 void close()
	 {
		System.out.println("this is close method");
	 }
	 void shoeInfo()
	 {
		 System.out.println("serial number is:"+this.slNo);
		 System.out.println("color of tent is:"+this.color);
		 System.out.println("width of tent is:"+this.width);
		 System.out.println("height of the tent is:"+this.height);
	 }
}

