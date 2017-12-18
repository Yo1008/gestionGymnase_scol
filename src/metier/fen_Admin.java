/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author C103-image
 */
public class fen_Admin extends javax.swing.JFrame {

    /**
     * Creates new form fen_Admin test
     */
    
    public fen_Admin() {
        initComponents();
        afficherTableAssociation();
        afficherTableAccueillir();   
        recupererSalles();
    }   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbed_pane_admin = new javax.swing.JTabbedPane();
        jTabAssos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Association = new javax.swing.JTable();
        buttonAjoutAsso = new javax.swing.JButton();
        jButtonModifierAsso = new javax.swing.JButton();
        jTabAccueilSalles = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        table_gererAccueillir = new javax.swing.JTable();
        jLabelEditer2 = new javax.swing.JLabel();
        jComboBoxRefSalle = new javax.swing.JComboBox<>();
        jComboBoxSport = new javax.swing.JComboBox<>();
        JbuttonCreerSportSalle = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNomSport = new javax.swing.JTextField();
        jButtonAjoutSport = new javax.swing.JButton();
        jTabOccupation = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_Reservation = new javax.swing.JTable();
        lbl_date = new javax.swing.JLabel();
        dateChooserOccupation = new datechooser.beans.DateChooserPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabbed_pane_admin.setName("tabbedPaneAdmin"); // NOI18N

        jTabAssos.setToolTipText("");
        jTabAssos.setName("tabAsso"); // NOI18N

        table_Association.setModel(new ModeletableAssociation());
        jScrollPane1.setViewportView(table_Association);

        buttonAjoutAsso.setText("Ajouter une association");
        buttonAjoutAsso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAjoutAssoMouseClicked(evt);
            }
        });

        jButtonModifierAsso.setText("Modifier une association");
        jButtonModifierAsso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonModifierAssoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jTabAssosLayout = new javax.swing.GroupLayout(jTabAssos);
        jTabAssos.setLayout(jTabAssosLayout);
        jTabAssosLayout.setHorizontalGroup(
            jTabAssosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTabAssosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTabAssosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1118, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTabAssosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonModifierAsso)
                        .addGap(26, 26, 26)
                        .addComponent(buttonAjoutAsso)))
                .addContainerGap())
        );
        jTabAssosLayout.setVerticalGroup(
            jTabAssosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTabAssosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 272, Short.MAX_VALUE)
                .addGroup(jTabAssosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAjoutAsso)
                    .addComponent(jButtonModifierAsso))
                .addContainerGap())
        );

        tabbed_pane_admin.addTab("Gérer les associations", jTabAssos);

        table_gererAccueillir.setModel(new ModeleTableAccueillir());
        jScrollPane7.setViewportView(table_gererAccueillir);

        jLabelEditer2.setText("Creez ici une nouvelle association sport / salle");

        jComboBoxRefSalle.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxRefSalleItemStateChanged(evt);
            }
        });

        jComboBoxSport.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxSportItemStateChanged(evt);
            }
        });
        jComboBoxSport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSportActionPerformed(evt);
            }
        });

        JbuttonCreerSportSalle.setText("Ajouter");
        JbuttonCreerSportSalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JbuttonCreerSportSalleMouseClicked(evt);
            }
        });

        jLabel5.setText("Ajouter une pratique sportive");

        jLabel6.setText("Nom du sport :");

        jTextFieldNomSport.setText("nom du sport");
        jTextFieldNomSport.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNomSportFocusGained(evt);
            }
        });

        jButtonAjoutSport.setText("Ajouter");
        jButtonAjoutSport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAjoutSportMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jTabAccueilSallesLayout = new javax.swing.GroupLayout(jTabAccueilSalles);
        jTabAccueilSalles.setLayout(jTabAccueilSallesLayout);
        jTabAccueilSallesLayout.setHorizontalGroup(
            jTabAccueilSallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTabAccueilSallesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jTabAccueilSallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEditer2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jTabAccueilSallesLayout.createSequentialGroup()
                        .addComponent(jComboBoxRefSalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jComboBoxSport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(JbuttonCreerSportSalle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addGroup(jTabAccueilSallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jTabAccueilSallesLayout.createSequentialGroup()
                        .addGroup(jTabAccueilSallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jTabAccueilSallesLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(39, 39, 39)
                                .addComponent(jTextFieldNomSport, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTabAccueilSallesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAjoutSport)))
                .addGap(161, 161, 161))
            .addGroup(jTabAccueilSallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTabAccueilSallesLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jTabAccueilSallesLayout.setVerticalGroup(
            jTabAccueilSallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTabAccueilSallesLayout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addGroup(jTabAccueilSallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTabAccueilSallesLayout.createSequentialGroup()
                        .addComponent(jLabelEditer2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addGroup(jTabAccueilSallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JbuttonCreerSportSalle)
                            .addComponent(jComboBoxSport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxRefSalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTabAccueilSallesLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addGroup(jTabAccueilSallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNomSport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(49, 49, 49)
                        .addComponent(jButtonAjoutSport)
                        .addGap(106, 106, 106))))
            .addGroup(jTabAccueilSallesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTabAccueilSallesLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(269, Short.MAX_VALUE)))
        );

        tabbed_pane_admin.addTab("Accueil Salles", jTabAccueilSalles);

        table_Reservation.setModel(new ModeleTableReservation());
        jScrollPane3.setViewportView(table_Reservation);

        lbl_date.setText("selectionner la date pour lequel vous souhaité afficher les réservations :");

        dateChooserOccupation.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                dateChooserOccupationOnSelectionChange(evt);
            }
        });

        javax.swing.GroupLayout jTabOccupationLayout = new javax.swing.GroupLayout(jTabOccupation);
        jTabOccupation.setLayout(jTabOccupationLayout);
        jTabOccupationLayout.setHorizontalGroup(
            jTabOccupationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTabOccupationLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(jTabOccupationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooserOccupation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_date, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
                .addGap(464, 464, 464))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jTabOccupationLayout.setVerticalGroup(
            jTabOccupationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTabOccupationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_date, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateChooserOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabbed_pane_admin.addTab("Occupation", jTabOccupation);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tabbed_pane_admin)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbed_pane_admin))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateChooserOccupationOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_dateChooserOccupationOnSelectionChange
        // TODO add your handling code here:
       ModeleTableReservation model = new ModeleTableReservation();
       table_Reservation.setModel(model);
       model.removeRow(0);
        
                
        Date date = dateChooserOccupation.getSelectedDate().getTime();
        SimpleDateFormat  simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleFormat.format(date));
        afficherOccupationSalle(simpleFormat.format(date));
        
    }//GEN-LAST:event_dateChooserOccupationOnSelectionChange

    private void jButtonModifierAssoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonModifierAssoMouseClicked
        // TODO add your handling code here:
        fen_modifierAssociation fenetre = new fen_modifierAssociation();
        fenetre.setVisible(true);
    }//GEN-LAST:event_jButtonModifierAssoMouseClicked

    private void buttonAjoutAssoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAjoutAssoMouseClicked
        // TODO add your handling code here:
        fen_AjoutAssociation fenetre = new fen_AjoutAssociation();
        fenetre.setVisible(true);
    }//GEN-LAST:event_buttonAjoutAssoMouseClicked

    private void jComboBoxRefSalleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxRefSalleItemStateChanged
        // TODO add your handling code here:
        jComboBoxSport.removeAllItems();
        recupererSports(String.valueOf(jComboBoxRefSalle.getSelectedItem()));
                
    }//GEN-LAST:event_jComboBoxRefSalleItemStateChanged

    private void jComboBoxSportItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxSportItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSportItemStateChanged

    private void jComboBoxSportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSportActionPerformed

    private void JbuttonCreerSportSalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JbuttonCreerSportSalleMouseClicked
        // TODO add your handling code here:
        String salleSelectionnee = jComboBoxRefSalle.getSelectedItem().toString();
        String sportSelectionne = jComboBoxSport.getSelectedItem().toString();
        if (ajouterSportSalle(salleSelectionnee, sportSelectionne))
        {
            JOptionPane.showMessageDialog(null, "Ajout effectué", " Info", JOptionPane.INFORMATION_MESSAGE);
        }
        ajouterSportSalle(salleSelectionnee, sportSelectionne);
        afficherTableAccueillir();
    }//GEN-LAST:event_JbuttonCreerSportSalleMouseClicked

    private void jTextFieldNomSportFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNomSportFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomSportFocusGained

    private void jButtonAjoutSportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAjoutSportMouseClicked
        // TODO add your handling code here:
        String sport = jTextFieldNomSport.getText();
        if (!verifierSport(sport))
        {
            JOptionPane.showMessageDialog(null, "Ajout impossible", "Info", JOptionPane.ERROR_MESSAGE);
            
            
        }
        else {
              ajouterSport(sport);
                JOptionPane.showMessageDialog(null, "Ajout effectué", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
          
    }//GEN-LAST:event_jButtonAjoutSportMouseClicked
                                            
  
                                                 
                                                     
    private void btn_fermerActionPerformed(java.awt.event.ActionEvent evt) {                                           
       this.dispose();
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fen_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fen_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fen_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fen_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fen_Admin().setVisible(true);
                
            }
        });        
      
    } 
   
    public Boolean verifierSport(String sport)
    {
        Boolean retour = true;
         Connection conn;
                        Statement stmt;
                        ResultSet rs;
                        String pilote="org.gjt.mm.mysql.Driver";
                        String url = "jdbc:mysql://localhost/gestiongymnase";                        
                        try
                        {
                            Class.forName(pilote);
                            conn = DriverManager.getConnection(url,"root","");
                            stmt = conn.createStatement();
                            rs = stmt.executeQuery("select * from sport where nomSport ='"+sport+"'");
                            while (rs.next())
                            {                         
                                retour = false;
                               
                            }
                            rs.close();
                            stmt.close();
                            conn.close();
                        }
                        catch (SQLException E)
                        {
                            System.out.println("SQLException" + E.getMessage());
                            System.out.println("SQLState" + E.getSQLState());
                            System.out.println("VendorError" + E.getErrorCode());
                        }
                        catch (ClassNotFoundException E)
                        {
                            E.printStackTrace();
                        } 
                        return retour;
    }
    public Boolean ajouterSport(String sport)
    {
         Connection conn;
                        Statement stmt;
                        ResultSet rs;
                        String pilote="org.gjt.mm.mysql.Driver";
                        String url = "jdbc:mysql://localhost/gestiongymnase";
                        
                        try
                        {
                            Class.forName(pilote);
                            conn = DriverManager.getConnection(url,"root","");
                            stmt = conn.createStatement();
                            stmt.executeUpdate("INSERT INTO sport (nomSport) VALUES ('"+sport+"')");
                           
                            stmt.close();
                            conn.close();
                            
                        }
                        catch (SQLException E)
                        {
                            System.out.println("SQLException" + E.getMessage());
                            System.out.println("SQLState" + E.getSQLState());
                            System.out.println("VendorError" + E.getErrorCode());
                        }
                        catch (ClassNotFoundException E)
                        {
                            E.printStackTrace();
                        }
        return true;
    }
    public void recupererSalles()
    {
        
         Connection conn;
                        Statement stmt;
                        ResultSet rs;
                        String pilote="org.gjt.mm.mysql.Driver";
                        String url = "jdbc:mysql://localhost/gestiongymnase";
                        
                        try
                        {
                            Class.forName(pilote);
                            conn = DriverManager.getConnection(url,"root","");
                            stmt = conn.createStatement();
                            rs = stmt.executeQuery("select  * from salle");
                            while (rs.next())
                            {                             
                                
                                jComboBoxRefSalle.addItem(rs.getString("refSalle"));
                               
                            }
                            rs.close();
                            stmt.close();
                            conn.close();
                        }
                        catch (SQLException E)
                        {
                            System.out.println("SQLException" + E.getMessage());
                            System.out.println("SQLState" + E.getSQLState());
                            System.out.println("VendorError" + E.getErrorCode());
                        }
                        catch (ClassNotFoundException E)
                        {
                            E.printStackTrace();
                        }
        
    }
    public void recupererSports(String salleSelectionnee)
    {
     
         Connection conn;
                        Statement stmt;
                        ResultSet rs;
                        String pilote="org.gjt.mm.mysql.Driver";
                        String url = "jdbc:mysql://localhost/gestiongymnase";
                        
                        try
                        {
                            Class.forName(pilote);
                            conn = DriverManager.getConnection(url,"root","");
                            stmt = conn.createStatement();
                            rs = stmt.executeQuery("SELECT * FROM sport WHERE nomSport NOT IN (SELECT nomSportAutorise from accueillir where refSalle ='"+ salleSelectionnee+ "')");
                            
                            while (rs.next())
                            {                             
                               
                                jComboBoxSport.addItem(rs.getString("nomSport"));
                               
                            }
                            rs.close();
                            stmt.close();
                            conn.close();
                        }
                        catch (SQLException E)
                        {
                            System.out.println("SQLException" + E.getMessage());
                            System.out.println("SQLState" + E.getSQLState());
                            System.out.println("VendorError" + E.getErrorCode());
                        }
                        catch (ClassNotFoundException E)
                        {
                        }
        
    }
    public Boolean ajouterSportSalle(String salleSelectionnee, String sportSelectionne )
    {
       
                        Connection conn;
                        Statement stmt;
                        ResultSet rs;
                        String pilote="org.gjt.mm.mysql.Driver";
                        String url = "jdbc:mysql://localhost/gestiongymnase";
                        
                        try
                        {
                            Class.forName(pilote);
                            conn = DriverManager.getConnection(url,"root","");
                            stmt = conn.createStatement();
                            stmt.executeUpdate("INSERT INTO accueillir (refSalle, nomSportAutorise) VALUES ('"+salleSelectionnee+"','"+sportSelectionne+"')");
                           
                            stmt.close();
                            conn.close();
                            
                        }
                        catch (SQLException E)
                        {
                            System.out.println("SQLException" + E.getMessage());
                            System.out.println("SQLState" + E.getSQLState());
                            System.out.println("VendorError" + E.getErrorCode());
                        }
                        catch (ClassNotFoundException E)
                        {
                            E.printStackTrace();
                        }
                        return true;
                        
    }
    public void afficherOccupationSalle(String DateReservation)
    {
           int rowCount = table_Reservation.getRowCount();
       for (int i = rowCount - 1; i >= 0; i--)
       {
          // table_Reservation.removeRow(i);
           
          // ((DefaultTableModel)table_Reservation.getModel()).removeRow(i);	
       } 
                        Connection conn;
                        Statement stmt;
                        ResultSet rs;
                        String pilote="org.gjt.mm.mysql.Driver";
                        String url = "jdbc:mysql://localhost/gestiongymnase";
                        
                        try
                        {
                            Class.forName(pilote);
                            conn = DriverManager.getConnection(url,"root","");
                            stmt = conn.createStatement();
                            rs = stmt.executeQuery("select * from reservation, creneau where date = '"+ DateReservation +"'AND  reservation.creneau = creneau.noCreneau ");
                            int i = 0;
                            while (rs.next())
                            {
                                //table_Reservation.removeRow(0);
                                        
                              String creneau;
                              
                              creneau = rs.getString("heure_debut")+"-"+rs.getString("heure_fin");
                              String pCreneau = creneau.replaceAll(":00:00", "h ");
                                table_Reservation.setValueAt(rs.getString("refSalle"),i,0);
                                table_Reservation.setValueAt(rs.getString("date"),i,1);
                                table_Reservation.setValueAt(pCreneau,i,2);
                                table_Reservation.setValueAt(rs.getString("refAsso"),i,3);
                                i++;
                               
                            }
                            rs.close();
                            stmt.close();
                            conn.close();
                        }
                        catch (SQLException E)
                        {
                            System.out.println("SQLException" + E.getMessage());
                            System.out.println("SQLState" + E.getSQLState());
                            System.out.println("VendorError" + E.getErrorCode());
                        }
                        catch (ClassNotFoundException E)
                        {
                            E.printStackTrace();
                        }
    }
     private void afficherTableAccueillir()
    {
                        Connection conn;
                        Statement stmt;
                        ResultSet rs;
                        String pilote="org.gjt.mm.mysql.Driver";
                        String url = "jdbc:mysql://localhost/gestiongymnase";
                        
                        try
                        {
                            Class.forName(pilote);
                            conn = DriverManager.getConnection(url,"root","");
                            stmt = conn.createStatement();
                            rs = stmt.executeQuery("select * from accueillir");
                            int i = 0;
                            while (rs.next())
                            {
                              
                                table_gererAccueillir.setValueAt(rs.getString("refSalle"),i,0);
                                table_gererAccueillir.setValueAt(rs.getString("nomSportAutorise"),i,1);
                                i++;
                               
                            }
                            rs.close();
                            stmt.close();
                            conn.close();
                        }
                        catch (SQLException E)
                        {
                            System.out.println("SQLException" + E.getMessage());
                            System.out.println("SQLState" + E.getSQLState());
                            System.out.println("VendorError" + E.getErrorCode());
                        }
                        catch (ClassNotFoundException E)
                        {
                            E.printStackTrace();
                        }
            }   
   private void afficherTableAssociation()
    {
                        Connection conn;
                        Statement stmt;
                        ResultSet rs;
                        String pilote="org.gjt.mm.mysql.Driver";
                        String url = "jdbc:mysql://localhost/gestiongymnase";
                        
                        try
                        {
                            Class.forName(pilote);
                            conn = DriverManager.getConnection(url,"root","");
                            stmt = conn.createStatement();
                            rs = stmt.executeQuery("select * from association");
                            int i = 0;
                            while (rs.next())
                            {
                              
                                table_Association.setValueAt(rs.getString("refAsso"),i,0);
                                table_Association.setValueAt(rs.getString("ville"),i,1);
                                table_Association.setValueAt(rs.getString("adresse"),i,2);
                                table_Association.setValueAt(rs.getString("nomResponsable"),i,3);
                                i++;
                               
                            }
                            rs.close();
                            stmt.close();
                            conn.close();
                        }
                        catch (SQLException E)
                        {
                            System.out.println("SQLException" + E.getMessage());
                            System.out.println("SQLState" + E.getSQLState());
                            System.out.println("VendorError" + E.getErrorCode());
                        }
                        catch (ClassNotFoundException E)
                        {
                            E.printStackTrace();
                        }
            }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbuttonCreerSportSalle;
    private javax.swing.JButton buttonAjoutAsso;
    private datechooser.beans.DateChooserPanel dateChooserOccupation;
    private javax.swing.JButton jButtonAjoutSport;
    private javax.swing.JButton jButtonModifierAsso;
    private javax.swing.JComboBox<String> jComboBoxRefSalle;
    private javax.swing.JComboBox<String> jComboBoxSport;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelEditer2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel jTabAccueilSalles;
    private javax.swing.JPanel jTabAssos;
    private javax.swing.JPanel jTabOccupation;
    private javax.swing.JTextField jTextFieldNomSport;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JTabbedPane tabbed_pane_admin;
    private javax.swing.JTable table_Association;
    private javax.swing.JTable table_Reservation;
    private javax.swing.JTable table_gererAccueillir;
    // End of variables declaration//GEN-END:variables
}
