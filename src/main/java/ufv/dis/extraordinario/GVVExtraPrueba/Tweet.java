package ufv.dis.extraordinario.GVVExtraPrueba;

import java.util.Date;

import org.ocpsoft.prettytime.PrettyTime;


public class Tweet {

	
	public String nombre;
	public String mensaje;
	public Date fechamsg;
	public Tweet(String nombre, String mensaje, Date fechamsg) {
		super();
		this.nombre = nombre;
		this.mensaje = mensaje;
		this.fechamsg = fechamsg;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Date getFechamsg() {
		return fechamsg;
	}
	public void setFechamsg(Date fechamsg) {
		this.fechamsg = fechamsg;
	}
	
	public String FechaHuman(Date date)
	{
		PrettyTime p = new PrettyTime();
		return p.format(new Date());
	}
	
	
	
}
