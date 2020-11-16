package com.recetteSB.recette.dao;

import com.recetteSB.recette.model.ListeCourse;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ListCourseDaoImpl implements ListCourseDao{

//pas encore de base données static


   public static List<ListeCourse> listeCourse = new ArrayList<>();

   static {
       ArrayList products = new ArrayList() ;
       products.add("pomme de terre");
       products.add("choux");


      listeCourse.add(new ListeCourse(1,products.toString() , 2));
       listeCourse.add(new ListeCourse(2,new String("poivron"), 1));
       listeCourse.add(new ListeCourse(3,new String("poivron,Pomme,poire,fraise"), 4));


   }


    @Override
    public List<ListeCourse> findAll() {
        return listeCourse;
    }

    @Override
    public ListeCourse findById(int id) {
        return null;
    }

    @Override
    public ListeCourse addListe(ListeCourse listeCourse) {
        return null;
    }
}
