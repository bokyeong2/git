package ex_jtextarea;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.swing.*;

public class Test01 {
	
	/*
	 * 1. 320, 200 프레임 생성(타이틀 : "메모장")
	 * 2. 닫기 버튼 클릭 시 프로그램 종료
	 * 3. JPanmel 객체 생성하여 JFrame의 CENTER 영역에 부착
	 * 4. 상하, 좌우 Scroll 항상 보이도록 출력
	 * 5. JButton 객체 생성하여 SOUTH 영역에 부착(버튼 텍스트 : 저장)
	 * 6. 저장 버튼 클릭 시 입력된 텍스트를 가져와서 temp 폴더 내에 memo.text 파일로 출력
	 * 
	 */
	
	public Test01() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("메모장");
		f.setSize(320, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JPanel 객체 생성(CENTER 영역)
		JPanel p = new JPanel(); // 기본 레이아웃 : flowLayout
		
		// Jframe의 CENTER 영역에 JPanel 부착
		f.add(p, BorderLayout.CENTER);
		
		// JScrollPane 객체 생성 후 JPanel에 부착
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		p.add(scrollPane);
		
		// JTextArea 객체 생성 후 JScrollPane의 Viewport 영역에 추가
		JTextArea ta = new JTextArea(7, 25);  // 행, 열 크기 설정
		scrollPane.setViewportView(ta);
		
		// JButton 객체를 부착할 JPanel 객체 생성
		JPanel pSouth = new JPanel();
		f.add(pSouth, BorderLayout.SOUTH);
		
		// JButton 객체 생성하여 JPanel 부착(저장 / 불러오기)
		JButton btnSave = new JButton("저장");
		JButton btnOpen = new JButton("불러오기");
		pSouth.add(btnSave);
		pSouth.add(btnOpen);
		
		// 저장 버튼 클릭 시 입력된 텍스트를 가져와서
		// E드라이브 temp 폴더 내에 memo.txt 파일로 출력
		// => 출력 스트림과 file 객체 필요
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = ta.getText();
				
				ta.setText(str);
				ta.requestFocus();
				
				// try~resources 구문을 사용하여 PrintWriter 객체 생성(파라미터로 File 객체 전달)
				File f = new File("C:\\emp\\memo.txt");
				try (PrintWriter out = new PrintWriter(f)) {
					
					// PrintWriter 객체의 println() 메서드 호출하여 출력 내용 전달
					out.println(str);
					
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		// 불러오기 버튼 클릭 시 C 드라이브 emp 폴더 내에 
		// memo.txt 파일 내의 텍스트를 가져와서 JTextArea에 출력
		// => 입력스트림 필요
		btnOpen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				File f = new File("C:\\emp\\memo.txt");
				try (BufferedReader buffer = new BufferedReader(new FileReader(f))) {
					
					String total = ""; // 파일 내에 있는 데이터를 누적 연산할 변수
					
					String data = buffer.readLine();
					while (data != null) {
						// 입력 내용이 있을 경우
						// 받아온 데이터를 total에 저장
						total += data + "\n";
						
						 data = buffer.readLine(); // 새로운 한 줄 읽어오기
					}
					
					
					ta.setText(total);
				
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		
		
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
