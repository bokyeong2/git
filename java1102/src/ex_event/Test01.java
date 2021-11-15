package ex_event;

import java.awt.event.*;

import javax.swing.*;

public class Test01 {
	
	/*
	 * 1. 300, 200 프레임 생성(타이틀 : "이벤트처리 연습-1")
	 * 2. 닫기버튼 클릭 시 프로그램 종료
	 * 3. "버튼"이라는 텍스트를 갖는 버튼 객체 생성해서 부착
	 * 4. 클릭 이벤트 처리를 위해 ActionListener 인터페이스 구현 
	 *    핸들러(MyActionListener) 클래스 정의
	 *    => 추상메서드 actionPerformed() 메서드 오버라이딩
	 *    => 메서드 내에 "버튼 클릭" 문자열 출력하는 코드 기술
	 * 5. ActionListener 인터페이스 구현체(MyActionListener) 객체 생성
	 * 6. 버튼 객체의 addActionListener() 메서드 호출하여 구현체 객체 전달
	 * 
	 */
	
	public Test01() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("이벤트처리 연습-1");
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// JButton 객체 생성 및 JFrame 객체에 부착
		JButton btn = new JButton("버튼");
		f.add(btn);
		
		// JButton 객체에 ActionListener 리스너 연결하여 이벤트 처리
		// => JButton 객체의 addXXXListener() 메서드 호출하여 연결
		// 1. 리스너 구현체 객체 생성
		MyActionListener listner = new MyActionListener();
		
		// 2. JButton 객체의 addActionListener() 메서드를 호출하여 구현체 객체 전달
		btn.addActionListener(listner);
		
		
		f.setVisible(true);
	}

	public static void main(String[] args) {
		
		
		new Test01();
		
	}

}

// JButton 컴포넌트에 대한 이벤트 처리 담당 리스너 : ActionListener 인터페이스

class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼 클릭");
	}

}