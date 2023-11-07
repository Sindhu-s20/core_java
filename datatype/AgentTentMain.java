class AgentTentMain{
	
	public static void main(String args[])
	{
		Tent tent;
		tent =new Tent();
		tent.shoeInfo();
		Agent agent=new Agent();
		agent.openTent(tent);
		agent.closeTent(tent);
		agent.showInfo();
	
	}
	
	
}