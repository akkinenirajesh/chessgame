
package com.aop.chessgame;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewGamePane extends JPanel {

	private ChessGameApplication chessGameApplication;

	public NewGamePane(ChessGameApplication chessGameApplication) {
		this.chessGameApplication = chessGameApplication;
		String userName = null;
		int port = 0;
		JPanel panel = new JPanel(new GridLayout(2, 2));
		panel.setSize(200, 200);
		JLabel userLabel = new JLabel("Username");
		JTextField userText = new JTextField(10);
		JLabel portLable = new JLabel("Port");
		JTextField portText = new JTextField(10);
		JButton button1 = new JButton("Create");
		JButton button2 = new JButton("Cancel");
		this.add(userLabel);
		this.add(userText);
		this.add(portLable);
		this.add(portText);
		this.add(button1);
		this.add(button2);
		// on create call
		chessGameApplication.onNewGame(port, userName);
	}

}
