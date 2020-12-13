import java.awt.BorderLayout;    //BorderLayout 객체를 생성하기 위한 클래스
import java.awt.Color;          //Color 객체를 생성하기 위한 클래스
import java.awt.Font;           //Font 객체를 생성하기 위한 클래스
import java.awt.GridLayout;  //GridLayout 객체를 생성하기 위한 클래스
import java.awt.event.ActionEvent; //ActionEvent 객체를 생성하기 위한 클래스
import java.awt.event.ActionListener; //ActionListener 객체를 생성하기 위한 클래스
import javax.swing.ButtonGroup;     //라디오 버튼 그룹을 만들떄 생성하는 클래스
import javax.swing.ImageIcon; //ImageIcon 객체를 생성하기 위한 클래스
import javax.swing.JButton;  //JButton 객체를 생성하기 위한 클래스
import javax.swing.JComboBox;  //JComboBox 객체를 생성하기 위한 클래스
import javax.swing.JFrame; //JFrame 객체를 생성하기 위한 클래스
import javax.swing.JLabel;  //JLabel 객체를 생성하기 위한 클래스
import javax.swing.JOptionPane;     //다이얼로그를 생성하기 위한 클래스     
import javax.swing.JPanel;  //JPanel 객체를 생성하기 위한 클래스
import javax.swing.JPasswordField; //패스워드를 생성하는 클래스
import javax.swing.JRadioButton;   //라디오 버튼을 생성하는 클래스
import javax.swing.JScrollPane;
import javax.swing.JTextArea;   //큰 범위의 택스트 필드를 만들때 쓰는 클래스
import javax.swing.JTextField;     //택스트 필드를 만들때 쓰는 클래스



public class Mcdelivery extends JFrame{  //JFrame을 상속받음

	JLabel d1 = new JLabel(""); //레이블을 클래스에서 생성하여 여러 클래스에 사용가능(음식이름)
	JLabel d2 = new JLabel("");
	JLabel d3 = new JLabel("");
	JLabel d4 = new JLabel("");
	JLabel d5 = new JLabel("");
	JLabel d6 = new JLabel("");
	JLabel name = new JLabel("");
	String s1,s2,s3,s4,s5,s6,s7;  //수량을 받는 변수
	int q1,q2,q3,q4,q5,q6; //돈 계산 하는 변수
	
	JTextField t1 = new JTextField(6); //장바구니 텍스트 변수들
	JTextField t2 = new JTextField(20);
	JTextField t3 = new JTextField(15);
	JTextField t4 = new JTextField(4);
	JTextField t5 = new JTextField(4);
	JTextArea t6 = new JTextArea(5, 30);
	
	
	private static final long serialVersionUID=1L;  //데이터를 보존하기 위해 사용
	private JButton b1,b2,b3,b4,b5,b6;  //JButton 변수 선언
	public Mcdelivery(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //윈도우 종료버튼 호출
		setSize(550,380);  //윈도우 크기 지정
		setTitle(title);   //윈도우 제목 지정(지정하지 않으면 화면에 보이지 않음)
		FirstView();     // 함수 실행
		setVisible(true);  //화면에 표시
	    
	}
	public void FirstView() { //함수
		
		JPanel Click =new JPanel(); //Click 패널 생성
		setContentPane(Click);  //클릭 패널에 설정
		
		
		
		
		setLayout(new GridLayout(2,3,1,1));  //2행 3열 가로 간격 1,세로간격1
		
		b1=new JButton(new ImageIcon("img/추천메뉴.jpg"));     //b1버튼 이름붙여서 이미지 객체 생성
		b2=new JButton(new ImageIcon("img/버거.jpg"));    
		b3=new JButton(new ImageIcon("img/스낵.jpg"));    
		b4=new JButton(new ImageIcon("img/음료.jpg"));    
		b5=new JButton(new ImageIcon("img/디저트.jpg"));     
		b6=new JButton(new ImageIcon("img/해피밀.jpg"));     
		
		b1.addActionListener(new ActionListener(){ // b1 버튼이 눌러지면 발생하는 행동을 정의
			public void actionPerformed(ActionEvent e) {  //이벤트 메소드 생성
				new RecomMenu();  //RecomMenu 클래스로 이동
			}
		});
		b2.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) { 
				new Burger();  
			}
		});
		b3.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) { 
				new Snack(); 
			}
		});
		b4.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {  
				new Drink();  
			}
		});
		b5.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {  
				new Disert();  
			}
		});
		b6.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {  
				new Happy();  
			}
		});
		
		Click.add(b1);   //클릭 패널 b1을 추가
		Click.add(b2);   
		Click.add(b3);
		Click.add(b4);
		Click.add(b5);
		Click.add(b6);
	
		
		setVisible(true);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mcdelivery win=new Mcdelivery("Mcdelivery"); //윈도우 제목을 지정
	}



class RecomMenu extends JFrame{      //b1버튼 눌렀을때 사용되는 클래스
	private static final long serialVersionUID = 1L;


	public JButton b1,b2,b3,b4,b5,b6;    //버튼 생성
	RecomMenu(){

		
		JPanel p1=new JPanel(new BorderLayout());     //동서남북으로 배치할때 쓰는 Layout
		p1.setBackground(Color.RED);                 //패널에 색을 칠할때 쓰는 것
		Font f1=new Font("휴먼모음T",Font.PLAIN,13);  //폰트 객체에 폰트를 심음
		
		JButton H=new JButton("홈");       
		H.setForeground(Color.white);        // 홈이라는 글씨 색을 바꿀때 사용하는 것
		H.setFont(f1);                 //적용하기위한 것
		H.setBackground(Color.RED);
		H.addActionListener(new ActionListener(){    //익명구현으로 실행한 이벤트 처리 부분
			public void actionPerformed(ActionEvent e) {  
				new Mcdelivery(null);     
			}
		});
		
		JLabel l1 = new JLabel("추천메뉴");
		l1.setForeground(Color.white);  //폰트 색상 변경
		l1.setFont(f1);          //폰트심은 걸 l1에 넣어줌
		l1.setHorizontalAlignment(JLabel.CENTER);        //가운데 정렬을 하기 위해 사용
		
		JButton J=new JButton("장바구니");        //장바구니 버튼 생성
		J.setForeground(Color.white);         
		J.setFont(f1);
		J.setBackground(Color.RED);             //배경색상을 변경
		J.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) {  
				new Jang();  
			}
		});
		
		p1.add(H,BorderLayout.WEST);
		p1.add(l1,"Center");
		p1.add(J,"East");
		
		
	
		
		JPanel p3=new JPanel(new GridLayout(6,0));    //6행0열로 패널 생성
		b1=new JButton(new ImageIcon("img/b1.jpg"));  //그림을 버튼에 넣음
		b2=new JButton(new ImageIcon("img/b2.jpg")); 
		b3=new JButton(new ImageIcon("img/b3.jpg")); 
		b4=new JButton(new ImageIcon("img/b4.jpg")); 
		b5=new JButton(new ImageIcon("img/b5.jpg")); 
		b6=new JButton(new ImageIcon("img/b6.jpg")); 
		
		b1.addActionListener(new ActionListener(){ // b1 버튼이 눌러지면 발생하는 행동을 정의
			public void actionPerformed(ActionEvent e) {  //이벤트 메소드 생성
				new Big();  //Big 클래스로 이동
			}
		});
		b2.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) { 
				new Sang();  
			}
		});
		b3.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) { 
				new Tri(); 
			}
		});
		b4.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {  
				new Gor();  
			}
		});
		b5.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {  
				new Cri();  
			}
		});
		b6.addActionListener(new ActionListener(){ 
			public void actionPerformed(ActionEvent e) {  
				new Egg();  
			}
		});
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		p3.add(b5);
		p3.add(b6);
		
	
		
		
		
		
		
		
		JPanel p=new JPanel(new BorderLayout(0,0));
		p.add(p1,BorderLayout.NORTH);
		p.add(p3,"Center");
		
		add(p);
		
		setSize(550,390);
		setTitle("추천메뉴");
		setVisible(true);
	}
	
	
}

class Big extends JFrame{
	private static final long serialVersionUID = 1L;
	Big(){
		
		JPanel bi1=new JPanel();
		
		JLabel name=new JLabel("맥딜리버리 빅맥 만원팩");
		Font f1=new Font("휴먼모음T",Font.PLAIN,13);  //폰트 객체에 폰트를 심음
		name.setForeground(Color.white);
		name.setFont(f1); 
		bi1.setBackground(Color.RED);
		bi1.add(name);
		
		JPanel bi2=new JPanel();
		JLabel img=new JLabel(new ImageIcon("img/1.jpg"));  //레이블로 이미지를 넣음
		bi2.add(img);
		
		JPanel bi3=new JPanel(new BorderLayout());
		JLabel l1=new JLabel("  가격:10000원                       수량:");
		Font f2=new Font("휴먼모음T",Font.PLAIN,12);  //폰트 객체에 폰트를 심음
		l1.setFont(f2); 
		bi3.add(l1,"West");
		
		String[] su = {"1","2","3"}; //수량
		JComboBox<String> cb = new JComboBox<String>(su);  //스크롤바를 생성
		cb.setSelectedIndex(0);     //초기값
		bi3.add(cb,"Center");
		
		JButton ok=new JButton("장바구니에 담기");
		ok.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) { 
				s1=(String)cb.getSelectedItem();         //string s1에 스크롤에 선택된 데이터 값을 넣어줌
				if(e.getSource()==ok) {           //ok가 눌러졌을때 이벤트
					if(su[0].equals(s1)) {            //수량이 1일경우
						q1=10000;                //가격은 10000원으로 지정
						d1.setText("  맥딜리버리 빅맥 만원팩 "+s1+"개"+"  "+q1+"원");  //d1의 택스트내용을 바꿔줌
					} else if(su[1].equals(s1)) {    //수량이 2일 경우
						q1=10000*2;
						d1.setText("  맥딜리버리 빅맥 만원팩 "+s1+"개"+"  "+q1+"원");
					} else if(su[2].equals(s1)) {    //수량이 3일 경우
						q1=9200*3;
						d1.setText("  맥딜리버리 빅맥 만원팩 "+s1+"개"+"  "+q1+"원");
					}
				
					new Jang(); 
				}  
			}
		});
		bi3.add(ok,"South");
		
		JPanel p=new JPanel(new BorderLayout());
		p.setBackground(Color.RED);
		p.add(bi1,"North");
		p.add(bi2,"Center");
		p.add(bi3,"South");
		add(p);
		
		setSize(310,300);
		setTitle("맥딜리버리 빅맥 만원팩");
		setVisible(true);

		
		
	}
}
class Sang extends JFrame{
	private static final long serialVersionUID = 1L;
	Sang(){
		JPanel bi1=new JPanel();
		
		JLabel name=new JLabel("맥딜리버리 상하이 만원팩");
		Font f1=new Font("휴먼모음T",Font.PLAIN,13);  //폰트 객체에 폰트를 심음
		name.setForeground(Color.white);
		name.setFont(f1); 
		bi1.setBackground(Color.RED);
		bi1.add(name);
		
		JPanel bi2=new JPanel();
		JLabel img=new JLabel(new ImageIcon("img/2.jpg"));
		bi2.add(img);
		
		JPanel bi3=new JPanel(new BorderLayout());
		JLabel l1=new JLabel("  가격:10000원                       수량:");
		Font f2=new Font("휴먼모음T",Font.PLAIN,12);  //폰트 객체에 폰트를 심음
		l1.setFont(f2); 
		bi3.add(l1,"West");
		
		String[] su = {"1","2","3"}; //수량
		JComboBox<String> cb = new JComboBox<String>(su);
		cb.setSelectedIndex(0);
		bi3.add(cb,"Center");
		
		JButton ok=new JButton("장바구니에 담기");
		ok.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) {  
				s2=(String)cb.getSelectedItem();
				if(e.getSource()==ok) {
					if(su[0].equals(s2)) {
						q2=10000; 
						d2.setText("  맥딜리버리 상하이 만원팩 "+s2+"개"+"  "+q2+"원");
					} else if(su[1].equals(s2)) {
						q2=10000*2;
						d2.setText("  맥딜리버리 상하이 만원팩 "+s2+"개"+"  "+q2+"원");
					} else if(su[2].equals(s2)) {
						q2=9200*3;
						d2.setText("  맥딜리버리 상하이 만원팩 "+s2+"개"+"  "+q2+"원");
					}
				
					new Jang(); 
				}  
			}
		});
		bi3.add(ok,"South");
		
		JPanel p=new JPanel(new BorderLayout());
		p.setBackground(Color.RED);
		p.add(bi1,"North");
		p.add(bi2,"Center");
		p.add(bi3,"South");
		add(p);
		
		setSize(310,300);
		setTitle("맥딜리버리 상하이 만원팩");
		setVisible(true);

		
		
	}
}
class Tri extends JFrame{
	
	private static final long serialVersionUID = 1L;

	Tri(){
		JPanel bi1=new JPanel();
		
		JLabel name=new JLabel("트리플 어니언 버거");
		Font f1=new Font("휴먼모음T",Font.PLAIN,13);  //폰트 객체에 폰트를 심음
		name.setForeground(Color.white);
		name.setFont(f1); 
		bi1.setBackground(Color.RED);
		bi1.add(name);
		
		JPanel bi2=new JPanel();
		JLabel img=new JLabel(new ImageIcon("img/3.jpg"));
		bi2.add(img);
		
		JPanel bi3=new JPanel(new BorderLayout());
		JLabel l1=new JLabel("  가격:9200원                       수량:");
		Font f2=new Font("휴먼모음T",Font.PLAIN,12);  //폰트 객체에 폰트를 심음
		l1.setFont(f2); 
		bi3.add(l1,"West");
		
		String[] su = {"1","2","3"}; //수량
		JComboBox<String> cb = new JComboBox<String>(su);
		cb.setSelectedIndex(0);
		bi3.add(cb,"Center");
		
		JButton ok=new JButton("장바구니에 담기");
		ok.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) {  
				s3=(String)cb.getSelectedItem();
				if(e.getSource()==ok) {
					if(su[0].equals(s3)) {
						q3=9200;
						d3.setText("  트리플 어니언 버거 "+s3+"개"+"  "+q3+"원");
					} else if(su[1].equals(s3)) {
						q3=9200*2;
						d3.setText("  트리플 어니언 버거 "+s3+"개"+"  "+q3+"원");
					} else if(su[2].equals(s3)) {
						q3=9200*3;
						d3.setText("  트리플 어니언 버거 "+s3+"개"+"  "+q3+"원");
					}
				
					new Jang(); 
				}  
			}
		});
		bi3.add(ok,"South");
		
		JPanel p=new JPanel(new BorderLayout());
		p.setBackground(Color.RED);
		p.add(bi1,"North");
		p.add(bi2,"Center");
		p.add(bi3,"South");
		add(p);
		
		setSize(310,300);
		setTitle("트리플 어니언 버거");
		setVisible(true);

		
		
	}
}
class Gor extends JFrame{
	private static final long serialVersionUID = 1L;
	Gor(){
		JPanel bi1=new JPanel();
		
		JLabel name=new JLabel("골든 에그 치즈 버거");
		Font f1=new Font("휴먼모음T",Font.PLAIN,13);  //폰트 객체에 폰트를 심음
		name.setForeground(Color.white);
		name.setFont(f1); 
		bi1.setBackground(Color.RED);
		bi1.add(name);
		
		JPanel bi2=new JPanel();
		JLabel img=new JLabel(new ImageIcon("img/4.jpg"));
		bi2.add(img);
		
		JPanel bi3=new JPanel(new BorderLayout());
		JLabel l1=new JLabel("  가격:8900원                       수량:");
		Font f2=new Font("휴먼모음T",Font.PLAIN,12);  //폰트 객체에 폰트를 심음
		l1.setFont(f2); 
		bi3.add(l1,"West");
		
		String[] su = {"1","2","3"}; //수량
		JComboBox<String> cb = new JComboBox<String>(su);
		cb.setSelectedIndex(0);
		bi3.add(cb,"Center");
		
		JButton ok=new JButton("장바구니에 담기");
		ok.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) {  
				s4=(String)cb.getSelectedItem();
				if(e.getSource()==ok) {
					if(su[0].equals(s4)) {
						q4=8900;
						d4.setText("  골든 에그 치즈 버거 "+s4+"개"+"  "+q4+"원");
					} else if(su[1].equals(s4)) {
						q4=8900*2;
						d4.setText("  골든 에그 치즈 버거 "+s4+"개"+"  "+q4+"원");
					} else if(su[2].equals(s4)) {
						q4=8900*3;
						d4.setText("  골든 에그 치즈 버거 "+s4+"개"+"  "+q4+"원");
					}
					
					new Jang(); 
				} 
			}
		});
		bi3.add(ok,"South");
		
		JPanel p=new JPanel(new BorderLayout());
		p.setBackground(Color.RED);
		p.add(bi1,"North");
		p.add(bi2,"Center");
		p.add(bi3,"South");
		add(p);
		
		setSize(310,300);
		setTitle("골든 에그 치즈 버거");
		setVisible(true);

		
		
	}
}
class Cri extends JFrame{
	private static final long serialVersionUID = 1L;
	Cri(){
		JPanel bi1=new JPanel();
		
		JLabel name=new JLabel("그릴드 머쉬룸 버거");
		Font f1=new Font("휴먼모음T",Font.PLAIN,13);  //폰트 객체에 폰트를 심음
		name.setForeground(Color.white);
		name.setFont(f1); 
		bi1.setBackground(Color.RED);
		bi1.add(name);
		
		JPanel bi2=new JPanel();
		JLabel img=new JLabel(new ImageIcon("img/5.jpg"));
		bi2.add(img);
		
		JPanel bi3=new JPanel(new BorderLayout());
		JLabel l1=new JLabel("  가격:9600원                       수량:");
		Font f2=new Font("휴먼모음T",Font.PLAIN,12);  //폰트 객체에 폰트를 심음
		l1.setFont(f2); 
		bi3.add(l1,"West");
		
		String[] su = {"1","2","3"}; //수량
		JComboBox<String> cb = new JComboBox<String>(su);
		cb.setSelectedIndex(0);
		bi3.add(cb,"Center");
		
		JButton ok=new JButton("장바구니에 담기");
		ok.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) {  
				s5=(String)cb.getSelectedItem();
				if(e.getSource()==ok) {
					if(su[0].equals(s5)) {
						q5=9600;
						d5.setText("  그릴드 머쉬룸 버거 "+s5+"개"+"  "+q5+"원");
					} else if(su[1].equals(s5)) {
						q5=9600*2;
						d5.setText("  그릴드 머쉬룸 버거 "+s5+"개"+"  "+q5+"원");
					} else if(su[2].equals(s5)) {
						q5=9600*3;
						d5.setText("  그릴드 머쉬룸 버거 "+s5+"개"+"  "+q5+"원");
					}
					
					new Jang(); 
				}  
			}
		});
		bi3.add(ok,"South");
		
		JPanel p=new JPanel(new BorderLayout());
		p.setBackground(Color.RED);
		p.add(bi1,"North");
		p.add(bi2,"Center");
		p.add(bi3,"South");
		add(p);
		
		setSize(310,300);
		setTitle("그릴드 머쉬룸 버거");
		setVisible(true);

		
		
	}
}
class Egg extends JFrame{
	private static final long serialVersionUID = 1L;
	public JButton ok=new JButton("장바구니에 담기");
	Egg(){
		
		JPanel bi1=new JPanel();
		
		JLabel name=new JLabel("에그 불고기 버거");
		Font f1=new Font("휴먼모음T",Font.PLAIN,13);  //폰트 객체에 폰트를 심음
		name.setForeground(Color.white);
		name.setFont(f1); 
		bi1.setBackground(Color.RED);
		bi1.add(name);
		
		JPanel bi2=new JPanel();
		JLabel img=new JLabel(new ImageIcon("img/6.jpg"));
		bi2.add(img);
		
		JPanel bi3=new JPanel(new BorderLayout());
		JLabel l1=new JLabel("  가격:8000원                       수량:");
		Font f2=new Font("휴먼모음T",Font.PLAIN,12);  //폰트 객체에 폰트를 심음
		l1.setFont(f2); 
		bi3.add(l1,"West");
		
		String[] su = {"1","2","3"}; //수량
		JComboBox<String> cb = new JComboBox<String>(su);
		cb.setSelectedIndex(0);
		bi3.add(cb,"Center");
		
		
		ok.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) { 
				s6=(String)cb.getSelectedItem();
				
					
				if(e.getSource()==ok) {
					if(su[0].equals(s6)) {
						q6=8000;
						d6.setText("  에그 불고기 버거 "+s6+"개"+"  "+q6+"원");
					} else if(su[1].equals(s6)) {
						q6=16000;
						d6.setText("  에그 불고기 버거 "+s6+"개"+"  "+q6+"원");
					} else if(su[2].equals(s6)) {
						q6=24000;
						d6.setText("  에그 불고기 버거 "+s6+"개"+"  "+q6+"원");
					}
					
					new Jang(); 
				}
				 
			}
		});
		
		bi3.add(ok,"South");
		
		JPanel p=new JPanel(new BorderLayout());
		p.setBackground(Color.RED);
		p.add(bi1,"North");
		p.add(bi2,"Center");
		p.add(bi3,"South");
		add(p);
		
		setSize(310,300);
		setTitle("에그 불고기 버거");
		setVisible(true);

		
		
	}
}

class Jang extends JFrame{
	private static final long serialVersionUID = 1L;

	Jang(){
		
		JPanel pan1=new JPanel(new BorderLayout());
		pan1.setBackground(Color.RED);
        Font f1=new Font("휴먼모음T",Font.PLAIN,13);  //폰트 객체에 폰트를 심음
		
		JButton H=new JButton("홈");
		H.setForeground(Color.white);
		H.setFont(f1);
		H.setBackground(Color.RED);
		H.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) {  
				new Mcdelivery(null);  
			}
		});
		
		JLabel l1=new JLabel("주문내역");
		l1.setForeground(Color.white);
		l1.setFont(f1);
		l1.setBackground(Color.RED);
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setBackground(Color.RED);
		pan1.add(H,"West");
		pan1.add(l1,"Center");
		
		JPanel pan5=new JPanel(new BorderLayout());
		JLabel l=new JLabel("주문 정보");
		pan5.setBackground(Color.WHITE);
		JPanel pan2=new JPanel(new GridLayout(7,0)); 
		pan2.setBackground(Color.WHITE);
		
		pan2.add(d1);
		pan2.add(d2);
		pan2.add(d3);
		pan2.add(d4);
		pan2.add(d5);
		pan2.add(d6);
		 
		pan2.add(new JLabel("총합은: "+(q1+q2+q3+q4+q5+q6)+"원"));  //레이블에 총합 얼마인지 넣어줌
		pan5.add(l,"West");
		pan5.add(pan2,"Center");
		
		
	
		
		JPanel pan3=new JPanel();
		pan3.setBackground(Color.WHITE);
		JButton b1=new JButton("아이템 추가");
		b1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) {  
				new RecomMenu();  
			}
		});
		JButton b2=new JButton("다음");
		b2.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) {  
				new Jumun();  
			}
		});
		pan3.add(b1);
		pan3.add(b2);
		JPanel p=new JPanel(new BorderLayout());
		
		p.add(pan1,"North");
		p.add(pan5,"Center");
		p.add(pan3,"South");
		add(p);
		
		
		
		setSize(315,290);
		setTitle("주문 내역");
		setVisible(true);
		
	}

	
}
class Jumun extends JFrame{

	private static final long serialVersionUID = 1L;

	Jumun(){
		Font f1=new Font("휴먼모음T",Font.PLAIN,13);
		JPanel pan1=new JPanel();
		pan1.setBackground(Color.RED);
		JLabel title=new JLabel("주문");
		title.setForeground(Color.white);
		title.setFont(f1);
		title.setBackground(Color.RED);
		title.setHorizontalAlignment(JLabel.CENTER);
		pan1.add(title);
		
		JPanel pan2=new JPanel(new GridLayout(5,0));
		JLabel l1=new JLabel("이름 ");

		JLabel l2=new JLabel("주소 ");
	
		JLabel l3=new JLabel("\n휴대전화 번호: ");
		 String phone [] = {"010", "011", "016", "017", "018", "019", "070"};  
		JComboBox<String> c = new JComboBox<String>(phone);
		JLabel l4=new JLabel("-");
		
		JLabel l5=new JLabel("-");

		JPasswordField pwd=new JPasswordField(4);
		pwd.setEchoChar('*');
		JLabel l6=new JLabel("계산 방법");
		JRadioButton r1=new JRadioButton("현금");   //라디오 버튼을 추가
		JRadioButton r2=new JRadioButton("카드");
		JRadioButton r3=new JRadioButton("수표");
		ButtonGroup bg=new ButtonGroup();   //버튼 그룹을 생성
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		JLabel l7=new JLabel("배달시 요청사항");
		
		
		
		
		JPanel pan4=new JPanel();
		pan4.add(l1);
		pan4.add(t1);
		JPanel pan5=new JPanel();
		pan5.add(l2);
		JPanel pan9=new JPanel(new GridLayout(2,0));
		pan9.add(t2);
		pan9.add(t3);
		pan5.add(pan9);
		
		
		JPanel pan6=new JPanel();
		pan6.add(l3);
		pan6.add(c);
		pan6.add(l4);
		pan6.add(t4);
		pan6.add(l5);
		pan6.add(pwd);
		JPanel pan7=new JPanel();
		pan7.add(l6);
		pan7.add(r1);
		pan7.add(r2);
		pan7.add(r3);
		JPanel pan8=new JPanel(new BorderLayout());
		pan8.add(l7,"West");
		pan8.add(new JScrollPane(t6),"Center");
		
		
		
		pan2.add(pan4);
		pan2.add(pan5);
		pan2.add(pan6);
		pan2.add(pan7);
		pan2.add(pan8);
		
		
		add(pan1);
		add(pan2);
		
		
		JPanel pan3=new JPanel();
		JButton ok=new JButton("주문하기");
		ok.addActionListener(new ActionListener(){  
			JFrame frame;           //Jframe형식으로 다이얼로그를 만들기 위해 생성
			public void actionPerformed(ActionEvent e) { 
				
				s7=(String)c.getSelectedItem();   //핸드폰 번호 스크롤 선택된것 

				String str="선택되지 않았습니다.";       //string변수를 선언함
				if(r1.isSelected()) {           //r1이 선택되었을때
					str=r1.getText();          //r1을 string 변수에 넣음
				}
				else if(r2.isSelected()) {
					str=r2.getText();				
				}
				else if(r3.isSelected()) {
					str=r3.getText();				
				}
				String n1=t1.getText();        //택스트 필드 t1의 값은 n1으로 넣음
				
				String n2=t2.getText();
				
				String n3=t3.getText();
				
				String n4=t4.getText();
				
				String n5="****";
			
				String n6=t6.getText();
			
				
				 //다이얼로그를 생성함(마지막결과 값이라서 다이얼로그를 사용)
				JOptionPane.showMessageDialog(frame,"주문확인\n"+"이름: "+n1+"\n"+"주소: "+n2+" "+n3+"\n"+"핸드폰 번호: "
				+s7+"-"+n4+"-"+n5+"\n"+"계산 방법: "+str+"\n"+"배달시 요청사항: "+n6+"\n"+"가격은: "+(q1+q2+q3+q4+q5+q6)+"원");

			}
		});
		pan3.add(ok);
		
		JPanel p=new JPanel(new BorderLayout());
		p.add(pan1,"North");
		p.add(pan2,"Center");
		p.add(pan3,"South");
		add(p);
		
		
		
		setSize(350,380);
		setTitle("주문");
		setVisible(true);
	}
}

	
}

class Burger extends JFrame { 

	private static final long serialVersionUID = 1L;

	Burger(){
		
		JLabel label=new JLabel(new ImageIcon("img/준비중입니다.gif"));
		add(label);
		setSize(315,290);
		setTitle("버거&세트");
		setVisible(true);
	}
	
	
}
class Snack extends JFrame { 

	private static final long serialVersionUID = 1L;

	Snack(){
		
		JLabel label=new JLabel(new ImageIcon("img/준비중입니다.gif"));
		add(label);
		
		setSize(315,290);
		setTitle("스낵&사이드");
		setVisible(true);
	}
	
	
}
class Drink extends JFrame {  

	private static final long serialVersionUID = 1L;

	Drink(){
		
		JLabel label=new JLabel(new ImageIcon("img/준비중입니다.gif"));
		add(label);
		
		setSize(315,290);
		setTitle("음료");
		setVisible(true);
	}
	
	
}
class Disert extends JFrame {  
	
	private static final long serialVersionUID = 1L;

	Disert(){
	
		JLabel label=new JLabel(new ImageIcon("img/준비중입니다.gif"));
		add(label);
		
		setSize(315,290);
		setTitle("디저트");
		setVisible(true);
	}
	
	
}
class Happy extends JFrame {  

	private static final long serialVersionUID = 1L;

	Happy(){
	
		JLabel label=new JLabel(new ImageIcon("img/준비중입니다.gif"));
		add(label);
		
		setSize(315,290);
		setTitle("해피밀");
		setVisible(true);
	}
	
	
}

