//Tousif Ahmed Jesan.
package BusTicket;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import static java.lang.Class.forName;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BusTicket extends javax.swing.JFrame {

    public BusTicket() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        printPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jlA = new javax.swing.JLabel();
        jlClass = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jlChild = new javax.swing.JLabel();
        jlFrom = new javax.swing.JLabel();
        jlto = new javax.swing.JLabel();
        jldate = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jlTno = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jlcost = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jltime = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jlroute = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jrbEco = new javax.swing.JRadioButton();
        jrbFC = new javax.swing.JRadioButton();
        jrCyes = new javax.swing.JRadioButton();
        jrAyes = new javax.swing.JRadioButton();
        jrbSt = new javax.swing.JRadioButton();
        jCB = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLebel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcb2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbtntotal = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnResset = new javax.swing.JButton();
        jlTotal = new javax.swing.JLabel();
        jlTax = new javax.swing.JLabel();
        jlST = new javax.swing.JLabel();
        p = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        A1 = new javax.swing.JRadioButton();
        B1 = new javax.swing.JRadioButton();
        A2 = new javax.swing.JRadioButton();
        B2 = new javax.swing.JRadioButton();
        A3 = new javax.swing.JRadioButton();
        B3 = new javax.swing.JRadioButton();
        A4 = new javax.swing.JRadioButton();
        B4 = new javax.swing.JRadioButton();
        A5 = new javax.swing.JRadioButton();
        A6 = new javax.swing.JRadioButton();
        B6 = new javax.swing.JRadioButton();
        A8 = new javax.swing.JRadioButton();
        B8 = new javax.swing.JRadioButton();
        B9 = new javax.swing.JRadioButton();
        B5 = new javax.swing.JRadioButton();
        A7 = new javax.swing.JRadioButton();
        B7 = new javax.swing.JRadioButton();
        A9 = new javax.swing.JRadioButton();
        A10 = new javax.swing.JRadioButton();
        B10 = new javax.swing.JRadioButton();
        A11 = new javax.swing.JRadioButton();
        B11 = new javax.swing.JRadioButton();
        A12 = new javax.swing.JRadioButton();
        B12 = new javax.swing.JRadioButton();
        A13 = new javax.swing.JRadioButton();
        B13 = new javax.swing.JRadioButton();
        C1 = new javax.swing.JRadioButton();
        C2 = new javax.swing.JRadioButton();
        D1 = new javax.swing.JRadioButton();
        D2 = new javax.swing.JRadioButton();
        D4 = new javax.swing.JRadioButton();
        D3 = new javax.swing.JRadioButton();
        D5 = new javax.swing.JRadioButton();
        C4 = new javax.swing.JRadioButton();
        C5 = new javax.swing.JRadioButton();
        D7 = new javax.swing.JRadioButton();
        D11 = new javax.swing.JRadioButton();
        C6 = new javax.swing.JRadioButton();
        C7 = new javax.swing.JRadioButton();
        C8 = new javax.swing.JRadioButton();
        C10 = new javax.swing.JRadioButton();
        C9 = new javax.swing.JRadioButton();
        D13 = new javax.swing.JRadioButton();
        C12 = new javax.swing.JRadioButton();
        C11 = new javax.swing.JRadioButton();
        D6 = new javax.swing.JRadioButton();
        D8 = new javax.swing.JRadioButton();
        D9 = new javax.swing.JRadioButton();
        D10 = new javax.swing.JRadioButton();
        D12 = new javax.swing.JRadioButton();
        C13 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        savebtn2 = new javax.swing.JButton();
        C3 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Bus Ticket");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel2.setText("Bus Ticket");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(301, 301, 301))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        printPanel.setBackground(new java.awt.Color(255, 255, 255));
        printPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Class");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("From");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("To");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Date");

        jlA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jlClass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlClass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlClass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Adult");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Child");

        jlChild.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlChild.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlChild.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jlFrom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlFrom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jlto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jldate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jldate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Sit No.");

        jlTno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Cost");

        jlcost.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlcost.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Time");

        jltime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jltime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Route");

        jlroute.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlroute.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout printPanelLayout = new javax.swing.GroupLayout(printPanel);
        printPanel.setLayout(printPanelLayout);
        printPanelLayout.setHorizontalGroup(
            printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(printPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(printPanelLayout.createSequentialGroup()
                        .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(printPanelLayout.createSequentialGroup()
                                .addComponent(jlClass, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(jlA, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))
                            .addGroup(printPanelLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(119, 119, 119)))
                        .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlChild, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printPanelLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(36, 36, 36)))
                        .addGap(112, 112, 112))
                    .addGroup(printPanelLayout.createSequentialGroup()
                        .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(33, 33, 33)
                        .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jldate, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlto, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jltime, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(printPanelLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlTno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(printPanelLayout.createSequentialGroup()
                                        .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel20))
                                        .addGap(0, 115, Short.MAX_VALUE)))
                                .addGap(112, 112, 112))
                            .addGroup(printPanelLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jlroute, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlcost, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        printPanelLayout.setVerticalGroup(
            printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printPanelLayout.createSequentialGroup()
                .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(printPanelLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlTno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(printPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlChild, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlClass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlFrom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(printPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel16)))))
                .addGap(29, 29, 29)
                .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(printPanelLayout.createSequentialGroup()
                        .addComponent(jlto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jldate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(printPanelLayout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlcost, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printPanelLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel18)
                        .addGap(29, 29, 29)))
                .addGroup(printPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jltime, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlroute, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(printPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));

        jrbEco.setBackground(new java.awt.Color(0, 153, 153));
        jrbEco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbEco.setText("Middle");
        jrbEco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEcoActionPerformed(evt);
            }
        });

        jrbFC.setBackground(new java.awt.Color(0, 153, 153));
        jrbFC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbFC.setText("Front");
        jrbFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbFCActionPerformed(evt);
            }
        });

        jrCyes.setBackground(new java.awt.Color(0, 153, 153));
        jrCyes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrCyes.setText("Child");
        jrCyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCyesActionPerformed(evt);
            }
        });

        jrAyes.setBackground(new java.awt.Color(0, 153, 153));
        jrAyes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrAyes.setText("Adult");
        jrAyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAyesActionPerformed(evt);
            }
        });

        jrbSt.setBackground(new java.awt.Color(0, 153, 153));
        jrbSt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jrbSt.setText("Back");
        jrbSt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbStActionPerformed(evt);
            }
        });

        jCB.setBackground(new java.awt.Color(0, 153, 153));
        jCB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barishal", "Kuakata" }));
        jCB.setToolTipText("");
        jCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Class");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Type");

        jLebel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLebel8.setText("To");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("From");

        jcb2.setBackground(new java.awt.Color(0, 153, 204));
        jcb2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Barishal", "Kuakata" }));
        jcb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jrbEco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbSt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbFC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jrAyes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrCyes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(32, 32, 32)
                                        .addComponent(jcb2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLebel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jCB, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbSt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jrAyes)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbEco)
                            .addComponent(jrCyes)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLebel8))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbFC))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Sub Total");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Tax");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Total");

        jbtntotal.setBackground(new java.awt.Color(0, 204, 0));
        jbtntotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtntotal.setText("Total");
        jbtntotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jbtntotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtntotalMouseClicked(evt);
            }
        });
        jbtntotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtntotalActionPerformed(evt);
            }
        });

        jbtnExit.setBackground(new java.awt.Color(0, 153, 0));
        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jbtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnExitMouseClicked(evt);
            }
        });
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jbtnResset.setBackground(new java.awt.Color(0, 153, 51));
        jbtnResset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnResset.setText("Reset");
        jbtnResset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jbtnResset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRessetActionPerformed(evt);
            }
        });

        jlTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jlTax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jlST.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlST.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        p.setBackground(new java.awt.Color(0, 153, 0));
        p.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        p.setText("Print");
        p.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTax, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlST, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jbtntotal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnResset, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jlST, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlTax, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel11)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jlTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtntotal)
                    .addComponent(jbtnResset)
                    .addComponent(jbtnExit)
                    .addComponent(p))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(8, 8, 8, 8, new java.awt.Color(51, 102, 0)));

        A1.setBackground(new java.awt.Color(0, 153, 102));
        A1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A1.setText("A1");
        A1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A1MouseClicked(evt);
            }
        });
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(0, 153, 102));
        B1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B1.setText("B1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        A2.setBackground(new java.awt.Color(0, 153, 102));
        A2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A2.setText("A2");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(0, 153, 102));
        B2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B2.setText("B2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        A3.setBackground(new java.awt.Color(0, 153, 102));
        A3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A3.setText("A3");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        B3.setBackground(new java.awt.Color(0, 153, 102));
        B3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B3.setText("B3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        A4.setBackground(new java.awt.Color(0, 153, 102));
        A4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A4.setText("A4");
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        B4.setBackground(new java.awt.Color(0, 153, 102));
        B4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B4.setText("B4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        A5.setBackground(new java.awt.Color(0, 153, 102));
        A5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A5.setText("A5");
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        A6.setBackground(new java.awt.Color(0, 153, 102));
        A6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A6.setText("A6");
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        B6.setBackground(new java.awt.Color(0, 153, 102));
        B6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B6.setText("B6");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        A8.setBackground(new java.awt.Color(0, 153, 102));
        A8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A8.setText("A8");
        A8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });

        B8.setBackground(new java.awt.Color(0, 153, 102));
        B8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B8.setText("B8");
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B9.setBackground(new java.awt.Color(0, 153, 102));
        B9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B9.setText("B9");
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        B5.setBackground(new java.awt.Color(0, 153, 102));
        B5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B5.setText("B5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        A7.setBackground(new java.awt.Color(0, 153, 102));
        A7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A7.setText("A7");
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });

        B7.setBackground(new java.awt.Color(0, 153, 102));
        B7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B7.setText("B7");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        A9.setBackground(new java.awt.Color(0, 153, 102));
        A9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A9.setText("A9");
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });

        A10.setBackground(new java.awt.Color(0, 153, 102));
        A10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A10.setText("A10");
        A10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A10ActionPerformed(evt);
            }
        });

        B10.setBackground(new java.awt.Color(0, 153, 102));
        B10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B10.setText("B10");
        B10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B10ActionPerformed(evt);
            }
        });

        A11.setBackground(new java.awt.Color(0, 153, 102));
        A11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A11.setText("A11");
        A11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A11ActionPerformed(evt);
            }
        });

        B11.setBackground(new java.awt.Color(0, 153, 102));
        B11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B11.setText("B11");
        B11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B11ActionPerformed(evt);
            }
        });

        A12.setBackground(new java.awt.Color(0, 153, 102));
        A12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A12.setText("A12");
        A12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A12ActionPerformed(evt);
            }
        });

        B12.setBackground(new java.awt.Color(0, 153, 102));
        B12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B12.setText("B12");
        B12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B12ActionPerformed(evt);
            }
        });

        A13.setBackground(new java.awt.Color(0, 153, 102));
        A13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        A13.setText("A13");
        A13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A13ActionPerformed(evt);
            }
        });

        B13.setBackground(new java.awt.Color(0, 153, 102));
        B13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        B13.setText("B13");
        B13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B13ActionPerformed(evt);
            }
        });

        C1.setBackground(new java.awt.Color(0, 153, 102));
        C1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C1.setText("C1");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setBackground(new java.awt.Color(0, 153, 102));
        C2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C2.setText("C2");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        D1.setBackground(new java.awt.Color(0, 153, 102));
        D1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D1.setText("D1");
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        D2.setBackground(new java.awt.Color(0, 153, 102));
        D2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D2.setText("D2");
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        D4.setBackground(new java.awt.Color(0, 153, 102));
        D4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D4.setText("D4");
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        D3.setBackground(new java.awt.Color(0, 153, 102));
        D3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D3.setText("D3");
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        D5.setBackground(new java.awt.Color(0, 153, 102));
        D5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D5.setText("D5");
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });

        C4.setBackground(new java.awt.Color(0, 153, 102));
        C4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C4.setText("C4");
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        C5.setBackground(new java.awt.Color(0, 153, 102));
        C5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C5.setText("C5");
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        D7.setBackground(new java.awt.Color(0, 153, 102));
        D7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D7.setText("D7");
        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });

        D11.setBackground(new java.awt.Color(0, 153, 102));
        D11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D11.setText("D11");
        D11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D11ActionPerformed(evt);
            }
        });

        C6.setBackground(new java.awt.Color(0, 153, 102));
        C6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C6.setText("C6");
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        C7.setBackground(new java.awt.Color(0, 153, 102));
        C7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C7.setText("C7");
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });

        C8.setBackground(new java.awt.Color(0, 153, 102));
        C8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C8.setText("C8");
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        C10.setBackground(new java.awt.Color(0, 153, 102));
        C10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C10.setText("C10");
        C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C10ActionPerformed(evt);
            }
        });

        C9.setBackground(new java.awt.Color(0, 153, 102));
        C9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C9.setText("C9");
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });

        D13.setBackground(new java.awt.Color(0, 153, 102));
        D13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D13.setText("D13");
        D13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D13ActionPerformed(evt);
            }
        });

        C12.setBackground(new java.awt.Color(0, 153, 102));
        C12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C12.setText("C12");
        C12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C12ActionPerformed(evt);
            }
        });

        C11.setBackground(new java.awt.Color(0, 153, 102));
        C11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C11.setText("C11");
        C11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C11ActionPerformed(evt);
            }
        });

        D6.setBackground(new java.awt.Color(0, 153, 102));
        D6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D6.setText("D6");
        D6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D6ActionPerformed(evt);
            }
        });

        D8.setBackground(new java.awt.Color(0, 153, 102));
        D8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D8.setText("D8");
        D8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D8ActionPerformed(evt);
            }
        });

        D9.setBackground(new java.awt.Color(0, 153, 102));
        D9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D9.setText("D9");
        D9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D9ActionPerformed(evt);
            }
        });

        D10.setBackground(new java.awt.Color(0, 153, 102));
        D10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D10.setText("D10");
        D10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D10ActionPerformed(evt);
            }
        });

        D12.setBackground(new java.awt.Color(0, 153, 102));
        D12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        D12.setText("D12");
        D12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D12ActionPerformed(evt);
            }
        });

        C13.setBackground(new java.awt.Color(0, 153, 102));
        C13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C13.setText("C13");
        C13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C13ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 0));
        jButton1.setText("Clear all");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 153, 102));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("  Bus Seats Location");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 0));

        savebtn2.setBackground(new java.awt.Color(204, 204, 0));
        savebtn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        savebtn2.setForeground(new java.awt.Color(51, 51, 51));
        savebtn2.setText("Save & Check");
        savebtn2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        savebtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savebtn2MouseClicked(evt);
            }
        });
        savebtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtn2ActionPerformed(evt);
            }
        });

        C3.setBackground(new java.awt.Color(0, 153, 102));
        C3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        C3.setText("C3");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 204, 102));
        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("   You have to press 'Save & Check' button at first ");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(A13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(A11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(B11, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(savebtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addComponent(A12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(B12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addGap(86, 86, 86)
                                                    .addComponent(B10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(A10, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(A9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(A8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(A7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(A1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(A2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(A3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(A4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(A5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(A6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(D2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(C12, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                            .addComponent(C10, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                            .addComponent(C9, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                            .addComponent(C8, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                            .addComponent(C7, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                            .addComponent(C6, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                            .addComponent(C5, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                            .addComponent(C4, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                            .addComponent(C13, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                            .addComponent(C11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(C3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(D3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(D11, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(D5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(D6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(D8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(D9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(D10, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(D12, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(D13, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A1)
                    .addComponent(B1)
                    .addComponent(C1)
                    .addComponent(D1))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A2)
                    .addComponent(B2)
                    .addComponent(C2)
                    .addComponent(D2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A3)
                    .addComponent(B3)
                    .addComponent(D3)
                    .addComponent(C3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A4)
                    .addComponent(B4)
                    .addComponent(D4)
                    .addComponent(C4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(A5)
                        .addComponent(B5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(D5)
                        .addComponent(C5)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B7)
                            .addComponent(C7)
                            .addComponent(D7)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B6)
                            .addComponent(A6)
                            .addComponent(C6)
                            .addComponent(D6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(A7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(A8)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B8)
                        .addComponent(C8)
                        .addComponent(D8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(A9)
                        .addComponent(B9)
                        .addComponent(D9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A10)
                    .addComponent(B10)
                    .addComponent(C10)
                    .addComponent(D10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B11)
                    .addComponent(C11)
                    .addComponent(D11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A12)
                    .addComponent(B12)
                    .addComponent(C12)
                    .addComponent(D12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A13)
                    .addComponent(B13)
                    .addComponent(C13)
                    .addComponent(D13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebtn2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 8, true));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel13.setText("Step 1: select 'From' and 'To'             Step 2: Select Type          Step3: Select only one existing seat        Step 4: Press 'Total' ");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        jLabel22.setText("Step 5 : Press 'Save & Cheak' for save       Step 6: Press 'Print'  for print ticket     Step 7: For a new ticket press 'Reset' ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 1714, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 1687, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(printPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(printPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbFCActionPerformed
        if(jrbFC.isSelected())
        {
            jrbSt.setSelected(false);
            jrbEco.setSelected(false);
        }
    }//GEN-LAST:event_jrbFCActionPerformed

    private void jrbEcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEcoActionPerformed
        if(jrbEco.isSelected())
        {
            jrbSt.setSelected(false);
            jrbFC.setSelected(false);
        }
    }//GEN-LAST:event_jrbEcoActionPerformed

    private void jrCyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCyesActionPerformed
        if (jrCyes.isSelected())
            jrAyes.setSelected(false);
    }//GEN-LAST:event_jrCyesActionPerformed

    private void jrAyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAyesActionPerformed
         if (jrAyes.isSelected())
            jrCyes.setSelected(false);
    }//GEN-LAST:event_jrAyesActionPerformed

    private void jbtnRessetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRessetActionPerformed
        
        jlFrom.setText(null);
        jlto.setText(null);
        jldate.setText(null);
        jlST.setText(null);
        jlTax.setText(null);
        jlTotal.setText(null);
        jlTno.setText(null);
        jlcost.setText(null);
        jlroute.setText(null);
        jlClass.setText(null);
        jlA.setText(null);
        jlChild.setText(null);
        jltime.setText(null);
        jLabel8.setText(null);
        jrbSt.setSelected(false);
        jrbEco.setSelected(false);
        jrbFC.setSelected(false);
        jrAyes.setSelected(false);
        jrCyes.setSelected(false);
        
    }//GEN-LAST:event_jbtnRessetActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_formWindowActivated

    private void jbtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jbtnExitMouseClicked

    private void jbtntotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtntotalActionPerformed
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        jltime.setText(tTime.format(timer.getTime()));
        
        SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-YYYY");
        jldate.setText(Tdate.format(timer.getTime()));
        
         jlto.setText((String) jCB.getSelectedItem()+"");
        jlroute.setText("Any");   
        
        if((jcb2.getSelectedItem()).equals("Barishal"))
            jlFrom.setText("Barishal");
        else
            jlFrom.setText("Kuakata");
        if ((jcb2.getSelectedItem()).equals("Barishal")&&(jCB.getSelectedItem()).equals("Barishal"))
        {
            jLabel8.setText("Error! You can't go Barishal to Barishal");
            jlFrom.setText("");
            jlroute.setText("");
            jldate.setText("");
            jlto.setText("");
            jltime.setText("");
        }
        else if((jcb2.getSelectedItem()).equals("Kuakata")&&(jCB.getSelectedItem()).equals("Kuakata"))
        {
            jLabel8.setText("Error! You can't go Kuakata to Kuakata");
            jlFrom.setText("");
            jlroute.setText("");
            jldate.setText("");
            jlto.setText("");
            jltime.setText("");
        }
            
    }//GEN-LAST:event_jbtntotalActionPerformed

    private void jbtntotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtntotalMouseClicked
        double tax = 10;
        double MilesK30 = 600;
        double totalCost, eco =50, fclass=100;
        if ((jrbSt.isSelected())&&(jrAyes.isSelected())&&(jcb2.getSelectedItem()).equals("Kuakata")&&(jCB.getSelectedItem()).equals("Barishal"))
        {
            totalCost = (tax*MilesK30)/100;
            String sTax = String.format("%.2f Taka",totalCost);
            jlTax.setText(sTax);
            String subTotal = String.format("%.2f Taka",MilesK30);
            jlST.setText(subTotal);
            String Total = String.format("%.2f Taka",MilesK30+totalCost);
            jlTotal.setText(Total);
            jlcost.setText(Total);
            jlClass.setText("Back");
            jlA.setText("YES");
            jlChild.setText("NO");
        }
        
        else if ((jrbSt.isSelected())&&(jrCyes.isSelected())&&(jcb2.getSelectedItem()).equals("Kuakata")&&(jCB.getSelectedItem()).equals("Barishal"))
        {
            totalCost = (tax*MilesK30)/100;
            String sTax = String.format("%.2f Taka",totalCost);
            jlTax.setText(sTax);
            String subTotal = String.format("%.2f Taka",MilesK30);
            jlST.setText(subTotal);
            String Total = String.format("%.2f Taka",MilesK30+totalCost-200);
            jlTotal.setText(Total);
            jlcost.setText(Total);
            jlClass.setText("Back");
            jlA.setText("NO");
            jlChild.setText("YES");
        }
        
        else if ((jrbSt.isSelected())&&(jrAyes.isSelected())&&(jcb2.getSelectedItem()).equals("Barishal")&&(jCB.getSelectedItem()).equals("Kuakata"))
        {
            totalCost = (tax*MilesK30)/100;
            String sTax = String.format("%.2f Taka",totalCost);
            jlTax.setText(sTax);
            String subTotal = String.format("%.2f Taka",MilesK30);
            jlST.setText(subTotal);
            String Total = String.format("%.2f Taka",MilesK30+totalCost);
            jlTotal.setText(Total);
            jlcost.setText(Total);
            jlClass.setText("Back");
            jlA.setText("YES");
            jlChild.setText("NO");
        }
        
        else if ((jrbSt.isSelected())&&(jrCyes.isSelected())&&(jcb2.getSelectedItem()).equals("Barishal")&&(jCB.getSelectedItem()).equals("Kuakata"))
        {
            totalCost = (tax*MilesK30)/100;
            String sTax = String.format("%.2f Taka",totalCost);
            jlTax.setText(sTax);
            String subTotal = String.format("%.2f Taka",MilesK30);
            jlST.setText(subTotal);
            String Total = String.format("%.2f Taka",MilesK30+totalCost-200);
            jlTotal.setText(Total);
            jlcost.setText(Total);
            jlClass.setText("Back");
            jlA.setText("NO");
            jlChild.setText("YES");
        }
        
        //================================================Middle============================================================//
        
        else if ((jrbEco.isSelected())&&(jrAyes.isSelected())&&(jcb2.getSelectedItem()).equals("Kuakata")&&(jCB.getSelectedItem()).equals("Barishal"))
        {
             totalCost = (tax*MilesK30)/100;
            String sTax = String.format("%.2f Taka",totalCost);
            jlTax.setText(sTax);
            String subTotal = String.format("%.2f Taka",MilesK30+eco);
            jlST.setText(subTotal);
            String Total = String.format("%.2f Taka",MilesK30+eco+totalCost);
            jlTotal.setText(Total);
            jlcost.setText(Total);
            jlClass.setText("MID");
            jlA.setText("YES");
            jlChild.setText("NO");
        }
       
        else if ((jrbEco.isSelected())&&(jrCyes.isSelected())&&(jcb2.getSelectedItem()).equals("Kuakata")&&(jCB.getSelectedItem()).equals("Barishal"))
        {
            totalCost = (tax*MilesK30)/100;
            String sTax = String.format("%.2f Taka",totalCost);
            jlTax.setText(sTax);
            String subTotal = String.format("%.2f Taka",MilesK30+eco);
            jlST.setText(subTotal);
            String Total = String.format("%.2f Taka",MilesK30+totalCost+eco-200);
            jlTotal.setText(Total);
            jlcost.setText(Total);
            jlClass.setText("MID");
            jlA.setText("NO");
            jlChild.setText("YES");
        }
        
        
        else if ((jrbEco.isSelected())&&(jrAyes.isSelected())&&(jcb2.getSelectedItem()).equals("Barishal")&&(jCB.getSelectedItem()).equals("Kuakata"))
        {
            totalCost = (tax*MilesK30)/100;
            String sTax = String.format("%.2f Taka",totalCost);
            jlTax.setText(sTax);
            String subTotal = String.format("%.2f Taka",MilesK30+eco);
            jlST.setText(subTotal);
            String Total = String.format("%.2f Taka",MilesK30+eco+totalCost);
            jlTotal.setText(Total);
            jlcost.setText(Total);
            jlClass.setText("MID");
            jlA.setText("YES");
            jlChild.setText("NO");
        }
        
        else if ((jrbEco.isSelected())&&(jrCyes.isSelected())&&(jcb2.getSelectedItem()).equals("Barishal")&&(jCB.getSelectedItem()).equals("Kuakata"))
        {
            totalCost = (tax*MilesK30)/100;
            String sTax = String.format("%.2f Taka",totalCost);
            jlTax.setText(sTax);
            String subTotal = String.format("%.2f Taka",MilesK30+eco);
            jlST.setText(subTotal);
            String Total = String.format("%.2f Taka",MilesK30+totalCost+eco-200);
            jlTotal.setText(Total);
            jlcost.setText(Total);
            jlClass.setText("MID");
            jlA.setText("NO");
            jlChild.setText("YES");
        }
     
        //=========================================Front==========================================//
        
        
         else if ((jrbFC.isSelected())&&(jrAyes.isSelected())&&(jcb2.getSelectedItem()).equals("Kuakata")&&(jCB.getSelectedItem()).equals("Barishal"))
        {
            totalCost = (tax*(MilesK30+fclass))/100;
            String sTax = String.format("%.2f Taka",totalCost);
            jlTax.setText(sTax);
            String subTotal = String.format("%.2f Taka",MilesK30+fclass);
            jlST.setText(subTotal);
            String Total = String.format("%.2f Taka",MilesK30+totalCost+fclass);
            jlTotal.setText(Total);
            jlcost.setText(Total);
            jlClass.setText("FRONT");
            jlA.setText("YES");
            jlChild.setText("NO");
        }
 
        else if ((jrbFC.isSelected())&&(jrCyes.isSelected())&&(jcb2.getSelectedItem()).equals("Kuakata")&&(jCB.getSelectedItem()).equals("Barishal"))
        {
             totalCost = (tax*MilesK30+fclass)/100;
            String sTax = String.format("%.2f Taka",totalCost);
            jlTax.setText(sTax);
            String subTotal = String.format("%.2f Taka",MilesK30+fclass);
            jlST.setText(subTotal);
            String Total = String.format("%.2f Taka",MilesK30+fclass+totalCost-200);
            jlTotal.setText(Total);
            jlcost.setText(Total);
            jlClass.setText("FRONT");
            jlA.setText("NO");
            jlChild.setText("YES");
        }
   
        else if ((jrbFC.isSelected())&&(jrAyes.isSelected())&&(jcb2.getSelectedItem()).equals("Barishal")&&(jCB.getSelectedItem()).equals("Kuakata"))
        {
            totalCost = (tax*(MilesK30+fclass))/100;
            String sTax = String.format("%.2f Taka",totalCost);
            jlTax.setText(sTax);
            String subTotal = String.format("%.2f Taka",MilesK30+fclass);
            jlST.setText(subTotal);
            String Total = String.format("%.2f Taka",MilesK30+totalCost+fclass);
            jlTotal.setText(Total);
            jlcost.setText(Total);
            jlClass.setText("FRONT");
            jlA.setText("YES");
            jlChild.setText("NO");
        }
 
        else if ((jrbFC.isSelected())&&(jrCyes.isSelected())&&(jcb2.getSelectedItem()).equals("Barishal")&&(jCB.getSelectedItem()).equals("Kuakata"))
        {
            totalCost = (tax*MilesK30+fclass)/100;
            String sTax = String.format("%.2f Taka",totalCost);
            jlTax.setText(sTax);
            String subTotal = String.format("%.2f Taka",MilesK30+fclass);
            jlST.setText(subTotal);
            String Total = String.format("%.2f Taka",MilesK30+fclass+totalCost-200);
            jlTotal.setText(Total);
            jlcost.setText(Total);
            jlClass.setText("FRONT");
            jlA.setText("NO");
            jlChild.setText("YES");
        }
    }//GEN-LAST:event_jbtntotalMouseClicked

    private void jrbStActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbStActionPerformed
        if(jrbSt.isSelected())
        {
            jrbFC.setSelected(false);
            jrbEco.setSelected(false);
        }
    }//GEN-LAST:event_jrbStActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
         if (B4.isSelected())
        {
            jrbFC.setSelected(true);
            jlTno.setText("B4");
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
         if (B5.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("B5");
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
         if (A7.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("A7");
        }
    }//GEN-LAST:event_A7ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
         if (B7.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("B7");
        }
    }//GEN-LAST:event_B7ActionPerformed

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A9ActionPerformed
         if (A9.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("A9");
        }
    }//GEN-LAST:event_A9ActionPerformed

    private void A10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A10ActionPerformed
        if (A10.isSelected())
        {
            jrbSt.setSelected(true);
            jlTno.setText("A10");
        }
    }//GEN-LAST:event_A10ActionPerformed

    private void B10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B10ActionPerformed
        if (B10.isSelected())
        {
            jrbSt.setSelected(true);
            jlTno.setText("B10");
        }
    }//GEN-LAST:event_B10ActionPerformed

    private void A11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A11ActionPerformed
        if (A11.isSelected())
        {
            jrbSt.setSelected(true);
            jlTno.setText("A11");
        }
    }//GEN-LAST:event_A11ActionPerformed

    private void B11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B11ActionPerformed
        if (B11.isSelected())
        {
            jrbSt.setSelected(true);
            jlTno.setText("B11");
        }
    }//GEN-LAST:event_B11ActionPerformed

    private void A12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A12ActionPerformed
        if (A12.isSelected())
        {
            jrbSt.setSelected(true);
            jlTno.setText("A12");
        }
    }//GEN-LAST:event_A12ActionPerformed

    private void B12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B12ActionPerformed
        if (B12.isSelected())
        {
            jrbSt.setSelected(true);
            jlTno.setText("B12");
        }
    }//GEN-LAST:event_B12ActionPerformed

    private void A13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A13ActionPerformed
        if (A13.isSelected())
        {
            jrbSt.setSelected(true);
            jlTno.setText("A13");
        }
    }//GEN-LAST:event_A13ActionPerformed

    private void B13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B13ActionPerformed
        if (B13.isSelected())
        {
            jrbSt.setSelected(true);
            jlTno.setText("B13");
        }
    }//GEN-LAST:event_B13ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
         if (B6.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("B6");
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
         if (D1.isSelected())
        {
            jrbFC.setSelected(true);
            jlTno.setText("D1");
        }
    }//GEN-LAST:event_D1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
         if (A2.isSelected())
        {
            jrbFC.setSelected(true);
            jlTno.setText("A2");
        }
    }//GEN-LAST:event_A2ActionPerformed

    private void D13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D13ActionPerformed
        if (D13.isSelected())
        {
            jrbSt.setSelected(true);
            jlTno.setText("D13");
        }
    }//GEN-LAST:event_D13ActionPerformed

    private void C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C10ActionPerformed
        if (C10.isSelected())
        {
            jrbSt.setSelected(true);
            jlTno.setText("C10");
        }
    }//GEN-LAST:event_C10ActionPerformed

    private void D10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D10ActionPerformed
        if (D10.isSelected())
        {
            jrbSt.setSelected(true);
            jlTno.setText("D10");
        }
    }//GEN-LAST:event_D10ActionPerformed

    private void C11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C11ActionPerformed
        if (C11.isSelected())
        {
            jrbSt.setSelected(true);
            jlTno.setText("C11");
        }
    }//GEN-LAST:event_C11ActionPerformed

    private void D11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D11ActionPerformed
        if (D11.isSelected())
        {
            jrbSt.setSelected(true);
            jlTno.setText("D11");
        }
    }//GEN-LAST:event_D11ActionPerformed

    private void C12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C12ActionPerformed
        if (C12.isSelected())
        {
            jrbSt.setSelected(true);
            jlTno.setText("C12");
        }
    }//GEN-LAST:event_C12ActionPerformed

    private void D12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D12ActionPerformed
        if (D12.isSelected())
        {
            jrbSt.setSelected(true);
            jlTno.setText("D12");
        }
    }//GEN-LAST:event_D12ActionPerformed

    private void C13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C13ActionPerformed
        if (C13.isSelected())
        {
            jrbSt.setSelected(true);
            jlTno.setText("C13");
        }
    }//GEN-LAST:event_C13ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        if (A5.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("A5");
        }
    }//GEN-LAST:event_A5ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
         if (A6.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("A6");
        }
    }//GEN-LAST:event_A6ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
         if (A8.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("A8");
        }
    }//GEN-LAST:event_A8ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
         if (B8.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("B8");
        }
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
         if (B9.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("B9");
        }
    }//GEN-LAST:event_B9ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
         if (C5.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("C5");
        }
    }//GEN-LAST:event_C5ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
         if (D5.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("D5");
        }
    }//GEN-LAST:event_D5ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
         if (C6.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("C6");
        }
    }//GEN-LAST:event_C6ActionPerformed

    private void D6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D6ActionPerformed
         if (D6.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("D6");
        }
    }//GEN-LAST:event_D6ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        if (C7.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("C7");
        }
    }//GEN-LAST:event_C7ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
         if (D7.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("D7");
        }
    }//GEN-LAST:event_D7ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
         if (C8.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("C8");
        }
    }//GEN-LAST:event_C8ActionPerformed

    private void D8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D8ActionPerformed
         if (D8.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("D8");
        }
    }//GEN-LAST:event_D8ActionPerformed

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
         if (C9.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("C9");
        }
    }//GEN-LAST:event_C9ActionPerformed

    private void D9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D9ActionPerformed
         if (D9.isSelected())
        {
            jrbEco.setSelected(true);
            jlTno.setText("D9");
        }
    }//GEN-LAST:event_D9ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        if (A1.isSelected())
        {
            jrbFC.setSelected(true);
            jlTno.setText("A1");
        }
    }//GEN-LAST:event_A1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
         if (B1.isSelected())
        {
            jrbFC.setSelected(true);
            jlTno.setText("B1");
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
         if (C1.isSelected())
        {
            jrbFC.setSelected(true);
            jlTno.setText("C1");
        }
    }//GEN-LAST:event_C1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
         if (B2.isSelected())
        {
            jrbFC.setSelected(true);
            jlTno.setText("B2");
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
         if (C2.isSelected())
        {
            jrbFC.setSelected(true);
            jlTno.setText("C2");
        }
    }//GEN-LAST:event_C2ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
         if (D2.isSelected())
        {
            jrbFC.setSelected(true);
            jlTno.setText("D2");
        }
    }//GEN-LAST:event_D2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
         if (A3.isSelected())
        {
            jrbFC.setSelected(true);
            jlTno.setText("A3");
        }
    }//GEN-LAST:event_A3ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        if (B3.isSelected())
        {
            jrbFC.setSelected(true);
            jlTno.setText("B3");
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
         if (C3.isSelected())
        {
            jrbFC.setSelected(true);
            jlTno.setText("C3");
        }
    }//GEN-LAST:event_C3ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
         if (D3.isSelected())
        {
            jrbFC.setSelected(true);
            jlTno.setText("D3");
        }
    }//GEN-LAST:event_D3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
         if (A4.isSelected())
        {
            jrbFC.setSelected(true);
            jlTno.setText("A4");
        }
    }//GEN-LAST:event_A4ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
         if (C4.isSelected())
        {
            jrbFC.setSelected(true);
            jlTno.setText("C4");
        }
    }//GEN-LAST:event_C4ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        if (D4.isSelected())
        {
            jrbFC.setSelected(true);
            jlTno.setText("D4");
        }
    }//GEN-LAST:event_D4ActionPerformed

    private void jCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        int countColumn=1;

        String DB_url;
        DB_url = "jdbc:mysql://localhost:3306/busticket";
        String DB_username = "root";
        String DB_password="";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
 
        try 
        {
            forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection (DB_url, DB_username, DB_password);
            statement = connection.createStatement();
            resultset = statement.executeQuery("select * from demo");

            ResultSetMetaData metadata = (ResultSetMetaData) resultset.getMetaData();     
            countColumn = metadata.getColumnCount();
        } 
        
        catch (SQLException ex) 
        {
            Logger.getLogger(BusTicket.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(BusTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int number = 1;
        
        try 
        {           
            
            while(resultset.next())
            {
              
             if (A1.isSelected()) 
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=1");
             }
             
             if(A2.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=2");
             }
             
             if(A3.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=3");
             }
             if(A4.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=4");
             }
             
             if(A5.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=5");
             }
             
             if(A6.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=6");
             }
             if(A7.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=7");
             }
             if(A8.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=8");
             }
             if(A9.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=9");
             }
             if(A10.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=10");
             }
             if(A11.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=11");
             }
             if(A12.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=12");
             }
            
             if(A13.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=13");
             }
             if(B1.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=14");
             }
             if(B2.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=15");
             }
             if(B3.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=16");
             }
             if(B4.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=17");
             }
             if(B5.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=18");
             }
             if(B6.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=19");
             }
             if(B7.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=20");
             }
             if(B8.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=21");
             }
             if(B9.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=22");
             }
             if(B10.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=23");
             }
             if(B11.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=24");
             }
             if(B12.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=25");
             }
             if(B13.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=26");
             }
             if(C1.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=27");
             }
             if(C2.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=28");
             }
             if(C3.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=29");
             }
             if(C4.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=30");
             }
             if(C5.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=31");
             }
             if(C6.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=32");
             }
             if(C7.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=33");
             }
             if(C8.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=34");
             }
             if(C9.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=35");
             }
             if(C10.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=36");
             }
             if(C11.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=37");
             }
             if(C12.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=38");
             }
             if(C13.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=39");
             }
             if(D1.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=40");
             }
             if(D2.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=41");
             }
             if(D3.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=42");
             }
             if(D4.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=43");
             }
             if(D5.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=44");
             }
             if(D6.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=45");
             }
             if(D7.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=46");
             }
             if(D8.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=47");
             }
             if(D9.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=48");
             }
             if(D10.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=49");
             }
             if(D11.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=50");
             }
             if(D12.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=51");
             }
             if(D13.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'no' where seatId=52");
             }
             
                                       
            String rows[] = new String[3];
             
            for(int i=1; i<=countColumn;i++)
            {
                rows[i-1]=(String) resultset.getObject(i);
            }
            
            
            if(rows[1].equals("A1") && rows[2].equals("no"))
            { 
                A1.setVisible(true);
            }
            if(rows[1].equals("A2") && rows[2].equals("no"))
            { 
                A2.setVisible(true);
            }
            if(rows[1].equals("A3") && rows[2].equals("no"))
            { 
                A3.setVisible(true);
            }
            if(rows[1].equals("A4") && rows[2].equals("no"))
            { 
                A4.setVisible(true);
            }
            if(rows[1].equals("A5") && rows[2].equals("no"))
            { 
                A5.setVisible(true);
            }
            if(rows[1].equals("A6") && rows[2].equals("no"))
            { 
                A6.setVisible(true);
            }
            if(rows[1].equals("A7") && rows[2].equals("no"))
            { 
                A7.setVisible(true);
            }
            if(rows[1].equals("A8") && rows[2].equals("no"))
            { 
                A8.setVisible(true);
            }
            if(rows[1].equals("A9") && rows[2].equals("no"))
            { 
                A9.setVisible(true);
            }
            if(rows[1].equals("A10") && rows[2].equals("no"))
            { 
                A10.setVisible(true);
            }
            if(rows[1].equals("A11") && rows[2].equals("no"))
            { 
                A11.setVisible(true);
            }
            if(rows[1].equals("A12") && rows[2].equals("no"))
            { 
                A12.setVisible(true);
            }
            if(rows[1].equals("A13") && rows[2].equals("no"))
            { 
                A13.setVisible(true);
            }
            if(rows[1].equals("B1") && rows[2].equals("no"))
            { 
                B1.setVisible(true);
            }
            
            if(rows[1].equals("B2") && rows[2].equals("no"))
            { 
                B2.setVisible(true);
            }
            if(rows[1].equals("B3") && rows[2].equals("no"))
            { 
                B3.setVisible(true);
            }
            if(rows[1].equals("B4") && rows[2].equals("no"))
            { 
                B4.setVisible(true);
            }
            if(rows[1].equals("B5") && rows[2].equals("no"))
            { 
                B5.setVisible(true);
            }
            if(rows[1].equals("B6") && rows[2].equals("no"))
            { 
                B6.setVisible(true);
            }
            if(rows[1].equals("B7") && rows[2].equals("no"))
            { 
                B7.setVisible(true);
            }
            if(rows[1].equals("B8") && rows[2].equals("no"))
            { 
                B8.setVisible(true);
            }
            if(rows[1].equals("B9") && rows[2].equals("no"))
            { 
                B9.setVisible(true);
            }
            if(rows[1].equals("B10") && rows[2].equals("no"))
            { 
                B10.setVisible(true);
            }
            if(rows[1].equals("B11") && rows[2].equals("no"))
            { 
                B11.setVisible(true);
            }
            if(rows[1].equals("B12") && rows[2].equals("no"))
            { 
                B12.setVisible(true);
            }
            if(rows[1].equals("B13") && rows[2].equals("no"))
            { 
                B13.setVisible(true);
            }
            if(rows[1].equals("C1") && rows[2].equals("no"))
            { 
                C1.setVisible(true);
            }
            if(rows[1].equals("C2") && rows[2].equals("no"))
            { 
                C2.setVisible(true);
            }
            if(rows[1].equals("C3") && rows[2].equals("no"))
            { 
                C3.setVisible(true);
            }
            if(rows[1].equals("C4") && rows[2].equals("no"))
            { 
                C4.setVisible(true);
            }
            if(rows[1].equals("C5") && rows[2].equals("no"))
            { 
                C5.setVisible(true);
            }
            if(rows[1].equals("C6") && rows[2].equals("no"))
            { 
                C6.setVisible(true);
            }
            if(rows[1].equals("C7") && rows[2].equals("no"))
            { 
                C7.setVisible(true);
            }
            if(rows[1].equals("C8") && rows[2].equals("no"))
            { 
                C8.setVisible(true);
            }
            if(rows[1].equals("C9") && rows[2].equals("no"))
            { 
                C9.setVisible(true);
            }
            if(rows[1].equals("C10") && rows[2].equals("no"))
            { 
                C10.setVisible(true);
            }
            if(rows[1].equals("C11") && rows[2].equals("no"))
            { 
                C11.setVisible(true);
            }
            if(rows[1].equals("C12") && rows[2].equals("no"))
            { 
                C12.setVisible(true);
            }
            if(rows[1].equals("C13") && rows[2].equals("no"))
            { 
                C13.setVisible(true);
            }
            if(rows[1].equals("D1") && rows[2].equals("no"))
            { 
                D1.setVisible(true);
            }
            if(rows[1].equals("D2") && rows[2].equals("no"))
            { 
                D2.setVisible(true);
            }
            if(rows[1].equals("D3") && rows[2].equals("no"))
            { 
                D3.setVisible(true);
            }
            if(rows[1].equals("D4") && rows[2].equals("no"))
            { 
                D4.setVisible(true);
            }
            if(rows[1].equals("D5") && rows[2].equals("no"))
            { 
                D5.setVisible(true);
            }
            if(rows[1].equals("D6") && rows[2].equals("no"))
            { 
                D6.setVisible(true);
            }
            if(rows[1].equals("D7") && rows[2].equals("no"))
            { 
                D7.setVisible(true);
            }
            if(rows[1].equals("D8") && rows[2].equals("no"))
            { 
                D8.setVisible(true);
            }
            if(rows[1].equals("D9") && rows[2].equals("no"))
            { 
                D9.setVisible(true);
            }
            if(rows[1].equals("D10") && rows[2].equals("no"))
            { 
                D10.setVisible(true);
            }
            if(rows[1].equals("D11") && rows[2].equals("no"))
            { 
                D11.setVisible(true);
            }
            if(rows[1].equals("D12") && rows[2].equals("no"))
            { 
                D12.setVisible(true);
            }
            if(rows[1].equals("D13") && rows[2].equals("no"))
            { 
                D13.setVisible(true);
            }
          }      
        } 
        
        catch (SQLException ex) 
        {
            Logger.getLogger(BusTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally
        {        
            try 
            {
                resultset.close();
                statement.close();
                connection.close();
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(BusTicket.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
        
        A1.setSelected(false);
        A1.setSelected(false);
        A1.setSelected(false);
        A1.setSelected(false);
        A2.setSelected(false);
        A3.setSelected(false);
        A4.setSelected(false);
        A5.setSelected(false);
        A6.setSelected(false);
        A7.setSelected(false);
        A8.setSelected(false);
        A9.setSelected(false);
        A10.setSelected(false);
        A11.setSelected(false);
        A12.setSelected(false);
        A13.setSelected(false);
        B1.setSelected(false);
        B2.setSelected(false);
        B3.setSelected(false);
        B4.setSelected(false);
        B5.setSelected(false);
        B6.setSelected(false);
        B7.setSelected(false);
        B8.setSelected(false);
        B9.setSelected(false);
        B10.setSelected(false);
        B11.setSelected(false);
        B12.setSelected(false);
        B13.setSelected(false);
        C1.setSelected(false);
        C2.setSelected(false);
        C3.setSelected(false);
        C4.setSelected(false);
        C5.setSelected(false);
        C6.setSelected(false);
        C7.setSelected(false);
        C8.setSelected(false);
        C9.setSelected(false);
        C10.setSelected(false);
        C11.setSelected(false);
        C12.setSelected(false);
        C13.setSelected(false);
        D1.setSelected(false);
        D2.setSelected(false);
        D3.setSelected(false);
        D4.setSelected(false);
        D5.setSelected(false);
        D6.setSelected(false);
        D7.setSelected(false);
        D8.setSelected(false);
        D9.setSelected(false);
        D10.setSelected(false);
        D11.setSelected(false);
        D12.setSelected(false);
        D13.setSelected(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void savebtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtn2ActionPerformed

        int countColumn=1;

        String DB_url;
        DB_url = "jdbc:mysql://localhost:3306/busticket";
        String DB_username = "root";
        String DB_password="";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
 
        try 
        {
            forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection (DB_url, DB_username, DB_password);
            statement = connection.createStatement();
            resultset = statement.executeQuery("select * from demo");

            ResultSetMetaData metadata = (ResultSetMetaData) resultset.getMetaData();     
            countColumn = metadata.getColumnCount();
        } 
        
        catch (SQLException ex) 
        {
            Logger.getLogger(BusTicket.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(BusTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int number = 1;
        
        try 
        {           
            String rows[] = new String[3];
            
            while(resultset.next())
            {
              
             if (A1.isSelected()) 
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=1");
             }
             
             if(A2.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=2");
             }
             
             if(A3.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=3");
             }
             if(A4.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=4");
             }
             
             if(A5.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=5");
             }
             
             if(A6.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=6");
             }
             if(A7.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=7");
             }
             if(A8.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=8");
             }
             if(A9.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=9");
             }
             if(A10.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=10");
             }
             if(A11.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=11");
             }
             if(A12.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=12");
             }
            
             if(A13.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=13");
             }
             if(B1.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=14");
             }
             if(B2.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=15");
             }
             if(B3.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=16");
             }
             if(B4.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=17");
             }
             if(B5.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=18");
             }
             if(B6.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=19");
             }
             if(B7.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=20");
             }
             if(B8.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=21");
             }
             if(B9.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=22");
             }
             if(B10.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=23");
             }
             if(B11.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=24");
             }
             if(B12.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=25");
             }
             if(B13.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=26");
             }
             if(C1.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=27");
             }
             if(C2.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=28");
             }
             if(C3.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=29");
             }
             if(C4.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=30");
             }
             if(C5.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=31");
             }
             if(C6.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=32");
             }
             if(C7.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=33");
             }
             if(C8.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=34");
             }
             if(C9.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=35");
             }
             if(C10.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=36");
             }
             if(C11.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=37");
             }
             if(C12.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=38");
             }
             if(C13.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=39");
             }
             if(D1.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=40");
             }
             if(D2.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=41");
             }
             if(D3.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=42");
             }
             if(D4.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=43");
             }
             if(D5.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=44");
             }
             if(D6.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=45");
             }
             if(D7.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=46");
             }
             if(D8.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=47");
             }
             if(D9.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=48");
             }
             if(D10.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=49");
             }
             if(D11.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=50");
             }
             if(D12.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=51");
             }
             if(D13.isSelected())
             {
                 statement =(Statement) connection.createStatement();
                 statement.executeUpdate("UPDATE demo set status = 'yes' where seatId=52");
             }
             
             
            for(int i=1; i<=countColumn;i++)
             {
                 rows[i-1]=(String) resultset.getObject(i);
             }
             
             
            if(rows[1].equals("A1") && rows[2].equals("yes"))
            { 
                A1.setVisible(false);
                A1.setSelected(true);
            }
            if(rows[1].equals("A2") && rows[2].equals("yes"))
            { 
                A2.setVisible(false);
                A2.setSelected(true);
            }
            if(rows[1].equals("A3") && rows[2].equals("yes"))
            { 
                A3.setVisible(false);
                A3.setSelected(true);
            }
            if(rows[1].equals("A4") && rows[2].equals("yes"))
            { 
                A4.setVisible(false);
                A4.setSelected(true);
            }
            if(rows[1].equals("A5") && rows[2].equals("yes"))
            { 
                A5.setVisible(false);
                A5.setSelected(true);
            }
            if(rows[1].equals("A6") && rows[2].equals("yes"))
            { 
                A6.setVisible(false);
                A6.setSelected(true);
            }
            if(rows[1].equals("A7") && rows[2].equals("yes"))
            { 
                A7.setVisible(false);
                A7.setSelected(true);
            }
            if(rows[1].equals("A8") && rows[2].equals("yes"))
            { 
                A8.setVisible(false);
                A8.setSelected(true);
            }
            if(rows[1].equals("A9") && rows[2].equals("yes"))
            { 
                A9.setVisible(false);
                A9.setSelected(true);
            }
            if(rows[1].equals("A10") && rows[2].equals("yes"))
            { 
                A10.setVisible(false);
                A10.setSelected(true);
            }
            if(rows[1].equals("A11") && rows[2].equals("yes"))
            { 
                A11.setVisible(false);
                A11.setSelected(true);
            }
            if(rows[1].equals("A12") && rows[2].equals("yes"))
            { 
                A12.setVisible(false);
                A12.setSelected(true);
            }
            if(rows[1].equals("A13") && rows[2].equals("yes"))
            { 
                A13.setVisible(false);
                A13.setSelected(true);
            }
            if(rows[1].equals("B1") && rows[2].equals("yes"))
            { 
                B1.setVisible(false);
                B1.setSelected(true);
            }
            
            if(rows[1].equals("B2") && rows[2].equals("yes"))
            { 
                B2.setVisible(false);
                B2.setSelected(true);
            }
            if(rows[1].equals("B3") && rows[2].equals("yes"))
            { 
                B3.setVisible(false);
                B3.setSelected(true);
            }
            if(rows[1].equals("B4") && rows[2].equals("yes"))
            { 
                B4.setVisible(false);
                B4.setSelected(true);
            }
            if(rows[1].equals("B5") && rows[2].equals("yes"))
            { 
                B5.setVisible(false);
                B5.setSelected(true);
            }
            if(rows[1].equals("B6") && rows[2].equals("yes"))
            { 
                B6.setVisible(false);
                B6.setSelected(true);
            }
            if(rows[1].equals("B7") && rows[2].equals("yes"))
            { 
                B7.setVisible(false);
                B7.setSelected(true);
            }
            if(rows[1].equals("B8") && rows[2].equals("yes"))
            { 
                B8.setVisible(false);
                B8.setSelected(true);
            }
            if(rows[1].equals("B9") && rows[2].equals("yes"))
            { 
                B9.setVisible(false);
                B9.setSelected(true);
            }
            if(rows[1].equals("B10") && rows[2].equals("yes"))
            { 
                B10.setVisible(false);
                B10.setSelected(true);
            }
            if(rows[1].equals("B11") && rows[2].equals("yes"))
            { 
                B11.setVisible(false);
                B11.setSelected(true);
            }
            if(rows[1].equals("B12") && rows[2].equals("yes"))
            { 
                B12.setVisible(false);
                B12.setSelected(true);
            }
            if(rows[1].equals("B13") && rows[2].equals("yes"))
            { 
                B13.setVisible(false);
                B13.setSelected(true);
            }
            if(rows[1].equals("C1") && rows[2].equals("yes"))
            { 
                C1.setVisible(false);
                C1.setSelected(true);
            }
            if(rows[1].equals("C2") && rows[2].equals("yes"))
            { 
                C2.setVisible(false);
                C2.setSelected(true);
            }
            if(rows[1].equals("C3") && rows[2].equals("yes"))
            { 
                C3.setVisible(false);
                C3.setSelected(true);
            }
            if(rows[1].equals("C4") && rows[2].equals("yes"))
            { 
                C4.setVisible(false);
                C4.setSelected(true);
            }
            if(rows[1].equals("C5") && rows[2].equals("yes"))
            { 
                C5.setVisible(false);
                C5.setSelected(true);
            }
            if(rows[1].equals("C6") && rows[2].equals("yes"))
            { 
                C6.setVisible(false);
                C6.setSelected(true);
            }
            if(rows[1].equals("C7") && rows[2].equals("yes"))
            { 
                C7.setVisible(false);
                C7.setSelected(true);
            }
            if(rows[1].equals("C8") && rows[2].equals("yes"))
            { 
                C8.setVisible(false);
                C8.setSelected(true);
            }
            if(rows[1].equals("C9") && rows[2].equals("yes"))
            { 
                C9.setVisible(false);
                C9.setSelected(true);
            }
            if(rows[1].equals("C10") && rows[2].equals("yes"))
            { 
                C10.setVisible(false);
                C10.setSelected(true);
            }
            if(rows[1].equals("C11") && rows[2].equals("yes"))
            { 
                C11.setVisible(false);
                C11.setSelected(true);
            }
            if(rows[1].equals("C12") && rows[2].equals("yes"))
            { 
                C12.setVisible(false);
                C12.setSelected(true);
            }
            if(rows[1].equals("C13") && rows[2].equals("yes"))
            { 
                C13.setVisible(true);
                C13.setSelected(true);
            }
            if(rows[1].equals("D1") && rows[2].equals("yes"))
            { 
                D1.setVisible(false);
                D1.setSelected(true);
            }
            if(rows[1].equals("D2") && rows[2].equals("yes"))
            { 
                D2.setVisible(false);
                D2.setSelected(true);
            }
            if(rows[1].equals("D3") && rows[2].equals("yes"))
            { 
                D3.setVisible(false);
                D3.setSelected(true);
            }
            if(rows[1].equals("D4") && rows[2].equals("yes"))
            { 
                D4.setVisible(false);
                D4.setSelected(true);
            }
            if(rows[1].equals("D5") && rows[2].equals("yes"))
            { 
                D5.setVisible(false);
                D5.setSelected(true);

            }
            if(rows[1].equals("D6") && rows[2].equals("yes"))
            { 
                D6.setVisible(false);
                D6.setSelected(true);
            }
            if(rows[1].equals("D7") && rows[2].equals("yes"))
            { 
                D7.setVisible(false);
                D7.setSelected(true);
            }
            if(rows[1].equals("D8") && rows[2].equals("yes"))
            { 
                D8.setVisible(false);
                D8.setSelected(true);
            }
            if(rows[1].equals("D9") && rows[2].equals("yes"))
            { 
                D9.setVisible(false);
                D9.setSelected(true);
            }
            if(rows[1].equals("D10") && rows[2].equals("yes"))
            { 
                D10.setVisible(false);
                D10.setSelected(true);
            }
            if(rows[1].equals("D11") && rows[2].equals("yes"))
            { 
                D11.setVisible(false);
                D11.setSelected(true);
            }
            if(rows[1].equals("D12") && rows[2].equals("yes"))
            { 
                D12.setVisible(false);
                D12.setSelected(true);
            }
            if(rows[1].equals("D13") && rows[2].equals("yes"))
            { 
                D13.setVisible(false);
                D13.setSelected(true);
            }
            }      
        } 
        
        catch (SQLException ex) 
        {
            Logger.getLogger(BusTicket.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally
        {        
            try 
            {
                resultset.close();
                statement.close();
                connection.close();
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(BusTicket.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    }//GEN-LAST:event_savebtn2ActionPerformed

    private void A1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A1MouseClicked
              
    }//GEN-LAST:event_A1MouseClicked

    private void jcb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb2ActionPerformed

    private void savebtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtn2MouseClicked
        
    }//GEN-LAST:event_savebtn2MouseClicked

    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
          

          PrinterJob pj = PrinterJob.getPrinterJob();
          pj.setJobName(" Print Component ");

          pj.setPrintable (new Printable() {    
            public int print(Graphics pg, PageFormat pf, int pageNum) {
              if (pageNum > 0) return Printable.NO_SUCH_PAGE;

              Graphics2D g2 = (Graphics2D) pg;
              g2.translate(pf.getImageableX(), pf.getImageableY());
              printPanel.paint(g2);
              return Printable.PAGE_EXISTS;
            }

             
          });

          if (pj.printDialog() == false) return;

          try {
            pj.print();
          } catch (PrinterException ex) {
            // handle exception
          }
        
    }//GEN-LAST:event_pActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnExitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A1;
    private javax.swing.JRadioButton A10;
    private javax.swing.JRadioButton A11;
    private javax.swing.JRadioButton A12;
    private javax.swing.JRadioButton A13;
    private javax.swing.JRadioButton A2;
    private javax.swing.JRadioButton A3;
    private javax.swing.JRadioButton A4;
    private javax.swing.JRadioButton A5;
    private javax.swing.JRadioButton A6;
    private javax.swing.JRadioButton A7;
    private javax.swing.JRadioButton A8;
    private javax.swing.JRadioButton A9;
    private javax.swing.JRadioButton B1;
    private javax.swing.JRadioButton B10;
    private javax.swing.JRadioButton B11;
    private javax.swing.JRadioButton B12;
    private javax.swing.JRadioButton B13;
    private javax.swing.JRadioButton B2;
    private javax.swing.JRadioButton B3;
    private javax.swing.JRadioButton B4;
    private javax.swing.JRadioButton B5;
    private javax.swing.JRadioButton B6;
    private javax.swing.JRadioButton B7;
    private javax.swing.JRadioButton B8;
    private javax.swing.JRadioButton B9;
    private javax.swing.JRadioButton C1;
    private javax.swing.JRadioButton C10;
    private javax.swing.JRadioButton C11;
    private javax.swing.JRadioButton C12;
    private javax.swing.JRadioButton C13;
    private javax.swing.JRadioButton C2;
    private javax.swing.JRadioButton C3;
    private javax.swing.JRadioButton C4;
    private javax.swing.JRadioButton C5;
    private javax.swing.JRadioButton C6;
    private javax.swing.JRadioButton C7;
    private javax.swing.JRadioButton C8;
    private javax.swing.JRadioButton C9;
    private javax.swing.JRadioButton D1;
    private javax.swing.JRadioButton D10;
    private javax.swing.JRadioButton D11;
    private javax.swing.JRadioButton D12;
    private javax.swing.JRadioButton D13;
    private javax.swing.JRadioButton D2;
    private javax.swing.JRadioButton D3;
    private javax.swing.JRadioButton D4;
    private javax.swing.JRadioButton D5;
    private javax.swing.JRadioButton D6;
    private javax.swing.JRadioButton D7;
    private javax.swing.JRadioButton D8;
    private javax.swing.JRadioButton D9;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCB;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLebel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnResset;
    private javax.swing.JButton jbtntotal;
    private javax.swing.JComboBox<String> jcb2;
    private javax.swing.JLabel jlA;
    private javax.swing.JLabel jlChild;
    private javax.swing.JLabel jlClass;
    private javax.swing.JLabel jlFrom;
    private javax.swing.JLabel jlST;
    private javax.swing.JLabel jlTax;
    private javax.swing.JLabel jlTno;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JLabel jlcost;
    private javax.swing.JLabel jldate;
    private javax.swing.JLabel jlroute;
    private javax.swing.JLabel jltime;
    private javax.swing.JLabel jlto;
    private javax.swing.JRadioButton jrAyes;
    private javax.swing.JRadioButton jrCyes;
    private javax.swing.JRadioButton jrbEco;
    private javax.swing.JRadioButton jrbFC;
    private javax.swing.JRadioButton jrbSt;
    private javax.swing.JButton p;
    private javax.swing.JPanel printPanel;
    private javax.swing.JButton savebtn2;
    // End of variables declaration//GEN-END:variables

    private void ClassforName(String commysqljdbcDriver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}