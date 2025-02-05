/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package quizgame.UI;

/**
 *
 * @author Andrea.casamatta
 */
public class Impostazioni extends javax.swing.JPanel {

    private String diff = "Facile";
    private String cat = "Sport";

    public Impostazioni() {
        this.diff = diff;
        this.cat = cat;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diffGroup = new javax.swing.ButtonGroup();
        catGroup = new javax.swing.ButtonGroup();
        facile = new javax.swing.JRadioButton();
        medio = new javax.swing.JRadioButton();
        difficile = new javax.swing.JRadioButton();
        storia = new javax.swing.JRadioButton();
        sport = new javax.swing.JRadioButton();
        matScolastiche = new javax.swing.JRadioButton();
        lingue = new javax.swing.JRadioButton();
        geografia = new javax.swing.JRadioButton();
        selezDiffTesto = new javax.swing.JLabel();
        selezcatTesto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 153, 255));
        setPreferredSize(new java.awt.Dimension(793, 443));

        facile.setBackground(new java.awt.Color(51, 153, 0));
        diffGroup.add(facile);
        facile.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        facile.setForeground(new java.awt.Color(255, 255, 255));
        facile.setSelected(true);
        facile.setText("FACILE");
        facile.setToolTipText("");
        facile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        facile.setBorderPainted(true);
        facile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facile.setOpaque(true);
        facile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facileActionPerformed(evt);
            }
        });

        medio.setBackground(new java.awt.Color(255, 153, 51));
        diffGroup.add(medio);
        medio.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        medio.setForeground(new java.awt.Color(255, 255, 255));
        medio.setText("MEDIO");
        medio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        medio.setBorderPainted(true);
        medio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        medio.setOpaque(true);
        medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medioActionPerformed(evt);
            }
        });

        difficile.setBackground(new java.awt.Color(204, 0, 0));
        diffGroup.add(difficile);
        difficile.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        difficile.setForeground(new java.awt.Color(255, 255, 255));
        difficile.setText("DIFFICILE");
        difficile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        difficile.setBorderPainted(true);
        difficile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        difficile.setOpaque(true);
        difficile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficileActionPerformed(evt);
            }
        });

        catGroup.add(storia);
        storia.setText("STORIA");
        storia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storiaActionPerformed(evt);
            }
        });

        catGroup.add(sport);
        sport.setSelected(true);
        sport.setText("SPORT");
        sport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportActionPerformed(evt);
            }
        });

        catGroup.add(matScolastiche);
        matScolastiche.setText("MATERIE SCOLASTICHE");
        matScolastiche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matScolasticheActionPerformed(evt);
            }
        });

        catGroup.add(lingue);
        lingue.setText("LINGUE");
        lingue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lingueActionPerformed(evt);
            }
        });

        catGroup.add(geografia);
        geografia.setText("GEOGRAFIA");
        geografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geografiaActionPerformed(evt);
            }
        });

        selezDiffTesto.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        selezDiffTesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selezDiffTesto.setText("SELEZIONA DIFFICOLTÀ");

        selezcatTesto.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        selezcatTesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selezcatTesto.setText("SELEZIONA CATEGORIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(storia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(matScolastiche)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(geografia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lingue))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(facile, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(medio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(difficile, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(selezDiffTesto))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(selezcatTesto)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(selezDiffTesto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(facile, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(difficile, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(medio, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                .addGap(76, 76, 76)
                .addComponent(selezcatTesto)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lingue)
                    .addComponent(geografia)
                    .addComponent(sport)
                    .addComponent(matScolastiche)
                    .addComponent(storia))
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void facileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facileActionPerformed
        diff = "Facile";
    }//GEN-LAST:event_facileActionPerformed

    private void medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medioActionPerformed
        diff = "Medio";
    }//GEN-LAST:event_medioActionPerformed

    private void difficileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficileActionPerformed
        diff = "Difficile";
    }//GEN-LAST:event_difficileActionPerformed

    private void storiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storiaActionPerformed
        cat = "Storia";
    }//GEN-LAST:event_storiaActionPerformed

    private void matScolasticheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matScolasticheActionPerformed
        cat = "Materie scolastiche";
    }//GEN-LAST:event_matScolasticheActionPerformed

    private void sportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportActionPerformed
        cat = "Sport";
    }//GEN-LAST:event_sportActionPerformed

    private void geografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geografiaActionPerformed
        cat = "Geografia";
    }//GEN-LAST:event_geografiaActionPerformed

    private void lingueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lingueActionPerformed
        cat = "Lingue";
    }//GEN-LAST:event_lingueActionPerformed
    //metodo che ritorna la difficoltà
    public String getDifficolta() {
        return diff;
    }
    //metodo che ritorna la categoria
    public String getCategoria() {
        return cat;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup catGroup;
    private javax.swing.ButtonGroup diffGroup;
    private javax.swing.JRadioButton difficile;
    private javax.swing.JRadioButton facile;
    private javax.swing.JRadioButton geografia;
    private javax.swing.JRadioButton lingue;
    private javax.swing.JRadioButton matScolastiche;
    private javax.swing.JRadioButton medio;
    private javax.swing.JLabel selezDiffTesto;
    private javax.swing.JLabel selezcatTesto;
    private javax.swing.JRadioButton sport;
    private javax.swing.JRadioButton storia;
    // End of variables declaration//GEN-END:variables
}
