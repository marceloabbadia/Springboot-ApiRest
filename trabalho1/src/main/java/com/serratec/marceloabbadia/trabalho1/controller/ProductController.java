package com.serratec.marceloabbadia.trabalho1.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serratec.marceloabbadia.trabalho1.entitys.Departaments;
import com.serratec.marceloabbadia.trabalho1.entitys.Products;


@RestController
@RequestMapping(value="/products")
public class ProductController {
	
	
	@GetMapping
	public List<Products> getObj() {
		
		Departaments d1 = new Departaments (1L, "Tech");
		Departaments d2 = new Departaments (2L, "Pet");
		Departaments d3 = new Departaments (3L, "Home");
		Departaments d4 = new Departaments (4L, "Bath");
		Departaments d5 = new Departaments (5L, "Kitchen");
		Departaments d6 = new Departaments (5L, "Books");

		Products p1 = new Products(1L,"Playstation",d1, 3500.0);
		Products p2 = new Products(2L,"Atari",d1, 1700.0);
		
		Products p3 = new Products(3L,"Raçao para gatos",d2, 120.0);
		Products p4 = new Products(4L,"Raçao para Caes",d2, 150.0);
		Products p5 = new Products(5L,"Espelho",d3, 320.0);
		
		Products p6 = new Products(6L,"Fogao",d4, 3220.0);
		
		Products p7 = new Products(7L,"Livro 1 Senhor dos aneis vol 1",d5, 170.0);
		Products p8 = new Products(8L,"Livro 2 Senhor dos aneis vol 1",d5, 175.0);
		Products p9 = new Products(9L,"Livro 3 Senhor dos aneis vol 1",d5, 180.0);

		Products p10 = new Products(10L,"Geladeira Frost Free",d4, 10175.0);

		List <Products>list = Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);

		
		return list;
				
		
	}

}
