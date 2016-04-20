/**
 * Project Osiris
 * Group Members: Weston Anderson, Charles, Ryan, Michel, Brian, Herman
 */
package main_ui;

/**
 *
 * @author Weston Anderson
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
    }

    /**
     * Netbeans created objects.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainToolBar = new javax.swing.JToolBar();
        backButton = new javax.swing.JButton();
        forwardButton = new javax.swing.JButton();
        pagesScrollPane = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        pagesList = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mainMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        databasesMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        generatorMenu = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        generatorMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dungeon Master Companion");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        mainToolBar.setBorder(null);
        mainToolBar.setFloatable(false);
        mainToolBar.setRollover(true);

        backButton.setText("<");
        backButton.setFocusable(false);
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        mainToolBar.add(backButton);

        forwardButton.setText(">");
        forwardButton.setFocusable(false);
        forwardButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        forwardButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        forwardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardButtonActionPerformed(evt);
            }
        });
        mainToolBar.add(forwardButton);

        pagesList.setBackground(new java.awt.Color(77, 67, 67));
        pagesList.setForeground(new java.awt.Color(255, 255, 255));
        pagesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Home", "Players", "Generators", "Stuff", "Other Things", "Other Stuff", "These are tabs" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(pagesList);

        pagesScrollPane.setViewportView(jScrollPane2);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 84)); // NOI18N
        jLabel1.setText("D.R.A.G.O.N.S.");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new java.awt.GridBagConstraints());

        tabPanel.setBackground(new java.awt.Color(102, 102, 102));

        welcomeLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        welcomeLabel.setText("Welcome to version 1.0 of D.R.A.G.O.N.S");
        welcomeLabel.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wes\\Documents\\CWU Stuff\\Software Engineering\\Project Osiris\\Project Osiris\\smaller.jpg")); // NOI18N

        javax.swing.GroupLayout tabPanelLayout = new javax.swing.GroupLayout(tabPanel);
        tabPanel.setLayout(tabPanelLayout);
        tabPanelLayout.setHorizontalGroup(
            tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        tabPanelLayout.setVerticalGroup(
            tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        jMenuItem1.setMnemonic('n');
        jMenuItem1.setText("New Database");
        jMenuItem1.setToolTipText("");
        fileMenu.add(jMenuItem1);

        jMenuItem8.setMnemonic('o');
        jMenuItem8.setText("Open");
        fileMenu.add(jMenuItem8);

        mainMenuBar.add(fileMenu);

        viewMenu.setMnemonic('v');
        viewMenu.setText("View");

        databasesMenuItem.setMnemonic('d');
        databasesMenuItem.setText("Databases");
        databasesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databasesMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(databasesMenuItem);

        mainMenuBar.add(viewMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");
        mainMenuBar.add(editMenu);

        generatorMenu.setMnemonic('g');
        generatorMenu.setLabel("Generators");

        jMenuItem3.setMnemonic('e');
        jMenuItem3.setText("Encounter");
        generatorMenu.add(jMenuItem3);

        jMenuItem4.setMnemonic('i');
        jMenuItem4.setText("Item");
        generatorMenu.add(jMenuItem4);

        jMenuItem5.setMnemonic('e');
        jMenuItem5.setText("Enemy");
        generatorMenu.add(jMenuItem5);

        jMenuItem6.setMnemonic('l');
        jMenuItem6.setText("Location");
        generatorMenu.add(jMenuItem6);

        jMenuItem7.setMnemonic('n');
        jMenuItem7.setText("NPC");
        generatorMenu.add(jMenuItem7);

        generatorMenuItem.setText("Generator");
        generatorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatorMenuItemActionPerformed(evt);
            }
        });
        generatorMenu.add(generatorMenuItem);

        mainMenuBar.add(generatorMenu);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pagesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(tabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pagesScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Possibly implement this. We'll see.
     * @param evt 
     */
    private void forwardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardButtonActionPerformed

    }//GEN-LAST:event_forwardButtonActionPerformed
    /**
     * When clicked opens the GeneratorUI.java to view the different generators.
     * @param evt 
     */
    private void generatorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatorMenuItemActionPerformed
        GeneratorUI generator = new GeneratorUI();
        generator.setVisible(true);
    }//GEN-LAST:event_generatorMenuItemActionPerformed
    /**
     * When clicked opens the DatabaseViewer.java
     * @param evt 
     */
    private void databasesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databasesMenuItemActionPerformed
        DatabaseViewerUI databaseViewer = new DatabaseViewerUI();
        databaseViewer.setVisible(true);
    }//GEN-LAST:event_databasesMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JMenuItem databasesMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton forwardButton;
    private javax.swing.JMenu generatorMenu;
    private javax.swing.JMenuItem generatorMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JToolBar mainToolBar;
    private javax.swing.JList pagesList;
    private javax.swing.JScrollPane pagesScrollPane;
    private javax.swing.JPanel tabPanel;
    private javax.swing.JMenu viewMenu;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
