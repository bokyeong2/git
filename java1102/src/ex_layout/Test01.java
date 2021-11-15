package ex_layout;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Test01 {

	/*
	 * 1. 300, 300 프레임 생성
	 * 2. 닫기 버튼 클릭 시 프로그램 종료
	 * 3. JFrame의 기본 레이아웃 BorderLayout의 5개 영역에
	 *    버튼 5개(CENTER, EAST, WEST, SOUTH, NORTH)를 부착
	 * 4. 각 버튼을 클릭하면 "xxx 클릭됨" 출력하도록 이벤트 처리
	 */
	
	public Test01() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("시험연습-2");
		f.setSize(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnCenter = new JButton("CENTER");
		f.add(btnCenter, BorderLayout.CENTER);
		btnCenter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("CENTER 버튼 클릭됨");
			}
		});

		JButton btnEast = new JButton("EAST");
		f.add(btnEast, BorderLayout.EAST);
		btnEast.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("EAST 버튼 클릭됨");
			}
		});
		
		JButton btnWest = new JButton("WEST");
		f.add(btnWest, BorderLayout.WEST);
		btnWest.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("WEST 버튼 클릭됨");
			}
		});
		
		JButton btnSouth = new JButton("SOUTH");
		f.add(btnSouth, BorderLayout.SOUTH);
		btnSouth.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("SOUTH  버튼 클릭됨");
			}
		});

		JButton btnNorth = new JButton("NORTH");
		f.add(btnNorth, BorderLayout.NORTH);
		btnNorth.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("NORTH 버튼 클릭됨");
			}
		});
		
		// 각 버튼에 대한 이벤트 처리 - 5단계
		
		
		f.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new Test01();
	}
	
}
