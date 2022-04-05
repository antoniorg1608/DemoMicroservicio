package com.nttdata.bootcamp.micro.demo.Demo.microservicio.controller;

import org.springframework.http.ResponseEntity;

public interface DemoController {

	ResponseEntity<String>saludo();
}
