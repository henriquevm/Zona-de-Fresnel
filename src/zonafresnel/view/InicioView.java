/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zonafresnel.view;

/**
 *
 * @author Homirrimo
 */
public class InicioView extends javax.swing.JFrame {

    /**
     * Creates new form InicioView
     */
    public InicioView() {
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

        tituloTrabalho = new javax.swing.JLabel();
        panelProfessor = new javax.swing.JPanel();
        labelProfessor = new javax.swing.JLabel();
        labelGuilherme = new javax.swing.JLabel();
        labelStrauss = new javax.swing.JLabel();
        panelEquipe = new javax.swing.JPanel();
        labelEquipe = new javax.swing.JLabel();
        labelFred = new javax.swing.JLabel();
        labelHenrique = new javax.swing.JLabel();
        labelWaislan = new javax.swing.JLabel();
        subTituloCalculo = new javax.swing.JLabel();
        labelLogoIF = new javax.swing.JLabel();
        buttonInicio = new javax.swing.JButton();
        labelData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculo Raio de Enlace");
        setBackground(new java.awt.Color(0, 0, 0));

        tituloTrabalho.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tituloTrabalho.setText("Trabalho Interdisciplinar de Propagação de Ondas Eletromagnética e Engenharia de Software");

        labelProfessor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelProfessor.setText("Professores:");

        labelGuilherme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelGuilherme.setText("Guilherme Rosse Ramalho");

        labelStrauss.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelStrauss.setText("Straus Michalsky Martins");

        javax.swing.GroupLayout panelProfessorLayout = new javax.swing.GroupLayout(panelProfessor);
        panelProfessor.setLayout(panelProfessorLayout);
        panelProfessorLayout.setHorizontalGroup(
            panelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelProfessor)
                    .addComponent(labelGuilherme)
                    .addComponent(labelStrauss))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        panelProfessorLayout.setVerticalGroup(
            panelProfessorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProfessorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelProfessor)
                .addGap(18, 18, 18)
                .addComponent(labelGuilherme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelStrauss)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        labelEquipe.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelEquipe.setText("Equipe:");

        labelFred.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelFred.setText("Frederico de Rezende Casagrande");

        labelHenrique.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelHenrique.setText("Henrique da Veiga Moreira");

        labelWaislan.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelWaislan.setText("Waislan Luis Sanches");

        javax.swing.GroupLayout panelEquipeLayout = new javax.swing.GroupLayout(panelEquipe);
        panelEquipe.setLayout(panelEquipeLayout);
        panelEquipeLayout.setHorizontalGroup(
            panelEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquipeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelEquipe)
                    .addComponent(labelFred)
                    .addComponent(labelHenrique)
                    .addComponent(labelWaislan))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        panelEquipeLayout.setVerticalGroup(
            panelEquipeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEquipeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEquipe)
                .addGap(18, 18, 18)
                .addComponent(labelFred)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelHenrique)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelWaislan)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        subTituloCalculo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        subTituloCalculo.setText("Calculo da Zona de Fresnel");

        labelLogoIF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zonafresnel/img/Logo_IF_fundo_Cinza_menor.jpg"))); // NOI18N

        buttonInicio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        buttonInicio.setText("INICIO");
        buttonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInicioActionPerformed(evt);
            }
        });

        labelData.setText("Poços de Caldas, 04/12/2019");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(tituloTrabalho))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(subTituloCalculo)))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(labelLogoIF)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelData)
                .addGap(345, 345, 345))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloTrabalho)
                .addGap(26, 26, 26)
                .addComponent(subTituloCalculo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelLogoIF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(buttonInicio)
                .addGap(21, 21, 21)
                .addComponent(labelData)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(850, 461));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInicioActionPerformed
        // Desabilita interface de inicioView
        setVisible(false);
        // Vai para InserirDadosView
        new InserirDadosView().setVisible(true);
       
        
    }//GEN-LAST:event_buttonInicioActionPerformed

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
            java.util.logging.Logger.getLogger(InicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonInicio;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel labelEquipe;
    private javax.swing.JLabel labelFred;
    private javax.swing.JLabel labelGuilherme;
    private javax.swing.JLabel labelHenrique;
    private javax.swing.JLabel labelLogoIF;
    private javax.swing.JLabel labelProfessor;
    private javax.swing.JLabel labelStrauss;
    private javax.swing.JLabel labelWaislan;
    private javax.swing.JPanel panelEquipe;
    private javax.swing.JPanel panelProfessor;
    private javax.swing.JLabel subTituloCalculo;
    private javax.swing.JLabel tituloTrabalho;
    // End of variables declaration//GEN-END:variables
}
