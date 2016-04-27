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
        npcJPanel = new javax.swing.JPanel();
        locationsJPanel = new javax.swing.JPanel();
        eventsNotesJPanel = new javax.swing.JPanel();
        pagesJPanel = new javax.swing.JPanel();
        pagesJScrollPanel = new javax.swing.JScrollPane();
        pagesList = new javax.swing.JList();
        pageControlsJPanel = new javax.swing.JPanel();
        homeControlsJPanel = new javax.swing.JPanel();
        playerControlsJPanel = new javax.swing.JPanel();
        playersJScrollPanel = new javax.swing.JScrollPane();
        playersJList = new javax.swing.JList();
        newPlayerJButton = new javax.swing.JButton();
        saveNotesJButton = new javax.swing.JButton();
        removePlayerJButton = new javax.swing.JButton();
        npcControlsJPanel = new javax.swing.JPanel();
        locationControlsJPanel = new javax.swing.JPanel();
        eventControlsJPanel = new javax.swing.JPanel();
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

        playersJPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 370, 410));

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

        playersJPanel.add(skillsJScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 280, 240));

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

        playerItemsJPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 640, 100));

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

        playersJPanel.add(playerItemsJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, 450));

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
                .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(playerCurrentHPJLabel)
                    .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(playerTotalHPJLabel)
                    .addComponent(jLabel25))
                .addGap(8, 8, 8)
                .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(savingThrowsJLabel)))
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

        tabPanel.add(playersJPanel, "playersCard");

        javax.swing.GroupLayout npcJPanelLayout = new javax.swing.GroupLayout(npcJPanel);
        npcJPanel.setLayout(npcJPanelLayout);
        npcJPanelLayout.setHorizontalGroup(
            npcJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        npcJPanelLayout.setVerticalGroup(
            npcJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        tabPanel.add(npcJPanel, "npcCard");

        javax.swing.GroupLayout locationsJPanelLayout = new javax.swing.GroupLayout(locationsJPanel);
        locationsJPanel.setLayout(locationsJPanelLayout);
        locationsJPanelLayout.setHorizontalGroup(
            locationsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        locationsJPanelLayout.setVerticalGroup(
            locationsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        tabPanel.add(locationsJPanel, "locationsCard");

        javax.swing.GroupLayout eventsNotesJPanelLayout = new javax.swing.GroupLayout(eventsNotesJPanel);
        eventsNotesJPanel.setLayout(eventsNotesJPanelLayout);
        eventsNotesJPanelLayout.setHorizontalGroup(
            eventsNotesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        eventsNotesJPanelLayout.setVerticalGroup(
            eventsNotesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );

        tabPanel.add(eventsNotesJPanel, "eventsCard");

        getContentPane().add(tabPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 161, -1, 740));

        pagesList.setBackground(new java.awt.Color(77, 67, 67));
        pagesList.setForeground(new java.awt.Color(255, 255, 255));
        pagesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Home", "Players", "NPC's", "Locations", "Events/Notes" };
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
            .addGap(0, 320, Short.MAX_VALUE)
        );
        homeControlsJPanelLayout.setVerticalGroup(
            homeControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        pageControlsJPanel.add(homeControlsJPanel, "homeControlsCard");

        playersJList.setBackground(new java.awt.Color(77, 67, 67));
        playersJList.setForeground(new java.awt.Color(255, 255, 255));
        playersJList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Player 1", "Player 2", "Player 3", "Player 4", "Player 5", "Player 6" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
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

        saveNotesJButton.setMnemonic('s');
        saveNotesJButton.setText("Save Notes");

        removePlayerJButton.setText("Remove Player");

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
                    .addComponent(saveNotesJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(removePlayerJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        playerControlsJPanelLayout.setVerticalGroup(
            playerControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerControlsJPanelLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(playerControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playersJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(playerControlsJPanelLayout.createSequentialGroup()
                        .addComponent(newPlayerJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removePlayerJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveNotesJButton)))
                .addContainerGap())
        );

        pageControlsJPanel.add(playerControlsJPanel, "playerControlsCard");

        javax.swing.GroupLayout npcControlsJPanelLayout = new javax.swing.GroupLayout(npcControlsJPanel);
        npcControlsJPanel.setLayout(npcControlsJPanelLayout);
        npcControlsJPanelLayout.setHorizontalGroup(
            npcControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        npcControlsJPanelLayout.setVerticalGroup(
            npcControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        pageControlsJPanel.add(npcControlsJPanel, "npcControlsCard");

        javax.swing.GroupLayout locationControlsJPanelLayout = new javax.swing.GroupLayout(locationControlsJPanel);
        locationControlsJPanel.setLayout(locationControlsJPanelLayout);
        locationControlsJPanelLayout.setHorizontalGroup(
            locationControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        locationControlsJPanelLayout.setVerticalGroup(
            locationControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        pageControlsJPanel.add(locationControlsJPanel, "locationControlsCard");

        javax.swing.GroupLayout eventControlsJPanelLayout = new javax.swing.GroupLayout(eventControlsJPanel);
        eventControlsJPanel.setLayout(eventControlsJPanelLayout);
        eventControlsJPanelLayout.setHorizontalGroup(
            eventControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );
        eventControlsJPanelLayout.setVerticalGroup(
            eventControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        pageControlsJPanel.add(eventControlsJPanel, "eventControlsCard");

        getContentPane().add(pageControlsJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 320, 130));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_newPlayerJButtonActionPerformed

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
    private javax.swing.JButton addPlayerItemJButton;
    private javax.swing.JButton addPlayerSpellJButton;
    private javax.swing.JButton addPlayerWeaponJButton;
    private javax.swing.JComboBox allignmentJComboBox;
    private javax.swing.JPanel attributesJPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField charModJTextField;
    private javax.swing.JSpinner charModTempJSpinner;
    private javax.swing.JLabel characterClassJLabel;
    private javax.swing.JLabel characterNameJLabel;
    private javax.swing.JLabel characterRaceJLabel;
    private javax.swing.JLabel charismaJLabel;
    private javax.swing.JTextField charismaJTextField;
    private javax.swing.JTextField conModJTextField;
    private javax.swing.JSpinner conModTempJSpinner;
    private javax.swing.JLabel constitutionJLabel;
    private javax.swing.JTextField constitutionJTextField;
    private javax.swing.JMenuItem databasesMenuItem;
    private javax.swing.JTextField dexModJTextField;
    private javax.swing.JSpinner dexModTempJSpinner;
    private javax.swing.JLabel dexterityJLabel;
    private javax.swing.JTextField dexterityJTextField;
    private javax.swing.JMenu editMenu;
    private javax.swing.JCheckBox editPlayerJCheckBox;
    private javax.swing.JPanel eventControlsJPanel;
    private javax.swing.JPanel eventsNotesJPanel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton forwardButton;
    private javax.swing.JMenu generatorMenu;
    private javax.swing.JMenuItem generatorMenuItem;
    private javax.swing.JPanel homeControlsJPanel;
    private javax.swing.JPanel homeJPanel;
    private javax.swing.JTextField intModJTextField;
    private javax.swing.JSpinner intModTempJSpinner;
    private javax.swing.JLabel intelligenceJLabel;
    private javax.swing.JTextField intelligenceJTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel locationControlsJPanel;
    private javax.swing.JPanel locationsJPanel;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JToolBar mainToolBar;
    private javax.swing.JPanel modifiersJPanel;
    private javax.swing.JButton newPlayerJButton;
    private javax.swing.JPanel npcControlsJPanel;
    private javax.swing.JPanel npcJPanel;
    private javax.swing.JPanel pageControlsJPanel;
    private javax.swing.JPanel pagesJPanel;
    private javax.swing.JScrollPane pagesJScrollPanel;
    private javax.swing.JList pagesList;
    private javax.swing.JSpinner playerArrowsJSpinner;
    private javax.swing.JSpinner playerBoltsJSpinner;
    private javax.swing.JPanel playerControlsJPanel;
    private javax.swing.JTextField playerCopperJTextField;
    private javax.swing.JLabel playerCurrentHPJLabel;
    private javax.swing.JPanel playerDefenceJPanel;
    private javax.swing.JTextField playerGoldJTextField;
    private javax.swing.JPanel playerItemsJPanel;
    private javax.swing.JTable playerItemsJTable;
    private javax.swing.JLabel playerNameJLabel;
    private javax.swing.JTextArea playerNotesJTextArea;
    private javax.swing.JLabel playerPBJLabel;
    private javax.swing.JTextField playerPlatinumJTextField;
    private javax.swing.JTextField playerSilverJTextField;
    private javax.swing.JTable playerSpellsJTable;
    private javax.swing.JLabel playerTotalHPJLabel;
    private javax.swing.JTable playerWeaponsJTable;
    private javax.swing.JList playersJList;
    private javax.swing.JPanel playersJPanel;
    private javax.swing.JScrollPane playersJScrollPanel;
    private javax.swing.JButton removePlayerItemJButton1;
    private javax.swing.JButton removePlayerJButton;
    private javax.swing.JButton removePlayerSpellJButton;
    private javax.swing.JButton removePlayerWeaponJButton;
    private javax.swing.JButton saveNotesJButton;
    private javax.swing.JLabel savingThrowsJLabel;
    private javax.swing.JScrollPane skillsJScrollPane;
    private javax.swing.JTextArea skillsJTextArea;
    private javax.swing.JTextField strModJTextField;
    private javax.swing.JSpinner strModTempJSpinner;
    private javax.swing.JLabel strengthJLabel;
    private javax.swing.JTextField strengthJTextField;
    private javax.swing.JPanel tabPanel;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JPanel titleJPanel;
    private javax.swing.JPanel trackablesJPanel;
    private javax.swing.JMenu viewMenu;
    private javax.swing.JLabel welcomeImageLabel;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JTextField wisModJTextField;
    private javax.swing.JSpinner wisModTempJSpinner;
    private javax.swing.JLabel wisdomJLabel;
    private javax.swing.JTextField wisdomJTextField;
    // End of variables declaration//GEN-END:variables
}
