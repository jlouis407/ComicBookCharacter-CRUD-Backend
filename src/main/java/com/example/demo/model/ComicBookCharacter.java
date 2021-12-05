package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comic_book_characters")
public class ComicBookCharacter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private CharacterStatus status;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "year")
	private int year;
	
	public ComicBookCharacter() {
		
	}
	
	public ComicBookCharacter(long id, String name, CharacterStatus status, String brand, int year) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.brand = brand;
		this.year = year;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public CharacterStatus getStatus() {
		return status;
	}
	
	public void setStatus(CharacterStatus status) {
		this.status = status;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "ComicBookCharacter [id=" + id + ", name=" + name + ", status=" + status + ", brand=" + brand + ", year="
				+ year + "]";
	}

}
