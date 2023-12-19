package com.tasa.interes.activa.controlador;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tasa.interes.activa.modelo.TasaInteresActiva;
import com.tasa.interes.activa.repositorio.TasaInteresActivaRepositorio;

@RestController
@RequestMapping("/api/v1/")
public class TasaInteresActivaControlador {
	
	@Autowired
	private TasaInteresActivaRepositorio repositorio;
	
	@GetMapping("/interesactiva")
	public Collection<TasaInteresActivaRepositorio> ColeccionarTodasLasTasasInteresActivas(){
		return repositorio.findAll();
	}
	
	@PostMapping("/actualizar")
	public TasaInteresActiva actualizarTasaInteresActiva(@RequestBody TasaInteresActiva tasaInteres) {
		return repositorio.save(tasaInteres);
	}
	
	@PostMapping("/incluirtasa")
	public TasaInteresActiva incluirTasaInteresActiva(@RequestBody TasaInteresActiva tasaInteres) {
		return repositorio.save(tasaInteres);
	}
	
	@DeleteMapping("/anulartasa")
	public void anularTasaInteresActiva(@RequestBody Long id) {
		repositorio.deleteById(id);
	}
}