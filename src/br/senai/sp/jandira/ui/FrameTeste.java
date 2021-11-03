package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JEditorPane;

public class FrameTeste extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public FrameTeste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setBounds(10, 57, 372, 193);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		
		JLabel lblNewLabel_2 = new JLabel("Costa");
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		JLabel lblNewLabel_1 = new JLabel("Gabriel");
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		JEditorPane editorPane = new JEditorPane();
		panel_2.add(editorPane);
		
		JSpinner spinner = new JSpinner();
		panel_2.add(spinner);
		
		JLabel lblNewLabel = new JLabel("Jo\u00E3o");
		panel_2.add(lblNewLabel);
	}
}
