package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class FrameCadastroContato extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtTelefone;
	private JTextField txtNascimento;
	private final ButtonGroup buttonGroupsSexo = new ButtonGroup();
	private final JPanel panel = new JPanel();

	/**
	 * Create the frame.
	 */
	public FrameCadastroContato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//CRIADO NOVO BOTÃO
		JButton btnSalvar = new JButton("Gravar contato");
		btnSalvar.setBounds(20, 355, 327, 47);
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Botão clicado");
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnSalvar);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNome.setBounds(20, 72, 78, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(20, 97, 327, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Verdana", Font.BOLD, 13));
		lblEmail.setBounds(20, 139, 78, 14);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setBounds(20, 158, 327, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setFont(new Font("Verdana", Font.BOLD, 13));
		lblTelefone.setBounds(20, 200, 78, 14);
		contentPane.add(lblTelefone);
		
		txtTelefone = new JTextField();
		txtTelefone.setBounds(20, 225, 179, 31);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Verdana", Font.BOLD, 13));
		lblCidade.setBounds(224, 200, 78, 14);
		contentPane.add(lblCidade);
		
		JComboBox comboCidades = new JComboBox();
		comboCidades.setModel(new DefaultComboBoxModel(new String[] {"Itapevi", "Jandira", "Barueri", "Osasco", "Cotia"}));
		comboCidades.setToolTipText("");
		comboCidades.setMaximumRowCount(5);
		comboCidades.setBounds(224, 225, 123, 23);
		contentPane.add(comboCidades);
		
		JLabel lblNascimento = new JLabel("Data de nascimento");
		lblNascimento.setFont(new Font("Verdana", Font.BOLD, 13));
		lblNascimento.setBounds(224, 267, 150, 14);
		contentPane.add(lblNascimento);
		
		txtNascimento = new JTextField();
		txtNascimento.setBounds(224, 292, 123, 31);
		contentPane.add(txtNascimento);
		txtNascimento.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Verdana", Font.BOLD, 13));
		lblSexo.setBounds(20, 267, 46, 14);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		buttonGroupsSexo.add(rdbtnFeminino);
		rdbtnFeminino.setBounds(20, 288, 78, 23);
		contentPane.add(rdbtnFeminino);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		buttonGroupsSexo.add(rdbtnMasculino);
		rdbtnMasculino.setBounds(109, 288, 90, 23);
		contentPane.add(rdbtnMasculino);
		panel.setBounds(0, 0, 384, 47);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Contatos");
		lblNewLabel.setBounds(28, 7, 80, 33);
		lblNewLabel.setForeground(new Color(250, 128, 114));
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD, 18));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(FrameCadastroContato.class.getResource("/br/senai/sp/jandira/imagens/contact-book.png")));
		lblNewLabel_1.setBounds(321, 0, 53, 47);
		panel.add(lblNewLabel_1);
	}
}
