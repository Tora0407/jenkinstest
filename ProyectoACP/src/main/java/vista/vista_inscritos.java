package vista;

import controlador.C_Inscritos;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;

public class vista_inscritos extends javax.swing.JFrame {

    C_Inscritos obj = new C_Inscritos();
    
    public vista_inscritos() {
        initComponents();
        llenar();
        setLocationRelativeTo(null);
        
    }
    
    private void llenar() {
        DefaultTableModel dt = (DefaultTableModel)tabla1.getModel();
        dt.setRowCount(0);
        for (Inscripciones x : obj.lisesp()){
            Object v[]={x.getNum_auto(),x.getPiloto(),x.getCopiloto()};
            dt.addRow(v);
        }
        cbPiloto.removeAllItems();
        cbCopiloto.removeAllItems();
        cbPiloto.addItem("---SELECCIONAR---");
        cbCopiloto.addItem("---SELECCIONAR---");
        
        for (Participantes x : obj.participantes()){
            boolean ver = true;
            for (Inscripciones i : obj.lisesp()){
                if (i.getCodp().equals(x.getCod())|| i.getCodcop().equals(x.getCod())){
                    ver=false;
                }
            }
            if(ver){
                cbPiloto.addItem(x.getNombre());
                cbCopiloto.addItem(x.getNombre());
            }
            
        }
        
        
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtauto = new javax.swing.JTextField();
        cbPiloto = new javax.swing.JComboBox<>();
        cbCopiloto = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Num_auto", "Piloto", "Copiloto"
            }
        ));
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LISTA DE INSCRITOS");

        jLabel2.setText("NUMERO DE AUTO");

        jLabel3.setText("PILOTO");

        jLabel4.setText("COPILOTO");

        cbPiloto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbCopiloto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtauto)
                            .addComponent(cbPiloto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbCopiloto, 0, 121, Short.MAX_VALUE))
                        .addGap(94, 94, 94)
                        .addComponent(btnAgregar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(141, 141, 141))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtauto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbPiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnAgregar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbCopiloto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        
        try {
            int indice = tabla1.getSelectedRow();
            int valor = Integer.parseInt(tabla1.getValueAt(indice,0).toString());
            System.out.println(valor);
            Auto a = obj.verauto(valor);
            JOptionPane.showMessageDialog(null,"El modelo es: "+a.getModelo()+"\nSu categoría: "+a.getCategoria());
                                    
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_tabla1MouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(!txtauto.getText().isEmpty()){
            if(cbPiloto.getSelectedIndex()!=0 && cbCopiloto.getSelectedIndex()!=0){
                if(!esNumero(txtauto.getText())){
                    JOptionPane.showMessageDialog(null, "Debe ser números, no caracteres");
                    return;
                }
                int numauto = Integer.parseInt(txtauto.getText());
                if(obj.verificador(numauto)==-1){
                     JOptionPane.showMessageDialog(null, "Error - El auto no existe en la base de datos");
                    return;
                }
                
                
                if (cbPiloto.getSelectedIndex() == cbCopiloto.getSelectedIndex()){
                    JOptionPane.showMessageDialog(null, "Error - Debe ser diferente el piloto y copiloto");
                    return;
                }
                
                String p1 = cbPiloto.getSelectedItem().toString();
                String p2 = cbCopiloto.getSelectedItem().toString();
                        
                String piloto = "";
                String copiloto = "";
                
                    
                for (Participantes x : obj.participantes()){
                    if(x.getNombre().equals(p1)){
                        if(x.getLicencia().isEmpty()||x.getLicencia()==null){
                           JOptionPane.showMessageDialog(null, "Error - El piloto debe tener licencia");
                           return; 
                        }
                        piloto = x.getCod();
                    }
                    else if(x.getNombre().equals(p2)){
                        copiloto = x.getCod();
                    }
                }
                
                for (Inscripciones x : obj.lisesp()){
                    if (x.getNum_auto() == numauto){
                        JOptionPane.showMessageDialog(null, "Error - Vehículo ya registrado");
                        return;
                    }
                }
                
                int conf = JOptionPane.showConfirmDialog(null, "Los datos a ingresar son:\nNúmero de auto: "+numauto+"\n"
                        + "Piloto: "+p1+"\nCopiloto: "+p2);
                
                if (conf==0){
                    Inscripciones i = new Inscripciones(numauto, piloto, copiloto);
                    obj.agregar(i);
                    llenar();
                    JOptionPane.showMessageDialog(null, "Inscripcion validada");
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se validó la inscripción");
                }
                llenar();
                limpiar();
                
                
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Seleccione piloto y colipoto correspondiente");
            }
        }
        else{
             JOptionPane.showMessageDialog(null, "Ingrese un número de auto");           
        }
    }//GEN-LAST:event_btnAgregarActionPerformed
    
     public static boolean esNumero(String str) {
        Pattern patron = Pattern.compile("\\d+");
        return patron.matcher(str).matches();
    }
     
      private void limpiar() {
          txtauto.setText("");
          cbPiloto.setSelectedIndex(0);
          cbCopiloto.setSelectedIndex(0);
    }


    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista_inscritos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cbCopiloto;
    private javax.swing.JComboBox<String> cbPiloto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtauto;
    // End of variables declaration//GEN-END:variables

   
    
}
