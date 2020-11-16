package com.recetteSB.recette.controller;

import java.util.ArrayList;
import java.util.List;

import com.recetteSB.recette.dao.ListCourseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.recetteSB.recette.model.ListeCourse;
import com.recetteSB.recette.model.Produits;

@RestController
public class ListeCourseController {

//instanciation automatique aux données
	@Autowired
	 private ListCourseDao listCourseDao;

	// méthode pour affiché les listes de courses

	@GetMapping(value = "ListeCourse")
	public List<ListeCourse>  listeCourse() {
		return listCourseDao.findAll();
	}
	// méthode qui répond a l'uri ListeCourse/{id}
	
		@GetMapping(value ="ListeCourse/{id}")
		public ListeCourse afficherUneListeCourse(@PathVariable int id) {
			
			// pas encore de base de données 

			ArrayList products = new ArrayList() ;
			products.add("tomate");
			products.add("oignon");
			products.add("carotte");

			ListeCourse listeCourse = new ListeCourse(id, products.toString(), products.size());
			
			return listeCourse;



		}
}
