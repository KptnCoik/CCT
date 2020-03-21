package com.cct.microcct.com.cct.dao;

import com.cct.microcct.com.cct.model.Entité.Joueur;

import java.util.List;

public interface joueurDao {
    public List<Joueur> findAll();

    public Joueur findById(int id);

    public Joueur save(Joueur joueur);
}
