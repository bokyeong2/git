package ex_event;

import java.awt.event.*;

import javax.swing.*;

public class Ex05 {
	
	/*
	 * < 이벤트 처리 5단계 >
	 * 5단계. 익명 내부클래스(Anonymous Inner Class)의 임시 객체 형태로 사용
	 * - 기본적인 개념은 익명 내부클래스와 동일하나 이벤트 처리 대상이 하나뿐인 경우
	 *   별도의 변수가 필요없으므로 변수 선언부를 제외하고 리스너 연결을 위한 addXXXListener()
	 *   메서드의 파라미터로 익명 내부클래스를 구현하는 코드를 바로 기술하여 객체를 전달
	 *   - 별도의 변수가 없으므로 두 개 이상의 컴포넌트에 리스너 연결이 불가능함
	 *     => 즉 1회용 리스너 객체가 됨!
	 *   - 리스너 인스턴스 생성 및 추상클래스 구현과 함께 연결 작업까지 한꺼번에 수행
	 *   - 동일한 이벤트를 다른 대상에 적용해야할 경우 중복되는 코드가 발생함!
	 *     => 4단계 방법이 더 효율적
	 *     
	 * < 기본 문법 >
	 * xxx.addXXXListener(new 리스너이름() {
	 * 		// 추상메서드 구현...
	 * 
	 * });   
	 *  
	 */
	
	public Ex05() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("이벤트처리-5");
		f.setSize(500, 400);
		
		// 현재 프레임에 WindowAdapter 구현체 연결
		// => addXXXListener() 메서드에 리스너를 바로 구현
		
		// 이벤트 연결을 위한 대상 객체의 addXXXListener() 메서드를 호출하여
		// 파라미터 로 리스너 구현 코드를 전달하여 이벤트 연결까지 한꺼번에 수행
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println(" windowClosing");
				System.exit(0);
			}
			
			
			
		});
		
		// 주의! 새로운 프레임 객체에 WindowListener를 연결해야하는 경우 (추가해야할 경우 다시 코드 작성해야함 , 동일한 객체를 여러개 연결할 경우 4단계가 더 편리)
		// => 다시 리스너 구현 코드를 작성해야한다.
//		f2.addWindowListener(new WindowAdapter() {
//			// 추상메서드 구현...
//		});
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

}
















