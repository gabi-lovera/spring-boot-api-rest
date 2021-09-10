package com.sv.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sv.models.Usuario;

@Repository
public interface InterfaceUsuario extends CrudRepository<Usuario, Integer> {

}

