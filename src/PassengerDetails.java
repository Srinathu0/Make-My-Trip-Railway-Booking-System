
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Srinath.U
 */
public class PassengerDetails extends javax.swing.JFrame {

    /**
     * Creates new form PassengerDetails
     */
    public PassengerDetails() {
        initComponents();
      /*  int n = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of text fields to generate"));

JPanel panel = new JPanel();
panel.setLayout(new GridLayout(n, 1));

for (int i = 1; i <= n; i++) {
    JTextField textField = new JTextField();
    panel.add(textField);
}

JOptionPane.showMessageDialog(null, panel, "Dynamic Text Fields", JOptionPane.PLAIN_MESSAGE);*/
      // get input from user for number of rows and columns
/*int numRows = Integer.parseInt(JOptionPane.showInputDialog("Enter number of rows:"));
int numCols = Integer.parseInt(JOptionPane.showInputDialog("Enter number of columns:"));

// create a new JPanel
JPanel jPanel1 = new JPanel(new GridLayout(numRows, numCols));

// create an array of JTextFields*/
/*int numRows=2;
int numCols=4;

//JPanel jPanel1 = new JPanel( new GridLayout(numRows, numCols));
jPanel1.setLayout(new GridLayout(numRows, numCols));
JTextField[][] textFields = new JTextField[numRows][numCols];


// create and add JTextFields to the panel

for (int i = 0; i < numRows; i++) {
    for (int j = 0; j < numCols; j++) {
        textFields[i][j] = new JTextField();
        jPanel1.add(textFields[i][j]);
       // textField.setPreferredSize(new Dimension(150, 30));
        //jPanel1.setVisible(true);
    //}
}
  

    }*/
    }
    Double Food;
    String From,To,Date,NoofPass;
    public PassengerDetails(String Fr,String to,String date,String No)
    {
        initComponents();
        From=Fr;
        To=to;
        Date=date;
        NoofPass=No;
        System.out.println(""+From);
        System.out.println(""+To);
        System.out.println(""+Date);
        System.out.println(""+NoofPass);
        int numRows=Integer.parseInt(No);
        int numCols=3;
        fromtxt.setText(From);
        totxt.setText(To);
        
        //JPanel jPanel1 = new JPanel( new GridLayout(numRows, numCols));
        /*jPanel1.setLayout(new GridLayout(numRows, numCols));
        JTextField[][] textFields = new JTextField[numRows][numCols];


        // create and add JTextFields to the panel

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                textFields[i][j] = new JTextField();
                jPanel1.add(textFields[i][j]);
            }
        }*/
        if(From=="Bangalore" && To=="Vellore" ||From=="Bangalore" && To=="Katpadi" )
        {
            disp.setText("Lalbagh Express");
        }
        else if(From=="Vellore" && To=="Bangalore" ||From=="Katpadi" && To=="Bangalore" )
        {
            disp.setText("Lalbagh Express");
        }
        else if(From=="Bangalore" && To=="Chennai")
        {
            disp.setText("Lalbagh Express");
        }
        else if(From=="Chennai" && To=="Bangalore")
        {
            disp.setText("Lalbagh Express");
        }
        else if(From=="Chennai" && To=="Vellore" ||From=="Chennai" && To=="Katpadi" )
        {
            disp.setText("Lalbagh Express");
        }
        else if(From=="Chennai" && To=="Mysore"||From=="Mysore" && To=="Chennai")
        {
            disp.setText("Vande Bharat Express");
        }
        else if(From=="New Delhi" && To=="Katpadi"||From=="Katpadi" && To=="New Delhi")
        {
            disp.setText("Kerala Express");
        }
        else if(From=="New Delhi" && To=="Chennai"||From=="Chennai" && To=="New Delhi")
        {
            disp.setText("Tamil Nadu Express");
        }
        else if(From=="New Delhi" && To=="Coimbatore"||From=="Comibatore" && To=="New Delhi")
        {
            disp.setText("Kerala Express");
        }
        else if(From=="New Delhi" && To=="Bangalore"||From=="Bangalore" && To=="New Delhi" || From=="New Delhi" && To=="Kolar"||From=="Kolar" && To=="New Delhi")
        {
            disp.setText("Rajdhani Express");
        }
        else if(From=="New Delhi" && To=="Vellore"||From=="Vellore" && To=="New Delhi")
        {
            disp.setText("Tamil Nadu Express");
        }
        else if(From=="New Delhi" && To=="Madurai"||From=="Madurai" && To=="New Delhi" ||From=="New Delhi" && To=="Palani" || From=="Palani" && To=="New Delhi" )
        {
            disp.setText("Cdg Mdu Sf Express");
        }
        if(NoofPass=="1")
        {
           name2.setVisible(false);
           name3.setVisible(false);
           name4.setVisible(false);
           age2.setVisible(false);
           age3.setVisible(false);
           age4.setVisible(false);
           cb2.setVisible(false);
           cb3.setVisible(false);
           cb4.setVisible(false);
        }
        else if(NoofPass=="2")
        {
           name3.setVisible(false);
           name4.setVisible(false);
           age3.setVisible(false);
           age4.setVisible(false);
           cb3.setVisible(false);
           cb4.setVisible(false);
        }
        else if(NoofPass=="3")
        {
           name4.setVisible(false);
           age4.setVisible(false);
           cb4.setVisible(false);
        }
        else
        {
           name1.setVisible(true);
           name2.setVisible(true);
           name3.setVisible(true);
           name4.setVisible(true);
           age2.setVisible(true);
           age3.setVisible(true);
           age4.setVisible(true); 
           cb1.setVisible(true);
           cb2.setVisible(true);
           cb3.setVisible(true);
           cb4.setVisible(true);           
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        name1 = new javax.swing.JTextField();
        age1 = new javax.swing.JTextField();
        cb2 = new javax.swing.JComboBox<>();
        disp2 = new javax.swing.JLabel();
        disp1 = new javax.swing.JLabel();
        name2 = new javax.swing.JTextField();
        age2 = new javax.swing.JTextField();
        cb3 = new javax.swing.JComboBox<>();
        name3 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox<>();
        name4 = new javax.swing.JTextField();
        age4 = new javax.swing.JTextField();
        age3 = new javax.swing.JTextField();
        cb4 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        totxt = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        fromtxt = new javax.swing.JLabel();
        disp = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cb = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        name1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        name1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                name1KeyPressed(evt);
            }
        });

        age1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        age1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                age1KeyPressed(evt);
            }
        });

        cb2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        disp2.setForeground(new java.awt.Color(255, 0, 0));

        disp1.setForeground(new java.awt.Color(255, 0, 0));

        name2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        name2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                name2KeyPressed(evt);
            }
        });

        age2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        age2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                age2KeyPressed(evt);
            }
        });

        cb3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        name3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        name3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                name3KeyPressed(evt);
            }
        });

        cb1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        name4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        name4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                name4KeyPressed(evt);
            }
        });

        age4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        age4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                age4KeyPressed(evt);
            }
        });

        age3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        age3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                age3KeyPressed(evt);
            }
        });

        cb4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(disp1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(disp2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(age2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(age3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(age4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(age1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(176, 176, 176)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(179, 179, 179))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(disp1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disp2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(age4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 316, 980, 299));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mmtlogo.jpg"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 97, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("Age");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("Gender");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setText("From");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 74, 54, 40));

        totxt.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jPanel2.add(totxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 224, 44));

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setText("To");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 47, 43));

        fromtxt.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jPanel2.add(fromtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 139, 224, 44));

        disp.setBackground(new java.awt.Color(255, 255, 255));
        disp.setFont(new java.awt.Font("Calibri", 1, 25)); // NOI18N
        disp.setForeground(new java.awt.Color(51, 204, 255));
        jPanel2.add(disp, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 217, 732, 41));

        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 255));
        jButton1.setText("Make Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 80, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/from.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 74, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/to.png"))); // NOI18N
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/food.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, -1, -1));

        cb.setText("Catering Yes/No?");
        cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbActionPerformed(evt);
            }
        });
        jPanel2.add(cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 150, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/direct.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/train2.png"))); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 1160, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setText("Add");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Travellers");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("&");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Preferences");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 316, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel1FocusGained

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!cb.isSelected() )
        {
            Food=0.0;
        }
            Payments pm=new Payments(NoofPass,From,To,Food);
            pm.show();
            dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbActionPerformed
        // TODO add your handling code here:
        if(!cb.isSelected())
        {
           Food=0.00;
        }
        else
        {
             if(NoofPass=="1")
            {
                Food=100.00;
            }
            else if(NoofPass=="2")
            {
                Food=200.00;
            }
            else if(NoofPass=="3")
            {
                Food=300.00;
            }
            else if(NoofPass=="4")
            {
                Food=400.00;
            }
        }
    }//GEN-LAST:event_cbActionPerformed

    private void age1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_age1KeyPressed
        // TODO add your handling code here:
        String cardno=age1.getText();
        int length = cardno.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(length<2)
            {
                age1.setEditable(true);
                disp2.setText("Enter valid Card Number");
            }
            else
            {
                age1.setEditable(false);
                disp2.setText("");
            }
        }
        else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                age1.setEditable(true);
            }
            else
            {
                age1.setEditable(false);
            }
        }
    }//GEN-LAST:event_age1KeyPressed

    private void age2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_age2KeyPressed
        // TODO add your handling code here:
       String cardno=age2.getText();
        int length = cardno.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(length<2)
            {
                age2.setEditable(true);
                disp2.setText("Enter valid Card Number");
            }
            else
            {
                age2.setEditable(false);
                disp2.setText("");
            }
        }
        else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                age2.setEditable(true);
            }
            else
            {
                age2.setEditable(false);
            }
        }
    }//GEN-LAST:event_age2KeyPressed

    private void age3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_age3KeyPressed
        // TODO add your handling code here:
        String cardno=age3.getText();
        int length = cardno.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(length<2)
            {
                age3.setEditable(true);
                disp2.setText("Enter valid Card Number");
            }
            else
            {
                age3.setEditable(false);
                disp2.setText("");
            }
        }
        else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                age3.setEditable(true);
            }
            else
            {
                age3.setEditable(false);
            }
        }
    }//GEN-LAST:event_age3KeyPressed

    private void name1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name1KeyPressed
        // TODO add your handling code here:
        String ALPHA_PATTERN = "^[a-zA-Z]*$";
        String input = name1.getText();

        Pattern pattern = Pattern.compile(ALPHA_PATTERN);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            disp1.setText("");
        } else {
            disp1.setText("Input contains non-alphabetic characters*");
        }
    }//GEN-LAST:event_name1KeyPressed

    private void name2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name2KeyPressed
        // TODO add your handling code here:
        String ALPHA_PATTERN = "^[a-zA-Z]*$";
        String input = name2.getText();

        Pattern pattern = Pattern.compile(ALPHA_PATTERN);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            disp1.setText("");
        } else {
            disp1.setText("Input contains non-alphabetic characters*");
        }
    }//GEN-LAST:event_name2KeyPressed

    private void name3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name3KeyPressed
        // TODO add your handling code here:
        String ALPHA_PATTERN = "^[a-zA-Z]*$";
        String input = name3.getText();

        Pattern pattern = Pattern.compile(ALPHA_PATTERN);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            disp1.setText("");
        } else {
            disp1.setText("Input contains non-alphabetic characters*");
        }
    }//GEN-LAST:event_name3KeyPressed

    private void name4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name4KeyPressed
        // TODO add your handling code here:
        String ALPHA_PATTERN = "^[a-zA-Z] *$";
        String input = name4.getText();

        Pattern pattern = Pattern.compile(ALPHA_PATTERN);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            disp1.setText("");
        } else {
            disp1.setText("Input contains non-alphabetic characters*");
        }
    }//GEN-LAST:event_name4KeyPressed

    private void age4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_age4KeyPressed
        // TODO add your handling code here:
        String cardno=age4.getText();
        int length = cardno.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(length<2)
            {
                age4.setEditable(true);
                disp2.setText("Enter valid Card Number");
            }
            else
            {
                age4.setEditable(false);
                disp2.setText("");
            }
        }
        else
        {
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)
            {
                age4.setEditable(true);
            }
            else
            {
                age4.setEditable(false);
            }
        }
    }//GEN-LAST:event_age4KeyPressed

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
            java.util.logging.Logger.getLogger(PassengerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PassengerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PassengerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PassengerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassengerDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age1;
    private javax.swing.JTextField age2;
    private javax.swing.JTextField age3;
    private javax.swing.JTextField age4;
    private javax.swing.JCheckBox cb;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JComboBox<String> cb4;
    private javax.swing.JLabel disp;
    private javax.swing.JLabel disp1;
    private javax.swing.JLabel disp2;
    private javax.swing.JLabel fromtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name1;
    private javax.swing.JTextField name2;
    private javax.swing.JTextField name3;
    private javax.swing.JTextField name4;
    private javax.swing.JLabel totxt;
    // End of variables declaration//GEN-END:variables
}
