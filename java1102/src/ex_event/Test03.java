package ex_event;

import java.awt.event.*;

import javax.swing.*;

public class Test03 {
	/*
	 * 1. 300, 200 프레임 생성(타이틀 : "이벤트처리 연습-3")
	 * 2. 닫기버튼 클릭시 프로그램 종료
	 * 3. "버튼" 이라는 텍스트를 갖는 버튼 객체 부착
	 * 4. 클릭 이벤트 처리를 위해 ActionListener 인터페이스를 멤버 내부 클래스 형태로 구현
	 *    (MyMemberActionListener) 정의
	 *    => 추상메서드 정의해서 "버튼 클릭" 문자열 출력되도록 코드 기술
	 * 5. ActionListener 인터페이스 구현체 객체 생성
	 * 6. 버튼 객체의  addActionListener() 메서드 호출하여 객체 전달
	 * 
	 */
	
	public Test03() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("이벤트처리 연습-3");
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JButton 객체 생성 및 JFrame 객체에 부착
		JButton btn = new JButton("버튼");
		f.add(btn);
		
		// 이벤트 처리3. 내부 클래스 형태로 이벤트 처리
		// 1. 리스너 구현체  객체 생성
		MyMemberActionListener listener = new MyMemberActionListener();
		
		// 2. JButton 객체의 addActionListener() 메서드를 호출하여 구현체 객체 전달
		btn.addActionListener(listener);
		
		f.setVisible(true);
		
 	}
	
	public static void main(String[] args) {

		new Test03();
	}

	// 이벤트 처리3. 내부 클래스 형태로 정의
	// JButton 컴포넌트에 대한 이벤트 처리 담당 리스너 : ActionListener 인터페이스
	class MyMemberActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// 버튼 클릭 시 자동으로 호출되는 메서드
			// => "버튼 클릭" 메세지 출력
			System.out.println("버튼 클릭!");
		}
		
	}
	
	
	
}
