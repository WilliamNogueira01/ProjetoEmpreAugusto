package augusto;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class cadastroCliente extends javax.swing.JFrame {

    public cadastroCliente() {
        
        initComponents();
   
    }

    @SuppressWarnings("unchecked")
    String teste;
    private void ApagarCampos(){
        txfCNPJ.setText("");
        txfRS.setText("");
        txfCPF.setText("");
        txfRG.setText("");
        txfDataNasc.setText("");
        txfNome.setText("");
        txfLogradouro.setText("");
        txfCidade.setText("");
        txfBairro.setText("");
        cbxUF.setText("");
        txfCEP.setText("");
        txfComplemento.setText("");
        txfNumero.setText("");
        txfTelefone.setText("");
        txfCelular1.setText("");
        txfCelular2.setText("");
        txfEmail.setText("");
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSexo = new javax.swing.ButtonGroup();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        cbxPessoa = new javax.swing.JComboBox<>();
        txfRS = new javax.swing.JTextField();
        lblPessoa = new javax.swing.JLabel();
        lblRS = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox<>();
        lblSexo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblRG = new javax.swing.JLabel();
        txfRG = new javax.swing.JTextField();
        lblCNPJ = new javax.swing.JLabel();
        txfNome = new javax.swing.JTextField();
        txfCPF = new javax.swing.JTextField();
        txfCNPJ = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        txfNumero = new javax.swing.JFormattedTextField();
        lblBairro = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        txfCEP = new javax.swing.JFormattedTextField();
        lblCidade = new javax.swing.JLabel();
        txfCidade = new javax.swing.JTextField();
        lblCcomplemento = new javax.swing.JLabel();
        txfComplemento = new javax.swing.JTextField();
        lblUF = new javax.swing.JLabel();
        txfDataNasc = new javax.swing.JFormattedTextField();
        lblNasc = new javax.swing.JLabel();
        txfBairro = new javax.swing.JTextField();
        txfLogradouro = new javax.swing.JTextField();
        lblEndereço = new javax.swing.JLabel();
        cbxUF = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txfCelular1 = new javax.swing.JFormattedTextField();
        txfCelular2 = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        txfEmail = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txfTelefone = new javax.swing.JFormattedTextField();
        lblCelular = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_Cadastro = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setBackground(new java.awt.Color(255, 255, 240));

        jPanel1.setBackground(new java.awt.Color(255, 250, 205));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DADOS BÁSICOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        cbxPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Física", "Jurídica" }));
        cbxPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPessoaActionPerformed(evt);
            }
        });

        txfRS.setEnabled(false);
        txfRS.setMinimumSize(new java.awt.Dimension(7, 29));
        txfRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfRSActionPerformed(evt);
            }
        });

        lblPessoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPessoa.setText("PESSOA");

        lblRS.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRS.setText("RAZÃO SOCIAL");

        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Feminino" }));

        lblSexo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSexo.setText("SEXO");

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNome.setText("NOME");

        lblCPF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCPF.setText("CPF");

        lblRG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblRG.setText("RG");

        txfRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfRGActionPerformed(evt);
            }
        });

        lblCNPJ.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCNPJ.setText("CNPJ");

        txfCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfCPFFocusLost(evt);
            }
        });

        txfCNPJ.setEnabled(false);
        txfCNPJ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfCNPJFocusLost(evt);
            }
        });
        txfCNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCNPJActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCNPJ)
                            .addComponent(txfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRS)
                            .addComponent(txfRS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPessoa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(lblCPF))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfRG, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRG))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSexo)
                            .addComponent(cbxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblRG)
                            .addComponent(lblSexo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txfRG, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbxSexo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPessoa)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCPF))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRS)
                    .addComponent(lblCNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfRS, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 250, 205));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENDEREÇO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        lblNumero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNumero.setText("NÚMERO");

        txfNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNumeroActionPerformed(evt);
            }
        });

        lblBairro.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblBairro.setText("BAIRRO");

        lblCEP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCEP.setText("CEP");

        try {
            txfCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txfCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfCEPFocusLost(evt);
            }
        });
        txfCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCEPActionPerformed(evt);
            }
        });

        lblCidade.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCidade.setText("CIDADE");

        lblCcomplemento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCcomplemento.setText("COMPLEMENTO");

        txfComplemento.setToolTipText("Complemento");

        lblUF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblUF.setText("UF");

        try {
            txfDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txfDataNasc.setToolTipText("01/01/2000");
        txfDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfDataNascActionPerformed(evt);
            }
        });

        lblNasc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNasc.setText("DATA DE NASCIMENTO");

        lblEndereço.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEndereço.setText("LOGRADOURO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 369, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNumero)
                            .addComponent(txfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBairro))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCEP)
                                .addGap(99, 99, 99)
                                .addComponent(lblEndereço)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(txfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblCidade)
                                        .addGap(97, 97, 97)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCcomplemento))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUF)
                                    .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNasc))
                        .addGap(105, 105, 105))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(lblBairro)
                    .addComponent(lblCEP)
                    .addComponent(lblEndereço))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(lblCcomplemento)
                    .addComponent(lblUF)
                    .addComponent(lblNasc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadastrar.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Voltar.png"))); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 250, 205));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONTATO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP));

        try {
            txfCelular1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txfCelular2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblEmail.setText("E-MAIL");

        lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblTelefone.setText("TELEFONE");

        try {
            txfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCelular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCelular.setText("CELULAR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefone)
                    .addComponent(txfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCelular)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txfCelular1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCelular2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCelular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfCelular1)
                            .addComponent(txfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfCelular2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro");

        lbl_Cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pessoa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCadastrar)
                                .addGap(30, 30, 30))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jLabel1)
                        .addGap(57, 57, 57)
                        .addComponent(lbl_Cadastro)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_Cadastro)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(jButton1))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfRSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfRSActionPerformed

    private void txfDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfDataNascActionPerformed

    private void txfRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfRGActionPerformed

    private void cbxPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPessoaActionPerformed
        System.out.println(cbxPessoa.getSelectedItem().toString());
        if(cbxPessoa.getSelectedItem().toString().equals("Física")){
            txfCNPJ.setEnabled(false);
            txfRS.setEnabled(false);
            txfCPF.setEnabled(true);
            txfRG.setEnabled(true);
            cbxSexo.setEnabled(true);
            txfDataNasc.setEnabled(true);
            txfNome.setEnabled(true);
            lbl_Cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pessoa.png")));
            ApagarCampos();
        }
        
        if(cbxPessoa.getSelectedItem().toString().equals("Jurídica")){
            txfCNPJ.setEnabled(true);
            cbxSexo.setEnabled(false);
            txfDataNasc.setEnabled(false);
            txfRS.setEnabled(true);
            txfCPF.setEnabled(false);
            txfRG.setEnabled(false);
            txfNome.setEnabled(false);
            lbl_Cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Juridica.png")));
            ApagarCampos();
        }
    }//GEN-LAST:event_cbxPessoaActionPerformed

    private void txfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNumeroActionPerformed

    }//GEN-LAST:event_txfNumeroActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        Connector con = new Connector();
        
        if (!txfTelefone.getText().equals("(  )     -    ") || !txfCelular1.getText().equals("(  )      -    ") || !txfCelular2.getText().equals("(  )      -    ")){
            if(cbxPessoa.getSelectedItem().toString().equals("Física")){
                Fisico F = new Fisico(txfNome.getText(), txfCPF.getText(), txfRG.getText(), cbxSexo.getSelectedItem().toString(), txfDataNasc.getText(), cbxPessoa.getSelectedItem().toString(),txfTelefone.getText(), txfCelular1.getText(), txfCelular2.getText(), txfEmail.getText(),txfCEP.getText(), txfLogradouro.getText(), txfBairro.getText(), txfCidade.getText(), txfComplemento.getText(), cbxUF.getText(), txfNumero.getText());
                
                try{
                    con.cadastroPF(F);
                    JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso!!");
                    ApagarCampos();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, "ERRO AO CADASTRAR!!\n"+e);
                }

            }
            if(cbxPessoa.getSelectedItem().toString().equals("Jurídica")){
                Juridico J = new Juridico(txfCNPJ.getText(), txfRS.getText(),txfTelefone.getText(), txfCelular1.getText(), txfCelular2.getText(), txfEmail.getText(),txfCEP.getText(), txfLogradouro.getText(), txfBairro.getText(), txfCidade.getText(), txfComplemento.getText(), cbxUF.getText(), txfNumero.getText());
               //                                                                String cnpj, String razaoSocial, String telefone, String celular1, String celular2, String email, String cep, String logradouro, String bairro, String cidade, String complemento, String uf, String numero
                try{
                    con.cadastroPJ(J);
                    JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso!!");
                    ApagarCampos();
                }catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, "ERRO AO CADASTRAR!!\n"+e);
                } 
            }
            
        }else{
            JOptionPane.showMessageDialog(rootPane, "Necessário um Telefone!!");
        }
       
        

    }//GEN-LAST:event_btnCadastrarActionPerformed
    
    private void txfCNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCNPJActionPerformed

    private void txfCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCEPActionPerformed
    
    }//GEN-LAST:event_txfCEPActionPerformed

    private void txfCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCEPFocusLost
            WebServiceCep webServiceCep = WebServiceCep.searchCep(txfCEP.getText());
            if(webServiceCep.wasSuccessful()){
                txfLogradouro.setText(webServiceCep.getLogradouroFull());
                txfCidade.setText(webServiceCep.getCidade());
                txfBairro.setText(webServiceCep.getBairro());
                cbxUF.setText(webServiceCep.getUf());
            }
    }//GEN-LAST:event_txfCEPFocusLost

    private void txfCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCPFFocusLost
        if(cbxPessoa.getSelectedItem().toString().equals("Física")){
            if (CPF.isCPF(txfCPF.getText()) == true){
             txfCPF.setText(CPF.imprimeCPF(txfCPF.getText()));
        }else{
             txfCPF.setText("");
             JOptionPane.showMessageDialog(rootPane, "CPF invalido");
            }
        }
    }//GEN-LAST:event_txfCPFFocusLost

    private void txfCNPJFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfCNPJFocusLost
       if(cbxPessoa.getSelectedItem().toString().equals("Jurídica")){
            if (CNPJ.isCNPJ(txfCNPJ.getText()) == true){
                txfCNPJ.setText(CNPJ.imprimeCNPJ(txfCNPJ.getText()));
                System.out.println("aaaa");
            }else{
                JOptionPane.showMessageDialog(rootPane, "CNPJ invalido");
                txfCNPJ.setText("");
                
            }
        }
    }//GEN-LAST:event_txfCNPJFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.ButtonGroup btnSexo;
    private javax.swing.JComboBox<String> cbxPessoa;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JTextField cbxUF;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCNPJ;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCcomplemento;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereço;
    private javax.swing.JLabel lblNasc;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPessoa;
    private javax.swing.JLabel lblRG;
    private javax.swing.JLabel lblRS;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUF;
    private javax.swing.JLabel lbl_Cadastro;
    private javax.swing.JTextField txfBairro;
    private javax.swing.JFormattedTextField txfCEP;
    private javax.swing.JTextField txfCNPJ;
    private javax.swing.JTextField txfCPF;
    private javax.swing.JFormattedTextField txfCelular1;
    private javax.swing.JFormattedTextField txfCelular2;
    private javax.swing.JTextField txfCidade;
    private javax.swing.JTextField txfComplemento;
    private javax.swing.JFormattedTextField txfDataNasc;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JTextField txfLogradouro;
    private javax.swing.JTextField txfNome;
    private javax.swing.JFormattedTextField txfNumero;
    private javax.swing.JTextField txfRG;
    private javax.swing.JTextField txfRS;
    private javax.swing.JFormattedTextField txfTelefone;
    // End of variables declaration//GEN-END:variables
}
