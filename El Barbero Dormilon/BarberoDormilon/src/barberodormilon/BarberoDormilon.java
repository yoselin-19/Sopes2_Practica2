/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodormilon;

import java.awt.Color;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author annel
 */
public class BarberoDormilon extends javax.swing.JFrame {

    public static int atendidos = 0;
    public static int retirados = 0;
    public ColaSillas<Silla> cola;

    /**
     * Creates new form BarberoDormilon
     */
    public BarberoDormilon() {
        initComponents();
        cola = new ColaSillas<>(20);
        cola.getCola().add(new Silla(jp_1, false));
        cola.getCola().add(new Silla(jp_2, false));
        cola.getCola().add(new Silla(jp_3, false));
        cola.getCola().add(new Silla(jp_4, false));
        cola.getCola().add(new Silla(jp_5, false));
        cola.getCola().add(new Silla(jp_6, false));
        cola.getCola().add(new Silla(jp_7, false));
        cola.getCola().add(new Silla(jp_8, false));
        cola.getCola().add(new Silla(jp_9, false));
        cola.getCola().add(new Silla(jp_10, false));
        cola.getCola().add(new Silla(jp_11, false));
        cola.getCola().add(new Silla(jp_12, false));
        cola.getCola().add(new Silla(jp_13, false));
        cola.getCola().add(new Silla(jp_14, false));
        cola.getCola().add(new Silla(jp_15, false));
        cola.getCola().add(new Silla(jp_16, false));
        cola.getCola().add(new Silla(jp_17, false));
        cola.getCola().add(new Silla(jp_18, false));
        cola.getCola().add(new Silla(jp_19, false));
        cola.getCola().add(new Silla(jp_20, false));
        lbl_retirados.setText("" + retirados);
        lbl_atendidos.setText("" + atendidos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        jp_7 = new javax.swing.JPanel();
        jp_8 = new javax.swing.JPanel();
        jp_9 = new javax.swing.JPanel();
        jp_4 = new javax.swing.JPanel();
        jp_5 = new javax.swing.JPanel();
        jp_6 = new javax.swing.JPanel();
        jp_1 = new javax.swing.JPanel();
        jp_2 = new javax.swing.JPanel();
        jp_3 = new javax.swing.JPanel();
        jp_barbero = new javax.swing.JPanel();
        lbl_barbero = new javax.swing.JLabel();
        lbl_sillas = new javax.swing.JLabel();
        jtf_numero_clientes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_iniciar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_retirados = new javax.swing.JLabel();
        lbl_atendidos = new javax.swing.JLabel();
        jp_10 = new javax.swing.JPanel();
        jp_11 = new javax.swing.JPanel();
        jp_12 = new javax.swing.JPanel();
        jp_13 = new javax.swing.JPanel();
        jp_14 = new javax.swing.JPanel();
        jp_15 = new javax.swing.JPanel();
        jp_16 = new javax.swing.JPanel();
        jp_17 = new javax.swing.JPanel();
        jp_18 = new javax.swing.JPanel();
        jp_19 = new javax.swing.JPanel();
        jp_20 = new javax.swing.JPanel();
        btn_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lbl_titulo.setText("Barbero Dormilon");

        jp_7.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_7Layout = new javax.swing.GroupLayout(jp_7);
        jp_7.setLayout(jp_7Layout);
        jp_7Layout.setHorizontalGroup(
            jp_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_7Layout.setVerticalGroup(
            jp_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_8.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_8Layout = new javax.swing.GroupLayout(jp_8);
        jp_8.setLayout(jp_8Layout);
        jp_8Layout.setHorizontalGroup(
            jp_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_8Layout.setVerticalGroup(
            jp_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_9.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_9Layout = new javax.swing.GroupLayout(jp_9);
        jp_9.setLayout(jp_9Layout);
        jp_9Layout.setHorizontalGroup(
            jp_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_9Layout.setVerticalGroup(
            jp_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_4.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_4Layout = new javax.swing.GroupLayout(jp_4);
        jp_4.setLayout(jp_4Layout);
        jp_4Layout.setHorizontalGroup(
            jp_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_4Layout.setVerticalGroup(
            jp_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_5.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_5Layout = new javax.swing.GroupLayout(jp_5);
        jp_5.setLayout(jp_5Layout);
        jp_5Layout.setHorizontalGroup(
            jp_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_5Layout.setVerticalGroup(
            jp_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_6.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_6Layout = new javax.swing.GroupLayout(jp_6);
        jp_6.setLayout(jp_6Layout);
        jp_6Layout.setHorizontalGroup(
            jp_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_6Layout.setVerticalGroup(
            jp_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_1.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_1Layout = new javax.swing.GroupLayout(jp_1);
        jp_1.setLayout(jp_1Layout);
        jp_1Layout.setHorizontalGroup(
            jp_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_1Layout.setVerticalGroup(
            jp_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_2.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_2Layout = new javax.swing.GroupLayout(jp_2);
        jp_2.setLayout(jp_2Layout);
        jp_2Layout.setHorizontalGroup(
            jp_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_2Layout.setVerticalGroup(
            jp_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_3.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_3Layout = new javax.swing.GroupLayout(jp_3);
        jp_3.setLayout(jp_3Layout);
        jp_3Layout.setHorizontalGroup(
            jp_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_3Layout.setVerticalGroup(
            jp_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_barbero.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jp_barberoLayout = new javax.swing.GroupLayout(jp_barbero);
        jp_barbero.setLayout(jp_barberoLayout);
        jp_barberoLayout.setHorizontalGroup(
            jp_barberoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_barberoLayout.setVerticalGroup(
            jp_barberoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        lbl_barbero.setText("Barbero");

        lbl_sillas.setText("Sillas");

        jLabel4.setText("Numero de clientes");

        btn_iniciar.setBackground(new java.awt.Color(255, 255, 0));
        btn_iniciar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_iniciar.setLabel("Iniciar");
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });

        jLabel5.setText("Clientes atentidos");

        jLabel6.setText("Cliente retirados");

        lbl_retirados.setBackground(new java.awt.Color(51, 51, 51));
        lbl_retirados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_atendidos.setBackground(new java.awt.Color(51, 51, 51));
        lbl_atendidos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jp_10.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_10Layout = new javax.swing.GroupLayout(jp_10);
        jp_10.setLayout(jp_10Layout);
        jp_10Layout.setHorizontalGroup(
            jp_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_10Layout.setVerticalGroup(
            jp_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_11.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_11Layout = new javax.swing.GroupLayout(jp_11);
        jp_11.setLayout(jp_11Layout);
        jp_11Layout.setHorizontalGroup(
            jp_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_11Layout.setVerticalGroup(
            jp_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_12.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_12Layout = new javax.swing.GroupLayout(jp_12);
        jp_12.setLayout(jp_12Layout);
        jp_12Layout.setHorizontalGroup(
            jp_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_12Layout.setVerticalGroup(
            jp_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_13.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_13Layout = new javax.swing.GroupLayout(jp_13);
        jp_13.setLayout(jp_13Layout);
        jp_13Layout.setHorizontalGroup(
            jp_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_13Layout.setVerticalGroup(
            jp_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_14.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_14Layout = new javax.swing.GroupLayout(jp_14);
        jp_14.setLayout(jp_14Layout);
        jp_14Layout.setHorizontalGroup(
            jp_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_14Layout.setVerticalGroup(
            jp_14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_15.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_15Layout = new javax.swing.GroupLayout(jp_15);
        jp_15.setLayout(jp_15Layout);
        jp_15Layout.setHorizontalGroup(
            jp_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_15Layout.setVerticalGroup(
            jp_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_16.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_16Layout = new javax.swing.GroupLayout(jp_16);
        jp_16.setLayout(jp_16Layout);
        jp_16Layout.setHorizontalGroup(
            jp_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_16Layout.setVerticalGroup(
            jp_16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_17.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_17Layout = new javax.swing.GroupLayout(jp_17);
        jp_17.setLayout(jp_17Layout);
        jp_17Layout.setHorizontalGroup(
            jp_17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_17Layout.setVerticalGroup(
            jp_17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_18.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_18Layout = new javax.swing.GroupLayout(jp_18);
        jp_18.setLayout(jp_18Layout);
        jp_18Layout.setHorizontalGroup(
            jp_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_18Layout.setVerticalGroup(
            jp_18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_19.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_19Layout = new javax.swing.GroupLayout(jp_19);
        jp_19.setLayout(jp_19Layout);
        jp_19Layout.setHorizontalGroup(
            jp_19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_19Layout.setVerticalGroup(
            jp_19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jp_20.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jp_20Layout = new javax.swing.GroupLayout(jp_20);
        jp_20.setLayout(jp_20Layout);
        jp_20Layout.setHorizontalGroup(
            jp_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        jp_20Layout.setVerticalGroup(
            jp_20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        btn_clear.setBackground(new java.awt.Color(204, 255, 204));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(lbl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jp_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jp_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jp_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jp_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jp_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jp_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jp_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jp_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_numero_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(25, 25, 25)
                        .addComponent(lbl_retirados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_iniciar)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbl_atendidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_clear)
                                .addGap(15, 15, 15)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jp_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jp_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jp_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jp_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jp_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jp_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jp_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jp_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jp_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jp_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jp_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbl_barbero))
                            .addComponent(jp_barbero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(252, 252, 252))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(lbl_sillas)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lbl_titulo)
                .addGap(31, 31, 31)
                .addComponent(lbl_sillas)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jp_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jp_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jp_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jp_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jp_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jp_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jp_13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jp_8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jp_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jp_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jp_19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jp_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jp_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jp_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jp_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jp_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jp_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jp_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jp_barbero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_iniciar)
                                        .addComponent(btn_clear)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_barbero))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtf_numero_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_atendidos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_retirados, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        // Creando pool de hilos para llegadas concurrentes
        ExecutorService ejecutor = Executors.newCachedThreadPool();
        
        int clientes_entrada = Integer.parseInt(jtf_numero_clientes.getText());
        ejecutor.execute(new HiloBarbero(cola, clientes_entrada));
        ejecutor.execute(new Hilo(cola, clientes_entrada));
        
        ejecutor.shutdown();
    }//GEN-LAST:event_btn_iniciarActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        //Eliminando elementos
        while(this.cola.getContador()>0){
            this.cola.remover();
        }
        
        jtf_numero_clientes.setText("");
        atendidos = 0;
        retirados = 0;
        lbl_atendidos.setText("" + atendidos);
        lbl_retirados.setText("" + retirados);
    }//GEN-LAST:event_btn_clearActionPerformed

//    public static void pintarSillas(Silla silla, boolean tipo) {
//        Color col;
//        if (tipo) {
//            col = Color.red;
//        } else {
//            col = Color.yellow;
//        }
//        silla.setColor(silla.getElemento(), col);
//    }
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
            java.util.logging.Logger.getLogger(BarberoDormilon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarberoDormilon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarberoDormilon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarberoDormilon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarberoDormilon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    public static javax.swing.JPanel jp_1;
    public static javax.swing.JPanel jp_10;
    public static javax.swing.JPanel jp_11;
    public static javax.swing.JPanel jp_12;
    public static javax.swing.JPanel jp_13;
    public static javax.swing.JPanel jp_14;
    public static javax.swing.JPanel jp_15;
    public static javax.swing.JPanel jp_16;
    public static javax.swing.JPanel jp_17;
    public static javax.swing.JPanel jp_18;
    public static javax.swing.JPanel jp_19;
    public static javax.swing.JPanel jp_2;
    public static javax.swing.JPanel jp_20;
    public static javax.swing.JPanel jp_3;
    public static javax.swing.JPanel jp_4;
    public static javax.swing.JPanel jp_5;
    public static javax.swing.JPanel jp_6;
    public static javax.swing.JPanel jp_7;
    public static javax.swing.JPanel jp_8;
    public static javax.swing.JPanel jp_9;
    public static javax.swing.JPanel jp_barbero;
    private javax.swing.JTextField jtf_numero_clientes;
    public static javax.swing.JLabel lbl_atendidos;
    private javax.swing.JLabel lbl_barbero;
    public static javax.swing.JLabel lbl_retirados;
    private javax.swing.JLabel lbl_sillas;
    private javax.swing.JLabel lbl_titulo;
    // End of variables declaration//GEN-END:variables
}
