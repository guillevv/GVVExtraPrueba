package ufv.dis.extraordinario.GVVExtraPrueba;

import java.util.ArrayList;


public class Tweets {

	private ArrayList<Tweet> tweets;
	
	
	public Tweets(){
		tweets = new ArrayList<Tweet>();
	}
	
	public void addTweet(Tweet t)
	{
		tweets.add(t);
	}
	
	
	public void removeTweet(Tweet t)
	{
		tweets.remove(t);
	}
	
	
	public int getTweetsSize()
	{
		return tweets.size();
	}
	
}
