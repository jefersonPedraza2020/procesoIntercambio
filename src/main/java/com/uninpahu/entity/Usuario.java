package com.uninpahu.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usuarioId;
	private String nombreUsuario;
	private String apellidoUsuario;
	private String documento;
	private String contrasena;
	private String correo;
	private String direccion;
	private String telefono;
	private String fechaNacimiento;
	private String generoUsuario;

	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn(name = "idUsuario", referencedColumnName = "usuarioId")
	private List<RolUsuarios> rolUsuarios;
	
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn(name = "idUsuario", referencedColumnName = "usuarioId")
	private List<Estudiante> estudiante;	
}
