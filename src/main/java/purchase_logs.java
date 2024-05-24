
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class purchase_logs extends javax.swing.JFrame {
    public purchase_logs() {
        initComponents();
        JFrame n = new JFrame();
        n.setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dash = new javax.swing.JButton();
        purch = new javax.swing.JButton();
        sale = new javax.swing.JButton();
        retcus = new javax.swing.JButton();
        retsup = new javax.swing.JButton();
        bal = new javax.swing.JButton();
        sc = new javax.swing.JButton();
        A = new javax.swing.JPanel();
        D = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LOAD_DATA = new javax.swing.JButton();
        P = new javax.swing.JPanel();
        purchase = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        p_log_table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        p_add_billid = new javax.swing.JTextField();
        p_add_units = new javax.swing.JTextField();
        p_create_record = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        p_add_date = new com.toedter.calendar.JDateChooser();
        p_add_supplier = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        p_add_description = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        p_add_rate = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        p_update_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        p_update_record = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        p_update_date = new com.toedter.calendar.JDateChooser();
        p_update_billid = new javax.swing.JTextField();
        p_update_desc = new javax.swing.JTextField();
        p_update_supp = new javax.swing.JTextField();
        p_update_units = new javax.swing.JTextField();
        p_update_rate = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        p_delete_table = new javax.swing.JTable();
        delete_record = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        S = new javax.swing.JPanel();
        sales = new javax.swing.JTabbedPane();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        s_log_table = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        s_add_units = new javax.swing.JTextField();
        s_create_record = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        s_add_date = new com.toedter.calendar.JDateChooser();
        s_add_cust = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        s_create_table = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        s_add_billid = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        s_add_rate = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        s_update_table = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        s_update_record = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        s_update_date = new com.toedter.calendar.JDateChooser();
        s_update_billid = new javax.swing.JTextField();
        s_update_cust = new javax.swing.JTextField();
        s_update_units = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        s_update_rate = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        s_delete_table = new javax.swing.JTable();
        delete_record1 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        C = new javax.swing.JPanel();
        customer = new javax.swing.JTabbedPane();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        c_add_billid = new javax.swing.JTextField();
        c_add_units = new javax.swing.JTextField();
        create_customer = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        c_add_date = new com.toedter.calendar.JDateChooser();
        c_add_remark = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        c_add_desc = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        c_add_rate = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jLabel46 = new javax.swing.JLabel();
        customer_update = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        c_update_date = new com.toedter.calendar.JDateChooser();
        c_update_billid = new javax.swing.JTextField();
        c_update_desc = new javax.swing.JTextField();
        c_update_remark = new javax.swing.JTextField();
        c_update_units = new javax.swing.JTextField();
        c_update_rate = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        customer_delete = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        SU = new javax.swing.JPanel();
        supplier = new javax.swing.JTabbedPane();
        jPanel42 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTable22 = new javax.swing.JTable();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        jButton50 = new javax.swing.JButton();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        add_billid7 = new javax.swing.JTextField();
        add_units7 = new javax.swing.JTextField();
        create_record7 = new javax.swing.JButton();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        add_date7 = new com.toedter.calendar.JDateChooser();
        add_supplier7 = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        add_description7 = new javax.swing.JTextField();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        add_rate7 = new javax.swing.JTextField();
        jPanel44 = new javax.swing.JPanel();
        jButton51 = new javax.swing.JButton();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTable23 = new javax.swing.JTable();
        jLabel121 = new javax.swing.JLabel();
        update_record7 = new javax.swing.JButton();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        update_date7 = new com.toedter.calendar.JDateChooser();
        update_billid7 = new javax.swing.JTextField();
        update_desc7 = new javax.swing.JTextField();
        update_supp7 = new javax.swing.JTextField();
        update_units7 = new javax.swing.JTextField();
        update_rate7 = new javax.swing.JTextField();
        jPanel45 = new javax.swing.JPanel();
        jButton52 = new javax.swing.JButton();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTable24 = new javax.swing.JTable();
        delete_record7 = new javax.swing.JButton();
        jLabel128 = new javax.swing.JLabel();
        B = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTable11 = new javax.swing.JTable();
        STC = new javax.swing.JPanel();
        sales3 = new javax.swing.JTabbedPane();
        jPanel30 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        test = new javax.swing.JTable();
        W3 = new javax.swing.JPanel();
        sales5 = new javax.swing.JTabbedPane();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTable19 = new javax.swing.JTable();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        jButton44 = new javax.swing.JButton();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        add_billid6 = new javax.swing.JTextField();
        add_units6 = new javax.swing.JTextField();
        create_record6 = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        add_date6 = new com.toedter.calendar.JDateChooser();
        add_supplier6 = new javax.swing.JTextField();
        jLabel103 = new javax.swing.JLabel();
        add_description6 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        add_rate6 = new javax.swing.JTextField();
        jPanel40 = new javax.swing.JPanel();
        jButton45 = new javax.swing.JButton();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTable20 = new javax.swing.JTable();
        jLabel106 = new javax.swing.JLabel();
        update_record6 = new javax.swing.JButton();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        update_date6 = new com.toedter.calendar.JDateChooser();
        update_billid6 = new javax.swing.JTextField();
        update_desc6 = new javax.swing.JTextField();
        update_supp6 = new javax.swing.JTextField();
        update_units6 = new javax.swing.JTextField();
        update_rate6 = new javax.swing.JTextField();
        jPanel41 = new javax.swing.JPanel();
        jButton46 = new javax.swing.JButton();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTable21 = new javax.swing.JTable();
        delete_record6 = new javax.swing.JButton();
        jLabel113 = new javax.swing.JLabel();

        jLabel17.setText("jLabel17");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("XYZ PVT LIMITED");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(465, 465, 465))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        dash.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        dash.setText("DASHBOARD");
        dash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashActionPerformed(evt);
            }
        });

        purch.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        purch.setText("PURCHASE");
        purch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchActionPerformed(evt);
            }
        });

        sale.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        sale.setText("SALES");
        sale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleActionPerformed(evt);
            }
        });

        retcus.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        retcus.setText("RETURN BY CUSTOMER");
        retcus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retcusActionPerformed(evt);
            }
        });

        retsup.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        retsup.setText("RETURN TO SUPPLIER");
        retsup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retsupActionPerformed(evt);
            }
        });

        bal.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        bal.setText("STOCK CATEGORY");
        bal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balActionPerformed(evt);
            }
        });

        sc.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        sc.setText("BALANCE");
        sc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dash, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sale, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(retcus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(purch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(retsup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(dash, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(purch, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sale, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(retcus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(retsup, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        A.setBackground(new java.awt.Color(153, 255, 255));
        A.setLayout(new java.awt.CardLayout());

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Click here to Load Purchase Logs...");

        LOAD_DATA.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        LOAD_DATA.setText("LOAD DATA");
        LOAD_DATA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOAD_DATAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(LOAD_DATA, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(366, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LOAD_DATA, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout DLayout = new javax.swing.GroupLayout(D);
        D.setLayout(DLayout);
        DLayout.setHorizontalGroup(
            DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DLayout.setVerticalGroup(
            DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(306, Short.MAX_VALUE))
        );

        A.add(D, "card2");

        purchase.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        p_log_table.setBackground(new java.awt.Color(204, 255, 255));
        p_log_table.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        p_log_table.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        p_log_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Received", "Bill ID", "Description", "Supplier", "Units/Kg", "Rate per Unit/Kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        p_log_table.setFillsViewportHeight(true);
        p_log_table.setGridColor(new java.awt.Color(0, 0, 0));
        p_log_table.setRowHeight(25);
        p_log_table.setShowGrid(true);
        jScrollPane1.setViewportView(p_log_table);
        if (p_log_table.getColumnModel().getColumnCount() > 0) {
            p_log_table.getColumnModel().getColumn(0).setResizable(false);
            p_log_table.getColumnModel().getColumn(1).setResizable(false);
            p_log_table.getColumnModel().getColumn(2).setResizable(false);
            p_log_table.getColumnModel().getColumn(3).setResizable(false);
            p_log_table.getColumnModel().getColumn(4).setResizable(false);
            p_log_table.getColumnModel().getColumn(5).setResizable(false);
            p_log_table.getColumnModel().getColumn(6).setResizable(false);
        }

        jButton1.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(332, Short.MAX_VALUE))
        );

        purchase.addTab("PURCHASE - LOGS", jPanel3);

        jButton4.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jButton4.setText("Go back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel4.setText("Bill ID");

        jLabel5.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel5.setText("Units");

        p_create_record.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        p_create_record.setText("SUBMIT");
        p_create_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_create_recordActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Enter Stock Details");

        jLabel8.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel8.setText("Date Received:");

        jLabel9.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel9.setText("Description");

        jLabel10.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel10.setText("Supplier");

        jLabel11.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel11.setText("Rate per Unit/Kg");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 133, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(p_add_billid, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_add_date, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_add_description, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p_add_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p_add_units, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(35, 35, 35)
                                .addComponent(p_add_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(p_create_record, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(425, 425, 425))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(p_add_date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_add_units, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(p_add_billid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(p_add_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p_add_description, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_add_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(p_create_record, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        purchase.addTab("CREATE RECORD", jPanel4);

        jButton5.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jButton5.setText("Go back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        p_update_table.setBackground(new java.awt.Color(204, 255, 255));
        p_update_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p_update_table.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        p_update_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Received", "Bill ID", "Description", "Supplier", "Units/Kg", "Rate per Unit/Kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        p_update_table.setAutoscrolls(false);
        p_update_table.setFillsViewportHeight(true);
        p_update_table.setGridColor(new java.awt.Color(51, 102, 255));
        p_update_table.setRowHeight(25);
        p_update_table.setShowHorizontalLines(true);
        p_update_table.setShowVerticalLines(true);
        p_update_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_update_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(p_update_table);
        if (p_update_table.getColumnModel().getColumnCount() > 0) {
            p_update_table.getColumnModel().getColumn(0).setResizable(false);
            p_update_table.getColumnModel().getColumn(1).setResizable(false);
            p_update_table.getColumnModel().getColumn(2).setResizable(false);
            p_update_table.getColumnModel().getColumn(3).setResizable(false);
            p_update_table.getColumnModel().getColumn(4).setResizable(false);
            p_update_table.getColumnModel().getColumn(5).setResizable(false);
            p_update_table.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel1.setText("Bill ID");

        p_update_record.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        p_update_record.setText("UPDATE");
        p_update_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_update_recordActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Click the row to update");

        jLabel12.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel12.setText("Description");

        jLabel13.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel13.setText("Supplier");

        jLabel14.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel14.setText("Units");

        jLabel15.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel15.setText("Rate per Unit/Kg");

        jLabel16.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        jLabel16.setText("Date Received");

        p_update_billid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_update_billidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addComponent(p_update_record, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(p_update_date, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(p_update_desc)
                                    .addComponent(p_update_supp, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(p_update_billid, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(p_update_units, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p_update_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(298, 298, 298))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 887, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(p_update_date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p_update_billid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(p_update_supp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_update_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(p_update_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(p_update_units, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(p_update_record, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        purchase.addTab("UPDATE RECORD", jPanel5);

        jButton6.setFont(new java.awt.Font("MS Gothic", 1, 14)); // NOI18N
        jButton6.setText("Go back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        p_delete_table.setBackground(new java.awt.Color(204, 255, 255));
        p_delete_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p_delete_table.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        p_delete_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Received", "Bill ID", "Description", "Supplier", "Units/Kg", "Rate per Unit/Kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        p_delete_table.setAutoscrolls(false);
        p_delete_table.setFillsViewportHeight(true);
        p_delete_table.setGridColor(new java.awt.Color(51, 102, 255));
        p_delete_table.setRowHeight(25);
        p_delete_table.setShowHorizontalLines(true);
        p_delete_table.setShowVerticalLines(true);
        p_delete_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_delete_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(p_delete_table);

        delete_record.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        delete_record.setText("DELETE");
        delete_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_recordActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Click the row to delete");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 56, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(delete_record, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(409, 409, 409))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(delete_record, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        purchase.addTab("DELETE RECORD", jPanel6);

        javax.swing.GroupLayout PLayout = new javax.swing.GroupLayout(P);
        P.setLayout(PLayout);
        PLayout.setHorizontalGroup(
            PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(purchase)
        );
        PLayout.setVerticalGroup(
            PLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(purchase)
        );

        A.add(P, "card2");

        sales.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        s_log_table.setBackground(new java.awt.Color(204, 255, 255));
        s_log_table.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        s_log_table.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        s_log_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Sold", "Bill ID", "Description", "Customer", "Units/Kg", "Rate per Unit/Kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        s_log_table.setFillsViewportHeight(true);
        s_log_table.setGridColor(new java.awt.Color(0, 0, 0));
        s_log_table.setRowHeight(25);
        s_log_table.setShowGrid(true);
        jScrollPane4.setViewportView(s_log_table);
        if (s_log_table.getColumnModel().getColumnCount() > 0) {
            s_log_table.getColumnModel().getColumn(0).setResizable(false);
            s_log_table.getColumnModel().getColumn(1).setResizable(false);
            s_log_table.getColumnModel().getColumn(2).setResizable(false);
            s_log_table.getColumnModel().getColumn(3).setResizable(false);
            s_log_table.getColumnModel().getColumn(4).setResizable(false);
            s_log_table.getColumnModel().getColumn(5).setResizable(false);
            s_log_table.getColumnModel().getColumn(6).setResizable(false);
        }

        jButton7.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton7.setText("ADD");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton8.setText("UPDATE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton9.setText("DELETE");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(362, Short.MAX_VALUE))
        );

        sales.addTab("SALES - LOGS", jPanel18);

        jButton10.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton10.setText("Go back");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel25.setText("Units");

        s_create_record.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        s_create_record.setText("SUBMIT");
        s_create_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_create_recordActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setText("Enter the Stock Details");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setText("Date Sold:");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setText("Customer");

        s_create_table.setBackground(new java.awt.Color(204, 255, 255));
        s_create_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s_create_table.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        s_create_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Received", "Bill ID", "Description", "Supplier", "Units/Kg", "Rate per Unit/Kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        s_create_table.setAutoscrolls(false);
        s_create_table.setFillsViewportHeight(true);
        s_create_table.setGridColor(new java.awt.Color(51, 102, 255));
        s_create_table.setRowHeight(25);
        s_create_table.setShowHorizontalLines(true);
        s_create_table.setShowVerticalLines(true);
        s_create_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s_create_tableMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(s_create_table);
        if (s_create_table.getColumnModel().getColumnCount() > 0) {
            s_create_table.getColumnModel().getColumn(0).setResizable(false);
            s_create_table.getColumnModel().getColumn(1).setResizable(false);
            s_create_table.getColumnModel().getColumn(2).setResizable(false);
            s_create_table.getColumnModel().getColumn(3).setResizable(false);
            s_create_table.getColumnModel().getColumn(4).setResizable(false);
            s_create_table.getColumnModel().getColumn(5).setResizable(false);
            s_create_table.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("Bill ID");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel30.setText("Rate");

        s_add_rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_add_rateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(s_add_date, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addComponent(s_add_units, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(43, 43, 43)))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(s_add_billid, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(s_add_cust, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s_add_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(s_create_record)
                .addGap(564, 564, 564))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(s_add_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(jLabel30)
                        .addComponent(s_add_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(s_add_cust)))
                .addGap(19, 19, 19)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(s_add_units, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(s_add_billid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(s_create_record, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton10)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        sales.addTab("CREATE RECORD", jPanel19);

        jButton11.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton11.setText("Go back");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        s_update_table.setBackground(new java.awt.Color(204, 255, 255));
        s_update_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s_update_table.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        s_update_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Sold", "Bill ID", "Description", "Customer", "Units/Kg", "Rate per Unit/Kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        s_update_table.setAutoscrolls(false);
        s_update_table.setFillsViewportHeight(true);
        s_update_table.setGridColor(new java.awt.Color(51, 102, 255));
        s_update_table.setRowHeight(25);
        s_update_table.setShowHorizontalLines(true);
        s_update_table.setShowVerticalLines(true);
        s_update_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s_update_tableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(s_update_table);
        if (s_update_table.getColumnModel().getColumnCount() > 0) {
            s_update_table.getColumnModel().getColumn(0).setResizable(false);
            s_update_table.getColumnModel().getColumn(1).setResizable(false);
            s_update_table.getColumnModel().getColumn(2).setResizable(false);
            s_update_table.getColumnModel().getColumn(3).setResizable(false);
            s_update_table.getColumnModel().getColumn(4).setResizable(false);
            s_update_table.getColumnModel().getColumn(5).setResizable(false);
            s_update_table.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel31.setText("Bill ID");

        s_update_record.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        s_update_record.setText("UPDATE");
        s_update_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_update_recordActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel32.setText("Click the row to update");

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel34.setText("Customer");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setText("Units");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel37.setText("Date Sold");

        s_update_billid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_update_billidActionPerformed(evt);
            }
        });

        s_update_cust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_update_custActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel36.setText("Rate");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s_update_record, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s_update_cust, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(s_update_billid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton11)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 882, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(s_update_date, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(s_update_rate))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(s_update_units, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)))
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(s_update_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(s_update_cust, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(s_update_billid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s_update_units, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(s_update_rate)))))
                .addGap(18, 18, 18)
                .addComponent(s_update_record, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel32)
                .addGap(29, 29, 29)
                .addComponent(jButton11)
                .addGap(214, 214, 214))
        );

        sales.addTab("UPDATE RECORD", jPanel20);

        jButton12.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton12.setText("Go back");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        s_delete_table.setBackground(new java.awt.Color(204, 255, 255));
        s_delete_table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        s_delete_table.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        s_delete_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Sold", "Bill ID", "Description", "Customer", "Units/Kg", "Rate per Unit/Kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        s_delete_table.setAutoscrolls(false);
        s_delete_table.setFillsViewportHeight(true);
        s_delete_table.setGridColor(new java.awt.Color(51, 102, 255));
        s_delete_table.setRowHeight(25);
        s_delete_table.setShowHorizontalLines(true);
        s_delete_table.setShowVerticalLines(true);
        s_delete_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                s_delete_tableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(s_delete_table);
        if (s_delete_table.getColumnModel().getColumnCount() > 0) {
            s_delete_table.getColumnModel().getColumn(0).setResizable(false);
            s_delete_table.getColumnModel().getColumn(1).setResizable(false);
            s_delete_table.getColumnModel().getColumn(2).setResizable(false);
            s_delete_table.getColumnModel().getColumn(3).setResizable(false);
            s_delete_table.getColumnModel().getColumn(4).setResizable(false);
            s_delete_table.getColumnModel().getColumn(5).setResizable(false);
            s_delete_table.getColumnModel().getColumn(6).setResizable(false);
        }

        delete_record1.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        delete_record1.setText("DELETE");
        delete_record1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_record1ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Click the row to delete");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jButton12))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(delete_record1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel38)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delete_record1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton12)
                .addContainerGap(311, Short.MAX_VALUE))
        );

        sales.addTab("DELETE RECORD", jPanel21);

        javax.swing.GroupLayout SLayout = new javax.swing.GroupLayout(S);
        S.setLayout(SLayout);
        SLayout.setHorizontalGroup(
            SLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sales)
                .addContainerGap())
        );
        SLayout.setVerticalGroup(
            SLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sales)
                .addContainerGap())
        );

        A.add(S, "card2");

        customer.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jTable7.setBackground(new java.awt.Color(204, 255, 255));
        jTable7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable7.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Returned", "Bill ID", "Description", "Units/Kg", "Rate per Unit/Kg", "Total", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable7.setFillsViewportHeight(true);
        jTable7.setGridColor(new java.awt.Color(0, 0, 0));
        jTable7.setRowHeight(25);
        jTable7.setShowGrid(true);
        jScrollPane7.setViewportView(jTable7);
        if (jTable7.getColumnModel().getColumnCount() > 0) {
            jTable7.getColumnModel().getColumn(0).setResizable(false);
            jTable7.getColumnModel().getColumn(1).setResizable(false);
            jTable7.getColumnModel().getColumn(2).setResizable(false);
            jTable7.getColumnModel().getColumn(3).setResizable(false);
            jTable7.getColumnModel().getColumn(4).setResizable(false);
            jTable7.getColumnModel().getColumn(5).setResizable(false);
            jTable7.getColumnModel().getColumn(6).setResizable(false);
        }

        jButton17.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton17.setText("ADD");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton18.setText("UPDATE");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton19.setText("DELETE");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(322, Short.MAX_VALUE))
        );

        customer.addTab("RETURN BY CUSTOMER - LOGS", jPanel22);

        jButton20.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton20.setText("Go back");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel39.setText("Bill ID");

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setText("Units");

        create_customer.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        create_customer.setText("SUBMIT");
        create_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_customerActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel41.setText("Enter the Stock Details");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setText("Date Received:");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setText("Description");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel44.setText("Remark of the Stock");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel45.setText("Rate per Unit/Kg");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c_add_billid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_add_date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(c_add_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)))
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45)
                    .addComponent(jLabel44)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(c_add_remark, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(c_add_rate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addComponent(c_add_units, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(119, 119, 119))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(358, 358, 358))
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButton20))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(429, 429, 429)
                        .addComponent(create_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(c_add_date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(c_add_billid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(c_add_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(c_add_remark))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(c_add_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_add_units, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addGap(8, 8, 8)))
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jButton20)
                        .addGap(311, 311, 311))
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(create_customer, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        customer.addTab("CREATE RECORD", jPanel23);

        jButton21.setText("Go back");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jTable8.setBackground(new java.awt.Color(204, 255, 255));
        jTable8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable8.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Returned", "Bill ID", "Description", "Units/Kg", "Rate per Unit/Kg", "Total", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable8.setAutoscrolls(false);
        jTable8.setFillsViewportHeight(true);
        jTable8.setGridColor(new java.awt.Color(51, 102, 255));
        jTable8.setRowHeight(25);
        jTable8.setShowHorizontalLines(true);
        jTable8.setShowVerticalLines(true);
        jTable8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable8MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable8);
        if (jTable8.getColumnModel().getColumnCount() > 0) {
            jTable8.getColumnModel().getColumn(0).setResizable(false);
            jTable8.getColumnModel().getColumn(1).setResizable(false);
            jTable8.getColumnModel().getColumn(2).setResizable(false);
            jTable8.getColumnModel().getColumn(3).setResizable(false);
            jTable8.getColumnModel().getColumn(4).setResizable(false);
            jTable8.getColumnModel().getColumn(5).setResizable(false);
            jTable8.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel46.setText("Bill ID");

        customer_update.setText("UPDATE");
        customer_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_updateActionPerformed(evt);
            }
        });

        jLabel47.setText("Click the row to update");

        jLabel48.setText("Description");

        jLabel49.setText("Remarks");

        jLabel50.setText("Units");

        jLabel51.setText("Rate per Unit/Kg");

        jLabel52.setText("Date Received");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel24Layout.createSequentialGroup()
                                                .addComponent(c_update_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                                            .addComponent(c_update_billid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addComponent(c_update_desc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                                        .addGap(246, 246, 246)
                                        .addComponent(c_update_remark, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel24Layout.createSequentialGroup()
                                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(c_update_units, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(66, 66, 66)
                                .addComponent(c_update_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(customer_update))))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton21))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c_update_desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(c_update_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(c_update_remark, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c_update_billid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_update_units, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_update_rate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 29, Short.MAX_VALUE)
                .addComponent(customer_update)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel47)
                .addGap(18, 18, 18)
                .addComponent(jButton21)
                .addGap(242, 242, 242))
        );

        customer.addTab("UPDATE RECORD", jPanel24);

        jButton22.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton22.setText("Go back");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jTable9.setBackground(new java.awt.Color(204, 255, 255));
        jTable9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable9.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Returned", "Bill ID", "Description", "Units/Kg", "Rate per Unit/Kg", "Total", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable9.setAutoscrolls(false);
        jTable9.setFillsViewportHeight(true);
        jTable9.setGridColor(new java.awt.Color(51, 102, 255));
        jTable9.setRowHeight(25);
        jTable9.setShowHorizontalLines(true);
        jTable9.setShowVerticalLines(true);
        jTable9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable9MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTable9);

        customer_delete.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        customer_delete.setText("DELETE");
        customer_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_deleteActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel53.setText("Click the row to delete");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(customer_delete))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton22))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel53)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customer_delete)
                .addGap(18, 18, 18)
                .addComponent(jButton22)
                .addContainerGap(351, Short.MAX_VALUE))
        );

        customer.addTab("DELETE RECORD", jPanel25);

        javax.swing.GroupLayout CLayout = new javax.swing.GroupLayout(C);
        C.setLayout(CLayout);
        CLayout.setHorizontalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customer)
                .addContainerGap())
        );
        CLayout.setVerticalGroup(
            CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(customer)
                .addContainerGap())
        );

        A.add(C, "card2");

        supplier.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jTable22.setBackground(new java.awt.Color(204, 255, 255));
        jTable22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable22.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTable22.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Received", "Bill ID", "Description", "Supplier", "Units/Kg", "Rate per Unit/Kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable22.setFillsViewportHeight(true);
        jTable22.setGridColor(new java.awt.Color(0, 0, 0));
        jTable22.setRowHeight(25);
        jTable22.setShowGrid(true);
        jScrollPane22.setViewportView(jTable22);
        if (jTable22.getColumnModel().getColumnCount() > 0) {
            jTable22.getColumnModel().getColumn(0).setResizable(false);
            jTable22.getColumnModel().getColumn(1).setResizable(false);
            jTable22.getColumnModel().getColumn(2).setResizable(false);
            jTable22.getColumnModel().getColumn(3).setResizable(false);
            jTable22.getColumnModel().getColumn(4).setResizable(false);
            jTable22.getColumnModel().getColumn(5).setResizable(false);
            jTable22.getColumnModel().getColumn(6).setResizable(false);
        }

        jButton47.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton47.setText("ADD");
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });

        jButton48.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton48.setText("UPDATE");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });

        jButton49.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton49.setText("DELETE");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane22)
                .addContainerGap())
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        supplier.addTab("RETURN TO SUPPLIER - LOGS", jPanel42);

        jButton50.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton50.setText("Go back");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });

        jLabel114.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel114.setText("Bill ID");

        jLabel115.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel115.setText("Units");

        create_record7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        create_record7.setText("SUBMIT");
        create_record7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_record7ActionPerformed(evt);
            }
        });

        jLabel116.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel116.setText("Enter the Stock Details");

        jLabel117.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel117.setText("Date Received:");

        jLabel118.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel118.setText("Description");

        jLabel119.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel119.setText("Supplier");

        jLabel120.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel120.setText("Rate per Unit/Kg");

        add_rate7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_rate7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel118)
                            .addComponent(jLabel117)
                            .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(add_date7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(add_billid7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add_description7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(164, 164, 164)
                                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel115)))))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton50)
                        .addGap(253, 253, 253)
                        .addComponent(create_record7, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(add_supplier7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add_rate7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(add_units7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGap(157, 157, 157))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel116)
                .addGap(392, 392, 392))
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel117)
                    .addComponent(add_date7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel114)
                            .addComponent(add_billid7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_supplier7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel119)))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_rate7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(add_units7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel118)
                    .addComponent(add_description7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(create_record7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton50)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        supplier.addTab("CREATE RECORD", jPanel43);

        jButton51.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton51.setText("Go back");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jTable23.setBackground(new java.awt.Color(204, 255, 255));
        jTable23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable23.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTable23.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Received", "Bill ID", "Description", "Supplier", "Units/Kg", "Rate per Unit/Kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable23.setAutoscrolls(false);
        jTable23.setFillsViewportHeight(true);
        jTable23.setGridColor(new java.awt.Color(51, 102, 255));
        jTable23.setRowHeight(25);
        jTable23.setShowHorizontalLines(true);
        jTable23.setShowVerticalLines(true);
        jTable23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable23MouseClicked(evt);
            }
        });
        jScrollPane23.setViewportView(jTable23);
        if (jTable23.getColumnModel().getColumnCount() > 0) {
            jTable23.getColumnModel().getColumn(0).setResizable(false);
            jTable23.getColumnModel().getColumn(1).setResizable(false);
            jTable23.getColumnModel().getColumn(2).setResizable(false);
            jTable23.getColumnModel().getColumn(3).setResizable(false);
            jTable23.getColumnModel().getColumn(4).setResizable(false);
            jTable23.getColumnModel().getColumn(5).setResizable(false);
            jTable23.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel121.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel121.setText("Bill ID");

        update_record7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        update_record7.setText("UPDATE");
        update_record7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_record7ActionPerformed(evt);
            }
        });

        jLabel122.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel122.setText("Click the row to update");

        jLabel123.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel123.setText("Description");

        jLabel124.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel124.setText("Supplier");

        jLabel125.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel125.setText("Units");

        jLabel126.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel126.setText("Rate per Unit/Kg");

        jLabel127.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel127.setText("Date Received");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addGap(229, 289, Short.MAX_VALUE)
                .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(493, 493, 493))
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                                        .addGap(346, 346, 346)
                                        .addComponent(update_supp7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel44Layout.createSequentialGroup()
                                        .addComponent(jLabel127)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(update_date7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(33, 33, 33)
                                        .addComponent(update_desc7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel44Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(update_units7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel44Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel126)
                                        .addGap(35, 35, 35)
                                        .addComponent(update_rate7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel44Layout.createSequentialGroup()
                                .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update_billid7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(update_record7))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton51)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update_desc7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(update_date7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel124)
                            .addComponent(update_supp7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel121)
                            .addComponent(update_billid7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(update_record7))
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update_units7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update_rate7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel122)
                .addGap(31, 31, 31)
                .addComponent(jButton51)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        supplier.addTab("UPDATE RECORD", jPanel44);

        jButton52.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton52.setText("Go back");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jTable24.setBackground(new java.awt.Color(204, 255, 255));
        jTable24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable24.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTable24.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Received", "Bill ID", "Description", "Supplier", "Units/Kg", "Rate per Unit/Kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable24.setAutoscrolls(false);
        jTable24.setFillsViewportHeight(true);
        jTable24.setGridColor(new java.awt.Color(51, 102, 255));
        jTable24.setRowHeight(25);
        jTable24.setShowHorizontalLines(true);
        jTable24.setShowVerticalLines(true);
        jTable24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable24MouseClicked(evt);
            }
        });
        jScrollPane24.setViewportView(jTable24);

        delete_record7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        delete_record7.setText("DELETE");
        delete_record7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_record7ActionPerformed(evt);
            }
        });

        jLabel128.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel128.setText("Click the row to delete");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(428, 428, 428)
                        .addComponent(delete_record7))
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jButton52)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel128)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delete_record7)
                .addGap(35, 35, 35)
                .addComponent(jButton52)
                .addContainerGap(334, Short.MAX_VALUE))
        );

        supplier.addTab("DELETE RECORD", jPanel45);

        javax.swing.GroupLayout SULayout = new javax.swing.GroupLayout(SU);
        SU.setLayout(SULayout);
        SULayout.setHorizontalGroup(
            SULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(supplier)
                .addContainerGap())
        );
        SULayout.setVerticalGroup(
            SULayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SULayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(supplier)
                .addContainerGap())
        );

        A.add(SU, "card2");

        jTabbedPane4.setTabPlacement(javax.swing.JTabbedPane.RIGHT);

        jPanel11.setBackground(new java.awt.Color(204, 255, 255));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel22.setText("GROCERIES");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Bill id", "Description", "Unit/Kg", "Rate per unit/kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane15.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(458, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("GROCERIES", jPanel11);

        jPanel13.setBackground(new java.awt.Color(204, 255, 255));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel24.setText("COMPUTERS");

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Bill id", "Description", "Unit/Kg", "Rate per unit/kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane16.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(452, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 887, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("COMPUTERS", jPanel12);

        jPanel14.setBackground(new java.awt.Color(204, 255, 255));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel28.setText("CLOTHES");

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Bill id", "Description", "Unit/Kg", "Rate per unit/kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane17.setViewportView(jTable6);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(502, 502, 502))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(446, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("CLOTHES", jPanel14);

        jPanel15.setBackground(new java.awt.Color(204, 255, 255));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel33.setText("MISC");

        jTable11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Bill id", "Description", "Unit/Kg", "Rate per unit/kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane18.setViewportView(jTable11);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(434, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("COMPUTERS", jPanel15);

        javax.swing.GroupLayout BLayout = new javax.swing.GroupLayout(B);
        B.setLayout(BLayout);
        BLayout.setHorizontalGroup(
            BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );
        BLayout.setVerticalGroup(
            BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4)
                .addContainerGap())
        );

        A.add(B, "card2");

        sales3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        test.setBackground(new java.awt.Color(204, 255, 255));
        test.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        test.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        test.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Received", "Bill ID", "Description", "Supplier", "Units/Kg", "Rate per Unit/Kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        test.setAutoscrolls(false);
        test.setFillsViewportHeight(true);
        test.setGridColor(new java.awt.Color(51, 102, 255));
        test.setRowHeight(25);
        test.setShowHorizontalLines(true);
        test.setShowVerticalLines(true);
        test.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                testMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(test);

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );

        sales3.addTab("BALANCE - LOGS", jPanel30);

        javax.swing.GroupLayout STCLayout = new javax.swing.GroupLayout(STC);
        STC.setLayout(STCLayout);
        STCLayout.setHorizontalGroup(
            STCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(STCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sales3)
                .addContainerGap())
        );
        STCLayout.setVerticalGroup(
            STCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(STCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sales3)
                .addContainerGap())
        );

        A.add(STC, "card2");

        sales5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jTable19.setBackground(new java.awt.Color(204, 255, 255));
        jTable19.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTable19.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTable19.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Received", "Bill ID", "Description", "Supplier", "Units/Kg", "Rate per Unit/Kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable19.setFillsViewportHeight(true);
        jTable19.setGridColor(new java.awt.Color(0, 0, 0));
        jTable19.setRowHeight(25);
        jTable19.setShowGrid(true);
        jScrollPane19.setViewportView(jTable19);

        jButton41.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton41.setText("ADD");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton42.setText("UPDATE");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jButton43.setText("DELETE");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane19)
                .addContainerGap())
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sales5.addTab("SALES - LOGS", jPanel38);

        jButton44.setText("Go back");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jLabel99.setText("Bill ID");

        jLabel100.setText("Units");

        create_record6.setText("SUBMIT");
        create_record6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_record6ActionPerformed(evt);
            }
        });

        jLabel101.setText("Enter the Stock Details");

        jLabel102.setText("Date Received:");

        jLabel103.setText("Description");

        jLabel104.setText("Supplier");

        jLabel105.setText("Rate per Unit/Kg");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(add_rate6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton44))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel39Layout.createSequentialGroup()
                                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel39Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(add_date6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel39Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(add_billid6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel39Layout.createSequentialGroup()
                                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(add_units6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel39Layout.createSequentialGroup()
                                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(38, 38, 38)
                                    .addComponent(add_description6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel39Layout.createSequentialGroup()
                                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(add_supplier6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(create_record6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel102)
                    .addComponent(add_date6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel99)
                            .addComponent(add_billid6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(add_description6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel103))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel104)
                            .addComponent(add_supplier6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_rate6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(add_units6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(create_record6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton44)
                .addGap(43, 43, 43))
        );

        sales5.addTab("CREATE RECORD", jPanel39);

        jButton45.setText("Go back");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jTable20.setBackground(new java.awt.Color(204, 255, 255));
        jTable20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable20.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTable20.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Received", "Bill ID", "Description", "Supplier", "Units/Kg", "Rate per Unit/Kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable20.setAutoscrolls(false);
        jTable20.setFillsViewportHeight(true);
        jTable20.setGridColor(new java.awt.Color(51, 102, 255));
        jTable20.setRowHeight(25);
        jTable20.setShowHorizontalLines(true);
        jTable20.setShowVerticalLines(true);
        jTable20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable20MouseClicked(evt);
            }
        });
        jScrollPane20.setViewportView(jTable20);

        jLabel106.setText("Bill ID");

        update_record6.setText("UPDATE");
        update_record6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_record6ActionPerformed(evt);
            }
        });

        jLabel107.setText("Click the row to update");

        jLabel108.setText("Description");

        jLabel109.setText("Supplier");

        jLabel110.setText("Units");

        jLabel111.setText("Rate per Unit/Kg");

        jLabel112.setText("Date Received");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel40Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jButton45))
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel40Layout.createSequentialGroup()
                                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(242, 242, 242)
                                .addComponent(update_record6))))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel40Layout.createSequentialGroup()
                                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel40Layout.createSequentialGroup()
                                        .addComponent(update_date6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                                    .addComponent(update_billid6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(update_desc6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(update_supp6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel40Layout.createSequentialGroup()
                                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(update_units6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel40Layout.createSequentialGroup()
                                .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update_rate6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(update_desc6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(update_date6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel109)
                            .addComponent(update_supp6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel106)
                            .addComponent(update_billid6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(update_record6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update_units6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update_rate6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)))
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel107)
                .addGap(14, 14, 14)
                .addComponent(jButton45)
                .addContainerGap())
        );

        sales5.addTab("UPDATE RECORD", jPanel40);

        jButton46.setText("Go back");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jTable21.setBackground(new java.awt.Color(204, 255, 255));
        jTable21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable21.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jTable21.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date Received", "Bill ID", "Description", "Supplier", "Units/Kg", "Rate per Unit/Kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable21.setAutoscrolls(false);
        jTable21.setFillsViewportHeight(true);
        jTable21.setGridColor(new java.awt.Color(51, 102, 255));
        jTable21.setRowHeight(25);
        jTable21.setShowHorizontalLines(true);
        jTable21.setShowVerticalLines(true);
        jTable21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable21MouseClicked(evt);
            }
        });
        jScrollPane21.setViewportView(jTable21);

        delete_record6.setText("DELETE");
        delete_record6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_record6ActionPerformed(evt);
            }
        });

        jLabel113.setText("Click the row to delete");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 691, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton46)))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(delete_record6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(delete_record6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton46)
                .addGap(43, 43, 43))
        );

        sales5.addTab("DELETE RECORD", jPanel41);

        javax.swing.GroupLayout W3Layout = new javax.swing.GroupLayout(W3);
        W3.setLayout(W3Layout);
        W3Layout.setHorizontalGroup(
            W3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(W3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sales5, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
                .addContainerGap())
        );
        W3Layout.setVerticalGroup(
            W3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(W3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sales5, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                .addContainerGap())
        );

        A.add(W3, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        purchase.setSelectedIndex(1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        purchase.setSelectedIndex(2);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        purchase.setSelectedIndex(3);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        purchase.setSelectedIndex(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        purchase.setSelectedIndex(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        purchase.setSelectedIndex(0);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void p_create_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_create_recordActionPerformed
        // TODO add your handling code here:
        //to check empty fields
        if(p_add_date.getDate()==null||p_add_billid.getText().equals("")||p_add_description.getText().equals("")||p_add_supplier.getText().equals("")||
                p_add_units.getText().equals("")||p_add_rate.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Please do not leave empty fields!");
                //validating numerical values
                if(!p_add_units.getText().matches("[0-9]+") || !p_add_rate.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(this,"Rate / Units should be of numerical values only!");
            }
        }
        //validating numerical values
        else if(!p_add_units.getText().matches("[0-9]+") || !p_add_rate.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(this,"Rate / Units should be of numerical values only!");
            }
        // if no null values....
        else{
        //date conversion & getting values from user
        SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");
        String date = d.format(p_add_date.getDate());
        String bill_id =  p_add_billid.getText();
        String desc =  p_add_description.getText();
        String supp =  p_add_supplier.getText();
        String units =  p_add_units.getText();
        String rate =  p_add_rate.getText();
        
        boolean billidExists = false;
        
        //to check already existing bill id
        try {
            BufferedReader br = new BufferedReader(new FileReader("PurchaseDB.txt"));
            String line;
            int current_row = 0;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("/");
                if (data[1].equals(bill_id)) { // assuming billid is unique and is in the 2nd column
                    JOptionPane.showMessageDialog(this, "Bill ID already exists!");
                    billidExists = true;
                    break;
                }
                current_row++;
            }
            br.close();
        } catch (IOException e) {
        }
        if(billidExists==false){
            //total amount
            int u = Integer.parseInt(p_add_units.getText());
            int r = Integer.parseInt(p_add_rate.getText());
            int t = u*r;
            String total = Integer.toString(t);

            //creating objects for tables
            DefaultTableModel t1 = (DefaultTableModel)p_log_table.getModel();
            DefaultTableModel t2 = (DefaultTableModel)p_update_table.getModel();
            DefaultTableModel t3 = (DefaultTableModel)p_delete_table.getModel();
            DefaultTableModel t4 = (DefaultTableModel)s_create_table.getModel();
            DefaultTableModel t5 = (DefaultTableModel)test.getModel();
            DefaultTableModel[] tableModels = {t1, t2, t3, t4, t5};

            // Writing data to the file
            try (FileWriter writer = new FileWriter("PurchaseDB.txt", true);
                 BufferedWriter bw = new BufferedWriter(writer)) {
                bw.write(date + "/" + bill_id + "/" + desc + "/" + supp + "/" + units + "/" + rate + "/" + total);
                bw.newLine();
            }
            catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Error writing to file");
            }

            // Reading data from the file and updating the tables
            for (DefaultTableModel model : tableModels) {
                model.setRowCount(0); // clear the table before updating it
            }  
            try (FileReader fileReader = new FileReader("PurchaseDB.txt");
                 BufferedReader br = new BufferedReader(fileReader)) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] dataRow = line.split("/");
                    //to check if data in text file is not formatted properly
                    if (dataRow.length != 7) {
                        JOptionPane.showMessageDialog(this, "Invalid data format in file");
                        return;
                    }
                    //to remove whitespaces before inserting into table
                    for (int i = 0; i < dataRow.length; i++) {
                        dataRow[i] = dataRow[i].trim();
                    }
                    //to check if columns in table are not equal to no. of data in text file
                    for (DefaultTableModel model : tableModels) {
                        if (model.getColumnCount() != 7) {
                            JOptionPane.showMessageDialog(this, "Invalid table format");
                            return;
                        }
                        //adding data record to all the tables at a time
                        model.addRow(dataRow);
                    }
                }
                JOptionPane.showMessageDialog(this, "Record Created Successfully!");
                // Reset the form fields here...
                        p_add_date.setDate(null);
                        p_add_billid.setText("");
                        p_add_description.setText("");
                        p_add_supplier.setText("");
                        p_add_units.setText("");
                        p_add_rate.setText("");
                }
                catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error reading from file");
                }
            }
        }
    }//GEN-LAST:event_p_create_recordActionPerformed

    private void p_update_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_update_tableMouseClicked
        // TODO add your handling code here:
        //upon clicking a row in the table, getting values.... 
        DefaultTableModel t1 = (DefaultTableModel)p_update_table.getModel();
        String date = t1.getValueAt(p_update_table.getSelectedRow(), 0).toString();
        String billid = t1.getValueAt(p_update_table.getSelectedRow(), 1).toString();
        String desc = t1.getValueAt(p_update_table.getSelectedRow(), 2).toString();
        String supp = t1.getValueAt(p_update_table.getSelectedRow(), 3).toString();
        String units = t1.getValueAt(p_update_table.getSelectedRow(), 4).toString();
        String rate = t1.getValueAt(p_update_table.getSelectedRow(), 5).toString();
        
        //....setting the selected row values in text fields. 
        p_update_date.setDate(null);
        p_update_billid.setText(billid);
        p_update_desc.setText(desc);
        p_update_supp.setText(supp);
        p_update_units.setText(units);
        p_update_rate.setText(rate);
    }//GEN-LAST:event_p_update_tableMouseClicked

    private void p_update_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_update_recordActionPerformed
        // TODO add your handling code here:
        //creating objects for tables
        DefaultTableModel t1 = (DefaultTableModel)p_update_table.getModel();
        DefaultTableModel t2 = (DefaultTableModel)p_log_table.getModel();
        DefaultTableModel t3 = (DefaultTableModel)p_delete_table.getModel();
        DefaultTableModel t4 = (DefaultTableModel)s_create_table.getModel();
        DefaultTableModel t5 = (DefaultTableModel)test.getModel();
        DefaultTableModel[] tableModels = {t1, t2, t3, t4, t5};
        
        if(p_update_table.getSelectedRowCount()==1){
            //date to string conversion && getting updated values by user
            String old_billid = t1.getValueAt(p_update_table.getSelectedRow(), 1).toString();
            SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");
            String date = d.format(p_update_date.getDate());
            String billid = p_update_billid.getText();
            String desc = p_update_desc.getText();
            String supp = p_update_supp.getText();
            String units = p_update_units.getText();
            String rate = p_update_rate.getText();
            
            //null values validation
            if(p_update_date.getDate()==null||p_update_billid.getText().equals("")||p_update_desc.getText().equals("")||p_update_supp.getText().equals("")||
                p_update_units.getText().equals("")||p_update_rate.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Please do not leave empty fields!");
                //validating numerical values
                if(!p_update_units.getText().matches("[0-9]+") || !p_update_rate.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(this,"Rate / Units should be of numerical values only!");
                }
            }
            //validating numerical values
            else if(!p_update_units.getText().matches("[0-9]+") || !p_update_rate.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(this,"Rate / Units should be of numerical values only!");}
            
            else{
                //total amount calc
                int u = Integer.parseInt(units);
                int r = Integer.parseInt(rate);
                int t = u*r;
                String total = Integer.toString(t);
                
                //to find the row to update in the text file
                int row_index = -1;
                try {
                    BufferedReader br = new BufferedReader(new FileReader("PurchaseDB.txt"));
                    String line;
                    int current_row = 0;
                    while ((line = br.readLine()) != null) {
                        String[] data = line.split("/");
                        //to check for errors....debugging purposes
                        
                        System.out.println("Comparing old_billid " + old_billid + " with " + data[1]);
                        System.out.println("data[1]: " + data[1]); // print the value of data[1] for debugging
                        System.out.println("old_billid: " + old_billid);
                        //using old bill id to find the row to be updated
                        if (data[1].equals(old_billid)) { // assuming billid is unique and is in the 2nd column
                            row_index = current_row;
                            break;
                        }
                        current_row++;
                    }
                    br.close();
                } catch (IOException e) {
                }

                if (row_index >= 0) { // if the row index was found
                    System.out.println("Row index found: " + row_index);
                    try {
                        // Write the updated data to the text file
                        File inputFile = new File("PurchaseDB.txt");
                        File tempFile = new File("temp.txt");
                        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
                        String currentLine;
                        int line_number = 0;
                        while ((currentLine = reader.readLine()) != null) {
                            if (line_number == row_index) { // if this is the row to be updated
                                writer.write(date + "/" + billid + "/" + desc + "/" + supp + "/" + units + "/" + rate + "/" + total + "\n");
                            } else { // if this is not the row to be updated
                                writer.write(currentLine + "\n");
                            }
                            line_number++;
                        }
                        writer.close();
                        reader.close();
                        inputFile.delete();
                        tempFile.renameTo(inputFile);

                        // Update the table model
                         for (DefaultTableModel model : tableModels) {
                            model.setRowCount(0); // clear the table before updating it
                        }  
                         //for inserting data into tables
                         //same as CREATE function
                        try (FileReader fileReader = new FileReader("PurchaseDB.txt");
                             BufferedReader br = new BufferedReader(fileReader)) {
                            String line;
                            while ((line = br.readLine()) != null) {
                                String[] dataRow = line.split("/");
                                if (dataRow.length != 7) {
                                    JOptionPane.showMessageDialog(this, "Invalid data format in file");
                                    return;
                                }

                                for (int i = 0; i < dataRow.length; i++) {
                                    dataRow[i] = dataRow[i].trim();
                                }

                                for (DefaultTableModel model : tableModels) {
                                    if (model.getColumnCount() != 7) {
                                        JOptionPane.showMessageDialog(this, "Invalid table format");
                                        return;
                                    }
                                    model.addRow(dataRow);
                                }
                            }
                            JOptionPane.showMessageDialog(this, "Record updated Successfully!");
                            // Reset the form fields here...
                            p_update_date.setDate(null);
                            p_update_billid.setText("");
                            p_update_desc.setText("");
                            p_update_supp.setText("");
                            p_update_units.setText("");
                            p_update_rate.setText("");
                            }
                            catch (IOException e) {
                                JOptionPane.showMessageDialog(this, "Error reading from file");
                            }
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "Try again");
                    }
                } else { // if the row index was not found
                    JOptionPane.showMessageDialog(this, "Record not found!");
                }
                //debugging purposes
                System.out.println("row_index: " + row_index);
            }
        }
        else{
            if(p_update_table.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Do not select more than one row!/ Select a row!");
            }
        }
    }//GEN-LAST:event_p_update_recordActionPerformed

    private void p_delete_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_delete_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_p_delete_tableMouseClicked

    private void delete_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_recordActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t1 = (DefaultTableModel)p_log_table.getModel();
        DefaultTableModel t2 = (DefaultTableModel)p_update_table.getModel();
        DefaultTableModel t4 = (DefaultTableModel)p_delete_table.getModel();
        DefaultTableModel t3 = (DefaultTableModel)s_create_table.getModel();
        DefaultTableModel t5 = (DefaultTableModel)test.getModel();
        DefaultTableModel[] tableModels = {t1, t2, t3, t4, t5};
        if(p_delete_table.getSelectedRowCount()==1){
            int selectedRow = p_delete_table.getSelectedRow();
            String[] dataRow = new String[7];

            // Get the data from the selected row in the JTable
            for (int i = 0; i < 7; i++) {
                dataRow[i] = p_delete_table.getValueAt(selectedRow, i).toString();
            }

            // Open the text file for reading
            try (BufferedReader br = new BufferedReader(new FileReader("PurchaseDB.txt"))) {
                // Create a temporary file for writing
                File tempFile = new File("temp.txt");
                FileWriter fw = new FileWriter(tempFile, true);
                BufferedWriter bw = new BufferedWriter(fw);

                String line;
                while ((line = br.readLine()) != null) {
                    // If the line matches the data from the selected row, skip it
                    String[] rowData = line.split("/");
                    if (Arrays.equals(rowData, dataRow)) {
                        continue;
                    }

                    // If the line does not match the data from the selected row, write it to the temporary file
                    bw.write(line);
                    bw.newLine();
                }

                // Close the text file and the temporary file
                br.close();
                bw.close();

                // Delete the original text file
                File dataFile = new File("PurchaseDB.txt");
                dataFile.delete();

                // Rename the temporary file to the original text file name
                tempFile.renameTo(dataFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //removing row in all tables
            t1.removeRow(selectedRow);
            t2.removeRow(selectedRow);
            t3.removeRow(selectedRow);
            t4.removeRow(selectedRow);
            
            JOptionPane.showMessageDialog(this, "Record successfully deleted!");
        }
        else{
            if(p_delete_table.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Do not select more than one row!");
            }
        }
    }//GEN-LAST:event_delete_recordActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void s_create_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_create_recordActionPerformed
        // TODO add your handling code here:
        if(s_add_date.getDate()==null||s_add_cust.getText().equals("")||s_add_units.getText().equals("")
                ||s_add_billid.getText().equals("")||s_add_rate.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please do not leave empty fields!");
            if(!s_add_units.getText().matches("[0-9]+")||!s_add_rate.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(this,"Rate / Units should be of numerical values only!");}
        }
        
        else if(!s_add_units.getText().matches("[0-9]+")||!s_add_rate.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(this,"Rate / Units should be of numerical values only!");
        }
        
        else{
        DefaultTableModel t1 = (DefaultTableModel)s_create_table.getModel();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        String date = s.format(s_add_date.getDate());
        //String billid = t1.getValueAt(s_create_table.getSelectedRow(), 1).toString();
        String desc = t1.getValueAt(s_create_table.getSelectedRow(), 2).toString();
        //String rate = t1.getValueAt(s_create_table.getSelectedRow(), 5).toString();
        String purchased_units = t1.getValueAt(s_create_table.getSelectedRow(), 4).toString();
        String billid = s_add_billid.getText();
        String cust = s_add_cust.getText();
        String units = s_add_units.getText();
        String rate = s_add_rate.getText();
        
        if(Integer.parseInt(units)>Integer.parseInt(purchased_units)){
            JOptionPane.showMessageDialog(this, "Not enough units to sell!");
        }
        else{
        int u = Integer.parseInt(units);
        int r = Integer.parseInt(rate);
        int t = u*r;
        String total = Integer.toString(t);
        
        String data[] = {date, billid, desc, cust, units, rate, total};
        
        DefaultTableModel t2 = (DefaultTableModel)s_log_table.getModel();
        t2.addRow(data);
        DefaultTableModel t3 = (DefaultTableModel)s_update_table.getModel();
        t3.addRow(data);
        DefaultTableModel t4 = (DefaultTableModel)s_delete_table.getModel();
        t4.addRow(data);
        //DefaultTableModel t5 = (DefaultTableModel)s_delete_table.getModel();
        //t5.setValueAt((p_add_units-s_add_units), , 4);
        JOptionPane.showMessageDialog(this, "Sales Record Created Successfully!");
        
        s_add_date.setDate(null);
        s_add_cust.setText("");
        s_add_units.setText("");
        s_add_billid.setText("");
        s_add_rate.setText("");
        }
        }
    }//GEN-LAST:event_s_create_recordActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void s_update_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s_update_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel t1 = (DefaultTableModel)s_update_table.getModel();
        String date = t1.getValueAt(s_update_table.getSelectedRow(), 0).toString();
        String billid = t1.getValueAt(s_update_table.getSelectedRow(), 1).toString();
        String cust = t1.getValueAt(s_update_table.getSelectedRow(), 3).toString();
        String units = t1.getValueAt(s_update_table.getSelectedRow(), 4).toString();
        String rate = t1.getValueAt(s_update_table.getSelectedRow(), 5).toString();
        
        s_update_date.setDate(null);
        s_update_billid.setText(billid);
        //s_update_desc.setText(desc);
        s_update_cust.setText(cust);
        s_update_units.setText(units);
        s_update_rate.setText(rate);
    }//GEN-LAST:event_s_update_tableMouseClicked

    private void s_update_recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_update_recordActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t1 = (DefaultTableModel)s_log_table.getModel();
        DefaultTableModel t2 = (DefaultTableModel)s_update_table.getModel();
        DefaultTableModel t3 = (DefaultTableModel)s_delete_table.getModel();
        if(s_update_table.getSelectedRowCount()==1){
            SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");
            String date = d.format(s_update_date.getDate());
            String billid = s_update_billid.getText();
            //String desc = s_update_desc.getText();
            String cust = s_update_cust.getText();
            String units = s_update_units.getText();
            String rate = s_update_rate.getText();
            
            if(s_update_date.getDate()==null||s_update_billid.getText().equals("")||s_update_cust.getText().equals("")||
                s_update_units.getText().equals("")||s_update_rate.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Please do not leave empty fields!");
                //validating numerical values
                if(!s_update_units.getText().matches("[0-9]+") || !s_update_rate.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(this,"Rate / Units should be of numerical values only!");
                }
            }
            //validating numerical values
            else if(!s_update_units.getText().matches("[0-9]+") || !s_update_rate.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(this,"Rate / Units should be of numerical values only!");}
            
            else{
            int u = Integer.parseInt(units);
            int r = Integer.parseInt(rate);
            
            t1.setValueAt(date, s_update_table.getSelectedRow(), 0);
            t1.setValueAt(billid, s_update_table.getSelectedRow(), 1);
            //t1.setValueAt(desc, s_update_table.getSelectedRow(), 2);
            t1.setValueAt(cust, s_update_table.getSelectedRow(), 3);
            t1.setValueAt(units, s_update_table.getSelectedRow(), 4);
            t1.setValueAt(rate, s_update_table.getSelectedRow(), 5);
            t1.setValueAt(u*r, s_update_table.getSelectedRow(), 6);
            
            t2.setValueAt(date, s_update_table.getSelectedRow(), 0);
            t2.setValueAt(billid, s_update_table.getSelectedRow(), 1);
            //t2.setValueAt(desc, s_update_table.getSelectedRow(), 2);
            t2.setValueAt(cust, s_update_table.getSelectedRow(), 3);
            t2.setValueAt(units, s_update_table.getSelectedRow(), 4);
            t2.setValueAt(rate, s_update_table.getSelectedRow(), 5);
            t2.setValueAt(u*r, s_update_table.getSelectedRow(), 6);

            t3.setValueAt(date, s_update_table.getSelectedRow(), 0);
            t3.setValueAt(billid, s_update_table.getSelectedRow(), 1);
            //t3.setValueAt(desc, s_update_table.getSelectedRow(), 2);
            t3.setValueAt(cust, s_update_table.getSelectedRow(), 3);
            t3.setValueAt(units, s_update_table.getSelectedRow(), 4);
            t3.setValueAt(rate, s_update_table.getSelectedRow(), 5);
            t3.setValueAt(u*r, s_update_table.getSelectedRow(), 6);
          
        
            JOptionPane.showMessageDialog(this, "Record Updated Successfully!");
            
            s_update_date.setDate(null);
            s_update_billid.setText("");
            //s_update_desc.setText("");
            s_update_cust.setText("");
            s_update_units.setText("");
            s_update_rate.setText("");
            }
        }
        else{
            if(s_update_table.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Do not select more than one row!");
            }
        }
    }//GEN-LAST:event_s_update_recordActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void s_delete_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s_delete_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_s_delete_tableMouseClicked

    private void delete_record1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_record1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t1 = (DefaultTableModel)s_log_table.getModel();
        DefaultTableModel t2 = (DefaultTableModel)s_update_table.getModel();
        DefaultTableModel t3 = (DefaultTableModel)s_delete_table.getModel();
        if(s_delete_table.getSelectedRowCount()==1){
            t1.removeRow(s_delete_table.getSelectedRow());
            t2.removeRow(s_delete_table.getSelectedRow());
            t3.removeRow(s_delete_table.getSelectedRow());
            JOptionPane.showMessageDialog(this, "Record Deleted Successfully!");
        }
        else{
            if(s_delete_table.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Do not select more than one row!");
            }
        }
    }//GEN-LAST:event_delete_record1ActionPerformed

    private void saleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleActionPerformed
        // TODO add your handling code here:
        A.removeAll();
        A.repaint();
        A.revalidate();
        A.add(S);
        A.repaint();
        A.revalidate();
    }//GEN-LAST:event_saleActionPerformed

    private void purchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchActionPerformed
        // TODO add your handling code here:
        A.removeAll();
        A.repaint();
        A.revalidate();
        A.add(P);
        A.repaint();
        A.revalidate();
    }//GEN-LAST:event_purchActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

        customer.setSelectedIndex(1);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

        customer.setSelectedIndex(2);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed

        customer.setSelectedIndex(3);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jTable8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable8MouseClicked
        // TODO add your handling code here:
        DefaultTableModel t1 = (DefaultTableModel)jTable8.getModel();
        String date = t1.getValueAt(jTable8.getSelectedRow(), 0).toString();
        String billid = t1.getValueAt(jTable8.getSelectedRow(), 1).toString();
        String desc = t1.getValueAt(jTable8.getSelectedRow(), 2).toString();
        String supp = t1.getValueAt(jTable8.getSelectedRow(), 3).toString();
        String units = t1.getValueAt(jTable8.getSelectedRow(), 4).toString();
        String rate = t1.getValueAt(jTable8.getSelectedRow(), 5).toString();
        //String total = t1.getValueAt(jTable2.getSelectedRow(), 6).toString();
        
        c_update_date.setDate(null);
        c_update_billid.setText(billid);
        c_update_desc.setText(desc);
        c_update_remark.setText(supp);
        c_update_units.setText(units);
        c_update_rate.setText(rate);
        
    }//GEN-LAST:event_jTable8MouseClicked

    private void customer_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_updateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t7 = (DefaultTableModel)jTable7.getModel();
        DefaultTableModel t8 = (DefaultTableModel)jTable8.getModel();
        DefaultTableModel t9 = (DefaultTableModel)jTable9.getModel();
        if(c_update_date.getDate()==null||c_update_billid.getText().equals("")||c_update_desc.getText().equals("")||c_update_remark.getText().equals("")||
            c_update_units.getText().equals("")||c_update_rate.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please do not leave empty fields!");
            if(!c_update_units.getText().matches("[0-9]+") || !c_update_rate.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(this,"Rate / Units should be of numerical values only!");
                }
            
        }
        else if(!c_update_units.getText().matches("[0-9]+") || !c_update_rate.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(this,"Rate / Units should be of numerical values only!");
                }
        else if(jTable8.getSelectedRowCount()==1){
            SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");
            String date = d.format(c_update_date.getDate());
            String billid = c_update_billid.getText();
            String desc = c_update_desc.getText();
            String supp = c_update_remark.getText();
            String units = c_update_units.getText();
            String rate = c_update_rate.getText();
            
            int u = Integer.parseInt(units);
            int r = Integer.parseInt(rate);
        
            t7.setValueAt(date, jTable8.getSelectedRow(), 0);
            t7.setValueAt(billid, jTable8.getSelectedRow(), 1);
            t7.setValueAt(desc, jTable8.getSelectedRow(), 2);
            t7.setValueAt(supp, jTable8.getSelectedRow(), 3);
            t7.setValueAt(units, jTable8.getSelectedRow(), 4);
            t7.setValueAt(rate, jTable8.getSelectedRow(), 5);
            t7.setValueAt(u*r, jTable8.getSelectedRow(), 6);
            
            t8.setValueAt(date, jTable8.getSelectedRow(), 0);
            t8.setValueAt(billid, jTable8.getSelectedRow(), 1);
            t8.setValueAt(desc, jTable8.getSelectedRow(), 2);
            t8.setValueAt(supp, jTable8.getSelectedRow(), 3);
            t8.setValueAt(units, jTable8.getSelectedRow(), 4);
            t8.setValueAt(rate, jTable8.getSelectedRow(), 5);
            t8.setValueAt(u*r, jTable8.getSelectedRow(), 6);

            t9.setValueAt(date, jTable8.getSelectedRow(), 0);
            t9.setValueAt(billid, jTable8.getSelectedRow(), 1);
            t9.setValueAt(desc, jTable8.getSelectedRow(), 2);
            t9.setValueAt(supp, jTable8.getSelectedRow(), 3);
            t9.setValueAt(units, jTable8.getSelectedRow(), 4);
            t9.setValueAt(rate, jTable8.getSelectedRow(), 5);
            t9.setValueAt(u*r, jTable8.getSelectedRow(), 6);
        
            JOptionPane.showMessageDialog(this, "Record Updated Successfully!");
            
            c_update_date.setDate(null);
            c_update_billid.setText("");
            c_update_desc.setText("");
            c_update_remark.setText("");
            c_update_units.setText("");
            c_update_rate.setText("");
        }
        else{
            if(jTable8.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Do not select more than one row!");
            }
        }
    }//GEN-LAST:event_customer_updateActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        customer.setSelectedIndex(0);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jTable9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable9MouseClicked

    private void customer_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_deleteActionPerformed
        // TODO add your handling code here:
         DefaultTableModel t1 = (DefaultTableModel)jTable7.getModel();
        DefaultTableModel t2 = (DefaultTableModel)jTable8.getModel();
        DefaultTableModel t3 = (DefaultTableModel)jTable9.getModel();
        if(jTable9.getSelectedRowCount()==1){
            t1.removeRow(jTable9.getSelectedRow());
            t2.removeRow(jTable9.getSelectedRow());
            t3.removeRow(jTable9.getSelectedRow());
            JOptionPane.showMessageDialog(this, "Record Deleted Successfully!");
        }
        else{
            if(jTable9.getRowCount()==0){
                JOptionPane.showMessageDialog(this, "Table is Empty!");
            }
            else{
                JOptionPane.showMessageDialog(this, "Do not select more than one row!");
            }
        }
    }//GEN-LAST:event_customer_deleteActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton50ActionPerformed

    private void create_record7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_record7ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_create_record7ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jTable23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable23MouseClicked

    private void update_record7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_record7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_record7ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jTable24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable24MouseClicked

    private void delete_record7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_record7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_record7ActionPerformed

    private void balActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balActionPerformed
        // TODO add your handling code here:
        A.removeAll();
        A.repaint();
        A.revalidate();
        ////
        A.add(B);
        A.repaint();
        A.revalidate();
    }//GEN-LAST:event_balActionPerformed

    private void retcusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retcusActionPerformed
        // TODO add your handling code here:
        A.removeAll();
        A.repaint();
        A.revalidate();
        ////
        A.add(C);
        A.repaint();
        A.revalidate();
    }//GEN-LAST:event_retcusActionPerformed

    private void dashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashActionPerformed
        // TODO add your handling code here:
        A.removeAll();
        A.repaint();
        A.revalidate();
        ////
        A.add(D);
        A.repaint();
        A.revalidate();
    }//GEN-LAST:event_dashActionPerformed

    private void retsupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retsupActionPerformed
        // TODO add your handling code here:
        A.removeAll();
        A.repaint();
        A.revalidate();
        ////
        A.add(SU);
        A.repaint();
        A.revalidate();
    }//GEN-LAST:event_retsupActionPerformed

    private void scActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scActionPerformed
        // TODO add your handling code here:
        A.removeAll();
        A.repaint();
        A.revalidate();
        ////
        A.add(STC);
        A.repaint();
        A.revalidate();
    }//GEN-LAST:event_scActionPerformed

    private void create_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_customerActionPerformed
        // TODO add your handling code here:
        //to check empty fields
        if(c_add_date.getDate()==null||c_add_billid.getText().equals("")||c_add_desc.getText().equals("")||c_add_remark.getText().equals("")||
            c_add_units.getText().equals("")||c_add_rate.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please do not leave empty fields!");
            if(!c_add_units.getText().matches("[0-9]+") || !c_add_rate.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(this,"Rate / Units should be of numerical values only!");
                }
            
        }
        else if(!c_add_units.getText().matches("[0-9]+") || !c_add_rate.getText().matches("[0-9]+")){
                JOptionPane.showMessageDialog(this,"Rate / Units should be of numerical values only!");
                }
        else{
            //date conversion
            SimpleDateFormat d = new SimpleDateFormat("dd-MM-yyyy");
            String date = d.format(c_add_date.getDate());
            //total amount
            int u = Integer.parseInt(c_add_units.getText());
            int r = Integer.parseInt(c_add_rate.getText());
            int t = u*r;
            String total = Integer.toString(t);
            //get data
            String data[] = {date,c_add_billid.getText(),
                c_add_desc.getText(),c_add_units.getText(),c_add_rate.getText(),total,c_add_remark.getText()};

            //set data in tables
            DefaultTableModel t1 = (DefaultTableModel)jTable7.getModel();
            t1.addRow(data);
            DefaultTableModel t2 = (DefaultTableModel)jTable8.getModel();
            t2.addRow(data);
            DefaultTableModel t3 = (DefaultTableModel)jTable9.getModel();
            t3.addRow(data);

            //added successfully
            JOptionPane.showMessageDialog(this, "Record Created Successfully!");

            //emptying fields
            c_add_date.setDate(null);
            c_add_billid.setText("");
            c_add_desc.setText("");
            c_add_remark.setText("");
            c_add_units.setText("");
            c_add_rate.setText("");
        }
    }//GEN-LAST:event_create_customerActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        customer.setSelectedIndex(0);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void s_create_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_s_create_tableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_s_create_tableMouseClicked

    private void s_add_rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_add_rateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_add_rateActionPerformed

    private void p_update_billidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_update_billidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p_update_billidActionPerformed

    private void LOAD_DATAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOAD_DATAActionPerformed
        // TODO add your handling code here:
        // Load data on opening frame.
        DefaultTableModel t1 = (DefaultTableModel)p_log_table.getModel();
        DefaultTableModel t2 = (DefaultTableModel)p_update_table.getModel();
        DefaultTableModel t3 = (DefaultTableModel)p_delete_table.getModel();
        DefaultTableModel t4 = (DefaultTableModel)s_create_table.getModel();
        DefaultTableModel t5 = (DefaultTableModel)test.getModel();
        DefaultTableModel[] tableModels = {t1, t2, t3, t4, t5};
        for (DefaultTableModel model : tableModels) {
            model.setRowCount(0); // clear the table before updating it
        }
        try (FileReader fileReader = new FileReader("PurchaseDB.txt");
            BufferedReader br = new BufferedReader(fileReader)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataRow = line.split("/");
                if (dataRow.length != 7) {
                    JOptionPane.showMessageDialog(this, "Invalid data format in file");
                    return;
                }
                for (int i = 0; i < dataRow.length; i++) {
                    dataRow[i] = dataRow[i].trim();
                }
                for (DefaultTableModel model : tableModels) {
                    if (model.getColumnCount() != 7) {
                        JOptionPane.showMessageDialog(this, "Invalid table format");
                        return;
                    }
                    model.addRow(dataRow);
                }
            }
            JOptionPane.showMessageDialog(this, "Data Loaded Successfully!");
        }
        catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading from file");
        }
    }//GEN-LAST:event_LOAD_DATAActionPerformed

    private void s_update_custActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_update_custActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_update_custActionPerformed

    private void s_update_billidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_update_billidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s_update_billidActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton44ActionPerformed

    private void create_record6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_record6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_create_record6ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jTable20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable20MouseClicked

    private void update_record6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_record6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_record6ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jTable21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable21MouseClicked

    private void delete_record6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_record6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_record6ActionPerformed

    private void testMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_testMouseClicked

    private void add_rate7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_rate7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_rate7ActionPerformed

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
            java.util.logging.Logger.getLogger(purchase_logs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(purchase_logs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(purchase_logs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(purchase_logs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purchase_logs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel A;
    private javax.swing.JPanel B;
    private javax.swing.JPanel C;
    private javax.swing.JPanel D;
    private javax.swing.JButton LOAD_DATA;
    private javax.swing.JPanel P;
    private javax.swing.JPanel S;
    private javax.swing.JPanel STC;
    private javax.swing.JPanel SU;
    private javax.swing.JPanel W3;
    private javax.swing.JTextField add_billid6;
    private javax.swing.JTextField add_billid7;
    private com.toedter.calendar.JDateChooser add_date6;
    private com.toedter.calendar.JDateChooser add_date7;
    private javax.swing.JTextField add_description6;
    private javax.swing.JTextField add_description7;
    private javax.swing.JTextField add_rate6;
    private javax.swing.JTextField add_rate7;
    private javax.swing.JTextField add_supplier6;
    private javax.swing.JTextField add_supplier7;
    private javax.swing.JTextField add_units6;
    private javax.swing.JTextField add_units7;
    private javax.swing.JButton bal;
    private javax.swing.JTextField c_add_billid;
    private com.toedter.calendar.JDateChooser c_add_date;
    private javax.swing.JTextField c_add_desc;
    private javax.swing.JTextField c_add_rate;
    private javax.swing.JTextField c_add_remark;
    private javax.swing.JTextField c_add_units;
    private javax.swing.JTextField c_update_billid;
    private com.toedter.calendar.JDateChooser c_update_date;
    private javax.swing.JTextField c_update_desc;
    private javax.swing.JTextField c_update_rate;
    private javax.swing.JTextField c_update_remark;
    private javax.swing.JTextField c_update_units;
    private javax.swing.JButton create_customer;
    private javax.swing.JButton create_record6;
    private javax.swing.JButton create_record7;
    private javax.swing.JTabbedPane customer;
    private javax.swing.JButton customer_delete;
    private javax.swing.JButton customer_update;
    private javax.swing.JButton dash;
    private javax.swing.JButton delete_record;
    private javax.swing.JButton delete_record1;
    private javax.swing.JButton delete_record6;
    private javax.swing.JButton delete_record7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable11;
    private javax.swing.JTable jTable19;
    private javax.swing.JTable jTable20;
    private javax.swing.JTable jTable21;
    private javax.swing.JTable jTable22;
    private javax.swing.JTable jTable23;
    private javax.swing.JTable jTable24;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTable jTable9;
    private javax.swing.JTextField p_add_billid;
    private com.toedter.calendar.JDateChooser p_add_date;
    private javax.swing.JTextField p_add_description;
    private javax.swing.JTextField p_add_rate;
    private javax.swing.JTextField p_add_supplier;
    private javax.swing.JTextField p_add_units;
    private javax.swing.JButton p_create_record;
    private javax.swing.JTable p_delete_table;
    private javax.swing.JTable p_log_table;
    private javax.swing.JTextField p_update_billid;
    private com.toedter.calendar.JDateChooser p_update_date;
    private javax.swing.JTextField p_update_desc;
    private javax.swing.JTextField p_update_rate;
    private javax.swing.JButton p_update_record;
    private javax.swing.JTextField p_update_supp;
    private javax.swing.JTable p_update_table;
    private javax.swing.JTextField p_update_units;
    private javax.swing.JButton purch;
    private javax.swing.JTabbedPane purchase;
    private javax.swing.JButton retcus;
    private javax.swing.JButton retsup;
    private javax.swing.JTextField s_add_billid;
    private javax.swing.JTextField s_add_cust;
    private com.toedter.calendar.JDateChooser s_add_date;
    private javax.swing.JTextField s_add_rate;
    private javax.swing.JTextField s_add_units;
    private javax.swing.JButton s_create_record;
    private javax.swing.JTable s_create_table;
    private javax.swing.JTable s_delete_table;
    private javax.swing.JTable s_log_table;
    private javax.swing.JTextField s_update_billid;
    private javax.swing.JTextField s_update_cust;
    private com.toedter.calendar.JDateChooser s_update_date;
    private javax.swing.JTextField s_update_rate;
    private javax.swing.JButton s_update_record;
    private javax.swing.JTable s_update_table;
    private javax.swing.JTextField s_update_units;
    private javax.swing.JButton sale;
    private javax.swing.JTabbedPane sales;
    private javax.swing.JTabbedPane sales3;
    private javax.swing.JTabbedPane sales5;
    private javax.swing.JButton sc;
    private javax.swing.JTabbedPane supplier;
    private javax.swing.JTable test;
    private javax.swing.JTextField update_billid6;
    private javax.swing.JTextField update_billid7;
    private com.toedter.calendar.JDateChooser update_date6;
    private com.toedter.calendar.JDateChooser update_date7;
    private javax.swing.JTextField update_desc6;
    private javax.swing.JTextField update_desc7;
    private javax.swing.JTextField update_rate6;
    private javax.swing.JTextField update_rate7;
    private javax.swing.JButton update_record6;
    private javax.swing.JButton update_record7;
    private javax.swing.JTextField update_supp6;
    private javax.swing.JTextField update_supp7;
    private javax.swing.JTextField update_units6;
    private javax.swing.JTextField update_units7;
    // End of variables declaration//GEN-END:variables
}
