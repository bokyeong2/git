package ex_jpanel;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ex01 {
	
	/*
	 * JPanel
	 */

	public Ex01() {
		showFrame();
	}
	
	public void showFrame() {
		
		JFrame f = new JFrame();
		f.setSize(300, 150);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 프레임의 CENTER 영역에 JTextField와 JButton 컴포넌트를 하나로 묶어서 부착
		// => 복수개의 컴포넌트를 묶기 위해서 JPanel 사용
		
		// 1. JPanel 객체 생성
		JPanel p = new JPanel();
		// 2. JPanel 컨테이너를 JFrame 컨테이너의 CENTER 영역에 부착(나중에 부착해도 상관 없음)
		f.add(p, BorderLayout.CENTER);
		
		//3.JTextField와 JButton 객체를 생성
		// => 주의! FlowLayout을 갖는 JPanel에 JTextField를 부착하는 경우
		//    반드시 JTextField의 컬럼크기 설정 필수!
		JTextField tf = new JTextField(15); // 컬럼 크기를 15로 설정
		JButton btn = new JButton("확인");
		
		// 4. JTextField와 JButton 객체를 JPanel에 부착
		p.add(tf);
		p.add(btn);
		
		// 리스너 연결
		// JTextField에 입력된 텍스트를 가져와서 출력
		// 버튼을 클릭, 엔터키를 입력 출력!
		
		
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// JTextField에 입력된 데이터를 가져와서 출력 후 텍스트 초기화
				String str = tf.getText(); // 텍스트 가져오기
				System.out.println(str);
				
				tf.setText(""); // 널스트링("")값 설정 = 입력된 텍스트 초기화
				
				// 입력 작업 완료 후 텍스트 초기화 끝난 뒤 다시 입력을 위해 커서 요청
				tf.requestFocus();
			}
		};
		
		// 미리 구현된 4단계 리스너 객체를 파라미터로 사용하여 리스너 연결
		btn.addActionListener(listener);
		tf.addActionListener(listener);
		
		f.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Ex01();
	}

}
