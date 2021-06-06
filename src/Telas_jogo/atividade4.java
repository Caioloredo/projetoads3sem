
package Telas_jogo;

import static java.lang.Thread.sleep;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class atividade4 extends javax.swing.JFrame {

    int vida = 3;
    
    public atividade4() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/icone.png")).getImage());               
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        status4 = new javax.swing.JLabel();
        status3 = new javax.swing.JLabel();
        status2 = new javax.swing.JLabel();
        status1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Splash_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coracao1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(680, 10, 80, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coracao1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(600, 10, 80, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coracao1.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 10, 80, 40);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 250, 59, 20);

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(320, 180, 70, 20);

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(200, 407, 70, 20);

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(240, 470, 80, 20);
        getContentPane().add(status4);
        status4.setBounds(320, 460, 40, 30);
        getContentPane().add(status3);
        status3.setBounds(270, 397, 50, 30);
        getContentPane().add(status2);
        status2.setBounds(390, 170, 40, 30);
        getContentPane().add(status1);
        status1.setBounds(260, 240, 50, 30);

        jTextPane3.setEditable(false);
        jTextPane3.setBackground(new java.awt.Color(0, 98, 130));
        jTextPane3.setBorder(null);
        jTextPane3.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jTextPane3.setForeground(new java.awt.Color(0, 187, 224));
        jTextPane3.setText("Vidas:");
        jScrollPane3.setViewportView(jTextPane3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(460, 10, 70, 31);

        jTextPane1.setBackground(new java.awt.Color(0, 98, 130));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 187, 224));
        jTextPane1.setText("Fase 4");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(80, 10, 80, 30);

        jTextPane2.setEditable(false);
        jTextPane2.setContentType(""); // NOI18N
        jTextPane2.setText("Parabens por mais um código concluido, agora teremos um novo desafio por favor veja o código abaixo e complete com os comandos certos para o código funcionar !\n\n\nAlgoritmo \"Chamada de login\"\n\nfuncao fazer_Login() : REAL\nvar\n    senha, logar : REAL\ninicio\n      SE (senha := \"12345\") ENTAO \n\t ESCREVA (\"Acesso liberado!\")\n      SENAO\n\t ESCREVA (\"Acesso negado!\")\n      FIMSE\n\n      RETORNE logar\nfimfuncao\n\nvar\n   login : CARACTERE\n   senha, logar : REAL\ninicio\n      ESCREVA (\"Digite o seu login: \")\n      LEIA (login)\n      ESCREVA (\"Digite a sua senha: \")\n      LEIA (senha)\n\n      logar := fazer_Login()\n      ESCREVA (\"Seja bem-vindo, usuario: \",login )\nfimalgoritmo");
        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(180, 90, 560, 430);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnVerif.png"))); // NOI18N
        jButton2.setText("Verificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(330, 520, 170, 30);

        jButton4.setBackground(new java.awt.Color(102, 255, 255));
        jButton4.setToolTipText("Clique para ir para a próxima tela");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusCycleRoot(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(680, 510, 50, 40);

        Splash_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GB-fundo.png"))); // NOI18N
        Splash_BG.setMaximumSize(new java.awt.Dimension(800, 630));
        Splash_BG.setMinimumSize(new java.awt.Dimension(800, 630));
        Splash_BG.setPreferredSize(new java.awt.Dimension(800, 630));
        getContentPane().add(Splash_BG);
        Splash_BG.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setOpaque(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorderPainted(false);
        Menu next = new Menu();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         String text1 = jTextField1.getText();
        String text2 = jTextField2.getText();
        String text3 = jTextField3.getText();
        String text4 = jTextField4.getText();
        
        if(text1.equals("FIMSE")){
            this.status1.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_acerto.png"))); 
        }        
        else{
               this.status1.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_erro.png")));
               vida = vida -1;
        }
        
        if(text2.equals("ENTAO")){
            this.status2.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_acerto.png")));
        }
        else{
            this.status2.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_erro.png")));
            vida = vida -1;
        }
        
        if(text3.equals("LEIA (login)")){
            this.status3.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_acerto.png")));
        }
        else{
            this.status3.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_erro.png")));
            vida = vida -1;
        }
        
        if(text4.equals("fazer_Login()")){
            this.status4.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_acerto.png"))); 
        }        
        else{
            this.status4.setIcon((Icon)new ImageIcon(getClass().getResource("/img/icon_erro.png")));
            vida = vida -1;
        }
        
        if(text1.equals("ENTAO") && text2.equals("FIMSE") && text3.equals("LEIA (login)") && text4.equals("fazer_Login()")){
            this.jButton4.setIcon((Icon)new ImageIcon(getClass().getResource("/img/btnProximo.png")));
            JOptionPane.showMessageDialog(null, "Todas as linhas estão corretas!! \n O código vai funcionar corretamente parabéns");    
        }
        else{
            JOptionPane.showMessageDialog(null, "Uma ou mais Linhas estão erradas, tente novamente");
            }     
        if(vida == 2){
            this.jLabel1.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao2.png")));
            this.jLabel2.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao1.png")));
            this.jLabel3.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao1.png")));
        }
         if(vida == 1){
            this.jLabel1.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao2.png")));
            this.jLabel2.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao2.png")));
            this.jLabel3.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao1.png")));
        }
          if(vida <= 0){
            this.jLabel1.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao2.png")));
            this.jLabel2.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao2.png")));
            this.jLabel3.setIcon((Icon)new ImageIcon(getClass().getResource("/img/coracao2.png")));
            JOptionPane.showMessageDialog(null,"Perdeu todas as chances, tente novamente!!");
            atividade4 Mn = new atividade4();
            Mn.setVisible(true);
            dispose();
          }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
  
  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atividade4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Splash_BG;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JLabel status1;
    private javax.swing.JLabel status2;
    private javax.swing.JLabel status3;
    private javax.swing.JLabel status4;
    // End of variables declaration//GEN-END:variables
}
