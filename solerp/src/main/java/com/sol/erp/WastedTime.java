package com.sol.erp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.sol.erp.util.DBConnectionUtil;

public class WastedTime implements java.awt.event.ActionListener, java.awt.event.FocusListener {
	
	Connection con;
	Statement stat;
	ResultSet rs;
	DecimalFormat df;
	DecimalFormat df1;
	DecimalFormat timeformat;
	JFrame f;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JLabel l7;
	JLabel l8;
	JLabel l9;
	JLabel l10;
	JLabel l11;
	JLabel l12;
	JLabel northlabel;
	JLabel westlabel;
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;
	JTextField tf4;
	JTextField tf5;
	JTextField tf6;
	static JComboBox tf7 = new JComboBox();

	JTextField tf8;

	JTextField tf9;

	JTextField tf10;

	JTextField tf11;

	JTextArea tfsp;

	javax.swing.JScrollPane tf12;

	JButton savebut;

	JButton closebut;

	JPanel centerpanel;

	JPanel northpanel;

	JPanel westpanel;

	JPanel southpanel;

	java.util.Date dat;

	SimpleDateFormat formatter;

	SimpleDateFormat formatter1;

	String dateString;
	String dateString1;
	java.awt.Toolkit tk;
	Dimension ss;
	Dimension fs;
	java.awt.Font fo;
	int maxreq;
	String maxstr;

	public void px() {
		 java.awt.Container localContainer = f.getContentPane();
		 localContainer.setLayout(new java.awt.BorderLayout());
		 centerpanel.setLayout(null);
		 northpanel.setLayout(new java.awt.BorderLayout());
		 westpanel.setLayout(new java.awt.BorderLayout());

		 northpanel.add(northlabel, "Center");
		 westpanel.add(westlabel, "Center");

		centerpanel.setBackground(new Color(60, 130, 130));
		l1.setForeground(Color.white);
		l2.setForeground(Color.white);
		l3.setForeground(Color.white);
		l4.setForeground(Color.white);
		l5.setForeground(Color.white);
		l6.setForeground(Color.white);
		l7.setForeground(Color.white);
		l8.setForeground(Color.white);
		l9.setForeground(Color.white);
		l10.setForeground(Color.white);
		l11.setForeground(Color.white);
		l12.setForeground(Color.white);

		tf1.setFont(fo);
		tf1.setEditable(false);
		tf2.setFont(fo);
		tf2.setEditable(false);
		tf3.setFont(fo);
		tf3.setEditable(false);
		tf4.setFont(fo);
		tf4.setEditable(false);
		tf5.setFont(fo);
		tf5.setEditable(false);
		tf6.setFont(fo);
		tf6.setEditable(false);
		tf7.setFont(fo);
		tf8.setFont(fo);
		tfsp.setFont(fo);
		tf9.setFont(fo);
		tf10.setFont(fo);
		tf11.setFont(fo);
		tf12.setFont(fo);

		northpanel.setBackground(Color.white);
		westpanel.setBackground(Color.white);

		northpanel.setPreferredSize(new Dimension(100, 70));
		westpanel.setPreferredSize(new Dimension(150, 70));

		l1.setBounds(30, 30, 150, 20);
		tf1.setBounds(200, 30, 90, 20);
		l2.setBounds(300, 30, 60, 20);
		tf2.setBounds(360, 30, 90, 20);
		l3.setBounds(30, 55, 150, 20);
		tf3.setBounds(200, 55, 250, 20);
		l4.setBounds(30, 80, 150, 20);
		tf4.setBounds(200, 80, 250, 20);
		l5.setBounds(30, 105, 150, 20);
		tf5.setBounds(200, 105, 90, 20);
		l6.setBounds(30, 130, 150, 20);
		tf6.setBounds(200, 130, 90, 20);
		l7.setBounds(300, 130, 60, 20);
		tf7.setBounds(360, 130, 90, 20);
		l8.setBounds(30, 155, 150, 20);
		tf8.setBounds(200, 155, 90, 20);
		l9.setBounds(300, 155, 60, 20);
		tf9.setBounds(360, 155, 90, 20);
		l10.setBounds(30, 180, 150, 20);
		tf10.setBounds(200, 180, 90, 20);
		l11.setBounds(300, 180, 60, 20);
		tf11.setBounds(360, 180, 90, 20);
		l12.setBounds(30, 205, 150, 20);
		tf12.setBounds(30, 225, 420, 90);

		savebut.setBounds(60, 300, 100, 25);
		closebut.setBounds(305, 300, 100, 25);

		savebut.setMnemonic(83);
		closebut.setMnemonic(67);

		centerpanel.add(l1);
		centerpanel.add(tf1);
		centerpanel.add(l2);
		centerpanel.add(tf2);
		centerpanel.add(l3);
		centerpanel.add(tf3);
		centerpanel.add(l4);
		centerpanel.add(tf4);
		centerpanel.add(l5);
		centerpanel.add(tf5);
		centerpanel.add(l6);
		centerpanel.add(tf6);
		centerpanel.add(l7);
		centerpanel.add(tf7);
		centerpanel.add(l8);
		centerpanel.add(tf8);
		centerpanel.add(l9);
		centerpanel.add(tf9);
		centerpanel.add(l10);
		centerpanel.add(tf10);
		centerpanel.add(l11);
		centerpanel.add(tf11);
		centerpanel.add(l12);
		centerpanel.add(tf12);

		southpanel.add(savebut);
		southpanel.add(closebut);

		savebut.addActionListener(this);
		closebut.addActionListener(this);

		tf2.addFocusListener(this);
		tf10.addFocusListener(this);

		localContainer.add(centerpanel, "Center");
		localContainer.add(southpanel, "South");

		f.setSize(490, 410);
		f.setLocation((ss.width - fs.width) / 4, (ss.height - fs.height) / 4);
		f.setResizable(false);
		f.setVisible(true);
		tf2.requestFocus();
	}

	public void paramUser() {
		tf2.setText(TechMainFrame.textFieldLoggedBy.getText());
		tf2.requestFocus();
	}

	public void empDetails() {
		try {
			con = DBConnectionUtil.getConnection();
			stat = con.createStatement();
			rs = stat.executeQuery("select emp_name,DESIGNATION, System_no From emp_STATUS WHERE emp_code='"
					+ tf2.getText() + "' ");
			while (rs.next()) {
				String str1 = new String(rs.getString(1));
				String str2 = new String(rs.getString(2));
				String str3 = new String(rs.getString(3));

				tf3.setText(str1);
				tf4.setText(str2);
				tf5.setText(str3);
				tf8.requestFocus();
			}
		} catch (Exception localException) {
			JOptionPane.showMessageDialog(f, localException.getMessage().toString());
		}
	}

	public WastedTime() {
		con = DBConnectionUtil.getConnection();

		 df = new DecimalFormat("00.00");
		 df1 = new DecimalFormat("00");
		 timeformat = new DecimalFormat("0000");

		 f = new JFrame("Wasted Time Request Form");
		 l1 = new JLabel("Date");
		 l2 = new JLabel("Emp Code");
		 l3 = new JLabel("Name ");
		 l4 = new JLabel("Designation");
		 l5 = new JLabel("System No");
		 l6 = new JLabel("Req Time");
		 l7 = new JLabel("Req TL");
		 l8 = new JLabel("Time");
		 l9 = new JLabel("Project No");
		 l10 = new JLabel("Drg No");
		 l11 = new JLabel("Item Code");
		 l12 = new JLabel("Reason");

		 northlabel = new JLabel(new javax.swing.ImageIcon("image/projectco.gif"));
		 westlabel = new JLabel(new javax.swing.ImageIcon("image/report.gif"));

		 tf1 = new JTextField();
		 tf2 = new JTextField();
		 tf3 = new JTextField();
		 tf4 = new JTextField();
		 tf5 = new JTextField();
		 tf6 = new JTextField();

		 tf8 = new JTextField();
		 tf9 = new JTextField();
		 tf10 = new JTextField();
		 tf11 = new JTextField();
		 tfsp = new JTextArea();
		 tf12 = new javax.swing.JScrollPane(tfsp);

		 savebut = new JButton("Send to TL");
		 closebut = new JButton("Close");

		 centerpanel = new JPanel();
		 northpanel = new JPanel();
		 westpanel = new JPanel();
		 southpanel = new JPanel();

		 dat = new java.util.Date();
		 formatter = new SimpleDateFormat("dd/MM/yyyy");
		 formatter1 = new SimpleDateFormat("hhmm");

		try {
			 dateString = formatter.format(dat);
			 dateString1 = formatter1.format(dat);
			 tf1 = new JTextField(String.valueOf(dateString));
			 tf6 = new JTextField(String.valueOf(dateString1));
		} catch (IllegalArgumentException localIllegalArgumentException) {
			 System.out.println(localIllegalArgumentException.getMessage());
		}

		 tk = java.awt.Toolkit.getDefaultToolkit();
		 ss = tk.getScreenSize();
		 fs = f.getSize();

		 fo = new java.awt.Font("Tahoma", 1, 11);

		maxreq = 0;
		maxstr = "0";
	}

	public void maxReq() {
		try {
			con = DBConnectionUtil.getConnection();
			stat = con.createStatement();
			rs = stat.executeQuery("select max(req_no) From bfa_time where emp_code='" + tf2.getText()
					+ "' and date_month='" + tf1.getText() + "' ");

			int i = rs.getRow();
			if (i < 1) {
				maxreq += 1;
			}
			if (i > 1) {
				while (rs.next()) {
					maxstr = new String(rs.getString(1));
					maxreq = (Integer.parseInt(maxstr) + 1);
					System.out.println(maxreq);
				}
			}
		} catch (Exception localException) {
			JOptionPane.showMessageDialog(f, localException.getMessage().toString());
		}
	}

	public void itemCode() {
		try {
			con = DBConnectionUtil.getConnection();
			stat = con.createStatement();
			rs = stat.executeQuery("select item_code from drawingno where project_no='" + tf9.getText()
					+ "' and DRAWING_NO='" + tf10.getText() + "' ");
			while (rs.next()) {
				String str = new String(rs.getString(1));
				tf11.setText(str);
			}
		} catch (Exception localException) {
			JOptionPane.showMessageDialog(f, localException.getMessage().toString());
		}
	}

	public void actionPerformed(java.awt.event.ActionEvent paramActionEvent) {
		if (paramActionEvent.getSource() == savebut) {
			try {
				con = DBConnectionUtil.getConnection();
				stat = con.createStatement();
				stat.executeUpdate("insert into WASTED values('" + tf1.getText() + "', '" + tf2.getText()
						+ "','" + tf9.getText() + "','" + tf10.getText() + "','" + tf11.getText() + "','"
						+ tf8.getText() + "', '" + tfsp.getText() + "','0','" + maxreq + "')  ");
			} catch (Exception localException1) {
				if (localException1.getMessage().toString().equalsIgnoreCase("No ResultSet was Produced")) {
					int j = TechMainFrame.requestTableModel.getRowCount() + 1;
					TechMainFrame.requestTableModel.addRow(new Object[] { String.valueOf(j), tf1.getText(), tf2.getText(),
							tf3.getText(), tf4.getText(), tf5.getText(), tf6.getText(),
							tf7.getSelectedItem(), "WASTED" });
					tf8.setText("");
					tf9.setText("");
					tf10.setText("");
					tf11.setText("");
					tfsp.setText("");
					JOptionPane.showMessageDialog(f, "Your Request Sent to " + tf7.getSelectedItem());
					tf2.requestFocus();
				} else {
					JOptionPane.showMessageDialog(f, localException1.getMessage().toString());
				}
			}

			int i = TechMainFrame.requestTableModel.getRowCount() + 1;

			try {
				con = DBConnectionUtil.getConnection();
				stat = con.createStatement();
				stat.executeUpdate("insert into TIME_REQ values('" + String.valueOf(i) + "','" + tf1.getText()
						+ "','" + tf2.getText() + "','" + tf3.getText() + "','" + tf4.getText() + "','"
						+ tf5.getText() + "','" + tf6.getText() + "','" + tf7.getSelectedItem()
						+ "','WASTED','0','" + maxreq + "' )  ");
			} catch (Exception localException2) {
				if (!localException2.getMessage().toString().equalsIgnoreCase("No ResultSet was Produced")) {

					JOptionPane.showMessageDialog(f, localException2.getMessage().toString());
				}
			}
		}

		if (paramActionEvent.getSource() == closebut) {
			f.setVisible(false);
		}
	}

	public void focusGained(FocusEvent paramFocusEvent) {
		if (paramFocusEvent.getSource() == tf2) {
			empDetails();
		}
	}

	public void focusLost(FocusEvent paramFocusEvent) {
		if (paramFocusEvent.getSource() == tf10) {
			itemCode();
		}
	}
}
