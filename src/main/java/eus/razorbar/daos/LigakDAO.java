package eus.razorbar.daos;

import java.util.List;

import eus.razorbar.beans.Liga;

public interface LigakDAO {

	public void createLiga(String izena);
	
	public List<Liga> getAllLeagues();
}
