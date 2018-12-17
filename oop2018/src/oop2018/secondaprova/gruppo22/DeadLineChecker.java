/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.secondaprova.gruppo22;

import java.time.LocalDateTime;
import static java.time.LocalDateTime.now;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import oop2018.secondaprova.gruppo22.ExceptionPack.DataNonPresenteException;

/**
 *
 * @author Francesco
 */
public class DeadLineChecker implements Runnable {

private GestionePromemoria list;
public DeadLineChecker(GestionePromemoria list)
{
    this.list=list;
}
    //va mostrato quindi l'elemento eliminato e aggiornata la jtextarea quindi penso di doverlo mettere nell'interfaccia grafica
    @Override
    public void run(){
     while(true)
     {
       try{
         Thread.sleep(15000);
         synchronized (list){
            for(LocalDateTime l: list.keySet())
            {
               if(now().isEqual(l) | now().isAfter(l))
               { String tmp;
                   try{
                       tmp=list.rimuoviPromemoria(l);
                       JOptionPane.showMessageDialog(null, tmp, "Data superata per il corrente promemoria", JOptionPane.INFORMATION_MESSAGE);
                   }catch(DataNonPresenteException ex)
                   {
                       System.err.println("Elemento non pervenuto durante la fase di aggiornamento");
                   }
               }
                   
            }
         }     
        }catch (InterruptedException ex) {
         Logger.getLogger(DeadLineChecker.class.getName()).log(Level.SEVERE, null, ex);    
        }
       list.notifyAll();      
     }     
    }
        
        
}
    

    

