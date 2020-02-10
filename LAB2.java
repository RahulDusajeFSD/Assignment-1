abstract class Item
{
	private int Id;
	private String title;
	private int numofCopies;

	Item(int IDn, String T, int n)
	{
		Id=IDn;
		title=T;
		numofCopies=n;
	}

	public int getId()
	{
		return this.Id;
	}

	public String getTitle()
	{
		return title;
	}

	public int getNumofCopies()
	{
		return numofCopies;
	}

	public void setId(int Id)
	{
		this.Id=Id;
	}
	public void setTitle(String title)
	{
		this.title=title;
	}
	public void setNumofCopies(int numofCopies)
	{
		this.numofCopies=numofCopies;
	}

	//public boolean equals(Object ref){}

	public String toString(){
		return "ID:"+this.Id+"Title:"+this.title+"NumberofCopies:"+this.numofCopies;
	}

	public void CheckIn()
	{
		numofCopies++;
	}
	public void CheckOut()
	{
		numofCopies--;
	}

	abstract void display();
}

	abstract class WrittenItem extends Item
	{
		private String author;

		WrittenItem(int Id,String title, int numofCopies, String author)
		{
			super(Id,title,numofCopies);
			this.author=author;

		}

		public String getAuthor()
		{
			return author;
		}

	}



	class Book extends WrittenItem
	{
		Book(int Id,String title, int numofCopies, String author)
		{
			super(Id,title,numofCopies,author);
		}

		

		@Override
		public void display()
		{
			System.out.println("Id:"+this.getId());
			System.out.println("title:"+this.getTitle());
			System.out.println("numofCopies:"+this.getNumofCopies());
			System.out.println("Author:"+this.getAuthor());

		}
	}

	class JournalPaper extends WrittenItem
	{
		private int yearP;

		JournalPaper(int Id,String title, int numofCopies, String author, int yearP)
		{
			super(Id,title,numofCopies,author);
			yearP=this.yearP;
		}

		public  int getYearP()
		{
			return  yearP;
		}

		@Override
		public void display()
		{
			
			System.out.println("Id:"+this.getId());
			System.out.println("title:"+this.getTitle());
			System.out.println("numofCopies:"+this.getNumofCopies());
			System.out.println("Author:"+this.getAuthor());
			System.out.println("YearPublished:"+this.getYearP());

		
		}
		
	}

	abstract class MediaItem extends Item
	{
		private int runTime;



		MediaItem(int Id,String title, int numofCopies, int runTime)
		{
			super(Id,title,numofCopies);
			this.runTime=runTime;

		}

		public int getruntime()
		{
			return runTime;
		}

		//abstract void display();

	}

	class Video extends MediaItem
	{
		private String director;
		private String genre;
		private int  year;

		Video(int Id,String title, int numofCopies, int runTime, String director,String genre, int year)
		{
			super(Id,title,numofCopies,runTime);
			this.director=director;
			this.genre=genre;
			this.year=year;

		}

		public String getdirector()
		{
			return director;
		}

		public String getGenre()
		{
			return genre;
		}

		public int getYear()
		{
			return year;
		}
	

		@Override
		public void display()
		{
			System.out.println("Director:" + this.getdirector());
			System.out.println("Genre:" + this.getGenre());
			System.out.println("Year:" + this.getYear());
			System.out.println("Runtime:" + this.getruntime());
			System.out.println("Runtime:" + this.getId());
		
		}


	}

	class CDs extends MediaItem
	{
		private String artist;
		private String genre;

		public String getArtist()
		{
			return artist;
		}

		public String getgenre()
		{
			return genre;
		}

		CDs(int Id,String title, int numofCopies, int runTime, String artist,String genre)
		{
			super(Id,title,numofCopies,runTime);
			this.artist=artist;
			this.genre=genre;
		}

		public void display()
		{
			System.out.println("artist:"+this.getArtist());
			System.out.println("Genre:"+this.getgenre());
			System.out.println("ID:"+this.getId());
			System.out.println("Title:"+this.getTitle());
			System.out.println("numofCopies:"+this.getNumofCopies());
			System.out.println("runTime:"+this.getruntime());
			System.out.println("Artist:"+this.getArtist());
		}

			}


	class LAB2
	{
		public static void main(String[] args) {
			Book b=new Book(9,"GOT",5,"me");
			b.display();

			Video v=new Video(500,"KR",23,43,"wre","fw",432);
			v.display();
		}
	}