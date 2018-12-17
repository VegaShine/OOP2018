/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.secondaprova.gruppo22;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Comparator;

/**
 *
 * @author Francesco
 */
public class ComparatoreData implements Comparator<LocalDateTime>,Serializable {

    @Override//ciaomio
    public int compare(LocalDateTime o1, LocalDateTime o2) {
       return  o1.compareTo(o2);
    }
    
}
