package com.tasa.interes.activa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tasa.interes.activa.modelo.TasaInteresActiva;

@Repository
public interface TasaInteresActivaRepositorio extends JpaRepository<TasaInteresActivaRepositorio, Long>{

	TasaInteresActiva save(TasaInteresActiva tasaInteres);

}
