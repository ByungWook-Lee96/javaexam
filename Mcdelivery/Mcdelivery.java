import java.awt.BorderLayout;    //BorderLayout ��ü�� �����ϱ� ���� Ŭ����
import java.awt.Color;          //Color ��ü�� �����ϱ� ���� Ŭ����
import java.awt.Font;           //Font ��ü�� �����ϱ� ���� Ŭ����
import java.awt.GridLayout;  //GridLayout ��ü�� �����ϱ� ���� Ŭ����
import java.awt.event.ActionEvent; //ActionEvent ��ü�� �����ϱ� ���� Ŭ����
import java.awt.event.ActionListener; //ActionListener ��ü�� �����ϱ� ���� Ŭ����
import javax.swing.ButtonGroup;     //���� ��ư �׷��� ���鋚 �����ϴ� Ŭ����
import javax.swing.ImageIcon; //ImageIcon ��ü�� �����ϱ� ���� Ŭ����
import javax.swing.JButton;  //JButton ��ü�� �����ϱ� ���� Ŭ����
import javax.swing.JComboBox;  //JComboBox ��ü�� �����ϱ� ���� Ŭ����
import javax.swing.JFrame; //JFrame ��ü�� �����ϱ� ���� Ŭ����
import javax.swing.JLabel;  //JLabel ��ü�� �����ϱ� ���� Ŭ����
import javax.swing.JOptionPane;     //���̾�α׸� �����ϱ� ���� Ŭ����     
import javax.swing.JPanel;  //JPanel ��ü�� �����ϱ� ���� Ŭ����
import javax.swing.JPasswordField; //�н����带 �����ϴ� Ŭ����
import javax.swing.JRadioButton;   //���� ��ư�� �����ϴ� Ŭ����
import javax.swing.JScrollPane;
import javax.swing.JTextArea;   //ū ������ �ý�Ʈ �ʵ带 ���鶧 ���� Ŭ����
import javax.swing.JTextField;     //�ý�Ʈ �ʵ带 ���鶧 ���� Ŭ����



public class Mcdelivery extends JFrame{  //JFrame�� ��ӹ���

	JLabel d1 = new JLabel(""); //���̺��� Ŭ�������� �����Ͽ� ���� Ŭ������ ��밡��(�����̸�)
	JLabel d2 = new JLabel("");
	JLabel d3 = new JLabel("");
	JLabel d4 = new JLabel("");
	JLabel d5 = new JLabel("");
	JLabel d6 = new JLabel("");
	JLabel name = new JLabel("");
	String s1,s2,s3,s4,s5,s6,s7;  //������ �޴� ����
	int q1,q2,q3,q4,q5,q6; //�� ��� �ϴ� ����
	
	JTextField t1 = new JTextField(6); //��ٱ��� �ؽ�Ʈ ������
	JTextField t2 = new JTextField(20);
	JTextField t3 = new JTextField(15);
	JTextField t4 = new JTextField(4);
	JTextField t5 = new JTextField(4);
	JTextArea t6 = new JTextArea(5, 30);
	
	
	private static final long serialVersionUID=1L;  //�����͸� �����ϱ� ���� ���
	private JButton b1,b2,b3,b4,b5,b6;  //JButton ���� ����
	public Mcdelivery(String title) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //������ �����ư ȣ��
		setSize(550,380);  //������ ũ�� ����
		setTitle(title);   //������ ���� ����(�������� ������ ȭ�鿡 ������ ����)
		FirstView();     // �Լ� ����
		setVisible(true);  //ȭ�鿡 ǥ��
	    
	}
	public void FirstView() { //�Լ�
		
		JPanel Click =new JPanel(); //Click �г� ����
		setContentPane(Click);  //Ŭ�� �гο� ����
		
		
		
		
		setLayout(new GridLayout(2,3,1,1));  //2�� 3�� ���� ���� 1,���ΰ���1
		
		b1=new JButton(new ImageIcon("img/��õ�޴�.jpg"));     //b1��ư �̸��ٿ��� �̹��� ��ü ����
		b2=new JButton(new ImageIcon("img/����.jpg"));    
		b3=new JButton(new ImageIcon("img/����.jpg"));    
		b4=new JButton(new ImageIcon("img/����.jpg"));    
		b5=new JButton(new ImageIcon("img/����Ʈ.jpg"));     
		b6=new JButton(new ImageIcon("img/���ǹ�.jpg"));     
		
		b1.addActionListener(new ActionListener(){ // b1 ��ư�� �������� �߻��ϴ� �ൿ�� ����
			public void actionPerformed(ActionEvent e) {  //�̺�Ʈ �޼ҵ� ����
				new RecomMenu();  //RecomMenu Ŭ������ �̵�
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
		
		Click.add(b1);   //Ŭ�� �г� b1�� �߰�
		Click.add(b2);   
		Click.add(b3);
		Click.add(b4);
		Click.add(b5);
		Click.add(b6);
	
		
		setVisible(true);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mcdelivery win=new Mcdelivery("Mcdelivery"); //������ ������ ����
	}



class RecomMenu extends JFrame{      //b1��ư �������� ���Ǵ� Ŭ����
	private static final long serialVersionUID = 1L;


	public JButton b1,b2,b3,b4,b5,b6;    //��ư ����
	RecomMenu(){

		
		JPanel p1=new JPanel(new BorderLayout());     //������������ ��ġ�Ҷ� ���� Layout
		p1.setBackground(Color.RED);                 //�гο� ���� ĥ�Ҷ� ���� ��
		Font f1=new Font("�޸ո���T",Font.PLAIN,13);  //��Ʈ ��ü�� ��Ʈ�� ����
		
		JButton H=new JButton("Ȩ");       
		H.setForeground(Color.white);        // Ȩ�̶�� �۾� ���� �ٲܶ� ����ϴ� ��
		H.setFont(f1);                 //�����ϱ����� ��
		H.setBackground(Color.RED);
		H.addActionListener(new ActionListener(){    //�͸������� ������ �̺�Ʈ ó�� �κ�
			public void actionPerformed(ActionEvent e) {  
				new Mcdelivery(null);     
			}
		});
		
		JLabel l1 = new JLabel("��õ�޴�");
		l1.setForeground(Color.white);  //��Ʈ ���� ����
		l1.setFont(f1);          //��Ʈ���� �� l1�� �־���
		l1.setHorizontalAlignment(JLabel.CENTER);        //��� ������ �ϱ� ���� ���
		
		JButton J=new JButton("��ٱ���");        //��ٱ��� ��ư ����
		J.setForeground(Color.white);         
		J.setFont(f1);
		J.setBackground(Color.RED);             //�������� ����
		J.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) {  
				new Jang();  
			}
		});
		
		p1.add(H,BorderLayout.WEST);
		p1.add(l1,"Center");
		p1.add(J,"East");
		
		
	
		
		JPanel p3=new JPanel(new GridLayout(6,0));    //6��0���� �г� ����
		b1=new JButton(new ImageIcon("img/b1.jpg"));  //�׸��� ��ư�� ����
		b2=new JButton(new ImageIcon("img/b2.jpg")); 
		b3=new JButton(new ImageIcon("img/b3.jpg")); 
		b4=new JButton(new ImageIcon("img/b4.jpg")); 
		b5=new JButton(new ImageIcon("img/b5.jpg")); 
		b6=new JButton(new ImageIcon("img/b6.jpg")); 
		
		b1.addActionListener(new ActionListener(){ // b1 ��ư�� �������� �߻��ϴ� �ൿ�� ����
			public void actionPerformed(ActionEvent e) {  //�̺�Ʈ �޼ҵ� ����
				new Big();  //Big Ŭ������ �̵�
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
		setTitle("��õ�޴�");
		setVisible(true);
	}
	
	
}

class Big extends JFrame{
	private static final long serialVersionUID = 1L;
	Big(){
		
		JPanel bi1=new JPanel();
		
		JLabel name=new JLabel("�Ƶ������� ��� ������");
		Font f1=new Font("�޸ո���T",Font.PLAIN,13);  //��Ʈ ��ü�� ��Ʈ�� ����
		name.setForeground(Color.white);
		name.setFont(f1); 
		bi1.setBackground(Color.RED);
		bi1.add(name);
		
		JPanel bi2=new JPanel();
		JLabel img=new JLabel(new ImageIcon("img/1.jpg"));  //���̺�� �̹����� ����
		bi2.add(img);
		
		JPanel bi3=new JPanel(new BorderLayout());
		JLabel l1=new JLabel("  ����:10000��                       ����:");
		Font f2=new Font("�޸ո���T",Font.PLAIN,12);  //��Ʈ ��ü�� ��Ʈ�� ����
		l1.setFont(f2); 
		bi3.add(l1,"West");
		
		String[] su = {"1","2","3"}; //����
		JComboBox<String> cb = new JComboBox<String>(su);  //��ũ�ѹٸ� ����
		cb.setSelectedIndex(0);     //�ʱⰪ
		bi3.add(cb,"Center");
		
		JButton ok=new JButton("��ٱ��Ͽ� ���");
		ok.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) { 
				s1=(String)cb.getSelectedItem();         //string s1�� ��ũ�ѿ� ���õ� ������ ���� �־���
				if(e.getSource()==ok) {           //ok�� ���������� �̺�Ʈ
					if(su[0].equals(s1)) {            //������ 1�ϰ��
						q1=10000;                //������ 10000������ ����
						d1.setText("  �Ƶ������� ��� ������ "+s1+"��"+"  "+q1+"��");  //d1�� �ý�Ʈ������ �ٲ���
					} else if(su[1].equals(s1)) {    //������ 2�� ���
						q1=10000*2;
						d1.setText("  �Ƶ������� ��� ������ "+s1+"��"+"  "+q1+"��");
					} else if(su[2].equals(s1)) {    //������ 3�� ���
						q1=9200*3;
						d1.setText("  �Ƶ������� ��� ������ "+s1+"��"+"  "+q1+"��");
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
		setTitle("�Ƶ������� ��� ������");
		setVisible(true);

		
		
	}
}
class Sang extends JFrame{
	private static final long serialVersionUID = 1L;
	Sang(){
		JPanel bi1=new JPanel();
		
		JLabel name=new JLabel("�Ƶ������� ������ ������");
		Font f1=new Font("�޸ո���T",Font.PLAIN,13);  //��Ʈ ��ü�� ��Ʈ�� ����
		name.setForeground(Color.white);
		name.setFont(f1); 
		bi1.setBackground(Color.RED);
		bi1.add(name);
		
		JPanel bi2=new JPanel();
		JLabel img=new JLabel(new ImageIcon("img/2.jpg"));
		bi2.add(img);
		
		JPanel bi3=new JPanel(new BorderLayout());
		JLabel l1=new JLabel("  ����:10000��                       ����:");
		Font f2=new Font("�޸ո���T",Font.PLAIN,12);  //��Ʈ ��ü�� ��Ʈ�� ����
		l1.setFont(f2); 
		bi3.add(l1,"West");
		
		String[] su = {"1","2","3"}; //����
		JComboBox<String> cb = new JComboBox<String>(su);
		cb.setSelectedIndex(0);
		bi3.add(cb,"Center");
		
		JButton ok=new JButton("��ٱ��Ͽ� ���");
		ok.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) {  
				s2=(String)cb.getSelectedItem();
				if(e.getSource()==ok) {
					if(su[0].equals(s2)) {
						q2=10000; 
						d2.setText("  �Ƶ������� ������ ������ "+s2+"��"+"  "+q2+"��");
					} else if(su[1].equals(s2)) {
						q2=10000*2;
						d2.setText("  �Ƶ������� ������ ������ "+s2+"��"+"  "+q2+"��");
					} else if(su[2].equals(s2)) {
						q2=9200*3;
						d2.setText("  �Ƶ������� ������ ������ "+s2+"��"+"  "+q2+"��");
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
		setTitle("�Ƶ������� ������ ������");
		setVisible(true);

		
		
	}
}
class Tri extends JFrame{
	
	private static final long serialVersionUID = 1L;

	Tri(){
		JPanel bi1=new JPanel();
		
		JLabel name=new JLabel("Ʈ���� ��Ͼ� ����");
		Font f1=new Font("�޸ո���T",Font.PLAIN,13);  //��Ʈ ��ü�� ��Ʈ�� ����
		name.setForeground(Color.white);
		name.setFont(f1); 
		bi1.setBackground(Color.RED);
		bi1.add(name);
		
		JPanel bi2=new JPanel();
		JLabel img=new JLabel(new ImageIcon("img/3.jpg"));
		bi2.add(img);
		
		JPanel bi3=new JPanel(new BorderLayout());
		JLabel l1=new JLabel("  ����:9200��                       ����:");
		Font f2=new Font("�޸ո���T",Font.PLAIN,12);  //��Ʈ ��ü�� ��Ʈ�� ����
		l1.setFont(f2); 
		bi3.add(l1,"West");
		
		String[] su = {"1","2","3"}; //����
		JComboBox<String> cb = new JComboBox<String>(su);
		cb.setSelectedIndex(0);
		bi3.add(cb,"Center");
		
		JButton ok=new JButton("��ٱ��Ͽ� ���");
		ok.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) {  
				s3=(String)cb.getSelectedItem();
				if(e.getSource()==ok) {
					if(su[0].equals(s3)) {
						q3=9200;
						d3.setText("  Ʈ���� ��Ͼ� ���� "+s3+"��"+"  "+q3+"��");
					} else if(su[1].equals(s3)) {
						q3=9200*2;
						d3.setText("  Ʈ���� ��Ͼ� ���� "+s3+"��"+"  "+q3+"��");
					} else if(su[2].equals(s3)) {
						q3=9200*3;
						d3.setText("  Ʈ���� ��Ͼ� ���� "+s3+"��"+"  "+q3+"��");
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
		setTitle("Ʈ���� ��Ͼ� ����");
		setVisible(true);

		
		
	}
}
class Gor extends JFrame{
	private static final long serialVersionUID = 1L;
	Gor(){
		JPanel bi1=new JPanel();
		
		JLabel name=new JLabel("��� ���� ġ�� ����");
		Font f1=new Font("�޸ո���T",Font.PLAIN,13);  //��Ʈ ��ü�� ��Ʈ�� ����
		name.setForeground(Color.white);
		name.setFont(f1); 
		bi1.setBackground(Color.RED);
		bi1.add(name);
		
		JPanel bi2=new JPanel();
		JLabel img=new JLabel(new ImageIcon("img/4.jpg"));
		bi2.add(img);
		
		JPanel bi3=new JPanel(new BorderLayout());
		JLabel l1=new JLabel("  ����:8900��                       ����:");
		Font f2=new Font("�޸ո���T",Font.PLAIN,12);  //��Ʈ ��ü�� ��Ʈ�� ����
		l1.setFont(f2); 
		bi3.add(l1,"West");
		
		String[] su = {"1","2","3"}; //����
		JComboBox<String> cb = new JComboBox<String>(su);
		cb.setSelectedIndex(0);
		bi3.add(cb,"Center");
		
		JButton ok=new JButton("��ٱ��Ͽ� ���");
		ok.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) {  
				s4=(String)cb.getSelectedItem();
				if(e.getSource()==ok) {
					if(su[0].equals(s4)) {
						q4=8900;
						d4.setText("  ��� ���� ġ�� ���� "+s4+"��"+"  "+q4+"��");
					} else if(su[1].equals(s4)) {
						q4=8900*2;
						d4.setText("  ��� ���� ġ�� ���� "+s4+"��"+"  "+q4+"��");
					} else if(su[2].equals(s4)) {
						q4=8900*3;
						d4.setText("  ��� ���� ġ�� ���� "+s4+"��"+"  "+q4+"��");
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
		setTitle("��� ���� ġ�� ����");
		setVisible(true);

		
		
	}
}
class Cri extends JFrame{
	private static final long serialVersionUID = 1L;
	Cri(){
		JPanel bi1=new JPanel();
		
		JLabel name=new JLabel("�׸��� �ӽ��� ����");
		Font f1=new Font("�޸ո���T",Font.PLAIN,13);  //��Ʈ ��ü�� ��Ʈ�� ����
		name.setForeground(Color.white);
		name.setFont(f1); 
		bi1.setBackground(Color.RED);
		bi1.add(name);
		
		JPanel bi2=new JPanel();
		JLabel img=new JLabel(new ImageIcon("img/5.jpg"));
		bi2.add(img);
		
		JPanel bi3=new JPanel(new BorderLayout());
		JLabel l1=new JLabel("  ����:9600��                       ����:");
		Font f2=new Font("�޸ո���T",Font.PLAIN,12);  //��Ʈ ��ü�� ��Ʈ�� ����
		l1.setFont(f2); 
		bi3.add(l1,"West");
		
		String[] su = {"1","2","3"}; //����
		JComboBox<String> cb = new JComboBox<String>(su);
		cb.setSelectedIndex(0);
		bi3.add(cb,"Center");
		
		JButton ok=new JButton("��ٱ��Ͽ� ���");
		ok.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) {  
				s5=(String)cb.getSelectedItem();
				if(e.getSource()==ok) {
					if(su[0].equals(s5)) {
						q5=9600;
						d5.setText("  �׸��� �ӽ��� ���� "+s5+"��"+"  "+q5+"��");
					} else if(su[1].equals(s5)) {
						q5=9600*2;
						d5.setText("  �׸��� �ӽ��� ���� "+s5+"��"+"  "+q5+"��");
					} else if(su[2].equals(s5)) {
						q5=9600*3;
						d5.setText("  �׸��� �ӽ��� ���� "+s5+"��"+"  "+q5+"��");
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
		setTitle("�׸��� �ӽ��� ����");
		setVisible(true);

		
		
	}
}
class Egg extends JFrame{
	private static final long serialVersionUID = 1L;
	public JButton ok=new JButton("��ٱ��Ͽ� ���");
	Egg(){
		
		JPanel bi1=new JPanel();
		
		JLabel name=new JLabel("���� �Ұ�� ����");
		Font f1=new Font("�޸ո���T",Font.PLAIN,13);  //��Ʈ ��ü�� ��Ʈ�� ����
		name.setForeground(Color.white);
		name.setFont(f1); 
		bi1.setBackground(Color.RED);
		bi1.add(name);
		
		JPanel bi2=new JPanel();
		JLabel img=new JLabel(new ImageIcon("img/6.jpg"));
		bi2.add(img);
		
		JPanel bi3=new JPanel(new BorderLayout());
		JLabel l1=new JLabel("  ����:8000��                       ����:");
		Font f2=new Font("�޸ո���T",Font.PLAIN,12);  //��Ʈ ��ü�� ��Ʈ�� ����
		l1.setFont(f2); 
		bi3.add(l1,"West");
		
		String[] su = {"1","2","3"}; //����
		JComboBox<String> cb = new JComboBox<String>(su);
		cb.setSelectedIndex(0);
		bi3.add(cb,"Center");
		
		
		ok.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) { 
				s6=(String)cb.getSelectedItem();
				
					
				if(e.getSource()==ok) {
					if(su[0].equals(s6)) {
						q6=8000;
						d6.setText("  ���� �Ұ�� ���� "+s6+"��"+"  "+q6+"��");
					} else if(su[1].equals(s6)) {
						q6=16000;
						d6.setText("  ���� �Ұ�� ���� "+s6+"��"+"  "+q6+"��");
					} else if(su[2].equals(s6)) {
						q6=24000;
						d6.setText("  ���� �Ұ�� ���� "+s6+"��"+"  "+q6+"��");
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
		setTitle("���� �Ұ�� ����");
		setVisible(true);

		
		
	}
}

class Jang extends JFrame{
	private static final long serialVersionUID = 1L;

	Jang(){
		
		JPanel pan1=new JPanel(new BorderLayout());
		pan1.setBackground(Color.RED);
        Font f1=new Font("�޸ո���T",Font.PLAIN,13);  //��Ʈ ��ü�� ��Ʈ�� ����
		
		JButton H=new JButton("Ȩ");
		H.setForeground(Color.white);
		H.setFont(f1);
		H.setBackground(Color.RED);
		H.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) {  
				new Mcdelivery(null);  
			}
		});
		
		JLabel l1=new JLabel("�ֹ�����");
		l1.setForeground(Color.white);
		l1.setFont(f1);
		l1.setBackground(Color.RED);
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setBackground(Color.RED);
		pan1.add(H,"West");
		pan1.add(l1,"Center");
		
		JPanel pan5=new JPanel(new BorderLayout());
		JLabel l=new JLabel("�ֹ� ����");
		pan5.setBackground(Color.WHITE);
		JPanel pan2=new JPanel(new GridLayout(7,0)); 
		pan2.setBackground(Color.WHITE);
		
		pan2.add(d1);
		pan2.add(d2);
		pan2.add(d3);
		pan2.add(d4);
		pan2.add(d5);
		pan2.add(d6);
		 
		pan2.add(new JLabel("������: "+(q1+q2+q3+q4+q5+q6)+"��"));  //���̺� ���� ������ �־���
		pan5.add(l,"West");
		pan5.add(pan2,"Center");
		
		
	
		
		JPanel pan3=new JPanel();
		pan3.setBackground(Color.WHITE);
		JButton b1=new JButton("������ �߰�");
		b1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e) {  
				new RecomMenu();  
			}
		});
		JButton b2=new JButton("����");
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
		setTitle("�ֹ� ����");
		setVisible(true);
		
	}

	
}
class Jumun extends JFrame{

	private static final long serialVersionUID = 1L;

	Jumun(){
		Font f1=new Font("�޸ո���T",Font.PLAIN,13);
		JPanel pan1=new JPanel();
		pan1.setBackground(Color.RED);
		JLabel title=new JLabel("�ֹ�");
		title.setForeground(Color.white);
		title.setFont(f1);
		title.setBackground(Color.RED);
		title.setHorizontalAlignment(JLabel.CENTER);
		pan1.add(title);
		
		JPanel pan2=new JPanel(new GridLayout(5,0));
		JLabel l1=new JLabel("�̸� ");

		JLabel l2=new JLabel("�ּ� ");
	
		JLabel l3=new JLabel("\n�޴���ȭ ��ȣ: ");
		 String phone [] = {"010", "011", "016", "017", "018", "019", "070"};  
		JComboBox<String> c = new JComboBox<String>(phone);
		JLabel l4=new JLabel("-");
		
		JLabel l5=new JLabel("-");

		JPasswordField pwd=new JPasswordField(4);
		pwd.setEchoChar('*');
		JLabel l6=new JLabel("��� ���");
		JRadioButton r1=new JRadioButton("����");   //���� ��ư�� �߰�
		JRadioButton r2=new JRadioButton("ī��");
		JRadioButton r3=new JRadioButton("��ǥ");
		ButtonGroup bg=new ButtonGroup();   //��ư �׷��� ����
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		JLabel l7=new JLabel("��޽� ��û����");
		
		
		
		
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
		JButton ok=new JButton("�ֹ��ϱ�");
		ok.addActionListener(new ActionListener(){  
			JFrame frame;           //Jframe�������� ���̾�α׸� ����� ���� ����
			public void actionPerformed(ActionEvent e) { 
				
				s7=(String)c.getSelectedItem();   //�ڵ��� ��ȣ ��ũ�� ���õȰ� 

				String str="���õ��� �ʾҽ��ϴ�.";       //string������ ������
				if(r1.isSelected()) {           //r1�� ���õǾ�����
					str=r1.getText();          //r1�� string ������ ����
				}
				else if(r2.isSelected()) {
					str=r2.getText();				
				}
				else if(r3.isSelected()) {
					str=r3.getText();				
				}
				String n1=t1.getText();        //�ý�Ʈ �ʵ� t1�� ���� n1���� ����
				
				String n2=t2.getText();
				
				String n3=t3.getText();
				
				String n4=t4.getText();
				
				String n5="****";
			
				String n6=t6.getText();
			
				
				 //���̾�α׸� ������(��������� ���̶� ���̾�α׸� ���)
				JOptionPane.showMessageDialog(frame,"�ֹ�Ȯ��\n"+"�̸�: "+n1+"\n"+"�ּ�: "+n2+" "+n3+"\n"+"�ڵ��� ��ȣ: "
				+s7+"-"+n4+"-"+n5+"\n"+"��� ���: "+str+"\n"+"��޽� ��û����: "+n6+"\n"+"������: "+(q1+q2+q3+q4+q5+q6)+"��");

			}
		});
		pan3.add(ok);
		
		JPanel p=new JPanel(new BorderLayout());
		p.add(pan1,"North");
		p.add(pan2,"Center");
		p.add(pan3,"South");
		add(p);
		
		
		
		setSize(350,380);
		setTitle("�ֹ�");
		setVisible(true);
	}
}

	
}

class Burger extends JFrame { 

	private static final long serialVersionUID = 1L;

	Burger(){
		
		JLabel label=new JLabel(new ImageIcon("img/�غ����Դϴ�.gif"));
		add(label);
		setSize(315,290);
		setTitle("����&��Ʈ");
		setVisible(true);
	}
	
	
}
class Snack extends JFrame { 

	private static final long serialVersionUID = 1L;

	Snack(){
		
		JLabel label=new JLabel(new ImageIcon("img/�غ����Դϴ�.gif"));
		add(label);
		
		setSize(315,290);
		setTitle("����&���̵�");
		setVisible(true);
	}
	
	
}
class Drink extends JFrame {  

	private static final long serialVersionUID = 1L;

	Drink(){
		
		JLabel label=new JLabel(new ImageIcon("img/�غ����Դϴ�.gif"));
		add(label);
		
		setSize(315,290);
		setTitle("����");
		setVisible(true);
	}
	
	
}
class Disert extends JFrame {  
	
	private static final long serialVersionUID = 1L;

	Disert(){
	
		JLabel label=new JLabel(new ImageIcon("img/�غ����Դϴ�.gif"));
		add(label);
		
		setSize(315,290);
		setTitle("����Ʈ");
		setVisible(true);
	}
	
	
}
class Happy extends JFrame {  

	private static final long serialVersionUID = 1L;

	Happy(){
	
		JLabel label=new JLabel(new ImageIcon("img/�غ����Դϴ�.gif"));
		add(label);
		
		setSize(315,290);
		setTitle("���ǹ�");
		setVisible(true);
	}
	
	
}

