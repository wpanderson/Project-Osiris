/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_ui;

import D5DataStructures.*;
import D5DataStructures.DraftClasses.Encounter;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Wes
 */
public class GeneratorUI extends javax.swing.JFrame {
    
    private Encounter.DIFFICULTY encounterDifficulty = Encounter.DIFFICULTY.EASY;
    private Encounter.Encounter_Type encounterType = Encounter.Encounter_Type.MIXED;
    private Item.Rarity itemRarity = Item.Rarity.COMMON;
    private Item.Type itemType = Item.Type.GENERIC;

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
        jScrollPane1 = new javax.swing.JScrollPane();
        itemJTextArea = new javax.swing.JTextArea();
        encounterTypeJlabel1 = new javax.swing.JLabel();
        rarityJComboBox = new javax.swing.JComboBox();
        encounterTypeJlabel2 = new javax.swing.JLabel();
        numberJComboBox = new javax.swing.JComboBox();
        encounterTypeJlabel3 = new javax.swing.JLabel();
        itemTypeJComboBox = new javax.swing.JComboBox();
        generateItemJButton = new javax.swing.JButton();
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

        itemJTextArea.setColumns(20);
        itemJTextArea.setRows(5);
        jScrollPane1.setViewportView(itemJTextArea);

        encounterTypeJlabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        encounterTypeJlabel1.setText("Rarity:");

        rarityJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COMMON", "UNCOMMON", "RARE", "VERY RARE", "LEGENDARY" }));
        rarityJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rarityJComboBoxActionPerformed(evt);
            }
        });

        encounterTypeJlabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        encounterTypeJlabel2.setText("Amount:");

        numberJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        encounterTypeJlabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        encounterTypeJlabel3.setText("Type:");

        itemTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GENERIC", "WEAPON", "SCROLL", "POTION", "ROD", "WONDROUS" }));
        itemTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTypeJComboBoxActionPerformed(evt);
            }
        });

        generateItemJButton.setText("Generate");
        generateItemJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateItemJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout itemJPanelLayout = new javax.swing.GroupLayout(itemJPanel);
        itemJPanel.setLayout(itemJPanelLayout);
        itemJPanelLayout.setHorizontalGroup(
            itemJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(itemJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(encounterTypeJlabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rarityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encounterTypeJlabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(encounterTypeJlabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numberJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(generateItemJButton)
                .addContainerGap())
        );
        itemJPanelLayout.setVerticalGroup(
            itemJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemJPanelLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(itemJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itemJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(encounterTypeJlabel3)
                        .addComponent(itemTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(itemJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(encounterTypeJlabel2)
                        .addComponent(numberJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(generateItemJButton))
                    .addGroup(itemJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(encounterTypeJlabel1)
                        .addComponent(rarityJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        //Generator generate = new Generator();
        Encounter encounter = new Encounter();
        encounter = Generator.Generate_Encounter(MainGUI.DATABASE.getEnemyList(),
                MainGUI.DATABASE.getPlayerList(), encounterDifficulty,
                Encounter.LOCATION.NULL, encounterType);
        
        if(encounter != null)
        {
            StringBuilder d = new StringBuilder();
            for(Enemy enemy : encounter.getEnemies())
            {
                d.append(" Name:" + enemy.getName() + "\n\t Experience:" + enemy.getExpValue() + "\n\t Challenge Rating:" + enemy.getChallenge() + "\n");
            }
            encounterJTextArea.setText(d.toString());
        }
        else
        {
            JOptionPane.showMessageDialog(amountComboBox, "No encounter found. :(");
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
                break;
            case 1:
                encounterType = Encounter.Encounter_Type.SMALLSWARM;
                break;
            case 2:
                encounterType = Encounter.Encounter_Type.SWARM;
                break;
            case 3:
                encounterType = Encounter.Encounter_Type.BOSS;
                break;
            case 4:
                encounterType = Encounter.Encounter_Type.SINGLEBOSS;
                break;
        }
    }//GEN-LAST:event_encounterTypeJComboBoxActionPerformed

    private void rarityJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rarityJComboBoxActionPerformed
        
        switch(rarityJComboBox.getSelectedIndex())
        {
            case 0:
                itemRarity = Item.Rarity.COMMON;
                break;
            case 1:
                itemRarity = Item.Rarity.UNCOMMON;
                break;
            case 2:
                itemRarity = Item.Rarity.RARE;
                break;
            case 3:
                itemRarity = Item.Rarity.VERY_RARE;
                break;
            case 4:
                itemRarity = Item.Rarity.LEGENDARY;
                break;
        }
    }//GEN-LAST:event_rarityJComboBoxActionPerformed

    private void itemTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTypeJComboBoxActionPerformed

        switch(itemTypeJComboBox.getSelectedIndex())
        {
            case 0:
                itemType = Item.Type.GENERIC;
                break;
            case 1:
                itemType = Item.Type.WEAPON;
                break;
            case 2:
                itemType = Item.Type.SCROLL;
                break;
            case 3:
                itemType = Item.Type.POTION;
                break;
            case 4:
                itemType = Item.Type.ROD;
                break;
            case 5:
                itemType = Item.Type.WONDROUS;
        }
    }//GEN-LAST:event_itemTypeJComboBoxActionPerformed

    private void generateItemJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateItemJButtonActionPerformed
        ArrayList<Item.Type> item_type = new ArrayList<Item.Type>();
        
        item_type.add(itemType);
        
        ArrayList<Item> generated_items = Generator.Generate_Magic_Items(itemRarity, numberJComboBox.getSelectedIndex()+1, item_type, MainGUI.DATABASE.getItemList());
        


                
            
            
        StringBuilder d = new StringBuilder();
        for (Item i: generated_items){
            d.append(i.toString() + "\n");
        }
        itemJTextArea.setText(d.toString());
        
        
    }//GEN-LAST:event_generateItemJButtonActionPerformed

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
    private javax.swing.JLabel encounterTypeJlabel1;
    private javax.swing.JLabel encounterTypeJlabel2;
    private javax.swing.JLabel encounterTypeJlabel3;
    private javax.swing.JLabel environmentJLabel;
    private javax.swing.JPanel eventJPanel;
    private javax.swing.JButton generateItemJButton;
    private javax.swing.JPanel generatorJPanel;
    private javax.swing.JPanel itemJPanel;
    private javax.swing.JTextArea itemJTextArea;
    private javax.swing.JComboBox itemTypeJComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel locationJPanel;
    private javax.swing.JComboBox numberJComboBox;
    private javax.swing.JComboBox rarityJComboBox;
    private javax.swing.JLabel titleJlabel;
    private javax.swing.JComboBox typeComboBox;
    private javax.swing.JLabel typeJLabel;
    // End of variables declaration//GEN-END:variables
}
