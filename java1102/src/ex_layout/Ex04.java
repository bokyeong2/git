package ex_layout;

import java.awt.*;

import javax.swing.*;

public class Ex04 {
	
	public Ex04() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 현재 JFrame 객체를 GridLayout의 3행 2열 구조로 변경
//		GridLayout gridLayout = new GridLayout(3, 2); // 행, 열 선택
		GridLayout gridLayout = new GridLayout(3, 2, 10, 20); // 행, 열, 수평간격, 수직간격 선택
		
		// JFrame 객체의 setLayout() 메서드를 호출하여 GridLayout 객체 전달
		f.setLayout(gridLayout);
		
		JButton btn1 = new JButton("BUTTON1");
		JButton btn2 = new JButton("BUTTON2");
		JButton btn3 = new JButton("BUTTON3");
		JButton btn4 = new JButton("BUTTON4");
		JButton btn5 = new JButton("BUTTON5");
		
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		
		
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ex04();
	}

}
