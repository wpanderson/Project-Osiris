/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_ui;

import D5DataStructures.*;
import D5DataStructures.DraftClasses.Encounter;
import java.awt.CardLayout;

/**
 *
 * @author Wes
 */
public class GeneratorUI extends javax.swing.JFrame {
    
    private Encounter.DIFFICULTY encounterDifficulty = Encounter.DIFFICULTY.EASY;
    private Encounter.Encounter_Type encounterType = Encounter.Encounter_Type.MIXED;

    /**
     * Creates new form GeneratorsGUI
     */
    public GeneratorUI() {
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

        titleJlabel = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox();
        typeJLabel = new javax.swing.JLabel();
        generatorJPanel = new javax.swing.JPanel();
        encounterJPanel = new javax.swing.JPanel();
        difficultyJLabel = new javax.swing.JLabel();
        difficultyComboBox = new javax.swing.JComboBox();
        environmentJLabel = new javax.swing.JLabel();
        encounterTypeJComboBox = new javax.swing.JComboBox();
        encounterGeneratorJButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        encounterJTextArea = new javax.swing.JTextArea();
        eventJPanel = new javax.swing.JPanel();
        encounterTypeJlabel = new javax.swing.JLabel();
        encounterTypeComboBox = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        amountJLabel = new javax.swing.JLabel();
        amountComboBox = new javax.swing.JComboBox();
        itemJPanel = new javax.swing.JPanel();
        itemScrollPane = new javax.swing.JScrollPane();
        itemJTable = new javax.swing.JTable();
        locationJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("D.R.A.G.O.N.S. Generators");
        setResizable(false);

        titleJlabel.setFont(new java.awt.Font("Calibri", 0, 84)); // NOI18N
        titleJlabel.setText("Generators");

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Encounter", "Event", "Item" }));
        typeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboBoxActionPerformed(evt);
            }
        });

        typeJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        typeJLabel.setText("Type:");

        generatorJPanel.setBackground(new java.awt.Color(0, 153, 153));
        generatorJPanel.setLayout(new java.awt.CardLayout(10, 10));

        difficultyJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        difficultyJLabel.setText("Difficulty:");

        difficultyComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Easy", "Moderate", "Hard", "Extreme" }));
        difficultyComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultyComboBoxActionPerformed(evt);
            }
        });

        environmentJLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        environmentJLabel.setText("Encounter Type:");

        encounterTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mixed", "Small Swarm", "Swarm", "Boss", "Single Boss" }));
        encounterTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encounterTypeJComboBoxActionPerformed(evt);
            }
        });

        encounterGeneratorJButton.setText("Generate");
        encounterGeneratorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encounterGeneratorJButtonActionPerformed(evt);
            }
        });

        encounterJTextArea.setEditable(false);
        encounterJTextArea.setColumns(20);
        encounterJTextArea.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        encounterJTextArea.setRows(5);
        jScrollPane3.setViewportView(encounterJTextArea);

        javax.swing.GroupLayout encounterJPanelLayout = new javax.swing.GroupLayout(encounterJPanel);
        encounterJPanel.setLayout(encounterJPanelLayout);
        encounterJPanelLayout.setHorizontalGroup(
            encounterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encounterJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(encounterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(encounterJPanelLayout.createSequentialGroup()
                        .addComponent(difficultyJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(difficultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(environmentJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(encounterTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                        .addComponent(encounterGeneratorJButton)
                        .addContainerGap())))
        );
        encounterJPanelLayout.setVerticalGroup(
            encounterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encounterJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(encounterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(encounterJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(difficultyJLabel)
                        .addComponent(difficultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(environmentJLabel)
                        .addComponent(encounterTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(encounterGeneratorJButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );

        generatorJPanel.add(encounterJPanel, "encounterCard");

        encounterTypeJlabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        encounterTypeJlabel.setText("Type:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        amountJLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        amountJLabel.setText("How Many:");

        amountComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "5", "10" }));

        javax.swing.GroupLayout eventJPanelLayout = new javax.swing.GroupLayout(eventJPanel);
        eventJPanel.setLayout(eventJPanelLayout);
        eventJPanelLayout.setHorizontalGroup(
            eventJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eventJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(eventJPanelLayout.createSequentialGroup()
                        .addComponent(encounterTypeJlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(encounterTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amountJLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amountComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 422, Short.MAX_VALUE)))
                .addContainerGap())
        );
        eventJPanelLayout.setVerticalGroup(
            eventJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(eventJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encounterTypeJlabel)
                    .addComponent(encounterTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountJLabel)
                    .addComponent(amountComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );

        generatorJPanel.add(eventJPanel, "eventCard");

        itemJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        itemScrollPane.setViewportView(itemJTable);

        javax.swing.GroupLayout itemJPanelLayout = new javax.swing.GroupLayout(itemJPanel);
        itemJPanel.setLayout(itemJPanelLayout);
        itemJPanelLayout.setHorizontalGroup(
            itemJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                .addContainerGap())
        );
        itemJPanelLayout.setVerticalGroup(
            itemJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemJPanelLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(itemScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        generatorJPanel.add(itemJPanel, "itemCard");

        javax.swing.GroupLayout locationJPanelLayout = new javax.swing.GroupLayout(locationJPanel);
        locationJPanel.setLayout(locationJPanelLayout);
        locationJPanelLayout.setHorizontalGroup(
            locationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        locationJPanelLayout.setVerticalGroup(
            locationJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        generatorJPanel.add(locationJPanel, "locationCard");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(generatorJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(typeJLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeJLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generatorJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Flips generatorJPanel when another item is selected in the comboBox.
     * @param evt 
     */
    private void typeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboBoxActionPerformed
        
        CardLayout card = (CardLayout)generatorJPanel.getLayout();
        
        if(typeComboBox.getSelectedItem() == "Encounter")
        {
            card.show(generatorJPanel, "encounterCard");
        }
        else if(typeComboBox.getSelectedItem() == "Event")
        {
            card.show(generatorJPanel, "eventCard");
        }
        else if(typeComboBox.getSelectedItem() == "Item")
        {
            card.show(generatorJPanel, "itemCard");
        }
        else if(typeComboBox.getSelectedItem() == "Location")
        {
            card.show(generatorJPanel, "locationCard");
        }
    }//GEN-LAST:event_typeComboBoxActionPerformed
    /**
     * Calls Generator.java to get get a random encounter and populate the 
     * list with said encounter.
     * @param evt 
     */
    private void encounterGeneratorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encounterGeneratorJButtonActionPerformed
        Generator generate = new Generator();
        Encounter encounter = new Encounter();
        encounter = Generator.Generate_Encounter(MainGUI.DATABASE.getEnemyList(),
                MainGUI.DATABASE.getPlayerList(), encounterDifficulty,
                Encounter.LOCATION.NULL, encounterType);
        
        if(encounter != null)
        {
            StringBuilder d = new StringBuilder();
            for(Enemy enemy : encounter.getEnemies())
            {
                d.append(" Name:" + enemy.getName() + " Experience:" + enemy.getExpValue() + " Challenge Rating:" + enemy.getChallenge() + "\n");
            }
            encounterJTextArea.setText(d.toString());
        }
        
    }//GEN-LAST:event_encounterGeneratorJButtonActionPerformed
    /**
     * 
     * @param evt 
     */
    private void difficultyComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultyComboBoxActionPerformed
        switch(difficultyComboBox.getSelectedIndex())
        {
            case 0:
                encounterDifficulty = Encounter.DIFFICULTY.EASY;
                break;
            case 1:
                encounterDifficulty = Encounter.DIFFICULTY.MEDIUM;
                break;
            case 2:
                encounterDifficulty = Encounter.DIFFICULTY.HARD;
                break;
            case 3:
                encounterDifficulty = Encounter.DIFFICULTY.DEADLY;
                break;
        }
    }//GEN-LAST:event_difficultyComboBoxActionPerformed

    private void encounterTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encounterTypeJComboBoxActionPerformed
        switch(encounterTypeJComboBox.getSelectedIndex())
        {
            case 0:
                encounterType = Encounter.Encounter_Type.MIXED;
            case 1:
                encounterType = Encounter.Encounter_Type.SMALLSWARM;
            case 2:
                encounterType = Encounter.Encounter_Type.SWARM;
            case 3:
                encounterType = Encounter.Encounter_Type.BOSS;
            case 4:
                encounterType = Encounter.Encounter_Type.SINGLEBOSS;
        }
    }//GEN-LAST:event_encounterTypeJComboBoxActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GeneratorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneratorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneratorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneratorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneratorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox amountComboBox;
    private javax.swing.JLabel amountJLabel;
    private javax.swing.JComboBox difficultyComboBox;
    private javax.swing.JLabel difficultyJLabel;
    private javax.swing.JButton encounterGeneratorJButton;
    private javax.swing.JPanel encounterJPanel;
    private javax.swing.JTextArea encounterJTextArea;
    private javax.swing.JComboBox encounterTypeComboBox;
    private javax.swing.JComboBox encounterTypeJComboBox;
    private javax.swing.JLabel encounterTypeJlabel;
    private javax.swing.JLabel environmentJLabel;
    private javax.swing.JPanel eventJPanel;
    private javax.swing.JPanel generatorJPanel;
    private javax.swing.JPanel itemJPanel;
    private javax.swing.JTable itemJTable;
    private javax.swing.JScrollPane itemScrollPane;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel locationJPanel;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JComboBox typeComboBox;
    private javax.swing.JLabel typeJLabel;
    // End of variables declaration//GEN-END:variables
}
