/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.secondaprova.gruppo22;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Set;
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        
        String tmp="Promemoria inseriti"+"\n";
        for(LocalDateTime l: this.keySet())
        {
            
            tmp+=l.format(formatter)+ " - " + this.get(l)+"\n";
        }
        return tmp;        
    }
    
    public void aggiungiPromemoria(LocalDateTime date, String promemoria) throws DataPresenteException, InvalidDataException, InvalidTextException {
        if (LocalDateTime.now().isAfter(date)) {
            this.notifyAll();
            throw new InvalidDataException();
        } else if (promemoria == null) {
            this.notifyAll();
            throw new InvalidTextException();
        } else if (this.containsKey(date)) {

            this.notifyAll();
            throw new DataPresenteException();
        }

        this.put(date, promemoria);
        this.notifyAll();
    }

    public String rimuoviPromemoria(LocalDateTime date) throws DataNonPresenteException
    {
        //questo blocco if è eliminabile se si effettua  il controllo direttamente nel'app grafica
        if(!this.containsKey(date))
        {
            this.notifyAll();
            throw new DataNonPresenteException();
        }
        
        String tmp= this.remove(date);
        this.notifyAll();
        return tmp;
    }

    
}
