class CanteenStarter{
	
	public static void main(String args[])
	{
		System.out.println("Starting of the main method");
		
		Canteen canteen=new Canteen();
		
		String[] utensils=new String[41];
		
		utensils[0]="apron";
		utensils[1]="Blender";
		utensils[2]="bottel";
		utensils[3]="bowl";
		utensils[4]="butter knife";
		utensils[5]="cake slicer";
		utensils[6]="chopstic";
		utensils[7]="colander";
		utensils[8]="cleaver";
		utensils[9]="microwave";
		utensils[10]="corkscrew";
		utensils[11]="cup";
		utensils[12]="cutlery";
		utensils[13]="cutting bord";
		utensils[14]="funnel";
		utensils[15]="dish rack";
		utensils[16]="egg slicer";
		utensils[17]="deep fryer";
		utensils[18]="kitchen paper";
		utensils[19]="gas stove";
		utensils[20]=" grater";
		utensils[21]="hotpot";
		utensils[22]="jar";
		utensils[23]="fork";
		utensils[24]="knife";
		utensils[25]="juicer";
		utensils[26]="scissor";
		utensils[27]="jug";
		utensils[28]="kettle";
		utensils[29]="oven glove";
		utensils[30]="mixer";
		utensils[31]="ladel";
		utensils[32]="potholders";
		utensils[33]="thermometre";
		utensils[34]="mixer";
		utensils[35]="cooker";
		utensils[36]="pizza cutter";
		utensils[37]="strainer";
		utensils[38]="spatula";
		utensils[39]="tongs";
		utensils[40]="corkswcrew";
		
		canteen.setUtensils(utensils);
		
		canteen.setType("veg");
		canteen.display();
		System.out.println("ending of the main method");
	}
}
