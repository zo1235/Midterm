
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import midterm.User;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Zoher
 */
public class CityForm extends javax.swing.JPanel {

    /**
     * Creates new form PatientForm
     */
        User u;
    JPanel bottomPanel;
    ImageIcon icon;
    public CityForm(User inputuser,JPanel bottomPanel,ImageIcon icon) {
        initComponents();
        this.u = inputuser;
        this.bottomPanel = bottomPanel;
        this.icon = icon;
        populateDetails();
        
    }
    public CityForm() {
        initComponents();
    }
 private void populateDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    class Patient {
    private final String name;
    private final int age;
    private final String emergencyContact;
    private final String postalCode;
    private final String phoneNumber;
    private final String patientType;
    private String Encounter;

    public Patient(String name, int age, String emergencyContact, String postalCode, String phoneNumber, String patientType) {
        this.name = name;
        this.age = age;
        this.emergencyContact = emergencyContact;
        this.postalCode = postalCode;
        this.phoneNumber = phoneNumber;
        this.patientType = patientType;
        this.Encounter = Encounter;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        toronto = new javax.swing.JButton();
        brampton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setText("Hospitals");

        toronto.setText("Toronto");
        toronto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torontoActionPerformed(evt);
            }
        });

        brampton.setText("Brampton");
        brampton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bramptonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(toronto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addComponent(brampton)
                .addGap(103, 103, 103))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brampton)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(toronto)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void torontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_torontoActionPerformed

    private void bramptonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bramptonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bramptonActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brampton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton toronto;
    // End of variables declaration//GEN-END:variables
}
