package vista;
//librerias

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MantenimientoCRUD extends javax.swing.JFrame {

    // //variables de conexion
    public Connection cn;
    public Statement stmt;
    public ResultSet rs;

    public MantenimientoCRUD() {
        initComponents();
    }

    //metodo conectar
    public void conectarbase() {//inicia metodo conectar
        try {//inicia try
            //puente de conexion
            Class.forName("com.mysql.jdbc.Driver");//puente de conexion
            cn = DriverManager.getConnection("jdbc:mysql://localhost/bdacrescenciot", "acrescenciotbd", "unitec123");
            JOptionPane.showMessageDialog(null, "CONEXI�N BD ESTABLECIDA");
            stmt = cn.createStatement();//genera sentencias sql
        } catch (SQLException ex) {//inicia exeption

        } catch (Exception e) {//inica exception errores generales

        }
    }//termina metodo conectar

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblMantenimiento = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        lblIdUsuario = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblConsulta = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        jsConsulta = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        jpBaja = new javax.swing.JPanel();
        lblBajaUsuarios = new javax.swing.JLabel();
        txtUsuarioBaja = new javax.swing.JTextField();
        btnBorrar = new javax.swing.JButton();
        jpModificar = new javax.swing.JPanel();
        lblModificar = new javax.swing.JLabel();
        btnBusqueda = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        lblModificarId = new javax.swing.JLabel();
        lblModificarUsuario = new javax.swing.JLabel();
        txtIdUsuarioMod = new javax.swing.JTextField();
        txtUsuarioMod = new javax.swing.JTextField();
        txtPasswordMod = new javax.swing.JTextField();
        lblModificarPassword = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Sistema De Gestion de Usuarios");

        lblMantenimiento.setText("Sistema de Getion de Usuarios");

        btnNuevo.setText("Nuevo Registro");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        lblIdUsuario.setText("ID Usuario: ");

        lblUsuario.setText("Usuario: ");

        lblPassword.setText("Password");

        lblConsulta.setText("Consulta");

        btnActualizar.setText("Actualizar Datos");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jsConsulta.setViewportView(jtConsulta);

        jpBaja.setBackground(new java.awt.Color(255, 0, 0));

        lblBajaUsuarios.setText("Baja de Usuarios. Captura ID USUARIO");

        btnBorrar.setText("Borrar Usuario");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBajaLayout = new javax.swing.GroupLayout(jpBaja);
        jpBaja.setLayout(jpBajaLayout);
        jpBajaLayout.setHorizontalGroup(
            jpBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBajaLayout.createSequentialGroup()
                .addGroup(jpBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBajaLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblBajaUsuarios))
                    .addGroup(jpBajaLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jpBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrar)
                            .addGroup(jpBajaLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(txtUsuarioBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jpBajaLayout.setVerticalGroup(
            jpBajaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBajaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBajaUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuarioBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnBorrar)
                .addContainerGap())
        );

        jpModificar.setBackground(new java.awt.Color(255, 255, 0));

        lblModificar.setForeground(new java.awt.Color(0, 0, 0));
        lblModificar.setText("Modificar Usuario");

        btnBusqueda.setText("Busqueda Usuario por Id");
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        lblModificarId.setForeground(new java.awt.Color(0, 0, 0));
        lblModificarId.setText("Id Usuario Mod: ");

        lblModificarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblModificarUsuario.setText("Usuario Mod:");

        lblModificarPassword.setForeground(new java.awt.Color(0, 0, 0));
        lblModificarPassword.setText("Password Mod: ");

        javax.swing.GroupLayout jpModificarLayout = new javax.swing.GroupLayout(jpModificar);
        jpModificar.setLayout(jpModificarLayout);
        jpModificarLayout.setHorizontalGroup(
            jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addComponent(lblModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUsuarioMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addComponent(lblModificarId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdUsuarioMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addComponent(lblModificarPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPasswordMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpModificarLayout.createSequentialGroup()
                        .addComponent(btnBusqueda)
                        .addGap(93, 93, 93)
                        .addComponent(btnModificar)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpModificarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        jpModificarLayout.setVerticalGroup(
            jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblModificar)
                .addGap(17, 17, 17)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModificarId)
                    .addComponent(txtIdUsuarioMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModificarUsuario)
                    .addComponent(txtUsuarioMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModificarPassword)
                    .addComponent(txtPasswordMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jpModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBusqueda)
                    .addComponent(btnModificar))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblIdUsuario)
                        .addGap(45, 45, 45)
                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jsConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblConsulta)
                .addGap(130, 130, 130))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jpModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(lblMantenimiento)))
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMantenimiento)
                .addGap(3, 3, 3)
                .addComponent(lblConsulta)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIdUsuario)
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jsConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        //alta                                       
        String altaRegistro = "";
        try {
            conectarbase();
            int idUsuario = Integer.parseInt(this.txtIdUsuario.getText());
            String usuario = this.txtUsuario.getText();
            String pass = this.txtPassword.getText();

            altaRegistro = "INSERT INTO USUARIOS VALUES ('" + idUsuario + "','" + usuario + "','" + pass + "')";
            stmt.executeUpdate(altaRegistro);
            JOptionPane.showMessageDialog(null, "Se inserto el registro de forma exitosa\n"
                    + "\nId Usuario : " + idUsuario
                    + "\nUsuario : " + usuario);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 1 de BD!!!!\n" + ex);
        }


    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        //consultas
        try {
            conectarbase();
            DefaultTableModel modeloDatos = new DefaultTableModel();
            this.jtConsulta.setModel(modeloDatos);
            rs = stmt.executeQuery("select * from usuarios");
            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadColumnas = rsmd.getColumnCount();
            modeloDatos.addColumn("Id Usuario");
            modeloDatos.addColumn("Usuario");
            modeloDatos.addColumn("Password");
            while (rs.next()) {//inicia while
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modeloDatos.addRow(fila);
            }//termina while

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 3 de BD!!!!\n" + ex);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        //Baja
        try {
            int confir;
            conectarbase();
            String bajaUsuario = this.txtUsuarioBaja.getText();
            confir = stmt.executeUpdate("delete from USUARIOS where idusuarios = '" + bajaUsuario + "'");
            if (confir == 1) {
                JOptionPane.showMessageDialog(null, "Se dio de baja el ID usuario:" + bajaUsuario);
            } else {
                JOptionPane.showMessageDialog(null, "Error No existe ese Id de suario");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 3:\n" + ex);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
        //Busqueda 
        try {
            conectarbase();
            int idUsuarioMod = Integer.parseInt(this.txtIdUsuarioMod.getText());
            rs = stmt.executeQuery("select * from usuarios where idusuarios='" + idUsuarioMod + "'");
            JOptionPane.showMessageDialog(null, "Buscando usuario ... ");
            if (rs.next() == true) {
                this.txtUsuarioMod.setText(rs.getString("usuario"));
                this.txtPasswordMod.setText(rs.getString("password"));
            } else {
                JOptionPane.showMessageDialog(null, "Id Usuario \nInexistente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 4 de BD!!!!\n" + ex);
        }
    }//GEN-LAST:event_btnBusquedaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //Modificar
        String sql = "";
        try {
            conectarbase();
            int idUsuario = Integer.parseInt(this.txtIdUsuarioMod.getText());
            String usuario = this.txtUsuarioMod.getText();
            String pass = this.txtPasswordMod.getText();
            sql = "update USUARIOS set usuario = '" + usuario + "', password = '" + pass + "' where idusuarios = '" + idUsuario + "'";
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Usuario actualizado. Verifica tu consulta");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error 5:\n" + ex);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MantenimientoCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimientoCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel jpBaja;
    private javax.swing.JPanel jpModificar;
    private javax.swing.JScrollPane jsConsulta;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JLabel lblBajaUsuarios;
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JLabel lblIdUsuario;
    private javax.swing.JLabel lblMantenimiento;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblModificarId;
    private javax.swing.JLabel lblModificarPassword;
    private javax.swing.JLabel lblModificarUsuario;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtIdUsuarioMod;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPasswordMod;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtUsuarioBaja;
    private javax.swing.JTextField txtUsuarioMod;
    // End of variables declaration//GEN-END:variables
}
