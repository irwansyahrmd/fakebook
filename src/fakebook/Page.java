/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fakebook;

import java.awt.CardLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Irwansyah
 */
public class Page extends javax.swing.JFrame {

    /**
     * Creates new form Page
     */
    public Page() {
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

        topPanel = new javax.swing.JPanel();
        homePage = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usenamerloginTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordloginTF = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        loginBTN = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        singnUpBTN = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        firstNameTF = new javax.swing.JTextField();
        lastNameTF = new javax.swing.JTextField();
        emailsignUpTF = new javax.swing.JTextField();
        usernamesignUpTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        passwordsignUpPF = new javax.swing.JPasswordField();
        monthCB = new javax.swing.JComboBox();
        dayCB = new javax.swing.JComboBox();
        yearCB = new javax.swing.JComboBox();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        phonesignUpTF = new javax.swing.JTextField();
        homeUser = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        topPanel.setLayout(new java.awt.CardLayout());

        homePage.setBackground(new java.awt.Color(231, 235, 244));

        jPanel1.setBackground(new java.awt.Color(59, 89, 153));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fakebook/picture/fakebookLogo.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");

        passwordloginTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordloginTFActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(247, 247, 247));
        jLabel4.setForeground(new java.awt.Color(139, 157, 206));
        jLabel4.setText("Forgot your password?");

        loginBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fakebook/picture/loginbutton.jpg"))); // NOI18N
        loginBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBTNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usenamerloginTF, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(passwordloginTF, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginBTN))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(usenamerloginTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(passwordloginTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(loginBTN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())))
        );

        jLabel2.getAccessibleContext().setAccessibleName("logo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fakebook/picture/itsFree.JPG"))); // NOI18N

        singnUpBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fakebook/picture/signUpButton.JPG"))); // NOI18N
        singnUpBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                singnUpBTNMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fakebook/picture/chatForFree.jpg"))); // NOI18N

        firstNameTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstNameTF.setText("First Name");
        firstNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstNameTFMouseClicked(evt);
            }
        });

        lastNameTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lastNameTF.setText("Last Name");
        lastNameTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lastNameTFMouseClicked(evt);
            }
        });
        lastNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTFActionPerformed(evt);
            }
        });

        emailsignUpTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        emailsignUpTF.setText("Your Email");
        emailsignUpTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailsignUpTFMouseClicked(evt);
            }
        });
        emailsignUpTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailsignUpTFActionPerformed(evt);
            }
        });

        usernamesignUpTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usernamesignUpTF.setText("Username");
        usernamesignUpTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernamesignUpTFMouseClicked(evt);
            }
        });
        usernamesignUpTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamesignUpTFActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Birthday");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Password");

        passwordsignUpPF.setText("jPasswordField2");
        passwordsignUpPF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordsignUpPFMouseClicked(evt);
            }
        });
        passwordsignUpPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordsignUpPFActionPerformed(evt);
            }
        });

        monthCB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        monthCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        dayCB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dayCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        yearCB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yearCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Year", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905" }));

        male.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        female.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        phonesignUpTF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        phonesignUpTF.setText("Phone Number");
        phonesignUpTF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phonesignUpTFMouseClicked(evt);
            }
        });
        phonesignUpTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonesignUpTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homePageLayout = new javax.swing.GroupLayout(homePage);
        homePage.setLayout(homePageLayout);
        homePageLayout.setHorizontalGroup(
            homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homePageLayout.createSequentialGroup()
                        .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(passwordsignUpPF)
                    .addComponent(emailsignUpTF)
                    .addGroup(homePageLayout.createSequentialGroup()
                        .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(singnUpBTN)
                            .addGroup(homePageLayout.createSequentialGroup()
                                .addComponent(female)
                                .addGap(28, 28, 28)
                                .addComponent(male))
                            .addGroup(homePageLayout.createSequentialGroup()
                                .addComponent(monthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(dayCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(yearCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(phonesignUpTF)
                    .addComponent(usernamesignUpTF))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        homePageLayout.setVerticalGroup(
            homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePageLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(homePageLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(homePageLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lastNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailsignUpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phonesignUpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernamesignUpTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordsignUpPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(monthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dayCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(homePageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(female)
                            .addComponent(male))
                        .addGap(18, 18, 18)
                        .addComponent(singnUpBTN)
                        .addGap(42, 42, 42))))
        );

        topPanel.add(homePage, "homePage");

        homeUser.setBackground(new java.awt.Color(231, 235, 244));

        jPanel3.setBackground(new java.awt.Color(59, 89, 153));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fakebook/picture/fakebookLogo.jpg"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("LOG OUT");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 111)); // NOI18N
        jLabel10.setText("UNDER");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 111)); // NOI18N
        jLabel11.setText("CONSTRUCTION");

        javax.swing.GroupLayout homeUserLayout = new javax.swing.GroupLayout(homeUser);
        homeUser.setLayout(homeUserLayout);
        homeUserLayout.setHorizontalGroup(
            homeUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(homeUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeUserLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeUserLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(250, 250, 250))))
        );
        homeUserLayout.setVerticalGroup(
            homeUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeUserLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(jLabel10)
                .addGap(50, 50, 50)
                .addComponent(jLabel11)
                .addGap(0, 127, Short.MAX_VALUE))
        );

        topPanel.add(homeUser, "homeUser");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordloginTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordloginTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordloginTFActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        male.setSelected(false);
    }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        female.setSelected(false);
    }//GEN-LAST:event_maleActionPerformed

    private void firstNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstNameTFMouseClicked
        // TODO add your handling code here:
        firstNameTF.setText("");
    }//GEN-LAST:event_firstNameTFMouseClicked

    private void lastNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTFActionPerformed

    }//GEN-LAST:event_lastNameTFActionPerformed

    private void emailsignUpTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailsignUpTFActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_emailsignUpTFActionPerformed

    private void phonesignUpTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonesignUpTFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_phonesignUpTFActionPerformed

    private void usernamesignUpTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamesignUpTFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usernamesignUpTFActionPerformed

    private void passwordsignUpPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordsignUpPFActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_passwordsignUpPFActionPerformed

    private void lastNameTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lastNameTFMouseClicked
        // TODO add your handling code here:
        lastNameTF.setText("");
    }//GEN-LAST:event_lastNameTFMouseClicked

    private void emailsignUpTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailsignUpTFMouseClicked
        // TODO add your handling code here:
        emailsignUpTF.setText("");
    }//GEN-LAST:event_emailsignUpTFMouseClicked

    private void phonesignUpTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phonesignUpTFMouseClicked
        // TODO add your handling code here:
        phonesignUpTF.setText("");
    }//GEN-LAST:event_phonesignUpTFMouseClicked

    private void usernamesignUpTFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernamesignUpTFMouseClicked
        // TODO add your handling code here:
        usernamesignUpTF.setText("");
    }//GEN-LAST:event_usernamesignUpTFMouseClicked

    private void passwordsignUpPFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordsignUpPFMouseClicked
        // TODO add your handling code here:
        passwordsignUpPF.setText("");
    }//GEN-LAST:event_passwordsignUpPFMouseClicked

    private void singnUpBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_singnUpBTNMouseClicked
        // TODO add your handling code here:
        String birthday = null;

        switch (monthCB.getSelectedIndex()) {
            case 1:
                    birthday=(String) dayCB.getSelectedItem()+"JAN"+yearCB.getSelectedItem();
                break;
            case 2:
                    birthday=(String) dayCB.getSelectedItem()+"FEB"+yearCB.getSelectedItem();
                break;
            case 3:
                    birthday=(String) dayCB.getSelectedItem()+"MAR"+yearCB.getSelectedItem();
                break;
            case 4:
                    birthday=(String) dayCB.getSelectedItem()+"APR"+yearCB.getSelectedItem();
                break;
            case 5:
                    birthday=(String) dayCB.getSelectedItem()+"MEI"+yearCB.getSelectedItem();
                break;
            case 6:
                    birthday=(String) dayCB.getSelectedItem()+"JUN"+yearCB.getSelectedItem();
                break;
            case 7:
                    birthday=(String) dayCB.getSelectedItem()+"JUL"+yearCB.getSelectedItem();
                break;
            case 8:
                    birthday=(String) dayCB.getSelectedItem()+"AUG"+yearCB.getSelectedItem();
                break;
            case 9:
                    birthday=(String) dayCB.getSelectedItem()+"SEP"+yearCB.getSelectedItem();
                break;
            case 10:
                    birthday=(String) dayCB.getSelectedItem()+"OKT"+yearCB.getSelectedItem();
                break;
            case 11:
                    birthday=(String) dayCB.getSelectedItem()+"NOV"+yearCB.getSelectedItem();
                break;
            case 12:
                    birthday=(String) dayCB.getSelectedItem()+"DES"+yearCB.getSelectedItem();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Birthday Empty!");
        }
        String genre = null;
        if(male.isSelected()){
            genre = "M";
        }else if(female.isSelected()){
            genre = "F";
        }else{
            JOptionPane.showMessageDialog(null, "Genre Empty!");
        }
        if((male.isSelected()||female.isSelected()) && (monthCB.getSelectedIndex() != 0)){
        User user;
        user = new User(firstNameTF.getText(),lastNameTF.getText(),usernamesignUpTF.getText(),passwordsignUpPF.getText(),
                emailsignUpTF.getText(),phonesignUpTF.getText(),birthday,genre);
        
        user.insertToDatabase();
        JOptionPane.showMessageDialog(null, "WELCOME TO FAKEBOOK!!\nNow You can Login to Your Fakebook Account");
        firstNameTF.setText("First Name");
        lastNameTF.setText("Last Name");
        phonesignUpTF.setText("Phone Number");
        emailsignUpTF.setText("Your Email");
        usernamesignUpTF.setText("Username");
        monthCB.setSelectedIndex(0);
        dayCB.setSelectedIndex(0);
        yearCB.setSelectedIndex(0);
        }
    }//GEN-LAST:event_singnUpBTNMouseClicked

    private void loginBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBTNMouseClicked
        // TODO add your handling code here:
        Database db = new Database();
        String cmd = "SELECT username, phone, email, password FROM users WHERE username='"+usenamerloginTF.getText()+"' AND password='"+passwordloginTF.getText()+"'";
        ResultSet rs = db.getData(cmd);
        try {
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login Success!");
                CardLayout cl = (CardLayout) topPanel.getLayout();
                cl.show(topPanel, "homeUser");
            }else{
                JOptionPane.showMessageDialog(null, "Login Failed!\nYour password or username wrong!");
            }
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_loginBTNMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        usenamerloginTF.setText("");
        passwordloginTF.setText("");
        CardLayout cl = (CardLayout) topPanel.getLayout();
        cl.show(topPanel, "homePage");
    }//GEN-LAST:event_jLabel12MouseClicked

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
            java.util.logging.Logger.getLogger(Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox dayCB;
    private javax.swing.JTextField emailsignUpTF;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstNameTF;
    private javax.swing.JPanel homePage;
    private javax.swing.JPanel homeUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lastNameTF;
    private javax.swing.JLabel loginBTN;
    private javax.swing.JRadioButton male;
    private javax.swing.JComboBox monthCB;
    private javax.swing.JPasswordField passwordloginTF;
    private javax.swing.JPasswordField passwordsignUpPF;
    private javax.swing.JTextField phonesignUpTF;
    private javax.swing.JLabel singnUpBTN;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextField usenamerloginTF;
    private javax.swing.JTextField usernamesignUpTF;
    private javax.swing.JComboBox yearCB;
    // End of variables declaration//GEN-END:variables
}