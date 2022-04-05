package com.nttdata.bootcamp.micro.demo.Demo.microservicio.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControllerImpl implements DemoController {

	@GetMapping("/demo/funcion")
	public ResponseEntity<String> saludo() {

		return new ResponseEntity<String>(HttpStatus.OK).ok("Hola Mundo");
	}

}
