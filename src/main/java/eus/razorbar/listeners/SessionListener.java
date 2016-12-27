package eus.razorbar.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		final int inactiveTimeoutSession = 10 * 60; // 10 minutu
		System.out.println("SESIOA SORTU DA " + inactiveTimeoutSession + " segundoko inaktibitatearekin");
		se.getSession().setMaxInactiveInterval(inactiveTimeoutSession);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		System.out.println("SESIOA BUKATU DA INAKTIBITATEAN EGOTEAGATIK!!!");
	}

}
