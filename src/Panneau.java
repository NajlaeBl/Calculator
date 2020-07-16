
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;
public class Panneau extends JPanel implements KeyListener,ActionListener {
	private Text t=new Text();
	longeur l=new longeur();
	StringListener x;
	private Dimension dm =new Dimension();
	private int i=0;
	private int memoire=0;
	private int memoiretraitement=0;
	private int counteri=0;
	private int click=0;
	private int itraitement=0;
	private int identification=0;
	private int identificationsign=0;
	private int kleprincipaleenter=1;
	private int signentrer=0;
	private int clickCSTP=0;
	private int m=0;
	private double ans=0;
	private Font f;
	private Color c;
	
	//private Boolean anskle=false;
	private double positiondepointtab[]=new double[100];
	private double[] r1 =new double[100] ;
	//private double []a1=new double[100];
	private double[]r11=new double[100];
	private String[] s= {"c","*","=","/","1","2","3","+","4","5","6","-","7","8","9","0","(",")",".","cos","sin","tan","sqrt","acos","asin","atan","abs","exp","ln","log","fact","E","pow","module","ans"};
	private JButton b1=new JButton("c");
	private JButton b2=new JButton("*");
	private JButton b3=new JButton("=");
	private JButton b4=new JButton("/");
	private JButton b5=new JButton("1");
	private JButton b6=new JButton("2");
	private JButton b7=new JButton("3");
	private JButton b8=new JButton("+");
	private JButton b9=new JButton("4");
	private JButton b10=new JButton("5");
	private JButton b11=new JButton("6");
	private JButton b12=new JButton("-");
	private JButton b13=new JButton("7");
	private JButton b14=new JButton("8");
	private JButton b15=new JButton("9");
	private JButton b16=new JButton("0");
	private JButton b17=new JButton("(");
	private JButton b18=new JButton(")");
	private JButton b19=new JButton(".");
	private JButton b20=new JButton("<-");
	private JButton b21=new JButton("cos");
	private JButton b22=new JButton("sin");
	private JButton b23=new JButton("tan");
	private JButton b24=new JButton("sqrt");
	private JButton b25=new JButton("acos");
	private JButton b26=new JButton("asin");
	private JButton b27=new JButton("atan");
	private JButton b28=new JButton("abs");
	private JButton b29=new JButton("exp");
	private JButton b30=new JButton("ln");
	private JButton b31=new JButton("log");
	private JButton b32=new JButton("fact");
	private JButton b33=new JButton("E");
	private JButton b34=new JButton("pow");
	private JButton b35=new JButton("module");
	private JButton b36=new JButton("ans");
 	
	public Panneau() {
		
		super();
		
		dm.height=400;
		dm.width=800;
		this.setPreferredSize(dm);
		
		this.setLayout(new GridLayout(9,4,50,50));
		this.setBackground(Color.black);

		GridBagConstraints gc=new GridBagConstraints();
		//design des buuton
		disign(b1);disign(b2);disign(b3);disign(b4);disign(b5);disign(b6);
		disign(b7);disign(b8);disign(b8);disign(b9);disign(b10);disign(b11);
		disign(b12);disign(b13);disign(b14);disign(b15);disign(b16);disign(b17);
		disign(b18);disign(b23);disign(b19);disign(b20);disign(b21);disign(b22);
		disign(b24);disign(b25);disign(b26);disign(b1);disign(b27);disign(b28);
		disign(b29);disign(b30);disign(b31);disign(b32);disign(b33);disign(b34);
		disign(b35);disign(b36);
		gc.insets=new Insets(5,5,5,5);
		this.add(b1,gc);
		b1.addActionListener(this);
		gc.insets=new Insets(5,5,5,5);
		this.add(b2,gc);
		b2.addActionListener(this);
		disign(b2);
		gc.insets=new Insets(5,5,5,5);
		this.add(b3,gc);
		b3.addActionListener(this);		
		gc.insets=new Insets(5,5,5,5);
		this.add(b4,gc);
		b4.addActionListener(this);


		gc.insets=new Insets(5,5,5,5);
		this.add(b5,gc);
		b5.addActionListener(this);

		gc.insets=new Insets(5,5,5,5);
		this.add(b6,gc);
		b6.addActionListener(this);

		gc.insets=new Insets(5,5,5,5);
		this.add(b7,gc);
		b7.addActionListener(this);
		gc.insets=new Insets(5,5,5,5);
		this.add(b8,gc);
		b8.addActionListener(this);
		gc.insets=new Insets(5,5,5,5);
		this.add(b9,gc);
		b9.addActionListener(this);
		gc.insets=new Insets(5,5,5,5);
		this.add(b10,gc);
		b10.addActionListener(this);
		gc.insets=new Insets(5,5,5,5);
		this.add(b11,gc);
		b11.addActionListener(this);
		gc.insets=new Insets(5,5,5,5);
		this.add(b12,gc);
		b12.addActionListener(this);
		gc.insets=new Insets(5,5,5,5);
		this.add(b13,gc);
		b13.addActionListener(this);
		gc.insets=new Insets(5,5,5,5);
		this.add(b14,gc);
		b14.addActionListener(this);
		gc.insets=new Insets(5,5,5,5);
		this.add(b15,gc);
		b15.addActionListener(this);
		gc.insets=new Insets(5,5,5,5);
		this.add(b16,gc);
		b16.addActionListener(this);
		gc.insets=new Insets(5,5,5,5);
		this.add(b17,gc);
		b17.addActionListener(this);	
		gc.insets=new Insets(5,5,5,5);
		this.add(b18,gc);
		b18.addActionListener(this);	
		gc.insets=new Insets(5,5,5,5);
		this.add(b19,gc);
		b19.addActionListener(this);	
		gc.insets=new Insets(5,5,5,5);
		this.add(b20,gc);
		b20.addActionListener(this);	
		gc.insets=new Insets(5,5,5,5);
		this.add(b21,gc);
		b21.addActionListener(this);	
		gc.insets=new Insets(5,5,5,5);
		this.add(b22,gc);
		b22.addActionListener(this);	
		gc.insets=new Insets(5,5,5,5);
		this.add(b23,gc);
		b23.addActionListener(this);	
		gc.insets=new Insets(5,5,5,5);
		this.add(b24,gc);
		b24.addActionListener(this);	
		gc.insets=new Insets(5,5,5,5);
		this.add(b25,gc);
		b25.addActionListener(this);	
		gc.insets=new Insets(5,5,5,5);
		this.add(b26,gc);
		b26.addActionListener(this);	
		gc.insets=new Insets(5,5,5,5);
		this.add(b27,gc);
		b27.addActionListener(this);	
		gc.insets=new Insets(5,5,5,5);
		this.add(b28,gc);
		b28.addActionListener(this);
		gc.insets=new Insets(5,5,5,5);
		this.add(b29,gc);
		b29.addActionListener(this);	
		gc.insets=new Insets(5,5,5,5);
		this.add(b30,gc);
		b30.addActionListener(this);	
		gc.insets=new Insets(5,5,5,5);
		this.add(b31,gc);
		b31.addActionListener(this);
		gc.insets=new Insets(5,5,5,5);
		this.add(b32,gc);
		b32.addActionListener(this);
		gc.insets=new Insets(5,5,5,5);
		this.add(b33,gc);
		b33.addActionListener(this);	
		gc.insets=new Insets(5,5,5,5);
		this.add(b34,gc);
		b34.addActionListener(this);	
		gc.insets=new Insets(5,5,5,5);
		this.add(b35,gc);
		b35.addActionListener(this);	
		gc.insets=new Insets(5,5,5,5);
		this.add(b36,gc);
		b36.addActionListener(this);	
		this.addKeyListener(this);
		this.setFocusable(true);
		this.setFocusTraversalKeysEnabled(true);
		
	}
	public void cstpeasy() {
		r1[i]=106.241985410123745128;
		x.appendtext("(");
		i++;
		click++;
		counteri++;
	}
	public void ecrirefaute() {
		Font f=new Font(null, 1, 50);
		Color c=new Color(255,0,0);
		x.changefont(f);
		x.changecolor(c);
		disignf(b1);disignf(b2);disignf(b3);disignf(b4);disignf(b5);disignf(b6);
		disignf(b7);disignf(b8);disignf(b8);disignf(b9);disignf(b10);disignf(b11);
		disignf(b12);disignf(b13);disignf(b14);disignf(b15);disignf(b16);disignf(b17);
		disignf(b18);disignf(b23);disignf(b19);disignf(b20);disignf(b21);disignf(b22);
		disignf(b24);disignf(b25);disignf(b26);disignf(b1);disignf(b27);disignf(b28);
		disignf(b29);disignf(b30);disignf(b31);disignf(b32);disignf(b33);disignf(b34);
		disignf(b35);disignf(b36);
	}
	public void disignf(JButton b) {
		Font f=new Font(null,1,50);
		b.setBackground(Color.black);
		b.setForeground(Color.red);
		b.setFont(f);
		b.setMargin(new Insets(0, 0, 10, 0));
		b.setBorderPainted(false);
	}
 	public void ecrire() {
		Font f=new Font(null, 1, 50);
		Color c=new Color(0,255,0);
		x.changefont(f);
		x.changecolor(c);
		disign(b1);disign(b2);disign(b3);disign(b4);disign(b5);disign(b6);
		disign(b7);disign(b8);disign(b8);disign(b9);disign(b10);disign(b11);
		disign(b12);disign(b13);disign(b14);disign(b15);disign(b16);disign(b17);
		disign(b18);disign(b23);disign(b19);disign(b20);disign(b21);disign(b22);
		disign(b24);disign(b25);disign(b26);disign(b1);disign(b27);disign(b28);
		disign(b29);disign(b30);disign(b31);disign(b32);disign(b33);disign(b34);
		disign(b35);disign(b36);
		
	}
 	public void disign(JButton b ) {
		Font f=new Font(null,1,50);
		b.setBackground(Color.black);
		b.setForeground(Color.green);
		b.setFont(f);
		b.setMargin(new Insets(0, 0, 10, 0));
		b.setBorderPainted(false);
	}
	public void settext(StringListener Str) {

		this.x=Str;
		
	}
	public void clair(double[]r1) {
		int fi=0;
		while(fi<100) {
			r1[fi]=0;
			fi++;
		}
	}
	public double[] traitementCSTP(double[]l1) {
		System.out.println("traitemntcstp............................\n");
		if (identification==1) {
			//constriure icstp
			
			int icstp=0;
			while(icstp<100) {
				if (l1[icstp]==102.241985410123745128) {
					break;
				}
				icstp++;
			}
			System.out.println(icstp+"iiiiicccccccsssssssstttttpppppppppp\n");
			int avance=0;
			while(avance<icstp) {
				if(l1[avance]==109.241985410123745128) {
					l1[avance]=Math.cos(l1[avance+1]);
					int parcoure=avance+1;
					while(parcoure<icstp) {
						l1[parcoure]=l1[parcoure+1];
						parcoure++;
					}
					icstp--;
					avance++;
				}else if(l1[avance]==110.241985410123745128) {
					l1[avance]=Math.sin(l1[avance+1]);
					int parcoure=avance+1;
					while(parcoure<i) {
						l1[parcoure]=l1[parcoure+1];
						parcoure++;
					}
					icstp--;
					avance++;
				}else if(l1[avance]==111.241985410123745128) {
					l1[avance]=Math.tan(l1[avance+1]);
					int parcoure=avance+1;
					while(parcoure<i) {
						l1[parcoure]=l1[parcoure+1];
						parcoure++;
					}
					icstp--;
					avance++;
				}else if(l1[avance]==112.241985410123745128) {
					l1[avance]=Math.sqrt(l1[avance+1]);
					int parcoure=avance+1;
					while(parcoure<i) {
						l1[parcoure]=l1[parcoure+1];
						parcoure++;
					}
					icstp--;
					avance++;
				}else if(l1[avance]==113.241985410123745128) {
					l1[avance]=Math.acos(l1[avance+1]);
					int parcoure=avance+1;
					while(parcoure<i) {
						l1[parcoure]=l1[parcoure+1];
						parcoure++;
					}
					icstp--;
					avance++;
				}else if(l1[avance]==114.241985410123745128) {
					l1[avance]=Math.asin(l1[avance+1]);
					int parcoure=avance+1;
					while(parcoure<i) {
						l1[parcoure]=l1[parcoure+1];
						parcoure++;
					}
					icstp--;
					avance++;
				}else if(l1[avance]==115.241985410123745128) {
					l1[avance]=Math.atan(l1[avance+1]);
					int parcoure=avance+1;
					while(parcoure<i) {
						l1[parcoure]=l1[parcoure+1];
						parcoure++;
					}
					icstp--;
					avance++;
				}else if(l1[avance]==116.241985410123745128) {
					l1[avance]=Math.abs(l1[avance+1]);
					int parcoure=avance+1;
					while(parcoure<i) {
						l1[parcoure]=l1[parcoure+1];
						parcoure++;
					}
					icstp--;
					avance++;
				}else if(l1[avance]==117.241985410123745128) {
					l1[avance]=Math.exp(l1[avance+1]);
					int parcoure=avance+1;
					while(parcoure<i) {
						l1[parcoure]=l1[parcoure+1];
						parcoure++;
					}
					icstp--;
					avance++;
				}else if(l1[avance]==118.241985410123745128) {
					l1[avance]=Math.log(l1[avance+1]);
					int parcoure=avance+1;
					while(parcoure<i) {
						l1[parcoure]=l1[parcoure+1];
						parcoure++;
					}
					icstp--;
					avance++;
				}else if(l1[avance]==119.241985410123745128) {
					l1[avance]=Math.log10(l1[avance+1]);
					int parcoure=avance+1;
					while(parcoure<i) {
						l1[parcoure]=l1[parcoure+1];
						parcoure++;
					}
					icstp--;
					avance++;
				}else if(l1[avance]==120.241985410123745128) {
					l1[avance]=factorielle(l1[avance+1]);
					int parcoure=avance+1;
					while(parcoure<i) {
						l1[parcoure]=l1[parcoure+1];
						parcoure++;
					}
					icstp--;
					avance++;
				}else if(l1[avance]==121.241985410123745128) {
					 l1[avance]=(double)((int)(l1[avance+1]));
					int parcoure=avance+1;
					while(parcoure<i) {
						l1[parcoure]=l1[parcoure+1];
						parcoure++;
					}
					icstp--;
					avance++;
				}else if(l1[avance]==122.241985410123745128) {
					l1[avance-1]=Math.pow(l1[avance-1], l1[avance+1]);
					int parcoure=avance;
					while(parcoure<i) {
						l1[parcoure]=l1[parcoure+2];
						parcoure++;
					}
					icstp=icstp-2;
					//avance++;
				}else if(l1[avance]==123.241985410123745128) {
					l1[avance-1]=l1[avance-1]%l1[avance+1];
					int parcoure=avance;
					while(parcoure<i) {
						l1[parcoure]=l1[parcoure+2];
						parcoure++;
					}
					icstp=icstp-2;
					//avance++;
				}																																	
				avance++;
				
			}
			int ni=0;
			while(ni<l.longuerliste(l1)) {
				System.out.println("l1["+ni+"]="+l1[ni]+"dubuuuuuuuuuuuuuut\n");

				ni++;
			}
			
		}
		identification=0;
		System.out.println("fintraitemntcstp............................\n");		
		return l1;
		
	}
	public double[] triatementdesigne(double[]l1) {
		System.out.println("traitemntsign............................\n");
		//corection identification
		if(l1[0]!=105.241985410123745128) {
			identificationsign=0;
			
		}
		//fin
		
		
		if(identificationsign==1) {
		
			identificationsign=0;
			int changement=1;
			int isigne=1;
			int up=0;
			int down=0;
			double petitcalcule=0;
			int avancement=1;
			int pos=1;
			int kleenter=0;
			while(isigne<i) {
				if(l1[isigne]==101.241985410123745128||l1[isigne]==102.241985410123745128||l1[isigne]==103.241985410123745128||l1[isigne]==104.241985410123745128||l1[isigne]==105.241985410123745128||l1[isigne]==106.241985410123745128) {
					break;
				}
				if(l1[isigne]==108.241985410123745128) {
					identificationsign=1;
					kleenter=1;
					
				}
				if(identificationsign==0) {
					up++;
				}else {
					down++;
				}
				isigne++;
				
			}
			System.out.println(isigne+"isigne.................\n");
			System.out.println(up+"uisigne.................\n");
			System.out.println(down+"disigne.................\n");
			identificationsign=0;
			if(kleenter==1) {
				while(avancement<isigne) {
					if(l1[avancement]==108.241985410123745128) {
						identificationsign=1;
						avancement++;
						pos=1;
					}
					if(identificationsign==0) {
						petitcalcule=petitcalcule+l1[avancement]*Math.pow(10, up-pos);
						pos++;
					}else {
						petitcalcule=petitcalcule+l1[avancement]*Math.pow(10, -pos);
						pos++;
						
					}
					avancement++;
					
				}
				identificationsign=0;
				System.out.println(petitcalcule+"clclcllc...........................\n");
				l1[0]=-petitcalcule;
				int parcoure=1;
				while(avancement+parcoure<=i) {
					l1[parcoure]=l1[avancement+parcoure-1];
					parcoure++;
				}
				i=i-avancement+1;
				System.out.println(i+"iiiclclcllc...........................\n");
			}
			
			if(kleenter==0) {
				while(avancement<isigne) {
						petitcalcule=petitcalcule+l1[avancement]*Math.pow(10, up-pos);
						pos++;
					
						avancement++;
					
				}
				l1[0]=-petitcalcule;
				while(changement+avancement<=i) {
					l1[changement]=l1[changement+avancement-1];
					changement++;
				}
				i=i-avancement+1;
				identificationsign=0;
			}
			int ppp=0;
			while(ppp<i) {
				System.out.println(l1[ppp]+"ppp++++++++++++\n");
				ppp++;
			}
			int ni=0;
			while(ni<l.longuerliste(l1)) {
				System.out.println("l1["+ni+"]="+l1[ni]+"dubuuuuuuuuuuuuuut\n");

				ni++;
			}
			
			identificationsign=0;
		}
		System.out.println("fintraitemntdesign............................\n");
		return l1;
	}
	public double[] traitementspecile(double[]l1 , int click) {
		System.out.println("traitemntspeciale............................\n");
		int n=0;
		int key=0;
		int pkey=0;
		int progres=0;
		int parcoure=0;
		int droit=0;
		int kanapeche=0;
		while(n<click) {
			pkey=1;
			int k=0;
			int dx1=0;
			int dx2=0;
			int position=0;
		
			double []rmin=new double[100];
			System.out.print(i+"i\n");
			while(k<i) {
			//selectioner la position
				if(droit==0) {
					if(l1[k]==106.241985410123745128) {
						progres=k;
						kanapeche=click;
						while(progres<i) {
							if(r1[progres]==107.241985410123745128) {
								kanapeche--;
							}
							if(kanapeche==0) {
								parcoure++;
							}
							progres++;
						}
						droit=1;
						
					}
					
				}
			//la fin de la selection
				if(l1[k]==106.241985410123745128) {
					n++;
					System.out.println(k+"k\n");
				}
				k++;
				if(n==click) {
					key=1;
					dx1=k-1;
					
					int counter=0;
					 position=0;
					while(k<i) {
						if(l1[k]==107.241985410123745128) {
							dx2=k;
							
							break;
							
						}
					
						rmin[position]=l1[k];
						System.out.println(rmin[position]+"rmin===="+position+"\n");
						position++;
						k++;
						counter=1;
					}
					if(counter==1) {
						break;
					}
					
				
				}
				
				
			
			}
			rmin[position]=102.241985410123745128;
			System.out.println(rmin[position]+"rmin===="+position+"\n");
			
			System.out.println(dx1+"dx1\n");
			System.out.println(dx2+"dx2\n");
			System.out.println(i+"i\n");
			if(key==1) {
				//give identification
				int ni=0;
				while(ni<100) {
					if(rmin[ni]==109.241985410123745128||rmin[ni]==110.241985410123745128||rmin[ni]==111.241985410123745128||rmin[ni]==112.241985410123745128||rmin[ni]==113.241985410123745128||rmin[ni]==114.241985410123745128||rmin[ni]==115.241985410123745128||rmin[ni]==116.241985410123745128||rmin[ni]==117.241985410123745128||rmin[ni]==118.241985410123745128||rmin[ni]==119.241985410123745128||rmin[ni]==120.241985410123745128||rmin[ni]==121.241985410123745128||rmin[ni]==122.241985410123745128||rmin[ni]==123.241985410123745128||rmin[ni]==124.241985410123745128) {
						identification=1;
						break;
					}
					ni++;
				}
				//fin
				int ai=i;
				
				System.out.println(identification+"identification................\n");
				
				double s=traitementb3speciale(rmin);
				i=ai;
				
				System.out.println(s+"s\n");
				System.out.println(i+"i\n");
				l1[dx1]=s;
				
				int di=0;
				while(dx1<i) {
					dx1++;
					dx2++;
					di++;
					if(dx2>=i) {
						l1[dx1]=0;
					
					}else{
						l1[dx1]=l1[dx2];
					}
					
						
					
				}
				 itraitement=i-di+1;
				System.out.println(i+"iiiiiiiii\n");
				System.out.println(itraitement+"iiiiiiiiitttttt1\n");
				click--;
				n=0;
				key=0;
				
			}
			identification=0;
			
			
		}
		//suite de selection
		if(l1[itraitement]!=0) {
			itraitement=itraitement+parcoure-1;
		}
		//fin de la suite
		if(pkey==0) {
			itraitement=i;
			System.out.println(itraitement+"iiiiiiiiitttttt2\n");
		}
		int ni=0;
		while(ni<l.longuerliste(l1)) {
			System.out.println("l1["+ni+"]="+l1[ni]+"dubuuuuuuuuuuuuuut\n");

			ni++;
		}
		System.out.println("fintraitementspeciale............................\n");
		return l1;
		
	}
	public void delete(double[]r1) {
		int n=0;
		while(n<r1.length) {
			r1[n]=0;
			n++;
		}
		i=0;
		click=0;
		kleprincipaleenter=1;
		identification=0;
		identificationsign=0;
	}
	public void obligation() {
		r1[0]=106.241985410123745128;
		//x.appendtext("(");
		i++;
		click++;
		counteri++;
	}
	public double factorielle(double n) {
		int i=1;
		int d=i;
		while(i<=n) {
			d=d*i;
			i++;
		}
		return d;
		
	}
	public void obligationsaute() {
		r1[0]=106.241985410123745128;
		x.appendtext("\n");
		i++;
		click++;
		counteri++;
	}
	public double operation(double[] r1) {
		int n=0;
		double[] r=new double[100];
		int m=0;
		double d2=0;
		int counter=0;
		System.out.println(identification+"idennnnnnnn...............................\n");
		//corection de signe moin au debut.....................................
	
	
		//fin de la corection.......................................................
		System.out.println("rrrrrrrrrrrrrrr \n");
		while(n<=i) {
			int a=101;
			while(a<109) {
				if (r1[n]==a+0.241985410123745128) {
					m++;
				}
				a++;
			}
			// pour pow et module key m
			a=121;
			while(a<123) {
				if (r1[n]==a+0.241985410123745128) {
					m++;
				}
				a++;
			}
			//fin
			if(m==1) {
				if(r1[n]==107.241985410123745128) {
					r[counter]=d2;
					System.out.print(r[counter]+"place"+counter+"\n");
					counter++;
					d2=-1;
					m=0;
					n++;
				}else if(r1[n+1]==106.241985410123745128) {
					n++;
					r[counter]=d2;
					System.out.print(r[counter]+"place"+counter+"\n");
					counter++;
					d2=-1;
					m=0;
				}else if(n!=i) {
					r[counter]=d2;
					System.out.print(r[counter]+"place"+counter+"\n");
					counter++;
					d2=-1;
					m=0;
			
				}
			}	
			if(n==i) {
				r[counter]=d2;
				System.out.print(r[counter]+"palece"+counter+" \n");
				m=0;
			}
		
		
			
		
			n++;
			d2++;
		}
	
//55555
	
// creation de p: les nobre reel et p1 les operation mathematique..
		n=0;
		System.out.println("ppppppppppppppppppp \n");
		double[] p=new double[100];
		double[] p1=new double[100];
		int k=0;						
		double s1=0;
		int dxc=0;
		int verification=0;
		int key=0;
		int positionr=0;
		int nboperation=l.longuerliste(r);
		
		int positiondepoint=0;
		while(n<l.longuerliste(r)) {
							
			int parametre=0;
			while(verification<r[n]) {
					if(key==1) {
																										
						s1=s1+r1[k]*Math.pow(10, (-parametre-1));
						parametre++;
						k++;
						verification++;
					}else {
						s1=s1+r1[k]*Math.pow(10, r[n]-1-parametre);
						parametre++;
						verification++;
						k++;	
					
					}									
			}
			if(verification==r[n] ) {			
				if (n!=l.longuerliste(r)) {
					if(r1[k]==108.241985410123745128) {
						key=1;
						positiondepointtab[positiondepoint]=k;
						positiondepoint++;
					}else {
						key=0;
					}
					if(key==0) {
						p1[dxc]=r1[k];
						System.out.println(p1[dxc]+"nb"+dxc+"p1 \n");
						dxc++;
						if(r1[k+1]==106.241985410123745128 || r1[k]==107.241985410123745128) {
							
							k++;
							p1[dxc]=r1[k];
							System.out.println(p1[dxc]+"nb"+dxc+"p1 \n");
							dxc++;
						}
					}	
				}
				if(key==0) {
					p[positionr]=s1;
					System.out.println(p[positionr]+"nb"+n+"p \n");
					positionr++;
					n++;					
					s1=0;
				}else {
					n++;
					nboperation--;
				}
				
				k++;
				verification=0;
			
			
													
				
			}
									
				
		}	
		System.out.println("nboperation:"+nboperation+"\n");
		System.out.println("lr:"+l.longuerliste(r)+"\n");
	
		
// faire les operation mathematique................
		i=0;
		double d=p[0];
	
		System.out.println("ddd"+d+"\n");
		while(i<nboperation-1) {
			s1=0;
		
			double d1=p1[i];
			double d21=p[i+1];
			while((d1!=101.241985410123745128&&d1!=103.241985410123745128)&&(p1[i+1]==101.241985410123745128||p1[i+1]==103.241985410123745128) && i<nboperation-1) {
				if (p1[i+1]==101.241985410123745128) {
					d21=d21*p[i+2];
					s1++;
				}else if(p1[i+1]==103.241985410123745128) {
					d21=d21/p[i+2];
					s1++;
				}
				i++;
			}
			if (s1==0) {
				if(d1==104.241985410123745128) {
					d=d+d21;
				}else if(d1==105.241985410123745128) {
					d=d-d21;
					
				}else if(d1==101.241985410123745128) {
					d=d*d21;
				}else if(d1==103.241985410123745128) {
					d=d/d21;
				}
			}else {
				if(d1==104.241985410123745128) {
					d=d+d21;
				}else if(d1==105.241985410123745128) {
					d=d-d21;
				}
			}
			i++;
			
		}
		
		return d;
	}
	public double[]operationspeciale(double[]l1){
		System.out.println("operation sepecialeee......................");
		int n=0;
		int k=0;
		int key=0;
		int position=0;
		int parcour=0;
		int capteur=0;
		while (position<100) {
			if(l1[position]==122.241985410123745128||l1[position]==123.241985410123745128) {
				capteur++;
			}
			position++;
		}
		System.out.println(capteur);
		int capteurpoint=0;
		int capteursanpoint=0;
		int keypoint=0;
		int decalagecalcule=0;
		int positiongenerale=0;
		while(parcour<capteur) {
			while(l1[n]!=102.241985410123745128) {
				if(l1[n]==123.241985410123745128||l1[n]==122.241985410123745128) {
					key=1;
					break;
				}else if(l1[n]==101.241985410123745128||l1[n]==102.241985410123745128||l1[n]==103.241985410123745128||l1[n]==104.241985410123745128||l1[n]==105.241985410123745128||l1[n]==106.241985410123745128||l1[n]==107.241985410123745128||l1[n]==109.241985410123745128||l1[n]==110.241985410123745128||l1[n]==111.241985410123745128||l1[n]==112.241985410123745128||l1[n]==113.241985410123745128||l1[n]==114.241985410123745128||l1[n]==115.241985410123745128||l1[n]==116.241985410123745128||l1[n]==117.241985410123745128||l1[n]==118.241985410123745128||l1[n]==119.241985410123745128||l1[n]==120.241985410123745128) {
					key=0;
					break;
				//resolution tu as suprimer l1===108 up
				}if(l1[n]==108.241985410123745128) {
					keypoint=1;
				}
				if(keypoint==1) {
					capteurpoint++;
					
				}else {
					k++;
			
				}
				//fin
				positiongenerale++;
				n++;
				
			}
			if(key==0) {
				k=0;
				positiongenerale=0;
				//
				capteurpoint=0;
				keypoint=0;
				//
				n++;
				if(l1[n-1]==102.241985410123745128) {
					break;
				}
			}if(key==1) {
				//k=0;
				//calcule des nombre qui sont derier pow and module
				parcour++;
				double s=0;
	
				int calcule=n-positiongenerale;
				System.out.println(k+"k");
				System.out.println(n+"n");
				System.out.println(calcule+"cl");
				capteurpoint--;
				System.out.println(capteurpoint+"c");
					
				while(calcule<n-(capteurpoint+1)) {
					System.out.println(l1[calcule]+"l11111111111111111111");
					s=s+l1[calcule]*(Math.pow(10, n-1-calcule-capteurpoint-1));
					calcule++;
				}
					//fin
					
				
				System.out.println(s);
				
				//resolution de point
				if(keypoint==1) {
					int calculepoint=calcule+1;
					int d=1;
					while(calculepoint<n) {
						s=s+l1[calculepoint]*(Math.pow(10,-d));
						calculepoint++;
						d--;
					}
				}
				System.out.println(s);
				//fin
				//decalager de l1 update
				l1[n-positiongenerale]=s;
				int decalage=1;
				while(n+decalage-1<100) {
					l1[n-positiongenerale+decalage]=l1[n+decalage-1];
					decalage++;
				}
				//fin
				keypoint=0;
				capteurpoint=0;
				positiongenerale=0;
				key=0;
				k=0;
				n++;
				
			}
		}
		int ni=0;
		while(ni<l.longuerliste(l1)) {
			System.out.println("l1["+ni+"]="+l1[ni]+"dubuuuuuuuuuuuuuut\n");

			ni++;
		}
		System.out.println("fin operation sepecialeee......................");
		return l1;
		
	}
	public void traitementb1(double[]r1) {
		if (x!=null) {
			x.removetext();
			delete(r1);
			memoire=0;
			counteri=0;
			i=0;
		}
	}
	public void traitementb2(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				
			}else if(r1[i-1]!=101.241985410123745128&&r1[i-1]!=103.241985410123745128&&r1[i-1]!=104.241985410123745128&&r1[i-1]!=105.241985410123745128&&r1[i-1]!=108.241985410123745128&&r1[i-1]!=106.241985410123745128&&r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128) {
				x.appendtext(s[1]);
				
				r1[i]= 101.241985410123745128;
				i++;
				counteri++;
			
			}else {
				ecrirefaute();
				
			}
			
		}
		
	}
	public void traitementb3(double[] r1) {
		if (x!=null) {
			ecrire();
			int kle=0;
			int jj=1;
			while(jj<100) {
				if(r1[jj-1]==106.241985410123745128&&r1[jj]==107.241985410123745128) {
					kle=1;
					break;
				}
				jj++;
			}
			if(r1[i-1]==106.241985410123745128||r1[i-1]==108.241985410123745128||r1[i-1]==105.241985410123745128) {
				kle=1;
			}
				
			if(kle==1) {
				ecrirefaute();
			}else {
				int n=0;
				 m=0;
				while(n<i) {
					if(r1[n]==106.241985410123745128) {
						m++;
					}else if(r1[n]==107.241985410123745128) {
						m--;
					}
					n++;
				}
				//igaliter automatique par l'ajote de (....
				//test
				
				System.out.println(m);
				System.out.println(i);
				System.out.println(click);
				while(i<100) {
					if(m==0) {
						break;
					}
					if(m==1) {
						//x.appendtext(s[17]);
						counteri++;
						r1[i]=107.241985410123745128;
						i++;
						m--;
						break;
						
					}else {
						x.appendtext(s[17]);
						counteri++;
						r1[i]=107.241985410123745128;
						i++;
						m--;
					}
				}
				/*if(m==1) {
					counteri++;
					r1[i]=107.241985410123745128;
					i++;
					m--;
				}*/
			
				int nni=0;
				while(nni<l.longuerliste(r1)) {
					System.out.println("r1["+nni+"]="+r1[nni]+"dubuuuuuuuuuuuuuut\n");

					nni++;
				}
		
				//fin.......
				if(i==0) {
				
				}else if(m>0) {
					 f=new Font(null, 1, 50);
					 c=new Color(255,0,0);
					 x.changefont(f);
					 x.changecolor(c);
				}else if(r1[i-1]!=101.241985410123745128&&r1[i-1]!=103.241985410123745128&&r1[i-1]!=104.241985410123745128&&r1[i-1]!=105.241985410123745128&&r1[i-1]!=108.241985410123745128&&r1[i-1]!=106.241985410123745128&&r1[i-2]!=108.241985410123745128&&kle!=1) {
					x.appendtext(s[2]);
					
					int ni=0;
					double[]a1=new double[100];
					while(ni<l.longuerliste(r1)) {
						System.out.println("r1["+ni+"]="+r1[ni]+"dubuuuuuuuuuuuuuut\n");

						a1[ni]=r1[ni];
						ni++;
					}
					//System.out.println(r1[2]+"hahahaha");
					memoire=i;
					int memoirex=memoire;
					a1[memoirex]=102.241985410123745128;
			//.............................................
					r11=traitementspecile(r1,click);
			//............................................
					memoire=i;
					memoiretraitement=itraitement;
					System.out.println(i+"iiiiiii\n");
					System.out.println(itraitement+"ititititititi\n");
					r11[memoire]=102.241985410123745128;
					r11[memoiretraitement]= 102.241985410123745128;
					ni=0;
					while(ni<l.longuerliste(r11)) {
						System.out.println("xr11["+ni+"]="+r11[ni]+"\n");
						
						ni++;
					}
		//....................................................
					r11=traitementCSTP(r11);
		//...........................................
					/*memoire=i;
					memoiretraitement=itraitement;
					System.out.println(i+"iiiiiii\n");
					System.out.println(itraitement+"ititititititi\n");
					r1[memoire]=102;
					r11[memoiretraitement]= 102;*/
					ni=0;
					while(ni<l.longuerliste(r11)) {
						System.out.println("cr11["+ni+"]="+r11[ni]+"\n");
						
						ni++;
					}
					 ni=0;
		//.......................................................
					r11=triatementdesigne(r11);
		//..............................................
					memoire=i;
					//corection de itraitement
					memoiretraitement=itraitement;
					//fin de corection
					System.out.println(i+"iiiiiii\n");
					System.out.println(itraitement+"ititititititi\n");
					r11[memoire]=102.241985410123745128;
					r11[memoiretraitement]= 102.241985410123745128;
					ni=0;
					while(ni<l.longuerliste(r11)) {
						System.out.println("r11["+ni+"]="+r11[ni]+"\n");
						
						ni++;
					}
					 ni=0;
					System.out.print("nbclic"+click+"\n");
		//...........................................................			
					double d=operation(r11);
					ans=d;
				
		//............................................................			
					while(ni<l.longuerliste(a1)) {
						System.out.println("a1["+ni+"]="+a1[ni]+"\n");
						r1[ni]=a1[ni];
						ni++;
					}
					r1[memoirex]=a1[memoirex];
					memoire=memoirex;
					//corection de ) a la fin
					r1[memoire]=0;
					memoire--;
					counteri--;
					r1[memoire]=102.241985410123745128;
					//fin
					// filtrage du tableau
					/*int fi=0;
					int code=0;
					while(fi<99) {
						if(r1[fi]==102.241985410123745128) {
							code=1;
						}
						if(code==1) {
							r1[fi+1]=0;
							System.out.println(fi);
						}
						
						fi++;
					}*/
					//fin
					 ni=0;
					while(ni<l.longuerliste(r1)) {
						System.out.println("finr1["+ni+"]="+r1[ni]+"\n");
						
						ni++;
					}
					
					String s1c=Double.toString(d);
					x.appendtext(s1c);
					
					
					click=0;
					i=0;
					counteri++;;
					System.out.println(counteri+"cccccccccc<\n");
					
					
									
				}else {
					ecrirefaute();
				}
			}
			
		}
	}														
	public double traitementb3speciale(double[] l1) {
		//pour adapter les nombre avant pow 
		l1=operationspeciale(l1);
		//fin
		l1=traitementCSTP(l1);
		l1=triatementdesigne(l1);
		double d=operation(l1);
		return d;
		
	}
	public void traitementb4(double[]r1) {
		if (x!=null) {
			ecrire();
			if(i==0) {
				
			}else if(r1[i-1]!=101.241985410123745128&&r1[i-1]!=103.241985410123745128&&r1[i-1]!=104.241985410123745128&&r1[i-1]!=105.241985410123745128&&r1[i-1]!=108.241985410123745128&&r1[i-1]!=106.241985410123745128&&r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128) {
				x.appendtext(s[3]);
				
				r1[i]=103.241985410123745128;
				i++;
				counteri++;
			
			}else {
				ecrirefaute();
				
			}

		
		
		}
	}
	public void traitementb5(double[]r1,JButton butoon) {
		if (x!=null) {
			ecrire();
			if((i!=0&&(r1[i-1]==107.241985410123745128||r1[i-1]==109.241985410123745128||r1[i-1]==110.241985410123745128||r1[i-1]==111.241985410123745128||r1[i-1]==112.241985410123745128||r1[i-1]==113.241985410123745128||r1[i-1]==114.241985410123745128||r1[i-1]==115.241985410123745128||r1[i-1]==116.241985410123745128||r1[i-1]==117.241985410123745128||r1[i-1]==118.241985410123745128||r1[i-1]==119.241985410123745128||r1[i-1]==120.241985410123745128||r1[i-1]==121.241985410123745128||r1[i-1]==122.241985410123745128||r1[i-1]==123.241985410123745128))||(i>1&&r1[i-1]==0&&(r1[i-2]==101.241985410123745128||r1[i-2]==103.241985410123745128||r1[i-2]==104.241985410123745128||r1[i-2]==105.241985410123745128||r1[i-2]==106.241985410123745128||r1[i-2]==107.241985410123745128))||(i==1&&r1[i-1]==0)) {
				ecrirefaute();
			}else  {
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					memoire=0;
					counteri=0;
					obligationsaute();
					x.appendtext(s[4]);
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[4]);
					}else {
						x.appendtext(s[4]);
					}
					
					
				}
			
				r1[i]=Double.parseDouble(butoon.getText());
				i++;
				counteri++;
				
			}
			
		}
	}
	public void traitementb6(double[]r1,JButton butoon) {
		if (x!=null) {
			ecrire();
			if((i!=0&&(r1[i-1]==107.241985410123745128||r1[i-1]==109.241985410123745128||r1[i-1]==110.241985410123745128||r1[i-1]==111.241985410123745128||r1[i-1]==112.241985410123745128||r1[i-1]==113.241985410123745128||r1[i-1]==114.241985410123745128||r1[i-1]==115.241985410123745128||r1[i-1]==116.241985410123745128||r1[i-1]==117.241985410123745128||r1[i-1]==118.241985410123745128||r1[i-1]==119.241985410123745128||r1[i-1]==120.241985410123745128||r1[i-1]==121.241985410123745128||r1[i-1]==122.241985410123745128||r1[i-1]==123.241985410123745128))||(i>1&&r1[i-1]==0&&(r1[i-2]==101.241985410123745128||r1[i-2]==103.241985410123745128||r1[i-2]==104.241985410123745128||r1[i-2]==105.241985410123745128||r1[i-2]==106.241985410123745128||r1[i-2]==107.241985410123745128))||(i==1&&r1[i-1]==0)) {
				ecrirefaute();
			}else {
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[5]);
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[5]);
					}else {
						x.appendtext(s[5]);
					}
				}
			
				r1[i]=Double.parseDouble(butoon.getText());
				i++;
				counteri++;
				
			}
			
		}
	}
	public void traitementb7(double[]r1,JButton butoon) {
		if (x!=null) {
			ecrire();
			if((i!=0&&(r1[i-1]==107.241985410123745128||r1[i-1]==109.241985410123745128||r1[i-1]==110.241985410123745128||r1[i-1]==111.241985410123745128||r1[i-1]==112.241985410123745128||r1[i-1]==113.241985410123745128||r1[i-1]==114.241985410123745128||r1[i-1]==115.241985410123745128||r1[i-1]==116.241985410123745128||r1[i-1]==117.241985410123745128||r1[i-1]==118.241985410123745128||r1[i-1]==119.241985410123745128||r1[i-1]==120.241985410123745128||r1[i-1]==121.241985410123745128||r1[i-1]==122.241985410123745128||r1[i-1]==123.241985410123745128))||(i>1&&r1[i-1]==0&&(r1[i-2]==101.241985410123745128||r1[i-2]==103.241985410123745128||r1[i-2]==104.241985410123745128||r1[i-2]==105.241985410123745128||r1[i-2]==106.241985410123745128||r1[i-2]==107.241985410123745128))||(i==1&&r1[i-1]==0)) {
				ecrirefaute();
			}else {
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
				
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[6]);
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[6]);
					}else {
						x.appendtext(s[6]);
					}
				}
			
				counteri++;
				r1[i]=Double.parseDouble(butoon.getText());
				i++;
				
			}
			
		}
	
	}
	public void traitementb8(double[]r1) {
		if (x!=null) {
			ecrire();
			if(i==0) {
				
			}else if(r1[i-1]!=101.241985410123745128&&r1[i-1]!=103.241985410123745128&&r1[i-1]!=104.241985410123745128&&r1[i-1]!=105.241985410123745128&&r1[i-1]!=108.241985410123745128&&r1[i-1]!=106.241985410123745128&&r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128) {
				x.appendtext(s[7]);
				r1[i]=104.241985410123745128;
				i++;
				counteri++;
			
			}else {
				ecrirefaute();
			}
		}
	}
	public void traitementb9(double[]r1,JButton butoon) {
		if (x!=null) {
			ecrire();
			if((i!=0&&(r1[i-1]==107.241985410123745128||r1[i-1]==109.241985410123745128||r1[i-1]==110.241985410123745128||r1[i-1]==111.241985410123745128||r1[i-1]==112.241985410123745128||r1[i-1]==113.241985410123745128||r1[i-1]==114.241985410123745128||r1[i-1]==115.241985410123745128||r1[i-1]==116.241985410123745128||r1[i-1]==117.241985410123745128||r1[i-1]==118.241985410123745128||r1[i-1]==119.241985410123745128||r1[i-1]==120.241985410123745128||r1[i-1]==121.241985410123745128||r1[i-1]==122.241985410123745128||r1[i-1]==123.241985410123745128))||(i>1&&r1[i-1]==0&&(r1[i-2]==101.241985410123745128||r1[i-2]==103.241985410123745128||r1[i-2]==104.241985410123745128||r1[i-2]==105.241985410123745128||r1[i-2]==106.241985410123745128||r1[i-2]==107.241985410123745128))||(i==1&&r1[i-1]==0)) {
				ecrirefaute();
			}else {
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[8]);
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[8]);
					}else {
						x.appendtext(s[8]);
					}
				}
			
				counteri++;
				r1[i]=Double.parseDouble(butoon.getText());
				i++;
				
			}
			
		}
		
	}
	public void traitementb10(double[]r1,JButton butoon) {
		if (x!=null) {
			ecrire();
			if((i!=0&&(r1[i-1]==107.241985410123745128||r1[i-1]==109.241985410123745128||r1[i-1]==110.241985410123745128||r1[i-1]==111.241985410123745128||r1[i-1]==112.241985410123745128||r1[i-1]==113.241985410123745128||r1[i-1]==114.241985410123745128||r1[i-1]==115.241985410123745128||r1[i-1]==116.241985410123745128||r1[i-1]==117.241985410123745128||r1[i-1]==118.241985410123745128||r1[i-1]==119.241985410123745128||r1[i-1]==120.241985410123745128||r1[i-1]==121.241985410123745128||r1[i-1]==122.241985410123745128||r1[i-1]==123.241985410123745128))||(i>1&&r1[i-1]==0&&(r1[i-2]==101.241985410123745128||r1[i-2]==103.241985410123745128||r1[i-2]==104.241985410123745128||r1[i-2]==105.241985410123745128||r1[i-2]==106.241985410123745128||r1[i-2]==107.241985410123745128))||(i==1&&r1[i-1]==0)) {
				ecrirefaute();
			}else {
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[9]);
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[9]);
					}else {
						x.appendtext(s[9]);
					}
				}
				
				counteri++;
				r1[i]=Double.parseDouble(butoon.getText());
				i++;
				
			}
			
		}
		
	}
	public void traitementb11(double[]r1,JButton butoon) {
		if (x!=null) {
			ecrire();
			if((i!=0&&(r1[i-1]==107.241985410123745128||r1[i-1]==109.241985410123745128||r1[i-1]==110.241985410123745128||r1[i-1]==111.241985410123745128||r1[i-1]==112.241985410123745128||r1[i-1]==113.241985410123745128||r1[i-1]==114.241985410123745128||r1[i-1]==115.241985410123745128||r1[i-1]==116.241985410123745128||r1[i-1]==117.241985410123745128||r1[i-1]==118.241985410123745128||r1[i-1]==119.241985410123745128||r1[i-1]==120.241985410123745128||r1[i-1]==121.241985410123745128||r1[i-1]==122.241985410123745128||r1[i-1]==123.241985410123745128))||(i>1&&r1[i-1]==0&&(r1[i-2]==101.241985410123745128||r1[i-2]==103.241985410123745128||r1[i-2]==104.241985410123745128||r1[i-2]==105.241985410123745128||r1[i-2]==106.241985410123745128||r1[i-2]==107.241985410123745128))||(i==1&&r1[i-1]==0)) {
				ecrirefaute();
			}else {
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
				
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[10]);
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[10]);
					}else {
						x.appendtext(s[10]);
					}
				}
		
				counteri++;
				r1[i]=Double.parseDouble(butoon.getText());
				i++;
				
			}
			
		}
	}
	public void traitementb12(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				//corection de la signe moins au debut				
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					kleprincipaleenter=1;
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[11]);
					
				}else {
					obligation();
					x.appendtext(s[11]);
				
				}
				r1[i]=105.241985410123745128;
				i++;
				counteri++;
			
				//suite
			}else if(r1[i-1]!=101.241985410123745128&&r1[i-1]!=103.241985410123745128&&r1[i-1]!=104.241985410123745128&&r1[i-1]!=105.241985410123745128&&r1[i-1]!=108.241985410123745128&&r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128) {
				x.appendtext(s[11]);
				kleprincipaleenter=0;
				r1[i]=105.241985410123745128;
				i++;
				counteri++;
			
			}else {
				ecrirefaute();
			}
			if(kleprincipaleenter==1) {
				identificationsign=1;
				signentrer=1;
			}
			kleprincipaleenter=0;
			
		}
	
	}
	public void traitementb13(double[]r1,JButton butoon) {
		if (x!=null) {
			ecrire();
			if((i!=0&&(r1[i-1]==107.241985410123745128||r1[i-1]==109.241985410123745128||r1[i-1]==110.241985410123745128||r1[i-1]==111.241985410123745128||r1[i-1]==112.241985410123745128||r1[i-1]==113.241985410123745128||r1[i-1]==114.241985410123745128||r1[i-1]==115.241985410123745128||r1[i-1]==116.241985410123745128||r1[i-1]==117.241985410123745128||r1[i-1]==118.241985410123745128||r1[i-1]==119.241985410123745128||r1[i-1]==120.241985410123745128||r1[i-1]==121.241985410123745128||r1[i-1]==122.241985410123745128||r1[i-1]==123.241985410123745128))||(i>1&&r1[i-1]==0&&(r1[i-2]==101.241985410123745128||r1[i-2]==103.241985410123745128||r1[i-2]==104.241985410123745128||r1[i-2]==105.241985410123745128||r1[i-2]==106.241985410123745128||r1[i-2]==107.241985410123745128))||(i==1&&r1[i-1]==0)) {
				ecrirefaute();
			}else {
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
				
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[12]);
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[12]);
					}else {
						x.appendtext(s[12]);
					}
				}
			
				counteri++;
				r1[i]=Double.parseDouble(butoon.getText());
				i++;
				
			}
			
		}
	}
	public void traitementb14(double[]r1,JButton butoon) {
		if (x!=null) {
			ecrire();
			if((i!=0&&(r1[i-1]==107.241985410123745128||r1[i-1]==109.241985410123745128||r1[i-1]==110.241985410123745128||r1[i-1]==111.241985410123745128||r1[i-1]==112.241985410123745128||r1[i-1]==113.241985410123745128||r1[i-1]==114.241985410123745128||r1[i-1]==115.241985410123745128||r1[i-1]==116.241985410123745128||r1[i-1]==117.241985410123745128||r1[i-1]==118.241985410123745128||r1[i-1]==119.241985410123745128||r1[i-1]==120.241985410123745128||r1[i-1]==121.241985410123745128||r1[i-1]==122.241985410123745128||r1[i-1]==123.241985410123745128))||(i>1&&r1[i-1]==0&&(r1[i-2]==101.241985410123745128||r1[i-2]==103.241985410123745128||r1[i-2]==104.241985410123745128||r1[i-2]==105.241985410123745128||r1[i-2]==106.241985410123745128||r1[i-2]==107.241985410123745128))||(i==1&&r1[i-1]==0)) {
				ecrirefaute();
			}else {
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
				
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[13]);
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[13]);
					}else {
						x.appendtext(s[13]);
					}
				}
			
				counteri++;
				r1[i]=Double.parseDouble(butoon.getText());
				i++;
				
			}
			
		}
	}
	public void traitementb15(double[]r1,JButton butoon) {
		if (x!=null) {
			ecrire();
			if((i!=0&&(r1[i-1]==107.241985410123745128||r1[i-1]==109.241985410123745128||r1[i-1]==110.241985410123745128||r1[i-1]==111.241985410123745128||r1[i-1]==112.241985410123745128||r1[i-1]==113.241985410123745128||r1[i-1]==114.241985410123745128||r1[i-1]==115.241985410123745128||r1[i-1]==116.241985410123745128||r1[i-1]==117.241985410123745128||r1[i-1]==118.241985410123745128||r1[i-1]==119.241985410123745128||r1[i-1]==120.241985410123745128||r1[i-1]==121.241985410123745128||r1[i-1]==122.241985410123745128||r1[i-1]==123.241985410123745128))||(i>1&&r1[i-1]==0&&(r1[i-2]==101.241985410123745128||r1[i-2]==103.241985410123745128||r1[i-2]==104.241985410123745128||r1[i-2]==105.241985410123745128||r1[i-2]==106.241985410123745128||r1[i-2]==107.241985410123745128))||(i==1&&r1[i-1]==0)) {
				ecrirefaute();
			}else {
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
				
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[14]);
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[14]);
					}else {
						x.appendtext(s[14]);
					}
				}
			
				counteri++;
				r1[i]=Double.parseDouble(butoon.getText());
				i++;
				
			}
			
		}
	}
	public void traitementb16(double[]r1,JButton butoon) {
		ecrire();
		if((i!=0&&(r1[i-1]==107.241985410123745128||r1[i-1]==109.241985410123745128||r1[i-1]==110.241985410123745128||r1[i-1]==111.241985410123745128||r1[i-1]==112.241985410123745128||r1[i-1]==113.241985410123745128||r1[i-1]==114.241985410123745128||r1[i-1]==115.241985410123745128||r1[i-1]==116.241985410123745128||r1[i-1]==117.241985410123745128||r1[i-1]==118.241985410123745128||r1[i-1]==119.241985410123745128||r1[i-1]==120.241985410123745128||r1[i-1]==121.241985410123745128||r1[i-1]==122.241985410123745128||r1[i-1]==123.241985410123745128))||(i>1&&r1[i-1]==0&&(r1[i-2]==101.241985410123745128||r1[i-2]==103.241985410123745128||r1[i-2]==104.241985410123745128||r1[i-2]==105.241985410123745128||r1[i-2]==106.241985410123745128||r1[i-2]==107.241985410123745128))||(i==1&&r1[i-1]==0)) {
			ecrirefaute();
		}else {
			if(r1[memoire]==102.241985410123745128) {
				clair(r1);
			
				memoire=0;
				counteri=0;
				
				obligationsaute();
				x.appendtext(s[15]);
			}else {
				if(i==0) {
					obligation();
					x.appendtext(s[15]);
				}else {
					x.appendtext(s[15]);
				}
			}
		
			counteri++;
			r1[i]=Double.parseDouble(butoon.getText());
			i++;
			
		}
		
	}
				 
	public void traitementb17(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i!=0) {
				if(r1[i-1]!=101.241985410123745128&&r1[i-1]!=103.241985410123745128&&r1[i-1]!=104.241985410123745128&&r1[i-1]!=105.241985410123745128&&r1[i-1]!=106.241985410123745128&&r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=113.241985410123745128&&r1[i-1]!=114.241985410123745128&&r1[i-1]!=115.241985410123745128&&r1[i-1]!=116.241985410123745128&&r1[i-1]!=117.241985410123745128&&r1[i-1]!=118.241985410123745128&&r1[i-1]!=119.241985410123745128&&r1[i-1]!=120.241985410123745128&&r1[i-1]!=121.241985410123745128&&r1[i-1]!=122.241985410123745128&&r1[i-1]!=123.241985410123745128&&r1[i-1]!=124.241985410123745128) {
					ecrirefaute();
				}else {	
					x.appendtext(s[16]);
						
					r1[i]=106.241985410123745128;
					i++;
					click++;
					counteri++;
					System.out.print("nbclic"+click+"\n");
			
				}					
			}else {
				if(r1[memoire]==102.241985410123745128) {
					int corectiondepoint=0;
					while(corectiondepoint<l.longuerliste(positiondepointtab)) {
						r1[(int)positiondepointtab[corectiondepoint]]=0;
						corectiondepoint++;
					}
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[16]);
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[16]);
					}else {
						x.appendtext(s[16]);
					}
				}
				r1[i]=106.241985410123745128;
				i++;
				click++;
				counteri++;
				System.out.print("nbclic"+click+"\n");
			}
		}
	}
	public void traitementb18(double[]r1) {
		if(x!=null) {
			ecrire();
			int n=0;
			int m=0;
			while(n<i) {
				if(r1[n]==106.241985410123745128) {
					m++;
				}else if(r1[n]==107.241985410123745128) {
					m--;
				}
				n++;
			}
			if(m==1) {
				ecrirefaute();
			}else if(r1[i-1]!=101.241985410123745128&&r1[i-1]!=103.241985410123745128&&r1[i-1]!=104.241985410123745128&&r1[i-1]!=105.241985410123745128&&r1[i-1]!=108.241985410123745128&&r1[i-1]!=106.241985410123745128) {
				x.appendtext(s[17]);
				counteri++;
				r1[i]=107.241985410123745128;
				i++;
				
			}else {
				ecrirefaute();
			}
									
		}
	}
	public void traitementb19(double[]r1) {
		if(x!=null) {
			ecrire();
			int verification=0;
			int m=0;
			while(verification<i) {
				verification++;
				if(r1[verification]==108.241985410123745128) {
					m++;
				}else if(r1[verification]==101.241985410123745128||r1[verification]==103.241985410123745128||r1[verification]==104.241985410123745128||r1[verification]==105.241985410123745128) {
					m--;
				}
			}
			if(m==1) {
				ecrirefaute();
			}else {
				if(i==0) {
					ecrirefaute();
				}else if(r1[i-1]!=101.241985410123745128&&r1[i-1]!=103.241985410123745128&&r1[i-1]!=104.241985410123745128&&r1[i-1]!=105.241985410123745128&&r1[i-1]!=108.241985410123745128&&r1[i-1]!=106.241985410123745128&&r1[i-1]!=107.241985410123745128&&r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=113.241985410123745128&&r1[i-1]!=114.241985410123745128&&r1[i-1]!=115.241985410123745128&&r1[i-1]!=116.241985410123745128&&r1[i-1]!=117.241985410123745128&&r1[i-1]!=118.241985410123745128&&r1[i-1]!=119.241985410123745128&&r1[i-1]!=120.241985410123745128&&r1[i-1]!=121.241985410123745128&&r1[i-1]!=122.241985410123745128&&r1[i-1]!=123.241985410123745128) {
					x.appendtext(s[18]);
					
					r1[i]=108.241985410123745128;
					i++;
					counteri++;
				
				}else {
					ecrirefaute();
				}
				
				
			}
			
		}
	}
	public void traitementb20(double[]r1) {
		if(x!=null) {
			ecrire();
			if(signentrer==1) {
				identificationsign=1;
			}
			
			identification=1;
			clickCSTP=0;
			if(counteri==0) {
				
			}else {
				counteri--;;
				i=counteri;
				r1[counteri]=0;
				x.removetext();
				int corectiondepoint=0;
				/*while(corectiondepoint<l.longuerliste(positiondepointtab)) {
					r1[(int)positiondepointtab[corectiondepoint]]=108;
					corectiondepoint++;
				}*/
				if(r1[counteri]==108.241985410123745128) {
					r1[counteri]=0;
				}
				if(r1[counteri]==105.241985410123745128&&counteri==0) {
					identificationsign=0;
				}
				if(clickCSTP==0) {
					identification=0;
					signentrer=0;
					
				}
			
				click=0;
				int n=0;
				while(n<counteri) {
					//suprission de injection de ( au debut
					if(n==0) {
						click++;
						m--;
						
					
					}else if(r1[n]==101.241985410123745128) {
						x.appendtext("*");
					
					}else if(r1[n]==103.241985410123745128) {
						x.appendtext("/");
					}else if(r1[n]==104.241985410123745128) {
						x.appendtext("+");
					}else if(r1[n]==105.241985410123745128) {
						x.appendtext("-");
					}else if(r1[n]==106.241985410123745128) {
						m--;
						click++;
						x.appendtext("(");
					}else if(r1[n]==107.241985410123745128) {
						
							m++;
							x.appendtext(")");
						
						
					}else if(r1[n]==108.241985410123745128) {
						x.appendtext(".");
					}else if(r1[n]==109.241985410123745128) {
						clickCSTP++;
						
						x.appendtext("cos");
					}else if(r1[n]==110.241985410123745128) {
						clickCSTP++;
						
						
						x.appendtext("sin");
					}else if(r1[n]==111.241985410123745128) {
						clickCSTP++;
					
						x.appendtext("tan");
					}else if(r1[n]==112.241985410123745128) {
						clickCSTP++;
						
						x.appendtext("sqrt");
					}else if(r1[n]==113.241985410123745128) {
						clickCSTP++;
						
						x.appendtext("acos");
					}else if(r1[n]==114.241985410123745128) {
						clickCSTP++;
						
						x.appendtext("asin");
					}else if(r1[n]==115.241985410123745128) {
						clickCSTP++;
						
						x.appendtext("atan");
					}else if(r1[n]==116.241985410123745128) {
						clickCSTP++;
						
						x.appendtext("abs");
					}else if(r1[n]==117.241985410123745128) {
						clickCSTP++;
						
						x.appendtext("exp");
					}else if(r1[n]==118.241985410123745128) {
						clickCSTP++;
						
						x.appendtext("ln");
					}else if(r1[n]==119.241985410123745128) {
						clickCSTP++;
						
						x.appendtext("log");
					}else if(r1[n]==120.241985410123745128) {
						clickCSTP++;
						
						x.appendtext("fact");
					}else if(r1[n]==121.241985410123745128) {
						clickCSTP++;
						
						x.appendtext("E");
					}else if(r1[n]==122.241985410123745128) {
						clickCSTP++;
						
						x.appendtext("pow");
					}else if(r1[n]==123.241985410123745128) {
						clickCSTP++;
						
						x.appendtext("module");
					}else if(r1[n]==124.241985410123745128) {
						clickCSTP++;
						
						x.appendtext("ans");
					}else {
						int intc=(int)r1[n];
						x.appendtext(Integer.toString(intc));
						
						
					}
					n++;
					
				
				}
				int ni=0;
				while(ni<l.longuerliste(r1)) {
					System.out.println("deleter1["+ni+"]="+r11[ni]+"\n");
					
					ni++;
				}
				
			}
		}
	}
	public void traitementb21(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				//corection de la signe moins au debut				
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[19]);
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[19]);
					}else {
						x.appendtext(s[19]);
					}
				
				}
				r1[i]=109.241985410123745128;
				i++;
				counteri++;
				clickCSTP++;
				// finale update
				cstpeasy();
				//fin
				
				//suite
			}else if(r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=108.241985410123745128) {
				if(r1[i-1]==101.241985410123745128||r1[i-1]==103.241985410123745128||r1[i-1]==104.241985410123745128||r1[i-1]==105.241985410123745128||r1[i-1]==106.241985410123745128) {
				x.appendtext(s[19]);
				
				r1[i]=109.241985410123745128;
				i++;
				counteri++;
				clickCSTP++;
				// finale update
				cstpeasy();
				//fin
				}else {
					ecrirefaute();
				}
			}else {
				ecrirefaute();
			}
			
		}
	
	}
	public void traitementb22(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				//corection de la signe moins au debut				
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[20]);
					
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[20]);
					}else {
						x.appendtext(s[20]);
					}
				
				}
				
				r1[i]=110.241985410123745128;
				i++;
				counteri++;
				clickCSTP++;
				// finale update
				cstpeasy();
				//fin
				//suite
			}else if(r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=108.241985410123745128) {
				if(r1[i-1]==101.241985410123745128||r1[i-1]==103.241985410123745128||r1[i-1]==104.241985410123745128||r1[i-1]==105.241985410123745128||r1[i-1]==106.241985410123745128) {
					x.appendtext(s[20]);
					
					r1[i]=110.241985410123745128;
					i++;
					counteri++;
					clickCSTP++;
					// finale update
					cstpeasy();
					//fin
					}else {
						ecrirefaute();
					}
			}else {
				ecrirefaute();
			}
			
			
		}
	
	}
	public void traitementb23(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				//corection de la signe moins au debut				
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[21]);
					
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[21]);
					}else {
						x.appendtext(s[21]);
					}
				
				}
				
				r1[i]=111.241985410123745128;
				i++;
				counteri++;
				clickCSTP++;
				// finale update
				cstpeasy();
				//fin
				//suite
			}else if(r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=108.241985410123745128) {
				if(r1[i-1]==101.241985410123745128||r1[i-1]==103.241985410123745128||r1[i-1]==104.241985410123745128||r1[i-1]==105.241985410123745128||r1[i-1]==106.241985410123745128) {
					x.appendtext(s[21]);
					
					r1[i]=111.241985410123745128;
					i++;
					counteri++;
					clickCSTP++;
					// finale update
					cstpeasy();
					//fin
					}else {
						ecrirefaute();
					}
				
			}else {
				ecrirefaute();
			}
			
			
		}
	
	}
	public void traitementb24(double[]r1){
		if(x!=null) {
			ecrire();
			if(i==0) {
				//corection de la signe moins au debut				
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[22]);
					
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[22]);
					}else {
						x.appendtext(s[22]);
					}
				
				}
				r1[i]=112.241985410123745128;
				i++;
				counteri++;
				clickCSTP++;
				kleprincipaleenter=1;
				// finale update
				cstpeasy();
				//fin
				//suite
			}else if(r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=108.241985410123745128) {
				if(r1[i-1]==101.241985410123745128||r1[i-1]==103.241985410123745128||r1[i-1]==104.241985410123745128||r1[i-1]==105.241985410123745128||r1[i-1]==106.241985410123745128) {
					x.appendtext(s[22]);
					kleprincipaleenter=0;
					r1[i]=112.241985410123745128;
					i++;
					counteri++;
					clickCSTP++;
					kleprincipaleenter++;
					// finale update
					cstpeasy();
					//fin
					}else {
						ecrirefaute();
					}
				
			}else {
				ecrirefaute();
			}
			
			
		}
	
	}
	public void traitementb25(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				//corection de la signe moins au debut				
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[23]);
					
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[23]);
					}else {
						x.appendtext(s[23]);
					}
				
				}
				r1[i]=113.241985410123745128;
				i++;
				counteri++;
				clickCSTP++;
				kleprincipaleenter=1;
				// finale update
				cstpeasy();
				//fin
				//suite
			}else if(r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=108.241985410123745128) {
				if(r1[i-1]==101.241985410123745128||r1[i-1]==103.241985410123745128||r1[i-1]==104.241985410123745128||r1[i-1]==105.241985410123745128||r1[i-1]==106.241985410123745128) {
					x.appendtext(s[23]);
					kleprincipaleenter=0;
					r1[i]=113.241985410123745128;
					i++;
					counteri++;
					clickCSTP++;
					kleprincipaleenter++;
					// finale update
					cstpeasy();
					//fin
					}else {
						ecrirefaute();
					}
			}else {
				ecrirefaute();
			}
			
			
		}
	
	}
	public void traitementb26(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				//corection de la signe moins au debut				
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[24]);
					
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[24]);
					}else {
						x.appendtext(s[24]);
					}
				
				}
				r1[i]=114.241985410123745128;
				i++;
				counteri++;
				clickCSTP++;
				kleprincipaleenter=1;
				// finale update
				cstpeasy();
				//fin
				//suite
			}else if(r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=108.241985410123745128) {
				if(r1[i-1]==101.241985410123745128||r1[i-1]==103.241985410123745128||r1[i-1]==104.241985410123745128||r1[i-1]==105.241985410123745128||r1[i-1]==106.241985410123745128) {
					x.appendtext(s[24]);
					kleprincipaleenter=0;
					r1[i]=114.241985410123745128;
					i++;
					counteri++;
					clickCSTP++;
					kleprincipaleenter++;
					// finale update
					cstpeasy();
					//fin
					}else {
						ecrirefaute();
					}
			}else {
				ecrirefaute();
			}
			
			
		}
	
	}
	public void traitementb27(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				//corection de la signe moins au debut				
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[25]);
					
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[25]);
					}else {
						x.appendtext(s[25]);
					}
				
				}
				r1[i]=115.241985410123745128;
				i++;
				counteri++;
				clickCSTP++;
				kleprincipaleenter=1;
				// finale update
				cstpeasy();
				//fin
				//suite
			}else if(r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=108.241985410123745128) {
				if(r1[i-1]==101.241985410123745128||r1[i-1]==103.241985410123745128||r1[i-1]==104.241985410123745128||r1[i-1]==105.241985410123745128||r1[i-1]==106.241985410123745128) {
					x.appendtext(s[25]);
					kleprincipaleenter=0;
					r1[i]=115.241985410123745128;
					i++;
					counteri++;
					clickCSTP++;
					kleprincipaleenter++;
					// finale update
					cstpeasy();
					//fin
					}else {
						ecrirefaute();
					}
			}else {
				ecrirefaute();
			}
			
			
		}
	
	}
	public void traitementb28(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				//corection de la signe moins au debut				
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					
					obligationsaute();
					x.appendtext(s[26]);
					
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[26]);
					}else {
						x.appendtext(s[26]);
					}
				
				}
				r1[i]=116.241985410123745128;
				i++;
				counteri++;
				clickCSTP++;
				kleprincipaleenter=1;
				// finale update
				cstpeasy();
				//fin
				//suite
			}else if(r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=108.241985410123745128) {
				if(r1[i-1]==101.241985410123745128||r1[i-1]==103.241985410123745128||r1[i-1]==104.241985410123745128||r1[i-1]==105.241985410123745128||r1[i-1]==106.241985410123745128) {
					x.appendtext(s[26]);
					kleprincipaleenter=0;
					r1[i]=116.241985410123745128;
					i++;
					counteri++;
					clickCSTP++;
					kleprincipaleenter++;
					// finale update
					cstpeasy();
					//fin
					}else {
						ecrirefaute();
					}
			}else {
				ecrirefaute();
			}
			
			
		}
	
	}
	public void traitementb29(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				//corection de la signe moins au debut				
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[27]);
					
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[27]);
					}else {
						x.appendtext(s[27]);
					}
				
				}
				r1[i]=117.241985410123745128;
				i++;
				counteri++;
				clickCSTP++;
				kleprincipaleenter=1;
				// finale update
				cstpeasy();
				//fin
				//suite
			}else if(r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=108.241985410123745128) {
				if(r1[i-1]==101.241985410123745128||r1[i-1]==103.241985410123745128||r1[i-1]==104.241985410123745128||r1[i-1]==105.241985410123745128||r1[i-1]==106.241985410123745128) {
					x.appendtext(s[27]);
					kleprincipaleenter=0;
					r1[i]=117.241985410123745128;
					i++;
					counteri++;
					clickCSTP++;
					kleprincipaleenter++;
					// finale update
					cstpeasy();
					//fin
					}else {
						ecrirefaute();
					}
			}else {
				ecrirefaute();
			}
			
			
		}
	
	}
	public void traitementb30(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				//corection de la signe moins au debut				
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[28]);
					
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[28]);
					}else {
						x.appendtext(s[28]);
					}
				
				}
				r1[i]=118.241985410123745128;
				i++;
				counteri++;
				clickCSTP++;
				kleprincipaleenter=1;
				// finale update
				cstpeasy();
				//fin
				//suite
			}else if(r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=108.241985410123745128) {
				if(r1[i-1]==101.241985410123745128||r1[i-1]==103.241985410123745128||r1[i-1]==104.241985410123745128||r1[i-1]==105.241985410123745128||r1[i-1]==106.241985410123745128) {
					x.appendtext(s[28]);
					kleprincipaleenter=0;
					r1[i]=118.241985410123745128;
					i++;
					counteri++;
					clickCSTP++;
					kleprincipaleenter++;
					// finale update
					cstpeasy();
					//fin
					}else {
						ecrirefaute();
					}
			}else {
				ecrirefaute();
			}
			
			
		}
	
	}
	public void traitementb31(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				//corection de la signe moins au debut				
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[29]);
					
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[29]);
					}else {
						x.appendtext(s[29]);
					}
				
				}
				r1[i]=119.241985410123745128;
				i++;
				counteri++;
				clickCSTP++;
				kleprincipaleenter=1;
				// finale update
				cstpeasy();
				//fin
				//suite
			}else if(r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=108.241985410123745128) {
				if(r1[i-1]==101.241985410123745128||r1[i-1]==103.241985410123745128||r1[i-1]==104.241985410123745128||r1[i-1]==105.241985410123745128||r1[i-1]==106.241985410123745128) {
					x.appendtext(s[29]);
					kleprincipaleenter=0;
					r1[i]=119.241985410123745128;
					i++;
					counteri++;
					clickCSTP++;
					kleprincipaleenter++;
					// finale update
					cstpeasy();
					//fin
					}else {
						ecrirefaute();
					}
			}else {
				ecrirefaute();
			}
			
			
		}
	
	}
	public void traitementb32(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				//corection de la signe moins au debut				
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[30]);
					
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[30]);
					}else {
						x.appendtext(s[30]);
					}
				
				}
				r1[i]=120.241985410123745128;
				i++;
				counteri++;
				clickCSTP++;
				kleprincipaleenter=1;
				// finale update
				cstpeasy();
				//fin
				//suite
			}else if(r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=108.241985410123745128) {
				if(r1[i-1]==101.241985410123745128||r1[i-1]==103.241985410123745128||r1[i-1]==104.241985410123745128||r1[i-1]==105.241985410123745128||r1[i-1]==106.241985410123745128) {
					x.appendtext(s[30]);
					kleprincipaleenter=0;
					r1[i]=120.241985410123745128;
					i++;
					counteri++;
					clickCSTP++;
					kleprincipaleenter++;
					// finale update
					cstpeasy();
					//fin
					}else {
						ecrirefaute();
					}
			}else {
				ecrirefaute();
			}
			
			
		}
	
	}
	public void traitementb33(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				//corection de la signe moins au debut				
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[31]);
					
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[31]);
					}else {
						x.appendtext(s[31]);
					}
				
				}
				r1[i]=121.241985410123745128;
				i++;
				counteri++;
				clickCSTP++;
				kleprincipaleenter=1;
				// finale update
				cstpeasy();
				//fin
				//suite
			}else if(r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=108.241985410123745128) {
				if(r1[i-1]==101.241985410123745128||r1[i-1]==103.241985410123745128||r1[i-1]==104.241985410123745128||r1[i-1]==105.241985410123745128||r1[i-1]==106.241985410123745128) {
					x.appendtext(s[31]);
					kleprincipaleenter=0;
					r1[i]=121.241985410123745128;
					i++;
					counteri++;
					clickCSTP++;
					kleprincipaleenter++;
					// finale update
					cstpeasy();
					//fin
					}else {
						ecrirefaute();
					}
			}else {
				ecrirefaute();
			}
			
			
		}
	}
	public void traitementb34(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				ecrirefaute();
				//corection de la signe moins au debut				
				/*if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[32]);
					
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[32]);
					}else {
						x.appendtext(s[32]);
					}
				
				}
				r1[i]=122.241985410123745128;
				i++;
				counteri++;
				clickCSTP++;
				kleprincipaleenter=1;*/
				//suite
			}else if(r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=108.241985410123745128) {
				if(r1[i-1]==101.241985410123745128||r1[i-1]==103.241985410123745128||r1[i-1]==104.241985410123745128||r1[i-1]==105.241985410123745128||r1[i-1]==106.241985410123745128) {
					ecrirefaute();
				}else {
						x.appendtext(s[32]);
						kleprincipaleenter=0;
						r1[i]=122.241985410123745128;
						i++;
						counteri++;
						clickCSTP++;
						kleprincipaleenter++;
						// finale update
						cstpeasy();
						//fin
				}
			}else {
				ecrirefaute();
			}
			
			
		}
	}
	public void traitementb35(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				ecrirefaute();
				//corection de la signe moins au debut				
				/*if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[33]);
					
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[33]);
					}else {
						x.appendtext(s[33]);
					}
				
				}
				r1[i]=123.241985410123745128;
				i++;
				counteri++;
				clickCSTP++;
				kleprincipaleenter=1;*/
				//suite
			}else if(r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=108.241985410123745128) {
					if(r1[i-1]==101.241985410123745128||r1[i-1]==103.241985410123745128||r1[i-1]==104.241985410123745128||r1[i-1]==105.241985410123745128||r1[i-1]==106.241985410123745128) {
						ecrirefaute();
					}else {
							x.appendtext(s[33]);
							kleprincipaleenter=0;
							r1[i]=123.241985410123745128;
							i++;
							counteri++;
							clickCSTP++;
							kleprincipaleenter++;
							// finale update
							cstpeasy();
							//fin
					}
					
			}else {
				ecrirefaute();
			}
			
			
		}
	}
	public void traitementb36(double[]r1) {
		if(x!=null) {
			ecrire();
			if(i==0) {
				//corection de la signe moins au debut				
				if(r1[memoire]==102.241985410123745128) {
					clair(r1);
					memoire=0;
					counteri=0;
					
					obligationsaute();
					x.appendtext(s[34]);
					
					
					
				}else {
					if(i==0) {
						obligation();
						x.appendtext(s[34]);
					}else {
						x.appendtext(s[34]);
					}
				
				}
				r1[i]=ans;
				i++;
				counteri++;
				clickCSTP++;
				kleprincipaleenter=1;
				//suite
			}else if(r1[i-1]!=109.241985410123745128&&r1[i-1]!=110.241985410123745128&&r1[i-1]!=111.241985410123745128&&r1[i-1]!=112.241985410123745128&&r1[i-1]!=108.241985410123745128) {
				if(r1[i-1]==101.241985410123745128||r1[i-1]==103.241985410123745128||r1[i-1]==104.241985410123745128||r1[i-1]==105.241985410123745128||r1[i-1]==106.241985410123745128) {
					x.appendtext(s[34]);
					kleprincipaleenter=0;
					r1[i]=ans;
					i++;
					counteri++;
					clickCSTP++;
					kleprincipaleenter++;
					}else {
						ecrirefaute();
					}
			}else {
				ecrirefaute();
			}
			
			
		}
	}
	public void actionPerformed(ActionEvent e) {

			JButton butoon=(JButton)e.getSource();			
			
			if (butoon==b1) {
				traitementb1(r1);				
			}else if(butoon==b2) {
				traitementb2(r1);					
			}else if(butoon==b3) {
				traitementb3(r1);															
			}else if(butoon==b4) {
				traitementb4(r1);					
			}else if(butoon==b5) {
				traitementb5(r1,butoon);					
			}else if(butoon==b6) {
				traitementb6(r1,butoon);
			}else if(butoon==b7) {
				traitementb7(r1,butoon);					
			}else if(butoon==b8) {
				traitementb8(r1);					
			}else if(butoon==b9) {
				traitementb9(r1,butoon);
			}else if(butoon==b10) {
				traitementb10(r1,butoon);
			}else if(butoon==b11) {
				traitementb11(r1,butoon);
			}else if(butoon==b12) {
				traitementb12(r1);					
			}else if(butoon==b13) {
				traitementb13(r1,butoon);					
			}else if(butoon==b14) {
				traitementb14(r1,butoon);					
			}else if(butoon==b15) {
				traitementb15(r1,butoon);					
			}else if(butoon==b16) {
				traitementb16(r1,butoon);
			}else if(butoon==b17) {
				traitementb17(r1);
			}else if(butoon==b18) {
				traitementb18(r1);
			}else if(butoon==b19) {
				traitementb19(r1);		
			}else if(butoon==b20) {
				traitementb20(r1);
												
			}else if(butoon==b21) {
				traitementb21(r1);
												
			}else if(butoon==b22) {
				traitementb22(r1);
												
			}else if(butoon==b23) {
				traitementb23(r1);
												
			}else if(butoon==b24) {
				traitementb24(r1);
												
			}else if(butoon==b25) {
				traitementb25(r1);
												
			}else if(butoon==b26) {
				traitementb26(r1);
												
			}else if(butoon==b27) {
				traitementb27(r1);
												
			}else if(butoon==b28) {
				traitementb28(r1);
												
			}else if(butoon==b29) {
				traitementb29(r1);
												
			}else if(butoon==b30) {
				traitementb30(r1);
												
			}else if(butoon==b31) {
				traitementb31(r1);
												
			}else if(butoon==b32) {
				traitementb32(r1);
												
			}else if(butoon==b33) {
				traitementb33(r1);
												
			}else if(butoon==b34) {
				traitementb34(r1);
												
			}else if(butoon==b35) {
				traitementb35(r1);
												
			}else if(butoon==b36) {
				traitementb36(r1);
												
			}
		
		}
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()){
			case 127:
				traitementb1(r1);
				break;
			case 106:
				traitementb2(r1);
				break;
			case 61:
				System.out.println("b3");
				traitementb3(r1);
				System.out.println("b3");
				break;
			case 111:
				traitementb4(r1);
				
				break;
			case 97:
				traitementb5(r1,b5);
				break;
			case 98:
				traitementb6(r1,b6);
				break;
			case 99:
				traitementb7(r1,b7);
				break;
			case 107:
				traitementb8(r1);
				break;
			case 100:
				traitementb9(r1,b9);
				break;
			case 101:
				traitementb10(r1,b10);
				break;
			case 102:
				traitementb11(r1,b11);
				break;
			case 109:
				traitementb12(r1);
				break;
			case 103:
				traitementb13(r1,b13);
				break;
			case 104:
				traitementb14(r1,b14);
				break;
			case 105:
				traitementb15(r1,b15);
				break;
			case 96:
				traitementb16(r1,b16);
				break;
			case 53:
				traitementb17(r1);
				break;
			case 522:
				traitementb18(r1);
				break;
			case 110:
				traitementb19(r1);
				break;
			case 8:
				traitementb20(r1);
				break;
			case 67:
				traitementb21(r1);
				break;
			case 83:
				traitementb22(r1);
				break;
			case 84:
				traitementb23(r1);
				break;
			case 82:
				traitementb24(r1);
				break;
			default:
				break;
			
			
		}
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}