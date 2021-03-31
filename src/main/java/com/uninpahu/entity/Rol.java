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


@Entity
@Data
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rolId;
	private String nombreRol;
	private String descripcion;
	
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn(name = "idRol", referencedColumnName = "rolId")
	private List<RolPermisos> rolPermisos;
	
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn(name = "idRol", referencedColumnName = "rolId")
	private List<RolUsuarios> rolUsuarios;
}
