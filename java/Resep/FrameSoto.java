package Resep;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Resb
 */
public class FrameSoto extends javax.swing.JFrame {


    /**
     * Creates new form FrameNasi
     */
    public FrameSoto() {
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
        jTextArea1.setText("Bahan:\n2.500 ml air\n850 gram ayam kampung, potong menjadi 4 bagian\n4 sentimeter lengkuas, memarkan\n3 lembar daun salam\nMinyak goreng\n3 sdm minyak goreng\n\nBumbu halus:\n8 siung bawang putih\n3 sentimeter jahe yang dibakar\n1 sdt lada butir, sangrai\n2 sdt garam\n3 lembar daun jeruk\n1 batang serai, memarkan\n150 gram soun, seduh air panas dan tiriskan\n150 gram taoge, seduh air panas dan tiriskan\n3 butir telur rebus, potong-potong\n\nBahan pelengkap:\nKeripik kentang\n3 sdm irisan daun bawang\n2 sdm bawang merah goreng\nSambal cabai rawit\n1 buah jeruk nipis, potong-potong\n3 sdm kecap manis\n\nCara membuat:\n1.Didihkan air, rebus ayam bersama lengkuas dan daun \nsalam hingga empuk. Setelah itu, angkat dan sisihkan \nkaldu. Panaskan minyak, goreng ayam hingga kuning \nkecokelatan. Setelah itu, angkat dan suwir-suwir.\n\n2.Panaskan minyak, tumis bumbu yang telah dihaluskan \nhingga harum. Masukkan ke dalam kaldu rebusan ayam. \nTambahkan daun jeruk dan serai, setelah itu, didihkan.\n\n3.Siapkan mangkuk saji, atur soun, taoge, telur rebus, \ndan suwiran ayam. Tuang kuah soto. Taburkan keripik \nkentang, daun bawang, dan bawang goreng. Sajikan \nbersama sambal rawit, potongan jeruk, dan kecap manis.");
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
            java.util.logging.Logger.getLogger(FrameSoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSoto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSoto().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}