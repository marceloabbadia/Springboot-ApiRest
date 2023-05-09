package com.serratec.marceloabbadia.trabalho1.entitys;


public class Products {

	private Long id;
	private String name;
	private Departaments departaments;
	private Double price;
	
	
	public Products() {
		
	}
	
	
	public Products(Long id, String name, Departaments departaments, Double price) {
		this.id = id;
		this.name = name;
		this.departaments = departaments;
		this.price = price;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Departaments getDepartament() {
		return departaments;
	}
	public void setDepartament(Departaments departament) {
		this.departaments = departament;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}
