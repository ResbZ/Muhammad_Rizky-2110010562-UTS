package Resep;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Resb
 */
public class FrameBakso extends javax.swing.JFrame {


    /**
     * Creates new form FrameNasi
     */
    public FrameBakso() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTextArea jTextArea1 = new javax.swing.JTextArea();

        setTitle("Resep Nasi Goreng");
        setBackground(new java.awt.Color(255, 255, 153));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Bahan:\n500 gram daging sapi giling\n50 gram es batu\n1 butir telur\n100 gram tepung kanji\n\nBahan isian bakso:\n200 gram daging sapi, cincang halus\n1 siung bawang putih, cincang halus\n1/2 sdt garam\n2 sdm minyak, untuk menumis\nAir secukupnya\n\nBumbu kuah bakso:\n2 siung bawang putih, haluskan\n1 sdt bubuk lada\n1/2 sdt bubuk pala\n1 sdm garam\n1/2 sdt bubuk kaldu sapi\n\nCara membuat:\n1. Siapkan minyak, lalu tumis bawang putih hingga harum.\n\n2. Tambahkan daging cincang, aduk-aduk hingga daging \nkaku. Jika daging sudah kaku tambahkan garam dan air, \nlalu aduk rata. Masak lagi hingga air habis, angkat, dan \nsisihkan. Cara membuat bakso sapi rumahan: Campur \nsemua bahan resep bakso sapi rumahan kecuali tepung\n kanji beserta bumbu, haluskan menggunakan food \nprocessor.\n\n3. Tambahkan tepung kanji sedikit demi sedikit sambil \nterus diaduk hingga tercampur rata. Jika sudah rata, \npindahkan adonan ke wadah baru (baskom).\n\n4. Ambil satu sendok makan adonan, pipihkan. Beri satu \nsendok teh isian di tengahnya, dan bulatkan.\n\n5. Masukkan bakso sapi yang sudah dibulatkan ke dalam \nair mendidih, lalu biarkan hingga terapung.\n\n6. Angkat bakso sapi dan tiriskan.");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FrameBakso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameBakso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameBakso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameBakso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameBakso().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}