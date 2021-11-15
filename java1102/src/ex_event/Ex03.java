package ex_event;

import java.awt.event.*;

import javax.swing.*;

public class Ex03 {
	
	/*
	 * < 이벤트 처리 5단계 >
	 * 3. 내부클래스(Inner Class) 형태로 정의
	 *    - 리스너 인터페이스 또는 어댑터 클래스 구현 시 내부클래스 형태로 구현하여 사용
	 *      => 이벤트 리스너 구현체(핸들러 클래스)는 보통 GUI 클래스에서만 사용
	 *         따라서, 별도의 클래스로 외부에 정의하기보다는 내부클래스 형태로 정의해서 사용
	 *         GUI 클래스 내부에 핸들러 클래스를 정의하면 내부클래스가 됨
	 *    - 외부에 정의하는 방법과 클래스 모양은 동일하나 크랠스 정의 위치만 달라짐
	 *    
	 * [ 위치에 따른 차이점 ]
	 * 1) 멤버 레벨에 정의하는 멤버 내부 클래스
	 *    => 멤버 변수의 성격과 동일한 클래스가 됨(= 접근 범위가 멤버변수와 동일해짐)
	 *    
	 * 2) 메서드 내부에 정의하는 로컬 내부 클래스
	 *    => 로컬 변수의 성격과 동일한 클래스가 됨(= 접근 범위가 로컬변수와 동일해짐)
	 */
	
	public Ex03() {
		showFrame();
	}
	
	public void showFrame() {
		
		JFrame f = new JFrame("이벤트처리-3");
		f.setSize(300, 200);
		
		// 이벤트 처리 3단계
		// 내부클래스(Inner Class) 형테로 정의 - 로컬 내부 클래스 형태로 정의
		// => 로컬 변수와 동일한 범위에서만 접근 가능
		class MyLocalWindowAdapter extends WindowAdapter {

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing");
				System.exit(0);
			}
			
			
		}
		
		// 현재 프레임에 WindowAdapter 구현체 연결
		
		// 1. 핸들러 객체 생성
		MyLocalWindowAdapter listener = new MyLocalWindowAdapter();
		
		// 2. 이벤트 연결을 위한 대상 객체의  addXXXListener() 메서드를 호출하여
		//    파라미터로 핸들러 객체를 전달 => 연결 완료
		f.addWindowFocusListener(listener);
		
		f.setVisible(true);
		
	}
	
	public void showFrame2() {
		// 메서드가 달라지면 로컬 내부클래스는 접근이 불가능하므로
		// 여러 메서드에서 하나의 리스너를 공유하려면 멤버 내부 클래스 형태로 정의!
		
		
//		MyLocalWindowAdapter listener; // 접근 불가
		
		MyMemberWindowAdapter listener;
	}
	

	public static void main(String[] args) {
		
		new Ex03();
		
	}
	
	// 이벤트 처리 3단계
	// 내부클래스 형태로 정의 - 멤버 내부 클래스 형태로 정의
	// => 인스턴스 멤버와 동일한 위치에 정의하므로 인스턴스 내부 클래스라고도 함
	// => 인스턴스 내의 여러 메서드에서 공유 가능
	class MyMemberWindowAdapter extends WindowAdapter {

		@Override
		public void windowClosing(WindowEvent e) {
			
			System.out.println("windowClosing");
			System.exit(0);
		}
		
	}
	

}
