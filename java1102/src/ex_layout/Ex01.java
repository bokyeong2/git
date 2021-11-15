package ex_layout;

import java.awt.*;

import javax.swing.*;

public class Ex01 {

	/*
	 * BorderLayout
	 * 
	 * 
	 * 
	 */
	
	
	public Ex01() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("레이아웃 기초");
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JButton 객체 생성
		JButton btnCenter = new JButton("CENTER");
		
		// 현재 프레임의 중앙(CENTER 영역)에 버튼 객체 추가(부착)
//		f.add(btnCenter, "Center"); // 문자열을 사용하여 영역 지정할 경우
//		f.add(btnCenter, "CENTER"); // 주의! 예외 발생 -> CENTER 문자열 틀림
		
		f.add(btnCenter, BorderLayout.CENTER); // 가급적 상수 사용 권장(상수 사용이 오류를 줄이는 방법)
		
		// 만약, 동일한 영역에 2개의 컴포넌트를 부착할 경우
		JButton btnCenter2 = new JButton("CENTER2");
//		f.add(btnCenter2, BorderLayout.CENTER); // 영역 안 다섯개의 레이아웃에 하나씩 하나씩 생성. 마지막 부착된 버튼만 화면에 나타남을 볼 수 있음
//		f.add(btnCenter2); // 영역 지정 생략시 CENTER 영역에 배치됨
		 
		// 두번째 버튼("NORTH")을 생성하여 상단(NORTH 영역)에 버튼 부착
		JButton btnNorth = new JButton("NORTH");
		f.add(btnNorth, BorderLayout.NORTH);
		
		// 버튼("EAST")을 생성하여 동쪽에 버튼 부착
		// "WEST", "SOUTH" 버튼을 생성하여 각가의 영역에 부착
		JButton btnEast = new JButton("EAST");
		f.add(btnEast, BorderLayout.EAST);

		JButton btnWest = new JButton("WEST");
		f.add(btnWest, BorderLayout.WEST);
		
		JButton btnSouth = new JButton("SOUTH");
		f.add(btnSouth, BorderLayout.SOUTH);
		
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {

		new Ex01();
		
	}

}
