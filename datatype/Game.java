class Game{
	
	int id;
	String name;
	int totalPlayers;
	String origin;
	
	void play()
	{

	System.out.println("Game");
	System.out.println("id is :"+this.id);
	System.out.println("name is :"+this.name);
	System.out.println("origin is :"+this.origin);
	
    }
	void pause()
	{

		System.out.println("this is player method");
	}
	void end()
	{
	
		System.out.println("this is end method");
	}
	void showInfo()
	{
		System.out.println("game id is:"+this.id);
		System.out.println("game name is:"+this.name);
		System.out.println("totalPlayers is:"+this.totalPlayers);
		System.out.println("origi is:"+this.origin);
	}
	
	
	
}