class GamePlayMain{
	
	public static void main(String args[])
	{
	Game game;
	game =new Game();
	game.play();
	game.pause();
	game.end();
	game.showInfo();
	
	 Player player;
	 player=new Player();
	 
	 player.play(game);
	 player.pauseGame(game);
	 player.endGame(game);
	 player.showInfo();
	 

	
	
}
}