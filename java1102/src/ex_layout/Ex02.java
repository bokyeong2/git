package ex_layout;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ex02 {
	
	public Ex02() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("시험연습-2");
		f.setSize(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnCenter = new JButton("CENTER");
		f.add(btnCenter, BorderLayout.CENTER);

		JButton btnEast = new JButton("EAST");
		f.add(btnEast, BorderLayout.EAST);
		
		JButton btnWest = new JButton("WEST");
		f.add(btnWest, BorderLayout.WEST);
		
		JButton btnSouth = new JButton("SOUTH");
		f.add(btnSouth, BorderLayout.SOUTH);

		JButton btnNorth = new JButton("NORTH");
		f.add(btnNorth, BorderLayout.NORTH);
		
		// 각 버튼에 대한 이벤트 처리 - 4단계
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				// 전달된 버튼 객체가 ActionEvent 타입으로 변환되어 전달되므로
				// 각 버튼을  ActionEvent 객체(e)와 비교해야함
				// => e.getSource() 리턴값을 JButton 객체와 비교하거나 JButton 타입으로 형변환
				JButton btn = (JButton) e.getSource();
				// 만약, 각 버튼에 대한 테스트 정보만 필요할 경우
				// => getActionCommand() 또는 getText() 활용
				System.out.println(btn.getActionCommand() + " 버튼 클릭됨");
				
				// -------------------------------------------------
				// 조건식의 동등비교연산을 통해 버튼 객체와 e.getSource() 결과 비교
				// => 같을 경우 해당 버튼임을 증명하게 됨
				// => 주로, 특정 버튼에 따라 서로 다른 작업을 수행해야할 경우 사용하는 방법 (각각의 버튼마다 다른 작업을 수행하려할 때 코드들을 각각 따로 작성)
//				if (btnCenter == e.getSource()) {
//					// CENTER 버튼 클릭 시 수행할 작업들을 명시...
//				} else if (btnEast == e.getSource()) {
//					// EAST 버튼 클릭 시 수행할 작업들을 명시...
//				} else if (btnWest == e.getSource()) {
//					// WEST 버튼 클릭 시 수행할 작업들을 명시...
//				}
				
			}
		};
		
		// 각 버튼에 리스너 4단계 연결
		btnCenter.addActionListener(listener);
		btnEast.addActionListener(listener);
		btnWest.addActionListener(listener);
		btnSouth.addActionListener(listener);
		btnNorth.addActionListener(listener);
		
		
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Ex02();
	}

}
