/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singin.interfaceEleve;

/**
 *
 * @author Othmane
 */
public class DetailProjetPanel extends javax.swing.JPanel {

  private GUIeleve jFrame;
    
  
    /**
     * Creates new form DetailProjetPanel
     */
    public DetailProjetPanel() {
        initComponents();
		
		
		
    }

  public void setjFrame(GUIeleve jFrame) {
	this.jFrame = jFrame;
  }

	
	
	
	
	
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jSeparator3 = new javax.swing.JSeparator();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTextArea2 = new javax.swing.JTextArea();
    jLabel10 = new javax.swing.JLabel();
    jButton10 = new javax.swing.JButton();
    jButton11 = new javax.swing.JButton();
    jButton12 = new javax.swing.JButton();
    jButton13 = new javax.swing.JButton();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jButton14 = new javax.swing.JButton();
    jScrollPane3 = new javax.swing.JScrollPane();
    jTextArea1 = new javax.swing.JTextArea();
    jLabel1 = new javax.swing.JLabel();
    jSeparator1 = new javax.swing.JSeparator();
    jScrollPane1 = new javax.swing.JScrollPane();
    enregistrementsLabel = new javax.swing.JList();
    enregistrementLabel = new javax.swing.JLabel();
    detailButton = new javax.swing.JButton();
    rafraichirButton = new javax.swing.JButton();
    playButton = new javax.swing.JButton();
    stopButton = new javax.swing.JButton();
    recButton = new javax.swing.JButton();
    monEnregistrementButton = new javax.swing.JButton();
    monRecPanel1 = new singin.interfaceEleve.MonRecPanel();
    detailRecPanel1 = new singin.interfaceEleve.DetailRecPanel();
    fermerButton = new javax.swing.JButton();

    jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
    jLabel7.setText("Commentaire du professeur :");

    jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(0, 51, 51));
    jLabel8.setText("Mon enregistrement :");

    jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
    jLabel9.setText("Répondre :");

    jTextArea2.setColumns(20);
    jTextArea2.setRows(5);
    jScrollPane2.setViewportView(jTextArea2);

    jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
    jLabel10.setText("Date :");

    jButton11.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
    jButton11.setText("Valider");

    jButton13.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
    jButton13.setText("Annuler");

    jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
    jLabel11.setText("Écouter");

    jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
    jLabel12.setText("Ré-enregistrer");

    jButton14.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
    jButton14.setText("Supprimer");

    jTextArea1.setColumns(20);
    jTextArea1.setRows(5);
    jScrollPane3.setViewportView(jTextArea1);

    jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 51, 51));
    jLabel1.setText("Projet initié par ...");

    enregistrementsLabel.setModel(new javax.swing.AbstractListModel() {
      String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
      public int getSize() { return strings.length; }
      public Object getElementAt(int i) { return strings[i]; }
    });
    jScrollPane1.setViewportView(enregistrementsLabel);

    enregistrementLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
    enregistrementLabel.setText("Liste des enregistrements :");

    detailButton.setText("Voir detail");

    rafraichirButton.setText("Raffraichir");

    playButton.setText("Play");

    stopButton.setText("Stop");

    recButton.setText("Rec");

    monEnregistrementButton.setText("Mon enregistrement");

    fermerButton.setText("Fermer le projet");
    fermerButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        fermerButtonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                      .addComponent(enregistrementLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGap(27, 27, 27)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addComponent(detailButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(rafraichirButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                      .addComponent(monEnregistrementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
              .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(playButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stopButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recButton)))
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(detailRecPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(monRecPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(58, 58, 58))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(fermerButton)
            .addContainerGap())))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(monRecPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(fermerButton))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(enregistrementLabel)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(layout.createSequentialGroup()
                .addComponent(detailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rafraichirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monEnregistrementButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(playButton)
              .addComponent(stopButton)
              .addComponent(recButton))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(detailRecPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void fermerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fermerButtonActionPerformed
    
	jFrame.fermerProjet();
  }//GEN-LAST:event_fermerButtonActionPerformed


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton detailButton;
  private singin.interfaceEleve.DetailRecPanel detailRecPanel1;
  private javax.swing.JLabel enregistrementLabel;
  private javax.swing.JList enregistrementsLabel;
  private javax.swing.JButton fermerButton;
  private javax.swing.JButton jButton10;
  private javax.swing.JButton jButton11;
  private javax.swing.JButton jButton12;
  private javax.swing.JButton jButton13;
  private javax.swing.JButton jButton14;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator3;
  private javax.swing.JTextArea jTextArea1;
  private javax.swing.JTextArea jTextArea2;
  private javax.swing.JButton monEnregistrementButton;
  private singin.interfaceEleve.MonRecPanel monRecPanel1;
  private javax.swing.JButton playButton;
  private javax.swing.JButton rafraichirButton;
  private javax.swing.JButton recButton;
  private javax.swing.JButton stopButton;
  // End of variables declaration//GEN-END:variables
}
