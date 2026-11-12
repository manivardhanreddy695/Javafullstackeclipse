package com.myfirstproject.Constructors;

public class Cinema {
 String movieName;
 int year;
 String dir;
 String hero;
 String music;
 
 Cinema(){
	 this("bahubali");
	 
 }
 
 
 
	public Cinema(String movieName) {
		this("bahubali",2015);
	this.movieName = movieName;
}
	



	public Cinema(String movieName, int year) {
		this("bahubali",2015,"rajamouli");
		this.year = year;
	}
	



	public Cinema(String movieName, int year, String dir) {
		this("bahubali",2015,"rajamouli","PRABHAS");
		this.movieName = movieName;
		this.year = year;
		this.dir = dir;
	}
	



	public Cinema(String movieName, int year, String dir, String hero) {
		this("bahubali",2015,"rajamouli","PRABHAS","MMkeeravani");
		
	}
	



	public Cinema(String movieName, int year, String dir, String hero, String music) {
		
	
		this.movieName = movieName;
		this.year = year;
		this.dir = dir;
		this.hero = hero;
		this.music = music;
	}
	



	public static void main(String[] args) {
		Cinema c1 = new Cinema();
		Cinema c2 = new Cinema("saaho",2019,"sujeeth","PRABHAS","ghibran");
		c1.movie();
		c2.movie();
      
	}
	void movie() {
		System.out.println("*********************************************");
		System.out.println("Movie name   :" + movieName);
		System.out.println(" Year        :" + year);
		System.out.println(" Director    :" + dir);
		System.out.println("Hero name    :" + hero);
		System.out.println("Music by     :" + music);
		
	}

}
