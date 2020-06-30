package ufv.dis.extraordinario.GVVExtraPrueba;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;


public class tests {

	Tweet tweet = null;
	Date date = new Date();
	Date datem = new Date();
	Tweets tweets = null;
	
	
	@Before
	public void Initialize()
	{
		tweet = new Tweet("Twitter", "Bienvenido", date);
	}
	
	@Test
	public void CreacionTweet()
	{
		
		String nombre =  tweet.getNombre();
		tweet.setNombre(nombre);
		
		String mensaje =  tweet.getMensaje();
		tweet.setMensaje(mensaje);
		
		datem =  tweet.getFechamsg();
		tweet.setFechamsg(datem);
		
	}
	
	
}
