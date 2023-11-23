class MediaPlayer extends StandaloneApplication{
	String[] favourites;
	MediaPlayer()
	{
		System.out.println("running default const on MediaPlayer");
	}
	MediaPlayer(int size,String compatabilewith,ApplicationOs os)
	{
		super(size,compatabilewith,os);
	}
	MediaPlayer(String[] favourites)
	{
		this.favourites=favourites;
		for(int index=0; index<favourites.length; index++)
		{
			String info =favourites[index];
			System.out.println("favourites with array ="+index+ "favourites are " +info);
		}
	}
		void play()
	{
		System.out.println("MediaPlayer is running on play");
	}
	void delete()
	{
		System.out.println("MediaPlayer is running on delete");
	}
	void download()
	{
	System.out.println("MediaPlayer is running on download");
	}
}
