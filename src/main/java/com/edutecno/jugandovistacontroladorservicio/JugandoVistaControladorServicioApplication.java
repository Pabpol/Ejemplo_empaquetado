package com.edutecno.jugandovistacontroladorservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JugandoVistaControladorServicioApplication {

	public static void main(String[] args) {
		SpringApplication.run(JugandoVistaControladorServicioApplication.class, args);
//		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(JugandoVistaControladorServicioApplication.class);
//		MensajeService servicio = acac.getBean(MensajeService.class);
//		System.out.println(servicio.filtrar("desde mi celular"));
	}

}
