
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Fenetre extends JFrame{
	private Panneau p =new Panneau();
	//private Toolbars tb=new Toolbars();
	private Text t=new Text();
	
	
	
	public Fenetre() {
		
		super("Boushaba Mohamed");
		
		
		t.setBackground(Color.black);
		p.setBorder(new EmptyBorder(80,80,80,80));
		this.setSize(1800,1050);
		this.setLocation(0, 0);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		
		this.add(p,BorderLayout.WEST);
		this.add(t, BorderLayout.CENTER);
		//this.add(tb, BorderLayout.NORTH);
		p.settext(new StringListener() {

			@Override
			public void appendtext(String text) {
				t.entertext(text);
				
			}

			@Override
			public void removetext() {
				t.vidertext();
				
			}

			@Override
			public void changecolor(Color c) {
				t.colorchange(c);
				
			}

			@Override
			public void changefont(Font f) {
				t.fontchange(f);
				
			}
			
		});
		
	
	}

}
