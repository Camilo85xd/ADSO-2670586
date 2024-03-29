/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vigilante;

/**
 *
 * @author INSTRUCTOR
 */
public class Panel_Registrar_Entrada extends javax.swing.JPanel {

    /**
     * Creates new form Panel_Registrar_Entrada
     */
    public Panel_Registrar_Entrada() {
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

        jSeparator8 = new javax.swing.JSeparator();
        campo_telefono1 = new javax.swing.JTextField();
        userLabel7 = new javax.swing.JLabel();
        etq_registrarentrada = new javax.swing.JLabel();
        btn_buscarpc = new javax.swing.JButton();
        btn_registrarentrada = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_computador = new javax.swing.JTable();

        setBackground(new java.awt.Color(0, 74, 173));

        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        campo_telefono1.setBackground(new java.awt.Color(0, 74, 173));
        campo_telefono1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        campo_telefono1.setForeground(new java.awt.Color(204, 204, 255));
        campo_telefono1.setText("Ingrese cedula");
        campo_telefono1.setBorder(null);
        campo_telefono1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                campo_telefono1MousePressed(evt);
            }
        });

        userLabel7.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel7.setForeground(new java.awt.Color(255, 255, 255));
        userLabel7.setText("Cedula de usuario");

        etq_registrarentrada.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        etq_registrarentrada.setForeground(new java.awt.Color(255, 255, 255));
        etq_registrarentrada.setText("REGISTRAR ENTRADA");

        btn_buscarpc.setBackground(new java.awt.Color(51, 204, 0));
        btn_buscarpc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_buscarpc.setForeground(new java.awt.Color(255, 255, 255));
        btn_buscarpc.setText("Buscar Pc");
        btn_buscarpc.setBorder(null);
        btn_buscarpc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscarpc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarpcActionPerformed(evt);
            }
        });

        btn_registrarentrada.setBackground(new java.awt.Color(51, 204, 0));
        btn_registrarentrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registrarentrada.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrarentrada.setText("Registrar Entrada");
        btn_registrarentrada.setBorder(null);
        btn_registrarentrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrarentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarentradaActionPerformed(evt);
            }
        });

        tabla_computador.setBackground(new java.awt.Color(56, 128, 255));
        tabla_computador.setForeground(new java.awt.Color(255, 255, 255));
        tabla_computador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código_equipo", "Marca", "Persona", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla_computador);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addComponent(btn_registrarentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(userLabel7)
                        .addComponent(campo_telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_buscarpc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(97, 97, 97))
                .addGroup(layout.createSequentialGroup()
                    .addGap(184, 184, 184)
                    .addComponent(etq_registrarentrada)
                    .addGap(204, 204, 204))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 368, Short.MAX_VALUE)
                .addComponent(btn_registrarentrada, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(etq_registrarentrada)
                    .addGap(56, 56, 56)
                    .addComponent(userLabel7)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campo_telefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_buscarpc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(82, 82, 82)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void campo_telefono1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campo_telefono1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_telefono1MousePressed

    private void btn_buscarpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarpcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarpcActionPerformed

    private void btn_registrarentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarentradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_registrarentradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarpc;
    private javax.swing.JButton btn_registrarentrada;
    private javax.swing.JTextField campo_telefono1;
    private javax.swing.JLabel etq_registrarentrada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable tabla_computador;
    private javax.swing.JLabel userLabel7;
    // End of variables declaration//GEN-END:variables
}
