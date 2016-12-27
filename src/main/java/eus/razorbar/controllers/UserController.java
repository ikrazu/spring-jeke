package eus.razorbar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import eus.razorbar.facades.CalculadoraFacade;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	CalculadoraFacade calculadoraFacade;

	@RequestMapping
	public String users() {
		return "users/home";
	}

	@RequestMapping("/kaixo")
	public String kaixo() {
//		System.out.println("Batuketaren emaitza: " + calculadoraFacade.sumar(1, 2));
		return "users/kaixo";
	}
}
