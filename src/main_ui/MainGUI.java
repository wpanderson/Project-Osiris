/**
 * Project Osiris
 * Group Members: Weston Anderson, Charles, Ryan, Michel, Brian, Herman
 */
package main_ui;

import D5DataStructures.*;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.IOException;
import java.util.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
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
    private ArrayList<Player> npcList = new ArrayList();
    //private ArrayList<Enemy> enemyList = new ArrayList();
    //private ArrayList<Location> locationList = new ArrayList();
    private int prevIndex = 0;
    /**
     * This is the datastorage for the entire program. Any program adding
     * to the database at runtime will add to this.
     */
    public static DataStorage DATABASE = new DataStorage();
    
    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        //Database pre load:==================================================
        LoadDatabase();
        initComponents();
        this.setLocationRelativeTo(null);
        //UI startup commands:================================================
        
    }
    /**
     * Load database from CSV on startup
     */
    private static void LoadDatabase()
    {
        /*
        //CSVIO readIn = new CSVIO();
        try {
            //change this at a later time to get the path at runtime
            
            DATABASE.addEnemiesFromCSV("src\\D.R.A.G.O.N.S_CSV/Monsters_DB.csv");
            DATABASE.addMagicItemsFromCSV("src\\D.R.A.G.O.N.S_CSV/Magic_items.csv");
            DATABASE.addGenericItemsFromCSV("src\\D.R.A.G.O.N.S_CSV/GenericItems_DB.csv");
            DATABASE.addWeaponsFromCSV("src\\D.R.A.G.O.N.S_CSV/Weapons_DB.csv");
        } catch (IOException ex) {
            System.out.println(ex);
        }
        
        System.out.println(DATABASE.getEnemyList());
        */
        Serializer.loadFromFile("testfile.dragons");
        System.out.println(MainGUI.DATABASE.getEnemyList());
    }
    /**
     * Displays content that is in the database to all the pages.
     */
    private void displayContent()
    {
        
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
        welcomeLabel5 = new javax.swing.JLabel();
        welcomeLabel6 = new javax.swing.JLabel();
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
        characterAlignmentJLabel = new javax.swing.JLabel();
        playerPBJLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        playerNameJLabel = new javax.swing.JLabel();
        editPlayerJCheckBox = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        characterNameJLabel = new javax.swing.JLabel();
        modifiersJPanel = new javax.swing.JPanel();
        strModJTextField = new javax.swing.JTextField();
        dexModJTextField = new javax.swing.JTextField();
        conModJTextField = new javax.swing.JTextField();
        intModJTextField = new javax.swing.JTextField();
        wisModJTextField = new javax.swing.JTextField();
        charModJTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        trackablesJPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        playerGoldJTextField = new javax.swing.JTextField();
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
        subHPJTextField = new javax.swing.JTextField();
        playerSubJButton = new javax.swing.JButton();
        addHPJTextField = new javax.swing.JTextField();
        playerAddJButton = new javax.swing.JButton();
        playerCurrentHPJLabel = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        savingThrowsJLabel = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        characterClassJLabel = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        characterRaceJLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        playerSkillsJPanel = new javax.swing.JPanel();
        acrobaticsJCheckbox = new javax.swing.JCheckBox();
        animalJCheckbox = new javax.swing.JCheckBox();
        arcanaJCheckbox = new javax.swing.JCheckBox();
        athleticsJCheckbox = new javax.swing.JCheckBox();
        deceptionJCheckbox = new javax.swing.JCheckBox();
        historyJCheckbox = new javax.swing.JCheckBox();
        insightJCheckbox = new javax.swing.JCheckBox();
        intimidationJCheckbox = new javax.swing.JCheckBox();
        investigationJCheckbox = new javax.swing.JCheckBox();
        medicineJCheckbox = new javax.swing.JCheckBox();
        natureJCheckbox = new javax.swing.JCheckBox();
        perceptionJCheckbox = new javax.swing.JCheckBox();
        performanceJCheckbox = new javax.swing.JCheckBox();
        persuasionJCheckbox = new javax.swing.JCheckBox();
        religionJCheckbox = new javax.swing.JCheckBox();
        sleightJCheckbox = new javax.swing.JCheckBox();
        stealthJCheckbox = new javax.swing.JCheckBox();
        survivalJCheckbox = new javax.swing.JCheckBox();
        npcJPanel = new javax.swing.JPanel();
        npcDetailsJPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        npcNameJLabel = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        npcClassJLabel = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        npcAlignmentJLabel = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        npcRaceJLabel1 = new javax.swing.JLabel();
        editNPCJCheckBox = new javax.swing.JCheckBox();
        jLabel46 = new javax.swing.JLabel();
        npcPBJLabel = new javax.swing.JLabel();
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
        npcGoldJTextField = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        npcPlatinumJTextField = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        npcCopperJTextField = new javax.swing.JTextField();
        npcSilverJTextField = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        attributesJPanel1 = new javax.swing.JPanel();
        strengthJLabel1 = new javax.swing.JLabel();
        npcStrengthJTextField = new javax.swing.JTextField();
        dexterityJLabel1 = new javax.swing.JLabel();
        npcDexterityJTextField = new javax.swing.JTextField();
        constitutionJLabel1 = new javax.swing.JLabel();
        npcConstitutionJTextField = new javax.swing.JTextField();
        intelligenceJLabel1 = new javax.swing.JLabel();
        npcIntelligenceJTextField = new javax.swing.JTextField();
        wisdomJLabel1 = new javax.swing.JLabel();
        npcWisdomJTextField = new javax.swing.JTextField();
        charismaJLabel1 = new javax.swing.JLabel();
        npcCharismaJTextField = new javax.swing.JTextField();
        modifiersJPanel1 = new javax.swing.JPanel();
        npcStrModJTextField = new javax.swing.JTextField();
        npcDexModJTextField = new javax.swing.JTextField();
        npcConModJTextField = new javax.swing.JTextField();
        npcIntModJTextField = new javax.swing.JTextField();
        npcWisModJTextField = new javax.swing.JTextField();
        npcCharModJTextField = new javax.swing.JTextField();
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
        npcSkillsControllerJPanel = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        npcSkillsJPanel = new javax.swing.JPanel();
        npcAcrobaticsJCheckbox = new javax.swing.JCheckBox();
        npcAnimalJCheckbox = new javax.swing.JCheckBox();
        npcArcanaJCheckbox = new javax.swing.JCheckBox();
        npcAthleticsJCheckbox = new javax.swing.JCheckBox();
        npcDeceptionJCheckbox = new javax.swing.JCheckBox();
        npcHistoryJCheckbox = new javax.swing.JCheckBox();
        npcInsightJCheckbox = new javax.swing.JCheckBox();
        npcIntimidationJCheckbox = new javax.swing.JCheckBox();
        npcInvestigationJCheckbox = new javax.swing.JCheckBox();
        npcMedicineJCheckbox = new javax.swing.JCheckBox();
        npcNatureJCheckbox = new javax.swing.JCheckBox();
        npcPerceptionJCheckbox = new javax.swing.JCheckBox();
        npcPerformanceJCheckbox = new javax.swing.JCheckBox();
        npcPersuasionJCheckbox = new javax.swing.JCheckBox();
        npcReligionJCheckbox = new javax.swing.JCheckBox();
        npcSleightJCheckbox = new javax.swing.JCheckBox();
        npcStealthJCheckbox = new javax.swing.JCheckBox();
        npcSurvivalJCheckbox = new javax.swing.JCheckBox();
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
        savePlayerJButton = new javax.swing.JButton();
        npcControlsJPanel = new javax.swing.JPanel();
        playersJScrollPanel1 = new javax.swing.JScrollPane();
        npcJList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        addNPCJButton = new javax.swing.JButton();
        removeNPCJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        welcomeLabel1 = new javax.swing.JLabel();
        saveNPCJButton = new javax.swing.JButton();
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
        saveNotesJButton = new javax.swing.JButton();
        mainMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        loadJMenuItem = new javax.swing.JMenuItem();
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

        welcomeImageLabel.setText("<html><a href=\"http://project-osiris.herokuapp.com/\">http://project-osiris.herokuapp.com/</a></html>");

        welcomeLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        welcomeLabel5.setText("<html> <ahref=\"http://project-osiris.herokuapp.com/\"> </html>");
        welcomeLabel5.setToolTipText("");

        welcomeLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        welcomeLabel6.setText("For more information on D.R.A.G.O.N.S please visit our website:");
        welcomeLabel6.setToolTipText("");

        javax.swing.GroupLayout homeJPanelLayout = new javax.swing.GroupLayout(homeJPanel);
        homeJPanel.setLayout(homeJPanelLayout);
        homeJPanelLayout.setHorizontalGroup(
            homeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(homeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeJPanelLayout.createSequentialGroup()
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 546, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(439, 439, 439))
                    .addGroup(homeJPanelLayout.createSequentialGroup()
                        .addComponent(welcomeLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(welcomeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(welcomeLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        homeJPanelLayout.setVerticalGroup(
            homeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeJPanelLayout.createSequentialGroup()
                .addGroup(homeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homeJPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel9))
                    .addGroup(homeJPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(homeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(welcomeLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(homeJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(welcomeLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(welcomeImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(548, 548, 548))
        );

        tabPanel.add(homeJPanel, "homeCard");

        playersJPanel.setBackground(new java.awt.Color(204, 204, 204));
        playersJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Player Notes:");
        playersJPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        playerNotesJTextArea.setEditable(false);
        playerNotesJTextArea.setColumns(20);
        playerNotesJTextArea.setRows(5);
        playerNotesJTextArea.setWrapStyleWord(true);
        playerNotesJTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                playerNotesJTextAreaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                playerNotesJTextAreaFocusLost(evt);
            }
        });
        playerNotesJTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                playerNotesJTextAreaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(playerNotesJTextArea);

        playersJPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 370, 490));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Attributes:");
        playersJPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 6, -1, -1));

        attributesJPanel.setBackground(new java.awt.Color(204, 204, 204));
        attributesJPanel.setToolTipText("");
        attributesJPanel.setLayout(new java.awt.GridLayout(6, 3));

        strengthJLabel.setText("Strength:");
        attributesJPanel.add(strengthJLabel);

        strengthJTextField.setEditable(false);
        strengthJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        strengthJTextField.setText("10");
        strengthJTextField.setToolTipText("(Athletics)");
        strengthJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                strengthJTextFieldFocusLost(evt);
            }
        });
        strengthJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                strengthJTextFieldKeyTyped(evt);
            }
        });
        attributesJPanel.add(strengthJTextField);

        dexterityJLabel.setText("Dexterity:");
        attributesJPanel.add(dexterityJLabel);

        dexterityJTextField.setEditable(false);
        dexterityJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dexterityJTextField.setText("10");
        dexterityJTextField.setToolTipText("(Acrobatics, Stealth)");
        attributesJPanel.add(dexterityJTextField);

        constitutionJLabel.setText("Constitution:");
        attributesJPanel.add(constitutionJLabel);

        constitutionJTextField.setEditable(false);
        constitutionJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        constitutionJTextField.setText("10");
        constitutionJTextField.setToolTipText("");
        attributesJPanel.add(constitutionJTextField);

        intelligenceJLabel.setText("Intelligence:");
        attributesJPanel.add(intelligenceJLabel);

        intelligenceJTextField.setEditable(false);
        intelligenceJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        intelligenceJTextField.setText("10");
        intelligenceJTextField.setToolTipText("(Arcana, History, Investigation, Nature, Religion)");
        attributesJPanel.add(intelligenceJTextField);

        wisdomJLabel.setText("Wisdom:");
        attributesJPanel.add(wisdomJLabel);

        wisdomJTextField.setEditable(false);
        wisdomJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        wisdomJTextField.setText("10");
        wisdomJTextField.setToolTipText("(Animal Handling, Insight, Medicine, Perception, Survival)");
        attributesJPanel.add(wisdomJTextField);

        charismaJLabel.setText("Charisma:");
        attributesJPanel.add(charismaJLabel);

        charismaJTextField.setEditable(false);
        charismaJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        charismaJTextField.setText("10");
        charismaJTextField.setToolTipText("(Deception, Intimidation, Performance)");
        attributesJPanel.add(charismaJTextField);

        playersJPanel.add(attributesJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 31, 144, -1));

        characterAlignmentJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        characterAlignmentJLabel.setText("Alignment");
        playersJPanel.add(characterAlignmentJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        playerPBJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        playerPBJLabel.setText("+0");
        playerPBJLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        playersJPanel.add(playerPBJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Player Name:");
        playersJPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        playerNameJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Character Name:");
        playersJPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        characterNameJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        characterNameJLabel.setText("CHARACTER_NAME_HERE");
        playersJPanel.add(characterNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        modifiersJPanel.setBackground(new java.awt.Color(51, 51, 51));
        modifiersJPanel.setLayout(new java.awt.GridLayout(6, 2));

        strModJTextField.setEditable(false);
        strModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        strModJTextField.setText("+0");
        modifiersJPanel.add(strModJTextField);

        dexModJTextField.setEditable(false);
        dexModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dexModJTextField.setText("+0");
        modifiersJPanel.add(dexModJTextField);

        conModJTextField.setEditable(false);
        conModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        conModJTextField.setText("+0");
        modifiersJPanel.add(conModJTextField);

        intModJTextField.setEditable(false);
        intModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        intModJTextField.setText("+0");
        modifiersJPanel.add(intModJTextField);

        wisModJTextField.setEditable(false);
        wisModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        wisModJTextField.setText("+0");
        modifiersJPanel.add(wisModJTextField);

        charModJTextField.setEditable(false);
        charModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        charModJTextField.setText("+0");
        modifiersJPanel.add(charModJTextField);

        playersJPanel.add(modifiersJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 31, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Modifiers");
        playersJPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 6, 104, -1));

        trackablesJPanel.setBackground(new java.awt.Color(204, 204, 204));

        jLabel14.setText("G:");

        playerGoldJTextField.setBackground(new java.awt.Color(102, 102, 102));
        playerGoldJTextField.setText("0");
        playerGoldJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                playerGoldJTextFieldFocusLost(evt);
            }
        });

        jLabel17.setText("P:");

        playerPlatinumJTextField.setBackground(new java.awt.Color(102, 102, 102));
        playerPlatinumJTextField.setText("0");

        jLabel18.setText("C:");

        playerCopperJTextField.setBackground(new java.awt.Color(102, 102, 102));
        playerCopperJTextField.setText("0");
        playerCopperJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                playerCopperJTextFieldFocusLost(evt);
            }
        });

        playerSilverJTextField.setBackground(new java.awt.Color(102, 102, 102));
        playerSilverJTextField.setText("0");
        playerSilverJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                playerSilverJTextFieldFocusLost(evt);
            }
        });

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
                .addContainerGap(14, Short.MAX_VALUE))
        );
        trackablesJPanelLayout.setVerticalGroup(
            trackablesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, trackablesJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(playerSilverJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        playersJPanel.add(trackablesJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 210, 75));

        playerItemsJPanel.setBackground(new java.awt.Color(204, 204, 204));
        playerItemsJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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

        playerItemsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        playerWeaponsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        playerSpellsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        jLabel10.setText("Alignment:");
        playersJPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setText("Hit Points (Total/Current):");

        playerTotalHPJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        playerTotalHPJLabel.setText("XX");
        playerTotalHPJLabel.setToolTipText("Total hitpoints of the player.");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("/");

        subHPJTextField.setText("0");

        playerSubJButton.setText("Subtract from HP");
        playerSubJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerSubJButtonActionPerformed(evt);
            }
        });

        addHPJTextField.setText("0");

        playerAddJButton.setText("Add to HP");
        playerAddJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerAddJButtonActionPerformed(evt);
            }
        });

        playerCurrentHPJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        playerCurrentHPJLabel.setText("XX");
        playerCurrentHPJLabel.setToolTipText("Current hit points of the player.");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("Armor Class:");

        jTextField1.setEditable(false);
        jTextField1.setText("13");
        jTextField1.setToolTipText("Base AC is 13 + Dexterity Modifier");

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setText("+");

        jTextField4.setText("0");
        jTextField4.setToolTipText("Other AC not including Dexterity modifier");

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel31.setText("Saving Throws:");

        savingThrowsJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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
                            .addComponent(subHPJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(addHPJTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(playerAddJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(playerSubJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addComponent(subHPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(playerSubJButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerDefenceJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addHPJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerAddJButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        playersJPanel.add(playerDefenceJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 640, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setText("Class & Level:");
        playersJPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        characterClassJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        characterClassJLabel.setText("CHARACTERS CLASS");
        playersJPanel.add(characterClassJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setText("Proficiency Bonus:");
        playersJPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Race:");
        playersJPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        characterRaceJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        characterRaceJLabel.setText("CHARACTERS_RACE");
        playersJPanel.add(characterRaceJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setText("Skills:");

        playerSkillsJPanel.setLayout(new java.awt.GridLayout(9, 2));

        acrobaticsJCheckbox.setText("Acrobatics(Dex)");
        acrobaticsJCheckbox.setEnabled(false);
        acrobaticsJCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acrobaticsJCheckboxActionPerformed(evt);
            }
        });
        playerSkillsJPanel.add(acrobaticsJCheckbox);

        animalJCheckbox.setText("Animal Handling(Wis)");
        animalJCheckbox.setEnabled(false);
        playerSkillsJPanel.add(animalJCheckbox);

        arcanaJCheckbox.setText("Arcana(Int)");
        arcanaJCheckbox.setEnabled(false);
        playerSkillsJPanel.add(arcanaJCheckbox);

        athleticsJCheckbox.setText("Athletics(Str)");
        athleticsJCheckbox.setEnabled(false);
        playerSkillsJPanel.add(athleticsJCheckbox);

        deceptionJCheckbox.setText("Deception(Cha)");
        deceptionJCheckbox.setEnabled(false);
        deceptionJCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deceptionJCheckboxActionPerformed(evt);
            }
        });
        playerSkillsJPanel.add(deceptionJCheckbox);

        historyJCheckbox.setText("History(Int)");
        historyJCheckbox.setEnabled(false);
        playerSkillsJPanel.add(historyJCheckbox);

        insightJCheckbox.setText("Insight(Wis)");
        insightJCheckbox.setEnabled(false);
        playerSkillsJPanel.add(insightJCheckbox);

        intimidationJCheckbox.setText("Intimidation(Cha)");
        intimidationJCheckbox.setEnabled(false);
        playerSkillsJPanel.add(intimidationJCheckbox);

        investigationJCheckbox.setText("Investigation(Int)");
        investigationJCheckbox.setEnabled(false);
        playerSkillsJPanel.add(investigationJCheckbox);

        medicineJCheckbox.setText("Medicine(Wis)");
        medicineJCheckbox.setEnabled(false);
        playerSkillsJPanel.add(medicineJCheckbox);

        natureJCheckbox.setText("Nature(Int)");
        natureJCheckbox.setEnabled(false);
        playerSkillsJPanel.add(natureJCheckbox);

        perceptionJCheckbox.setText("Perception(Wis)");
        perceptionJCheckbox.setEnabled(false);
        playerSkillsJPanel.add(perceptionJCheckbox);

        performanceJCheckbox.setText("Performance(Cha)");
        performanceJCheckbox.setEnabled(false);
        playerSkillsJPanel.add(performanceJCheckbox);

        persuasionJCheckbox.setText("Persuasion(Cha)");
        persuasionJCheckbox.setEnabled(false);
        playerSkillsJPanel.add(persuasionJCheckbox);

        religionJCheckbox.setText("Religion(Int)");
        religionJCheckbox.setEnabled(false);
        playerSkillsJPanel.add(religionJCheckbox);

        sleightJCheckbox.setText("Sleight Of Hand(Dex)");
        sleightJCheckbox.setEnabled(false);
        playerSkillsJPanel.add(sleightJCheckbox);

        stealthJCheckbox.setText("Stealth(Dex)");
        stealthJCheckbox.setEnabled(false);
        playerSkillsJPanel.add(stealthJCheckbox);

        survivalJCheckbox.setText("Survival(Wis)");
        survivalJCheckbox.setEnabled(false);
        playerSkillsJPanel.add(survivalJCheckbox);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(playerSkillsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(playerSkillsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(73, 73, 73))
        );

        playersJPanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 320, 320));

        tabPanel.add(playersJPanel, "playersCard");

        npcJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        npcDetailsJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Character Name:");
        npcDetailsJPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        npcNameJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        npcNameJLabel.setText("CHARACTER_NAME_HERE");
        npcDetailsJPanel.add(npcNameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setText("Class & Level:");
        npcDetailsJPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        npcClassJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        npcClassJLabel.setText("CHARACTERS CLASS");
        npcDetailsJPanel.add(npcClassJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setText("Race:");
        npcDetailsJPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        npcAlignmentJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        npcAlignmentJLabel.setText("CHARACTERS_ALIGNMENT");
        npcDetailsJPanel.add(npcAlignmentJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel40.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel40.setText("Alignment:");
        npcDetailsJPanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        npcRaceJLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        npcRaceJLabel1.setText("CHARACTERS_RACE");
        npcDetailsJPanel.add(npcRaceJLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        editNPCJCheckBox.setText("Edit NPC");
        editNPCJCheckBox.setToolTipText("Click to enable/disable: (attributes, notes, and skills");
        editNPCJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNPCJCheckBoxActionPerformed(evt);
            }
        });
        npcDetailsJPanel.add(editNPCJCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel46.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel46.setText("Proficiency Bonus:");
        npcDetailsJPanel.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        npcPBJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        npcPBJLabel.setText("+0");
        npcPBJLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        npcDetailsJPanel.add(npcPBJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        npcJPanel.add(npcDetailsJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 130));

        npcNotesJTextArea.setEditable(false);
        npcNotesJTextArea.setColumns(20);
        npcNotesJTextArea.setRows(5);
        npcNotesJTextArea.setWrapStyleWord(true);
        jScrollPane2.setViewportView(npcNotesJTextArea);

        npcJPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 370, 490));

        npcItemsJPanel.setBackground(new java.awt.Color(204, 204, 204));
        npcItemsJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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

        npcItemsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        npcItemsJTable.setColumnSelectionAllowed(true);
        npcItemsJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(npcItemsJTable);
        npcItemsJTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        npcItemsJPanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 640, 180));

        npcWeaponsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        npcWeaponsJTable.setColumnSelectionAllowed(true);
        npcWeaponsJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(npcWeaponsJTable);
        npcWeaponsJTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        npcItemsJPanel.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 640, 100));

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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

        npcSpellsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        npcSpellsJTable.setColumnSelectionAllowed(true);
        npcSpellsJTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(npcSpellsJTable);
        npcSpellsJTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        npcItemsJPanel.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 640, 100));

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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
        jLabel32.setText("Inventory:");
        npcJPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, -1, -1));

        trackablesJPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel34.setText("G:");

        npcGoldJTextField.setBackground(new java.awt.Color(102, 102, 102));
        npcGoldJTextField.setText("0");
        npcGoldJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                npcGoldJTextFieldFocusLost(evt);
            }
        });

        jLabel43.setText("P:");

        npcPlatinumJTextField.setBackground(new java.awt.Color(102, 102, 102));
        npcPlatinumJTextField.setText("0");

        jLabel44.setText("C:");

        npcCopperJTextField.setBackground(new java.awt.Color(102, 102, 102));
        npcCopperJTextField.setText("0");
        npcCopperJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                npcCopperJTextFieldFocusLost(evt);
            }
        });

        npcSilverJTextField.setBackground(new java.awt.Color(102, 102, 102));
        npcSilverJTextField.setText("0");
        npcSilverJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                npcSilverJTextFieldFocusLost(evt);
            }
        });

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
                        .addComponent(npcPlatinumJTextField))
                    .addGroup(trackablesJPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(npcGoldJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(trackablesJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(trackablesJPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(npcCopperJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(trackablesJPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(npcSilverJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        trackablesJPanel1Layout.setVerticalGroup(
            trackablesJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, trackablesJPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(trackablesJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(npcGoldJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(npcCopperJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(trackablesJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(npcPlatinumJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(npcSilverJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        npcJPanel.add(trackablesJPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 210, 75));

        attributesJPanel1.setBackground(new java.awt.Color(204, 204, 204));
        attributesJPanel1.setToolTipText("");
        attributesJPanel1.setLayout(new java.awt.GridLayout(6, 3, 10, 0));

        strengthJLabel1.setText("Strength:");
        attributesJPanel1.add(strengthJLabel1);

        npcStrengthJTextField.setEditable(false);
        npcStrengthJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        npcStrengthJTextField.setText("10");
        npcStrengthJTextField.setToolTipText("(Athletics)");
        attributesJPanel1.add(npcStrengthJTextField);

        dexterityJLabel1.setText("Dexterity:");
        attributesJPanel1.add(dexterityJLabel1);

        npcDexterityJTextField.setEditable(false);
        npcDexterityJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        npcDexterityJTextField.setText("10");
        npcDexterityJTextField.setToolTipText("(Acrobatics, Stealth)");
        attributesJPanel1.add(npcDexterityJTextField);

        constitutionJLabel1.setText("Constitution:");
        attributesJPanel1.add(constitutionJLabel1);

        npcConstitutionJTextField.setEditable(false);
        npcConstitutionJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        npcConstitutionJTextField.setText("10");
        npcConstitutionJTextField.setToolTipText("");
        attributesJPanel1.add(npcConstitutionJTextField);

        intelligenceJLabel1.setText("Intelligence:");
        attributesJPanel1.add(intelligenceJLabel1);

        npcIntelligenceJTextField.setEditable(false);
        npcIntelligenceJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        npcIntelligenceJTextField.setText("10");
        npcIntelligenceJTextField.setToolTipText("(Arcana, History, Investigation, Nature, Religion)");
        attributesJPanel1.add(npcIntelligenceJTextField);

        wisdomJLabel1.setText("Wisdom:");
        attributesJPanel1.add(wisdomJLabel1);

        npcWisdomJTextField.setEditable(false);
        npcWisdomJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        npcWisdomJTextField.setText("10");
        npcWisdomJTextField.setToolTipText("(Animal Handling, Insight, Medicine, Perception, Survival)");
        attributesJPanel1.add(npcWisdomJTextField);

        charismaJLabel1.setText("Charisma:");
        attributesJPanel1.add(charismaJLabel1);

        npcCharismaJTextField.setEditable(false);
        npcCharismaJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        npcCharismaJTextField.setText("10");
        npcCharismaJTextField.setToolTipText("(Deception, Intimidation, Performance)");
        attributesJPanel1.add(npcCharismaJTextField);

        npcJPanel.add(attributesJPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 144, -1));

        modifiersJPanel1.setBackground(new java.awt.Color(51, 51, 51));
        modifiersJPanel1.setLayout(new java.awt.GridLayout(6, 2, 10, 0));

        npcStrModJTextField.setEditable(false);
        npcStrModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        npcStrModJTextField.setText("+0");
        modifiersJPanel1.add(npcStrModJTextField);

        npcDexModJTextField.setEditable(false);
        npcDexModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        npcDexModJTextField.setText("+0");
        modifiersJPanel1.add(npcDexModJTextField);

        npcConModJTextField.setEditable(false);
        npcConModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        npcConModJTextField.setText("+0");
        modifiersJPanel1.add(npcConModJTextField);

        npcIntModJTextField.setEditable(false);
        npcIntModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        npcIntModJTextField.setText("+0");
        modifiersJPanel1.add(npcIntModJTextField);

        npcWisModJTextField.setEditable(false);
        npcWisModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        npcWisModJTextField.setText("+0");
        modifiersJPanel1.add(npcWisModJTextField);

        npcCharModJTextField.setEditable(false);
        npcCharModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        npcCharModJTextField.setText("+0");
        modifiersJPanel1.add(npcCharModJTextField);

        npcJPanel.add(modifiersJPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, -1, -1));

        jLabel48.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel48.setText("Hit Points (Total/Current):");

        npcTotalHPJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        npcTotalHPJLabel.setText("XX");
        npcTotalHPJLabel.setToolTipText("Total hitpoints of the player.");

        jLabel49.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel49.setText("/");

        npcSubHPJTextField.setText("0");

        npcSubHPJButton.setText("Subtract from HP");
        npcSubHPJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npcSubHPJButtonActionPerformed(evt);
            }
        });

        npcAddHPJTextField.setText("0");

        npcAddHPJButton.setText("Add to HP");
        npcAddHPJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npcAddHPJButtonActionPerformed(evt);
            }
        });

        npcCurrentHPJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        npcCurrentHPJLabel.setText("XX");
        npcCurrentHPJLabel.setToolTipText("Current hit points of the player.");

        jLabel50.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel50.setText("Armor Class:");

        npcACJTextField.setEditable(false);
        npcACJTextField.setText("13");
        npcACJTextField.setToolTipText("Base AC is 13 + Dexterity Modifier");

        jLabel51.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel51.setText("+");

        npcOtherACJTextField.setText("0");
        npcOtherACJTextField.setToolTipText("Other AC not including Dexterity modifier");

        jLabel52.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel52.setText("Saving Throws:");

        npcSavingThrowsJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        npcJPanel.add(playerDefenceJPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 640, -1));

        jLabel53.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel53.setText("Character Notes:");
        npcJPanel.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel58.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel58.setText("Skills:");

        npcSkillsJPanel.setLayout(new java.awt.GridLayout(9, 2));

        npcAcrobaticsJCheckbox.setText("Acrobatics(Dex)");
        npcAcrobaticsJCheckbox.setEnabled(false);
        npcAcrobaticsJCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npcAcrobaticsJCheckboxActionPerformed(evt);
            }
        });
        npcSkillsJPanel.add(npcAcrobaticsJCheckbox);

        npcAnimalJCheckbox.setText("Animal Handling(Wis)");
        npcAnimalJCheckbox.setEnabled(false);
        npcSkillsJPanel.add(npcAnimalJCheckbox);

        npcArcanaJCheckbox.setText("Arcana(Int)");
        npcArcanaJCheckbox.setEnabled(false);
        npcSkillsJPanel.add(npcArcanaJCheckbox);

        npcAthleticsJCheckbox.setText("Athletics(Str)");
        npcAthleticsJCheckbox.setEnabled(false);
        npcSkillsJPanel.add(npcAthleticsJCheckbox);

        npcDeceptionJCheckbox.setText("Deception(Cha)");
        npcDeceptionJCheckbox.setEnabled(false);
        npcDeceptionJCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                npcDeceptionJCheckboxActionPerformed(evt);
            }
        });
        npcSkillsJPanel.add(npcDeceptionJCheckbox);

        npcHistoryJCheckbox.setText("History(Int)");
        npcHistoryJCheckbox.setEnabled(false);
        npcSkillsJPanel.add(npcHistoryJCheckbox);

        npcInsightJCheckbox.setText("Insight(Wis)");
        npcInsightJCheckbox.setEnabled(false);
        npcSkillsJPanel.add(npcInsightJCheckbox);

        npcIntimidationJCheckbox.setText("Intimidation(Cha)");
        npcIntimidationJCheckbox.setEnabled(false);
        npcSkillsJPanel.add(npcIntimidationJCheckbox);

        npcInvestigationJCheckbox.setText("Investigation(Int)");
        npcInvestigationJCheckbox.setEnabled(false);
        npcSkillsJPanel.add(npcInvestigationJCheckbox);

        npcMedicineJCheckbox.setText("Medicine(Wis)");
        npcMedicineJCheckbox.setEnabled(false);
        npcSkillsJPanel.add(npcMedicineJCheckbox);

        npcNatureJCheckbox.setText("Nature(Int)");
        npcNatureJCheckbox.setEnabled(false);
        npcSkillsJPanel.add(npcNatureJCheckbox);

        npcPerceptionJCheckbox.setText("Perception(Wis)");
        npcPerceptionJCheckbox.setEnabled(false);
        npcSkillsJPanel.add(npcPerceptionJCheckbox);

        npcPerformanceJCheckbox.setText("Performance(Cha)");
        npcPerformanceJCheckbox.setEnabled(false);
        npcSkillsJPanel.add(npcPerformanceJCheckbox);

        npcPersuasionJCheckbox.setText("Persuasion(Cha)");
        npcPersuasionJCheckbox.setEnabled(false);
        npcSkillsJPanel.add(npcPersuasionJCheckbox);

        npcReligionJCheckbox.setText("Religion(Int)");
        npcReligionJCheckbox.setEnabled(false);
        npcSkillsJPanel.add(npcReligionJCheckbox);

        npcSleightJCheckbox.setText("Sleight Of Hand(Dex)");
        npcSleightJCheckbox.setEnabled(false);
        npcSkillsJPanel.add(npcSleightJCheckbox);

        npcStealthJCheckbox.setText("Stealth(Dex)");
        npcStealthJCheckbox.setEnabled(false);
        npcSkillsJPanel.add(npcStealthJCheckbox);

        npcSurvivalJCheckbox.setText("Survival(Wis)");
        npcSurvivalJCheckbox.setEnabled(false);
        npcSkillsJPanel.add(npcSurvivalJCheckbox);

        javax.swing.GroupLayout npcSkillsControllerJPanelLayout = new javax.swing.GroupLayout(npcSkillsControllerJPanel);
        npcSkillsControllerJPanel.setLayout(npcSkillsControllerJPanelLayout);
        npcSkillsControllerJPanelLayout.setHorizontalGroup(
            npcSkillsControllerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(npcSkillsControllerJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(npcSkillsControllerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58)
                    .addComponent(npcSkillsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        npcSkillsControllerJPanelLayout.setVerticalGroup(
            npcSkillsControllerJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(npcSkillsControllerJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(npcSkillsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(73, 73, 73))
        );

        npcJPanel.add(npcSkillsControllerJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 320, 320));

        tabPanel.add(npcJPanel, "npcCard");

        locationNotesJTextArea.setEditable(false);
        locationNotesJTextArea.setColumns(20);
        locationNotesJTextArea.setRows(5);
        locationNotesJTextArea.setWrapStyleWord(true);
        jScrollPane9.setViewportView(locationNotesJTextArea);

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel33.setText("Location Notes:");

        npcItemsJPanel1.setBackground(new java.awt.Color(204, 204, 204));
        npcItemsJPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
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
                        .addGap(0, 554, Short.MAX_VALUE))
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
                .addGap(0, 39, Short.MAX_VALUE)
                .addComponent(jLabel57)
                .addGap(1178, 1178, 1178))
            .addGroup(eventsNotesJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 1329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        eventsNotesJPanelLayout.setVerticalGroup(
            eventsNotesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eventsNotesJPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        tabPanel.add(eventsNotesJPanel, "eventsCard");

        getContentPane().add(tabPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 161, -1, 670));

        pagesList.setBackground(new java.awt.Color(77, 67, 67));
        pagesList.setForeground(new java.awt.Color(255, 255, 255));
        pagesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Home", "Players", "NPC's", "Notes" };
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
        removePlayerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePlayerJButtonActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.GridBagLayout());

        welcomeLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        welcomeLabel2.setText("Player Information");
        welcomeLabel2.setToolTipText("");
        jPanel2.add(welcomeLabel2, new java.awt.GridBagConstraints());

        savePlayerJButton.setText("Save Player");
        savePlayerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePlayerJButtonActionPerformed(evt);
            }
        });

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
                    .addComponent(removePlayerJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(savePlayerJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        playerControlsJPanelLayout.setVerticalGroup(
            playerControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playerControlsJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(playerControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerControlsJPanelLayout.createSequentialGroup()
                        .addComponent(newPlayerJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removePlayerJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(savePlayerJButton)
                        .addGap(12, 12, 12))
                    .addGroup(playerControlsJPanelLayout.createSequentialGroup()
                        .addComponent(playersJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pageControlsJPanel.add(playerControlsJPanel, "playerControlsCard");

        npcJList.setBackground(new java.awt.Color(77, 67, 67));
        npcJList.setForeground(new java.awt.Color(255, 255, 255));
        npcJList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                npcJListValueChanged(evt);
            }
        });
        playersJScrollPanel1.setViewportView(npcJList);

        jLabel1.setText("NPC/Enemy");

        addNPCJButton.setText("Add NPC/Enemy");
        addNPCJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNPCJButtonActionPerformed(evt);
            }
        });

        removeNPCJButton.setText("Remove NPC/Enemy");
        removeNPCJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNPCJButtonActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridBagLayout());

        welcomeLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        welcomeLabel1.setText("NPC/Enemy Information");
        welcomeLabel1.setToolTipText("");
        jPanel1.add(welcomeLabel1, new java.awt.GridBagConstraints());

        saveNPCJButton.setText("Save NPC/Enemy");
        saveNPCJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNPCJButtonActionPerformed(evt);
            }
        });

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
                    .addComponent(addNPCJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saveNPCJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
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
                        .addGroup(npcControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(npcControlsJPanelLayout.createSequentialGroup()
                                .addComponent(addNPCJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removeNPCJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saveNPCJButton))
                            .addGroup(npcControlsJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(playersJScrollPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeLocationJButton))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pageControlsJPanel.add(locationControlsJPanel, "locationControlsCard");

        jPanel4.setLayout(new java.awt.GridBagLayout());

        welcomeLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        welcomeLabel4.setText("Notes");
        welcomeLabel4.setToolTipText("");
        jPanel4.add(welcomeLabel4, new java.awt.GridBagConstraints());

        saveNotesJButton.setText("Save Notes");
        saveNotesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveNotesJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout eventControlsJPanelLayout = new javax.swing.GroupLayout(eventControlsJPanel);
        eventControlsJPanel.setLayout(eventControlsJPanelLayout);
        eventControlsJPanelLayout.setHorizontalGroup(
            eventControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eventControlsJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saveNotesJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        eventControlsJPanelLayout.setVerticalGroup(
            eventControlsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eventControlsJPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveNotesJButton)
                .addContainerGap())
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

        jMenuItem2.setText("Save");
        fileMenu.add(jMenuItem2);

        loadJMenuItem.setText("Load");
        loadJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadJMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(loadJMenuItem);

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
        else if(pagesList.getSelectedValue() == "Notes")
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
            for(Component c : playerSkillsJPanel.getComponents())
            {
                ((JCheckBox)c).setEnabled(true);
            }
            //skillsJTextArea.setEditable(true);
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
            for(Component c : playerSkillsJPanel.getComponents())
            {
                ((JCheckBox)c).setEnabled(false);
            }
            //skillsJTextArea.setEditable(false);
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
        int index = playersJList.getSelectedIndex();
        if(index != -1)
        {
            Player currentPlayer = DATABASE.getPlayerList().get(index);
            playerNameJLabel.setText(currentPlayer.getPlayerName());
            characterNameJLabel.setText(currentPlayer.getName());
            characterClassJLabel.setText(currentPlayer.getPlayerClass().toString());
            characterRaceJLabel.setText(currentPlayer.getRace().toString());
            characterAlignmentJLabel.setText(currentPlayer.getAlignment());
            int[] playerAttributes = currentPlayer.getStats();
            playerNotesJTextArea.setText(currentPlayer.getPlayerNotes());
            strengthJTextField.setText(Integer.toString(playerAttributes[0]));
            dexterityJTextField.setText(Integer.toString(playerAttributes[1]));
            constitutionJTextField.setText(Integer.toString(playerAttributes[2]));
            intelligenceJTextField.setText(Integer.toString(playerAttributes[3]));
            wisdomJTextField.setText(Integer.toString(playerAttributes[4]));
            charismaJTextField.setText(Integer.toString(playerAttributes[5]));
            playerPBJLabel.setText("+" + currentPlayer.getProfBonus());
            strModJTextField.setText("+" + Integer.toString(calculateModifier(playerAttributes[0])));
            dexModJTextField.setText("+" + Integer.toString(calculateModifier(playerAttributes[1])));
            conModJTextField.setText("+" + Integer.toString(calculateModifier(playerAttributes[2])));
            intModJTextField.setText("+" + Integer.toString(calculateModifier(playerAttributes[3])));
            wisModJTextField.setText("+" + Integer.toString(calculateModifier(playerAttributes[4])));
            charModJTextField.setText("+" + Integer.toString(calculateModifier(playerAttributes[5])));
            
            //Set text for monies
            playerPlatinumJTextField.setText(Integer.toString(currentPlayer.getPlayerCurrency()[0]));
            playerGoldJTextField.setText(Integer.toString(currentPlayer.getPlayerCurrency()[1]));
            playerSilverJTextField.setText(Integer.toString(currentPlayer.getPlayerCurrency()[2]));
            playerCopperJTextField.setText(Integer.toString(currentPlayer.getPlayerCurrency()[3]));

            savingThrowsJLabel.setText(currentPlayer.getSaves());
            playerTotalHPJLabel.setText(Integer.toString(currentPlayer.getTotalHP()));
            playerCurrentHPJLabel.setText(Integer.toString(currentPlayer.getCurrentHP()));
            clearSkills(playerSkillsJPanel);
            populateSkills(currentPlayer.getSkillProfs(), playerSkillsJPanel);
            
            //Populate Tables
            
            
            
            
            
            if(currentPlayer.getItems() != null)
            {
               populateModel(currentPlayer); 
            }
            else
            {
                    //make sure rows are empty for all tables
                    DefaultTableModel itemModel = (DefaultTableModel)playerItemsJTable.getModel();
        
                    int itemRowCount = itemModel.getRowCount();
                    for(int i = itemRowCount - 1; i >= 0; i--)
                    {
                        itemModel.removeRow(i);
                    }
                    
                    DefaultTableModel weaponModel = (DefaultTableModel)playerWeaponsJTable.getModel();
                    
                    int weaponRowCount = weaponModel.getRowCount();
                    for(int i = weaponRowCount - 1; i >= 0; i--)
                    {
                        weaponModel.removeRow(i);
                    }
                    
                    DefaultTableModel spellModel = (DefaultTableModel)playerSpellsJTable.getModel();
                    
                    int spellRowCount = spellModel.getRowCount();
                    for(int i = spellRowCount - 1; i >= 0; i--)
                    {
                        spellModel.removeRow(i);
                    }
                    
            }
        }
        
        
    }//GEN-LAST:event_playersJListValueChanged
    /**
     * Method for populating item tables on the player page
     */
    public void populateModel(Player currentPlayer)
    {
        //Change values in itemTable
        DefaultTableModel itemModel = (DefaultTableModel)playerItemsJTable.getModel();
        int rowCount = itemModel.getRowCount();
        for(int i = rowCount - 1; i >= 0; i--)
        {
            itemModel.removeRow(i);
        }
        
        int itemRows = currentPlayer.getItems().length;
        
        for(int i = 0; i < itemRows; i++)
        {
            itemModel.addRow(currentPlayer.getItems()[i]);
        }
        playerItemsJTable.setModel(itemModel);
        
        //Change values in weapon table
        DefaultTableModel weaponModel = (DefaultTableModel)playerWeaponsJTable.getModel();
        int weaponRowCount = weaponModel.getRowCount();
        for(int i = weaponRowCount - 1; i >= 0; i--)
        {
            weaponModel.removeRow(i);
        }
        
        int weaponRows = currentPlayer.getWeapons().length;
        for(int i = 0; i < weaponRows; i++)
        {
            weaponModel.addRow(currentPlayer.getWeapons()[i]);
        }
        playerWeaponsJTable.setModel(weaponModel);
        
        //Change values in spell table
        DefaultTableModel spellModel = (DefaultTableModel)playerSpellsJTable.getModel();
        int spellRowCount = spellModel.getRowCount();
        for(int i = spellRowCount - 1; i >= 0; i--)
        {
            spellModel.removeRow(i);
        }
        
        int spellRows = currentPlayer.getSpells().length;
        for(int i = 0; i < spellRows; i ++)
        {
            spellModel.addRow(currentPlayer.getSpells()[i]);
        }
        playerSpellsJTable.setModel(spellModel);
    }
    
    public void clearSkills(JPanel currentPanel)
    {
        int count = 0;
        for(Component c : currentPanel.getComponents())
        {
            ((JCheckBox)c).setSelected(false);
        }
    }
    
    /**
     * With parameter player skillProficiencies populate the skills on 
     * playerSkillsJPanel with the appropriate values. 
     * @param skillProficiencies 
     */
    private void populateSkills(boolean[] skillProficiencies, JPanel panel)
    {
        int count = 0;
        for(Component c : panel.getComponents())
        {
            if(skillProficiencies[count] == true)
            {
                
                ((JCheckBox)c).setSelected(true);
            }
            count++;
            
        }
    }
    
    public int calculateModifier(int attributeValue)
    {
        int modifier = 0;
        if(attributeValue == 0)
        {
            return -5;
        }
        else if(attributeValue < 2)
        {
            return -4;
        }
        else if(attributeValue < 4)
        {
            return -3;
        }
        else if(attributeValue < 6)
        {
            return -2;
        }
        else if(attributeValue < 8)
        {
            return -1;
        }
        if(attributeValue < 12)
        {
            return 0;
        }
        else if(attributeValue < 14)
        {
            return 1;
        }
        else if(attributeValue < 16)
        {
            return 2;
        }
        else if(attributeValue < 18)
        {
            return 3;
        }
        else if(attributeValue < 20)
        {
            return 4;
        }
        else if(attributeValue >= 20)
        {
            return 5;
        }
        
        return modifier;
    }
    
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
        calculateCurrency();
    }//GEN-LAST:event_playerGoldJTextFieldFocusLost
    private void calculateCurrency()
    {
        int copper = Integer.parseInt(playerCopperJTextField.getText());
        int silver = Integer.parseInt(playerSilverJTextField.getText());
        int gold = Integer.parseInt(playerGoldJTextField.getText());
        int platinum = Integer.parseInt(playerPlatinumJTextField.getText());
        int newCopper;
        int newSilver;
        int newGold;
        int newPlatinum;
        if(copper > 9)
        {
            newCopper = copper % 10;
            playerCopperJTextField.setText(Integer.toString(newCopper));
            silver = silver + (copper/10);
            playerSilverJTextField.setText(Integer.toString(silver));
            
        }
        if(silver > 9)
        {
            newSilver = silver % 10;
            playerSilverJTextField.setText(Integer.toString(newSilver));
            gold = gold +(silver/10);
            playerGoldJTextField.setText(Integer.toString(gold));
        }
        if(gold > 9)
        {
            newGold = gold % 10;
            playerGoldJTextField.setText(Integer.toString(newGold));
            platinum = platinum + (gold/10);
            playerPlatinumJTextField.setText(Integer.toString(platinum));
        }
        
        //playerCopperJTextField.setText(Integer.toString(newCopper));
        //playerSilverJTextField.setText(Integer.toString(silver));
        //playerGoldJTextField.setText(Integer.toString(gold));
        //playerPlatinumJTextField.setText(Integer.toString(platinum));
        
    }
    private void calculateNPCCurrency()
    {
        int copper = Integer.parseInt(npcCopperJTextField.getText());
        int silver = Integer.parseInt(npcSilverJTextField.getText());
        int gold = Integer.parseInt(npcGoldJTextField.getText());
        int platinum = Integer.parseInt(npcPlatinumJTextField.getText());
        int newCopper;
        int newSilver;
        int newGold;
        int newPlatinum;
        if(copper > 9)
        {
            newCopper = copper % 10;
            npcCopperJTextField.setText(Integer.toString(newCopper));
            silver = silver + (copper/10);
            npcSilverJTextField.setText(Integer.toString(silver));
            
        }
        if(silver > 9)
        {
            newSilver = silver % 10;
            npcSilverJTextField.setText(Integer.toString(newSilver));
            gold = gold +(silver/10);
            npcGoldJTextField.setText(Integer.toString(gold));
        }
        if(gold > 9)
        {
            newGold = gold % 10;
            npcGoldJTextField.setText(Integer.toString(newGold));
            platinum = platinum + (gold/10);
            npcPlatinumJTextField.setText(Integer.toString(platinum));
        }
        
    }
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
        newPlayerUI newPlayer = new newPlayerUI(this);
        newPlayer.setLocationRelativeTo(null);
        newPlayer.setVisible(true);
        
        
    }//GEN-LAST:event_newPlayerJButtonActionPerformed
    /**
     * Called from outside class to update the player list if a new one is added
     * 
     */
    public void updatePlayerList()
    {
        
        //update playerList
        playerList = DATABASE.getPlayerList();
        DefaultListModel model = new DefaultListModel();
        for(int i= 0; i < playerList.size(); i++)
        {
            model.addElement(playerList.get(i).getPlayerName());
        }
        playersJList.setModel(model);
        
        playersJList.setSelectedIndex(playersJList.getModel().getSize()-1);
        
    }
    /**
     * get all the data from a given table
     * @param table
     * @return 
     */
    public Object[][] getTableData(JTable table)
    {
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        int nRow = model.getRowCount();
        int nCol = model.getColumnCount();
        Object[][] tableData = new Object[nRow][nCol];
        
        for(int i = 0; i < nRow; i++)
        {
            for(int j = 0; j < nCol; j++)
            {
                tableData[i][j] = model.getValueAt(i, j);
            }
        }
        return tableData;
    }
    public void updateNPCList()
    {
        npcList = DATABASE.getNPCList();
        DefaultListModel model = new DefaultListModel();
        for(int i = 0; i < npcList.size(); i++)
        {
            model.addElement(npcList.get(i).getName());
        }
        npcJList.setModel(model);
        npcJList.setSelectedIndex(npcJList.getModel().getSize()-1);
    }
    
    private void npcJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_npcJListValueChanged
        int index = npcJList.getSelectedIndex();
        if(index != -1)
        {
            Player currentNPC = DATABASE.getNPCList().get(index);
            npcNameJLabel.setText(currentNPC.getName());
            npcClassJLabel.setText(currentNPC.getPlayerClass().toString());
            characterRaceJLabel.setText(currentNPC.getRace().toString());
            npcAlignmentJLabel.setText(currentNPC.getAlignment());
            npcNotesJTextArea.setText(currentNPC.getPlayerNotes());
            
            //populate attributes
            int[] npcAttributes = currentNPC.getStats();
            npcStrengthJTextField.setText(Integer.toString(npcAttributes[0]));
            npcDexterityJTextField.setText(Integer.toString(npcAttributes[1]));
            npcConstitutionJTextField.setText(Integer.toString(npcAttributes[2]));
            npcIntelligenceJTextField.setText(Integer.toString(npcAttributes[3]));
            npcWisdomJTextField.setText(Integer.toString(npcAttributes[4]));
            npcCharismaJTextField.setText(Integer.toString(npcAttributes[5]));
            npcPBJLabel.setText("+" + currentNPC.getProfBonus());
            
            npcStrModJTextField.setText("+" + Integer.toString(calculateModifier(npcAttributes[0])));
            npcDexModJTextField.setText("+" + Integer.toString(calculateModifier(npcAttributes[1])));
            npcConModJTextField.setText("+" + Integer.toString(calculateModifier(npcAttributes[2])));
            npcIntModJTextField.setText("+" + Integer.toString(calculateModifier(npcAttributes[3])));
            npcWisModJTextField.setText("+" + Integer.toString(calculateModifier(npcAttributes[4])));
            npcCharModJTextField.setText("+" + Integer.toString(calculateModifier(npcAttributes[5])));
            
            //set text for monies
            npcPlatinumJTextField.setText(Integer.toString(currentNPC.getPlayerCurrency()[0]));
            npcGoldJTextField.setText(Integer.toString(currentNPC.getPlayerCurrency()[1]));
            npcSilverJTextField.setText(Integer.toString(currentNPC.getPlayerCurrency()[2]));
            npcCopperJTextField.setText(Integer.toString(currentNPC.getPlayerCurrency()[3]));
            
            //condition stuff
            npcSavingThrowsJLabel.setText(currentNPC.getSaves());
            npcTotalHPJLabel.setText(Integer.toString(currentNPC.getTotalHP()));
            npcCurrentHPJLabel.setText(Integer.toString(currentNPC.getCurrentHP()));
            clearSkills(npcSkillsJPanel);
            populateSkills(currentNPC.getSkillProfs(), npcSkillsJPanel);
            
            //populate Tables
            if(currentNPC.getItems() != null)
            {
               populateNPCModel(currentNPC); 
            }
            else
            {
                    //make sure rows are empty for all tables
                    DefaultTableModel itemModel = (DefaultTableModel)npcItemsJTable.getModel();
        
                    int itemRowCount = itemModel.getRowCount();
                    for(int i = itemRowCount - 1; i >= 0; i--)
                    {
                        itemModel.removeRow(i);
                    }
                    
                    DefaultTableModel weaponModel = (DefaultTableModel)npcWeaponsJTable.getModel();
                    
                    int weaponRowCount = weaponModel.getRowCount();
                    for(int i = weaponRowCount - 1; i >= 0; i--)
                    {
                        weaponModel.removeRow(i);
                    }
                    
                    DefaultTableModel spellModel = (DefaultTableModel)npcSpellsJTable.getModel();
                    
                    int spellRowCount = spellModel.getRowCount();
                    for(int i = spellRowCount - 1; i >= 0; i--)
                    {
                        spellModel.removeRow(i);
                    }
                    
            }
        
        }
    }//GEN-LAST:event_npcJListValueChanged
    
    public void populateNPCModel(Player currentNPC)
    {
        //Change values in itemTable
        DefaultTableModel itemModel = (DefaultTableModel)npcItemsJTable.getModel();
        int rowCount = itemModel.getRowCount();
        for(int i = rowCount - 1; i >= 0; i--)
        {
            itemModel.removeRow(i);
        }
        
        int itemRows = currentNPC.getItems().length;
        
        for(int i = 0; i < itemRows; i++)
        {
            itemModel.addRow(currentNPC.getItems()[i]);
        }
        npcItemsJTable.setModel(itemModel);
        
        //Change values in weapon table
        DefaultTableModel weaponModel = (DefaultTableModel)npcWeaponsJTable.getModel();
        int weaponRowCount = weaponModel.getRowCount();
        for(int i = weaponRowCount - 1; i >= 0; i--)
        {
            weaponModel.removeRow(i);
        }
        
        int weaponRows = currentNPC.getWeapons().length;
        for(int i = 0; i < weaponRows; i++)
        {
            weaponModel.addRow(currentNPC.getWeapons()[i]);
        }
        npcWeaponsJTable.setModel(weaponModel);
        
        //Change values in spell table
        DefaultTableModel spellModel = (DefaultTableModel)npcSpellsJTable.getModel();
        int spellRowCount = spellModel.getRowCount();
        for(int i = spellRowCount - 1; i >= 0; i--)
        {
            spellModel.removeRow(i);
        }
        
        int spellRows = currentNPC.getSpells().length;
        for(int i = 0; i < spellRows; i ++)
        {
            spellModel.addRow(currentNPC.getSpells()[i]);
        }
        npcSpellsJTable.setModel(spellModel);
    }
    
    private void addNPCItemJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNPCItemJButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)npcItemsJTable.getModel();
        model.addRow(new Object[]{});
    }//GEN-LAST:event_addNPCItemJButtonActionPerformed

    private void removeNPCItemJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNPCItemJButtonActionPerformed
        int selection = JOptionPane.showConfirmDialog(pagesJPanel, "This will remove the selected"
                + "value from the Item Table. Would you like to continue?");
        
        if(selection == JOptionPane.YES_OPTION)
        {
            if(npcItemsJTable.getSelectedRow() != -1)
            {
                //remove selected row from Table
                DefaultTableModel model = (DefaultTableModel)npcItemsJTable.getModel();
                model.removeRow(npcItemsJTable.getSelectedRow());
            }
            else
            {
                JOptionPane.showMessageDialog(pagesJPanel, "No value selected.");
            }
            
        }
    }//GEN-LAST:event_removeNPCItemJButtonActionPerformed

    private void addNPCWeaponJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNPCWeaponJButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)npcWeaponsJTable.getModel();
        model.addRow(new Object[]{});
    }//GEN-LAST:event_addNPCWeaponJButtonActionPerformed

    private void removeNPCWeaponJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNPCWeaponJButtonActionPerformed
        int selection = JOptionPane.showConfirmDialog(pagesJPanel, "This will remove the selected"
                + "value from the Item Table. Would you like to continue?");
        
        if(selection == JOptionPane.YES_OPTION)
        {
            if(npcWeaponsJTable.getSelectedRow() != -1)
            {
                //remove selected row from Table
                DefaultTableModel model = (DefaultTableModel)npcWeaponsJTable.getModel();
                model.removeRow(npcWeaponsJTable.getSelectedRow());
            }
            else
            {
                JOptionPane.showMessageDialog(pagesJPanel, "No value selected.");
            }
            
        }
    }//GEN-LAST:event_removeNPCWeaponJButtonActionPerformed

    private void addNPCSpellJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNPCSpellJButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)npcSpellsJTable.getModel();
        model.addRow(new Object[]{});
    }//GEN-LAST:event_addNPCSpellJButtonActionPerformed

    private void removeNPCSpellJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNPCSpellJButtonActionPerformed
        int selection = JOptionPane.showConfirmDialog(pagesJPanel, "This will remove the selected"
                + "value from the Item Table. Would you like to continue?");
        
        if(selection == JOptionPane.YES_OPTION)
        {
            if(npcSpellsJTable.getSelectedRow() != -1)
            {
                //remove selected row from Table
                DefaultTableModel model = (DefaultTableModel)npcSpellsJTable.getModel();
                model.removeRow(npcSpellsJTable.getSelectedRow());
            }
            else
            {
                JOptionPane.showMessageDialog(pagesJPanel, "No value selected.");
            }
            
        }
    }//GEN-LAST:event_removeNPCSpellJButtonActionPerformed

    private void npcGoldJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_npcGoldJTextFieldFocusLost
        calculateNPCCurrency();
    }//GEN-LAST:event_npcGoldJTextFieldFocusLost

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

    private void acrobaticsJCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acrobaticsJCheckboxActionPerformed

    }//GEN-LAST:event_acrobaticsJCheckboxActionPerformed

    private void playerSubJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerSubJButtonActionPerformed
        int amount = Integer.parseInt(subHPJTextField.getText());
        Player player = DATABASE.getPlayerList().get(playersJList.getSelectedIndex());
        player.setCurrentHP(player.getCurrentHP() - amount);
        playerCurrentHPJLabel.setText(Integer.toString(player.getCurrentHP()));
        
    }//GEN-LAST:event_playerSubJButtonActionPerformed

    private void playerAddJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerAddJButtonActionPerformed
        int amount = Integer.parseInt(addHPJTextField.getText());
        Player player = DATABASE.getPlayerList().get(playersJList.getSelectedIndex());
        player.setCurrentHP(player.getCurrentHP() + amount);
        playerCurrentHPJLabel.setText(Integer.toString(player.getCurrentHP()));
    }//GEN-LAST:event_playerAddJButtonActionPerformed

    private void deceptionJCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deceptionJCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deceptionJCheckboxActionPerformed

    private void playerNotesJTextAreaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_playerNotesJTextAreaFocusLost
        //Player player = DATABASE.getPlayerList().get(playersJList.getSelectedIndex());
        //player.setPlayerNotes(playerNotesJTextArea.getText());
    }//GEN-LAST:event_playerNotesJTextAreaFocusLost

    private void playerNotesJTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_playerNotesJTextAreaFocusGained
        //Player player = DATABASE.getPlayerList().get(playersJList.getSelectedIndex());
        //player.setPlayerNotes(playerNotesJTextArea.getText());
    }//GEN-LAST:event_playerNotesJTextAreaFocusGained

    private void playerNotesJTextAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_playerNotesJTextAreaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_playerNotesJTextAreaKeyTyped
    /**
     * Remove the currently selected player
     * @param evt 
     */
    private void removePlayerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePlayerJButtonActionPerformed
        int selection = JOptionPane.showConfirmDialog(pagesJPanel,
                "This will delete the currently selected player... Continue?");
        if(selection == 0)
        {
            DATABASE.getPlayerList().remove(playersJList.getSelectedIndex());
            updatePlayerList();
        }
    }//GEN-LAST:event_removePlayerJButtonActionPerformed
    /**
     * Save the current state of the currently selected player.
     * @param evt 
     */
    private void savePlayerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePlayerJButtonActionPerformed
        Player player = DATABASE.getPlayerList().get(playersJList.getSelectedIndex());
        
        //save Player Notes
        player.setPlayerNotes(playerNotesJTextArea.getText());
        //Save Attributes
        player.setStats(getPlayerStats());
        //update modifiers
        //Save Skills
        player.setSkillProfs(getPlayerSkills());
        //Save the monies
        int[] moneyArray = {Integer.parseInt(playerPlatinumJTextField.getText()),
                Integer.parseInt(playerGoldJTextField.getText()),
                Integer.parseInt(playerSilverJTextField.getText()),
                Integer.parseInt(playerCopperJTextField.getText())};
        player.setPlayerCurrency(moneyArray);
        
        player.setItems(getTableData(playerItemsJTable));
        player.setWeapons(getTableData(playerWeaponsJTable));
        player.setSpells(getTableData(playerSpellsJTable));
        
    }//GEN-LAST:event_savePlayerJButtonActionPerformed

    private void strengthJTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_strengthJTextFieldKeyTyped
        
    }//GEN-LAST:event_strengthJTextFieldKeyTyped

    private void strengthJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_strengthJTextFieldFocusLost

    }//GEN-LAST:event_strengthJTextFieldFocusLost

    private void playerCopperJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_playerCopperJTextFieldFocusLost
        calculateCurrency();
    }//GEN-LAST:event_playerCopperJTextFieldFocusLost

    private void playerSilverJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_playerSilverJTextFieldFocusLost
        calculateCurrency();
    }//GEN-LAST:event_playerSilverJTextFieldFocusLost
    
    private void addNPCJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNPCJButtonActionPerformed
        newPlayerUI npc = new newPlayerUI(this, true);
        npc.setLocationRelativeTo(null);
        npc.setVisible(true);
        
    }//GEN-LAST:event_addNPCJButtonActionPerformed

    private void npcAcrobaticsJCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npcAcrobaticsJCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_npcAcrobaticsJCheckboxActionPerformed

    private void npcDeceptionJCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npcDeceptionJCheckboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_npcDeceptionJCheckboxActionPerformed

    private void npcSubHPJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npcSubHPJButtonActionPerformed
        int amount = Integer.parseInt(npcSubHPJTextField.getText());
        Player npc = DATABASE.getNPCList().get(npcJList.getSelectedIndex());
        npc.setCurrentHP(npc.getCurrentHP() - amount);
        npcCurrentHPJLabel.setText(Integer.toString(npc.getCurrentHP()));
        
    }//GEN-LAST:event_npcSubHPJButtonActionPerformed

    private void npcAddHPJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npcAddHPJButtonActionPerformed
        int amount = Integer.parseInt(npcAddHPJTextField.getText());
        Player npc = DATABASE.getNPCList().get(npcJList.getSelectedIndex());
        npc.setCurrentHP(npc.getCurrentHP() + amount);
        npcCurrentHPJLabel.setText(Integer.toString(npc.getCurrentHP()));
    }//GEN-LAST:event_npcAddHPJButtonActionPerformed

    private void saveNPCJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNPCJButtonActionPerformed
        Player npc = DATABASE.getNPCList().get(npcJList.getSelectedIndex());
        
        //save Player Notes
        npc.setPlayerNotes(npcNotesJTextArea.getText());
        //Save Attributes
        npc.setStats(getNPCStats());
        //update modifiers
        //Save Skills
        npc.setSkillProfs(getNPCSkills());
        //Save the monies
        int[] moneyArray = {Integer.parseInt(npcPlatinumJTextField.getText()),
                Integer.parseInt(npcGoldJTextField.getText()),
                Integer.parseInt(npcSilverJTextField.getText()),
                Integer.parseInt(npcCopperJTextField.getText())};
        npc.setPlayerCurrency(moneyArray);
        
        npc.setItems(getTableData(npcItemsJTable));
        npc.setWeapons(getTableData(npcWeaponsJTable));
        npc.setSpells(getTableData(npcSpellsJTable));
    }//GEN-LAST:event_saveNPCJButtonActionPerformed
    /**
     * 
     * @return 
     */
    private int[] getNPCStats()
    {
        int[] npcStats = new int[6];
        npcStats[0] = Integer.parseInt(npcStrengthJTextField.getText());
        npcStats[1] = Integer.parseInt(npcDexterityJTextField.getText());
        npcStats[2] = Integer.parseInt(npcConstitutionJTextField.getText());
        npcStats[3] = Integer.parseInt(npcIntelligenceJTextField.getText());
        npcStats[4] = Integer.parseInt(npcWisdomJTextField.getText());
        npcStats[5] = Integer.parseInt(npcCharismaJTextField.getText());
        
        return npcStats;
    }
    
    private boolean[] getNPCSkills()
    {
        boolean[] skills = new boolean[18];
        int index = 0;
        for(Component c : npcSkillsJPanel.getComponents())
        {
            if(((JCheckBox)c).isSelected())
            {
                skills[index] = true;
            }
            else if(!((JCheckBox)c).isSelected())
            {
                skills[index] = false;
            }
            index += 1;
        }
        
        return skills;
    }
    
    private void removeNPCJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNPCJButtonActionPerformed
        int selection = JOptionPane.showConfirmDialog(pagesJPanel,
                "This will delete the currently selected NPC... Continue?");
        if(selection == 0)
        {
            DATABASE.getNPCList().remove(npcJList.getSelectedIndex());
            updateNPCList();
        }
    }//GEN-LAST:event_removeNPCJButtonActionPerformed

    private void npcCopperJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_npcCopperJTextFieldFocusLost
        calculateNPCCurrency();
    }//GEN-LAST:event_npcCopperJTextFieldFocusLost

    private void npcSilverJTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_npcSilverJTextFieldFocusLost
        calculateNPCCurrency();
    }//GEN-LAST:event_npcSilverJTextFieldFocusLost

    private void editNPCJCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNPCJCheckBoxActionPerformed
        if(editNPCJCheckBox.isSelected() == true)
        {
            npcNotesJTextArea.setEditable(true);
            npcStrengthJTextField.setEditable(true);
            npcDexterityJTextField.setEditable(true);
            npcConstitutionJTextField.setEditable(true);
            npcIntelligenceJTextField.setEditable(true);
            npcWisdomJTextField.setEditable(true);
            npcCharismaJTextField.setEditable(true);
            for(Component c : npcSkillsJPanel.getComponents())
            {
                ((JCheckBox)c).setEnabled(true);
            }
            //skillsJTextArea.setEditable(true);
        }
        else if(editNPCJCheckBox.isSelected() == false)
        {
            npcNotesJTextArea.setEditable(false);
            npcStrengthJTextField.setEditable(false);
            npcDexterityJTextField.setEditable(false);
            npcConstitutionJTextField.setEditable(false);
            npcIntelligenceJTextField.setEditable(false);
            npcWisdomJTextField.setEditable(false);
            npcCharismaJTextField.setEditable(false);
            for(Component c : npcSkillsJPanel.getComponents())
            {
                ((JCheckBox)c).setEnabled(false);
            }
            //skillsJTextArea.setEditable(false);
        }
    }//GEN-LAST:event_editNPCJCheckBoxActionPerformed

    private void saveNotesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveNotesJButtonActionPerformed
        DATABASE.setNotes(eventNotesJTextArea.getText());
    }//GEN-LAST:event_saveNotesJButtonActionPerformed

    private void loadJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadJMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadJMenuItemActionPerformed
    private int[] getPlayerStats()
    {
        int[] playerStats = new int[6];
        playerStats[0] = Integer.parseInt(strengthJTextField.getText());
        playerStats[1] = Integer.parseInt(dexterityJTextField.getText());
        playerStats[2] = Integer.parseInt(constitutionJTextField.getText());
        playerStats[3] = Integer.parseInt(intelligenceJTextField.getText());
        playerStats[4] = Integer.parseInt(wisdomJTextField.getText());
        playerStats[5] = Integer.parseInt(charismaJTextField.getText());
        
        return playerStats;
    }
    private boolean[] getPlayerSkills()
    {
        boolean[] skills = new boolean[18];
        int index = 0;
        for(Component c : playerSkillsJPanel.getComponents())
        {
            if(((JCheckBox)c).isSelected())
            {
                skills[index] = true;
            }
            else if(!((JCheckBox)c).isSelected())
            {
                skills[index] = false;
            }
            index += 1;
        }
        
        return skills;
    }
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
    private javax.swing.JCheckBox acrobaticsJCheckbox;
    private javax.swing.JTextField addHPJTextField;
    private javax.swing.JButton addNPCItemJButton;
    private javax.swing.JButton addNPCItemJButton1;
    private javax.swing.JButton addNPCJButton;
    private javax.swing.JButton addNPCSpellJButton;
    private javax.swing.JButton addNPCWeaponJButton;
    private javax.swing.JButton addPlayerItemJButton;
    private javax.swing.JButton addPlayerSpellJButton;
    private javax.swing.JButton addPlayerWeaponJButton;
    private javax.swing.JCheckBox animalJCheckbox;
    private javax.swing.JCheckBox arcanaJCheckbox;
    private javax.swing.JCheckBox athleticsJCheckbox;
    private javax.swing.JPanel attributesJPanel;
    private javax.swing.JPanel attributesJPanel1;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField charModJTextField;
    private javax.swing.JLabel characterAlignmentJLabel;
    private javax.swing.JLabel characterClassJLabel;
    private javax.swing.JLabel characterNameJLabel;
    private javax.swing.JLabel characterRaceJLabel;
    private javax.swing.JLabel charismaJLabel;
    private javax.swing.JLabel charismaJLabel1;
    private javax.swing.JTextField charismaJTextField;
    private javax.swing.JTextField conModJTextField;
    private javax.swing.JLabel constitutionJLabel;
    private javax.swing.JLabel constitutionJLabel1;
    private javax.swing.JTextField constitutionJTextField;
    private javax.swing.JMenuItem databasesMenuItem;
    private javax.swing.JCheckBox deceptionJCheckbox;
    private javax.swing.JTextField dexModJTextField;
    private javax.swing.JLabel dexterityJLabel;
    private javax.swing.JLabel dexterityJLabel1;
    private javax.swing.JTextField dexterityJTextField;
    private javax.swing.JMenu editMenu;
    private javax.swing.JCheckBox editNPCJCheckBox;
    private javax.swing.JCheckBox editPlayerJCheckBox;
    private javax.swing.JPanel eventControlsJPanel;
    private javax.swing.JTextArea eventNotesJTextArea;
    private javax.swing.JPanel eventsNotesJPanel;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton forwardButton;
    private javax.swing.JMenu generatorMenu;
    private javax.swing.JMenuItem generatorMenuItem;
    private javax.swing.JCheckBox historyJCheckbox;
    private javax.swing.JPanel homeControlsJPanel;
    private javax.swing.JPanel homeJPanel;
    private javax.swing.JCheckBox insightJCheckbox;
    private javax.swing.JTextField intModJTextField;
    private javax.swing.JLabel intelligenceJLabel;
    private javax.swing.JLabel intelligenceJLabel1;
    private javax.swing.JTextField intelligenceJTextField;
    private javax.swing.JCheckBox intimidationJCheckbox;
    private javax.swing.JCheckBox investigationJCheckbox;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
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
    private javax.swing.JTextField jTextField4;
    private javax.swing.JMenuItem loadJMenuItem;
    private javax.swing.JPanel locationControlsJPanel;
    private javax.swing.JTextArea locationNotesJTextArea;
    private javax.swing.JList locationsJList;
    private javax.swing.JPanel locationsJPanel;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JToolBar mainToolBar;
    private javax.swing.JCheckBox medicineJCheckbox;
    private javax.swing.JPanel modifiersJPanel;
    private javax.swing.JPanel modifiersJPanel1;
    private javax.swing.JCheckBox natureJCheckbox;
    private javax.swing.JButton newLocationJButton;
    private javax.swing.JButton newPlayerJButton;
    private javax.swing.JTextField npcACJTextField;
    private javax.swing.JCheckBox npcAcrobaticsJCheckbox;
    private javax.swing.JButton npcAddHPJButton;
    private javax.swing.JTextField npcAddHPJTextField;
    private javax.swing.JLabel npcAlignmentJLabel;
    private javax.swing.JCheckBox npcAnimalJCheckbox;
    private javax.swing.JCheckBox npcArcanaJCheckbox;
    private javax.swing.JCheckBox npcAthleticsJCheckbox;
    private javax.swing.JTextField npcCharModJTextField;
    private javax.swing.JTextField npcCharismaJTextField;
    private javax.swing.JLabel npcClassJLabel;
    private javax.swing.JTextField npcConModJTextField;
    private javax.swing.JTextField npcConstitutionJTextField;
    private javax.swing.JPanel npcControlsJPanel;
    private javax.swing.JTextField npcCopperJTextField;
    private javax.swing.JLabel npcCurrentHPJLabel;
    private javax.swing.JCheckBox npcDeceptionJCheckbox;
    private javax.swing.JPanel npcDetailsJPanel;
    private javax.swing.JTextField npcDexModJTextField;
    private javax.swing.JTextField npcDexterityJTextField;
    private javax.swing.JTextField npcGoldJTextField;
    private javax.swing.JCheckBox npcHistoryJCheckbox;
    private javax.swing.JCheckBox npcInsightJCheckbox;
    private javax.swing.JTextField npcIntModJTextField;
    private javax.swing.JTextField npcIntelligenceJTextField;
    private javax.swing.JCheckBox npcIntimidationJCheckbox;
    private javax.swing.JCheckBox npcInvestigationJCheckbox;
    private javax.swing.JPanel npcItemsJPanel;
    private javax.swing.JPanel npcItemsJPanel1;
    private javax.swing.JTable npcItemsJTable;
    private javax.swing.JTable npcItemsJTable1;
    private javax.swing.JList npcJList;
    private javax.swing.JPanel npcJPanel;
    private javax.swing.JCheckBox npcMedicineJCheckbox;
    private javax.swing.JLabel npcNameJLabel;
    private javax.swing.JCheckBox npcNatureJCheckbox;
    private javax.swing.JTextArea npcNotesJTextArea;
    private javax.swing.JTextField npcOtherACJTextField;
    private javax.swing.JLabel npcPBJLabel;
    private javax.swing.JCheckBox npcPerceptionJCheckbox;
    private javax.swing.JCheckBox npcPerformanceJCheckbox;
    private javax.swing.JCheckBox npcPersuasionJCheckbox;
    private javax.swing.JTextField npcPlatinumJTextField;
    private javax.swing.JLabel npcRaceJLabel1;
    private javax.swing.JCheckBox npcReligionJCheckbox;
    private javax.swing.JLabel npcSavingThrowsJLabel;
    private javax.swing.JTextField npcSilverJTextField;
    private javax.swing.JPanel npcSkillsControllerJPanel;
    private javax.swing.JPanel npcSkillsJPanel;
    private javax.swing.JCheckBox npcSleightJCheckbox;
    private javax.swing.JTable npcSpellsJTable;
    private javax.swing.JCheckBox npcStealthJCheckbox;
    private javax.swing.JTextField npcStrModJTextField;
    private javax.swing.JTextField npcStrengthJTextField;
    private javax.swing.JButton npcSubHPJButton;
    private javax.swing.JTextField npcSubHPJTextField;
    private javax.swing.JCheckBox npcSurvivalJCheckbox;
    private javax.swing.JLabel npcTotalHPJLabel;
    private javax.swing.JTable npcWeaponsJTable;
    private javax.swing.JTextField npcWisModJTextField;
    private javax.swing.JTextField npcWisdomJTextField;
    private javax.swing.JPanel pageControlsJPanel;
    private javax.swing.JPanel pagesJPanel;
    private javax.swing.JScrollPane pagesJScrollPanel;
    private javax.swing.JList pagesList;
    private javax.swing.JCheckBox perceptionJCheckbox;
    private javax.swing.JCheckBox performanceJCheckbox;
    private javax.swing.JCheckBox persuasionJCheckbox;
    private javax.swing.JButton playerAddJButton;
    private javax.swing.JPanel playerControlsJPanel;
    private javax.swing.JTextField playerCopperJTextField;
    private javax.swing.JLabel playerCurrentHPJLabel;
    private javax.swing.JPanel playerDefenceJPanel;
    private javax.swing.JPanel playerDefenceJPanel1;
    private javax.swing.JTextField playerGoldJTextField;
    private javax.swing.JPanel playerItemsJPanel;
    private javax.swing.JTable playerItemsJTable;
    private javax.swing.JLabel playerNameJLabel;
    private javax.swing.JTextArea playerNotesJTextArea;
    private javax.swing.JLabel playerPBJLabel;
    private javax.swing.JTextField playerPlatinumJTextField;
    private javax.swing.JTextField playerSilverJTextField;
    private javax.swing.JPanel playerSkillsJPanel;
    private javax.swing.JTable playerSpellsJTable;
    private javax.swing.JButton playerSubJButton;
    private javax.swing.JLabel playerTotalHPJLabel;
    private javax.swing.JTable playerWeaponsJTable;
    private javax.swing.JList playersJList;
    private javax.swing.JPanel playersJPanel;
    private javax.swing.JScrollPane playersJScrollPanel;
    private javax.swing.JScrollPane playersJScrollPanel1;
    private javax.swing.JScrollPane playersJScrollPanel2;
    private javax.swing.JCheckBox religionJCheckbox;
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
    private javax.swing.JButton saveNPCJButton;
    private javax.swing.JButton saveNotesJButton;
    private javax.swing.JButton savePlayerJButton;
    private javax.swing.JLabel savingThrowsJLabel;
    private javax.swing.JCheckBox sleightJCheckbox;
    private javax.swing.JCheckBox stealthJCheckbox;
    private javax.swing.JTextField strModJTextField;
    private javax.swing.JLabel strengthJLabel;
    private javax.swing.JLabel strengthJLabel1;
    private javax.swing.JTextField strengthJTextField;
    private javax.swing.JTextField subHPJTextField;
    private javax.swing.JCheckBox survivalJCheckbox;
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
    private javax.swing.JLabel welcomeLabel5;
    private javax.swing.JLabel welcomeLabel6;
    private javax.swing.JTextField wisModJTextField;
    private javax.swing.JLabel wisdomJLabel;
    private javax.swing.JLabel wisdomJLabel1;
    private javax.swing.JTextField wisdomJTextField;
    // End of variables declaration//GEN-END:variables
}
