package ex_event;

import java.awt.event.*;

import javax.swing.*;

public class Test05 {

	/*
	 * 1. 300, 200 프레임 생성(타이틀 : "이벤트처리 연습-5")
	 * 2. 닫기버튼 클릭 시 프로그램 종료
	 * 3. "버튼" 이라는 텍스트를 갖는 버튼 객체 부착
	 * 4. 클릭 이벤트 처리를 위해 ActionListener 인터페이스를 익명 내부클래스의 임시 객체 형태로
	 *   정의하여 버튼 객체의 addActionListener() 메서드 호출하여 파라미터로 전달
	 *   => 추상메서드 오버라이딩 : "버튼 클릭" 문자열 출력하는 코드를 기술
	 */
	
	public Test05() {
		showFrame();
	}
	
	public void showFrame() {
		
		JFrame f = new JFrame("이벤트처리연습 -5");
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		f.add(btn);
		
		// 이벤트 처리5. 익명 내부 클래스의 임시 객체 형태로 이벤트 처리
		// JButton 컴포넌트에 대한 이벤트 처리 담당 리스너 : ActionListener 인터페이스
		// JButton 객체의 addActionListener() 메서드를 호출하여 구현체 객체 전달 => 객체 생성
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// "버튼 클릭" 메서지 출력
				System.out.println("버튼 클릭");
//				System.exit(0);
			}
		});
		
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test05();
	}

	
	
}
