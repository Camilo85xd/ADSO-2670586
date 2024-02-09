
package principal;

import java.awt.Color;
import principal.Buttoneditor;
import principal.ButtonRenderer;
import principal.Persona;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;


public class TablaBasica extends javax.swing.JFrame {

    DefaultTableModel modelo;
    Persona listaPersonas[];
    
    
    public void edit(String posicion, String documentoe, String nombrese, String apellidose, String telefonoe, String correoe){
        
        
        
        int posicionr = Integer.parseInt(posicion);
        String documentor = documentoe;
        String nombrer = nombrese;
        String apellidor = apellidose;
        String telefonor = telefonoe;
        String correor = correoe;
        
        for (int i = 0; listaPersonas[i]!=null; i++){
            
            if (listaPersonas[i].documento.equals(documentoe) ){

                listaPersonas[i].nombres = nombrer;
                listaPersonas[i].apellidos = apellidor;
                listaPersonas[i].telefono = telefonor;
                listaPersonas[i].correo = correor;
                
                modelo.setValueAt(documentor, posicionr, 0);
                modelo.setValueAt(nombrer, posicionr, 1);
                modelo.setValueAt(apellidor, posicionr, 2);
                modelo.setValueAt(telefonor, posicionr, 3);
                modelo.setValueAt(documentor, posicionr, 4);
            }
        }
    }
    
    public TablaBasica() {
        initComponents();
        listaPersonas = new Persona[100];
        listaPersonas[0] = new Persona("123213", "Oscar", "Loaiza", "333333", "Oscar@mail.com");
        listaPersonas[1] = new Persona("122132", "Camilo", "Bedoya", "3345656", "Camilo@mail.com");
        listaPersonas[2] = new Persona("097896", "Esteban", "Espinoza", "334244", "Esteban@mail.com");
        listaPersonas[3] = new Persona("653813", "Isabella", "Zapata", "365446", "Isabella@mail.com");
        listaPersonas[4] = new Persona("142345", "Sebastian", "Rios", "356785", "Sebastian@mail.com");
        initAlernComponents();
    }   
    
    
    
    public void initAlernComponents(){
        setVisible(true);
        setSize( 700, 700 );
        setLocationRelativeTo(null);
        
        modelo =  (DefaultTableModel) this.TablaDatos.getModel();
        this.TablaDatos.getColumn("Editar").setCellRenderer(new ButtonRenderer());
        this.TablaDatos.getColumn("Editar").setCellEditor(new Buttoneditor(new JCheckBox()));
        
        modelo =  (DefaultTableModel) this.TablaDatos.getModel();
        this.TablaDatos.getColumn("Eliminar").setCellRenderer(new ButtonRenderer());
        this.TablaDatos.getColumn("Eliminar").setCellEditor(new Buttoneditor(new JCheckBox()));
        
        modelo = (DefaultTableModel) TablaDatos.getModel();
        Imprimir_personas();
    }
    
    public void Imprimir_personas(){
        int indice = 0;
        modelo.setNumRows(0);
        for (int i = 0; listaPersonas[i]!=null; i++){
            
            String documento = listaPersonas[i].getDocumento();
            String nombres = listaPersonas[i].getNombres();
            String apellidos = listaPersonas[i].getApellidos();
            String telefono = listaPersonas[i].getTelefono();
            String correo = listaPersonas[i].getCorreo();
            JButton btnEdit = new JButton("Editar");
            JButton btnDelete = new JButton("Eliminar");
            
            btnEdit.setBackground(Color.BLUE);
            btnEdit.setForeground(Color.WHITE);
            
            btnDelete.setBackground(Color.RED);
            btnDelete.setForeground(Color.WHITE);
            
            int posicion = i;
            indice = i;
            btnEdit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    VentaEditar ventana = new VentaEditar(posicion, documento, nombres, apellidos, telefono, correo);
                    setVisible(false);
                }
            });
            
            int posicion2 = i;
            btnDelete.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    modelo.removeRow(posicion2);
                }
            });
            
            Object data[] = new Object[]{documento, nombres, apellidos, telefono, correo, btnEdit, btnDelete};
            modelo.addRow(data);
            
        }
    }
    
    public void accionClickBoton(Persona temp){
        System.out.println("\n\n----------------------------------------");
        System.out.println("     Cedula: "+temp.getDocumento());
        System.out.println("     Nombres: "+temp.getNombres());
        System.out.println("     Apellidos: "+temp.getApellidos());
        System.out.println("     Telefono: "+temp.getTelefono());
        System.out.println("     Email: "+temp.getCorreo());
        System.out.println("----------------------------------------");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        etqDocumento = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        etqNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etqApellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etqCorreo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        agregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        etqTitulo.setBackground(new java.awt.Color(0, 0, 0));
        etqTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("Tabla Básica");
        etqTitulo.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        TablaDatos.setBackground(new java.awt.Color(0, 0, 0));
        TablaDatos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TablaDatos.setForeground(new java.awt.Color(255, 255, 255));
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Teléfono", "Correo Electronico", "Editar", "Eliminar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDatos.setOpaque(false);
        jScrollPane1.setViewportView(TablaDatos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        etqDocumento.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        etqDocumento.setForeground(new java.awt.Color(0, 0, 0));
        etqDocumento.setText("Documento:");

        campoDocumento.setBackground(new java.awt.Color(255, 255, 255));
        campoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDocumentoActionPerformed(evt);
            }
        });

        etqNombre.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        etqNombre.setForeground(new java.awt.Color(0, 0, 0));
        etqNombre.setText("Nombres:");

        campoNombre.setBackground(new java.awt.Color(255, 255, 255));
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreActionPerformed(evt);
            }
        });

        etqApellidos.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        etqApellidos.setForeground(new java.awt.Color(0, 0, 0));
        etqApellidos.setText("Apellidos:");

        campoApellidos.setBackground(new java.awt.Color(255, 255, 255));
        campoApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoApellidosActionPerformed(evt);
            }
        });

        etqTelefono.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        etqTelefono.setForeground(new java.awt.Color(0, 0, 0));
        etqTelefono.setText("Telefono:");

        campoTelefono.setBackground(new java.awt.Color(255, 255, 255));
        campoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefonoActionPerformed(evt);
            }
        });

        etqCorreo.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        etqCorreo.setForeground(new java.awt.Color(0, 0, 0));
        etqCorreo.setText("Correo electronico");

        campoCorreo.setBackground(new java.awt.Color(255, 255, 255));
        campoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCorreoActionPerformed(evt);
            }
        });

        agregar.setBackground(new java.awt.Color(0, 0, 255));
        agregar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        agregar.setForeground(new java.awt.Color(255, 255, 255));
        agregar.setText("AGREGAR");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etqDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(campoTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)))
                        .addComponent(etqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqDocumento)
                    .addComponent(etqNombre)
                    .addComponent(etqApellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTelefono)
                    .addComponent(etqCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDocumentoActionPerformed

    private void campoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreActionPerformed

    private void campoApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoApellidosActionPerformed

    private void campoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefonoActionPerformed

    private void campoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCorreoActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed

        String documento = campoDocumento.getText();
        String nombres = campoNombre.getText();
        String apellidos = campoApellidos.getText();
        String telefono = campoTelefono.getText();
        String correo = campoCorreo.getText();
        
        int autenticado = 0;
        int s = 0;
        
        for (int e = 0; listaPersonas[e]!= null; e++){
            
            if(documento.equals(listaPersonas[e].documento) || correo.equals(listaPersonas[e].correo)){

                AlertaUsuarioRepetido ventanaAlerta = new AlertaUsuarioRepetido(listaPersonas[e].documento, listaPersonas[e].correo);
                autenticado = 1;
                break;
            }else{
                autenticado = 2;
            }
        }
                
                
        if (autenticado == 2){    

            for (int i = 0; listaPersonas[i]!=null; i++){


                s = i;

                String faltante = "";

                if (documento.equals("")){
                    faltante += "Documento";
                }
                if (nombres.equals("")){
                    faltante += " Nombre";
                }
                if (apellidos.equals("")){
                    faltante += " Apellidos";
                }
                if (telefono.equals("")){
                    faltante += " Teléfono";
                }
                if (correo.equals("")){
                    faltante += " Correo";
                }

                if (documento.equals("") || nombres.equals("") || apellidos.equals("") || telefono.equals("") || correo.equals("")){

                    Alerta ventana_alerta = new Alerta(faltante);


                }else{

                    listaPersonas[s] = new Persona(documento, nombres, apellidos, telefono, correo);

                    campoDocumento.setText("");
                    campoNombre.setText("");
                    campoApellidos.setText("");
                    campoTelefono.setText("");
                    campoCorreo.setText("");
                    campoDocumento.requestFocus();
                    JButton btnEdit = new JButton("Editar");
                    JButton btnDelete = new JButton("Eliminar");

                    btnEdit.setBackground(Color.BLUE);
                    btnEdit.setForeground(Color.WHITE);

                    btnDelete.setBackground(Color.RED);
                    btnDelete.setForeground(Color.WHITE);

                    final int posicion = s;
                    int indice = s;
                    btnEdit.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            VentaEditar ventana = new VentaEditar(posicion, documento, nombres, apellidos, telefono, correo);
                            setVisible(false);
                        }
                    });

                    final int posicion2 = s;
                    btnDelete.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            modelo.removeRow(posicion2);
                        }
                    });
                    Object data[] = new Object[]{documento, nombres, apellidos, telefono, correo, btnEdit, btnDelete};
                    modelo.addRow(data);
                }
            }
        }                        
    }//GEN-LAST:event_agregarActionPerformed
    
   
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton agregar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqDocumento;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
