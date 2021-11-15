package ex_jtextarea;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class Test02 {
	
	public Test02() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("채팅 클라이언트");
		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 중앙 영역에 채팅 메서지 출력
		// 채팅 메세지 스크롤을 위해 JScrollPane 생성 후 JTextArea 부착
		JScrollPane scriollPane = new JScrollPane();
		f.add(scriollPane, BorderLayout.CENTER);
		
		JTextArea ta = new JTextArea(); // 부착 레이아웃 BorderLayout이므로 따로 크기 지정 필요 X
		
		// 편집 불가능하도록 설정
		ta.setEditable(false);
		ta.setBackground(Color.CYAN); // 배경색 설정
		
		scriollPane.setViewportView(ta);
		
		// 하단 영역 채팅 메서지 입력 및 버튼
		// JTextField, JButton을 하나로 묶기 위해 JPanel 생성 후 부착
		JPanel pSouth = new JPanel();
		f.add(pSouth, BorderLayout.SOUTH);
		
		JTextField tf = new JTextField(15); // 부착 레이아웃 FlowLayout (JPanel 안에 만들었으므로 사이즈 지정 필요)
		
		JButton btnSend = new JButton("전송");
		pSouth.add(btnSend);
		
		JButton btnClear = new JButton("초기화");
		pSouth.add(btnClear);
		
		// 전송 버튼 클릭 및 텍스트 필드 입력 후 엔터키 입력 시 메세지 전송(JTextArea 출력)
		ActionListener inputMessageActionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// 입력 메세지 가져오기
				String str = tf.getText();
				// JTextArea 기존 내용 뒤에 출력
				ta.setText(ta.getText() + "\n" + str);
				// JTextField 입력 내용 초기화
				tf.setText("");
				// JTextField 커서 요청
				tf.requestFocus();
				
				
			}
		};
		
		// JTestFiled, JButton("전송") 이벤트 연결
		tf.addActionListener(inputMessageActionListener);
		btnSend.addActionListener(inputMessageActionListener);
		
		
		
		
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Test02();
	}

}
