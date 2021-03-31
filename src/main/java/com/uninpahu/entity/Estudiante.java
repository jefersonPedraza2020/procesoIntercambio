package com.uninpahu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Estudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int estudianteId;
	private String tipoSangre;
	private String rh;
	private String numeroPasaporte;
	private String nombreAcudiente;
	private String parentescoAcudiente;
}
