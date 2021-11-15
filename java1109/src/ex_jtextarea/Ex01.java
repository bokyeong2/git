package ex_jtextarea;

import java.awt.*;

import javax.swing.*;

public class Ex01 {
	
	/*
	 * JTextArea
	 */

	public Ex01() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame();
		f.setSize(320, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		// 스크롤바 장착을 위한 JScrollPane 객체 생성
//		JScrollPane scrollPane = new JScrollPane();
//		
//		// JScrollPane 객체를 JFrame 객체에 부착
//		f.add(scrollPane, BorderLayout.CENTER);
//		
//		// JTextArea 객체 생성 후 부착
//		// => 단, BorderLayout에 부착할 경우 별도의 행, 열 크기 지정 불필요!
//		JTextArea ta = new JTextArea();
//		
//		// JTextArea의 스크롤바 기능 활용을 위해 JScrollPane에 부착
//		// => JScrollPane 객체의 setViewportView() 메서드를 호출하여 파라미터로 부착할 컴포넌트 전달
//		scrollPane.setViewportView(ta);
		
		// JPanel을 사용하여 JTextArea를 부착할 경우
		// 1. JPanel 객체 생성
		JPanel p = new JPanel(); // => 기본 레이아웃 : FlowLayout
		
		// 2. JFrame의 CENTER 영역에 JPanel 부착
		f.add(p, BorderLayout.CENTER);
		
		// 3. JScrollPane 객체 생성 후 JPanel에 부착
		JScrollPane scrollPane = new JScrollPane();
		// 스크롤바 상시 표시 설정
		// => setXXXScrollBarPloicty() 메서드 사용(XXX은 Vertical 또는 Horizontal)
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		p.add(scrollPane);
		
		// 4. JTextArea 객체 생성 후 JScrollPane의 Viewport 영역에 추가
		JTextArea ta = new JTextArea(7, 25); // 행, 열 크기 설정
		scrollPane.setViewportView(ta);
		
		
		f.setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
