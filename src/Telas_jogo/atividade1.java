
package Telas_jogo;

import static java.lang.Thread.sleep;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class atividade1 extends javax.swing.JFrame {

    

    
    public atividade1() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img/icone.png")).getImage());
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        status3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        status2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        status1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        Splash_BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 630));
        setResizable(false);
        getContentPane().setLayout(null);

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(420, 440, 40, 20);
        getContentPane().add(status3);
        status3.setBounds(470, 440, 50, 20);

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(260, 400, 70, 20);
        getContentPane().add(status2);
        status2.setBounds(340, 400, 50, 20);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(270, 310, 150, 20);
        getContentPane().add(status1);
        status1.setBounds(430, 310, 50, 40);

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
        jButton4.setBounds(680, 500, 50, 50);

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(0, 98, 130));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(0, 187, 224));
        jTextPane1.setText("Fase 1");
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 70, 24);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jTextPane2.setEditable(false);
        jTextPane2.setContentType(""); // NOI18N
        jTextPane2.setText("Como primeira atividade ajude a terminar o codigo de calculo de média, complete as partes que faltam com a estrutura correta!\n\n\nalgoritmo \"Soma Media com função\"\n\nfuncao calcular_Media(): REAL\nvar\n    media : REAL\ninicio\n\tmedia := (nota1 + nota2) / 2\n\tRETORNE media\nfimfuncao\n\nvar\n    nota1, nota2 : \n\ninicio\n\tESCREVA (\"Digite a primeira nota do aluno: \")\n\tLEIA (nota1)\n\tESCREVA (\"Digite a segunda nota do aluno: \")\n\t\n\n\tmedia := calcular_Media()\n\tESCREVA (\"A media do aluno é: \",              )\nfimalgoritmo");
        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(180, 100, 540, 380);

        jButton2.setText("Verificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(360, 500, 80, 50);

        Splash_BG.setBackground(new java.awt.Color(0, 204, 255));
        Splash_BG.setForeground(new java.awt.Color(0, 204, 255));
        Splash_BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BG 800.png"))); // NOI18N
        Splash_BG.setMaximumSize(new java.awt.Dimension(800, 630));
        Splash_BG.setMinimumSize(new java.awt.Dimension(800, 630));
        Splash_BG.setPreferredSize(new java.awt.Dimension(800, 630));
        getContentPane().add(Splash_BG);
        Splash_BG.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(this.jTextField1.equals("REAL")){           
            this.status1.setIcon((Icon)new ImageIcon(getClass().getResource("img/icon_acerto.png"))); 
                                  
        }
        
        else{
               this.status1.setIcon((Icon)new ImageIcon(getClass().getResource("img/icon_erro.png"))); 
               
        }
       
        if(this.jTextField2.equals("LEIA(nota2)")){
                    this.status2.setIcon((Icon)new ImageIcon(getClass().getResource("img/icon_acerto.png")));
            }
         else{
               this.status2.setIcon((Icon)new ImageIcon(getClass().getResource("img/icon_erro.png"))); 
         }
        if(this.jTextField3.equals("media")){
                    this.status3.setIcon((Icon)new ImageIcon(getClass().getResource("img/icon_acerto.png")));
            }
         else{
               this.status3.setIcon((Icon)new ImageIcon(getClass().getResource("img/icon_erro.png"))); 
         }
        if(this.jTextField1.equals("REAL") && this.jTextField2.equals("LEIA(nota2)") && this.jTextField3.equals("media")){
        
            this.jButton4.setIcon((Icon)new ImageIcon(getClass().getResource("img/btnProximo.png")));
            JOptionPane.showMessageDialog(null,"Todas as linhas estão corretas!! \n O código vai funcionar corretamente parabéns" );
            
        }
         else{
                             
               JOptionPane.showMessageDialog(null, "Uma ou mais Linhas estão erradas, tente novamente");
               atividade1 var = new atividade1();
          var.setVisible(true);
          dispose();
         }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jButton4.setOpaque(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setBorderPainted(false);
        atividade2 next = new atividade2();
        next.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atividade1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Splash_BG;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JLabel status1;
    private javax.swing.JLabel status2;
    private javax.swing.JLabel status3;
    // End of variables declaration//GEN-END:variables
}
