package ex_event;

import java.awt.event.*;

import javax.swing.*;

public class Ex01 {
	/*
	 * < 이벤트 처리 5단계 >
	 * 1. 리스너 인터페이스를 구현하는 구현체 클래스(핸들러)를 정의
	 *    => 이벤트 발생 시 수행할 동작을 구현체 내부의 메서드에 기술하고
	 *       리스너 연결 시 구현체 객체를 생성하여 addXXXListener() 메서드에 파라미터로 전달
	 *       
	 */
	
	public Ex01() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("이벤트처리-1");
		f.setBounds(600, 400, 300, 200);
		
		// 이벤트 처리 1단계 리스너를 구현한 핸들러 클래스를 정의하여 사용
		// 현재 프레임(JFrame) 객체에 windowListener 구현체 연결
		
		// 1. 핸들러 객체(windowListener 구현체) 생성
		MyWindowListener listener = new MyWindowListener();
		
		// 2. 이벤트 연결을 위한 대상 객체(JFrame)의 addXXXListener() 메서드를 호출하여
		//    파라미터로 핸들러 객체를 전달 => 대상과 이벤트 리스너 연결이 완료됨
		//    ex) JFrame 클래스의 addWindowListener(WindowListener l) 호출
		f.addWindowListener(listener);
		
		f.setVisible(true);
		
		// ===================================================================
		// JFrame 객체 생성(300, 300) 후 MyWindowListener 리스너 연결
		JFrame f2 = new JFrame();
		f2.setSize(300, 300);
		
//		MyWindowListener listener2 = new MyWindowListener();
//		f2.addWindowListener(listener2);
		// => 만야그 처리할 이벤트가 동일할 경우 새 객체를 생성하지 않고
		//    기존에 생성한 리스너 객체를 그대로 재사용 가능
		f2.addWindowListener(listener);
		
		
		f2.setVisible(true);
		
		
		
	}
	

	public static void main(String[] args) {

		new Ex01();
		
		
	}

} // Ex01 클래스 끝



class MyWindowListener implements WindowListener {

	// 이벤트 처리 1단계
	// 이벤트 처리를 위해 리스너 인터페이스를 구현하는 핸들러 클래스 별도로 정의
	// 윈도우 프레임에 대한 이벤트 처리 담당 리스너 : WindowListener 인터페이스
	// WidowListener 인터페이스를 구현하는 MyWindowListener 클래스 정의
	// => 추상메서드 오버라이딩 필수!
	// => 각 메서드들은 이벤트 발생했을 때 해당 이벤트에 맞게 자동으로 호출됨
	//    따라서, 이벤트 발생 시 처리할 동작을 기술
	
	
	@Override
	public void windowActivated(WindowEvent e) {
		// 프레임이 사용자와 상호작용이 가능한 상태가 될 때 호출되는 메서드
		System.out.println("windowActivated");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// 프로그램이 종료 후 호출되는 메서드
		System.out.println("windowClosed");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// 맨 마지막 프로그램이 종료될 때 닫기 버튼을 클릭하면 호출되는 메서드
		System.out.println("windowClosing");
		
		System.exit(0); // 프로그램 종료(0 : 정상 종료, 0 이외의 값 : 비정상 종료)
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// 프레임이 사용자와 상호작용이 불가능한 상태가 될 때 호출되는 메서드
		// ex) 다른 프로그램에 가려진 상태가 될 때
		System.out.println("windowDeactivated");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// 프레임의 최소화가 해제될 때 호출되는 메서드
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// 프레임의 최소화 버튼 클릭 시 호출되는 메서드
		System.out.println("windowIconified");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// 맨 처음 프로그램이 실행될 때 프레임이 생성되어 표시되면 호출되는 메서드(1회)
		System.out.println("windowOpened");
	}
	
	
}















