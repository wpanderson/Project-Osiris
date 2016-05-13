/**
 * Project Osiris
 * Group Members: Weston Anderson, Charles, Ryan, Michel, Brian, Herman
 */
package main_ui;

import D5DataStructures.*;
import java.awt.CardLayout;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Weston Anderson
 */
public class MainGUI extends javax.swing.JFrame {

    //Not functional just placeholders for what we will use in the future.
    //The idea is that some form of data structure will hold the values I will
    //grab to populate vaules in the fields. Most, if not all, values will be
    //strings These are the main lists that will
    //be needed. :)
    private ArrayList<Player> playerList = new ArrayList();
    private ArrayList<Entity> npcList = new ArrayList();
    private ArrayList<Enemy> enemyList = new ArrayList();
    //private ArrayList<Location> locationList = new ArrayList();
    
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
        titleJPanel = new javax.swing.JPanel();
        titleJLabel = new javax.swing.JLabel();
        tabPanel = new javax.swing.JPanel();
        homeJPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        welcomeImageLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        playersJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        playerNotesJTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        attributesJPanel = new javax.swing.JPanel();
        strengthJLabel = new javax.swing.JLabel();
        strengthJTextField = new javax.swing.JTextField();
        dexterityJLabel = new javax.swing.JLabel();
        dexterityJTextField = new javax.swing.JTextField();
        constitutionJLabel = new javax.swing.JLabel();
        constitutionJTextField = new javax.swing.JTextField();
        intelligenceJLabel = new javax.swing.JLabel();
        intelligenceJTextField = new javax.swing.JTextField();
        wisdomJLabel = new javax.swing.JLabel();
        wisdomJTextField = new javax.swing.JTextField();
        charismaJLabel = new javax.swing.JLabel();
        charismaJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        characterRaceJLabel = new javax.swing.JLabel();
        playerPBJLabel = new javax.swing.JLabel();
        skillsJScrollPane = new javax.swing.JScrollPane();
        skillsJTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        playerNameJLabel = new javax.swing.JLabel();
        editPlayerJCheckBox = new javax.swing.JCheckBox();
        allignmentJComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        characterNameJLabel = new javax.swing.JLabel();
        modifiersJPanel = new javax.swing.JPanel();
        strModJTextField = new javax.swing.JTextField();
        strModTempJSpinner = new javax.swing.JSpinner();
        dexModJTextField = new javax.swing.JTextField();
        dexModTempJSpinner = new javax.swing.JSpinner();
        conModJTextField = new javax.swing.JTextField();
        conModTempJSpinner = new javax.swing.JSpinner();
        intModJTextField = new javax.swing.JTextField();
        intModTempJSpinner = new javax.swing.JSpinner();
        wisModJTextField = new javax.swing.JTextField();
        wisModTempJSpinner = new javax.swing.JSpinner();
        charModJTextField = new javax.swing.JTextField();
        charModTempJSpinner = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        trackablesJPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        playerGoldJTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        playerArrowsJSpinner = new javax.swing.JSpinner();
        playerBoltsJSpinner = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        playerPlatinumJTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        playerCopperJTextField = new javax.swing.JTextField();
        playerSilverJTextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        playerItemsJPanel = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        addPlayerItemJButton = new javax.swing.JButton();
        removePlayerItemJButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        playerItemsJTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        playerWeaponsJTable = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        addPlayerWeaponJButton = new javax.swing.JButton();
        removePlayerWeaponJButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        playerSpellsJTable = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        addPlayerSpellJButton = new javax.swing.JButton();
        removePlayerSpellJButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        playerDefenceJPanel = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        playerTotalHPJLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        playerCurrentHPJLabel = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        savingThrowsJLabel = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        characterClassJLabel = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        playerLevelDownJButton = new javax.swing.JButton();
        playerLevelUpJButton = new javax.swing.JButton();
        npcJPanel = new javax.swing.JPanel();
        npcDetailsJPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        npcNameJLabel = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        npcClassJLabel = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        npcRaceJLabel = new javax.swing.JLabel();
        npcAlignmentJComboBox = new javax.swing.JComboBox();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        npcLocationJLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        npcNotesJTextArea = new javax.swing.JTextArea();
        npcItemsJPanel = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        addNPCItemJButton = new javax.swing.JButton();
        removeNPCItemJButton = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        npcItemsJTable = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        npcWeaponsJTable = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        addNPCWeaponJButton = new javax.swing.JButton();
        removeNPCWeaponJButton = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        npcSpellsJTable = new javax.swing.JTable();
        jLabel39 = new javax.swing.JLabel();
        addNPCSpellJButton = new javax.swing.JButton();
        removeNPCSpellJButton = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        trackablesJPanel1 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        playerGoldJTextField1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        playerArrowsJSpinner1 = new javax.swing.JSpinner();
        playerBoltsJSpinner1 = new javax.swing.JSpinner();
        jLabel43 = new javax.swing.JLabel();
        playerPlatinumJTextField1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        playerCopperJTextField1 = new javax.swing.JTextField();
        playerSilverJTextField1 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        attributesJPanel1 = new javax.swing.JPanel();
        strengthJLabel1 = new javax.swing.JLabel();
        strengthJTextField1 = new javax.swing.JTextField();
        dexterityJLabel1 = new javax.swing.JLabel();
        dexterityJTextField1 = new javax.swing.JTextField();
        constitutionJLabel1 = new javax.swing.JLabel();
        constitutionJTextField1 = new javax.swing.JTextField();
        intelligenceJLabel1 = new javax.swing.JLabel();
        intelligenceJTextField1 = new javax.swing.JTextField();
        wisdomJLabel1 = new javax.swing.JLabel();
        wisdomJTextField1 = new javax.swing.JTextField();
        charismaJLabel1 = new javax.swing.JLabel();
        charismaJTextField1 = new javax.swing.JTextField();
        modifiersJPanel1 = new javax.swing.JPanel();
        strModJTextField1 = new javax.swing.JTextField();
        strModTempJSpinner1 = new javax.swing.JSpinner();
        dexModJTextField1 = new javax.swing.JTextField();
        dexModTempJSpinner1 = new javax.swing.JSpinner();
        conModJTextField1 = new javax.swing.JTextField();
        conModTempJSpinner1 = new javax.swing.JSpinner();
        intModJTextField1 = new javax.swing.JTextField();
        intModTempJSpinner1 = new javax.swing.JSpinner();
        wisModJTextField1 = new javax.swing.JTextField();
        wisModTempJSpinner1 = new javax.swing.JSpinner();
        charModJTextField1 = new javax.swing.JTextField();
        charModTempJSpinner1 = new javax.swing.JSpinner();
        jLabel46 = new javax.swing.JLabel();
        playerPBJLabel1 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        skillsJScrollPane1 = new javax.swing.JScrollPane();
        skillsJTextArea1 = new javax.swing.JTextArea();
        playerDefenceJPanel1 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        npcTotalHPJLabel = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        npcSubHPJTextField = new javax.swing.JTextField();
        npcSubHPJButton = new javax.swing.JButton();
        npcAddHPJTextField = new javax.swing.JTextField();
        npcAddHPJButton = new javax.swing.JButton();
        npcCurrentHPJLabel = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        npcACJTextField = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        npcOtherACJTextField = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        npcSavingThrowsJLabel = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        locationsJPanel = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        locationNotesJTextArea = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        npcItemsJPanel1 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        addNPCItemJButton1 = new javax.swing.JButton();
        removeNPCItemJButton1 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        npcItemsJTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel56 = new javax.swing.JLabel();
        eventsNotesJPanel = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        eventNotesJTextArea = new javax.swing.JTextArea();
        jLabel57 = new javax.swing.JLabel();
        pagesJPanel = new javax.swing.JPanel();
        pagesJScrollPanel = new javax.swing.JScrollPane();
        pagesList = new javax.swing.JList();
        pageControlsJPanel = new javax.swing.JPanel();
        homeControlsJPanel = new javax.swing.JPanel();
        playerControlsJPanel = new javax.swing.JPanel();
        playersJScrollPanel = new javax.swing.JScrollPane();
        playersJList = new javax.swing.JList();
        newPlayerJButton = new javax.swing.JButton();
        removePlayerJButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        welcomeLabel2 = new javax.swing.JLabel();
        npcControlsJPanel = new javax.swing.JPanel();
        playersJScrollPanel1 = new javax.swing.JScrollPane();
        playersJList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        addNPCJButton = new javax.swing.JButton();
        removeNPCJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        welcomeLabel1 = new javax.swing.JLabel();
        locationControlsJPanel = new javax.swing.JPanel();
        playersJScrollPanel2 = new javax.swing.JScrollPane();
        locationsJList = new javax.swing.JList();
        newLocationJButton = new javax.swing.JButton();
        removeLocationJButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        welcomeLabel3 = new javax.swing.JLabel();
        eventControlsJPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        welcomeLabel4 = new javax.swing.JLabel();
        mainMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        databasesMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        generatorMenu = new javax.swing.JMenu();
        generatorMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dungeon Master Companion");
        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(mainToolBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1356, 25));

        titleJPanel.setLayout(new java.awt.GridBagLayout());

        titleJLabel.setFont(new java.awt.Font("Calibri", 0, 84)); // NOI18N
        titleJLabel.setText("D.R.A.G.O.N.S.");
        titleJLabel.setToolTipText("");
        titleJPanel.add(titleJLabel, new java.awt.GridBagConstraints());

        getContentPane().add(titleJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 31, 653, -1));

        tabPanel.setBackground(new java.awt.Color(102, 102, 102));
        tabPanel.setLayout(new java.awt.CardLayout());

        homeJPanel.setForeground(new java.awt.Color(60, 63, 65));

        welcomeLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        welcomeLabel.setText("Welcome to version 1.0 of D.R.A.G.O.N.S");
        welcomeLabel.setToolTipText("");

        welcomeImageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wes\\Documents\\CWU Stuff\\Software Engineering\\Project Osiris\\Project Osiris\\smaller.jpg")); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wes\\Documents\\CWU Stuff\\Software Engineering\\Project Osiris\\Project Osiris\\bruh.jpg")); // NOI18N

        javax.swing.GroupLayout homeJPanelLayout = new javax.swing.GroupLayout(homeJPanel);
        homeJPanel.setLayout(homeJPanelLayout);
        homeJPanelLayout.setHorizontalGroup(
            homeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcomeImageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(439, 439, 439))
        );
        homeJPanelLayout.setVerticalGroup(
            homeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeJPanelLayout.createSequentialGroup()
                .addGroup(homeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(welcomeImageLabel))
                    .addGroup(homeJPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel9)))
                .addContainerGap())
        );

        tabPanel.add(homeJPanel, "homeCard");

        playersJPanel.setBackground(new java.awt.Color(204, 204, 204));
        playersJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Player Notes:");
        playersJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        playerNotesJTextArea.setEditable(false);
        playerNotesJTextArea.setBackground(new java.awt.Color(255, 255, 255));
        playerNotesJTextArea.setColumns(20);
        playerNotesJTextArea.setRows(5);
        playerNotesJTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(playerNotesJTextArea);

        playersJPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 370, 490));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Attributes:");
        playersJPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 6, -1, -1));

        attributesJPanel.setBackground(new java.awt.Color(204, 204, 204));
        attributesJPanel.setToolTipText("");
        attributesJPanel.setLayout(new java.awt.GridLayout(6, 3));

        strengthJLabel.setForeground(new java.awt.Color(0, 0, 0));
        strengthJLabel.setText("Strength:");
        attributesJPanel.add(strengthJLabel);

        strengthJTextField.setEditable(false);
        strengthJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        strengthJTextField.setText("10");
        strengthJTextField.setToolTipText("(Athletics)");
        attributesJPanel.add(strengthJTextField);

        dexterityJLabel.setForeground(new java.awt.Color(0, 0, 0));
        dexterityJLabel.setText("Dexterity:");
        attributesJPanel.add(dexterityJLabel);

        dexterityJTextField.setEditable(false);
        dexterityJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dexterityJTextField.setText("10");
        dexterityJTextField.setToolTipText("(Acrobatics, Stealth)");
        attributesJPanel.add(dexterityJTextField);

        constitutionJLabel.setForeground(new java.awt.Color(0, 0, 0));
        constitutionJLabel.setText("Constitution:");
        attributesJPanel.add(constitutionJLabel);

        constitutionJTextField.setEditable(false);
        constitutionJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        constitutionJTextField.setText("10");
        constitutionJTextField.setToolTipText("");
        attributesJPanel.add(constitutionJTextField);

        intelligenceJLabel.setForeground(new java.awt.Color(0, 0, 0));
        intelligenceJLabel.setText("Intelligence:");
        attributesJPanel.add(intelligenceJLabel);

        intelligenceJTextField.setEditable(false);
        intelligenceJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        intelligenceJTextField.setText("10");
        intelligenceJTextField.setToolTipText("(Arcana, History, Investigation, Nature, Religion)");
        attributesJPanel.add(intelligenceJTextField);

        wisdomJLabel.setForeground(new java.awt.Color(0, 0, 0));
        wisdomJLabel.setText("Wisdom:");
        attributesJPanel.add(wisdomJLabel);

        wisdomJTextField.setEditable(false);
        wisdomJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        wisdomJTextField.setText("10");
        wisdomJTextField.setToolTipText("(Animal Handling, Insight, Medicine, Perception, Survival)");
        attributesJPanel.add(wisdomJTextField);

        charismaJLabel.setForeground(new java.awt.Color(0, 0, 0));
        charismaJLabel.setText("Charisma:");
        attributesJPanel.add(charismaJLabel);

        charismaJTextField.setEditable(false);
        charismaJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        charismaJTextField.setText("10");
        charismaJTextField.setToolTipText("(Deception, Intimidation, Performance)");
        attributesJPanel.add(charismaJTextField);

        playersJPanel.add(attributesJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 31, 144, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("XXXX");
        playersJPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        characterRaceJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        characterRaceJLabel.setForeground(new java.awt.Color(0, 0, 0));
        characterRaceJLabel.setText("CHARACTERS_RACE");
        playersJPanel.add(characterRaceJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        playerPBJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        playerPBJLabel.setForeground(new java.awt.Color(0, 0, 0));
        playerPBJLabel.setText("+0");
        playerPBJLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playersJPanel.add(playerPBJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        skillsJTextArea.setEditable(false);
        skillsJTextArea.setBackground(new java.awt.Color(255, 255, 255));
        skillsJTextArea.setColumns(20);
        skillsJTextArea.setRows(5);
        skillsJTextArea.setWrapStyleWord(true);
        skillsJScrollPane.setViewportView(skillsJTextArea);

        playersJPanel.add(skillsJScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 280, 320));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Player Name:");
        playersJPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        playerNameJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        playerNameJLabel.setForeground(new java.awt.Color(0, 0, 0));
        playerNameJLabel.setText("PLAYER_NAME_HERE");
        playersJPanel.add(playerNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        editPlayerJCheckBox.setText("Edit Player");
        editPlayerJCheckBox.setToolTipText("Click to enable/disable: (attributes, notes, and skills");
        editPlayerJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPlayerJCheckBoxActionPerformed(evt);
            }
        });
        playersJPanel.add(editPlayerJCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        allignmentJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lawful good", "Neutral good", "Chaotic good", "Lawful neutral", "Neutral", "Chaotic neutral", "Lawful evil", "Neutral evil", "Chaotic evil" }));
        playersJPanel.add(allignmentJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 143, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Character Name:");
        playersJPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        characterNameJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        characterNameJLabel.setForeground(new java.awt.Color(0, 0, 0));
        characterNameJLabel.setText("CHARACTER_NAME_HERE");
        playersJPanel.add(characterNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        modifiersJPanel.setBackground(new java.awt.Color(51, 51, 51));
        modifiersJPanel.setLayout(new java.awt.GridLayout(6, 2));

        strModJTextField.setEditable(false);
        strModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        strModJTextField.setText("+0");
        modifiersJPanel.add(strModJTextField);

        strModTempJSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        strModTempJSpinner.setToolTipText("Temporary attribute modifier.");
        strModTempJSpinner.setEditor(new javax.swing.JSpinner.NumberEditor(strModTempJSpinner, ""));
        modifiersJPanel.add(strModTempJSpinner);

        dexModJTextField.setEditable(false);
        dexModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dexModJTextField.setText("+0");
        modifiersJPanel.add(dexModJTextField);

        dexModTempJSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        dexModTempJSpinner.setToolTipText("Temporary attribute modifier.");
        modifiersJPanel.add(dexModTempJSpinner);

        conModJTextField.setEditable(false);
        conModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        conModJTextField.setText("+0");
        modifiersJPanel.add(conModJTextField);

        conModTempJSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        conModTempJSpinner.setToolTipText("Temporary attribute modifier.");
        modifiersJPanel.add(conModTempJSpinner);

        intModJTextField.setEditable(false);
        intModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        intModJTextField.setText("+0");
        modifiersJPanel.add(intModJTextField);

        intModTempJSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        intModTempJSpinner.setToolTipText("Temporary attribute modifier.");
        modifiersJPanel.add(intModTempJSpinner);

        wisModJTextField.setEditable(false);
        wisModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        wisModJTextField.setText("+0");
        modifiersJPanel.add(wisModJTextField);

        wisModTempJSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        wisModTempJSpinner.setToolTipText("Temporary attribute modifier.");
        modifiersJPanel.add(wisModTempJSpinner);

        charModJTextField.setEditable(false);
        charModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        charModJTextField.setText("+0");
        modifiersJPanel.add(charModJTextField);

        charModTempJSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        charModTempJSpinner.setToolTipText("Temporary attribute modifier.");
        modifiersJPanel.add(charModTempJSpinner);

        playersJPanel.add(modifiersJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 31, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Modifiers");
        playersJPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 6, 104, -1));

        trackablesJPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("G:");

        playerGoldJTextField.setBackground(new java.awt.Color(102, 102, 102));
        playerGoldJTextField.setText("0");
        playerGoldJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                playerGoldJTextFieldFocusLost(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Arrows:");

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Bolts:");

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("P:");

        playerPlatinumJTextField.setBackground(new java.awt.Color(102, 102, 102));
        playerPlatinumJTextField.setText("0");

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("C:");

        playerCopperJTextField.setBackground(new java.awt.Color(102, 102, 102));
        playerCopperJTextField.setText("0");

        playerSilverJTextField.setBackground(new java.awt.Color(102, 102, 102));
        playerSilverJTextField.setText("0");

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("S:");

        javax.swing.GroupLayout trackablesJPanelLayout = new javax.swing.GroupLayout(trackablesJPanel);
        trackablesJPanel.setLayout(trackablesJPanelLayout);
        trackablesJPanelLayout.setHorizontalGroup(
            trackablesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trackablesJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trackablesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(trackablesJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerPlatinumJTextField))
                    .addGroup(trackablesJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerGoldJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(trackablesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(trackablesJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerCopperJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(trackablesJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerSilverJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(trackablesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(trackablesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerArrowsJSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(playerBoltsJSpinner)))
        );
        trackablesJPanelLayout.setVerticalGroup(
            trackablesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, trackablesJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(trackablesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(trackablesJPanelLayout.createSequentialGroup()
                        .addGroup(trackablesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(playerArrowsJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(trackablesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(playerBoltsJSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(trackablesJPanelLayout.createSequentialGroup()
                        .addGroup(trackablesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(playerGoldJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(playerCopperJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(trackablesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(playerPlatinumJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(playerSilverJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(87, 87, 87))
        );

        playersJPanel.add(trackablesJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 280, 75));

        playerItemsJPanel.setBackground(new java.awt.Color(204, 204, 204));
        playerItemsJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Plot Items:");
        playerItemsJPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        addPlayerItemJButton.setText("Add Item");
        addPlayerItemJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlayerItemJButtonActionPerformed(evt);
            }
        });
        playerItemsJPanel.add(addPlayerItemJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        removePlayerItemJButton1.setText("Remove Selected Item");
        removePlayerItemJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePlayerItemJButton1ActionPerformed(evt);
            }
        });
        playerItemsJPanel.add(removePlayerItemJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        playerItemsJTable.setBackground(new java.awt.Color(255, 255, 255));
        playerItemsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item", "Type", "Value", "Weight", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        playerItemsJTable.setToolTipText("Double click cell to edit.");
        playerItemsJTable.setColumnSelectionAllowed(true);
        playerItemsJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(playerItemsJTable);
        playerItemsJTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        playerItemsJPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 640, 100));

        playerWeaponsJTable.setBackground(new java.awt.Color(255, 255, 255));
        playerWeaponsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Weapon", "Type", "Damage", "Critical Range", "Special"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        playerWeaponsJTable.setToolTipText("Double click cell to edit.");
        playerWeaponsJTable.setColumnSelectionAllowed(true);
        playerWeaponsJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(playerWeaponsJTable);
        playerWeaponsJTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        playerItemsJPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 640, 100));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Weapons:");
        playerItemsJPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        addPlayerWeaponJButton.setText("Add Weapon");
        addPlayerWeaponJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlayerWeaponJButtonActionPerformed(evt);
            }
        });
        playerItemsJPanel.add(addPlayerWeaponJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        removePlayerWeaponJButton.setText("Remove Selected Weapon");
        removePlayerWeaponJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePlayerWeaponJButtonActionPerformed(evt);
            }
        });
        playerItemsJPanel.add(removePlayerWeaponJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, -1));

        playerSpellsJTable.setBackground(new java.awt.Color(255, 255, 255));
        playerSpellsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Spell", "Type", "Damage", "Effect", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        playerSpellsJTable.setToolTipText("Double click cell to edit.");
        playerSpellsJTable.setColumnSelectionAllowed(true);
        playerSpellsJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(playerSpellsJTable);
        playerSpellsJTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        playerItemsJPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 640, 190));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Spells/Special Abilities:");
        playerItemsJPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        addPlayerSpellJButton.setText("Add Spell");
        addPlayerSpellJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPlayerSpellJButtonActionPerformed(evt);
            }
        });
        playerItemsJPanel.add(addPlayerSpellJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        removePlayerSpellJButton.setText("Remove Selected Spell");
        removePlayerSpellJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePlayerSpellJButtonActionPerformed(evt);
            }
        });
        playerItemsJPanel.add(removePlayerSpellJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        playersJPanel.add(playerItemsJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, 540));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Alignment:");
        playersJPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Hit Points (Total/Current):");

        playerTotalHPJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        playerTotalHPJLabel.setForeground(new java.awt.Color(0, 0, 0));
        playerTotalHPJLabel.setText("XX");
        playerTotalHPJLabel.setToolTipText("Total hitpoints of the player.");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("/");

        jTextField2.setText("0");

        jButton1.setText("Subtract from HP");

        jTextField3.setText("0");

        jButton2.setText("Add to HP");

        playerCurrentHPJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        playerCurrentHPJLabel.setForeground(new java.awt.Color(0, 0, 0));
        playerCurrentHPJLabel.setText("XX");
        playerCurrentHPJLabel.setToolTipText("Current hit points of the player.");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Armor Class:");

        jTextField1.setEditable(false);
        jTextField1.setText("13");
        jTextField1.setToolTipText("Base AC is 13 + Dexterity Modifier");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("+");

        jTextField4.setText("0");
        jTextField4.setToolTipText("Other AC not including Dexterity modifier");

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Saving Throws:");

        savingThrowsJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        savingThrowsJLabel.setForeground(new java.awt.Color(0, 0, 0));
        savingThrowsJLabel.setText("XXXXXXXXXX");

        javax.swing.GroupLayout playerDefenceJPanelLayout = new javax.swing.GroupLayout(playerDefenceJPanel);
        playerDefenceJPanel.setLayout(playerDefenceJPanelLayout);
        playerDefenceJPanelLayout.setHorizontalGroup(
            playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerDefenceJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerDefenceJPanelLayout.createSequentialGroup()
                        .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(jTextField3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(playerDefenceJPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(playerTotalHPJLabel)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(playerCurrentHPJLabel)))
                .addGap(28, 28, 28)
                .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerDefenceJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(playerDefenceJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(savingThrowsJLabel)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        playerDefenceJPanelLayout.setVerticalGroup(
            playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerDefenceJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(playerCurrentHPJLabel)
                        .addComponent(playerTotalHPJLabel)
                        .addComponent(jLabel25)))
                .addGap(8, 8, 8)
                .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(savingThrowsJLabel))
                    .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        playersJPanel.add(playerDefenceJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 640, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Class & Level:");
        playersJPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        characterClassJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        characterClassJLabel.setForeground(new java.awt.Color(0, 0, 0));
        characterClassJLabel.setText("CHARACTERS CLASS");
        playersJPanel.add(characterClassJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Skills:");
        playersJPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Proficiency Bonus:");
        playersJPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Race:");
        playersJPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("XP:");
        playersJPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        jButton3.setText("Add Experience");
        playersJPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        playerLevelDownJButton.setText("-");
        playerLevelDownJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerLevelDownJButtonActionPerformed(evt);
            }
        });
        playersJPanel.add(playerLevelDownJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 40, 20));

        playerLevelUpJButton.setText("+");
        playersJPanel.add(playerLevelUpJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 40, 20));

        tabPanel.add(playersJPanel, "playersCard");

        npcJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        npcDetailsJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Character Name:");
        npcDetailsJPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        npcNameJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        npcNameJLabel.setForeground(new java.awt.Color(0, 0, 0));
        npcNameJLabel.setText("CHARACTER_NAME_HERE");
        npcDetailsJPanel.add(npcNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Class & Level:");
        npcDetailsJPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        npcClassJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        npcClassJLabel.setForeground(new java.awt.Color(0, 0, 0));
        npcClassJLabel.setText("CHARACTERS CLASS");
        npcDetailsJPanel.add(npcClassJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Race:");
        npcDetailsJPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        npcRaceJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        npcRaceJLabel.setForeground(new java.awt.Color(0, 0, 0));
        npcRaceJLabel.setText("CHARACTERS_RACE");
        npcDetailsJPanel.add(npcRaceJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        npcAlignmentJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lawful good", "Neutral good", "Chaotic good", "Lawful neutral", "Neutral", "Chaotic neutral", "Lawful evil", "Neutral evil", "Chaotic evil" }));
        npcDetailsJPanel.add(npcAlignmentJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 143, -1));

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Type:");
        npcDetailsJPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("XXXXXXXX");
        npcDetailsJPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Alignment:");
        npcDetailsJPanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        npcJPanel.add(npcDetailsJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 130));

        npcLocationJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        npcLocationJLabel.setForeground(new java.awt.Color(0, 0, 0));
        npcLocationJLabel.setText("XXXXX");
        npcJPanel.add(npcLocationJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, -1));

        npcNotesJTextArea.setEditable(false);
        npcNotesJTextArea.setBackground(new java.awt.Color(255, 255, 255));
        npcNotesJTextArea.setColumns(20);
        npcNotesJTextArea.setRows(5);
        npcNotesJTextArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(npcNotesJTextArea);

        npcJPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 370, 490));

        npcItemsJPanel.setBackground(new java.awt.Color(204, 204, 204));
        npcItemsJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Items:");
        npcItemsJPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        addNPCItemJButton.setText("Add Item");
        addNPCItemJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNPCItemJButtonActionPerformed(evt);
            }
        });
        npcItemsJPanel.add(addNPCItemJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        removeNPCItemJButton.setText("Remove Selected Item");
        removeNPCItemJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNPCItemJButtonActionPerformed(evt);
            }
        });
        npcItemsJPanel.add(removeNPCItemJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        npcItemsJTable.setBackground(new java.awt.Color(255, 255, 255));
        npcItemsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item", "Type", "Value", "Weight", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        npcItemsJTable.setToolTipText("Double click cell to edit.");
        npcItemsJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(npcItemsJTable);
        npcItemsJTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        npcItemsJPanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 640, 180));

        npcWeaponsJTable.setBackground(new java.awt.Color(255, 255, 255));
        npcWeaponsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Weapon", "Type", "Damage", "Critical Range", "Special"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        npcWeaponsJTable.setToolTipText("Double click cell to edit.");
        npcWeaponsJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(npcWeaponsJTable);
        npcWeaponsJTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        npcItemsJPanel.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 640, 100));

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("Weapons:");
        npcItemsJPanel.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        addNPCWeaponJButton.setText("Add Weapon");
        addNPCWeaponJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNPCWeaponJButtonActionPerformed(evt);
            }
        });
        npcItemsJPanel.add(addNPCWeaponJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        removeNPCWeaponJButton.setText("Remove Selected Weapon");
        removeNPCWeaponJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNPCWeaponJButtonActionPerformed(evt);
            }
        });
        npcItemsJPanel.add(removeNPCWeaponJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, -1, -1));

        npcSpellsJTable.setBackground(new java.awt.Color(255, 255, 255));
        npcSpellsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Spell", "Type", "Damage", "Effect", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        npcSpellsJTable.setToolTipText("Double click cell to edit.");
        npcSpellsJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(npcSpellsJTable);
        npcSpellsJTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        npcItemsJPanel.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 640, 100));

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Spells/Special Abilities:");
        npcItemsJPanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        addNPCSpellJButton.setText("Add Spell");
        addNPCSpellJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNPCSpellJButtonActionPerformed(evt);
            }
        });
        npcItemsJPanel.add(addNPCSpellJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));

        removeNPCSpellJButton.setText("Remove Selected Spell");
        removeNPCSpellJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNPCSpellJButtonActionPerformed(evt);
            }
        });
        npcItemsJPanel.add(removeNPCSpellJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        npcJPanel.add(npcItemsJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, -1, 500));

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Inventory:");
        npcJPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

        trackablesJPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("G:");

        playerGoldJTextField1.setBackground(new java.awt.Color(102, 102, 102));
        playerGoldJTextField1.setText("0");
        playerGoldJTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                playerGoldJTextField1FocusLost(evt);
            }
        });

        jLabel41.setForeground(new java.awt.Color(0, 0, 0));
        jLabel41.setText("Arrows:");

        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Bolts:");

        jLabel43.setForeground(new java.awt.Color(0, 0, 0));
        jLabel43.setText("P:");

        playerPlatinumJTextField1.setBackground(new java.awt.Color(102, 102, 102));
        playerPlatinumJTextField1.setText("0");

        jLabel44.setForeground(new java.awt.Color(0, 0, 0));
        jLabel44.setText("C:");

        playerCopperJTextField1.setBackground(new java.awt.Color(102, 102, 102));
        playerCopperJTextField1.setText("0");

        playerSilverJTextField1.setBackground(new java.awt.Color(102, 102, 102));
        playerSilverJTextField1.setText("0");

        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("S:");

        javax.swing.GroupLayout trackablesJPanel1Layout = new javax.swing.GroupLayout(trackablesJPanel1);
        trackablesJPanel1.setLayout(trackablesJPanel1Layout);
        trackablesJPanel1Layout.setHorizontalGroup(
            trackablesJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trackablesJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trackablesJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(trackablesJPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerPlatinumJTextField1))
                    .addGroup(trackablesJPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerGoldJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(trackablesJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(trackablesJPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerCopperJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(trackablesJPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerSilverJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(trackablesJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(trackablesJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerArrowsJSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(playerBoltsJSpinner1)))
        );
        trackablesJPanel1Layout.setVerticalGroup(
            trackablesJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, trackablesJPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(trackablesJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(trackablesJPanel1Layout.createSequentialGroup()
                        .addGroup(trackablesJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(playerArrowsJSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(trackablesJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(playerBoltsJSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(trackablesJPanel1Layout.createSequentialGroup()
                        .addGroup(trackablesJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(playerGoldJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44)
                            .addComponent(playerCopperJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(trackablesJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(playerPlatinumJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45)
                            .addComponent(playerSilverJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(87, 87, 87))
        );

        npcJPanel.add(trackablesJPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 580, 280, 75));

        attributesJPanel1.setBackground(new java.awt.Color(204, 204, 204));
        attributesJPanel1.setToolTipText("");
        attributesJPanel1.setLayout(new java.awt.GridLayout(6, 3, 10, 0));

        strengthJLabel1.setForeground(new java.awt.Color(0, 0, 0));
        strengthJLabel1.setText("Strength:");
        attributesJPanel1.add(strengthJLabel1);

        strengthJTextField1.setEditable(false);
        strengthJTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        strengthJTextField1.setText("10");
        strengthJTextField1.setToolTipText("(Athletics)");
        attributesJPanel1.add(strengthJTextField1);

        dexterityJLabel1.setForeground(new java.awt.Color(0, 0, 0));
        dexterityJLabel1.setText("Dexterity:");
        attributesJPanel1.add(dexterityJLabel1);

        dexterityJTextField1.setEditable(false);
        dexterityJTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dexterityJTextField1.setText("10");
        dexterityJTextField1.setToolTipText("(Acrobatics, Stealth)");
        attributesJPanel1.add(dexterityJTextField1);

        constitutionJLabel1.setForeground(new java.awt.Color(0, 0, 0));
        constitutionJLabel1.setText("Constitution:");
        attributesJPanel1.add(constitutionJLabel1);

        constitutionJTextField1.setEditable(false);
        constitutionJTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        constitutionJTextField1.setText("10");
        constitutionJTextField1.setToolTipText("");
        attributesJPanel1.add(constitutionJTextField1);

        intelligenceJLabel1.setForeground(new java.awt.Color(0, 0, 0));
        intelligenceJLabel1.setText("Intelligence:");
        attributesJPanel1.add(intelligenceJLabel1);

        intelligenceJTextField1.setEditable(false);
        intelligenceJTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        intelligenceJTextField1.setText("10");
        intelligenceJTextField1.setToolTipText("(Arcana, History, Investigation, Nature, Religion)");
        attributesJPanel1.add(intelligenceJTextField1);

        wisdomJLabel1.setForeground(new java.awt.Color(0, 0, 0));
        wisdomJLabel1.setText("Wisdom:");
        attributesJPanel1.add(wisdomJLabel1);

        wisdomJTextField1.setEditable(false);
        wisdomJTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        wisdomJTextField1.setText("10");
        wisdomJTextField1.setToolTipText("(Animal Handling, Insight, Medicine, Perception, Survival)");
        attributesJPanel1.add(wisdomJTextField1);

        charismaJLabel1.setForeground(new java.awt.Color(0, 0, 0));
        charismaJLabel1.setText("Charisma:");
        attributesJPanel1.add(charismaJLabel1);

        charismaJTextField1.setEditable(false);
        charismaJTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        charismaJTextField1.setText("10");
        charismaJTextField1.setToolTipText("(Deception, Intimidation, Performance)");
        attributesJPanel1.add(charismaJTextField1);

        npcJPanel.add(attributesJPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 144, -1));

        modifiersJPanel1.setBackground(new java.awt.Color(51, 51, 51));
        modifiersJPanel1.setLayout(new java.awt.GridLayout(6, 2, 10, 0));

        strModJTextField1.setEditable(false);
        strModJTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        strModJTextField1.setText("+0");
        modifiersJPanel1.add(strModJTextField1);

        strModTempJSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        strModTempJSpinner1.setToolTipText("Temporary attribute modifier.");
        strModTempJSpinner1.setEditor(new javax.swing.JSpinner.NumberEditor(strModTempJSpinner1, ""));
        modifiersJPanel1.add(strModTempJSpinner1);

        dexModJTextField1.setEditable(false);
        dexModJTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dexModJTextField1.setText("+0");
        modifiersJPanel1.add(dexModJTextField1);

        dexModTempJSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        dexModTempJSpinner1.setToolTipText("Temporary attribute modifier.");
        modifiersJPanel1.add(dexModTempJSpinner1);

        conModJTextField1.setEditable(false);
        conModJTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        conModJTextField1.setText("+0");
        modifiersJPanel1.add(conModJTextField1);

        conModTempJSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        conModTempJSpinner1.setToolTipText("Temporary attribute modifier.");
        modifiersJPanel1.add(conModTempJSpinner1);

        intModJTextField1.setEditable(false);
        intModJTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        intModJTextField1.setText("+0");
        modifiersJPanel1.add(intModJTextField1);

        intModTempJSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        intModTempJSpinner1.setToolTipText("Temporary attribute modifier.");
        modifiersJPanel1.add(intModTempJSpinner1);

        wisModJTextField1.setEditable(false);
        wisModJTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        wisModJTextField1.setText("+0");
        modifiersJPanel1.add(wisModJTextField1);

        wisModTempJSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        wisModTempJSpinner1.setToolTipText("Temporary attribute modifier.");
        modifiersJPanel1.add(wisModTempJSpinner1);

        charModJTextField1.setEditable(false);
        charModJTextField1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        charModJTextField1.setText("+0");
        modifiersJPanel1.add(charModJTextField1);

        charModTempJSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        charModTempJSpinner1.setToolTipText("Temporary attribute modifier.");
        modifiersJPanel1.add(charModTempJSpinner1);

        npcJPanel.add(modifiersJPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, -1, -1));

        jLabel46.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 0, 0));
        jLabel46.setText("Proficiency Bonus:");
        npcJPanel.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        playerPBJLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        playerPBJLabel1.setForeground(new java.awt.Color(0, 0, 0));
        playerPBJLabel1.setText("+0");
        playerPBJLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        npcJPanel.add(playerPBJLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        jLabel47.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("Skills:");
        npcJPanel.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        skillsJTextArea1.setEditable(false);
        skillsJTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        skillsJTextArea1.setColumns(20);
        skillsJTextArea1.setRows(5);
        skillsJTextArea1.setWrapStyleWord(true);
        skillsJScrollPane1.setViewportView(skillsJTextArea1);

        npcJPanel.add(skillsJScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 280, 320));

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("Hit Points (Total/Current):");

        npcTotalHPJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        npcTotalHPJLabel.setForeground(new java.awt.Color(0, 0, 0));
        npcTotalHPJLabel.setText("XX");
        npcTotalHPJLabel.setToolTipText("Total hitpoints of the player.");

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("/");

        npcSubHPJTextField.setText("0");

        npcSubHPJButton.setText("Subtract from HP");

        npcAddHPJTextField.setText("0");

        npcAddHPJButton.setText("Add to HP");

        npcCurrentHPJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        npcCurrentHPJLabel.setForeground(new java.awt.Color(0, 0, 0));
        npcCurrentHPJLabel.setText("XX");
        npcCurrentHPJLabel.setToolTipText("Current hit points of the player.");

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(0, 0, 0));
        jLabel50.setText("Armor Class:");

        npcACJTextField.setEditable(false);
        npcACJTextField.setText("13");
        npcACJTextField.setToolTipText("Base AC is 13 + Dexterity Modifier");

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("+");

        npcOtherACJTextField.setText("0");
        npcOtherACJTextField.setToolTipText("Other AC not including Dexterity modifier");

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("Saving Throws:");

        npcSavingThrowsJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        npcSavingThrowsJLabel.setForeground(new java.awt.Color(0, 0, 0));
        npcSavingThrowsJLabel.setText("XXXXXXXXXX");

        javax.swing.GroupLayout playerDefenceJPanel1Layout = new javax.swing.GroupLayout(playerDefenceJPanel1);
        playerDefenceJPanel1.setLayout(playerDefenceJPanel1Layout);
        playerDefenceJPanel1Layout.setHorizontalGroup(
            playerDefenceJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerDefenceJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerDefenceJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerDefenceJPanel1Layout.createSequentialGroup()
                        .addGroup(playerDefenceJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(npcSubHPJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(npcAddHPJTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(playerDefenceJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(npcAddHPJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(npcSubHPJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(playerDefenceJPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(npcTotalHPJLabel)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(npcCurrentHPJLabel)))
                .addGap(28, 28, 28)
                .addGroup(playerDefenceJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerDefenceJPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(npcACJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(npcOtherACJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(playerDefenceJPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(npcSavingThrowsJLabel)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        playerDefenceJPanel1Layout.setVerticalGroup(
            playerDefenceJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerDefenceJPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playerDefenceJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerDefenceJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel50)
                        .addComponent(npcACJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51)
                        .addComponent(npcOtherACJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(playerDefenceJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel49)
                        .addComponent(npcCurrentHPJLabel)
                        .addComponent(npcTotalHPJLabel)
                        .addComponent(jLabel48)))
                .addGap(8, 8, 8)
                .addGroup(playerDefenceJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerDefenceJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel52)
                        .addComponent(npcSavingThrowsJLabel))
                    .addGroup(playerDefenceJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(npcSubHPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(npcSubHPJButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerDefenceJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(npcAddHPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(npcAddHPJButton))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        npcJPanel.add(playerDefenceJPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 640, -1));

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Character Notes:");
        npcJPanel.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel54.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("Location:");
        npcJPanel.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        tabPanel.add(npcJPanel, "npcCard");

        locationNotesJTextArea.setEditable(false);
        locationNotesJTextArea.setBackground(new java.awt.Color(255, 255, 255));
        locationNotesJTextArea.setColumns(20);
        locationNotesJTextArea.setRows(5);
        locationNotesJTextArea.setWrapStyleWord(true);
        jScrollPane9.setViewportView(locationNotesJTextArea);

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel33.setText("Location Notes:");

        npcItemsJPanel1.setBackground(new java.awt.Color(204, 204, 204));
        npcItemsJPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("Shop:");
        npcItemsJPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        addNPCItemJButton1.setText("Add Item");
        addNPCItemJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNPCItemJButton1ActionPerformed(evt);
            }
        });
        npcItemsJPanel1.add(addNPCItemJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        removeNPCItemJButton1.setText("Remove Selected Item");
        removeNPCItemJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNPCItemJButton1ActionPerformed(evt);
            }
        });
        npcItemsJPanel1.add(removeNPCItemJButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, -1));

        npcItemsJTable1.setBackground(new java.awt.Color(255, 255, 255));
        npcItemsJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Item", "Type", "Value", "Weight", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        npcItemsJTable1.setToolTipText("Double click cell to edit.");
        npcItemsJTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(npcItemsJTable1);
        npcItemsJTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        npcItemsJPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 640, 450));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        npcItemsJPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel56.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("Shop Inventory:");
        npcItemsJPanel1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        javax.swing.GroupLayout locationsJPanelLayout = new javax.swing.GroupLayout(locationsJPanel);
        locationsJPanel.setLayout(locationsJPanelLayout);
        locationsJPanelLayout.setHorizontalGroup(
            locationsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locationsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(locationsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(locationsJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(0, 548, Short.MAX_VALUE))
                    .addComponent(jScrollPane9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(npcItemsJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        locationsJPanelLayout.setVerticalGroup(
            locationsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, locationsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(locationsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(npcItemsJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabPanel.add(locationsJPanel, "locationsCard");

        eventNotesJTextArea.setColumns(20);
        eventNotesJTextArea.setRows(5);
        jScrollPane11.setViewportView(eventNotesJTextArea);

        jLabel57.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel57.setText("Campaign Notes:");

        javax.swing.GroupLayout eventsNotesJPanelLayout = new javax.swing.GroupLayout(eventsNotesJPanel);
        eventsNotesJPanel.setLayout(eventsNotesJPanelLayout);
        eventsNotesJPanelLayout.setHorizontalGroup(
            eventsNotesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eventsNotesJPanelLayout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(eventsNotesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 1329, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        eventsNotesJPanelLayout.setVerticalGroup(
            eventsNotesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventsNotesJPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel57)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabPanel.add(eventsNotesJPanel, "eventsCard");

        getContentPane().add(tabPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 161, -1, 670));

        pagesList.setBackground(new java.awt.Color(77, 67, 67));
        pagesList.setForeground(new java.awt.Color(255, 255, 255));
        pagesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Home", "Players", "NPC's", "Locations", "Notes" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        pagesList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                pagesListValueChanged(evt);
            }
        });
        pagesJScrollPanel.setViewportView(pagesList);

        javax.swing.GroupLayout pagesJPanelLayout = new javax.swing.GroupLayout(pagesJPanel);
        pagesJPanel.setLayout(pagesJPanelLayout);
        pagesJPanelLayout.setHorizontalGroup(
            pagesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 101, Short.MAX_VALUE)
            .addGroup(pagesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pagesJPanelLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(pagesJScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pagesJPanelLayout.setVerticalGroup(
            pagesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
            .addGroup(pagesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pagesJPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pagesJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(pagesJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 31, -1, 130));

        pageControlsJPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout homeControlsJPanelLayout = new javax.swing.GroupLayout(homeControlsJPanel);
        homeControlsJPanel.setLayout(homeControlsJPanelLayout);
        homeControlsJPanelLayout.setHorizontalGroup(
            homeControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        homeControlsJPanelLayout.setVerticalGroup(
            homeControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        pageControlsJPanel.add(homeControlsJPanel, "homeControlsCard");

        playersJList.setBackground(new java.awt.Color(77, 67, 67));
        playersJList.setForeground(new java.awt.Color(255, 255, 255));
        playersJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                playersJListValueChanged(evt);
            }
        });
        playersJScrollPanel.setViewportView(playersJList);

        newPlayerJButton.setMnemonic('n');
        newPlayerJButton.setText("New Player");
        newPlayerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPlayerJButtonActionPerformed(evt);
            }
        });

        removePlayerJButton.setText("Remove Player");

        jPanel2.setLayout(new java.awt.GridBagLayout());

        welcomeLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        welcomeLabel2.setText("Player Information");
        welcomeLabel2.setToolTipText("");
        jPanel2.add(welcomeLabel2, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout playerControlsJPanelLayout = new javax.swing.GroupLayout(playerControlsJPanel);
        playerControlsJPanel.setLayout(playerControlsJPanelLayout);
        playerControlsJPanelLayout.setHorizontalGroup(
            playerControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerControlsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playersJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(playerControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newPlayerJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removePlayerJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerControlsJPanelLayout.setVerticalGroup(
            playerControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerControlsJPanelLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(playerControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerControlsJPanelLayout.createSequentialGroup()
                        .addComponent(newPlayerJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removePlayerJButton)
                        .addGap(50, 50, 50))
                    .addGroup(playerControlsJPanelLayout.createSequentialGroup()
                        .addComponent(playersJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pageControlsJPanel.add(playerControlsJPanel, "playerControlsCard");

        playersJList1.setBackground(new java.awt.Color(77, 67, 67));
        playersJList1.setForeground(new java.awt.Color(255, 255, 255));
        playersJList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "NPC 1", "NPC 2", "NPC 3" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        playersJList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                playersJList1ValueChanged(evt);
            }
        });
        playersJScrollPanel1.setViewportView(playersJList1);

        jLabel1.setText("NPC/Enemy");

        addNPCJButton.setText("Add NPC/Enemy");

        removeNPCJButton.setText("Remove NPC/Enemy");

        jPanel1.setLayout(new java.awt.GridBagLayout());

        welcomeLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        welcomeLabel1.setText("NPC/Enemy Information");
        welcomeLabel1.setToolTipText("");
        jPanel1.add(welcomeLabel1, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout npcControlsJPanelLayout = new javax.swing.GroupLayout(npcControlsJPanel);
        npcControlsJPanel.setLayout(npcControlsJPanelLayout);
        npcControlsJPanelLayout.setHorizontalGroup(
            npcControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(npcControlsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(npcControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playersJScrollPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(npcControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removeNPCJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addNPCJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        npcControlsJPanelLayout.setVerticalGroup(
            npcControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(npcControlsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(npcControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, npcControlsJPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(npcControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(npcControlsJPanelLayout.createSequentialGroup()
                                .addComponent(addNPCJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeNPCJButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, npcControlsJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playersJScrollPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))))
                .addContainerGap())
        );

        pageControlsJPanel.add(npcControlsJPanel, "npcControlsCard");

        locationsJList.setBackground(new java.awt.Color(77, 67, 67));
        locationsJList.setForeground(new java.awt.Color(255, 255, 255));
        locationsJList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Location 1", "Location 2", "Location 3" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        locationsJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                locationsJListValueChanged(evt);
            }
        });
        playersJScrollPanel2.setViewportView(locationsJList);

        newLocationJButton.setMnemonic('n');
        newLocationJButton.setText("New Location");
        newLocationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLocationJButtonActionPerformed(evt);
            }
        });

        removeLocationJButton.setText("Remove Location");

        jPanel3.setLayout(new java.awt.GridBagLayout());

        welcomeLabel3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        welcomeLabel3.setText("Location Information");
        welcomeLabel3.setToolTipText("");
        jPanel3.add(welcomeLabel3, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout locationControlsJPanelLayout = new javax.swing.GroupLayout(locationControlsJPanel);
        locationControlsJPanel.setLayout(locationControlsJPanelLayout);
        locationControlsJPanelLayout.setHorizontalGroup(
            locationControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locationControlsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(playersJScrollPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(locationControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newLocationJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removeLocationJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        locationControlsJPanelLayout.setVerticalGroup(
            locationControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(locationControlsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(locationControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playersJScrollPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(locationControlsJPanelLayout.createSequentialGroup()
                        .addComponent(newLocationJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeLocationJButton)
                        .addGap(44, 44, 44))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pageControlsJPanel.add(locationControlsJPanel, "locationControlsCard");

        jPanel4.setLayout(new java.awt.GridBagLayout());

        welcomeLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        welcomeLabel4.setText("Notes");
        welcomeLabel4.setToolTipText("");
        jPanel4.add(welcomeLabel4, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout eventControlsJPanelLayout = new javax.swing.GroupLayout(eventControlsJPanel);
        eventControlsJPanel.setLayout(eventControlsJPanelLayout);
        eventControlsJPanelLayout.setHorizontalGroup(
            eventControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eventControlsJPanelLayout.createSequentialGroup()
                .addGap(0, 306, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        eventControlsJPanelLayout.setVerticalGroup(
            eventControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pageControlsJPanel.add(eventControlsJPanel, "eventControlsCard");

        getContentPane().add(pageControlsJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 590, 130));

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

        generatorMenuItem.setText("Generator");
        generatorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatorMenuItemActionPerformed(evt);
            }
        });
        generatorMenu.add(generatorMenuItem);

        mainMenuBar.add(generatorMenu);

        setJMenuBar(mainMenuBar);

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
     * When a different item is selected change the displayed JPanel in tabJPanel
     * @param evt 
     */
    private void pagesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_pagesListValueChanged
        CardLayout card = (CardLayout)tabPanel.getLayout();
        CardLayout controls = (CardLayout)pageControlsJPanel.getLayout();
        if(pagesList.getSelectedValue() == "Home")
        {
            card.show(tabPanel, "homeCard");
            controls.show(pageControlsJPanel, "homeControlsCard");
        }
        else if(pagesList.getSelectedValue() == "Players")
        {
            card.show(tabPanel, "playersCard");
            controls.show(pageControlsJPanel, "playerControlsCard");
        }
        else if(pagesList.getSelectedValue() == "NPC's")
        {
            card.show(tabPanel, "npcCard");
            controls.show(pageControlsJPanel, "npcControlsCard");
        }
        else if(pagesList.getSelectedValue() == "Locations")
        {
            card.show(tabPanel, "locationsCard");
            controls.show(pageControlsJPanel, "locationControlsCard");
        }
        else if(pagesList.getSelectedValue() == "Events/Notes")
        {
            card.show(tabPanel, "eventsCard");
            controls.show(pageControlsJPanel, "eventControlsCard");
        }
    }//GEN-LAST:event_pagesListValueChanged

    /**
     * Allows user to edit stats of current player selected.
     * @param evt 
     */
    private void editPlayerJCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPlayerJCheckBoxActionPerformed
        if(editPlayerJCheckBox.isSelected() == true)
        {
            playerNotesJTextArea.setEditable(true);
            strengthJTextField.setEditable(true);
            dexterityJTextField.setEditable(true);
            constitutionJTextField.setEditable(true);
            intelligenceJTextField.setEditable(true);
            wisdomJTextField.setEditable(true);
            charismaJTextField.setEditable(true);
            skillsJTextArea.setEditable(true);
        }
        else if(editPlayerJCheckBox.isSelected() == false)
        {
            playerNotesJTextArea.setEditable(false);
            strengthJTextField.setEditable(false);
            dexterityJTextField.setEditable(false);
            constitutionJTextField.setEditable(false);
            intelligenceJTextField.setEditable(false);
            wisdomJTextField.setEditable(false);
            charismaJTextField.setEditable(false);
            skillsJTextArea.setEditable(false);
        }
    }//GEN-LAST:event_editPlayerJCheckBoxActionPerformed
    /**
     * When a player is selected current data in text fields jTables etc. needs
     * to be saved and stored to a file or data structure to be read from if
     * the player is selected again. Then the player's data that is selected
     * needs to be collected from data structure and displayed in corresponding
     * fields.
     * @param evt 
     */
    private void playersJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_playersJListValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_playersJListValueChanged
    /**
     * Adds a new row to playerWeaponsJTable.
     * @param evt 
     */
    private void addPlayerWeaponJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlayerWeaponJButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)playerWeaponsJTable.getModel();
        model.addRow(new Object[]{});
    }//GEN-LAST:event_addPlayerWeaponJButtonActionPerformed
    /**
     * Adds a new row to playerItemsJTable
     * @param evt 
     */
    private void addPlayerItemJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlayerItemJButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)playerItemsJTable.getModel();
        model.addRow(new Object[]{});
    }//GEN-LAST:event_addPlayerItemJButtonActionPerformed
    /**
     * Get the selected row from playerWeaponsJTable and then remove it.
     * Display a warning message beforehand.
     * Display a message indicating no value was selected if that is the case.
     * @param evt 
     */
    private void removePlayerWeaponJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePlayerWeaponJButtonActionPerformed
        int selection = JOptionPane.showConfirmDialog(pagesJPanel, "This will remove the selected"
                + "value from the Weapon Table. Would you like to continue?");
        
        if(selection == JOptionPane.YES_OPTION)
        {
            if(playerWeaponsJTable.getSelectedRow() != -1)
            {
                //remove selected row from Table
                DefaultTableModel model = (DefaultTableModel)playerWeaponsJTable.getModel();
                model.removeRow(playerWeaponsJTable.getSelectedRow());
            }
            else
            {
                JOptionPane.showMessageDialog(pagesJPanel, "No value selected.");
            }
            
        }
    }//GEN-LAST:event_removePlayerWeaponJButtonActionPerformed
    /**
     * Get the selected row from the playerItemsJTable and then remove it.
     * Display a warning message beforehand.
     * Display a message indicating no value was selected if that is the case.
     * @param evt 
     */
    private void removePlayerItemJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePlayerItemJButton1ActionPerformed
    int selection = JOptionPane.showConfirmDialog(pagesJPanel, "This will remove the selected"
                + "value from the Item Table. Would you like to continue?");
        
        if(selection == JOptionPane.YES_OPTION)
        {
            if(playerItemsJTable.getSelectedRow() != -1)
            {
                //remove selected row from Table
                DefaultTableModel model = (DefaultTableModel)playerItemsJTable.getModel();
                model.removeRow(playerItemsJTable.getSelectedRow());
            }
            else
            {
                JOptionPane.showMessageDialog(pagesJPanel, "No value selected.");
            }
            
        }
    }//GEN-LAST:event_removePlayerItemJButton1ActionPerformed
    /**
     * Adds a new row to playerSpellsJTable
     * @param evt 
     */
    private void addPlayerSpellJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPlayerSpellJButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)playerSpellsJTable.getModel();
        model.addRow(new Object[]{});
    }//GEN-LAST:event_addPlayerSpellJButtonActionPerformed
    /**
     * Get the selected row from the playerSpellsJTable and then remove it.
     * Display a warning message beforehand.
     * Display a message indicating no value was selected if that is the case.
     * @param evt 
     */
    private void removePlayerSpellJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePlayerSpellJButtonActionPerformed
        int selection = JOptionPane.showConfirmDialog(pagesJPanel, "This will remove the selected"
                + "value from the Spell Table. Would you like to continue?");
        
        if(selection == JOptionPane.YES_OPTION)
        {
            if(playerSpellsJTable.getSelectedRow() != -1)
            {
                //remove selected row from Table
                DefaultTableModel model = (DefaultTableModel)playerSpellsJTable.getModel();
                model.removeRow(playerSpellsJTable.getSelectedRow());
            }
            else
            {
                JOptionPane.showMessageDialog(pagesJPanel, "No value selected.");
            }
            
        }
    }//GEN-LAST:event_removePlayerSpellJButtonActionPerformed
    /**
     * Rounds gold upon losing focus i.e.
     * 10 Gold = 1 Platinum
     * @param evt 
     */
    private void playerGoldJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_playerGoldJTextFieldFocusLost
        int amount = Integer.parseInt(playerGoldJTextField.getText());
        int newGoldAmount = 0;
        int playerPlatinum = Integer.parseInt(playerPlatinumJTextField.getText());
        int platinum;
        if(amount > 9)
        {
            platinum = amount / 10;
            playerPlatinumJTextField.setText(Integer.toString(playerPlatinum + platinum));
            playerGoldJTextField.setText(Integer.toString((amount % 10)));
        }
    }//GEN-LAST:event_playerGoldJTextFieldFocusLost
    /**
     * Opens the newPlayerUI so the user can enter new information for a player.
     * Upon entering the information for the player and clicking "Add" or something
     * data will be stored to internal data structure and then called from
     * this method to append the playerJList and populate the relevant fields.
     * @param evt 
     */
    private void newPlayerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPlayerJButtonActionPerformed
        // open then recieve player information upon user pressing "add" on 
        // newPlayerUI
        newPlayerUI newPlayer = new newPlayerUI();
        newPlayer.setLocationRelativeTo(null);
        newPlayer.setVisible(true);
    }//GEN-LAST:event_newPlayerJButtonActionPerformed

    private void playersJList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_playersJList1ValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_playersJList1ValueChanged

    private void addNPCItemJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNPCItemJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNPCItemJButtonActionPerformed

    private void removeNPCItemJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNPCItemJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeNPCItemJButtonActionPerformed

    private void addNPCWeaponJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNPCWeaponJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNPCWeaponJButtonActionPerformed

    private void removeNPCWeaponJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNPCWeaponJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeNPCWeaponJButtonActionPerformed

    private void addNPCSpellJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNPCSpellJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNPCSpellJButtonActionPerformed

    private void removeNPCSpellJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNPCSpellJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeNPCSpellJButtonActionPerformed

    private void playerGoldJTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_playerGoldJTextField1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_playerGoldJTextField1FocusLost

    private void locationsJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_locationsJListValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_locationsJListValueChanged

    private void newLocationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newLocationJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newLocationJButtonActionPerformed

    private void addNPCItemJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNPCItemJButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNPCItemJButton1ActionPerformed

    private void removeNPCItemJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNPCItemJButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeNPCItemJButton1ActionPerformed

    private void playerLevelDownJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerLevelDownJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_playerLevelDownJButtonActionPerformed

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
    private javax.swing.JButton addNPCItemJButton;
    private javax.swing.JButton addNPCItemJButton1;
    private javax.swing.JButton addNPCJButton;
    private javax.swing.JButton addNPCSpellJButton;
    private javax.swing.JButton addNPCWeaponJButton;
    private javax.swing.JButton addPlayerItemJButton;
    private javax.swing.JButton addPlayerSpellJButton;
    private javax.swing.JButton addPlayerWeaponJButton;
    private javax.swing.JComboBox allignmentJComboBox;
    private javax.swing.JPanel attributesJPanel;
    private javax.swing.JPanel attributesJPanel1;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField charModJTextField;
    private javax.swing.JTextField charModJTextField1;
    private javax.swing.JSpinner charModTempJSpinner;
    private javax.swing.JSpinner charModTempJSpinner1;
    private javax.swing.JLabel characterClassJLabel;
    private javax.swing.JLabel characterNameJLabel;
    private javax.swing.JLabel characterRaceJLabel;
    private javax.swing.JLabel charismaJLabel;
    private javax.swing.JLabel charismaJLabel1;
    private javax.swing.JTextField charismaJTextField;
    private javax.swing.JTextField charismaJTextField1;
    private javax.swing.JTextField conModJTextField;
    private javax.swing.JTextField conModJTextField1;
    private javax.swing.JSpinner conModTempJSpinner;
    private javax.swing.JSpinner conModTempJSpinner1;
    private javax.swing.JLabel constitutionJLabel;
    private javax.swing.JLabel constitutionJLabel1;
    private javax.swing.JTextField constitutionJTextField;
    private javax.swing.JTextField constitutionJTextField1;
    private javax.swing.JMenuItem databasesMenuItem;
    private javax.swing.JTextField dexModJTextField;
    private javax.swing.JTextField dexModJTextField1;
    private javax.swing.JSpinner dexModTempJSpinner;
    private javax.swing.JSpinner dexModTempJSpinner1;
    private javax.swing.JLabel dexterityJLabel;
    private javax.swing.JLabel dexterityJLabel1;
    private javax.swing.JTextField dexterityJTextField;
    private javax.swing.JTextField dexterityJTextField1;
    private javax.swing.JMenu editMenu;
    private javax.swing.JCheckBox editPlayerJCheckBox;
    private javax.swing.JPanel eventControlsJPanel;
    private javax.swing.JTextArea eventNotesJTextArea;
    private javax.swing.JPanel eventsNotesJPanel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton forwardButton;
    private javax.swing.JMenu generatorMenu;
    private javax.swing.JMenuItem generatorMenuItem;
    private javax.swing.JPanel homeControlsJPanel;
    private javax.swing.JPanel homeJPanel;
    private javax.swing.JTextField intModJTextField;
    private javax.swing.JTextField intModJTextField1;
    private javax.swing.JSpinner intModTempJSpinner;
    private javax.swing.JSpinner intModTempJSpinner1;
    private javax.swing.JLabel intelligenceJLabel;
    private javax.swing.JLabel intelligenceJLabel1;
    private javax.swing.JTextField intelligenceJTextField;
    private javax.swing.JTextField intelligenceJTextField1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel locationControlsJPanel;
    private javax.swing.JTextArea locationNotesJTextArea;
    private javax.swing.JList locationsJList;
    private javax.swing.JPanel locationsJPanel;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JToolBar mainToolBar;
    private javax.swing.JPanel modifiersJPanel;
    private javax.swing.JPanel modifiersJPanel1;
    private javax.swing.JButton newLocationJButton;
    private javax.swing.JButton newPlayerJButton;
    private javax.swing.JTextField npcACJTextField;
    private javax.swing.JButton npcAddHPJButton;
    private javax.swing.JTextField npcAddHPJTextField;
    private javax.swing.JComboBox npcAlignmentJComboBox;
    private javax.swing.JLabel npcClassJLabel;
    private javax.swing.JPanel npcControlsJPanel;
    private javax.swing.JLabel npcCurrentHPJLabel;
    private javax.swing.JPanel npcDetailsJPanel;
    private javax.swing.JPanel npcItemsJPanel;
    private javax.swing.JPanel npcItemsJPanel1;
    private javax.swing.JTable npcItemsJTable;
    private javax.swing.JTable npcItemsJTable1;
    private javax.swing.JPanel npcJPanel;
    private javax.swing.JLabel npcLocationJLabel;
    private javax.swing.JLabel npcNameJLabel;
    private javax.swing.JTextArea npcNotesJTextArea;
    private javax.swing.JTextField npcOtherACJTextField;
    private javax.swing.JLabel npcRaceJLabel;
    private javax.swing.JLabel npcSavingThrowsJLabel;
    private javax.swing.JTable npcSpellsJTable;
    private javax.swing.JButton npcSubHPJButton;
    private javax.swing.JTextField npcSubHPJTextField;
    private javax.swing.JLabel npcTotalHPJLabel;
    private javax.swing.JTable npcWeaponsJTable;
    private javax.swing.JPanel pageControlsJPanel;
    private javax.swing.JPanel pagesJPanel;
    private javax.swing.JScrollPane pagesJScrollPanel;
    private javax.swing.JList pagesList;
    private javax.swing.JSpinner playerArrowsJSpinner;
    private javax.swing.JSpinner playerArrowsJSpinner1;
    private javax.swing.JSpinner playerBoltsJSpinner;
    private javax.swing.JSpinner playerBoltsJSpinner1;
    private javax.swing.JPanel playerControlsJPanel;
    private javax.swing.JTextField playerCopperJTextField;
    private javax.swing.JTextField playerCopperJTextField1;
    private javax.swing.JLabel playerCurrentHPJLabel;
    private javax.swing.JPanel playerDefenceJPanel;
    private javax.swing.JPanel playerDefenceJPanel1;
    private javax.swing.JTextField playerGoldJTextField;
    private javax.swing.JTextField playerGoldJTextField1;
    private javax.swing.JPanel playerItemsJPanel;
    private javax.swing.JTable playerItemsJTable;
    private javax.swing.JButton playerLevelDownJButton;
    private javax.swing.JButton playerLevelUpJButton;
    private javax.swing.JLabel playerNameJLabel;
    private javax.swing.JTextArea playerNotesJTextArea;
    private javax.swing.JLabel playerPBJLabel;
    private javax.swing.JLabel playerPBJLabel1;
    private javax.swing.JTextField playerPlatinumJTextField;
    private javax.swing.JTextField playerPlatinumJTextField1;
    private javax.swing.JTextField playerSilverJTextField;
    private javax.swing.JTextField playerSilverJTextField1;
    private javax.swing.JTable playerSpellsJTable;
    private javax.swing.JLabel playerTotalHPJLabel;
    private javax.swing.JTable playerWeaponsJTable;
    private javax.swing.JList playersJList;
    private javax.swing.JList playersJList1;
    private javax.swing.JPanel playersJPanel;
    private javax.swing.JScrollPane playersJScrollPanel;
    private javax.swing.JScrollPane playersJScrollPanel1;
    private javax.swing.JScrollPane playersJScrollPanel2;
    private javax.swing.JButton removeLocationJButton;
    private javax.swing.JButton removeNPCItemJButton;
    private javax.swing.JButton removeNPCItemJButton1;
    private javax.swing.JButton removeNPCJButton;
    private javax.swing.JButton removeNPCSpellJButton;
    private javax.swing.JButton removeNPCWeaponJButton;
    private javax.swing.JButton removePlayerItemJButton1;
    private javax.swing.JButton removePlayerJButton;
    private javax.swing.JButton removePlayerSpellJButton;
    private javax.swing.JButton removePlayerWeaponJButton;
    private javax.swing.JLabel savingThrowsJLabel;
    private javax.swing.JScrollPane skillsJScrollPane;
    private javax.swing.JScrollPane skillsJScrollPane1;
    private javax.swing.JTextArea skillsJTextArea;
    private javax.swing.JTextArea skillsJTextArea1;
    private javax.swing.JTextField strModJTextField;
    private javax.swing.JTextField strModJTextField1;
    private javax.swing.JSpinner strModTempJSpinner;
    private javax.swing.JSpinner strModTempJSpinner1;
    private javax.swing.JLabel strengthJLabel;
    private javax.swing.JLabel strengthJLabel1;
    private javax.swing.JTextField strengthJTextField;
    private javax.swing.JTextField strengthJTextField1;
    private javax.swing.JPanel tabPanel;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JPanel titleJPanel;
    private javax.swing.JPanel trackablesJPanel;
    private javax.swing.JPanel trackablesJPanel1;
    private javax.swing.JMenu viewMenu;
    private javax.swing.JLabel welcomeImageLabel;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel welcomeLabel1;
    private javax.swing.JLabel welcomeLabel2;
    private javax.swing.JLabel welcomeLabel3;
    private javax.swing.JLabel welcomeLabel4;
    private javax.swing.JTextField wisModJTextField;
    private javax.swing.JTextField wisModJTextField1;
    private javax.swing.JSpinner wisModTempJSpinner;
    private javax.swing.JSpinner wisModTempJSpinner1;
    private javax.swing.JLabel wisdomJLabel;
    private javax.swing.JLabel wisdomJLabel1;
    private javax.swing.JTextField wisdomJTextField;
    private javax.swing.JTextField wisdomJTextField1;
    // End of variables declaration//GEN-END:variables
}
