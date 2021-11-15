package ex_event;

import java.awt.event.*;

import javax.swing.*;

public class Test04 {
	

	/*
	 * 클릭 이벤트 처리를 ActionListener 인터페이스를 
	 * 익명 로컬 내부클래스 형태로  listener 인스턴스 생성
	 * 
	 */
	
	public Test04() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("이벤트처리 연습-4");
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		f.add(btn);
		
		// 이벤트 처리4. 익명 로컬 내부 클래스 형태로 이벤트 처리
		// JButton 컴포넌트에 대한 이벤트 처리 담당 리스너 : ActionListener 인터페이스
		ActionListener listener = new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 클릭");
				
			}
		};
		
		// JButton 객체의 addActionListener() 메서드를 호출하여 구현체 객체 전달
		btn.addActionListener(listener);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Test04();
	}

	ActionListener listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println();
		}
	};
	
}
