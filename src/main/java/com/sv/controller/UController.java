package com.sv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.models.Usuario;
import com.sv.repository.InterfaceUsuario;


@RestController
@RequestMapping("/Usuario")
public class UController {
	
	@Autowired
	private InterfaceUsuario interfaceUser;
	
	@GetMapping
	public List<Usuario> usuarios()
	{
		return (List<Usuario>) interfaceUser.findAll();
	}
	@PostMapping
	public void insertar(@RequestBody Usuario us)
	{
		interfaceUser.save(us);
	}
	@PutMapping 
	public void modificar(@RequestBody Usuario us)
	{
		interfaceUser.save(us);
	}
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id)
	{
		interfaceUser.deleteById(id);
	}
	

}
