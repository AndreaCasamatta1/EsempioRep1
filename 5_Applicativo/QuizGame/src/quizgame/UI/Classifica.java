/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quizgame.UI;

import java.util.List;
import javax.swing.DefaultListModel;
import quizgame.Giocatore;
import quizgame.QuizGame;

/**
 *
 * @author Andrea.casamatta
 */
public class Classifica extends javax.swing.JPanel {

    private QuizGame quizGame;

    public Classifica(QuizGame quizGame) {
        this.quizGame = quizGame;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        posizione = new javax.swing.JLabel();
        nomeGiocatore = new javax.swing.JLabel();
        punteggio = new javax.swing.JLabel();
        classificaTitolo = new javax.swing.JLabel();
        nomeGiocatoreList = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        posizioneList = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        puntiList = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();

        setBackground(new java.awt.Color(51, 153, 255));

        posizione.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        posizione.setText("Posizione");

        nomeGiocatore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nomeGiocatore.setText("Nome Giocatore");

        punteggio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        punteggio.setText("Punti");

        classificaTitolo.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        classificaTitolo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        classificaTitolo.setText("CLASSIFICA FINALE");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        nomeGiocatoreList.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        posizioneList.setViewportView(jList2);

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        puntiList.setViewportView(jList3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(posizione, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(posizioneList))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomeGiocatoreList, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(puntiList, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomeGiocatore, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(punteggio))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(classificaTitolo, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(classificaTitolo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(punteggio)
                            .addComponent(nomeGiocatore)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(posizione)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(posizioneList)
                    .addComponent(puntiList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(nomeGiocatoreList, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents
public void aggiornaClassifica() {
        List<Giocatore> giocatori = quizGame.getGiocatori();
        // Ordina i giocatori in base al punteggio 
        giocatori.sort((g1, g2) -> Integer.compare(g2.getPunteggio(), g1.getPunteggio()));
        String[] posizioni = new String[giocatori.size()];
        String[] nomi = new String[giocatori.size()];
        String[] punteggi = new String[giocatori.size()];

        // Popolare gli array con i dati ordinati
        for (int i = 0; i < giocatori.size(); i++) {
            Giocatore giocatore = giocatori.get(i);
            posizioni[i] = String.valueOf(i + 1); // Posizione
            nomi[i] = giocatore.getNomeUtente(); // Nome del giocatore
            punteggi[i] = String.valueOf(giocatore.getPunteggio()); // Punteggio
        }

        // Imposta i dati 
        jList2.setListData(posizioni);
        jList1.setListData(nomi);
        jList3.setListData(punteggi);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel classificaTitolo;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JLabel nomeGiocatore;
    private javax.swing.JScrollPane nomeGiocatoreList;
    private javax.swing.JLabel posizione;
    private javax.swing.JScrollPane posizioneList;
    private javax.swing.JLabel punteggio;
    private javax.swing.JScrollPane puntiList;
    // End of variables declaration//GEN-END:variables
}
