package com.uninpahu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uninpahu.entity.Departamento;
import com.uninpahu.repository.DepartamentoRepository;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
public class DepartamentoService {
	@Autowired
	private DepartamentoRepository departamentoRepository;

	public Departamento agregarOActualizar(Departamento departamento) {
		return departamentoRepository.save(departamento);
	}

	public boolean eliminarPorId(int id) {
		departamentoRepository.deleteById(id);
		return true;
	}
	
	public List<Departamento> traerTodo(){
		return departamentoRepository.findAll();
	}

	public Departamento traerPorId(int id) {
		return departamentoRepository.findById(id).get();
	}
}
