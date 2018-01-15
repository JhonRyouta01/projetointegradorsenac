package telaPrincipal;

import cadastrodeGenero.JFrameCadastrodeGenero;
import teladeCadastro.JFrameCadastro;
import teladecadastrodeLivro.JFramecadastrodeLivro;
import CadastrodeAutor.JFramecadastrodeAutor;
import java.util.*;
import pesquisadeCliente.JFramepesquisadeCliente;
import pesquisadeLivro.JFramepesquisadeLivro;
import livros.*;
import Generos.*;
import Cliente.*;




public class JFrametelaPrincipal extends javax.swing.JFrame {

    public JFrametelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCadastro = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuClientes = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuEmprestimo = new javax.swing.JMenu();
        jMenuItemnovoEmprestimo = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuLivro = new javax.swing.JMenu();
        jMenuItemnovoLivro = new javax.swing.JMenuItem();
        jMenuItemcadastrodegenero = new javax.swing.JMenuItem();
        jMenuItemcadastrodeAutor = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItempesquisadecliente = new javax.swing.JMenuItem();
        jMenuItempesquisadelivros = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconis/Customer-service-icon.png"))); // NOI18N

        jMenu1.setText("Cadastro");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItemCadastro.setText("Cadastro");
        jMenuItemCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemCadastroMouseClicked(evt);
            }
        });
        jMenuItemCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCadastro);
        jMenu1.add(jSeparator1);

        jMenuClientes.setText("Clientes");
        jMenuClientes.add(jSeparator2);

        jMenuEmprestimo.setText("Emprestimo");

        jMenuItemnovoEmprestimo.setText("Novo");
        jMenuEmprestimo.add(jMenuItemnovoEmprestimo);

        jMenuClientes.add(jMenuEmprestimo);

        jMenu1.add(jMenuClientes);
        jMenu1.add(jSeparator3);

        jMenuLivro.setText("Livro");

        jMenuItemnovoLivro.setText("novo");
        jMenuItemnovoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemnovoLivroActionPerformed(evt);
            }
        });
        jMenuLivro.add(jMenuItemnovoLivro);

        jMenuItemcadastrodegenero.setText("cadastro de género");
        jMenuItemcadastrodegenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemcadastrodegeneroActionPerformed(evt);
            }
        });
        jMenuLivro.add(jMenuItemcadastrodegenero);

        jMenuItemcadastrodeAutor.setText("cadastro de Autor");
        jMenuItemcadastrodeAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemcadastrodeAutorActionPerformed(evt);
            }
        });
        jMenuLivro.add(jMenuItemcadastrodeAutor);

        jMenu1.add(jMenuLivro);
        jMenu1.add(jSeparator4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("pesquisa");

        jMenu3.setText("pesquisa");

        jMenuItempesquisadecliente.setText("Cliente");
        jMenuItempesquisadecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItempesquisadeclienteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItempesquisadecliente);

        jMenuItempesquisadelivros.setText("Livros");
        jMenuItempesquisadelivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItempesquisadelivrosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItempesquisadelivros);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastroActionPerformed
        new JFrameCadastro();

    }//GEN-LAST:event_jMenuItemCadastroActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed


    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItemCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemCadastroMouseClicked


    }//GEN-LAST:event_jMenuItemCadastroMouseClicked

    private void jMenuItemnovoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemnovoLivroActionPerformed
        new JFramecadastrodeLivro();


    }//GEN-LAST:event_jMenuItemnovoLivroActionPerformed

    private void jMenuItemcadastrodegeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemcadastrodegeneroActionPerformed
        new JFrameCadastrodeGenero();


    }//GEN-LAST:event_jMenuItemcadastrodegeneroActionPerformed

    private void jMenuItemcadastrodeAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemcadastrodeAutorActionPerformed
        new JFramecadastrodeAutor();
        
        
        
    }//GEN-LAST:event_jMenuItemcadastrodeAutorActionPerformed

    private void jMenuItempesquisadeclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItempesquisadeclienteActionPerformed
       new JFramepesquisadeCliente();

    }//GEN-LAST:event_jMenuItempesquisadeclienteActionPerformed

    private void jMenuItempesquisadelivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItempesquisadelivrosActionPerformed
        new JFramepesquisadeLivro();
        
    }//GEN-LAST:event_jMenuItempesquisadelivrosActionPerformed
    public static List<Livro> listadeLivros = new ArrayList();
    public static List<Cliente> listadeClientes = new ArrayList();
    public static List<Generos> listadeGenero = new ArrayList();
    public static List<Autor> listadeAutor = new ArrayList();
    
    public static void adicionarLivro(Livro livro){
        listadeLivros.add(livro);
    }
    public static void removerLivro(Livro livro){
        listadeLivros.remove(livro);
    }
    public static void removerIndLivro(int indice){
        listadeLivros.size();
    }
    public static void adicionarGenero(Generos genero){
        listadeGenero.add(genero);
    }
    public static void removerGenero(Generos genero){
        listadeGenero.remove(genero);
    }
    public static void removerIndgenero(int indice){
        listadeGenero.size();
    }
    public static void adicionarCliente(Cliente cliente){
        listadeClientes.add(cliente);
    }
    public static void removerCliente(Cliente cliente){
        listadeClientes.remove(cliente);
    }
    public static void removerIndCliente(int indice){
        listadeClientes.size();
    }
    public void adicionarAutor(Autor autor){
        listadeAutor.add(autor);
    }
    public void removerAutor(Autor autor){ 
        listadeAutor.remove(autor);
    }
    public void removerIndAutor(int indice){
        listadeAutor.size();
    }
    public static List<Livro> getListadeLivros() {
        return listadeLivros;
    }

    public static void setListadeLivros(List<Livro> listadeLivros) {
        JFrametelaPrincipal.listadeLivros = listadeLivros;
    }

    public static List<Cliente> getListadeClientes() {
        return listadeClientes;
    }

    public static void setListadeClientes(List<Cliente> listadeClientes) {
        JFrametelaPrincipal.listadeClientes = listadeClientes;
    }

    public static List<Generos> getListadeGenero() {
        return listadeGenero;
    }

    public static void setListadeGenero(List<Generos> listadeGenero) {
        JFrametelaPrincipal.listadeGenero = listadeGenero;
    }

    public static List<Autor> getListadeAutor() {
        return listadeAutor;
    }

    public static void setListadeAutor(List<Autor> listadeAutor) {
        JFrametelaPrincipal.listadeAutor = listadeAutor;
    }
    
    
    
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
            java.util.logging.Logger.getLogger(JFrametelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrametelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrametelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrametelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrametelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuEmprestimo;
    private javax.swing.JMenuItem jMenuItemCadastro;
    private javax.swing.JMenuItem jMenuItemcadastrodeAutor;
    private javax.swing.JMenuItem jMenuItemcadastrodegenero;
    private javax.swing.JMenuItem jMenuItemnovoEmprestimo;
    private javax.swing.JMenuItem jMenuItemnovoLivro;
    private javax.swing.JMenuItem jMenuItempesquisadecliente;
    private javax.swing.JMenuItem jMenuItempesquisadelivros;
    private javax.swing.JMenu jMenuLivro;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
