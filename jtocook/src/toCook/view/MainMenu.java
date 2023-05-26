package toCook.view;

import toCook.model.Utilisateur;

public class MainMenu extends javax.swing.JFrame {

    private final Utilisateur utConnect;

    /**
     * Creates new form mail
     *
     * @param utilisateur
     */
    public MainMenu(Utilisateur utilisateur) {
        this.utConnect = utilisateur;
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

        Entete = new javax.swing.JLabel();
        parametrer = new javax.swing.JLabel();
        Utilisateur = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();
        quitte = new javax.swing.JLabel();
        info = new javax.swing.JButton();
        abandon = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("view.MainMenu");
        setMinimumSize(new java.awt.Dimension(700, 470));
        setResizable(false);
        getContentPane().setLayout(null);

        Entete.setBackground(new java.awt.Color(255,255,255,120));
        Entete.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        Entete.setForeground(new java.awt.Color(255, 0, 0));
        Entete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/toocoock.PNG"))); // NOI18N
        Entete.setText(" Menu général");
        Entete.setIconTextGap(22);
        Entete.setOpaque(true);
        getContentPane().add(Entete);
        Entete.setBounds(0, 0, 699, 70);

        parametrer.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        parametrer.setForeground(new java.awt.Color(51, 51, 51));
        parametrer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parametrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/gear_80.png"))); // NOI18N
        parametrer.setText("Paramétre");
        parametrer.setToolTipText("Paramétrer l'application");
        parametrer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        parametrer.setIconTextGap(0);
        parametrer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        parametrer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parametrerMouseClicked(evt);
            }
        });
        getContentPane().add(parametrer);
        parametrer.setBounds(80, 110, 100, 100);

        Utilisateur.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Utilisateur.setForeground(new java.awt.Color(51, 51, 51));
        Utilisateur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Utilisateur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/user-secret_80.png"))); // NOI18N
        Utilisateur.setText("Utilisateur");
        Utilisateur.setToolTipText("Gestion des utilisateurs");
        Utilisateur.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Utilisateur.setIconTextGap(0);
        Utilisateur.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Utilisateur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UtilisateurMouseClicked(evt);
            }
        });
        getContentPane().add(Utilisateur);
        Utilisateur.setBounds(240, 110, 100, 100);

        dashboard.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        dashboard.setForeground(new java.awt.Color(51, 51, 51));
        dashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/progjour.png"))); // NOI18N
        dashboard.setText("ProgJournée");
        dashboard.setToolTipText("Programmation des journées");
        dashboard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dashboard.setIconTextGap(0);
        dashboard.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });
        getContentPane().add(dashboard);
        dashboard.setBounds(400, 110, 100, 100);

        quitte.setBackground(new java.awt.Color(255, 255, 255,100));
        quitte.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        quitte.setForeground(new java.awt.Color(51, 51, 51));
        quitte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quitte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/power-off_80.png"))); // NOI18N
        quitte.setText("Quitter");
        quitte.setToolTipText("Se déconnecter de l'application");
        quitte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quitte.setIconTextGap(0);
        quitte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        quitte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quitteMouseClicked(evt);
            }
        });
        getContentPane().add(quitte);
        quitte.setBounds(560, 110, 100, 100);

        info.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        info.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/info-circle_20.png"))); // NOI18N
        info.setText("Au Sujet");
        info.setToolTipText("Sortir de la fenétre d'envoi");
        info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoMouseClicked(evt);
            }
        });
        getContentPane().add(info);
        info.setBounds(20, 390, 101, 26);

        abandon.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        abandon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/escape_20.png"))); // NOI18N
        abandon.setText("Abandonner");
        abandon.setToolTipText("Sortir de la fenétre d'envoi");
        abandon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                abandonMouseClicked(evt);
            }
        });
        getContentPane().add(abandon);
        abandon.setBounds(542, 390, 123, 26);

        jPanel1.setBackground(new java.awt.Color(255, 199, 199));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 70, 700, 360);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        private void abandonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_abandonMouseClicked
            // TODO add your handling code here:
            this.dispose();
        }//GEN-LAST:event_abandonMouseClicked

    private void infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseClicked
        // TODO add your handling code here:
        AuSujet auSujet = new AuSujet();
        auSujet.setVisible(true);
    }//GEN-LAST:event_infoMouseClicked

    private void parametrerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parametrerMouseClicked
        // TODO add your handling code here:
        Parametre parametre = new Parametre(this.utConnect);
        parametre.setVisible(true);
    }//GEN-LAST:event_parametrerMouseClicked

    private void quitteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitteMouseClicked
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_quitteMouseClicked

    private void UtilisateurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UtilisateurMouseClicked
        // TODO add your handling code here:
        UtilCrud utilCRUD = new UtilCrud(this.utConnect);
        utilCRUD.setVisible(true);
    }//GEN-LAST:event_UtilisateurMouseClicked

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        // TODO add your handling code here:
        ProgJournee progJournee = new ProgJournee();
        progJournee.setVisible(true);
    }//GEN-LAST:event_dashboardMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Entete;
    private javax.swing.JLabel Utilisateur;
    private javax.swing.JButton abandon;
    private javax.swing.JLabel dashboard;
    private javax.swing.JButton info;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel parametrer;
    private javax.swing.JLabel quitte;
    // End of variables declaration//GEN-END:variables
}
