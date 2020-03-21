package com.cct.microcct.com.cct.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class maincontroller {

    //Récupérer la liste des produits
    @RequestMapping(value = "/Joueur", method = RequestMethod.GET)
    public String listeProduits() {
        return "Un exemple de produit";
    }


}
