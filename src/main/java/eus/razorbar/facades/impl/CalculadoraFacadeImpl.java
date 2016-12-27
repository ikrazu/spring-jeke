package eus.razorbar.facades.impl;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import eus.razorbar.facades.CalculadoraFacade;

@Service
public class CalculadoraFacadeImpl implements CalculadoraFacade {

	@Secured("ROLE_ADMIN")
	@Override
	public int sumar(int uno, int dos) {
		return uno+dos;
	}

}
