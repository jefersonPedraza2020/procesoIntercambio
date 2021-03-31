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
public class TipoDocumento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tipoDocumentoId;
	private String descripcion;
	private String sigla;
	@OneToMany (cascade = CascadeType.ALL)
	@JoinColumn(name = "idTipoDocumento", referencedColumnName = "tipoDocumentoId")
	private List<Usuario> usuario;
}
