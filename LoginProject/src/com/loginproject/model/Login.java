package com.loginproject.model;

public class Login {
	
	private String usuario;
	private String password;
	
	public boolean esUsuario(String sUsuario, String sPassword) 
	{
		if(this.usuario.equals(sUsuario) == true && this.password.equals(sPassword) == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Setter y getters de la clase
	public void setUsuario(String usuario)
	{
		this.usuario = usuario;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getUsuario()
	{
		return usuario;
	}
	
	public String getPassword()
	{
		return password;
	}
}
