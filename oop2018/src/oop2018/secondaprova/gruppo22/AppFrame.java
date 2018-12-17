/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2018.secondaprova.gruppo22;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import oop2018.secondaprova.gruppo22.ExceptionPack.DataNonPresenteException;
import oop2018.secondaprova.gruppo22.ExceptionPack.DataPresenteException;
import oop2018.secondaprova.gruppo22.ExceptionPack.InvalidDataException;
import oop2018.secondaprova.gruppo22.ExceptionPack.InvalidTextException;

/**
 *
 * @author Francesco
 */
public class AppFrame extends javax.swing.JFrame {
        private static GestionePromemoria g=new GestionePromemoria();
        
        

    /**
     * Creates new form AppFrame
     */
    public AppFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        DataTextField = new javax.swing.JTextField();
        InsertButton = new javax.swing.JButton();
        TestoTextField = new javax.swing.JTextField();
        RemoveButton = new javax.swing.JButton();
        DataRemoveTextField = new javax.swing.JTextField();
        BackupButton = new javax.swing.JButton();
        CaricaButton = new javax.swing.JButton();
        VisualizzaScrollPane = new javax.swing.JScrollPane();
        VisualizzaTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("           Promemoriami");

        DataTextField.setText("Data prom. \"aaaa-mm-gg HH:mm\"");
        DataTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataTextFieldActionPerformed(evt);
            }
        });

        InsertButton.setText(" inserisci promemoria in lista");
        InsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertButtonActionPerformed(evt);
            }
        });

        TestoTextField.setText("     Inserire promemoria");
        TestoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TestoTextFieldActionPerformed(evt);
            }
        });

        RemoveButton.setText("Rimuovi promemoria");
        RemoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButtonActionPerformed(evt);
            }
        });

        DataRemoveTextField.setText("Data promemoria da rimuovere");
        DataRemoveTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataRemoveTextFieldActionPerformed(evt);
            }
        });

        BackupButton.setText("BackUp promemoria");
        BackupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackupButtonActionPerformed(evt);
            }
        });

        CaricaButton.setText("Carica promemoria da file");
        CaricaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaricaButtonActionPerformed(evt);
            }
        });

        VisualizzaTextArea.setEditable(false);
        VisualizzaTextArea.setColumns(20);
        VisualizzaTextArea.setRows(5);
        VisualizzaScrollPane.setViewportView(VisualizzaTextArea);
        VisualizzaScrollPane.setViewportView(VisualizzaTextArea);
        VisualizzaScrollPane.setName("Promemoria inseriti");
        VisualizzaScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        VisualizzaScrollPane.setBorder(new TitledBorder(new EtchedBorder(),"Promemoria inseriti"));
        VisualizzaScrollPane.setVisible(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TestoTextField)
                    .addComponent(DataTextField)
                    .addComponent(DataRemoveTextField)
                    .addComponent(BackupButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InsertButton))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addComponent(CaricaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VisualizzaScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(InsertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DataTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(TestoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RemoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DataRemoveTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(BackupButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(CaricaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(VisualizzaScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TestoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TestoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TestoTextFieldActionPerformed

    private void DataRemoveTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataRemoveTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataRemoveTextFieldActionPerformed

    private void InsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertButtonActionPerformed
        try {
            String str = DataTextField.getText();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
            
            if(TestoTextField.getText().isEmpty()){
                str=null;
            }else str=TestoTextField.getText();
            synchronized(g){
            g.aggiungiPromemoria(dateTime, str);
            VisualizzaTextArea.setText(g.toString());
            }
        } catch (InvalidDataException ex) {
            JOptionPane.showMessageDialog(this,
                    "Impossibile aggiungere promemoria:\n"+ "data non valida",
                    "Errore",
                    JOptionPane.ERROR_MESSAGE);
        } catch (DataPresenteException ex) {
            JOptionPane.showMessageDialog(this,
                    "Impossibile aggiungere promemoria:\n"+ "data già presente",
                    "Errore",
                    JOptionPane.ERROR_MESSAGE);
        }  catch (InvalidTextException ex) {
            JOptionPane.showMessageDialog(this,
                    "Impossibile aggiungere promemoria:\n"+"testo non valido",
                    "Errore",
                    JOptionPane.ERROR_MESSAGE);
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this,
                    "Impossibile aggiungere promemoria:\n"+ "formato data non valido",
                    "Errore",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_InsertButtonActionPerformed

    private void DataTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataTextFieldActionPerformed

    private void RemoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButtonActionPerformed
        try {
                String str = DataRemoveTextField.getText();
                System.out.println(str);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
                synchronized(g){
                String tmp=g.get(dateTime);
                
                int value=JOptionPane.showConfirmDialog(this,dateTime.toString()+" - "+tmp,"Eliminare l'elemento?",YES_NO_OPTION,QUESTION_MESSAGE);
                
                if (value==0)
                g.rimuoviPromemoria(dateTime);
                
                VisualizzaTextArea.setText(g.toString());
                }
        } catch (DataNonPresenteException ex) {
            JOptionPane.showMessageDialog(this,
                    "Impossibile rimuovere promemoria:\n"+ "data non presente",
                    "Errore",
                    JOptionPane.ERROR_MESSAGE);
        } catch (DateTimeParseException ex) {
            JOptionPane.showMessageDialog(this,
                    "Impossibile trovare promemoria:\n"+ "formato data non valido",
                    "Errore",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RemoveButtonActionPerformed

    private void CaricaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaricaButtonActionPerformed

    
        try(ObjectInputStream o = new ObjectInputStream(new BufferedInputStream(new FileInputStream("BackupPromemoria.txt"))))
        {
             g=(GestionePromemoria)o.readObject();
        }
        catch(IOException ex){
           JOptionPane.showMessageDialog(this,
                    "File non trovato",
                    "Errore",
                    JOptionPane.ERROR_MESSAGE);
        }
        catch (ClassNotFoundException ex) {
            
           JOptionPane.showMessageDialog(this,
                    "File non trovato",
                    "Errore",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CaricaButtonActionPerformed

    private void BackupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackupButtonActionPerformed
        try(ObjectOutputStream o = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("BackupPromemoria.txt")))){
          o.writeObject(g);   
        }catch(IOException e){
        JOptionPane.showMessageDialog(this,
                    "Errore nella creazione del file",
                    "Errore",
                    JOptionPane.ERROR_MESSAGE);
            
     }
    }//GEN-LAST:event_BackupButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppFrame().setVisible(true);
                new Thread(new DeadLineChecker(g)).start();  
                new Thread(new AppFrame.TextUpdater()).start();
            }
        });
    }
  static class  TextUpdater implements Runnable{
        @Override
        public void run(){
         synchronized(g){
             while(true){
                 try{
                     g.wait();
                     VisualizzaTextArea.setText(g.toString());
                 }catch(InterruptedException ex){
                       Logger.getLogger(TextUpdater.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }
         }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackupButton;
    private javax.swing.JButton CaricaButton;
    private javax.swing.JTextField DataRemoveTextField;
    private javax.swing.JTextField DataTextField;
    private javax.swing.JButton InsertButton;
    private javax.swing.JButton RemoveButton;
    private javax.swing.JTextField TestoTextField;
    private javax.swing.JScrollPane VisualizzaScrollPane;
    private static javax.swing.JTextArea VisualizzaTextArea;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
