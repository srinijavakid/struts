package com.tutorials4u.actions;

import java.util.ArrayList;
import java.util.List;


public class AlbumInfoAction{

	private String title;
	private Artist artist;
	private static List<Song> songs = new ArrayList<Song>();
	
	static {
		songs.add(new Song("Thriller","Disco"));
		songs.add(new Song("Beat It","Rock"));
		songs.add(new Song("Billie Jean","Pop"));		
	}
	
	public String populate()
	{
		title = "Thriller";
		artist = new Artist("Michael Jackson","King of pop");
		return "populate";
	}
	
	public String execute()
	{
		return "success";
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public List<Song> getSongs() {
		return songs;
	}
	
}
