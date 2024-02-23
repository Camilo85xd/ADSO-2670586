
package interfazcruddb;

import Alertas.EditadoRespuesta;
import Alertas.Alerta;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import interfazcruddb.DocumentoEditar;
import interfazcruddb.Persona;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class VentaEditar extends javax.swing.JFrame {

    BaseDatos basedatos = new BaseDatos();
    FondoPanel fondo = new FondoPanel();
    public VentaEditar( String documento,String nombres,String apellidos,String telefono,String direccion, String correo) {
        this.setContentPane(fondo);
        initComponents();
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/sena.png"));
        setIconImage(icono.getImage());
        setVisible(true);
        setTitle("Editar usuario");
        
        String documentor = documento;
        String nombresr = nombres;
        String apellidosr = apellidos;
        String telefonor = telefono;
        String direccionr = direccion;
        String correor = correo;
                
        initAlernComponents(documentor, nombresr, apellidosr, telefonor,direccionr, correor);
        
    }
    
    public void initAlernComponents(String documentor,String nombresr,String apellidosr,String telefonor,String direccionr, String correor){
        setVisible(true);
        pack();
        
        
        setLocationRelativeTo(null);
        
        campoNombre.setText(nombresr);
        campoDocumento.setText(documentor);
        campoApellidos.setText(apellidosr);
        campoTelefono.setText(telefonor);
        campoDireccion.setText(direccionr);
        campoCorreo.setText(correor);
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etqDocumento = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etqNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etqCorreo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        etqApellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();
        campoDireccion = new javax.swing.JTextField();
        etqCorreo1 = new javax.swing.JLabel();
        agregar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setOpaque(false);

        etqDocumento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        etqDocumento.setForeground(new java.awt.Color(255, 255, 255));
        etqDocumento.setText("Documento:");

        campoDocumento.setBackground(new java.awt.Color(255, 255, 255));
        campoDocumento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        campoDocumento.setForeground(new java.awt.Color(0, 0, 0));
        campoDocumento.setBorder(null);
        campoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDocumentoActionPerformed(evt);
            }
        });

        etqTelefono.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(255, 255, 255));
        etqTelefono.setText("Telefono:");

        campoTelefono.setBackground(new java.awt.Color(255, 255, 255));
        campoTelefono.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        campoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        campoTelefono.setBorder(null);
        campoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefonoActionPerformed(evt);
            }
        });

        etqNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        etqNombre.setForeground(new java.awt.Color(255, 255, 255));
        etqNombre.setText("Nombres:");

        campoNombre.setBackground(new java.awt.Color(255, 255, 255));
        campoNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        campoNombre.setForeground(new java.awt.Color(0, 0, 0));
        campoNombre.setBorder(null);
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        etqCorreo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        etqCorreo.setForeground(new java.awt.Color(255, 255, 255));
        etqCorreo.setText("Correo electronico:");

        campoCorreo.setBackground(new java.awt.Color(255, 255, 255));
        campoCorreo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        campoCorreo.setForeground(new java.awt.Color(0, 0, 0));
        campoCorreo.setBorder(null);
        campoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCorreoActionPerformed(evt);
            }
        });

        etqApellidos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        etqApellidos.setForeground(new java.awt.Color(255, 255, 255));
        etqApellidos.setText("Apellidos:");

        campoApellidos.setBackground(new java.awt.Color(255, 255, 255));
        campoApellidos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        campoApellidos.setForeground(new java.awt.Color(0, 0, 0));
        campoApellidos.setBorder(null);
        campoApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoApellidosActionPerformed(evt);
            }
        });

        agregar.setBackground(new java.awt.Color(0, 0, 204));
        agregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setText("EDITAR");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        campoDireccion.setBackground(new java.awt.Color(255, 255, 255));
        campoDireccion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        campoDireccion.setForeground(new java.awt.Color(0, 0, 0));
        campoDireccion.setBorder(null);
        campoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDireccionActionPerformed(evt);
            }
        });

        etqCorreo1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        etqCorreo1.setForeground(new java.awt.Color(255, 255, 255));
        etqCorreo1.setText("Direccion:");

        agregar1.setBackground(new java.awt.Color(255, 0, 0));
        agregar1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        agregar1.setForeground(new java.awt.Color(255, 255, 255));
        agregar1.setText("Cancelar");
        agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqTelefono)
                            .addComponent(etqCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoDireccion)
                            .addComponent(campoTelefono)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqCorreo)
                            .addComponent(etqApellidos)
                            .addComponent(etqNombre))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoNombre)
                            .addComponent(campoApellidos)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etqDocumento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqDocumento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoDocumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqNombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCorreo)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqApellidos)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCorreo1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTelefono)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDireccionActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

        String documentoe = campoDocumento.getText();
        String nombrese = campoNombre.getText();
        String apellidose = campoApellidos.getText();
        String telefonoe = campoTelefono.getText();
        String correoe = campoCorreo.getText();
        String direccione = campoDireccion.getText();

        String faltante = "";

        if (documentoe.equals("")){
            faltante += "Documento";
        }
        if (nombrese.equals("")){
            faltante += " Nombre";
        }
        if (apellidose.equals("")){
            faltante += " Apellidos";
        }
        if (telefonoe.equals("")){
            faltante += " Teléfono";
        }
        if (correoe.equals("")){
            faltante += " Correo";
        }

        if (documentoe.equals("") || nombrese.equals("") || apellidose.equals("") || telefonoe.equals("") || correoe.equals("")){

            Alerta ventana_alerta = new Alerta(faltante);

        }else{

            boolean respuesta = basedatos.EditarPersona(documentoe, nombrese, apellidose, telefonoe, direccione, correoe);
            System.out.println(respuesta);

            String respuestaRegistro = "";
            if(respuesta = true){
                respuestaRegistro = "El usuario ha sido Editado correctamente";
            } else{

                respuestaRegistro = "El usuario no pudo Actualizarse";

            }

            EditadoRespuesta editadoVentana = new EditadoRespuesta(respuestaRegistro);
            setVisible(false);
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void campoApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoApellidosActionPerformed

    private void campoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCorreoActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefonoActionPerformed

    private void campoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDocumentoActionPerformed

    private void agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar1ActionPerformed
        
        setVisible(false);
        Menu ventana = new Menu();
        
    }//GEN-LAST:event_agregar1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton agregar1;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqCorreo1;
    private javax.swing.JLabel etqDocumento;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel{
        
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo2.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
            
        }
        
    }
    
}
