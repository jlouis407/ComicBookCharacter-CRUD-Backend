package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Superhero;
import com.example.demo.repository.SuperheroRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class SuperheroController {
	
	@Autowired
	private SuperheroRepository superheroRepository;
	
	@GetMapping("/superheroes")
	public List<Superhero> getAllSuperheroes(){
		return superheroRepository.findAll();
	}
	
	@PostMapping("/superheroes")
	public Superhero createSuperhero(@RequestBody Superhero superhero) {
		return superheroRepository.save(superhero);
	}
	

}
