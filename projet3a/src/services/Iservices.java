/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;

/**
 *
 * @author HP 840 G3
 */
public interface Iservices<T> {
   
    public void ajout(T t);
    public void modifier(T t);
    public void supprimer(int id);
    public List<T> afficher();
    
}