/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * KrustyGUI.java
 *
 * Created on Mar 2, 2010, 4:16:36 PM
 */

package view;

/**
 *
 * @author martin
 */
@SuppressWarnings("serial")
public class KrustyGUI extends javax.swing.JFrame {

    /** Creates new form KrustyGUI */
    public KrustyGUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inventoryPane = new javax.swing.JTabbedPane();
        producePane = new javax.swing.JLayeredPane();
        produceButton = new javax.swing.JButton();
        produceStatusLabel = new javax.swing.JLabel();
        produceLabel = new javax.swing.JLabel();
        cookieBox = new javax.swing.JComboBox();
        produceButton1 = new javax.swing.JButton();
        nbrPalletsLabel = new javax.swing.JLabel();
        cookieBoxLabel = new javax.swing.JLabel();
        nbrPalletsField = new javax.swing.JTextField();
        simulationPane = new javax.swing.JLayeredPane();
        simulationScrollPane = new javax.swing.JScrollPane();
        simulationTable = new javax.swing.JTable();
        simulationLabel = new javax.swing.JLabel();
        storagePane = new javax.swing.JLayeredPane();
        statusLabel = new javax.swing.JLabel();
        unblockButton = new javax.swing.JButton();
        storageLabel = new javax.swing.JLabel();
        storageScrollPane = new javax.swing.JScrollPane();
        storageTable = new javax.swing.JTable();
        searchCookieBox = new javax.swing.JComboBox();
        clearButton = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();
        searchFromTimestampField = new javax.swing.JTextField();
        searchToTimestampField = new javax.swing.JTextField();
        toLabel = new javax.swing.JLabel();
        fromLabel = new javax.swing.JLabel();
        blockButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        palletIDLabel = new javax.swing.JLabel();
        showPalletButton = new javax.swing.JButton();
        showPalletLabel = new javax.swing.JTextField();
        simulationPane1 = new javax.swing.JLayeredPane();
        simulationScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        simulationLabel1 = new javax.swing.JLabel();
        aboutPane = new javax.swing.JLayeredPane();
        logoLabel = new javax.swing.JLabel();
        aboutScrollPane = new javax.swing.JScrollPane();
        AboutTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Krusty Cookie JAR");
        setName("krustyFrame"); // NOI18N

        produceButton.setText("Produce");
        produceButton.setBounds(210, 140, 97, 29);
        producePane.add(produceButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        produceStatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        produceStatusLabel.setBounds(10, 240, 500, 30);
        producePane.add(produceStatusLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        produceLabel.setText("Produce");
        produceLabel.setBounds(10, 0, 70, 16);
        producePane.add(produceLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cookieBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cookieBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cookieBoxActionPerformed(evt);
            }
        });
        cookieBox.setBounds(190, 40, 140, 30);
        producePane.add(cookieBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        cookieBox.getAccessibleContext().setAccessibleDescription("Choose cookie:");

        produceButton1.setText("Produce");
        produceButton1.setBounds(210, 140, 97, 29);
        producePane.add(produceButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        nbrPalletsLabel.setText("Number of pallets:");
        nbrPalletsLabel.setBounds(50, 90, 130, 30);
        producePane.add(nbrPalletsLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        cookieBoxLabel.setText("Choose cookie:");
        cookieBoxLabel.setBounds(50, 40, 110, 30);
        producePane.add(cookieBoxLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        nbrPalletsField.setBounds(190, 90, 140, 28);
        producePane.add(nbrPalletsField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inventoryPane.addTab("Produce", producePane);

        simulationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product", "Pallets", "Progress"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        simulationTable.getTableHeader().setReorderingAllowed(false);
        simulationScrollPane.setViewportView(simulationTable);
        simulationTable.getColumnModel().getColumn(0).setResizable(false);
        simulationTable.getColumnModel().getColumn(0).setPreferredWidth(150);
        simulationTable.getColumnModel().getColumn(1).setResizable(false);
        simulationTable.getColumnModel().getColumn(2).setResizable(false);

        simulationScrollPane.setBounds(20, 30, 480, 370);
        simulationPane.add(simulationScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        simulationLabel.setText("Cookies in production");
        simulationLabel.setBounds(10, 0, 150, 16);
        simulationPane.add(simulationLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inventoryPane.addTab("Simulation", simulationPane);

        statusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusLabel.setBounds(200, 210, 290, 30);
        storagePane.add(statusLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        unblockButton.setText("Unblock selected");
        unblockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unblockButtonActionPerformed(evt);
            }
        });
        unblockButton.setBounds(340, 330, 140, 29);
        storagePane.add(unblockButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        storageLabel.setText("Pallets in storage");
        storageLabel.setBounds(10, 0, 150, 16);
        storagePane.add(storageLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        storageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pallet ID", "Product", "Timestamp", "Blocked"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        storageTable.getTableHeader().setReorderingAllowed(false);
        storageTable.setRowSelectionAllowed(true);
        storageScrollPane.setViewportView(storageTable);
        storageTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        storageTable.getColumnModel().getColumn(0).setResizable(false);
        storageTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        storageTable.getColumnModel().getColumn(1).setResizable(false);
        storageTable.getColumnModel().getColumn(1).setPreferredWidth(120);
        storageTable.getColumnModel().getColumn(2).setResizable(false);
        storageTable.getColumnModel().getColumn(2).setPreferredWidth(40);
        storageTable.getColumnModel().getColumn(3).setResizable(false);
        storageTable.getColumnModel().getColumn(3).setPreferredWidth(15);

        storageScrollPane.setBounds(20, 30, 480, 170);
        storagePane.add(storageScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        searchCookieBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        searchCookieBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCookieBoxActionPerformed(evt);
            }
        });
        searchCookieBox.setBounds(20, 210, 160, 27);
        storagePane.add(searchCookieBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        clearButton.setBounds(80, 330, 90, 29);
        storagePane.add(clearButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        filterButton.setText("Filter");
        filterButton.setBounds(80, 300, 90, 29);
        storagePane.add(filterButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        searchFromTimestampField.setText("yyyy-mm-dd");
        searchFromTimestampField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFromTimestampFieldActionPerformed(evt);
            }
        });
        searchFromTimestampField.setBounds(70, 240, 100, 28);
        storagePane.add(searchFromTimestampField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        searchToTimestampField.setText("yyyy-mm-dd");
        searchToTimestampField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchToTimestampFieldActionPerformed(evt);
            }
        });
        searchToTimestampField.setBounds(70, 270, 100, 28);
        storagePane.add(searchToTimestampField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        toLabel.setText("To:");
        toLabel.setBounds(30, 270, 45, 30);
        storagePane.add(toLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        fromLabel.setText("From:");
        fromLabel.setBounds(30, 240, 40, 30);
        storagePane.add(fromLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        blockButton.setText("Block selected");
        blockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockButtonActionPerformed(evt);
            }
        });
        blockButton.setBounds(340, 300, 140, 29);
        storagePane.add(blockButton, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSeparator1.setBounds(20, 360, 470, 10);
        storagePane.add(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        palletIDLabel.setText("Enter pallet ID:");
        palletIDLabel.setBounds(80, 380, 110, 30);
        storagePane.add(palletIDLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        showPalletButton.setText("Show");
        showPalletButton.setBounds(350, 380, 77, 29);
        storagePane.add(showPalletButton, javax.swing.JLayeredPane.DEFAULT_LAYER);

        showPalletLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPalletLabelActionPerformed(evt);
            }
        });
        showPalletLabel.setBounds(190, 380, 150, 30);
        storagePane.add(showPalletLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inventoryPane.addTab("Storage", storagePane);

        simulationScrollPane1.setViewportView(null);

        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product", "Pallets", "Progress"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventoryTable.getTableHeader().setReorderingAllowed(false);
        simulationScrollPane1.setViewportView(inventoryTable);
        inventoryTable.getColumnModel().getColumn(0).setResizable(false);
        inventoryTable.getColumnModel().getColumn(0).setPreferredWidth(150);
        inventoryTable.getColumnModel().getColumn(1).setResizable(false);
        inventoryTable.getColumnModel().getColumn(2).setResizable(false);

        simulationScrollPane1.setBounds(20, 30, 480, 370);
        simulationPane1.add(simulationScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        simulationLabel1.setText("Cookies in production");
        simulationLabel1.setBounds(10, 0, 150, 16);
        simulationPane1.add(simulationLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inventoryPane.addTab("Inventory", simulationPane1);

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/krusty-seal.png"))); // NOI18N
        logoLabel.setBounds(160, 30, 200, 190);
        aboutPane.add(logoLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        aboutScrollPane.setBackground(new java.awt.Color(204, 204, 204));

        AboutTextArea.setColumns(20);
        AboutTextArea.setEditable(false);
        AboutTextArea.setRows(5);
        AboutTextArea.setText("  Krusty Cookie JAR, (C) 2010\n\n  Thomas \"Millhouse\" Eriksson\n  Martin \"Groundkeeper Willie\" Olsson\n\n  Lunds Tekniska Högskola (LTH), Lund");
        AboutTextArea.setAutoscrolls(false);
        AboutTextArea.setBorder(null);
        aboutScrollPane.setViewportView(AboutTextArea);

        aboutScrollPane.setBounds(130, 250, 270, 110);
        aboutPane.add(aboutScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        inventoryPane.addTab("About", aboutPane);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(inventoryPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 538, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(inventoryPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchCookieBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCookieBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchCookieBoxActionPerformed

    private void cookieBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cookieBoxActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cookieBoxActionPerformed

    private void unblockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unblockButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unblockButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonActionPerformed

    private void searchToTimestampFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchToTimestampFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchToTimestampFieldActionPerformed

    private void searchFromTimestampFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFromTimestampFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFromTimestampFieldActionPerformed

    private void blockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blockButtonActionPerformed

    private void showPalletLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPalletLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showPalletLabelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AboutTextArea;
    private javax.swing.JLayeredPane aboutPane;
    private javax.swing.JScrollPane aboutScrollPane;
    public javax.swing.JButton blockButton;
    public javax.swing.JButton clearButton;
    public javax.swing.JComboBox cookieBox;
    private javax.swing.JLabel cookieBoxLabel;
    public javax.swing.JButton filterButton;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JTabbedPane inventoryPane;
    public javax.swing.JTable inventoryTable;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logoLabel;
    public javax.swing.JTextField nbrPalletsField;
    private javax.swing.JLabel nbrPalletsLabel;
    private javax.swing.JLabel palletIDLabel;
    public javax.swing.JButton produceButton;
    public javax.swing.JButton produceButton1;
    private javax.swing.JLabel produceLabel;
    public javax.swing.JLayeredPane producePane;
    public javax.swing.JLabel produceStatusLabel;
    public javax.swing.JComboBox searchCookieBox;
    public javax.swing.JTextField searchFromTimestampField;
    public javax.swing.JTextField searchToTimestampField;
    public javax.swing.JButton showPalletButton;
    public javax.swing.JTextField showPalletLabel;
    private javax.swing.JLabel simulationLabel;
    private javax.swing.JLabel simulationLabel1;
    private javax.swing.JLayeredPane simulationPane;
    private javax.swing.JLayeredPane simulationPane1;
    private javax.swing.JScrollPane simulationScrollPane;
    private javax.swing.JScrollPane simulationScrollPane1;
    public javax.swing.JTable simulationTable;
    public javax.swing.JLabel statusLabel;
    private javax.swing.JLabel storageLabel;
    public javax.swing.JLayeredPane storagePane;
    public javax.swing.JScrollPane storageScrollPane;
    public javax.swing.JTable storageTable;
    private javax.swing.JLabel toLabel;
    public javax.swing.JButton unblockButton;
    // End of variables declaration//GEN-END:variables


}
