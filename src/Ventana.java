
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class Ventana extends javax.swing.JFrame {

   public DefaultListModel<String> modeloListaTienda=new DefaultListModel<>(); //variable creada
   public DefaultListModel<String> modeloListaComprados=new DefaultListModel<>(); //variable creada

   public Ventana() {
        initComponents();
 
       //modeloListaTienda= new DefaultListModel(); //crear lista compra
        
        modeloListaTienda.addElement("Samsung Galaxy S22 5G 8GB/256GB ");
        modeloListaTienda.addElement("Oppo A17 4GB/64GB");
        modeloListaTienda.addElement("Realme C31 4GB/64GB Plata");
        modeloListaTienda.addElement("Samsung Galaxy A53 5G 8GB/256GB");
        modeloListaTienda.addElement("Honor Magic5 Lite 5G 6GB/128GB Negro");
        modeloListaTienda.addElement("Apple iPhone 14 Plus 256GB Negro");
        modeloListaTienda.addElement("Xiaomi Redmi Note 11 4/128GB Gris");
        modeloListaTienda.addElement("Apple iPhone 14 Pro Max 128GB Oro");
        modeloListaTienda.addElement("Apple iPhone 14 Pro Max 128GB Negro");
        modeloListaTienda.addElement("Apple iPhone 13 128GB Oro");
        
        lLista1.setModel(modeloListaTienda);
           
       //modeloListaComprados= new DefaultListModel();
        
        lLista2.setModel(modeloListaComprados); 

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpPanelPrincipal = new javax.swing.JTabbedPane();
        pHola = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lLista2 = new javax.swing.JList<>();
        bBorrar = new javax.swing.JButton();
        bAniadir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lLista1 = new javax.swing.JList<>();
        bEliminarSeleccion = new javax.swing.JButton();
        bPedido = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pAdios = new javax.swing.JPanel();
        bConfirmarPedido = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tListaCompra = new javax.swing.JTextArea();
        lTitulo = new javax.swing.JLabel();
        lCarritoImagen = new javax.swing.JLabel();
        lImagen = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mHelp = new javax.swing.JMenu();
        mSalir = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tpPanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        pHola.setBackground(new java.awt.Color(29, 29, 27));
        pHola.setForeground(new java.awt.Color(29, 29, 27));
        pHola.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Añada productos a la lista para su compra:");

        jScrollPane1.setViewportView(lLista2);

        bBorrar.setBackground(new java.awt.Color(0, 102, 153));
        bBorrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bBorrar.setForeground(new java.awt.Color(255, 255, 255));
        bBorrar.setText("Eliminar TODOS los productos");
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        bAniadir.setBackground(new java.awt.Color(0, 102, 153));
        bAniadir.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        bAniadir.setForeground(new java.awt.Color(255, 255, 255));
        bAniadir.setText("Añadir");
        bAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAniadirActionPerformed(evt);
            }
        });

        lLista1.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                lLista1HierarchyChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lLista1);

        bEliminarSeleccion.setBackground(new java.awt.Color(0, 102, 153));
        bEliminarSeleccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bEliminarSeleccion.setForeground(new java.awt.Color(255, 255, 255));
        bEliminarSeleccion.setText("Eliminar solo productos seleccionados");
        bEliminarSeleccion.setToolTipText("");
        bEliminarSeleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarSeleccionActionPerformed(evt);
            }
        });

        bPedido.setBackground(new java.awt.Color(0, 102, 153));
        bPedido.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bPedido.setForeground(new java.awt.Color(255, 255, 255));
        bPedido.setText("Hacer pedido");
        bPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPedidoActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoTienda.jpg"))); // NOI18N

        javax.swing.GroupLayout pHolaLayout = new javax.swing.GroupLayout(pHola);
        pHola.setLayout(pHolaLayout);
        pHolaLayout.setHorizontalGroup(
            pHolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHolaLayout.createSequentialGroup()
                .addGroup(pHolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pHolaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGroup(pHolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pHolaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bEliminarSeleccion))
                            .addGroup(pHolaLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(bBorrar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pHolaLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bPedido)
                                .addGap(58, 58, 58))))
                    .addGroup(pHolaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(pHolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pHolaLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(bAniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pHolaLayout.setVerticalGroup(
            pHolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pHolaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(pHolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pHolaLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(pHolaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(bPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bEliminarSeleccion)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(pHolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pHolaLayout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addGroup(pHolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addGap(44, 44, 44))
                    .addGroup(pHolaLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(bAniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tpPanelPrincipal.addTab("Hola!", pHola);

        pAdios.setBackground(new java.awt.Color(29, 29, 27));

        bConfirmarPedido.setBackground(new java.awt.Color(0, 102, 153));
        bConfirmarPedido.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        bConfirmarPedido.setForeground(new java.awt.Color(255, 255, 255));
        bConfirmarPedido.setText("Realizar pedido");
        bConfirmarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bConfirmarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfirmarPedidoActionPerformed(evt);
            }
        });

        tListaCompra.setColumns(20);
        tListaCompra.setRows(5);
        tListaCompra.setText("                            Lista de productos añadidos:  \n");
        tListaCompra.setToolTipText("");
        tListaCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jScrollPane3.setViewportView(tListaCompra);

        lTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lTitulo.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lTitulo.setText("¡Su carrito está listo para la compra!");

        lCarritoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3523887.png"))); // NOI18N
        lCarritoImagen.setText("jLabel5");
        lCarritoImagen.setToolTipText("");

        lImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3493767.png"))); // NOI18N
        lImagen.setText("jLabel6");

        javax.swing.GroupLayout pAdiosLayout = new javax.swing.GroupLayout(pAdios);
        pAdios.setLayout(pAdiosLayout);
        pAdiosLayout.setHorizontalGroup(
            pAdiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdiosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lCarritoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(pAdiosLayout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(pAdiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdiosLayout.createSequentialGroup()
                        .addComponent(bConfirmarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(401, 401, 401))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdiosLayout.createSequentialGroup()
                        .addComponent(lImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(315, 315, 315))))
        );
        pAdiosLayout.setVerticalGroup(
            pAdiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdiosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pAdiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCarritoImagen)
                    .addComponent(lTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pAdiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pAdiosLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bConfirmarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                    .addGroup(pAdiosLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
        );

        tpPanelPrincipal.addTab("Adios!", pAdios);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        mHelp.setText("Salir");

        mSalir.setSelected(true);
        mSalir.setText("Salir");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        mHelp.add(mSalir);

        jMenuBar1.add(mHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpPanelPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(tpPanelPrincipal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        modeloListaComprados.clear();
    }//GEN-LAST:event_bBorrarActionPerformed

    private void bAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAniadirActionPerformed
        
        
           List seleccion = lLista1.getSelectedValuesList(); 
           modeloListaComprados.addAll(seleccion);
           
            for( int i=0 ; i<=modeloListaTienda.getSize(); i++)
                {
         
             System.out.print(i);  
    }//GEN-LAST:event_bAniadirActionPerformed
      }
    
    
    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        System.exit(0); //para salir al pulsar ne el boton
    }//GEN-LAST:event_mSalirActionPerformed

    private void bEliminarSeleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarSeleccionActionPerformed
        int lista = lLista2.getSelectedIndex();
        modeloListaComprados.remove(lista);
    }//GEN-LAST:event_bEliminarSeleccionActionPerformed

    private void bPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPedidoActionPerformed
                    
        tpPanelPrincipal.setSelectedIndex(1);
        
         List seleccion = lLista2.getSelectedValuesList(); 
         
           modeloListaComprados.addAll(seleccion);
           
        
        for( int i=0 ; i<modeloListaComprados.getSize() ; i++){
    
            String t= modeloListaComprados.getElementAt(i);
            String textoGuardado= tListaCompra.getText();
        
                tListaCompra.setText(textoGuardado+"\n"+t);
       
        }
        
       
    }//GEN-LAST:event_bPedidoActionPerformed

    private void lLista1HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_lLista1HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lLista1HierarchyChanged

    private void bConfirmarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfirmarPedidoActionPerformed
        int i= JOptionPane.showConfirmDialog(this, "Pedido confirmado\nPulse Yes para confirmar el pago");
       
            if (i==0){
                JOptionPane.showMessageDialog(this, "Gracias por confiar en nosotros.\nEn breve recibira un correo electónico con la confirmación.");
                    }
            if (i==1){
                 //JOptionPane.showMessageDialog(this, "Pedido cancelado.\nNecesita realizar el pago para continuar con el pedido.");
                   JOptionPane.showMessageDialog(this, "Pedido cancelado.\nNecesita realizar el pago para continuar con el pedido.",  "Error", JOptionPane.ERROR_MESSAGE);

            }
    }//GEN-LAST:event_bConfirmarPedidoActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ventana().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAniadir;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bConfirmarPedido;
    private javax.swing.JButton bEliminarSeleccion;
    private javax.swing.JButton bPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lCarritoImagen;
    private javax.swing.JLabel lImagen;
    private javax.swing.JList<String> lLista1;
    public javax.swing.JList<String> lLista2;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JMenu mHelp;
    private javax.swing.JCheckBoxMenuItem mSalir;
    private javax.swing.JPanel pAdios;
    private javax.swing.JPanel pHola;
    private javax.swing.JTextArea tListaCompra;
    private javax.swing.JTabbedPane tpPanelPrincipal;
    // End of variables declaration//GEN-END:variables

    
}
