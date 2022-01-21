/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanagement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author boubadiop
 */
public class GestionProfesseur extends javax.swing.JFrame {

    /**
     * Creates new form GestionProfesseur
     */
    
    Statement stmt;
    ResultSet Rs;
    DefaultTableModel model = new DefaultTableModel();
    ConnectionDB myconnexion = new ConnectionDB();
    
    public GestionProfesseur() {
        initComponents();
        
        model.addColumn("ID");
        model.addColumn("Matricule");
        model.addColumn("Nom");
        model.addColumn("Prenom");
        model.addColumn("Date Naissance");
        model.addColumn("Lieu Naissance");
        model.addColumn("Adresse");
        model.addColumn("Telephone");
        model.addColumn("Email");
        model.addColumn("Nationalite");
        model.addColumn("Genre");
        model.addColumn("Specialite");
        
        try{
            stmt = myconnexion.obtenirCon().createStatement();
            ResultSet Rs = stmt.executeQuery("select * from professeur");
            while(Rs.next()){
            model.addRow(new Object[]{Rs.getString("id"),Rs.getString("matricule"),Rs.getString("nom"),Rs.getString("prenom"),Rs.getString("dateNaissance"),Rs.getString("lieuNaissance"),Rs.getString("adresse"),Rs.getString("tel"),Rs.getString("email"),Rs.getString("nationalite"),Rs.getString("genre"),Rs.getString("specialite")});
            }
        }catch(Exception e){
            System.out.println(e);
            
        }
        table.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelNom = new javax.swing.JLabel();
        labelPrenom = new javax.swing.JLabel();
        labelMatricule = new javax.swing.JLabel();
        labelDateNai = new javax.swing.JLabel();
        labelLieuNai = new javax.swing.JLabel();
        labelAdresse = new javax.swing.JLabel();
        labelTel = new javax.swing.JLabel();
        labelMail = new javax.swing.JLabel();
        labelNationalite = new javax.swing.JLabel();
        labelGenre = new javax.swing.JLabel();
        labelSpecialite = new javax.swing.JLabel();
        inputNom = new javax.swing.JTextField();
        inputPrenom = new javax.swing.JTextField();
        inputMatricule = new javax.swing.JTextField();
        inputDateNai = new javax.swing.JTextField();
        inputLieuNai = new javax.swing.JTextField();
        inputAdresse = new javax.swing.JTextField();
        inputTel = new javax.swing.JTextField();
        inputMail = new javax.swing.JTextField();
        inputNationalite = new javax.swing.JTextField();
        inputGenre = new javax.swing.JTextField();
        inputSpecialite = new javax.swing.JTextField();
        btnAjoutProfesseur = new javax.swing.JButton();
        btnModifProfesseur = new javax.swing.JButton();
        btnSuppProfesseur = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        inputSearchSpeci = new javax.swing.JTextField();
        labelSearchSpeci = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        labelID = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        btnActualiser = new javax.swing.JButton();
        btnQuitter = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(45, 81, 81));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Gestion Professeur");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 19, -1, -1));

        labelNom.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelNom.setText("Nom");
        jPanel3.add(labelNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 190, -1, -1));

        labelPrenom.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelPrenom.setText("Prenom");
        jPanel3.add(labelPrenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 254, -1, -1));

        labelMatricule.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelMatricule.setText("Matricule");
        jPanel3.add(labelMatricule, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 123, -1, -1));

        labelDateNai.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelDateNai.setText("Date Naissance");
        jPanel3.add(labelDateNai, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 310, -1, -1));

        labelLieuNai.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelLieuNai.setText("Lieu Naissance");
        jPanel3.add(labelLieuNai, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 370, -1, -1));

        labelAdresse.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelAdresse.setText("Adresse");
        jPanel3.add(labelAdresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 430, -1, -1));

        labelTel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelTel.setText("Téléphone ");
        jPanel3.add(labelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 490, -1, -1));

        labelMail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelMail.setText("Email");
        jPanel3.add(labelMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 550, -1, -1));

        labelNationalite.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelNationalite.setText("Nationalité");
        jPanel3.add(labelNationalite, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 610, -1, -1));

        labelGenre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelGenre.setText("Genre");
        jPanel3.add(labelGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 668, -1, -1));

        labelSpecialite.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelSpecialite.setText("Spécialité");
        jPanel3.add(labelSpecialite, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 726, -1, -1));
        jPanel3.add(inputNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 184, 308, 37));
        jPanel3.add(inputPrenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 250, 308, 33));
        jPanel3.add(inputMatricule, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 123, 308, 31));
        jPanel3.add(inputDateNai, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 310, 308, 32));
        jPanel3.add(inputLieuNai, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 370, 308, 32));
        jPanel3.add(inputAdresse, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 430, 308, 32));
        jPanel3.add(inputTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 490, 308, 32));
        jPanel3.add(inputMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 550, 308, 32));

        inputNationalite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNationaliteActionPerformed(evt);
            }
        });
        jPanel3.add(inputNationalite, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 610, 308, 32));
        jPanel3.add(inputGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 668, 308, 32));
        jPanel3.add(inputSpecialite, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 726, 308, 32));

        btnAjoutProfesseur.setBackground(new java.awt.Color(45, 81, 81));
        btnAjoutProfesseur.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAjoutProfesseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagement/images/icons8-ajouter-un-utilisateur-homme-50.png"))); // NOI18N
        btnAjoutProfesseur.setText("Ajouter");
        btnAjoutProfesseur.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAjoutProfesseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutProfesseurActionPerformed(evt);
            }
        });
        jPanel3.add(btnAjoutProfesseur, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, 200, 70));

        btnModifProfesseur.setBackground(new java.awt.Color(45, 81, 81));
        btnModifProfesseur.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModifProfesseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagement/images/icons8-modifier-utilisateur-50.png"))); // NOI18N
        btnModifProfesseur.setText("Modifier ");
        btnModifProfesseur.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModifProfesseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifProfesseurActionPerformed(evt);
            }
        });
        jPanel3.add(btnModifProfesseur, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 610, 200, 70));

        btnSuppProfesseur.setBackground(new java.awt.Color(45, 81, 81));
        btnSuppProfesseur.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSuppProfesseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagement/images/icons8-supprimer-50.png"))); // NOI18N
        btnSuppProfesseur.setText("Supprimer");
        btnSuppProfesseur.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSuppProfesseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuppProfesseurActionPerformed(evt);
            }
        });
        jPanel3.add(btnSuppProfesseur, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 610, 220, 70));

        table.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Matricule", "Nom", "Prenom", "Date Naissance", "Lieu  Naissance", "Adresse", "Telephone", "Email", "Nationalite", "Genre", "Specialite"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 310, 660, 260));
        jPanel3.add(inputSearchSpeci, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 230, 214, 39));

        labelSearchSpeci.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelSearchSpeci.setText("Donner la spécialité");
        jPanel3.add(labelSearchSpeci, new org.netbeans.lib.awtextra.AbsoluteConstraints(816, 230, 170, 40));

        btnSearch.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnSearch.setText("Rechercher");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel3.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 230, 162, 39));

        labelID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelID.setText("ID");
        jPanel3.add(labelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 72, -1, -1));
        jPanel3.add(inputID, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 66, 308, 37));

        btnActualiser.setBackground(new java.awt.Color(45, 81, 81));
        btnActualiser.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnActualiser.setText("Actualiser");
        btnActualiser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualiserActionPerformed(evt);
            }
        });
        jPanel3.add(btnActualiser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 150, 160, 50));

        btnQuitter.setBackground(new java.awt.Color(45, 81, 81));
        btnQuitter.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnQuitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/schoolmanagement/images/icons8-déconnexion-50.png"))); // NOI18N
        btnQuitter.setText("Quitter");
        btnQuitter.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitterActionPerformed(evt);
            }
        });
        jPanel3.add(btnQuitter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 710, 220, 70));

        jPanel1.setBackground(new java.awt.Color(144, 191, 188));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1610, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1610, 20));

        jPanel2.setBackground(new java.awt.Color(144, 191, 188));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 830, 1030, 30));

        jPanel4.setBackground(new java.awt.Color(144, 191, 188));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1610, 20, 20, 840));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1660, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void deplace(int i){
        try{
            inputID.setText(model.getValueAt(i,0).toString());
            inputMatricule.setText(model.getValueAt(i,1).toString());
            inputNom.setText(model.getValueAt(i,2).toString());
            inputPrenom.setText(model.getValueAt(i,3).toString());
            inputDateNai.setText(model.getValueAt(i,4).toString());
            inputLieuNai.setText(model.getValueAt(i,5).toString());
            inputAdresse.setText(model.getValueAt(i,6).toString());
            inputTel.setText(model.getValueAt(i,7).toString());
            inputMail.setText(model.getValueAt(i,8).toString());
            inputGenre.setText(model.getValueAt(i,9).toString());
            inputNationalite.setText(model.getValueAt(i,10).toString());
            inputSpecialite.setText(model.getValueAt(i,11).toString());

        }catch(Exception e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, "erreur de deplacement"+e.getMessage());
        }
    }
    private void inputNationaliteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNationaliteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNationaliteActionPerformed

    private void btnSuppProfesseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuppProfesseurActionPerformed
        // TODO add your handling code here:
        suppProfesseur();
        actualiser();
    }//GEN-LAST:event_btnSuppProfesseurActionPerformed

    private void btnAjoutProfesseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutProfesseurActionPerformed
        // TODO add your handling code here:
        ajoutProfesseur();
    }//GEN-LAST:event_btnAjoutProfesseurActionPerformed

    private void btnModifProfesseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifProfesseurActionPerformed
        // TODO add your handling code here:
        modifProfesseur();
    }//GEN-LAST:event_btnModifProfesseurActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        try{
          int i = table.getSelectedRow();
            deplace(i);  
        }catch(Exception e){
            
          JOptionPane.showMessageDialog(null, "erreur de deplacement"+e.getLocalizedMessage());
        }
    }//GEN-LAST:event_tableMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        try{
            model.setRowCount(0);//pour vider la liste des etudiants
            Rs =stmt.executeQuery("Select * From professeur WHERE specialite ='"+inputSearchSpeci.getText()+"' ");
            while(Rs.next()){
                Object [] professeur ={Rs.getInt(1),Rs.getString(2),Rs.getString(3),Rs.getString(4),Rs.getString(5),Rs.getString(6),
                Rs.getString(7),Rs.getString(8),Rs.getString(9),Rs.getString(10),Rs.getString(11),Rs.getString(12)};
                model.addRow(professeur);
            }
            if(model.getRowCount()==0){
                JOptionPane.showMessageDialog(null, "Il n'y a aucun professeur");
            }else{
                int i=0;
                deplace(i);
            }
        }catch(Exception e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualiserActionPerformed
        // TODO add your handling code here:
        actualiser();
        
    }//GEN-LAST:event_btnActualiserActionPerformed

    private void btnQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitterActionPerformed
        // TODO add your handling code here:
        dispose();
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
                
    }//GEN-LAST:event_btnQuitterActionPerformed

    
    private void ajoutProfesseur(){
        String labelID = inputID.getText();
        String labelMatricule = inputMatricule.getText();

        String labelNom = inputNom.getText();
        String labelPrenom = inputPrenom.getText();
        String labelDateNai = inputDateNai.getText();
        String labelLieuNai = inputLieuNai.getText();
        String labelAdresse = inputAdresse.getText();
        String labelTel = inputTel.getText();
        String labelMail = inputMail.getText();
        String labelNationalite = inputNationalite.getText();
        String labelGenre = inputGenre.getText();
        String labelSpecialite = inputSpecialite.getText();
        
       String reqAjoutEtudiant = "INSERT INTO professeur(id,matricule,nom,prenom,dateNaissance,lieuNaissance,adresse,tel,email,nationalite,genre,specialite ) VALUES('"+labelID+"','"+labelMatricule+"','"+labelNom+"','"+labelPrenom+"','"+labelDateNai+"','"+labelLieuNai+"','"+labelAdresse+"','"+labelTel+"','"+labelMail+"','"+labelNationalite+"','"+labelGenre+"','"+labelSpecialite+"')";  
       inputID.setText("");
       inputMatricule.setText("");
       inputNom.setText("");
       inputPrenom.setText("");
       inputDateNai.setText("");
       inputLieuNai.setText("");
       inputAdresse.setText("");
       inputTel.setText("");
       inputMail.setText("");
       inputNationalite.setText("");
       inputGenre.setText("");
       inputSpecialite.setText("");
       
       try{
           stmt = myconnexion.obtenirCon().createStatement();
           stmt.executeUpdate(reqAjoutEtudiant);
           JOptionPane.showMessageDialog(null,"Professeur ajouté avec succès");

       }catch(SQLException e){
           System.out.println(e);
       }

        
    }
    
    private void modifProfesseur(){
        try{
           if(JOptionPane.showConfirmDialog(null, "Confirmer la modification","modification",
                   JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION){
               stmt.executeUpdate("UPDATE professeur SET matricule='"+inputMatricule.getText()+"',nom='"+inputNom.getText()+"',prenom='"+inputPrenom.getText()+
                       "',dateNaissance='"+inputDateNai.getText()+"',lieuNaissance='"+inputLieuNai.getText()+
                       "',adresse='"+inputAdresse.getText()+"', tel='"+inputTel.getText()+"', email='"+inputMail.getText()+
                       "', nationalite='"+inputNationalite.getText()+"',genre='"+inputGenre.getText()+"', specialite='"+inputSpecialite.getText()+
                       "' WHERE id="+inputID.getText());
           }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Modificataion invalide"+e.getMessage());
           System.err.println(e);
       }
    }
    
    private void suppProfesseur(){
        try{
           if(JOptionPane.showConfirmDialog(null, "Êtes-vous sure de vouloir supprimer cet professeur?","supprimer professeur",
                   JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION)
               
           if(inputID.getText().length() != 0){
               stmt.executeUpdate("Delete From professeur where id = "+inputID.getText());
           }else{
               JOptionPane.showMessageDialog(null, "Veuillez remplir le champ ID");
           }
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Erreur de supression"+e.getMessage());
           System.err.println(e);
       }
    }
    
    private void actualiser(){
        try{
            model.setRowCount(0);
            stmt = myconnexion.obtenirCon().createStatement();
            ResultSet Rs = stmt.executeQuery("select * from professeur");
            while(Rs.next()){
            model.addRow(new Object[]{Rs.getString("id"),Rs.getString("matricule"),Rs.getString("nom"),Rs.getString("prenom"),Rs.getString("dateNaissance"),Rs.getString("lieuNaissance"),Rs.getString("adresse"),Rs.getString("tel"),Rs.getString("email"),Rs.getString("nationalite"),Rs.getString("genre"),Rs.getString("specialite")});
            inputID.setText("");
            inputMatricule.setText("");
            inputNom.setText("");
            inputPrenom.setText("");
            inputDateNai.setText("");
            inputLieuNai.setText("");
            inputAdresse.setText("");
            inputTel.setText("");
            inputMail.setText("");
            inputNationalite.setText("");
            inputGenre.setText("");
            inputSpecialite.setText("");
            

            }
        }catch(Exception e){
            System.out.println(e);
            
        }
        table.setModel(model);
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
            java.util.logging.Logger.getLogger(GestionProfesseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionProfesseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionProfesseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionProfesseur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionProfesseur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualiser;
    private javax.swing.JButton btnAjoutProfesseur;
    private javax.swing.JButton btnModifProfesseur;
    private javax.swing.JButton btnQuitter;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSuppProfesseur;
    private javax.swing.JTextField inputAdresse;
    private javax.swing.JTextField inputDateNai;
    private javax.swing.JTextField inputGenre;
    private javax.swing.JTextField inputID;
    private javax.swing.JTextField inputLieuNai;
    private javax.swing.JTextField inputMail;
    private javax.swing.JTextField inputMatricule;
    private javax.swing.JTextField inputNationalite;
    private javax.swing.JTextField inputNom;
    private javax.swing.JTextField inputPrenom;
    private javax.swing.JTextField inputSearchSpeci;
    private javax.swing.JTextField inputSpecialite;
    private javax.swing.JTextField inputTel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelAdresse;
    private javax.swing.JLabel labelDateNai;
    private javax.swing.JLabel labelGenre;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelLieuNai;
    private javax.swing.JLabel labelMail;
    private javax.swing.JLabel labelMatricule;
    private javax.swing.JLabel labelNationalite;
    private javax.swing.JLabel labelNom;
    private javax.swing.JLabel labelPrenom;
    private javax.swing.JLabel labelSearchSpeci;
    private javax.swing.JLabel labelSpecialite;
    private javax.swing.JLabel labelTel;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
