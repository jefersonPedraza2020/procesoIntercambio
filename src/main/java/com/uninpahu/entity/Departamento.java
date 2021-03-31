package com.uninpahu.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departamentoId;
	@Column(name = "nombre")
	private String nombre;
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn(name = "idDepartamento", referencedColumnName = "departamentoId")
	private List<Ciudad> ciudad;
}
