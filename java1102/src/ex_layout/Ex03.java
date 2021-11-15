package ex_layout;

import java.awt.*;

import javax.swing.*;

public class Ex03 {

	/*
	 * FlowLayout
	 */
	
	public Ex03() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 1. 레이아웃 객체 생성
//		FlowLayout flowlayout = new FlowLayout();
		// FlowLayout의 정렬 방식 변경할 경우 생성자 파라미터로 정렬값 상수 사용
		FlowLayout flowlayout = new FlowLayout(FlowLayout.LEFT); // 중앙 정렬
		
		// 2. setLayout() 메서드를 호출하여 변경할 레이아웃 객체 전달
		f.setLayout(flowlayout);
		
		JButton btn1 = new JButton("BUTTON1");
		JButton btn2 = new JButton("BUTTON2");
		JButton btn3 = new JButton("BUTTON3");
		JButton btn4 = new JButton("BUTTON4");
		JButton btn5 = new JButton("BUTTON5");
		
		// BorderLayout과 달리 FlowLayout은 컴포넌트 배치 시 별도의 위치 지정 불필요
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}
