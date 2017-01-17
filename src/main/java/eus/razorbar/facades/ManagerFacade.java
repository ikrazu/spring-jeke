package eus.razorbar.facades;

import java.util.List;

import eus.razorbar.beans.Jokalaria;

public interface ManagerFacade {
	
	public List<Jokalaria> getTeam(int idUsuario);

	public void pujarPorJugador(int idJugador, int cantidadPuja, int sueldoPorJornada, int cantidadJornada);
	
	public void jokalariaAlineatu();
}
