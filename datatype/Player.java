class Player{
	
	String name;
	Game game;
	
	 void play(Game game)
	 {
		System.out.println("use play from game");
		game.play();
		
	 }
	 void pauseGame(Game game)
	 {
		 System.out.println("use pause from game");
		 game.pause();
		
		}
	 void endGame(Game game)
	 {
		System.out.println("use end from game");
		game.end();
	 }
	 
	 
	 void showInfo()
	 { if(game!=null)
		 {
			 
		System.out.println("Player name is:"+this.name); 
		System.out.println("player plays game is:"+game.id);
	 }
	 }
	
}
