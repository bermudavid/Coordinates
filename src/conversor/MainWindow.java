/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package conversor;
import coord.*;

/**
 *
 * @author Bermu
 * @version 1.51
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }
    // variable from flood control
    boolean isCartesian = false;
    boolean isCilindrical = false;
    boolean isSpherical = false;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo1 = new javax.swing.JLabel();
        X = new javax.swing.JLabel();
        Y = new javax.swing.JLabel();
        Z = new javax.swing.JLabel();
        xTF = new javax.swing.JTextField();
        zTF = new javax.swing.JTextField();
        yTF = new javax.swing.JTextField();
        Titulo2 = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        pTF = new javax.swing.JTextField();
        phi = new javax.swing.JLabel();
        fiTF = new javax.swing.JTextField();
        zCTF = new javax.swing.JTextField();
        Z2 = new javax.swing.JLabel();
        Convert = new javax.swing.JButton();
        Titulo3 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        phi1 = new javax.swing.JLabel();
        Z3 = new javax.swing.JLabel();
        rTF = new javax.swing.JTextField();
        thetaTF = new javax.swing.JTextField();
        fiSTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo1.setText("Cartesian coordinates ");

        X.setText("X");

        Y.setText("Y");

        Z.setText("Z");

        xTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        xTF.setText("0");
        xTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                xTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                xTFFocusLost(evt);
            }
        });

        zTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        zTF.setText("0");
        zTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                zTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                zTFFocusLost(evt);
            }
        });

        yTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yTF.setText("0");
        yTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                yTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                yTFFocusLost(evt);
            }
        });

        Titulo2.setText("Cilindrical Coordinates");

        p.setText("p");

        pTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pTF.setText("0");
        pTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pTFFocusLost(evt);
            }
        });

        phi.setText("φ");

        fiTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fiTF.setText("0");
        fiTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fiTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fiTFFocusLost(evt);
            }
        });

        zCTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        zCTF.setText("0");
        zCTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                zCTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                zCTFFocusLost(evt);
            }
        });

        Z2.setText("Z");

        Convert.setText("Convert");
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });

        Titulo3.setText("Spherical Coordinates");

        p1.setText("r");

        phi1.setText("φ");

        Z3.setText("θ");

        rTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rTF.setText("0");
        rTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                rTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                rTFFocusLost(evt);
            }
        });

        thetaTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        thetaTF.setText("0");
        thetaTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                thetaTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                thetaTFFocusLost(evt);
            }
        });

        fiSTF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fiSTF.setText("0");
        fiSTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fiSTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fiSTFFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(pTF, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(rTF, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(p)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fiTF, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(thetaTF))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fiSTF, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(zCTF, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(phi)
                                .addGap(183, 183, 183)
                                .addComponent(Z2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(X)
                        .addGap(192, 192, 192)
                        .addComponent(Y)
                        .addGap(183, 183, 183)
                        .addComponent(Z))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(p1)
                        .addGap(196, 196, 196)
                        .addComponent(Z3)
                        .addGap(183, 183, 183)
                        .addComponent(phi1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(xTF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(yTF, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(zTF, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(Titulo1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(Titulo2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(Titulo3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo1)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(X)
                    .addComponent(Y)
                    .addComponent(Z))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p)
                            .addComponent(phi)
                            .addComponent(Z2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zCTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Titulo3)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p1)
                            .addComponent(Z3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fiSTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thetaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(Convert, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(phi1)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void initCartesianVals(Cartesian cart){
            cart.setX(Double.parseDouble(xTF.getText()));
            cart.setY(Double.parseDouble(yTF.getText()));
            cart.setZ(Double.parseDouble(zTF.getText()));
    }
    public Cilindrical initCilindricalVals(Cilindrical cil){
            cil.setP(Double.parseDouble(pTF.getText()));
            cil.setFi(Double.parseDouble(fiTF.getText()));
            cil.setZ(Double.parseDouble(zCTF.getText()));
            return cil;
            
    }
    public void initSphericalVals(Spherical sph){
            sph.setR(Double.parseDouble(rTF.getText()));
            sph.setTheta(Double.parseDouble(thetaTF.getText()));
            sph.setFi(Double.parseDouble(fiSTF.getText()));
    }
    
    public void run(){
        if(isCartesian){
            //recived
            Cartesian cart = new Cartesian();
            Cilindrical cil;
            Spherical sph;
            initCartesianVals(cart);
            
            cil = cart.toCilindrical();

            pTF.setText(""+cil.getP());
            fiTF.setText(""+cil.getFi());
            zCTF.setText(""+cil.getZ());

            sph = cil.toSpherical();

            rTF.setText(""+sph.getR());
            thetaTF.setText(""+sph.getTheta());
            fiSTF.setText(""+sph.getFi());

        }
        
        if(isCilindrical){
            Cartesian cart;
            Cilindrical cil = new Cilindrical();
            Spherical sph;
            //recived
            cil = initCilindricalVals(cil);
            
            cart = cil.toCartesian();
            xTF.setText(""+cart.getX());
            yTF.setText(""+cart.getY());
            zTF.setText(""+cart.getZ());
            
            sph = cil.toSpherical();

            rTF.setText(""+sph.getR());
            thetaTF.setText(""+sph.getTheta());
            fiSTF.setText(""+sph.getFi());
        
        }
        
        if(isSpherical){
            Cartesian cart;
            Cilindrical cil;
            Spherical sph = new Spherical();
            //recived
            initSphericalVals(sph);
            
            cart = sph.toCartesian();
            xTF.setText(""+cart.getX());
            zTF.setText(""+cart.getZ());
            yTF.setText(""+cart.getY());
            
            cil = sph.toCilindrical();

            pTF.setText(""+cil.getP());
            fiTF.setText(""+cil.getFi());
            zCTF.setText(""+cil.getZ());
        
        }
    
    
    }
    
    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed
        run();
    }//GEN-LAST:event_ConvertActionPerformed

    private void xTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xTFFocusLost
        run();
    }//GEN-LAST:event_xTFFocusLost

    private void yTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yTFFocusLost
        run();
    }//GEN-LAST:event_yTFFocusLost

    private void zTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zTFFocusLost
        run();
    }//GEN-LAST:event_zTFFocusLost

    private void pTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pTFFocusLost
        run();
    }//GEN-LAST:event_pTFFocusLost

    private void xTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xTFFocusGained
        setCartesianT();
    }//GEN-LAST:event_xTFFocusGained

    private void yTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_yTFFocusGained
        setCartesianT();
    }//GEN-LAST:event_yTFFocusGained

    private void zTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zTFFocusGained
        setCartesianT();
    }//GEN-LAST:event_zTFFocusGained

    private void pTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pTFFocusGained
        setCilindricalT();
    }//GEN-LAST:event_pTFFocusGained

    private void fiTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fiTFFocusGained
        setCilindricalT();
    }//GEN-LAST:event_fiTFFocusGained

    private void zCTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zCTFFocusGained
        setCilindricalT();
    }//GEN-LAST:event_zCTFFocusGained

    private void rTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rTFFocusGained
        setSphericalT();
    }//GEN-LAST:event_rTFFocusGained

    private void thetaTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_thetaTFFocusGained
        setSphericalT();
    }//GEN-LAST:event_thetaTFFocusGained

    private void fiSTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fiSTFFocusGained
        setSphericalT();
    }//GEN-LAST:event_fiSTFFocusGained

    private void fiTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fiTFFocusLost
        run();
    }//GEN-LAST:event_fiTFFocusLost

    private void zCTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zCTFFocusLost
        run();
    }//GEN-LAST:event_zCTFFocusLost

    private void rTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rTFFocusLost
        run();
    }//GEN-LAST:event_rTFFocusLost

    private void thetaTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_thetaTFFocusLost
        run();
    }//GEN-LAST:event_thetaTFFocusLost

    private void fiSTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fiSTFFocusLost
        run();
    }//GEN-LAST:event_fiSTFFocusLost

    /**
     * auxiliar methods for set the state
     */
    public void setCartesianT(){
        isCartesian = true;
        isCilindrical = false;
        isSpherical = false;
    }
    public void setCilindricalT(){
        isCartesian = false;
        isCilindrical = true;
        isSpherical = false;
    }
    public void setSphericalT(){
        isCartesian = false;
        isCilindrical = false;
        isSpherical = true;
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Convert;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JLabel X;
    private javax.swing.JLabel Y;
    private javax.swing.JLabel Z;
    private javax.swing.JLabel Z2;
    private javax.swing.JLabel Z3;
    private javax.swing.JTextField fiSTF;
    private javax.swing.JTextField fiTF;
    private javax.swing.JLabel p;
    private javax.swing.JLabel p1;
    private javax.swing.JTextField pTF;
    private javax.swing.JLabel phi;
    private javax.swing.JLabel phi1;
    private javax.swing.JTextField rTF;
    private javax.swing.JTextField thetaTF;
    private javax.swing.JTextField xTF;
    private javax.swing.JTextField yTF;
    private javax.swing.JTextField zCTF;
    private javax.swing.JTextField zTF;
    // End of variables declaration//GEN-END:variables
}
