import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana extends JFrame{
	
	JPanel pnl_panel;
	JButton btn_1, btn_2, btn_3, btn_4;

	public Ventana() {
		this.setTitle("JPanel en java");
		this.setSize(500,500);
		this.setLocation(450,50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		componentes();
	}
	public void componentes(){
		this.setLayout(null);
		
		add(pnl_panel = new JPanel());
		pnl_panel.setBounds(10,70,480,400);
		pnl_panel.setBorder(BorderFactory.createTitledBorder("panel"));
		
		add(btn_1 = new JButton("rojo"));
		btn_1.setBounds(10,10,100,20);
		
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pnl_panel.setBackground(Color.red);
			}
		});
		
		add(btn_2 =new JButton("negro"));
		 btn_2.setBounds(120,10,100,20);
		 
		 btn_2.addActionListener(new ActionListener() {
		   public void actionPerformed(ActionEvent e) {
		    pnl_panel.setBackground(Color.black);
		     
		   }
		 });
		   
		 add(btn_3 =new JButton("amarillo"));
		 btn_3.setBounds(230,10,100,20);
		 
		  btn_3.addActionListener(new ActionListener() {
		  
		   public void actionPerformed(ActionEvent e) {
		    pnl_panel.setBackground(Color.yellow);
		     
		   }
		  });  
		   
		  add(btn_4 = new JButton("azul"));
		  btn_4.setBounds(340,10,100,20);
		  	btn_4.addActionListener(new ActionListener() {
		   
		   public void actionPerformed(ActionEvent e) {
		    pnl_panel.setBackground(Color.blue);
		     
		   }
		  });
		
	}
}
