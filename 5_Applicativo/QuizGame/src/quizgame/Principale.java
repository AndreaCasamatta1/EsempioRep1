/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quizgame;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import quizgame.UI.*;

/**
 *
 * @author Andrea.casamatta
 */
public class Principale extends javax.swing.JFrame {
    //Inizializza le varie pagine jPanel che verranno usate nel jFrame
    QuizGame quizGame = new QuizGame();
    Impostazioni impostazioni1 = new Impostazioni();
    DomandaVeroFalso domande1 = new DomandaVeroFalso(quizGame, impostazioni1);
    DomandaMultipla domande2 = new DomandaMultipla(quizGame, impostazioni1);
    MenuIniziale menu1 = new MenuIniziale(quizGame);
    Classifica classifica = new Classifica(quizGame);
    private int quantitaDomanda; // le domande che verranno chieste, il numero massimo
    private int numDomanda; // tiene il conto delle domande
    private boolean tipoDomanda = false; //viene abilitata la domanda multipla e vero-falso in modo casuale
    Random rd = new Random(); // creating Random object 
    private int sceltaGiocatore = 0; // sceglie chi risponde, 0 il primo, poi ogni domanda aggiunge 1 fino che non arriva al limite di giocatori dove ritorna al primo (0)
    boolean inizioDomanda = false; // abilita le domande

    public Principale() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaginaBase = new javax.swing.JPanel();
        CambioPagina = new javax.swing.JPanel();
        prossima = new javax.swing.JButton();
        precedente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setResizable(false);
        setSize(new java.awt.Dimension(750, 415));

        PaginaBase.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout PaginaBaseLayout = new javax.swing.GroupLayout(PaginaBase);
        PaginaBase.setLayout(PaginaBaseLayout);
        PaginaBaseLayout.setHorizontalGroup(
            PaginaBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        PaginaBaseLayout.setVerticalGroup(
            PaginaBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        getContentPane().add(PaginaBase, java.awt.BorderLayout.CENTER);
        PaginaBase.setVisible(false);  getContentPane().remove(PaginaBase);  getContentPane().add(menu1, java.awt.BorderLayout.CENTER);

        CambioPagina.setBackground(new java.awt.Color(51, 153, 255));

        prossima.setBackground(new java.awt.Color(0, 204, 51));
        prossima.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        prossima.setText("PROSSIMA");
        prossima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prossimaActionPerformed(evt);
            }
        });

        precedente.setBackground(new java.awt.Color(255, 102, 0));
        precedente.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        precedente.setText("PAGINA INIZIALE");
        precedente.setEnabled(false);
        precedente.setVisible(false);
        precedente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precedenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CambioPaginaLayout = new javax.swing.GroupLayout(CambioPagina);
        CambioPagina.setLayout(CambioPaginaLayout);
        CambioPaginaLayout.setHorizontalGroup(
            CambioPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambioPaginaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(precedente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 605, Short.MAX_VALUE)
                .addComponent(prossima)
                .addContainerGap())
        );
        CambioPaginaLayout.setVerticalGroup(
            CambioPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambioPaginaLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(CambioPaginaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prossima)
                    .addComponent(precedente))
                .addContainerGap())
        );

        getContentPane().add(CambioPagina, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prossimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prossimaActionPerformed
        //metodo che serve per andare avanti di pagina passando valori utili per le diverse pagine
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (menu1.isEnabled()) {
            menu1.inviaNomi();
            menu1.setVisible(false);
            menu1.setEnabled(false);
            getContentPane().remove(menu1);
            getContentPane().add(impostazioni1, java.awt.BorderLayout.CENTER);
            impostazioni1.setVisible(true);
            impostazioni1.setEnabled(true);
            precedente.setVisible(true);
            precedente.setEnabled(true);
            quantitaDomanda = (4 * (quizGame.getGiocatori().size()));
            //nel caso sia pari il numero di giocatori si aggiunge una domanda per far rispondere a tutti le stesse domande
            if (quantitaDomanda % 2 == 0) {
                quantitaDomanda++;
            }
            numDomanda = 0;

        }
        if ((quantitaDomanda > numDomanda) && inizioDomanda) {
            if (numDomanda > 0) {
                if (domande1.isEnabled()) {
                    try {
                        domande1.verificaRisposta();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    domande2.verificaRisposta();
                }

            }

            numDomanda++;
            domande1.scegliDomanda(numDomanda);
            domande2.scegliDomanda(numDomanda);
            domande1.scegliGiocatore(sceltaGiocatore);
            domande2.scegliGiocatore(sceltaGiocatore);
            sceltaGiocatore++;
            if (quizGame.getGiocatori().size() == sceltaGiocatore) {
                sceltaGiocatore = 0;

            }
            if (impostazioni1.isEnabled()) {

                impostazioni1.setVisible(false);
                impostazioni1.setEnabled(false);
                getContentPane().remove(impostazioni1);
                getContentPane().add(domande1, java.awt.BorderLayout.CENTER);
                domande1.setVisible(true);
                domande1.setEnabled(true);
                prossima.setText("PROSSIMA");
                precedente.setText("PAGINA INIZIALE");
                domande1.scegliDomanda(numDomanda);
                tipoDomanda = true;

            } else if ((tipoDomanda) && (rd.nextBoolean() == true)) {
                domande2.setVisible(false);
                domande2.setEnabled(false);
                getContentPane().remove(domande2);
                getContentPane().add(domande1, java.awt.BorderLayout.CENTER);
                domande1.setVisible(true);
                domande1.setEnabled(true);
                precedente.setText("PAGINA INIZIALE");
                tipoDomanda = true;

            } else if ((tipoDomanda) && (rd.nextBoolean() == false)) {

                domande1.setVisible(false);
                domande1.setEnabled(false);
                getContentPane().remove(domande1);
                getContentPane().add(domande2, java.awt.BorderLayout.CENTER);
                domande2.setVisible(true);
                domande2.setEnabled(true);
                precedente.setText("PAGINA INIZIALE");
                tipoDomanda = true;
            }

        }
        if (quantitaDomanda == numDomanda) {
            domande1.setVisible(false);
            domande1.setEnabled(false);
            domande2.setVisible(false);
            domande2.setEnabled(false);
            getContentPane().remove(domande1);
            getContentPane().remove(domande2);
            getContentPane().add(classifica, java.awt.BorderLayout.CENTER);
            classifica.setVisible(true);
            classifica.setEnabled(true);
            precedente.setVisible(true);
            precedente.setEnabled(true);
            precedente.setText("PAGINA INIZIALE");
            prossima.setVisible(false);
            numDomanda = 0;
            sceltaGiocatore = 0;
            classifica.aggiornaClassifica();
        }
        inizioDomanda = true;


    }//GEN-LAST:event_prossimaActionPerformed

    private void precedenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precedenteActionPerformed
        //metodo che serve per tornare al menu iniziale reimpostando tutti i valori
        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {
            Logger.getLogger(Principale.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (impostazioni1.isEnabled()) {
            impostazioni1.setVisible(false);
            impostazioni1.setEnabled(false);
            getContentPane().remove(impostazioni1);
            getContentPane().add(menu1, java.awt.BorderLayout.CENTER);
            menu1.setVisible(true);
            menu1.setEnabled(true);
            prossima.setVisible(true);
            prossima.setEnabled(true);
            precedente.setVisible(false);
            precedente.setEnabled(false);
            tipoDomanda = false;
            sceltaGiocatore = 0;
            numDomanda = 0;
            inizioDomanda = false;
            

        } else if (domande1.isEnabled()) {
            domande1.setVisible(false);
            domande1.setEnabled(false);
            getContentPane().remove(domande1);
            getContentPane().add(menu1, java.awt.BorderLayout.CENTER);
            menu1.setVisible(true);
            menu1.setEnabled(true);
            prossima.setVisible(true);
            prossima.setEnabled(true);
            precedente.setVisible(false);
            precedente.setEnabled(false);
            tipoDomanda = false;
            sceltaGiocatore = 0;
            numDomanda = 0;
            inizioDomanda = false;

        } else if (domande2.isEnabled()) {
            domande2.setVisible(false);
            domande2.setEnabled(false);
            getContentPane().remove(domande2);
            getContentPane().add(menu1, java.awt.BorderLayout.CENTER);
            menu1.setVisible(true);
            menu1.setEnabled(true);
            prossima.setVisible(true);
            prossima.setEnabled(true);
            precedente.setVisible(false);
            precedente.setEnabled(false);
            tipoDomanda = false;
            sceltaGiocatore = 0;
            numDomanda = 0;
            inizioDomanda = false;

        } else if (classifica.isEnabled()) {
            classifica.setVisible(false);
            classifica.setEnabled(false);
            getContentPane().remove(classifica);
            getContentPane().add(menu1, java.awt.BorderLayout.CENTER);
            menu1.setVisible(true);
            menu1.setEnabled(true);
            prossima.setVisible(true);
            prossima.setEnabled(true);
            precedente.setVisible(false);
            precedente.setEnabled(false);
            tipoDomanda = false;
            sceltaGiocatore = 0;
            numDomanda = 0;
            inizioDomanda = false;

        }

    }//GEN-LAST:event_precedenteActionPerformed

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
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principale().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CambioPagina;
    private javax.swing.JPanel PaginaBase;
    private javax.swing.JButton precedente;
    private javax.swing.JButton prossima;
    // End of variables declaration//GEN-END:variables
}
