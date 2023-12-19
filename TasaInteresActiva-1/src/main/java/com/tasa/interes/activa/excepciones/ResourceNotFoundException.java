package com.tasa.interes.activa.excepciones;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String recurso, Date fechaInicio, Date fechaFin, BigDecimal valor) {
        super("No se encontró el recurso '" + recurso + "' con la fecha de inicio '" + fechaInicio + "', fecha de fin '" + fechaFin + "' y valor '" + valor + "'.");
    }
}