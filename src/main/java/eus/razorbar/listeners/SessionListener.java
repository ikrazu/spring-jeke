package eus.razorbar.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("SESIOA SORTU DA 10 segundoko inaktibitatearekin");
		se.getSession().setMaxInactiveInterval(10);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("SESIOA BUKATU DA INAKTIBITATEAN EGOTEAGATIK!!!");
	}

}
