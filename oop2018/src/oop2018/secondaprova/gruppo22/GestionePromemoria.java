/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.secondaprova.gruppo22;

import java.io.Serializable;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.util.TreeMap;
import oop2018.secondaprova.gruppo22.ExceptionPack.*;
/**
 *
 * @author Francesco
 */
public class GestionePromemoria extends TreeMap<LocalDateTime,String> implements Serializable {
    
    public GestionePromemoria() {
      super(new ComparatoreData());
    }
    
    @Override
    public String toString() {
        String tmp="Promemoria inseriti"+"\n";
        for(LocalDateTime l: this.keySet())
        {
            tmp+=l.toString()+ "-" + this.get(l)+"\n";
        }
        return tmp;        
    }
    
    public void aggiungiPromemoria(LocalDateTime date, String promemoria) throws DataPresenteException,InvalidDataException,InvalidTextException
    {
        if(now().isAfter(date))
        {
            this.notifyAll();
            throw new InvalidDataException();
        }
        if(promemoria==null | promemoria=="" )
        {
            this.notifyAll();
            throw new InvalidTextException();
        }
        if(this.containsKey(date))
        {
            
            this.notifyAll();
            throw new DataPresenteException();
        }
       
        this.put(date, promemoria);
        this.notifyAll();
    }

    public void rimuoviPromemoria(LocalDateTime date) throws DataNonPresenteException
    {
        //questo blocco if è eliminabile se si effettua  il controllo direttamente nel'app grafica
        if(!this.containsKey(date))
        {
            this.notifyAll();
            throw new DataNonPresenteException();
        }
        
        this.remove(date);
        this.notifyAll();
    }

    
}
