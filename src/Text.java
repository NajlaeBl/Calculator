import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Text extends JPanel {
	private JTextArea t=new JTextArea();
	public Text() {
		super();
		Dimension dim=new Dimension();
		this.setPreferredSize(dim);
		this.setLayout(new BorderLayout());
		Border out =BorderFactory.createEmptyBorder(5, 5, 5, 5);
		this.setBorder( out);
		this.add(new JScrollPane(t),BorderLayout.CENTER);
		t.setBackground(Color.BLACK);
		
		
	}
	public void entertext(String text) {
		t.append(text);	
	}
	public void vidertext() {
		t.setText("");
	}
	public void colorchange(Color c) {
		t.setForeground(c);		
	}
	public void fontchange(Font f) {
		t.setFont(f);
		
	}
	

}
