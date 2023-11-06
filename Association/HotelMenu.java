class HotelMenu
{
public static void main(String args[])
		{
		 System.out.println("starting in main method");
		 MenuCard menu=new MenuCard();
		 menu.setMenucard(10,100.0);
		 Hotel hotel2=new Hotel();
		 hotel2.setMethod(menu);
		 hotel2.displayInfo();
		}
}

