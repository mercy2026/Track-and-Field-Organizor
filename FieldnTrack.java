package trackFeild;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;


public class FieldnTrack {
	private static JTextField textGrade;
	private static JTextField textResult; 
	private static JTextField textPlayerName;
	private static JTextField textEvents;
	//private static JTextField textField;

	public static void main(String[] args) {
		JTable table = new JTable();
		Object[] columns = {"Player Name", "Grade", "Event(s)", "Result"};
		DefaultTableModel model = new DefaultTableModel();
		
		JFrame frame = new JFrame("Track and Field Organizor");
		frame.getContentPane().setBackground(new Color(0,0,0));
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 757, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null); 
		
		model.setColumnIdentifiers(columns);
		table.setModel(model);
		
		table.setBackground(Color.white);
		table.setForeground(Color.black);
		table.setSelectionBackground(Color.red);
		table.setGridColor(Color.red);
		table.setSelectionForeground(Color.white);
		table.setFont(new Font("Tahoma", Font.PLAIN, 17));
		table.setRowHeight(30);
		table.setAutoCreateRowSorter(true);
		
		JScrollPane pane = new JScrollPane(table);
		pane.setForeground(Color.RED);
		pane.setBackground(Color.WHITE);
		pane.setBounds(10, 10, 729, 354);
		frame.getContentPane().add(pane);
		
		Object[] row = new Object[4];
		
		JLabel lblPlayerName = new JLabel(" Full Name");
		lblPlayerName.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblPlayerName.setForeground(Color.WHITE);
		lblPlayerName.setBounds(10, 385, 103, 20);
		frame.getContentPane().add(lblPlayerName);
		
		JLabel lblGrade = new JLabel(" Grade");
		lblGrade.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblGrade.setForeground(Color.WHITE);
		lblGrade.setBounds(10, 429, 103, 20);
		frame.getContentPane().add(lblGrade);
		
		JLabel lblEvents = new JLabel("Events");
		lblEvents.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblEvents.setForeground(Color.WHITE);
		lblEvents.setBounds(391, 385, 103, 20);
		frame.getContentPane().add(lblEvents);
		
		JLabel lblTime = new JLabel("Result");
		lblTime.setForeground(Color.WHITE);
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblTime.setBounds(391, 429, 103, 20);
		frame.getContentPane().add(lblTime);
		
		
		//ADD Button
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(10, 463, 295, 35);;
		frame.getContentPane().add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				row[0] = textPlayerName.getText();
				row[1] = textGrade.getText();
				row[2] = textEvents.getText();
				row[3] = textResult.getText();
				
				model.addRow(row);
			}
		});
		
		
		//DELETE BUTTON
		/*JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(313, 463, 290, 35);
		frame.getContentPane().add(btnDelete);*/
		
		textGrade = new JTextField();
		textGrade.setBounds(123, 419, 108, 35);
		frame.getContentPane().add(textGrade);
		textGrade.setColumns(10);
		
		textPlayerName = new JTextField();
		textPlayerName.setBounds(123, 374, 166, 35);
		frame.getContentPane().add(textPlayerName);
		textPlayerName.setColumns(10);
		
		textEvents = new JTextField();
		textEvents.setBounds(490, 374, 146, 35);
		frame.getContentPane().add(textEvents);
		textEvents.setColumns(10);
		
		textResult = new JTextField();
		textResult.setBounds(490, 415, 116, 35);
		frame.getContentPane().add(textResult);
		textResult.setColumns(10);
		
		//DELETE BUTTON
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(313, 463, 290, 35);
		frame.getContentPane().add(btnDelete);
		
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int i = table.getSelectedRow();
				if(i>=0) {
					model.removeRow(i);
				} else {
					JOptionPane.showMessageDialog(frame, "Delete Error");
				}
			}
		});
		
		
		frame.revalidate();
		frame.setVisible(true);
	}
	
	/*public FieldnTrack(JTextField name, JTextField grade, JTextField event, JTextField time) {
		textPlayerName = name;
		textGrade = grade;
		textEvents = event;
		textTime = DNF;
		
	}*/
}
