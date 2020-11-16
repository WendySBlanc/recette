package com.recetteSB.recette.dao;

import com.recetteSB.recette.model.ListeCourse;

import java.util.List;

public interface ListCourseDao {

    public List<ListeCourse> findAll();
    public ListeCourse findById(int id);
    public ListeCourse addListe(ListeCourse listeCourse);
}
