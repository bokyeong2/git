package ex_componet;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ex01 {
	/*
	 * JTextField
	 */
	
	
	public Ex01() {
		showFrame();
	}

	public void showFrame() {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JTextField 객체 생성
		JTextField tf = new JTextField();
		
		// JFrame 객체의 Center 영역에 부착
		f.add(tf, BorderLayout.CENTER);
		
		
		// JButton 객체 생성 후 JFrame 객체의 South 영역에 부착
		JButton btn = new JButton("입력");
		f.add(btn, BorderLayout.SOUTH);
		
		// JButton 객체 이벤트 처리
//		btn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// JTextField에 입력된 텍스트 가져오기
//				String str = tf.getText(); // 텍스트 가져오기
//				System.out.println(str);
//				
//				tf.setText(""); // 널스트링 값 설정 = 입력된 텍스트 초기화
//				
//				// 입력 작업 완료 후 텍스트 초기화 끝난 뒤 다시 입력을 위해 커서 요청할 경우
//				tf.requestFocus(); // 커서 위치가 불러온 컴포넌트로 이동되는 걸 볼 수 있음
//			}
//		});
		
		// JTextField 컴포넌트의 엔터키 입력에 대한 이벤트 처리
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// JTextField에 입력된 텍스트 가져오기
				String str = tf.getText(); // 텍스트 가져오기
				System.out.println(str);
				
				tf.setText(""); // 널스트링 값 설정 = 입력된 텍스트 초기화
				
				// 입력 작업 완료 후 텍스트 초기화 끝난 뒤 다시 입력을 위해 커서 요청할 경우
				tf.requestFocus(); // 커서 위치가 불러온 컴포넌트로 이동되는 걸 볼 수 있음
			}
		};
		
		btn.addActionListener(listener);
		tf.addActionListener(listener);
		
		
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {

		new Ex01();
	}

}
