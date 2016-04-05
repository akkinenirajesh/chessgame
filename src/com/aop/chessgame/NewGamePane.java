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
		// set some layout
		JPanel panel = new JPanel(new GridLayout(2, 2));
		panel.setSize(200, 200);
		JLabel jl1 = new JLabel("username");
		JTextField tf = new JTextField(10);
		JLabel jl2 = new JLabel("port");
		JTextField tf1 = new JTextField(10);
		JButton button1 = new JButton("create");
		JButton button2 = new JButton("cancel");
		this.add(jl1);
		this.add(tf);
		this.add(jl2);
		this.add(tf1);
		this.add(button1);
		this.add(button2);
		//
		// create required controls
		// create two buttons, cancel, create

		// on create call
		chessGameApplication.onNewGame(port, userName);
	}

}
