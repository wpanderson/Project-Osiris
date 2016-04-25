/**
 * Project Osiris
 * Group Members: Weston Anderson, Charles, Ryan, Michel, Brian, Herman
 */
package main_ui;

import java.awt.CardLayout;

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
        titleJPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabPanel = new javax.swing.JPanel();
        homeJPanel = new javax.swing.JPanel();
        welcomeLabel = new javax.swing.JLabel();
        welcomeImageLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        playersJPanel = new javax.swing.JPanel();
        playersJScrollPanel = new javax.swing.JScrollPane();
        playersJList = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        playerNotesJTextArea = new javax.swing.JTextArea();
        saveNotesJButton = new javax.swing.JButton();
        newPlayerJButton = new javax.swing.JButton();
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
        characterClassJLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        skillsJScrollPane = new javax.swing.JScrollPane();
        skillsJTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        editPlayerJCheckBox = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        allignmentJComboBox = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        npcJPanel = new javax.swing.JPanel();
        pagesJPanel = new javax.swing.JPanel();
        pagesJScrollPanel = new javax.swing.JScrollPane();
        pagesList = new javax.swing.JList();
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

        titleJPanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 84)); // NOI18N
        jLabel1.setText("D.R.A.G.O.N.S.");
        jLabel1.setToolTipText("");
        titleJPanel.add(jLabel1, new java.awt.GridBagConstraints());

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
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

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Player Notes:");

        playerNotesJTextArea.setEditable(false);
        playerNotesJTextArea.setColumns(20);
        playerNotesJTextArea.setRows(5);
        playerNotesJTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(playerNotesJTextArea);

        saveNotesJButton.setMnemonic('s');
        saveNotesJButton.setText("Save Notes");

        newPlayerJButton.setMnemonic('n');
        newPlayerJButton.setText("New Player");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Attributes:");

        attributesJPanel.setToolTipText("");
        attributesJPanel.setLayout(new java.awt.GridLayout(6, 3));

        strengthJLabel.setText("Strength:");
        attributesJPanel.add(strengthJLabel);

        strengthJTextField.setEditable(false);
        strengthJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        strengthJTextField.setText("10");
        attributesJPanel.add(strengthJTextField);

        dexterityJLabel.setText("Dexterity:");
        attributesJPanel.add(dexterityJLabel);

        dexterityJTextField.setEditable(false);
        dexterityJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dexterityJTextField.setText("10");
        attributesJPanel.add(dexterityJTextField);

        constitutionJLabel.setText("Constitution:");
        attributesJPanel.add(constitutionJLabel);

        constitutionJTextField.setEditable(false);
        constitutionJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        constitutionJTextField.setText("10");
        attributesJPanel.add(constitutionJTextField);

        intelligenceJLabel.setText("Intelligence:");
        attributesJPanel.add(intelligenceJLabel);

        intelligenceJTextField.setEditable(false);
        intelligenceJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        intelligenceJTextField.setText("10");
        attributesJPanel.add(intelligenceJTextField);

        wisdomJLabel.setText("Wisdom:");
        attributesJPanel.add(wisdomJLabel);

        wisdomJTextField.setEditable(false);
        wisdomJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        wisdomJTextField.setText("10");
        attributesJPanel.add(wisdomJTextField);

        charismaJLabel.setText("Charisma:");
        attributesJPanel.add(charismaJLabel);

        charismaJTextField.setEditable(false);
        charismaJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        charismaJTextField.setText("10");
        attributesJPanel.add(charismaJTextField);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Class:");

        characterClassJLabel.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        characterClassJLabel.setText("CHARACTERS CLASS");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Skills:");

        skillsJTextArea.setEditable(false);
        skillsJTextArea.setColumns(20);
        skillsJTextArea.setRows(5);
        skillsJTextArea.setWrapStyleWord(true);
        skillsJScrollPane.setViewportView(skillsJTextArea);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Player Name:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("PLAYER_NAME_HERE");

        editPlayerJCheckBox.setText("Edit Player");
        editPlayerJCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPlayerJCheckBoxActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Allignment");

        allignmentJComboBox.setEditable(true);
        allignmentJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lawful good", "Neutral good", "Chaotic good", "Lawful neutral", "Neutral", "Chaotic neutral", "Lawful evil", "Neutral evil", "Chaotic evil" }));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Character Name:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("CHARACTER_NAME_HERE");

        modifiersJPanel.setLayout(new java.awt.GridLayout(6, 2));

        strModJTextField.setEditable(false);
        strModJTextField.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        strModJTextField.setText("+0");
        modifiersJPanel.add(strModJTextField);

        strModTempJSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        strModTempJSpinner.setToolTipText("Temporary attribute modifier.");
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

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setText("Modifiers:");

        jLabel14.setText("G:");

        jTextField1.setText("0");

        jLabel15.setText("Arrows:");

        jLabel16.setText("Bolts:");

        jLabel17.setText("P:");

        jTextField2.setText("0");

        jLabel18.setText("C:");

        jTextField3.setText("0");

        jTextField4.setText("0");

        jLabel19.setText("S:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Trackables:");

        jLabel21.setText("Weapon:");

        jTextField5.setText("Weapon Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 252, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Items:");

        javax.swing.GroupLayout playersJPanelLayout = new javax.swing.GroupLayout(playersJPanel);
        playersJPanel.setLayout(playersJPanelLayout);
        playersJPanelLayout.setHorizontalGroup(
            playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playersJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playersJPanelLayout.createSequentialGroup()
                        .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(saveNotesJButton)
                            .addComponent(newPlayerJButton))
                        .addGap(18, 18, 18)
                        .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(playersJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editPlayerJCheckBox))))
                    .addGroup(playersJPanelLayout.createSequentialGroup()
                        .addComponent(playersJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playersJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7))
                            .addGroup(playersJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addGroup(playersJPanelLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(characterClassJLabel)))))
                .addGap(18, 18, 18)
                .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(skillsJScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(playersJPanelLayout.createSequentialGroup()
                        .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(attributesJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modifiersJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playersJPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(allignmentJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(playersJPanelLayout.createSequentialGroup()
                        .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        playersJPanelLayout.setVerticalGroup(
            playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playersJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playersJPanelLayout.createSequentialGroup()
                        .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8)
                            .addComponent(allignmentJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playersJPanelLayout.createSequentialGroup()
                                .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(playersJPanelLayout.createSequentialGroup()
                                        .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(modifiersJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(attributesJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playersJPanelLayout.createSequentialGroup()
                                        .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel20))
                                        .addGap(16, 16, 16)))
                                .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(skillsJScrollPane)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(playersJPanelLayout.createSequentialGroup()
                                .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(characterClassJLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))))
                    .addGroup(playersJPanelLayout.createSequentialGroup()
                        .addComponent(playersJScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(playersJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(editPlayerJCheckBox))
                            .addGroup(playersJPanelLayout.createSequentialGroup()
                                .addComponent(newPlayerJButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveNotesJButton)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tabPanel.add(playersJPanel, "playersCard");

        javax.swing.GroupLayout npcJPanelLayout = new javax.swing.GroupLayout(npcJPanel);
        npcJPanel.setLayout(npcJPanelLayout);
        npcJPanelLayout.setHorizontalGroup(
            npcJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1478, Short.MAX_VALUE)
        );
        npcJPanelLayout.setVerticalGroup(
            npcJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 659, Short.MAX_VALUE)
        );

        tabPanel.add(npcJPanel, "card4");

        pagesList.setBackground(new java.awt.Color(77, 67, 67));
        pagesList.setForeground(new java.awt.Color(255, 255, 255));
        pagesList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Home", "Players", "NPC's", "Locations", "World Events", "DM Notes" };
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
            .addGap(0, 182, Short.MAX_VALUE)
            .addGroup(pagesJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pagesJPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pagesJScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pagesJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tabPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pagesJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
     * When a different item is selected change the displayed JPanel in tabJPanel
     * @param evt 
     */
    private void pagesListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_pagesListValueChanged
        CardLayout card = (CardLayout)tabPanel.getLayout();
        if(pagesList.getSelectedValue() == "Home")
        {
            card.show(tabPanel, "homeCard");
        }
        else if(pagesList.getSelectedValue() == "Players")
        {
            card.show(tabPanel, "playersCard");
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

    private void playersJListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_playersJListValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_playersJListValueChanged

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
    private javax.swing.JComboBox allignmentJComboBox;
    private javax.swing.JPanel attributesJPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField charModJTextField;
    private javax.swing.JSpinner charModTempJSpinner;
    private javax.swing.JLabel characterClassJLabel;
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
    private javax.swing.JMenu fileMenu;
    private javax.swing.JButton forwardButton;
    private javax.swing.JMenu generatorMenu;
    private javax.swing.JMenuItem generatorMenuItem;
    private javax.swing.JPanel homeJPanel;
    private javax.swing.JTextField intModJTextField;
    private javax.swing.JSpinner intModTempJSpinner;
    private javax.swing.JLabel intelligenceJLabel;
    private javax.swing.JTextField intelligenceJTextField;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JToolBar mainToolBar;
    private javax.swing.JPanel modifiersJPanel;
    private javax.swing.JButton newPlayerJButton;
    private javax.swing.JPanel npcJPanel;
    private javax.swing.JPanel pagesJPanel;
    private javax.swing.JScrollPane pagesJScrollPanel;
    private javax.swing.JList pagesList;
    private javax.swing.JTextArea playerNotesJTextArea;
    private javax.swing.JList playersJList;
    private javax.swing.JPanel playersJPanel;
    private javax.swing.JScrollPane playersJScrollPanel;
    private javax.swing.JButton saveNotesJButton;
    private javax.swing.JScrollPane skillsJScrollPane;
    private javax.swing.JTextArea skillsJTextArea;
    private javax.swing.JTextField strModJTextField;
    private javax.swing.JSpinner strModTempJSpinner;
    private javax.swing.JLabel strengthJLabel;
    private javax.swing.JTextField strengthJTextField;
    private javax.swing.JPanel tabPanel;
    private javax.swing.JPanel titleJPanel;
    private javax.swing.JMenu viewMenu;
    private javax.swing.JLabel welcomeImageLabel;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JTextField wisModJTextField;
    private javax.swing.JSpinner wisModTempJSpinner;
    private javax.swing.JLabel wisdomJLabel;
    private javax.swing.JTextField wisdomJTextField;
    // End of variables declaration//GEN-END:variables
}
