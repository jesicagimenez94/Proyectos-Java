/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoadivinajesi;

import javax.swing.JOptionPane;

/**
 *
 * @author jesica
 */
public class Adivina extends javax.swing.JFrame {

    int intentos=0;
    int aleatorios=0;
    
    public Adivina() {
        initComponents();
        
        txtSalida.append("Ingresa un numero\n");
        aleatorios = (int)(Math.random()*100); /** numeros aleatorios del juego*/
        setSize(650,500);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnJugar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JTextArea();
        btnReiniciar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtNumero.setBackground(new java.awt.Color(255, 255, 204));
        txtNumero.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        getContentPane().add(txtNumero);
        txtNumero.setBounds(30, 20, 270, 40);

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesJuego/button_jugar.jpg"))); // NOI18N
        btnJugar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar);
        btnJugar.setBounds(310, 20, 120, 40);

        txtSalida.setBackground(new java.awt.Color(255, 255, 204));
        txtSalida.setColumns(20);
        txtSalida.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        txtSalida.setRows(5);
        jScrollPane1.setViewportView(txtSalida);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 120, 540, 300);

        btnReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesJuego/button_reiniciar.jpg"))); // NOI18N
        btnReiniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReiniciar.setHideActionText(true);
        btnReiniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnReiniciar);
        btnReiniciar.setBounds(450, 20, 160, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesJuego/wallpaper2you_112281.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 720, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
       
         /** logica boton jugar */
        try{
        int numero= Integer.parseInt(txtNumero.getText());
        
        if(numero == aleatorios){   /** si el numero ingresado por el jugador es igual al de la maquina despliega un mensaje y la cantidad de intentos en que lo hiso*/
            txtSalida.append("FELICIDADES GANASTE\n");
            txtSalida.append("ACERTASTE EN "+intentos+" INTENTOS!");
            txtSalida.append("EL NUMERO ES: "+aleatorios+"\n");
            btnJugar.setEnabled(false); /** se bloquea el boton jugar una vez que ganas*/
            btnReiniciar.setEnabled(true);/** se desbloquea el boton de reinicio una vez que ganas*/
        }
        
        else if(numero < aleatorios)   /** si el numero ingresado es menor al numero aleatorio a adivinar muestra un msj*/
        txtSalida.append(numero+" ES BAJO!\n");
        else                   /** si no el numero ingresado es mayor al numero aleatorio a adivinar muestra un msj*/
          txtSalida.append(numero+" ES ALTO!\n");
        
        txtNumero.setText("");
        txtNumero.requestFocus(); /** donde se va ubicar el foco o el mouse*/
        intentos++;/** cada vez que se apreta el boton jugar en la variable intentos se guarda uno*/
        
        }catch(NumberFormatException ex){ /** si se ingresa un valor que no sea un numero el juego no va funcionar*/
        JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
    /** logica boton reiniciar */
      btnJugar.setEnabled(true);/** boton jugar encendido */
      btnReiniciar.setEnabled(false);/** boton reiniciar apagado*/
      
      intentos=0;
      aleatorios = (int)(Math.random()*100);/** crea nuevo numero aleatorio*/
      txtSalida.setText("");
      txtNumero.requestFocus();
      txtSalida.append("Ingresa un numero\n");
    }//GEN-LAST:event_btnReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Adivina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adivina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adivina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adivina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adivina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtSalida;
    // End of variables declaration//GEN-END:variables
}
