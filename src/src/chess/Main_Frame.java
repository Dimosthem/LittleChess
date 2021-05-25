package chess;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class Main_Frame  implements MouseListener {
JFrame f=new JFrame();
private int location;


JComponent c;
private BufferedImage image;  //θα μπορούσα να κάνω array list αλλά δεν βρήκα τον λόγο να το κάνω
private BufferedImage image2;
private BufferedImage image3;
private BufferedImage image4;
private BufferedImage image5;
private BufferedImage image6;
private BufferedImage image7;
private BufferedImage image8;
private BufferedImage image9;
private BufferedImage image10;
private BufferedImage image11;
private BufferedImage image12;
Properties property0 = new Properties(false, 1,2);
Properties property1 = new Properties(false, 2,2);
Properties property2 = new Properties(false, 3,2);
Properties property3 = new Properties(false, 4,2);
Properties property4 = new Properties(false, 5,2);
Properties property5 = new Properties(false, 3,2);
Properties property6 = new Properties(false, 2,2);
Properties property7 = new Properties(false, 1,2);
Properties property8 = new Properties(false, 0,2);
Properties property9 = new Properties(false, 0,2);
Properties property10 = new Properties(false, 0,2);
Properties property11 = new Properties(false, 0,2);
Properties property12 = new Properties(false, 0,2);
Properties property13 = new Properties(false, 0,2);
Properties property14 = new Properties(false, 0,2);
Properties property15 = new Properties(false, 0,2);
Properties property16 = new Properties(false, 6,0);
Properties property17 = new Properties(false, 6,0);
Properties property18 = new Properties(false, 6,0);//δεν ήξερα πως να βάλω φορ και ναοριζω και παραμετρους
Properties property19 = new Properties(false, 6,0);
Properties property20 = new Properties(false, 6,0);
Properties property21 = new Properties(false, 6,0);
Properties property22 = new Properties(false, 6,0);
Properties property23 = new Properties(false, 6,0);
Properties property24 = new Properties(false, 6,0);
Properties property25 = new Properties(false, 6,0);
Properties property26 = new Properties(false, 6,0);
Properties property27 = new Properties(false, 6,0);
Properties property28 = new Properties(false, 6,0);
Properties property29 = new Properties(false, 6,0);
Properties property30 = new Properties(false, 6,0);
Properties property31 = new Properties(false, 6,0);
Properties property32 = new Properties(false, 6,0);
Properties property33 = new Properties(false, 6,0);
Properties property34 = new Properties(false, 6,0);
Properties property35 = new Properties(false, 6,0);
Properties property36 = new Properties(false, 6,0);
Properties property37 = new Properties(false, 6,0);
Properties property38 = new Properties(false, 6,0);
Properties property39 = new Properties(false, 6,0);
Properties property40 = new Properties(false, 6,0);
Properties property41 = new Properties(false, 6,0);
Properties property42 = new Properties(false, 6,0);
Properties property43 = new Properties(false, 6,0);
Properties property44 = new Properties(false, 6,0);
Properties property45 = new Properties(false, 6,0);
Properties property46 = new Properties(false, 6,0);
Properties property47 = new Properties(false, 6,0);
Properties property48 = new Properties(false, 0,1);
Properties property49 = new Properties(false, 0,1);
Properties property50 = new Properties(false, 0,1);
Properties property51 = new Properties(false, 0,1);
Properties property52= new Properties(false, 0,1);
Properties property53 = new Properties(false, 0,1);
Properties property54 = new Properties(false, 0,1);
Properties property55 = new Properties(false, 0,1);
Properties property56 = new Properties(false , 1 , 1);
Properties property57 = new Properties(false , 2 , 1);
Properties property58 = new Properties(false , 3 , 1);
Properties property59 = new Properties(false , 4 , 1);
Properties property60 = new Properties(false , 5 , 1);
Properties property61 = new Properties(false , 3 , 1);
Properties property62 = new Properties(false , 2 , 1);
Properties property63 = new Properties(false , 1 , 1);
ArrayList<Properties> al = new ArrayList<>();

//here are the properties

private double[] getX=new double[64];
private double[] getY=new double[64];
Shape [] shape = new Shape[64];
	public Main_Frame(){
		Properties.setWhoseTurn(true);
		al.add(property0);
		al.add(property1);
		al.add(property2);
		al.add(property3);
		al.add(property4);
		al.add(property5);
		al.add(property6);
		al.add(property7);
		al.add(property8);
		al.add(property9);
		al.add(property10);
		al.add(property11);
		al.add(property12);
		al.add(property13);
		al.add(property14);
		al.add(property15);
		al.add(property16);
		al.add(property17);
		al.add(property18);
		al.add(property19);
		al.add(property20);
		al.add(property21);
		al.add(property22);
		al.add(property23);
		al.add(property24);
		al.add(property25);
		al.add(property26);
		al.add(property27);
		al.add(property28);
		al.add(property29);
		al.add(property30);
		al.add(property31);
		al.add(property32);
		al.add(property33);
		al.add(property34);
		al.add(property35);
		al.add(property36);
		al.add(property37);
		al.add(property38);
		al.add(property39);
		al.add(property40);
		al.add(property41);
		al.add(property42);
		al.add(property43);
		al.add(property44);
		al.add(property45);
		al.add(property46);
		al.add(property47);
		al.add(property48);
		al.add(property49);
		al.add(property50);
		al.add(property51);
		al.add(property52);
		al.add(property53);
		al.add(property54);
		al.add(property55);
		al.add(property56);
		al.add(property57);
		al.add(property58);
		al.add(property59);
		al.add(property60);
		al.add(property61);
		al.add(property62);
		al.add(property63);
		
		
		
		try{
			image = ImageIO.read(new File("Images\\White_Pawn.png"));
			image2 = ImageIO.read(new File("Images\\Dark_Pawn.png"));
			image3 = ImageIO.read(new File("Images\\White_Knight.png"));
			image4 = ImageIO.read(new File("Images\\Dark_Knight.png"));
			image5 = ImageIO.read(new File("Images\\White_Bishop.png"));
			image6 = ImageIO.read(new File("Images\\Bishop_Dark.jpg"));
			image7= ImageIO.read(new File("Images\\white_King.png"));
			image8 = ImageIO.read(new File("Images\\Dark_King.png"));
			image9 = ImageIO.read(new File("Images\\White_Queen.png"));
			image10 = ImageIO.read(new File("Images\\Dark_Queen.png"));
			image11 = ImageIO.read(new File("Images\\White_Rook.png"));
			image12 = ImageIO.read(new File("Images\\Dark_Rook.png"));
		}catch(IOException e){}
		f.setSize(1366, 768);
		 f.addMouseListener(this);
		c=new JComponent(){
			public void paint(Graphics g){
				super.paintComponent(g);
				
				//Για να μπουν οι εικόνες από πάνω
				Composite c = AlphaComposite.getInstance(AlphaComposite.SRC_OVER);
				RenderingHints hints=new RenderingHints(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
				Graphics2D g2=(Graphics2D)g;
				
				g2.setRenderingHints(hints);
				
				//g2.setComposite(c);
				//AffineTransform at = AffineTransform.getRotateInstance(Math.PI,683,384);
				//g2.transform(at);
				//g2.drawImage(image ,0,0,this);
				//Τώρα βάζω τα κουτάκια
				
			
				for (int i=0; i<8;i++){
					shape[i]=new Rectangle2D.Double(349+i*83.5,50,83.5,83.5);
					getX[i]=349+i*83.5;
					getY[i]=50;
					g2.draw(shape[i]);
					if (i%2 !=0){
						g2.fill(shape[i]);
					}
				}
				
				
				/*g2.drawImage(image12, (int)(349+16.75), (int)(50+16.75), this);
				g2.drawImage(image12, (int)(349+16.75+83.5*7), (int)(50+16.75), this);
				g2.drawImage(image4, (int)(349+16.75+83.5), (int)(50+16.75), this);
				g2.drawImage(image4, (int)(349+16.75+83.5*6), (int)(50+16.75), this);
				g2.drawImage(image6, (int)(349+16.75+83.5*2), (int)(50+16.75), this);
				g2.drawImage(image6, (int)(349+16.75+83.5*5), (int)(50+16.75), this);
				g2.drawImage(image8, (int)(349+16.75+83.5*4), (int)(50+16.75), this);
				g2.drawImage(image10, (int)(349+16.75+83.5*3), (int)(50+16.75), this);*/
			
				for (int i=8; i<16;i++){
					shape[i]=new Rectangle2D.Double(349+(i-8)*83.5,50+83.5,83.5,83.5);
					g2.draw(shape[i]);
					getX[i]=349+(i-8)*83.5;
					getY[i]=50+83.5;
					
					if (i%2 ==0){
						g2.fill(shape[i]);
					}
					
					
				}
				for (int i=16; i<24;i++){
					shape[i]=new Rectangle2D.Double(349+(i-16)*83.5,50+83.5*2,83.5,83.5);
					getX[i]=349+(i-16)*83.5;
					getY[i]=50+83.5*2;
					g2.draw(shape[i]);
					if (i%2 !=0){
						g2.fill(shape[i]);
					}
				}
				for (int i=24; i<32;i++){
					shape[i]=new Rectangle2D.Double(349+(i-24)*83.5,50+83.5*3,83.5,83.5);
					getX[i]=349+(i-24)*83.5;
					getY[i]=50+83.5*3;
					g2.draw(shape[i]);
					if (i%2 ==0){
						g2.fill(shape[i]);
					}
				}
				for (int i=32; i<40;i++){
					shape[i]=new Rectangle2D.Double(349+(i-32)*83.5,50+83.5*4,83.5,83.5);
					getX[i]=349+(i-32)*83.5;
					getY[i]=50+83.5*4;
					g2.draw(shape[i]);
					if (i%2 !=0){
						g2.fill(shape[i]);
					}
				}
				for (int i=40; i<48;i++){
					shape[i]=new Rectangle2D.Double(349+(i-40)*83.5,50+83.5*5,83.5,83.5);
					getX[i]=349+(i-40)*83.5;
					getY[i]=50+83.5*5;
					g2.draw(shape[i]);
					if (i%2 ==0){
						g2.fill(shape[i]);
					}
				}
				for (int i=48; i<56;i++){
					shape[i]=new Rectangle2D.Double(349+(i-48)*83.5,50+83.5*6,83.5,83.5);
					getX[i]=349+(i-48)*83.5;
					getY[i]=50+83.5*6;
					g2.draw(shape[i]);
					
					if (i%2 !=0){
						g2.fill(shape[i]);
					}
					
				}
				for (int i=56; i<64;i++){
					shape[i]=new Rectangle2D.Double(349+(i-56)*83.5,50+83.5*7,83.5,83.5);
					getX[i]=349+(i-56)*83.5;
					getY[i]=50+83.5*7;
					g2.draw(shape[i]);
					if (i%2 ==0){
						g2.fill(shape[i]);
					}
				}
				
				/*g2.drawImage(image11,(int)(349+16.75),(int)(50+83.5*7+16.75), this);
				g2.drawImage(image11,(int)(349+16.75+7*83.5),(int)(50+83.5*7+16.75), this);
				g2.drawImage(image3,(int)(349+16.75+83.5),(int)(50+83.5*7+16.75), this);
				g2.drawImage(image3,(int)(349+16.75+83.5*6),(int)(50+83.5*7+16.75), this);
				g2.drawImage(image5,(int)(349+16.75+83.5*2),(int)(50+83.5*7+16.75), this);
				g2.drawImage(image5,(int)(349+16.75+83.5*5),(int)(50+83.5*7+16.75), this);
				g2.drawImage(image9,(int)(349+16.75+83.5*3),(int)(50+83.5*7+16.75), this);
				g2.drawImage(image7,(int)(349+16.75+83.5*4),(int)(50+83.5*7+16.75), this);*/
				
				for (int k=0; k<64; k++){
					if (((Properties) al.get(k)).getWhichPawn()==0 &&((Properties) al.get(k)).getAvailability()==1){
						g2.drawImage(image, (int)(getX[k]+16.75), (int)(getY[k]+16.75), this);
					}
						else if (((Properties) al.get(k)).getWhichPawn()==1 &&((Properties) al.get(k)).getAvailability()==1){
							g2.drawImage(image11, (int)(getX[k]+16.75), (int)(getY[k]+16.75), this);}
							else if (((Properties) al.get(k)).getWhichPawn()==2 &&((Properties) al.get(k)).getAvailability()==1){
								g2.drawImage(image3, (int)(getX[k]+16.75), (int)(getY[k]+16.75), this);}						
							else if (((Properties) al.get(k)).getWhichPawn()==3 &&((Properties) al.get(k)).getAvailability()==1){
								g2.drawImage(image5, (int)(getX[k]+16.75), (int)(getY[k]+16.75), this);}	
							else if (((Properties) al.get(k)).getWhichPawn()==4 &&((Properties) al.get(k)).getAvailability()==1){
								g2.drawImage(image9, (int)(getX[k]+16.75), (int)(getY[k]+16.75), this);}
							else if (((Properties) al.get(k)).getWhichPawn()==1 &&((Properties) al.get(k)).getAvailability()==1){
								g2.drawImage(image7, (int)(getX[k]+16.75), (int)(getY[k]+16.75), this);}		
							else if (((Properties) al.get(k)).getWhichPawn()==0 &&((Properties) al.get(k)).getAvailability()==2){
								g2.drawImage(image2, (int)(getX[k]+16.75), (int)(getY[k]+16.75), this);}		
							else if (((Properties) al.get(k)).getWhichPawn()==1 &&((Properties) al.get(k)).getAvailability()==2){
								g2.drawImage(image12, (int)(getX[k]+16.75), (int)(getY[k]+16.75), this);}	
							else if (((Properties) al.get(k)).getWhichPawn()==2 &&((Properties) al.get(k)).getAvailability()==2){
								g2.drawImage(image4, (int)(getX[k]+16.75), (int)(getY[k]+16.75), this);}
							else if (((Properties) al.get(k)).getWhichPawn()==3 &&((Properties) al.get(k)).getAvailability()==2){
								g2.drawImage(image6, (int)(getX[k]+16.75), (int)(getY[k]+16.75), this);}		
							else if (((Properties) al.get(k)).getWhichPawn()==4 &&((Properties) al.get(k)).getAvailability()==2){
								g2.drawImage(image10, (int)(getX[k]+16.75), (int)(getY[k]+16.75), this);}	
							else if (((Properties) al.get(k)).getWhichPawn()==5 &&((Properties) al.get(k)).getAvailability()==2){
								g2.drawImage(image8, (int)(getX[k]+16.75), (int)(getY[k]+16.75), this);}	
							else if (((Properties) al.get(k)).getWhichPawn()==5 &&((Properties) al.get(k)).getAvailability()==1){
								g2.drawImage(image7, (int)(getX[k]+16.75), (int)(getY[k]+16.75), this);}
				/*	if(optionPressed==false){
						al.get(k).setOption(false);
							}*/
					if(al.get(k).getOption()==true){
						g2.setColor(new Color(126,242,87,140));
						
						g2.fillOval((int)(getX[k] +31.75), (int)(getY[k]+31.75), 20, 20);
					}
					
					}
			}
		};
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(c);
		f.setResizable(false);
		f.setVisible(true);
	}

	public double getCoordsX(int i){
		return getX[i];
	}
	public double getCoordsY(int i){
		return getY[i];
	}
	public void optionSquare(double x , double y){
		
		Graphics g = c.getGraphics();
		
	}
	
	
	
	
	
	public void mouseEntered(MouseEvent e) {}  
    public void mouseExited(MouseEvent e) {}  
    public void mousePressed(MouseEvent e) {}  
    public void mouseReleased(MouseEvent e) {} 
    /* (non-Javadoc)
     * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
     */
    public void mouseClicked(MouseEvent e) throws ArrayIndexOutOfBoundsException{
    	Graphics g = c.getGraphics();
    	
    	for(int i=0; i<64; i++){
    		if (shape[i].contains(e.getPoint())){
    			System.out.println(al.get(i).getOption()+" "+i);
    			//white pawn
    		if(al.get(i).getWhichPawn()==0&&al.get(i).getAvailability()==1&&Properties.getWhoseTurn()==true&&al.get(i).getOption()==false){
    			for(int k =0; k<64; k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    				c.repaint();
    			}
    			location=i;
    			if(al.get(i-8).getAvailability()==0){
    			
    				al.get(i-8).setOption(true);
    				Properties.setSelected(1);
    				
    				c.repaint();
    			}
    			if((i==48||i==49||i==50||i==51||i==52||i==53||i==54||i==55||i==56)&&al.get(i-16).getAvailability()==0){
    				if(al.get(i-8).getAvailability()==0){
					al.get(i-16).setOption(true);
					Properties.setSelected(1);
					
					c.repaint();
    				}
				}
    			if(i!=0&&i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56&&al.get(i-9).getAvailability()==2){
    				al.get(i-9).setOption(true);
    				Properties.setSelected(1);
    				
    				c.repaint();
    			}
    			if(i!=7&&i!=15&&i!=23&&i!=31&&i!=39&&i!=47&&i!=55&&i!=63&&al.get(i-7).getAvailability()==2){
    				al.get(i-7).setOption(true);
    				Properties.setSelected(1);
    				
    				c.repaint();
    			}
    			//end of white pawn , now we go to the dark pawn
    			
    		}
    		if(al.get(i).getWhichPawn()==0&&al.get(i).getAvailability()==2&&Properties.getWhoseTurn()==false&&al.get(i).getOption()==false){
    			for(int k =0; k<64; k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    				c.repaint();
    			}
    			location=i;
    			if((i==8||i==9||i==10||i==11||i==12||i==13||i==14||i==15)&&al.get(i+16).getAvailability()==0){
    				if(al.get(i+8).getAvailability()==0){
    				al.get(i+16).setOption(true);
					Properties.setSelected(2);
					
					c.repaint();
    				}
    			}
    			if(al.get(i+8).getAvailability()==0){
    				al.get(i+8).setOption(true);
    				Properties.setSelected(2);
    				
    				c.repaint();
    			}
    			if(i!=0&&i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56&&al.get(i+7).getAvailability()==1){
    				al.get(i+7).setOption(true);
    				Properties.setSelected(2);
    				
    				c.repaint();
    				
    			}
    			if(i!=7&&i!=15&&i!=23&&i!=31&&i!=39&&i!=47&&i!=55&&i!=63&&al.get(i+9).getAvailability()==1){
    				al.get(i+9).setOption(true);
    				Properties.setSelected(2);
    				
    				c.repaint();
    			}	
    			
    			
    			
    		}
    	//OPTIONS
    		//white pawn
    		if(al.get(i).getOption()==true&&Properties.getSelected()==1){
    			for(int k=0;k<64;k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    			}
    			al.get(i).setWhichPawn(0);
    			al.get(i).setAvailability(1);
    			SecondFrame.setType(0);
    			SecondFrame.setPressed(false);
    			if(i==0||i==1||i==2||i==3||i==4||i==5||i==6||i==7){
    				
    				//here goes the instantiation of the object second Frame
    			
    			SecondFrame f = new SecondFrame();
    				if(SecondFrame.getType()==1){
    					al.get(i).setWhichPawn(4);
    	    			al.get(i).setAvailability(1);
    				}else if(SecondFrame.getType()==2){
    					al.get(i).setWhichPawn(3);
    	    			al.get(i).setAvailability(1);
    				}else if(SecondFrame.getType()==3){
    					al.get(i).setWhichPawn(2);
    	    			al.get(i).setAvailability(1);
    				}else if(SecondFrame.getType()==4){
    					al.get(i).setWhichPawn(1);
    	    			al.get(i).setAvailability(1);
    				
    				}
    				
    			
    			}
    			
    			System.out.println(SecondFrame.getType());
    			al.get(location).setAvailability(0);
    			al.get(location).setWhichPawn(6);
    			Properties.setWhoseTurn(false);
    			c.repaint();
    			
    		}//dark pawn
    		if(al.get(i).getOption()==true&&Properties.getSelected()==2){
    			for(int k=0;k<64;k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    			}
    			al.get(i).setWhichPawn(0);
    			al.get(i).setAvailability(2);
    			al.get(location).setAvailability(0);
    			al.get(location).setWhichPawn(6);
    			c.repaint();
    			Properties.setWhoseTurn(true);
    		}
    		if(al.get(i).getOption()==true&&Properties.getSelected()==5){
    			for(int k=0;k<64;k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    			}
    			al.get(i).setWhichPawn(3);
    			al.get(i).setAvailability(1);
    			al.get(location).setAvailability(0);
    			al.get(location).setWhichPawn(6);
    			c.repaint();
    			Properties.setWhoseTurn(false);
    		}//OPTIONS white rook
    		if(al.get(i).getOption()==true&&Properties.getSelected()==11){
    			for(int k=0;k<64;k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    			}
    			al.get(i).setWhichPawn(1);
    			al.get(i).setAvailability(1);
    			al.get(location).setAvailability(0);
    			al.get(location).setWhichPawn(6);
    			c.repaint();
    			Properties.setWhoseTurn(false);
    		}
    		//OPTIONS white knight
    		if(al.get(i).getOption()==true&&Properties.getSelected()==3){
    			for(int k=0;k<64;k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    			}
    			al.get(i).setWhichPawn(2);
    			al.get(i).setAvailability(1);
    			al.get(location).setAvailability(0);
    			al.get(location).setWhichPawn(6);
    			c.repaint();
    			Properties.setWhoseTurn(false);
    		}
    		
    		//OPTIONS White Queen
    		if(al.get(i).getOption()==true&&Properties.getSelected()==7){
    			for(int k=0;k<64;k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    			}
    			al.get(i).setWhichPawn(4);
    			al.get(i).setAvailability(1);
    			al.get(location).setAvailability(0);
    			al.get(location).setWhichPawn(6);
    			c.repaint();
    			Properties.setWhoseTurn(false);
    		}
    		//OPTIONS White King
    		if(al.get(i).getOption()==true&&Properties.getSelected()==9){
    			for(int k=0;k<64;k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    			}
    			al.get(i).setWhichPawn(5);
    			al.get(i).setAvailability(1);
    			al.get(location).setAvailability(0);
    			al.get(location).setWhichPawn(6);
    			c.repaint();
    			Properties.setWhoseTurn(false);
    		}
    		//Dark king
    		if(al.get(i).getOption()==true&&Properties.getSelected()==10){
    			for(int k=0;k<64;k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    			}
    			al.get(i).setWhichPawn(5);
    			al.get(i).setAvailability(2);
    			al.get(Properties.getdLocation()).setAvailability(0);
    			al.get(Properties.getdLocation()).setWhichPawn(6);
    			c.repaint();
    			Properties.setWhoseTurn(true);
    		}
    		//Dark Knight
    		if(al.get(i).getOption()==true&&Properties.getSelected()==4){
    			for(int k=0;k<64;k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    			}
    			al.get(i).setWhichPawn(2);
    			al.get(i).setAvailability(2);
    			al.get(Properties.getdLocation()).setAvailability(0);
    			al.get(Properties.getdLocation()).setWhichPawn(6);
    			c.repaint();
    			Properties.setWhoseTurn(true);
    		}
    		//dark bishops
    		if(al.get(i).getOption()==true&&Properties.getSelected()==6){
    			for(int k=0;k<64;k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    			}
    			al.get(i).setWhichPawn(3);
    			al.get(i).setAvailability(2);
    			al.get(Properties.getdLocation()).setAvailability(0);
    			al.get(Properties.getdLocation()).setWhichPawn(6);
    			c.repaint();
    			Properties.setWhoseTurn(true);
    		}
    		//dark queen
    		if(al.get(i).getOption()==true&&Properties.getSelected()==8){
    			for(int k=0;k<64;k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    			}
    			al.get(i).setWhichPawn(4);
    			al.get(i).setAvailability(2);
    			al.get(Properties.getdLocation()).setAvailability(0);
    			al.get(Properties.getdLocation()).setWhichPawn(6);
    			c.repaint();
    			Properties.setWhoseTurn(true);
    		}
    		//dark rook
    		if(al.get(i).getOption()==true&&Properties.getSelected()==12){
    			for(int k=0;k<64;k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    			}
    			al.get(i).setWhichPawn(1);
    			al.get(i).setAvailability(2);
    			al.get(Properties.getdLocation()).setAvailability(0);
    			al.get(Properties.getdLocation()).setWhichPawn(6);
    			c.repaint();
    			Properties.setWhoseTurn(true);
    		}
    		//time to make white bishops
    		if(al.get(i).getWhichPawn()==3&&al.get(i).getAvailability()==1&&Properties.getWhoseTurn()==true&&al.get(i).getOption()==false){
    			for(int k=0; k<64; k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    				c.repaint();
    			}
    			location=i;
    			Properties.setSelected(5);
    				if(i!=0&&i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7){
    					if(al.get(i-9).getAvailability()==0){
    					al.get(i-9).setOption(true);
    					
    					c.repaint();
    					if((i-9)!=0&&(i-9)!=8&&(i-9)!=16&&(i-9)!=24&&(i-9)!=32&&(i-9)!=40&&(i-9)!=48&&(i-9)!=56&&(i-9)!=1&&(i-9)!=2&&(i-9)!=3&&(i-9)!=4&&(i-9)!=5&&(i-9)!=6&&(i-9)!=7){
        					if(al.get(i-18).getAvailability()==0){
    						al.get(i-18).setOption(true);
        					
        					c.repaint();
        					if((i-18)!=0&&(i-18)!=8&&(i-18)!=16&&(i-18)!=24&&(i-18)!=32&&(i-18)!=40&&(i-18)!=48&&(i-18)!=56&&(i-18)!=1&&(i-18)!=2&&(i-18)!=3&&(i-18)!=4&&(i-18)!=5&&(i-18)!=6&&(i-18)!=7){
            					if(al.get(i-27).getAvailability()==0){
        						al.get(i-27).setOption(true);
            					
            					c.repaint();
            					if((i-27)!=0&&(i-27)!=8&&(i-27)!=16&&(i-27)!=24&&(i-27)!=32&&(i-27)!=40&&(i-27)!=48&&(i-27)!=56&&(i-27)!=1&&(i-27)!=2&&(i-27)!=3&&(i-27)!=4&&(i-27)!=5&&(i-27)!=6&&(i-27)!=7){
                					if(al.get(i-36).getAvailability()==0){
            						al.get(i-36).setOption(true);
                				
                					c.repaint();
                					if((i-36)!=0&&(i-36)!=8&&(i-36)!=16&&(i-36)!=24&&(i-36)!=32&&(i-36)!=40&&(i-36)!=48&&(i-36)!=56&&(i-36)!=1&&(i-36)!=2&&(i-36)!=3&&(i-36)!=4&&(i-36)!=5&&(i-36)!=6&&(i-36)!=7){
                    					if(al.get(i-45).getAvailability()==0){
                						al.get(i-45).setOption(true);
                    					
                    					c.repaint();
                    					if((i-45)!=0&&(i-45)!=8&&(i-45)!=16&&(i-45)!=24&&(i-45)!=32&&(i-45)!=40&&(i-45)!=48&&(i-45)!=56&&(i-45)!=1&&(i-45)!=2&&(i-45)!=3&&(i-45)!=4&&(i-45)!=5&&(i-45)!=6&&(i-45)!=7){
                        					if(al.get(i-54).getAvailability()==0){
                    						al.get(i-54).setOption(true);
                        					
                        					c.repaint();
                        					if((i-54)!=0&&(i-54)!=8&&(i-54)!=16&&(i-54)!=24&&(i-54)!=32&&(i-54)!=40&&(i-54)!=48&&(i-54)!=56&&(i-54)!=1&&(i-54)!=2&&(i-54)!=3&&(i-54)!=4&&(i-54)!=5&&(i-54)!=6&&(i-54)!=7){
                            					if(al.get(i-63).getAvailability()==0){
                        						al.get(i-63).setOption(true);
                            					
                            					c.repaint();
                            					
                            					}else if((i-54)!=0&&(i-54)!=8&&(i-54)!=16&&(i-54)!=24&&(i-54)!=32&&(i-54)!=40&&(i-54)!=48&&(i-54)!=56&&(i-54)!=1&&(i-54)!=2&&(i-54)!=3&&(i-54)!=4&&(i-54)!=5&&(i-54)!=6&&(i-54)!=7){
                        						if(al.get(i-63).getAvailability()==2){
                        						al.get(i-63).setOption(true);
                        						
                        						c.repaint();}
                            				}
                        					}
                        					}else if((i-45)!=0&&(i-45)!=8&&(i-45)!=16&&(i-45)!=24&&(i-45)!=32&&(i-45)!=40&&(i-45)!=48&&(i-45)!=56&&(i-45)!=1&&(i-45)!=2&&(i-45)!=3&&(i-45)!=4&&(i-45)!=5&&(i-45)!=6&&(i-45)!=7){
                        						if(al.get(i-54).getAvailability()==2){
                        						al.get(i-54).setOption(true);
                        						
                        						c.repaint();}
                            				}
                    					}
                    					}else if((i-36)!=0&&(i-36)!=8&&(i-36)!=16&&(i-36)!=24&&(i-36)!=32&&(i-36)!=40&&(i-36)!=48&&(i-36)!=56&&(i-36)!=1&&(i-36)!=2&&(i-36)!=3&&(i-36)!=4&&(i-36)!=5&&(i-36)!=6&&(i-36)!=7){
                    						if(al.get(i-45).getAvailability()==2){
                    						al.get(i-45).setOption(true);
                    						
                    						c.repaint();}
                        				}
                					}
                					}else if((i-27)!=0&&(i-27)!=8&&(i-27)!=16&&(i-27)!=24&&(i-27)!=32&&(i-27)!=40&&(i-27)!=48&&(i-27)!=56&&(i-27)!=1&&(i-27)!=2&&(i-27)!=3&&(i-27)!=4&&(i-27)!=5&&(i-27)!=6&&(i-27)!=7){
            						if(al.get(i-36).getAvailability()==2){
            						al.get(i-36).setOption(true);
            						
            						c.repaint();}
                				}
            					}
            					}else if((i-18)!=0&&(i-18)!=8&&(i-18)!=16&&(i-18)!=24&&(i-18)!=32&&(i-18)!=40&&(i-18)!=48&&(i-18)!=56&&(i-18)!=1&&(i-18)!=2&&(i-18)!=3&&(i-18)!=4&&(i-18)!=5&&(i-18)!=6&&(i-18)!=7){
        						if(al.get(i-27).getAvailability()==2){
        						al.get(i-27).setOption(true);
        						
        						c.repaint();}
            				}
        					}
        				
    				}else if((i-9)!=0&&(i-9)!=8&&(i-9)!=16&&(i-9)!=24&&(i-9)!=32&&(i-9)!=40&&(i-9)!=48&&(i-9)!=56&&(i-9)!=1&&(i-9)!=2&&(i-9)!=3&&(i-9)!=4&&(i-9)!=5&&(i-9)!=6&&(i-9)!=7){
						if(al.get(i-18).getAvailability()==2){
    					al.get(i-18).setOption(true);
						
						c.repaint();}
    					}
    				}
    					
    					}else if(i!=0&&i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7){
						if(al.get(i-9).getAvailability()==2){
    					al.get(i-9).setOption(true);
						
						c.repaint();}
    						
    				}
    				
    			}
    				if((i)!=0&&(i)!=15&&(i)!=23&&(i)!=31&&(i)!=39&&(i)!=47&&(i)!=55&&(i)!=63&&(i)!=1&&(i)!=2&&(i)!=3&&(i)!=4&&(i)!=5&&(i)!=6&&(i)!=7){
    					if(al.get(i-7).getAvailability()==0){
    					al.get(i-7).setOption(true);
    					
    					c.repaint();
    					if((i-7)!=0&&(i-7)!=15&&(i-7)!=23&&(i-7)!=31&&(i-7)!=39&&(i-7)!=47&&(i-7)!=55&&(i-7)!=63&&(i-7)!=1&&(i-7)!=2&&(i-7)!=3&&(i-7)!=4&&(i-7)!=5&&(i-7)!=6&&(i-7)!=7){
        				if(al.get(i-14).getAvailability()==0){
    						al.get(i-14).setOption(true);
        					
        					c.repaint();
        					if((i-14)!=0&&(i-14)!=15&&(i-14)!=23&&(i-14)!=31&&(i-14)!=39&&(i-14)!=47&&(i-14)!=55&&(i-14)!=63&&(i-14)!=1&&(i-14)!=2&&(i-14)!=3&&(i-14)!=4&&(i-14)!=5&&(i-14)!=6&&(i-14)!=7){
            					if(al.get(i-21).getAvailability()==0){
        						al.get(i-21).setOption(true);
            					
            					c.repaint();
            					if((i-21)!=0&&(i-21)!=15&&(i-21)!=23&&(i-21)!=31&&(i-21)!=39&&(i-21)!=47&&(i-21)!=55&&(i-21)!=63&&(i-21)!=1&&(i-21)!=2&&(i-21)!=3&&(i-21)!=4&&(i-21)!=5&&(i-21)!=6&&(i-21)!=7){
                					if(al.get(i-28).getAvailability()==0){
            						al.get(i-28).setOption(true);
                					
                					c.repaint();
                					if((i-28)!=0&&(i-28)!=15&&(i-28)!=23&&(i-28)!=31&&(i-28)!=39&&(i-28)!=47&&(i-28)!=55&&(i-28)!=63&&(i-28)!=1&&(i-28)!=2&&(i-28)!=3&&(i-28)!=4&&(i-28)!=5&&(i-28)!=6&&(i-28)!=7){
                    					if(al.get(i-35).getAvailability()==0){
                						al.get(i-35).setOption(true);
                    					
                    					c.repaint();
                    					if((i-35)!=0&&(i-35)!=15&&(i-35)!=23&&(i-35)!=31&&(i-35)!=39&&(i-35)!=47&&(i-35)!=55&&(i-35)!=63&&(i-35)!=1&&(i-35)!=2&&(i-35)!=3&&(i-35)!=4&&(i-35)!=5&&(i-35)!=6&&(i-35)!=7){
                        					if(al.get(i-42).getAvailability()==0){
                    						al.get(i-42).setOption(true);
                        					
                        					c.repaint();
                        					if((i-42)!=0&&(i-42)!=15&&(i-42)!=23&&(i-42)!=31&&(i-42)!=39&&(i-42)!=47&&(i-42)!=55&&(i-42)!=63&&(i-42)!=1&&(i-42)!=2&&(i-42)!=3&&(i-42)!=4&&(i-42)!=5&&(i-42)!=6&&(i-42)!=7){
                            					if(al.get(i-49).getAvailability()==0){
                        						al.get(i-49).setOption(true);
                            					
                            					c.repaint();
                            					}else if((i-42)!=0&&(i-42)!=15&&(i-42)!=23&&(i-42)!=31&&(i-42)!=39&&(i-42)!=47&&(i-42)!=55&&(i-42)!=63&&(i-42)!=1&&(i-42)!=2&&(i-42)!=3&&(i-42)!=4&&(i-42)!=5&&(i-42)!=6&&(i-42)!=7){
                            					if(al.get(i-49).getAvailability()==2){
                            					al.get(i-49).setOption(true);
                            					
                            					c.repaint();}}}    //edw isws problhma
                        					}else if((i-35)!=0&&(i-35)!=15&&(i-35)!=23&&(i-35)!=31&&(i-35)!=39&&(i-35)!=47&&(i-35)!=55&&(i-35)!=63&&(i-35)!=1&&(i-35)!=2&&(i-35)!=3&&(i-35)!=4&&(i-35)!=5&&(i-35)!=6&&(i-35)!=7){
                            					if(al.get(i-42).getAvailability()==2){
                        						al.get(i-42).setOption(true);
                            					
                            					c.repaint();}}}
                    					}else if((i-28)!=0&&(i-28)!=15&&(i-28)!=23&&(i-28)!=31&&(i-28)!=39&&(i-28)!=47&&(i-28)!=55&&(i-28)!=63&&(i-28)!=1&&(i-28)!=2&&(i-28)!=3&&(i-28)!=4&&(i-28)!=5&&(i-28)!=6&&(i-28)!=7){
                        					if(al.get(i-35).getAvailability()==2){
                    						al.get(i-35).setOption(true);
                        					
                        					c.repaint();}}}
                					}else if((i-21)!=0&&(i-21)!=15&&(i-21)!=23&&(i-21)!=31&&(i-21)!=39&&(i-21)!=47&&(i-21)!=55&&(i-21)!=63&&(i-21)!=1&&(i-21)!=2&&(i-21)!=3&&(i-21)!=4&&(i-21)!=5&&(i-21)!=6&&(i-21)!=7){
                    					if(al.get(i-28).getAvailability()==2){
                						al.get(i-28).setOption(true);
                    					
                    					c.repaint();}}}
            					}else if((i-14)!=0&&(i-14)!=15&&(i-14)!=23&&(i-14)!=31&&(i-14)!=39&&(i-14)!=47&&(i-14)!=55&&(i-14)!=63&&(i-14)!=1&&(i-14)!=2&&(i-14)!=3&&(i-14)!=4&&(i-14)!=5&&(i-14)!=6&&(i-14)!=7){
                					if(al.get(i-21).getAvailability()==2){
            						al.get(i-21).setOption(true);
                					
                					c.repaint();}}}
        				}else if((i-7)!=0&&(i-7)!=15&&(i-7)!=23&&(i-7)!=31&&(i-7)!=39&&(i-7)!=47&&(i-7)!=55&&(i-7)!=63&&(i-7)!=1&&(i-7)!=2&&(i-7)!=3&&(i-7)!=4&&(i-7)!=5&&(i-7)!=6&&(i-7)!=7){
            					if(al.get(i-14).getAvailability()==2){
        						al.get(i-14).setOption(true);
            					
            					c.repaint();}}}
    					}else if((i)!=0&&(i)!=15&&(i)!=23&&(i)!=31&&(i)!=39&&(i)!=47&&(i)!=55&&(i)!=63&&(i)!=1&&(i)!=2&&(i)!=3&&(i)!=4&&(i)!=5&&(i)!=6&&(i)!=7){
        					if(al.get(i-7).getAvailability()==2){
    						al.get(i-7).setOption(true);
        					
        					c.repaint();}}}
    				if((i)!=0&&(i)!=8&&(i)!=16&&(i)!=24&&(i)!=32&&(i)!=40&&(i)!=48&&(i)!=56&&(i)!=57&&(i)!=58&&(i)!=59&&(i)!=60&&(i)!=61&&(i)!=62&&(i)!=63){
    					if(al.get(i+7).getAvailability()==0){
    					al.get(i+7).setOption(true);
    					
    					c.repaint();
    					if((i+7)!=0&&(i+7)!=8&&(i+7)!=16&&(i+7)!=24&&(i+7)!=32&&(i+7)!=40&&(i+7)!=48&&(i+7)!=56&&(i+7)!=57&&(i+7)!=58&&(i+7)!=59&&(i+7)!=60&&(i+7)!=61&&(i+7)!=62&&(i+7)!=63){
        					if(al.get(i+14).getAvailability()==0){
    						al.get(i+14).setOption(true);
        					
        					c.repaint();
        					if((i+14)!=0&&(i+14)!=8&&(i+14)!=16&&(i+14)!=24&&(i+14)!=32&&(i+14)!=40&&(i+14)!=48&&(i+14)!=56&&(i+14)!=57&&(i+14)!=58&&(i+14)!=59&&(i+14)!=60&&(i+14)!=61&&(i+14)!=62&&(i+14)!=63){
            					if(al.get(i+21).getAvailability()==0){
        						al.get(i+21).setOption(true);
            					
            					c.repaint();
            					if((i+21)!=0&&(i+21)!=8&&(i+21)!=16&&(i+21)!=24&&(i+21)!=32&&(i+21)!=40&&(i+21)!=48&&(i+21)!=56&&(i+21)!=57&&(i+21)!=58&&(i+21)!=59&&(i+21)!=60&&(i+21)!=61&&(i+21)!=62&&(i+21)!=63){
                					if(al.get(i+28).getAvailability()==0){
            						al.get(i+28).setOption(true);
                					
                					c.repaint();
                					if((i+28)!=0&&(i+28)!=8&&(i+28)!=16&&(i+28)!=24&&(i+28)!=32&&(i+28)!=40&&(i+28)!=48&&(i+28)!=56&&(i+28)!=57&&(i+28)!=58&&(i+28)!=59&&(i+28)!=60&&(i+28)!=61&&(i+28)!=62&&(i+28)!=63){
                    					if(al.get(i+35).getAvailability()==0){
                						al.get(i+35).setOption(true);
                    					
                    					c.repaint();
                    					if((i+35)!=0&&(i+35)!=8&&(i+35)!=16&&(i+35)!=24&&(i+35)!=32&&(i+35)!=40&&(i+35)!=48&&(i+35)!=56&&(i+35)!=57&&(i+35)!=58&&(i+35)!=59&&(i+35)!=60&&(i+35)!=61&&(i+35)!=62&&(i+35)!=63){
                        					if(al.get(i+42).getAvailability()==0){
                    						al.get(i+42).setOption(true);
                        					
                        					c.repaint();
                        					if((i+42)!=0&&(i+42)!=8&&(i+42)!=16&&(i+42)!=24&&(i+42)!=32&&(i+42)!=40&&(i+42)!=48&&(i+42)!=56&&(i+42)!=57&&(i+42)!=58&&(i+42)!=59&&(i+42)!=60&&(i+42)!=61&&(i+42)!=62&&(i+42)!=63){
                            					if(al.get(i+49).getAvailability()==0){
                        						al.get(i+49).setOption(true);
                            					
                            					c.repaint();
                        						}else if((i+42)!=0&&(i+42)!=8&&(i+42)!=16&&(i+42)!=24&&(i+42)!=32&&(i+42)!=40&&(i+42)!=48&&(i+42)!=56&&(i+42)!=57&&(i+42)!=58&&(i+42)!=59&&(i+42)!=60&&(i+42)!=61&&(i+42)!=62&&(i+42)!=63){
                                					if(al.get(i+49).getAvailability()==2){
                        							al.get(i+49).setOption(true);
                                					
                                					c.repaint();}}}
                        					}else if((i+35)!=0&&(i+35)!=8&&(i+35)!=16&&(i+35)!=24&&(i+35)!=32&&(i+35)!=40&&(i+35)!=48&&(i+35)!=56&&(i+35)!=57&&(i+35)!=58&&(i+35)!=59&&(i+35)!=60&&(i+35)!=61&&(i+35)!=62&&(i+35)!=63){
                            					if(al.get(i+42).getAvailability()==2){
                        						al.get(i+42).setOption(true);
                            					
                            					c.repaint();}}}
                    					}else if((i+28)!=0&&(i+28)!=8&&(i+28)!=16&&(i+28)!=24&&(i+28)!=32&&(i+28)!=40&&(i+28)!=48&&(i+28)!=56&&(i+28)!=57&&(i+28)!=58&&(i+28)!=59&&(i+28)!=60&&(i+28)!=61&&(i+28)!=62&&(i+28)!=63){
                        					if(al.get(i+35).getAvailability()==2){
                    						al.get(i+35).setOption(true);
                        					
                        					c.repaint();}}}
                					}else if((i+21)!=0&&(i+21)!=8&&(i+21)!=16&&(i+21)!=24&&(i+21)!=32&&(i+21)!=40&&(i+21)!=48&&(i+21)!=56&&(i+21)!=57&&(i+21)!=58&&(i+21)!=59&&(i+21)!=60&&(i+21)!=61&&(i+21)!=62&&(i+21)!=63){
                    					if(al.get(i+28).getAvailability()==2){
                						al.get(i+28).setOption(true);
                    					
                    					c.repaint();}}}
            					}else if((i+14)!=0&&(i+14)!=8&&(i+14)!=16&&(i+14)!=24&&(i+14)!=32&&(i+14)!=40&&(i+14)!=48&&(i+14)!=56&&(i+14)!=57&&(i+14)!=58&&(i+14)!=59&&(i+14)!=60&&(i+14)!=61&&(i+14)!=62&&(i+14)!=63){
                					if(al.get(i+21).getAvailability()==2){
            						al.get(i+21).setOption(true);
                					
                					c.repaint();}}}
        					}else if((i+7)!=0&&(i+7)!=8&&(i+7)!=16&&(i+7)!=24&&(i+7)!=32&&(i+7)!=40&&(i+7)!=48&&(i+7)!=56&&(i+7)!=57&&(i+7)!=58&&(i+7)!=59&&(i+7)!=60&&(i+7)!=61&&(i+7)!=62&&(i+7)!=63){
            					if(al.get(i+14).getAvailability()==2){
        						al.get(i+14).setOption(true);
            					
            					c.repaint();}}}
    					}else if((i)!=0&&(i)!=8&&(i)!=16&&(i)!=24&&(i)!=32&&(i)!=40&&(i)!=48&&(i)!=56&&(i)!=57&&(i)!=58&&(i)!=59&&(i)!=60&&(i)!=61&&(i)!=62&&(i)!=63){
        					if(al.get(i+7).getAvailability()==2){
    						al.get(i+7).setOption(true);
        					
        					c.repaint();}}}
    				
    				
    				if((i)!=7&&(i)!=15&&(i)!=23&&(i)!=31&&(i)!=39&&(i)!=47&&(i)!=55&&(i)!=56&&(i)!=57&&(i)!=58&&(i)!=59&&(i)!=60&&(i)!=61&&(i)!=62&&(i)!=63){
    					if(al.get(i+9).getAvailability()==0){
    					al.get(i+9).setOption(true);
    					
    					c.repaint();
    					if((i+9)!=7&&(i+9)!=15&&(i+9)!=23&&(i+9)!=31&&(i+9)!=39&&(i+9)!=47&&(i+9)!=55&&(i+9)!=56&&(i+9)!=57&&(i+9)!=58&&(i+9)!=59&&(i+9)!=60&&(i+9)!=61&&(i+9)!=62&&(i+9)!=63){
        					if(al.get(i+18).getAvailability()==0){
    						al.get(i+18).setOption(true);
        					
        					c.repaint();
    						if((i+18)!=7&&(i+18)!=15&&(i+18)!=23&&(i+18)!=31&&(i+18)!=39&&(i+18)!=47&&(i+18)!=55&&(i+18)!=56&&(i+18)!=57&&(i+18)!=58&&(i+18)!=59&&(i+18)!=60&&(i+18)!=61&&(i+18)!=62&&(i+18)!=63){
    							if(al.get(i+27).getAvailability()==0){
    							al.get(i+27).setOption(true);
    							
    							c.repaint();
    							if((i+27)!=7&&(i+27)!=15&&(i+27)!=23&&(i+27)!=31&&(i+27)!=39&&(i+27)!=47&&(i+27)!=55&&(i+27)!=56&&(i+27)!=57&&(i+27)!=58&&(i+27)!=59&&(i+27)!=60&&(i+27)!=61&&(i+27)!=62&&(i+27)!=63){
    	        					if(al.get(i+36).getAvailability()==0){
    								al.get(i+36).setOption(true);
    	        					
    	        					c.repaint();
    	        					if((i+36)!=7&&(i+36)!=15&&(i+36)!=23&&(i+36)!=31&&(i+36)!=39&&(i+36)!=47&&(i+36)!=55&&(i+36)!=56&&(i+36)!=57&&(i+36)!=58&&(i+36)!=59&&(i+36)!=60&&(i+36)!=61&&(i+36)!=62&&(i+36)!=63){
    	            					if(al.get(i+45).getAvailability()==0){
    	        						al.get(i+45).setOption(true);
    	            					
    	            					c.repaint();
    	            					if((i+45)!=7&&(i+45)!=15&&(i+45)!=23&&(i+45)!=31&&(i+45)!=39&&(i+45)!=47&&(i+45)!=55&&(i+45)!=56&&(i+45)!=57&&(i+45)!=58&&(i+45)!=59&&(i+45)!=60&&(i+45)!=61&&(i+45)!=62&&(i+45)!=63){
    	                					if(al.get(i+54).getAvailability()==0){
    	            						al.get(i+54).setOption(true);
    	                					
    	                					c.repaint();
    	                					if((i+54)!=7&&(i+54)!=15&&(i+54)!=23&&(i+54)!=31&&(i+54)!=39&&(i+54)!=47&&(i+54)!=55&&(i+54)!=56&&(i+54)!=57&&(i+54)!=58&&(i+54)!=59&&(i+54)!=60&&(i+54)!=61&&(i+54)!=62&&(i+54)!=63){
    	                    					if(al.get(i+63).getAvailability()==0){
    	                						al.get(i+63).setOption(true);
    	                    					Properties.setSelected(5);
    	                    					c.repaint();
    	                    				}else if((i+54)!=7&&(i+54)!=15&&(i+54)!=23&&(i+54)!=31&&(i+54)!=39&&(i+54)!=47&&(i+54)!=55&&(i+54)!=56&&(i+54)!=57&&(i+54)!=58&&(i+54)!=59&&(i+54)!=60&&(i+54)!=61&&(i+54)!=62&&(i+54)!=63){
        	                    				if(al.get(i+63).getAvailability()==2){	
    	                						al.get(i+63).setOption(true);
        	                    					
        	                    					c.repaint();}}}
    	                					}else if((i+45)!=7&&(i+45)!=15&&(i+45)!=23&&(i+45)!=31&&(i+45)!=39&&(i+45)!=47&&(i+45)!=55&&(i+45)!=56&&(i+45)!=57&&(i+45)!=58&&(i+45)!=59&&(i+45)!=60&&(i+45)!=61&&(i+45)!=62&&(i+45)!=63){
        	                					if(al.get(i+54).getAvailability()==2){
    	                						al.get(i+54).setOption(true);
        	                					
        	                					c.repaint();}}}
    	            					}else if((i+36)!=7&&(i+36)!=15&&(i+36)!=23&&(i+36)!=31&&(i+36)!=39&&(i+36)!=47&&(i+36)!=55&&(i+36)!=56&&(i+36)!=57&&(i+36)!=58&&(i+36)!=59&&(i+36)!=60&&(i+36)!=61&&(i+36)!=62&&(i+36)!=63){
        	            					if(al.get(i+45).getAvailability()==2){
    	            						al.get(i+45).setOption(true);
        	            					
        	            					c.repaint();}}}
    	        					}else if((i+27)!=7&&(i+27)!=15&&(i+27)!=23&&(i+27)!=31&&(i+27)!=39&&(i+27)!=47&&(i+27)!=55&&(i+27)!=56&&(i+27)!=57&&(i+27)!=58&&(i+27)!=59&&(i+27)!=60&&(i+27)!=61&&(i+27)!=62&&(i+27)!=63){
        	        					if(al.get(i+36).getAvailability()==2){
    	        						al.get(i+36).setOption(true);
        	        					
        	        					c.repaint();}}}
    							}else if((i+18)!=7&&(i+18)!=15&&(i+18)!=23&&(i+18)!=31&&(i+18)!=39&&(i+18)!=47&&(i+18)!=55&&(i+18)!=56&&(i+18)!=57&&(i+18)!=58&&(i+18)!=59&&(i+18)!=60&&(i+18)!=61&&(i+18)!=62&&(i+18)!=63){
    								if(al.get(i+27).getAvailability()==2){
    								al.get(i+27).setOption(true);
        							
        							c.repaint();}}}
    						}else if((i+9)!=7&&(i+9)!=15&&(i+9)!=23&&(i+9)!=31&&(i+9)!=39&&(i+9)!=47&&(i+9)!=55&&(i+9)!=56&&(i+9)!=57&&(i+9)!=58&&(i+9)!=59&&(i+9)!=60&&(i+9)!=61&&(i+9)!=62&&(i+9)!=63){
    	        				if(al.get(i+18).getAvailability()==2){	
    							al.get(i+18).setOption(true);
    	        					
    	        					c.repaint();}}}
    						}	else if((i)!=7&&(i)!=15&&(i)!=23&&(i)!=31&&(i)!=39&&(i)!=47&&(i)!=55&&(i)!=56&&(i)!=57&&(i)!=58&&(i)!=59&&(i)!=60&&(i)!=61&&(i)!=62&&(i)!=63){
    	    					if(al.get(i+9).getAvailability()==2){
    							al.get(i+9).setOption(true);
    	    					
    	    					c.repaint();}}}
    	} //end of white bishop
        	 
         
     //lets make the white rooks
    		if(al.get(i).getWhichPawn()==1&&al.get(i).getAvailability()==1&&Properties.getWhoseTurn()==true&&al.get(i).getOption()==false){
    			for(int k=0; k<64; k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    				c.repaint();
    			}
    			location=i;
    			Properties.setSelected(11);
    			if(i!=0&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7){
    				if(al.get(i-8).getAvailability()==0){
    					al.get(i-8).setOption(true);
    					
    					c.repaint();
    					if((i-8)!=0&&(i-8)!=1&&(i-8)!=2&&(i-8)!=3&&(i-8)!=4&&(i-8)!=5&&(i-8)!=6&&(i-8)!=7){
    						if(al.get(i-16).getAvailability()==0){
    							al.get(i-16).setOption(true);
    	    					
    	    					c.repaint();
    	    					if((i-16)!=0&&(i-16)!=1&&(i-16)!=2&&(i-16)!=3&&(i-16)!=4&&(i-16)!=5&&(i-16)!=6&&(i-16)!=7){
    	    						if(al.get(i-24).getAvailability()==0){
    	    							al.get(i-24).setOption(true);
    	    	    					
    	    	    					c.repaint();
    	    	    					if((i-24)!=0&&(i-24)!=1&&(i-24)!=2&&(i-24)!=3&&(i-24)!=4&&(i-24)!=5&&(i-24)!=6&&(i-24)!=7){
    	    	    						if(al.get(i-32).getAvailability()==0){
    	    	    							al.get(i-32).setOption(true);
    	    	    	    					
    	    	    	    					c.repaint();
    	    	    	    					if((i-32)!=0&&(i-32)!=1&&(i-32)!=2&&(i-32)!=3&&(i-32)!=4&&(i-32)!=5&&(i-32)!=6&&(i-32)!=7){
    	    	    	    						if(al.get(i-40).getAvailability()==0){
    	    	    	    							al.get(i-40).setOption(true);
    	    	    	    	    					
    	    	    	    	    					c.repaint();
    	    	    	    	    					if((i-40)!=0&&(i-40)!=1&&(i-40)!=2&&(i-40)!=3&&(i-40)!=4&&(i-40)!=5&&(i-40)!=6&&(i-40)!=7){
    	    	    	    	    						if(al.get(i-48).getAvailability()==0){
    	    	    	    	    							al.get(i-48).setOption(true);
    	    	    	    	    	    					
    	    	    	    	    	    					c.repaint();
    	    	    	    	    	    					if((i-48)!=0&&(i-48)!=1&&(i-48)!=2&&(i-48)!=3&&(i-48)!=4&&(i-48)!=5&&(i-48)!=6&&(i-48)!=7){
    	    	    	    	    	    						if(al.get(i-56).getAvailability()==0){
    	    	    	    	    	    							al.get(i-56).setOption(true);
    	    	    	    	    	    	    					
    	    	    	    	    	    	    					c.repaint();
    	    	    	    	    	    						}else if(al.get(i-56).getAvailability()==2){
    	    	    	    	    	    	    					al.get(i-56).setOption(true);
    	    	    	    	    	    	    				
    	    	    	    	    	    	    					c.repaint();}
    	    	    	    	    	    					}
    	    	    	    	    						}else if(al.get(i-48).getAvailability()==2){
    	    	    	    	    	    					al.get(i-48).setOption(true);
    	    	    	    	    	    					
    	    	    	    	    	    					c.repaint();}
    	    	    	    	    					}
    	    	    	    						}else if(al.get(i-40).getAvailability()==2){
    	    	    	    	    					al.get(i-40).setOption(true);
    	    	    	    	    					
    	    	    	    	    					c.repaint();}
    	    	    	    					}
    	    	    						}else if(al.get(i-32).getAvailability()==2){
    	    	    	    					al.get(i-32).setOption(true);
    	    	    	    					
    	    	    	    					c.repaint();}
    	    	    					}
    	    						}else if(al.get(i-24).getAvailability()==2){
    	    	    					al.get(i-24).setOption(true);
    	    	    					
    	    	    					c.repaint();}
    	    					}
    						}else if(al.get(i-16).getAvailability()==2){
    	    					al.get(i-16).setOption(true);
    	    					
    	    					c.repaint();
    						}
    					}
    				}else if(al.get(i-8).getAvailability()==2){
    					al.get(i-8).setOption(true);
    					
    					c.repaint();
    				}
    			}
    			if(i!=56&&i!=57&&i!=58&&i!=59&&i!=60&&i!=61&&i!=62&&i!=63){
    				if(al.get(i+8).getAvailability()==0){
    					al.get(i+8).setOption(true);
    					
    					c.repaint();
    					if((i+8)!=56&&(i+8)!=57&&(i+8)!=58&&(i+8)!=59&&(i+8)!=60&&(i+8)!=61&&(i+8)!=62&&(i+8)!=63){
    	    				if(al.get(i+16).getAvailability()==0){
    	    					al.get(i+16).setOption(true);
    	    					
    	    					c.repaint();
    	    					if((i+16)!=56&&(i+16)!=57&&(i+16)!=58&&(i+16)!=59&&(i+16)!=60&&(i+16)!=61&&(i+16)!=62&&(i+16)!=63){
    	    	    				if(al.get(i+24).getAvailability()==0){
    	    	    					al.get(i+24).setOption(true);
    	    	    					
    	    	    					c.repaint();
    	    	    					if((i+24)!=56&&(i+24)!=57&&(i+24)!=58&&(i+24)!=59&&(i+24)!=60&&(i+24)!=61&&(i+24)!=62&&(i+24)!=63){
    	    	    	    				if(al.get(i+32).getAvailability()==0){
    	    	    	    					al.get(i+32).setOption(true);
    	    	    	    					
    	    	    	    					c.repaint();
    	    	    	    					if((i+32)!=56&&(i+32)!=57&&(i+32)!=58&&(i+32)!=59&&(i+32)!=60&&(i+32)!=61&&(i+32)!=62&&(i+32)!=63){
    	    	    	    	    				if(al.get(i+40).getAvailability()==0){
    	    	    	    	    					al.get(i+40).setOption(true);
    	    	    	    	    					
    	    	    	    	    					c.repaint();
    	    	    	    	    					if((i+40)!=56&&(i+40)!=57&&(i+40)!=58&&(i+40)!=59&&(i+40)!=60&&(i+40)!=61&&(i+40)!=62&&(i+40)!=63){
    	    	    	    	    	    				if(al.get(i+48).getAvailability()==0){
    	    	    	    	    	    					al.get(i+48).setOption(true);
    	    	    	    	    	    					
    	    	    	    	    	    					c.repaint();
    	    	    	    	    	    					if((i+48)!=56&&(i+48)!=57&&(i+48)!=58&&(i+48)!=59&&(i+48)!=60&&(i+48)!=61&&(i+48)!=62&&(i+48)!=63){
    	    	    	    	    	    	    				if(al.get(i+56).getAvailability()==0){
    	    	    	    	    	    	    					al.get(i+56).setOption(true);
    	    	    	    	    	    	    					
    	    	    	    	    	    	    					c.repaint();
    	    	    	    	    	    	    				}else if(al.get(i+56).getAvailability()==2){
    	    	    	    	    	    	    					al.get(i+56).setOption(true);
    	    	    	    	    	    	    					
    	    	    	    	    	    	    					c.repaint();}
    	    	    	    	    	    					}
    	    	    	    	    	    				}else if(al.get(i+48).getAvailability()==2){
    	    	    	    	    	    					al.get(i+48).setOption(true);
    	    	    	    	    	    					
    	    	    	    	    	    					c.repaint();}
    	    	    	    	    					}
    	    	    	    	    				}else if(al.get(i+40).getAvailability()==2){
    	    	    	    	    					al.get(i+40).setOption(true);
    	    	    	    	    					
    	    	    	    	    					c.repaint();}
    	    	    	    					}
    	    	    	    				}else if(al.get(i+32).getAvailability()==2){
    	    	    	    					al.get(i+32).setOption(true);
    	    	    	    					
    	    	    	    					c.repaint();}
    	    	    					}
    	    	    				}else if(al.get(i+24).getAvailability()==2){
    	    	    					al.get(i+24).setOption(true);
    	    	    				
    	    	    					c.repaint();}
    	    					}
    	    				}else if(al.get(i+16).getAvailability()==2){
    	    					al.get(i+16).setOption(true);
    	    					
    	    					c.repaint();}
    					}
    				}else if(al.get(i+8).getAvailability()==2){
    					al.get(i+8).setOption(true);
    				
    					c.repaint();}
    			}
    			
    			if(i!=7&&i!=15&&i!=23&&i!=31&&i!=39&&i!=47&&i!=55&&i!=63){
    				if(al.get(i+1).getAvailability()==0){
    					al.get(i+1).setOption(true);
    					
    					c.repaint();
    					if((i+1)!=7&&(i+1)!=15&&(i+1)!=23&&(i+1)!=31&&(i+1)!=39&&(i+1)!=47&&(i+1)!=55&&(i+1)!=63){
    	    				if(al.get(i+2).getAvailability()==0){
    	    					al.get(i+2).setOption(true);
    	    				
    	    					c.repaint();
    	    					if((i+2)!=7&&(i+2)!=15&&(i+2)!=23&&(i+2)!=31&&(i+2)!=39&&(i+2)!=47&&(i+2)!=55&&(i+2)!=63){
    	    	    				if(al.get(i+3).getAvailability()==0){
    	    	    					al.get(i+3).setOption(true);
    	    	    					
    	    	    					c.repaint();
    	    	    					if((i+3)!=7&&(i+3)!=15&&(i+3)!=23&&(i+3)!=31&&(i+3)!=39&&(i+3)!=47&&(i+3)!=55&&(i+3)!=63){
    	    	    	    				if(al.get(i+4).getAvailability()==0){
    	    	    	    					al.get(i+4).setOption(true);
    	    	    	    					
    	    	    	    					c.repaint();
    	    	    	    					if((i+4)!=7&&(i+4)!=15&&(i+4)!=23&&(i+4)!=31&&(i+4)!=39&&(i+4)!=47&&(i+4)!=55&&(i+4)!=63){
    	    	    	    	    				if(al.get(i+5).getAvailability()==0){
    	    	    	    	    					al.get(i+5).setOption(true);
    	    	    	    	    					
    	    	    	    	    					c.repaint();
    	    	    	    	    					if((i+5)!=7&&(i+5)!=15&&(i+5)!=23&&(i+5)!=31&&(i+5)!=39&&(i+5)!=47&&(i+5)!=55&&(i+5)!=63){
    	    	    	    	    	    				if(al.get(i+6).getAvailability()==0){
    	    	    	    	    	    					al.get(i+6).setOption(true);
    	    	    	    	    	    					
    	    	    	    	    	    					c.repaint();
    	    	    	    	    	    					if((i+6)!=7&&(i+6)!=15&&(i+6)!=23&&(i+6)!=31&&(i+6)!=39&&(i+6)!=47&&(i+6)!=55&&(i+6)!=63){
    	    	    	    	    	    	    				if(al.get(i+7).getAvailability()==0){
    	    	    	    	    	    	    					al.get(i+7).setOption(true);
    	    	    	    	    	    	    					
    	    	    	    	    	    	    					c.repaint();
    	    	    	    	    	    	    				}else if(al.get(i+7).getAvailability()==2){
    	    	    	    	    	    	    					al.get(i+7).setOption(true);
    	    	    	    	    	    	    					
    	    	    	    	    	    	    					c.repaint();}
    	    	    	    	    	    					}
    	    	    	    	    	    				}else if(al.get(i+6).getAvailability()==2){
    	    	    	    	    	    					al.get(i+6).setOption(true);
    	    	    	    	    	    					
    	    	    	    	    	    					c.repaint();}
    	    	    	    	    					}
    	    	    	    	    				}else if(al.get(i+5).getAvailability()==2){
    	    	    	    	    					al.get(i+5).setOption(true);
    	    	    	    	    					
    	    	    	    	    					c.repaint();}
    	    	    	    					}
    	    	    	    				}else if(al.get(i+4).getAvailability()==2){
    	    	    	    					al.get(i+4).setOption(true);
    	    	    	    					
    	    	    	    					c.repaint();}
    	    	    					}
    	    	    				}else if(al.get(i+3).getAvailability()==2){
    	    	    					al.get(i+3).setOption(true);
    	    	    					
    	    	    					c.repaint();}
    	    					}
    	    				}else if(al.get(i+2).getAvailability()==2){
    	    					al.get(i+2).setOption(true);
    	    					
    	    					c.repaint();}
    					}
    				}else if(al.get(i+1).getAvailability()==2){
    					al.get(i+1).setOption(true);
    					
    					c.repaint();
    				}
    			}
    			
    			if(i!=0&&i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56){
    				if(al.get(i-1).getAvailability()==0){
    					al.get(i-1).setOption(true);
    					
    					c.repaint();
    					if((i-1)!=0&&(i-1)!=8&&(i-1)!=16&&(i-1)!=24&&(i-1)!=32&&(i-1)!=40&&(i-1)!=48&&(i-1)!=56){
    	    				if(al.get(i-2).getAvailability()==0){
    	    					al.get(i-2).setOption(true);
    	    					
    	    					c.repaint();
    	    					if((i-2)!=0&&(i-2)!=8&&(i-2)!=16&&(i-2)!=24&&(i-2)!=32&&(i-2)!=40&&(i-2)!=48&&(i-2)!=56){
    	    	    				if(al.get(i-3).getAvailability()==0){
    	    	    					al.get(i-3).setOption(true);
    	    	    					
    	    	    					c.repaint();
    	    	    					if((i-3)!=0&&(i-3)!=8&&(i-3)!=16&&(i-3)!=24&&(i-3)!=32&&(i-3)!=40&&(i-3)!=48&&(i-3)!=56){
    	    	    	    				if(al.get(i-4).getAvailability()==0){
    	    	    	    					al.get(i-4).setOption(true);
    	    	    	    					
    	    	    	    					c.repaint();
    	    	    	    					if((i-4)!=0&&(i-4)!=8&&(i-4)!=16&&(i-4)!=24&&(i-4)!=32&&(i-4)!=40&&(i-4)!=48&&(i-4)!=56){
    	    	    	    	    				if(al.get(i-5).getAvailability()==0){
    	    	    	    	    					al.get(i-5).setOption(true);
    	    	    	    	    					
    	    	    	    	    					c.repaint();
    	    	    	    	    					if((i-5)!=0&&(i-5)!=8&&(i-5)!=16&&(i-5)!=24&&(i-5)!=32&&(i-5)!=40&&(i-5)!=48&&(i-5)!=56){
    	    	    	    	    	    				if(al.get(i-6).getAvailability()==0){
    	    	    	    	    	    					al.get(i-6).setOption(true);
    	    	    	    	    	    					
    	    	    	    	    	    					c.repaint(); 
    	    	    	    	    	    					if((i-6)!=0&&(i-6)!=8&&(i-6)!=16&&(i-6)!=24&&(i-6)!=32&&(i-6)!=40&&(i-6)!=48&&(i-6)!=56){
    	    	    	    	    	    	    				if(al.get(i-7).getAvailability()==0){
    	    	    	    	    	    	    					al.get(i-7).setOption(true);
    	    	    	    	    	    	    					
    	    	    	    	    	    	    					c.repaint();
    	    	    	    	    	    	    				}else if(al.get(i-7).getAvailability()==2){
    	    	    	    	    	    	    					al.get(i-7).setOption(true);
    	    	    	    	    	    	    					
    	    	    	    	    	    	    					c.repaint();}
    	    	    	    	    	    					}
    	    	    	    	    	    				}else if(al.get(i-6).getAvailability()==2){
    	    	    	    	    	    					al.get(i-6).setOption(true);
    	    	    	    	    	    					
    	    	    	    	    	    					c.repaint();}
    	    	    	    	    					}
    	    	    	    	    				}else if(al.get(i-5).getAvailability()==2){
    	    	    	    	    					al.get(i-5).setOption(true);
    	    	    	    	    					
    	    	    	    	    					c.repaint();}
    	    	    	    					}
    	    	    	    				}else if(al.get(i-4).getAvailability()==2){
    	    	    	    					al.get(i-4).setOption(true);
    	    	    	    					
    	    	    	    					c.repaint();}
    	    	    					}
    	    	    				}else if(al.get(i-3).getAvailability()==2){
    	    	    					al.get(i-3).setOption(true);
    	    	    					
    	    	    					c.repaint();}
    	    					}
    	    				}else if(al.get(i-2).getAvailability()==2){
    	    					al.get(i-2).setOption(true);
    	    					
    	    					c.repaint();}
    					}
    				}else if(al.get(i-1).getAvailability()==2){
    					al.get(i-1).setOption(true);
    					
    					c.repaint();}
    			}
    			
    			
    		}
    		//τέλος οι πύργοι , πάμε στους ίππους
    		if(al.get(i).getWhichPawn()==2&&al.get(i).getAvailability()==1&&Properties.getWhoseTurn()==true&&al.get(i).getOption()==false){
    			for(int k=0; k<64; k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    				c.repaint();
    			}
    			location=i;
    			Properties.setSelected(3);
    			if(i!=0&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7&& i!=8&&i!=9&&i!=10&&i!=11&&i!=12&&i!=13&&i!=14&&i!=15&& i!=23&&i!=31&&i!=39&&i!=47&&i!=55&&i!=63){
    				if(al.get(i-15).getAvailability()==0||al.get(i-15).getAvailability()==2){
    					al.get(i-15).setOption(true);
    					
    					c.repaint();
    				}
    			}
    			if(i!=0&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7&& i!=8&&i!=9&&i!=10&&i!=11&&i!=12&&i!=13&&i!=14&&i!=15&& i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56){
    				if(al.get(i-17).getAvailability()==0||al.get(i-15).getAvailability()==2){
    					al.get(i-17).setOption(true);
    					
    					c.repaint();
    				}
    			}
    			if(i!=0&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7&& i!=14&&i!=22&&i!=30&&i!=38&&i!=46&&i!=54&&i!=62&&i!=15&& i!=23&&i!=31&&i!=39&&i!=47&&i!=55&&i!=63){
    				if(al.get(i-6).getAvailability()==0||al.get(i-6).getAvailability()==2){
    					al.get(i-6).setOption(true);
    					
    					c.repaint();
    				}
    			}
    			if(i!=0&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7&& i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56&& i!=9&&i!=17&&i!=25&&i!=33&&i!=41&&i!=49&&i!=57){
    				if(al.get(i-10).getAvailability()==0||al.get(i-10).getAvailability()==2){
    					al.get(i-10).setOption(true);
    					
    					c.repaint();
    				}
    			}
    			if(i!=56&&i!=57&&i!=58&&i!=59&&i!=60&&i!=61&&i!=62&&i!=63&&i!=0&& i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=1&& i!=9&&i!=17&&i!=25&&i!=33&&i!=41&&i!=49){
    				if(al.get(i+6).getAvailability()==0||al.get(i+6).getAvailability()==2){
    					al.get(i+6).setOption(true);
    					
    					c.repaint();
    				}
    			}
    			if(i!=56&&i!=57&&i!=58&&i!=59&&i!=60&&i!=61&&i!=62&&i!=63&&i!=7&& i!=15&&i!=23&&i!=31&&i!=39&&i!=47&&i!=55&&i!=63&& i!=6&&i!=14&&i!=22&&i!=30&&i!=38&&i!=54){
    				if(al.get(i+10).getAvailability()==0||al.get(i+10).getAvailability()==2){
    					al.get(i+10).setOption(true);
    					
    					c.repaint();
    				}
    			}
    			if(i!=56&&i!=57&&i!=58&&i!=59&&i!=60&&i!=61&&i!=62&&i!=63&&i!=48&& i!=49&&i!=50&&i!=51&&i!=52&&i!=53&&i!=54&&i!=55&& i!=7&&i!=15&&i!=23&&i!=31&&i!=39&&i!=47){
    				if(al.get(i+17).getAvailability()==0||al.get(i+17).getAvailability()==2){
    					al.get(i+17).setOption(true);
    					
    					c.repaint();
    				}
    			}
    			if(i!=56&&i!=57&&i!=58&&i!=59&&i!=60&&i!=61&&i!=62&&i!=63&&i!=48&& i!=49&&i!=50&&i!=51&&i!=52&&i!=53&&i!=54&&i!=55&& i!=0&&i!=8&&i!=16&&i!=24&&i!=32&&i!=48){
    				if(al.get(i+15).getAvailability()==0||al.get(i+15).getAvailability()==2){
    					al.get(i+15).setOption(true);
    					
    					c.repaint();
    				}
    			}
    		}
    		//βασίλισσα
    		if(al.get(i).getWhichPawn()==4&&al.get(i).getAvailability()==1&&Properties.getWhoseTurn()==true&&al.get(i).getOption()==false){
    			for(int k=0; k<64; k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    				c.repaint();
    			}
    			location=i;
    			if(i!=0&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7){
    				if(al.get(i-8).getAvailability()==0){
    					al.get(i-8).setOption(true);
    					Properties.setSelected(7);
    					c.repaint();
    					if((i-8)!=0&&(i-8)!=1&&(i-8)!=2&&(i-8)!=3&&(i-8)!=4&&(i-8)!=5&&(i-8)!=6&&(i-8)!=7){
    						if(al.get(i-16).getAvailability()==0){
    							al.get(i-16).setOption(true);
    	    					Properties.setSelected(7);
    	    					c.repaint();
    	    					if((i-16)!=0&&(i-16)!=1&&(i-16)!=2&&(i-16)!=3&&(i-16)!=4&&(i-16)!=5&&(i-16)!=6&&(i-16)!=7){
    	    						if(al.get(i-24).getAvailability()==0){
    	    							al.get(i-24).setOption(true);
    	    	    					Properties.setSelected(7);
    	    	    					c.repaint();
    	    	    					if((i-24)!=0&&(i-24)!=1&&(i-24)!=2&&(i-24)!=3&&(i-24)!=4&&(i-24)!=5&&(i-24)!=6&&(i-24)!=7){
    	    	    						if(al.get(i-32).getAvailability()==0){
    	    	    							al.get(i-32).setOption(true);
    	    	    	    					Properties.setSelected(7);
    	    	    	    					c.repaint();
    	    	    	    					if((i-32)!=0&&(i-32)!=1&&(i-32)!=2&&(i-32)!=3&&(i-32)!=4&&(i-32)!=5&&(i-32)!=6&&(i-32)!=7){
    	    	    	    						if(al.get(i-40).getAvailability()==0){
    	    	    	    							al.get(i-40).setOption(true);
    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    					c.repaint();
    	    	    	    	    					if((i-40)!=0&&(i-40)!=1&&(i-40)!=2&&(i-40)!=3&&(i-40)!=4&&(i-40)!=5&&(i-40)!=6&&(i-40)!=7){
    	    	    	    	    						if(al.get(i-48).getAvailability()==0){
    	    	    	    	    							al.get(i-48).setOption(true);
    	    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    	    					c.repaint();
    	    	    	    	    	    					if((i-48)!=0&&(i-48)!=1&&(i-48)!=2&&(i-48)!=3&&(i-48)!=4&&(i-48)!=5&&(i-48)!=6&&(i-48)!=7){
    	    	    	    	    	    						if(al.get(i-56).getAvailability()==0){
    	    	    	    	    	    							al.get(i-56).setOption(true);
    	    	    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    	    	    					c.repaint();
    	    	    	    	    	    						}else if(al.get(i-56).getAvailability()==2){
    	    	    	    	    	    	    					al.get(i-56).setOption(true);
    	    	    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    	    	    					c.repaint();}
    	    	    	    	    	    					}
    	    	    	    	    						}else if(al.get(i-48).getAvailability()==2){
    	    	    	    	    	    					al.get(i-48).setOption(true);
    	    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    	    					c.repaint();}
    	    	    	    	    					}
    	    	    	    						}else if(al.get(i-40).getAvailability()==2){
    	    	    	    	    					al.get(i-40).setOption(true);
    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    					c.repaint();}
    	    	    	    					}
    	    	    						}else if(al.get(i-32).getAvailability()==2){
    	    	    	    					al.get(i-32).setOption(true);
    	    	    	    					Properties.setSelected(7);
    	    	    	    					c.repaint();}
    	    	    					}
    	    						}else if(al.get(i-24).getAvailability()==2){
    	    	    					al.get(i-24).setOption(true);
    	    	    					Properties.setSelected(7);
    	    	    					c.repaint();}
    	    					}
    						}else if(al.get(i-16).getAvailability()==2){
    	    					al.get(i-16).setOption(true);
    	    					Properties.setSelected(7);
    	    					c.repaint();
    						}
    					}
    				}else if(al.get(i-8).getAvailability()==2){
    					al.get(i-8).setOption(true);
    					Properties.setSelected(7);
    					c.repaint();
    				}
    			}
    			if(i!=56&&i!=57&&i!=58&&i!=59&&i!=60&&i!=61&&i!=62&&i!=63){
    				if(al.get(i+8).getAvailability()==0){
    					al.get(i+8).setOption(true);
    					Properties.setSelected(7);
    					c.repaint();
    					if((i+8)!=56&&(i+8)!=57&&(i+8)!=58&&(i+8)!=59&&(i+8)!=60&&(i+8)!=61&&(i+8)!=62&&(i+8)!=63){
    	    				if(al.get(i+16).getAvailability()==0){
    	    					al.get(i+16).setOption(true);
    	    					Properties.setSelected(7);
    	    					c.repaint();
    	    					if((i+16)!=56&&(i+16)!=57&&(i+16)!=58&&(i+16)!=59&&(i+16)!=60&&(i+16)!=61&&(i+16)!=62&&(i+16)!=63){
    	    	    				if(al.get(i+24).getAvailability()==0){
    	    	    					al.get(i+24).setOption(true);
    	    	    					Properties.setSelected(7);
    	    	    					c.repaint();
    	    	    					if((i+24)!=56&&(i+24)!=57&&(i+24)!=58&&(i+24)!=59&&(i+24)!=60&&(i+24)!=61&&(i+24)!=62&&(i+24)!=63){
    	    	    	    				if(al.get(i+32).getAvailability()==0){
    	    	    	    					al.get(i+32).setOption(true);
    	    	    	    					Properties.setSelected(7);
    	    	    	    					c.repaint();
    	    	    	    					if((i+32)!=56&&(i+32)!=57&&(i+32)!=58&&(i+32)!=59&&(i+32)!=60&&(i+32)!=61&&(i+32)!=62&&(i+32)!=63){
    	    	    	    	    				if(al.get(i+40).getAvailability()==0){
    	    	    	    	    					al.get(i+40).setOption(true);
    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    					c.repaint();
    	    	    	    	    					if((i+40)!=56&&(i+40)!=57&&(i+40)!=58&&(i+40)!=59&&(i+40)!=60&&(i+40)!=61&&(i+40)!=62&&(i+40)!=63){
    	    	    	    	    	    				if(al.get(i+48).getAvailability()==0){
    	    	    	    	    	    					al.get(i+48).setOption(true);
    	    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    	    					c.repaint();
    	    	    	    	    	    					if((i+48)!=56&&(i+48)!=57&&(i+48)!=58&&(i+48)!=59&&(i+48)!=60&&(i+48)!=61&&(i+48)!=62&&(i+48)!=63){
    	    	    	    	    	    	    				if(al.get(i+56).getAvailability()==0){
    	    	    	    	    	    	    					al.get(i+56).setOption(true);
    	    	    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    	    	    					c.repaint();
    	    	    	    	    	    	    				}else if(al.get(i+56).getAvailability()==2){
    	    	    	    	    	    	    					al.get(i+56).setOption(true);
    	    	    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    	    	    					c.repaint();}
    	    	    	    	    	    					}
    	    	    	    	    	    				}else if(al.get(i+48).getAvailability()==2){
    	    	    	    	    	    					al.get(i+48).setOption(true);
    	    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    	    					c.repaint();}
    	    	    	    	    					}
    	    	    	    	    				}else if(al.get(i+40).getAvailability()==2){
    	    	    	    	    					al.get(i+40).setOption(true);
    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    					c.repaint();}
    	    	    	    					}
    	    	    	    				}else if(al.get(i+32).getAvailability()==2){
    	    	    	    					al.get(i+32).setOption(true);
    	    	    	    					Properties.setSelected(7);
    	    	    	    					c.repaint();}
    	    	    					}
    	    	    				}else if(al.get(i+24).getAvailability()==2){
    	    	    					al.get(i+24).setOption(true);
    	    	    					Properties.setSelected(7);
    	    	    					c.repaint();}
    	    					}
    	    				}else if(al.get(i+16).getAvailability()==2){
    	    					al.get(i+16).setOption(true);
    	    					Properties.setSelected(7);
    	    					c.repaint();}
    					}
    				}else if(al.get(i+8).getAvailability()==2){
    					al.get(i+8).setOption(true);
    					Properties.setSelected(7);
    					c.repaint();}
    			}
    			
    			if(i!=7&&i!=15&&i!=23&&i!=31&&i!=39&&i!=47&&i!=55&&i!=63){
    				if(al.get(i+1).getAvailability()==0){
    					al.get(i+1).setOption(true);
    					Properties.setSelected(7);
    					c.repaint();
    					if((i+1)!=7&&(i+1)!=15&&(i+1)!=23&&(i+1)!=31&&(i+1)!=39&&(i+1)!=47&&(i+1)!=55&&(i+1)!=63){
    	    				if(al.get(i+2).getAvailability()==0){
    	    					al.get(i+2).setOption(true);
    	    					Properties.setSelected(7);
    	    					c.repaint();
    	    					if((i+2)!=7&&(i+2)!=15&&(i+2)!=23&&(i+2)!=31&&(i+2)!=39&&(i+2)!=47&&(i+2)!=55&&(i+2)!=63){
    	    	    				if(al.get(i+3).getAvailability()==0){
    	    	    					al.get(i+3).setOption(true);
    	    	    					Properties.setSelected(7);
    	    	    					c.repaint();
    	    	    					if((i+3)!=7&&(i+3)!=15&&(i+3)!=23&&(i+3)!=31&&(i+3)!=39&&(i+3)!=47&&(i+3)!=55&&(i+3)!=63){
    	    	    	    				if(al.get(i+4).getAvailability()==0){
    	    	    	    					al.get(i+4).setOption(true);
    	    	    	    					Properties.setSelected(7);
    	    	    	    					c.repaint();
    	    	    	    					if((i+4)!=7&&(i+4)!=15&&(i+4)!=23&&(i+4)!=31&&(i+4)!=39&&(i+4)!=47&&(i+4)!=55&&(i+4)!=63){
    	    	    	    	    				if(al.get(i+5).getAvailability()==0){
    	    	    	    	    					al.get(i+5).setOption(true);
    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    					c.repaint();
    	    	    	    	    					if((i+5)!=7&&(i+5)!=15&&(i+5)!=23&&(i+5)!=31&&(i+5)!=39&&(i+5)!=47&&(i+5)!=55&&(i+5)!=63){
    	    	    	    	    	    				if(al.get(i+6).getAvailability()==0){
    	    	    	    	    	    					al.get(i+6).setOption(true);
    	    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    	    					c.repaint();
    	    	    	    	    	    					if((i+6)!=7&&(i+6)!=15&&(i+6)!=23&&(i+6)!=31&&(i+6)!=39&&(i+6)!=47&&(i+6)!=55&&(i+6)!=63){
    	    	    	    	    	    	    				if(al.get(i+7).getAvailability()==0){
    	    	    	    	    	    	    					al.get(i+7).setOption(true);
    	    	    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    	    	    					c.repaint();
    	    	    	    	    	    	    				}else if(al.get(i+7).getAvailability()==2){
    	    	    	    	    	    	    					al.get(i+7).setOption(true);
    	    	    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    	    	    					c.repaint();}
    	    	    	    	    	    					}
    	    	    	    	    	    				}else if(al.get(i+6).getAvailability()==2){
    	    	    	    	    	    					al.get(i+6).setOption(true);
    	    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    	    					c.repaint();}
    	    	    	    	    					}
    	    	    	    	    				}else if(al.get(i+5).getAvailability()==2){
    	    	    	    	    					al.get(i+5).setOption(true);
    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    					c.repaint();}
    	    	    	    					}
    	    	    	    				}else if(al.get(i+4).getAvailability()==2){
    	    	    	    					al.get(i+4).setOption(true);
    	    	    	    					Properties.setSelected(7);
    	    	    	    					c.repaint();}
    	    	    					}
    	    	    				}else if(al.get(i+3).getAvailability()==2){
    	    	    					al.get(i+3).setOption(true);
    	    	    					Properties.setSelected(7);
    	    	    					c.repaint();}
    	    					}
    	    				}else if(al.get(i+2).getAvailability()==2){
    	    					al.get(i+2).setOption(true);
    	    					Properties.setSelected(7);
    	    					c.repaint();}
    					}
    				}else if(al.get(i+1).getAvailability()==2){
    					al.get(i+1).setOption(true);
    					Properties.setSelected(7);
    					c.repaint();
    				}
    			}
    			
    			if(i!=0&&i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56){
    				if(al.get(i-1).getAvailability()==0){
    					al.get(i-1).setOption(true);
    					Properties.setSelected(7);
    					c.repaint();
    					if((i-1)!=0&&(i-1)!=8&&(i-1)!=16&&(i-1)!=24&&(i-1)!=32&&(i-1)!=40&&(i-1)!=48&&(i-1)!=56){
    	    				if(al.get(i-2).getAvailability()==0){
    	    					al.get(i-2).setOption(true);
    	    					Properties.setSelected(7);
    	    					c.repaint();
    	    					if((i-2)!=0&&(i-2)!=8&&(i-2)!=16&&(i-2)!=24&&(i-2)!=32&&(i-2)!=40&&(i-2)!=48&&(i-2)!=56){
    	    	    				if(al.get(i-3).getAvailability()==0){
    	    	    					al.get(i-3).setOption(true);
    	    	    					Properties.setSelected(7);
    	    	    					c.repaint();
    	    	    					if((i-3)!=0&&(i-3)!=8&&(i-3)!=16&&(i-3)!=24&&(i-3)!=32&&(i-3)!=40&&(i-3)!=48&&(i-3)!=56){
    	    	    	    				if(al.get(i-4).getAvailability()==0){
    	    	    	    					al.get(i-4).setOption(true);
    	    	    	    					Properties.setSelected(7);
    	    	    	    					c.repaint();
    	    	    	    					if((i-4)!=0&&(i-4)!=8&&(i-4)!=16&&(i-4)!=24&&(i-4)!=32&&(i-4)!=40&&(i-4)!=48&&(i-4)!=56){
    	    	    	    	    				if(al.get(i-5).getAvailability()==0){
    	    	    	    	    					al.get(i-5).setOption(true);
    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    					c.repaint();
    	    	    	    	    					if((i-5)!=0&&(i-5)!=8&&(i-5)!=16&&(i-5)!=24&&(i-5)!=32&&(i-5)!=40&&(i-5)!=48&&(i-5)!=56){
    	    	    	    	    	    				if(al.get(i-6).getAvailability()==0){
    	    	    	    	    	    					al.get(i-6).setOption(true);
    	    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    	    					c.repaint(); 
    	    	    	    	    	    					if((i-6)!=0&&(i-6)!=8&&(i-6)!=16&&(i-6)!=24&&(i-6)!=32&&(i-6)!=40&&(i-6)!=48&&(i-6)!=56){
    	    	    	    	    	    	    				if(al.get(i-7).getAvailability()==0){
    	    	    	    	    	    	    					al.get(i-7).setOption(true);
    	    	    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    	    	    					c.repaint();
    	    	    	    	    	    	    				}else if(al.get(i-7).getAvailability()==2){
    	    	    	    	    	    	    					al.get(i-7).setOption(true);
    	    	    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    	    	    					c.repaint();}
    	    	    	    	    	    					}
    	    	    	    	    	    				}else if(al.get(i-6).getAvailability()==2){
    	    	    	    	    	    					al.get(i-6).setOption(true);
    	    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    	    					c.repaint();}
    	    	    	    	    					}
    	    	    	    	    				}else if(al.get(i-5).getAvailability()==2){
    	    	    	    	    					al.get(i-5).setOption(true);
    	    	    	    	    					Properties.setSelected(7);
    	    	    	    	    					c.repaint();}
    	    	    	    					}
    	    	    	    				}else if(al.get(i-4).getAvailability()==2){
    	    	    	    					al.get(i-4).setOption(true);
    	    	    	    					Properties.setSelected(7);
    	    	    	    					c.repaint();}
    	    	    					}
    	    	    				}else if(al.get(i-3).getAvailability()==2){
    	    	    					al.get(i-3).setOption(true);
    	    	    					Properties.setSelected(7);
    	    	    					c.repaint();}
    	    					}
    	    				}else if(al.get(i-2).getAvailability()==2){
    	    					al.get(i-2).setOption(true);
    	    					Properties.setSelected(7);
    	    					c.repaint();}
    					}
    				}else if(al.get(i-1).getAvailability()==2){
    					al.get(i-1).setOption(true);
    					Properties.setSelected(7);
    					c.repaint();}
    			}
    			
    			if(i!=0&&i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7){
					if(al.get(i-9).getAvailability()==0){
					al.get(i-9).setOption(true);
					Properties.setSelected(7);
					c.repaint();
					if((i-9)!=0&&(i-9)!=8&&(i-9)!=16&&(i-9)!=24&&(i-9)!=32&&(i-9)!=40&&(i-9)!=48&&(i-9)!=56&&(i-9)!=1&&(i-9)!=2&&(i-9)!=3&&(i-9)!=4&&(i-9)!=5&&(i-9)!=6&&(i-9)!=7){
    					if(al.get(i-18).getAvailability()==0){
						al.get(i-18).setOption(true);
    					Properties.setSelected(7);
    					c.repaint();
    					if((i-18)!=0&&(i-18)!=8&&(i-18)!=16&&(i-18)!=24&&(i-18)!=32&&(i-18)!=40&&(i-18)!=48&&(i-18)!=56&&(i-18)!=1&&(i-18)!=2&&(i-18)!=3&&(i-18)!=4&&(i-18)!=5&&(i-18)!=6&&(i-18)!=7){
        					if(al.get(i-27).getAvailability()==0){
    						al.get(i-27).setOption(true);
        					Properties.setSelected(7);
        					c.repaint();
        					if((i-27)!=0&&(i-27)!=8&&(i-27)!=16&&(i-27)!=24&&(i-27)!=32&&(i-27)!=40&&(i-27)!=48&&(i-27)!=56&&(i-27)!=1&&(i-27)!=2&&(i-27)!=3&&(i-27)!=4&&(i-27)!=5&&(i-27)!=6&&(i-27)!=7){
            					if(al.get(i-36).getAvailability()==0){
        						al.get(i-36).setOption(true);
            					Properties.setSelected(7);
            					c.repaint();
            					if((i-36)!=0&&(i-36)!=8&&(i-36)!=16&&(i-36)!=24&&(i-36)!=32&&(i-36)!=40&&(i-36)!=48&&(i-36)!=56&&(i-36)!=1&&(i-36)!=2&&(i-36)!=3&&(i-36)!=4&&(i-36)!=5&&(i-36)!=6&&(i-36)!=7){
                					if(al.get(i-45).getAvailability()==0){
            						al.get(i-45).setOption(true);
                					Properties.setSelected(7);
                					c.repaint();
                					if((i-45)!=0&&(i-45)!=8&&(i-45)!=16&&(i-45)!=24&&(i-45)!=32&&(i-45)!=40&&(i-45)!=48&&(i-45)!=56&&(i-45)!=1&&(i-45)!=2&&(i-45)!=3&&(i-45)!=4&&(i-45)!=5&&(i-45)!=6&&(i-45)!=7){
                    					if(al.get(i-54).getAvailability()==0){
                						al.get(i-54).setOption(true);
                    					Properties.setSelected(7);
                    					c.repaint();
                    					if((i-54)!=0&&(i-54)!=8&&(i-54)!=16&&(i-54)!=24&&(i-54)!=32&&(i-54)!=40&&(i-54)!=48&&(i-54)!=56&&(i-54)!=1&&(i-54)!=2&&(i-54)!=3&&(i-54)!=4&&(i-54)!=5&&(i-54)!=6&&(i-54)!=7){
                        					if(al.get(i-63).getAvailability()==0){
                    						al.get(i-63).setOption(true);
                        					Properties.setSelected(7);
                        					c.repaint();
                        					
                        					}else if((i-54)!=0&&(i-54)!=8&&(i-54)!=16&&(i-54)!=24&&(i-54)!=32&&(i-54)!=40&&(i-54)!=48&&(i-54)!=56&&(i-54)!=1&&(i-54)!=2&&(i-54)!=3&&(i-54)!=4&&(i-54)!=5&&(i-54)!=6&&(i-54)!=7){
                    						if(al.get(i-63).getAvailability()==2){
                    						al.get(i-63).setOption(true);
                    						Properties.setSelected(7);
                    						c.repaint();}
                        				}
                    					}
                    					}else if((i-45)!=0&&(i-45)!=8&&(i-45)!=16&&(i-45)!=24&&(i-45)!=32&&(i-45)!=40&&(i-45)!=48&&(i-45)!=56&&(i-45)!=1&&(i-45)!=2&&(i-45)!=3&&(i-45)!=4&&(i-45)!=5&&(i-45)!=6&&(i-45)!=7){
                    						if(al.get(i-54).getAvailability()==2){
                    						al.get(i-54).setOption(true);
                    						Properties.setSelected(7);
                    						c.repaint();}
                        				}
                					}
                					}else if((i-36)!=0&&(i-36)!=8&&(i-36)!=16&&(i-36)!=24&&(i-36)!=32&&(i-36)!=40&&(i-36)!=48&&(i-36)!=56&&(i-36)!=1&&(i-36)!=2&&(i-36)!=3&&(i-36)!=4&&(i-36)!=5&&(i-36)!=6&&(i-36)!=7){
                						if(al.get(i-45).getAvailability()==2){
                						al.get(i-45).setOption(true);
                						Properties.setSelected(7);
                						c.repaint();}
                    				}
            					}
            					}else if((i-27)!=0&&(i-27)!=8&&(i-27)!=16&&(i-27)!=24&&(i-27)!=32&&(i-27)!=40&&(i-27)!=48&&(i-27)!=56&&(i-27)!=1&&(i-27)!=2&&(i-27)!=3&&(i-27)!=4&&(i-27)!=5&&(i-27)!=6&&(i-27)!=7){
        						if(al.get(i-36).getAvailability()==2){
        						al.get(i-36).setOption(true);
        						Properties.setSelected(7);
        						c.repaint();}
            				}
        					}
        					}else if((i-18)!=0&&(i-18)!=8&&(i-18)!=16&&(i-18)!=24&&(i-18)!=32&&(i-18)!=40&&(i-18)!=48&&(i-18)!=56&&(i-18)!=1&&(i-18)!=2&&(i-18)!=3&&(i-18)!=4&&(i-18)!=5&&(i-18)!=6&&(i-18)!=7){
    						if(al.get(i-27).getAvailability()==2){
    						al.get(i-27).setOption(true);
    						Properties.setSelected(7);
    						c.repaint();}
        				}
    					}
    				
				}else if((i-9)!=0&&(i-9)!=8&&(i-9)!=16&&(i-9)!=24&&(i-9)!=32&&(i-9)!=40&&(i-9)!=48&&(i-9)!=56&&(i-9)!=1&&(i-9)!=2&&(i-9)!=3&&(i-9)!=4&&(i-9)!=5&&(i-9)!=6&&(i-9)!=7){
					if(al.get(i-18).getAvailability()==2){
					al.get(i-18).setOption(true);
					Properties.setSelected(7);
					c.repaint();}
					}
				}
					
					}else if(i!=0&&i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7){
					if(al.get(i-9).getAvailability()==2){
					al.get(i-9).setOption(true);
					Properties.setSelected(7);
					c.repaint();}
						
				}
				
			}
				if((i)!=0&&(i)!=15&&(i)!=23&&(i)!=31&&(i)!=39&&(i)!=47&&(i)!=55&&(i)!=63&&(i)!=1&&(i)!=2&&(i)!=3&&(i)!=4&&(i)!=5&&(i)!=6&&(i)!=7){
					if(al.get(i-7).getAvailability()==0){
					al.get(i-7).setOption(true);
					Properties.setSelected(7);
					c.repaint();
					if((i-7)!=0&&(i-7)!=15&&(i-7)!=23&&(i-7)!=31&&(i-7)!=39&&(i-7)!=47&&(i-7)!=55&&(i-7)!=63&&(i-7)!=1&&(i-7)!=2&&(i-7)!=3&&(i-7)!=4&&(i-7)!=5&&(i-7)!=6&&(i-7)!=7){
    				if(al.get(i-14).getAvailability()==0){
						al.get(i-14).setOption(true);
    					Properties.setSelected(7);
    					c.repaint();
    					if((i-14)!=0&&(i-14)!=15&&(i-14)!=23&&(i-14)!=31&&(i-14)!=39&&(i-14)!=47&&(i-14)!=55&&(i-14)!=63&&(i-14)!=1&&(i-14)!=2&&(i-14)!=3&&(i-14)!=4&&(i-14)!=5&&(i-14)!=6&&(i-14)!=7){
        					if(al.get(i-21).getAvailability()==0){
    						al.get(i-21).setOption(true);
        					Properties.setSelected(7);
        					c.repaint();
        					if((i-21)!=0&&(i-21)!=15&&(i-21)!=23&&(i-21)!=31&&(i-21)!=39&&(i-21)!=47&&(i-21)!=55&&(i-21)!=63&&(i-21)!=1&&(i-21)!=2&&(i-21)!=3&&(i-21)!=4&&(i-21)!=5&&(i-21)!=6&&(i-21)!=7){
            					if(al.get(i-28).getAvailability()==0){
        						al.get(i-28).setOption(true);
            					Properties.setSelected(7);
            					c.repaint();
            					if((i-28)!=0&&(i-28)!=15&&(i-28)!=23&&(i-28)!=31&&(i-28)!=39&&(i-28)!=47&&(i-28)!=55&&(i-28)!=63&&(i-28)!=1&&(i-28)!=2&&(i-28)!=3&&(i-28)!=4&&(i-28)!=5&&(i-28)!=6&&(i-28)!=7){
                					if(al.get(i-35).getAvailability()==0){
            						al.get(i-35).setOption(true);
                					Properties.setSelected(7);
                					c.repaint();
                					if((i-35)!=0&&(i-35)!=15&&(i-35)!=23&&(i-35)!=31&&(i-35)!=39&&(i-35)!=47&&(i-35)!=55&&(i-35)!=63&&(i-35)!=1&&(i-35)!=2&&(i-35)!=3&&(i-35)!=4&&(i-35)!=5&&(i-35)!=6&&(i-35)!=7){
                    					if(al.get(i-42).getAvailability()==0){
                						al.get(i-42).setOption(true);
                    					Properties.setSelected(7);
                    					c.repaint();
                    					if((i-42)!=0&&(i-42)!=15&&(i-42)!=23&&(i-42)!=31&&(i-42)!=39&&(i-42)!=47&&(i-42)!=55&&(i-42)!=63&&(i-42)!=1&&(i-42)!=2&&(i-42)!=3&&(i-42)!=4&&(i-42)!=5&&(i-42)!=6&&(i-42)!=7){
                        					if(al.get(i-49).getAvailability()==0){
                    						al.get(i-49).setOption(true);
                        					Properties.setSelected(7);
                        					c.repaint();
                        					}else if((i-42)!=0&&(i-42)!=15&&(i-42)!=23&&(i-42)!=31&&(i-42)!=39&&(i-42)!=47&&(i-42)!=55&&(i-42)!=63&&(i-42)!=1&&(i-42)!=2&&(i-42)!=3&&(i-42)!=4&&(i-42)!=5&&(i-42)!=6&&(i-42)!=7){
                        					if(al.get(i-49).getAvailability()==2){
                        					al.get(i-49).setOption(true);
                        					Properties.setSelected(7);
                        					c.repaint();}}}    //edw isws problhma
                    					}else if((i-35)!=0&&(i-35)!=15&&(i-35)!=23&&(i-35)!=31&&(i-35)!=39&&(i-35)!=47&&(i-35)!=55&&(i-35)!=63&&(i-35)!=1&&(i-35)!=2&&(i-35)!=3&&(i-35)!=4&&(i-35)!=5&&(i-35)!=6&&(i-35)!=7){
                        					if(al.get(i-42).getAvailability()==2){
                    						al.get(i-42).setOption(true);
                        					Properties.setSelected(7);
                        					c.repaint();}}}
                					}else if((i-28)!=0&&(i-28)!=15&&(i-28)!=23&&(i-28)!=31&&(i-28)!=39&&(i-28)!=47&&(i-28)!=55&&(i-28)!=63&&(i-28)!=1&&(i-28)!=2&&(i-28)!=3&&(i-28)!=4&&(i-28)!=5&&(i-28)!=6&&(i-28)!=7){
                    					if(al.get(i-35).getAvailability()==2){
                						al.get(i-35).setOption(true);
                    					Properties.setSelected(7);
                    					c.repaint();}}}
            					}else if((i-21)!=0&&(i-21)!=15&&(i-21)!=23&&(i-21)!=31&&(i-21)!=39&&(i-21)!=47&&(i-21)!=55&&(i-21)!=63&&(i-21)!=1&&(i-21)!=2&&(i-21)!=3&&(i-21)!=4&&(i-21)!=5&&(i-21)!=6&&(i-21)!=7){
                					if(al.get(i-28).getAvailability()==2){
            						al.get(i-28).setOption(true);
                					Properties.setSelected(7);
                					c.repaint();}}}
        					}else if((i-14)!=0&&(i-14)!=15&&(i-14)!=23&&(i-14)!=31&&(i-14)!=39&&(i-14)!=47&&(i-14)!=55&&(i-14)!=63&&(i-14)!=1&&(i-14)!=2&&(i-14)!=3&&(i-14)!=4&&(i-14)!=5&&(i-14)!=6&&(i-14)!=7){
            					if(al.get(i-21).getAvailability()==2){
        						al.get(i-21).setOption(true);
            					Properties.setSelected(7);
            					c.repaint();}}}
    				}else if((i-7)!=0&&(i-7)!=15&&(i-7)!=23&&(i-7)!=31&&(i-7)!=39&&(i-7)!=47&&(i-7)!=55&&(i-7)!=63&&(i-7)!=1&&(i-7)!=2&&(i-7)!=3&&(i-7)!=4&&(i-7)!=5&&(i-7)!=6&&(i-7)!=7){
        					if(al.get(i-14).getAvailability()==2){
    						al.get(i-14).setOption(true);
        					Properties.setSelected(7);
        					c.repaint();}}}
					}else if((i)!=0&&(i)!=15&&(i)!=23&&(i)!=31&&(i)!=39&&(i)!=47&&(i)!=55&&(i)!=63&&(i)!=1&&(i)!=2&&(i)!=3&&(i)!=4&&(i)!=5&&(i)!=6&&(i)!=7){
    					if(al.get(i-7).getAvailability()==2){
						al.get(i-7).setOption(true);
    					Properties.setSelected(7);
    					c.repaint();}}}
				if((i)!=0&&(i)!=8&&(i)!=16&&(i)!=24&&(i)!=32&&(i)!=40&&(i)!=48&&(i)!=56&&(i)!=57&&(i)!=58&&(i)!=59&&(i)!=60&&(i)!=61&&(i)!=62&&(i)!=63){
					if(al.get(i+7).getAvailability()==0){
					al.get(i+7).setOption(true);
					Properties.setSelected(7);
					c.repaint();
					if((i+7)!=0&&(i+7)!=8&&(i+7)!=16&&(i+7)!=24&&(i+7)!=32&&(i+7)!=40&&(i+7)!=48&&(i+7)!=56&&(i+7)!=57&&(i+7)!=58&&(i+7)!=59&&(i+7)!=60&&(i+7)!=61&&(i+7)!=62&&(i+7)!=63){
    					if(al.get(i+14).getAvailability()==0){
						al.get(i+14).setOption(true);
    					Properties.setSelected(7);
    					c.repaint();
    					if((i+14)!=0&&(i+14)!=8&&(i+14)!=16&&(i+14)!=24&&(i+14)!=32&&(i+14)!=40&&(i+14)!=48&&(i+14)!=56&&(i+14)!=57&&(i+14)!=58&&(i+14)!=59&&(i+14)!=60&&(i+14)!=61&&(i+14)!=62&&(i+14)!=63){
        					if(al.get(i+21).getAvailability()==0){
    						al.get(i+21).setOption(true);
        					Properties.setSelected(7);
        					c.repaint();
        					if((i+21)!=0&&(i+21)!=8&&(i+21)!=16&&(i+21)!=24&&(i+21)!=32&&(i+21)!=40&&(i+21)!=48&&(i+21)!=56&&(i+21)!=57&&(i+21)!=58&&(i+21)!=59&&(i+21)!=60&&(i+21)!=61&&(i+21)!=62&&(i+21)!=63){
            					if(al.get(i+28).getAvailability()==0){
        						al.get(i+28).setOption(true);
            					Properties.setSelected(7);
            					c.repaint();
            					if((i+28)!=0&&(i+28)!=8&&(i+28)!=16&&(i+28)!=24&&(i+28)!=32&&(i+28)!=40&&(i+28)!=48&&(i+28)!=56&&(i+28)!=57&&(i+28)!=58&&(i+28)!=59&&(i+28)!=60&&(i+28)!=61&&(i+28)!=62&&(i+28)!=63){
                					if(al.get(i+35).getAvailability()==0){
            						al.get(i+35).setOption(true);
                					Properties.setSelected(7);
                					c.repaint();
                					if((i+35)!=0&&(i+35)!=8&&(i+35)!=16&&(i+35)!=24&&(i+35)!=32&&(i+35)!=40&&(i+35)!=48&&(i+35)!=56&&(i+35)!=57&&(i+35)!=58&&(i+35)!=59&&(i+35)!=60&&(i+35)!=61&&(i+35)!=62&&(i+35)!=63){
                    					if(al.get(i+42).getAvailability()==0){
                						al.get(i+42).setOption(true);
                    					Properties.setSelected(7);
                    					c.repaint();
                    					if((i+42)!=0&&(i+42)!=8&&(i+42)!=16&&(i+42)!=24&&(i+42)!=32&&(i+42)!=40&&(i+42)!=48&&(i+42)!=56&&(i+42)!=57&&(i+42)!=58&&(i+42)!=59&&(i+42)!=60&&(i+42)!=61&&(i+42)!=62&&(i+42)!=63){
                        					if(al.get(i+49).getAvailability()==0){
                    						al.get(i+49).setOption(true);
                        					Properties.setSelected(7);
                        					c.repaint();
                    						}else if((i+42)!=0&&(i+42)!=8&&(i+42)!=16&&(i+42)!=24&&(i+42)!=32&&(i+42)!=40&&(i+42)!=48&&(i+42)!=56&&(i+42)!=57&&(i+42)!=58&&(i+42)!=59&&(i+42)!=60&&(i+42)!=61&&(i+42)!=62&&(i+42)!=63){
                            					if(al.get(i+49).getAvailability()==2){
                    							al.get(i+49).setOption(true);
                            					Properties.setSelected(7);
                            					c.repaint();}}}
                    					}else if((i+35)!=0&&(i+35)!=8&&(i+35)!=16&&(i+35)!=24&&(i+35)!=32&&(i+35)!=40&&(i+35)!=48&&(i+35)!=56&&(i+35)!=57&&(i+35)!=58&&(i+35)!=59&&(i+35)!=60&&(i+35)!=61&&(i+35)!=62&&(i+35)!=63){
                        					if(al.get(i+42).getAvailability()==2){
                    						al.get(i+42).setOption(true);
                        					Properties.setSelected(7);
                        					c.repaint();}}}
                					}else if((i+28)!=0&&(i+28)!=8&&(i+28)!=16&&(i+28)!=24&&(i+28)!=32&&(i+28)!=40&&(i+28)!=48&&(i+28)!=56&&(i+28)!=57&&(i+28)!=58&&(i+28)!=59&&(i+28)!=60&&(i+28)!=61&&(i+28)!=62&&(i+28)!=63){
                    					if(al.get(i+35).getAvailability()==2){
                						al.get(i+35).setOption(true);
                    					Properties.setSelected(7);
                    					c.repaint();}}}
            					}else if((i+21)!=0&&(i+21)!=8&&(i+21)!=16&&(i+21)!=24&&(i+21)!=32&&(i+21)!=40&&(i+21)!=48&&(i+21)!=56&&(i+21)!=57&&(i+21)!=58&&(i+21)!=59&&(i+21)!=60&&(i+21)!=61&&(i+21)!=62&&(i+21)!=63){
                					if(al.get(i+28).getAvailability()==2){
            						al.get(i+28).setOption(true);
                					Properties.setSelected(7);
                					c.repaint();}}}
        					}else if((i+14)!=0&&(i+14)!=8&&(i+14)!=16&&(i+14)!=24&&(i+14)!=32&&(i+14)!=40&&(i+14)!=48&&(i+14)!=56&&(i+14)!=57&&(i+14)!=58&&(i+14)!=59&&(i+14)!=60&&(i+14)!=61&&(i+14)!=62&&(i+14)!=63){
            					if(al.get(i+21).getAvailability()==2){
        						al.get(i+21).setOption(true);
            					Properties.setSelected(7);
            					c.repaint();}}}
    					}else if((i+7)!=0&&(i+7)!=8&&(i+7)!=16&&(i+7)!=24&&(i+7)!=32&&(i+7)!=40&&(i+7)!=48&&(i+7)!=56&&(i+7)!=57&&(i+7)!=58&&(i+7)!=59&&(i+7)!=60&&(i+7)!=61&&(i+7)!=62&&(i+7)!=63){
        					if(al.get(i+14).getAvailability()==2){
    						al.get(i+14).setOption(true);
        					Properties.setSelected(7);
        					c.repaint();}}}
					}else if((i)!=0&&(i)!=8&&(i)!=16&&(i)!=24&&(i)!=32&&(i)!=40&&(i)!=48&&(i)!=56&&(i)!=57&&(i)!=58&&(i)!=59&&(i)!=60&&(i)!=61&&(i)!=62&&(i)!=63){
    					if(al.get(i+7).getAvailability()==2){
						al.get(i+7).setOption(true);
    					Properties.setSelected(7);
    					c.repaint();}}}
				
				
				if((i)!=7&&(i)!=15&&(i)!=23&&(i)!=31&&(i)!=39&&(i)!=47&&(i)!=55&&(i)!=56&&(i)!=57&&(i)!=58&&(i)!=59&&(i)!=60&&(i)!=61&&(i)!=62&&(i)!=63){
					if(al.get(i+9).getAvailability()==0){
					al.get(i+9).setOption(true);
					Properties.setSelected(7);
					c.repaint();
					if((i+9)!=7&&(i+9)!=15&&(i+9)!=23&&(i+9)!=31&&(i+9)!=39&&(i+9)!=47&&(i+9)!=55&&(i+9)!=56&&(i+9)!=57&&(i+9)!=58&&(i+9)!=59&&(i+9)!=60&&(i+9)!=61&&(i+9)!=62&&(i+9)!=63){
    					if(al.get(i+18).getAvailability()==0){
						al.get(i+18).setOption(true);
    					Properties.setSelected(7);
    					c.repaint();
						if((i+18)!=7&&(i+18)!=15&&(i+18)!=23&&(i+18)!=31&&(i+18)!=39&&(i+18)!=47&&(i+18)!=55&&(i+18)!=56&&(i+18)!=57&&(i+18)!=58&&(i+18)!=59&&(i+18)!=60&&(i+18)!=61&&(i+18)!=62&&(i+18)!=63){
							if(al.get(i+27).getAvailability()==0){
							al.get(i+27).setOption(true);
							Properties.setSelected(7);
							c.repaint();
							if((i+27)!=7&&(i+27)!=15&&(i+27)!=23&&(i+27)!=31&&(i+27)!=39&&(i+27)!=47&&(i+27)!=55&&(i+27)!=56&&(i+27)!=57&&(i+27)!=58&&(i+27)!=59&&(i+27)!=60&&(i+27)!=61&&(i+27)!=62&&(i+27)!=63){
	        					if(al.get(i+36).getAvailability()==0){
								al.get(i+36).setOption(true);
	        					Properties.setSelected(7);
	        					c.repaint();
	        					if((i+36)!=7&&(i+36)!=15&&(i+36)!=23&&(i+36)!=31&&(i+36)!=39&&(i+36)!=47&&(i+36)!=55&&(i+36)!=56&&(i+36)!=57&&(i+36)!=58&&(i+36)!=59&&(i+36)!=60&&(i+36)!=61&&(i+36)!=62&&(i+36)!=63){
	            					if(al.get(i+45).getAvailability()==0){
	        						al.get(i+45).setOption(true);
	            					Properties.setSelected(7);
	            					c.repaint();
	            					if((i+45)!=7&&(i+45)!=15&&(i+45)!=23&&(i+45)!=31&&(i+45)!=39&&(i+45)!=47&&(i+45)!=55&&(i+45)!=56&&(i+45)!=57&&(i+45)!=58&&(i+45)!=59&&(i+45)!=60&&(i+45)!=61&&(i+45)!=62&&(i+45)!=63){
	                					if(al.get(i+54).getAvailability()==0){
	            						al.get(i+54).setOption(true);
	                					Properties.setSelected(7);
	                					c.repaint();
	                					if((i+54)!=7&&(i+54)!=15&&(i+54)!=23&&(i+54)!=31&&(i+54)!=39&&(i+54)!=47&&(i+54)!=55&&(i+54)!=56&&(i+54)!=57&&(i+54)!=58&&(i+54)!=59&&(i+54)!=60&&(i+54)!=61&&(i+54)!=62&&(i+54)!=63){
	                    					if(al.get(i+63).getAvailability()==0){
	                						al.get(i+63).setOption(true);
	                    					Properties.setSelected(7);
	                    					c.repaint();
	                    				}else if((i+54)!=7&&(i+54)!=15&&(i+54)!=23&&(i+54)!=31&&(i+54)!=39&&(i+54)!=47&&(i+54)!=55&&(i+54)!=56&&(i+54)!=57&&(i+54)!=58&&(i+54)!=59&&(i+54)!=60&&(i+54)!=61&&(i+54)!=62&&(i+54)!=63){
    	                    				if(al.get(i+63).getAvailability()==2){	
	                						al.get(i+63).setOption(true);
    	                    					Properties.setSelected(7);
    	                    					c.repaint();}}}
	                					}else if((i+45)!=7&&(i+45)!=15&&(i+45)!=23&&(i+45)!=31&&(i+45)!=39&&(i+45)!=47&&(i+45)!=55&&(i+45)!=56&&(i+45)!=57&&(i+45)!=58&&(i+45)!=59&&(i+45)!=60&&(i+45)!=61&&(i+45)!=62&&(i+45)!=63){
    	                					if(al.get(i+54).getAvailability()==2){
	                						al.get(i+54).setOption(true);
    	                					Properties.setSelected(7);
    	                					c.repaint();}}}
	            					}else if((i+36)!=7&&(i+36)!=15&&(i+36)!=23&&(i+36)!=31&&(i+36)!=39&&(i+36)!=47&&(i+36)!=55&&(i+36)!=56&&(i+36)!=57&&(i+36)!=58&&(i+36)!=59&&(i+36)!=60&&(i+36)!=61&&(i+36)!=62&&(i+36)!=63){
    	            					if(al.get(i+45).getAvailability()==2){
	            						al.get(i+45).setOption(true);
    	            					Properties.setSelected(7);
    	            					c.repaint();}}}
	        					}else if((i+27)!=7&&(i+27)!=15&&(i+27)!=23&&(i+27)!=31&&(i+27)!=39&&(i+27)!=47&&(i+27)!=55&&(i+27)!=56&&(i+27)!=57&&(i+27)!=58&&(i+27)!=59&&(i+27)!=60&&(i+27)!=61&&(i+27)!=62&&(i+27)!=63){
    	        					if(al.get(i+36).getAvailability()==2){
	        						al.get(i+36).setOption(true);
    	        					Properties.setSelected(7);
    	        					c.repaint();}}}
							}else if((i+18)!=7&&(i+18)!=15&&(i+18)!=23&&(i+18)!=31&&(i+18)!=39&&(i+18)!=47&&(i+18)!=55&&(i+18)!=56&&(i+18)!=57&&(i+18)!=58&&(i+18)!=59&&(i+18)!=60&&(i+18)!=61&&(i+18)!=62&&(i+18)!=63){
								if(al.get(i+27).getAvailability()==2){
								al.get(i+27).setOption(true);
    							Properties.setSelected(7);
    							c.repaint();}}}
						}else if((i+9)!=7&&(i+9)!=15&&(i+9)!=23&&(i+9)!=31&&(i+9)!=39&&(i+9)!=47&&(i+9)!=55&&(i+9)!=56&&(i+9)!=57&&(i+9)!=58&&(i+9)!=59&&(i+9)!=60&&(i+9)!=61&&(i+9)!=62&&(i+9)!=63){
	        				if(al.get(i+18).getAvailability()==2){	
							al.get(i+18).setOption(true);
	        					Properties.setSelected(7);
	        					c.repaint();}}}
						}	else if((i)!=7&&(i)!=15&&(i)!=23&&(i)!=31&&(i)!=39&&(i)!=47&&(i)!=55&&(i)!=56&&(i)!=57&&(i)!=58&&(i)!=59&&(i)!=60&&(i)!=61&&(i)!=62&&(i)!=63){
	    					if(al.get(i+9).getAvailability()==2){
							al.get(i+9).setOption(true);
	    					Properties.setSelected(7);
	    					c.repaint();}}}
    		
    		}
    		if(al.get(i).getWhichPawn()==5&&al.get(i).getAvailability()==1&&Properties.getWhoseTurn()==true&&al.get(i).getOption()==false){
    			for(int k=0; k<64; k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    				c.repaint();
    			}
    			location=i;
    			Properties.setSelected(9);
    			if(i!=0&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7){
    				if(al.get(i-8).getAvailability()==0||al.get(i-8).getAvailability()==2){
    					al.get(i-8).setOption(true);
    					
    					c.repaint();
    				}
    		}
    			if(i!=56&&i!=57&&i!=58&&i!=59&&i!=60&&i!=61&&i!=62&&i!=63){
    				if(al.get(i+8).getAvailability()==0||al.get(i+8).getAvailability()==2){
    					al.get(i+8).setOption(true);
    					
    					c.repaint();
    				}
    			}
    			if(i!=0&&i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56){
    				if(al.get(i-1).getAvailability()==0||al.get(i-1).getAvailability()==2){
    					al.get(i-1).setOption(true);
    					
    					c.repaint();
    				}
    			}
    			if(i!=7&&i!=15&&i!=23&&i!=31&&i!=39&&i!=47&&i!=55&&i!=63){
    				if(al.get(i+1).getAvailability()==0||al.get(i+1).getAvailability()==2){
    					al.get(i+1).setOption(true);
    					
    					c.repaint();
    				}
    			}
    			if(i!=0&&i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7){
					if(al.get(i-9).getAvailability()==0||al.get(i-9).getAvailability()==2){
					al.get(i-9).setOption(true);
					
					c.repaint();
					}
    			}
    			if((i)!=7&&(i)!=15&&(i)!=23&&(i)!=31&&(i)!=39&&(i)!=47&&(i)!=55&&(i)!=56&&(i)!=57&&(i)!=58&&(i)!=59&&(i)!=60&&(i)!=61&&(i)!=62&&(i)!=63){
					if(al.get(i+9).getAvailability()==0||al.get(i+9).getAvailability()==2){
					al.get(i+9).setOption(true);
					
					c.repaint();
					}
    			}
    			if((i)!=0&&(i)!=8&&(i)!=16&&(i)!=24&&(i)!=32&&(i)!=40&&(i)!=48&&(i)!=56&&(i)!=57&&(i)!=58&&(i)!=59&&(i)!=60&&(i)!=61&&(i)!=62&&(i)!=63){
					if(al.get(i+7).getAvailability()==0||al.get(i+7).getAvailability()==2){
					al.get(i+7).setOption(true);
				
					c.repaint();
					}
    			}
    			if((i)!=0&&(i)!=15&&(i)!=23&&(i)!=31&&(i)!=39&&(i)!=47&&(i)!=55&&(i)!=63&&(i)!=1&&(i)!=2&&(i)!=3&&(i)!=4&&(i)!=5&&(i)!=6&&(i)!=7){
					if(al.get(i-7).getAvailability()==0||al.get(i-7).getAvailability()==2){
					al.get(i-7).setOption(true);
					
					c.repaint();
					}
    			}
    	}
    		//lets make dark stuff :). Dark bishop
    		if(al.get(i).getWhichPawn()==3&&al.get(i).getAvailability()==2&&Properties.getWhoseTurn()==false&&al.get(i).getOption()==false){
    			for(int k=0; k<64; k++){
    				al.get(k).setOption(false);
    				Properties.setSelected(0);
    				c.repaint();
    			}
    			Properties.setdLocation(i);
    			Properties.setSelected(6);
    				if(i!=0&&i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7){
    					if(al.get(i-9).getAvailability()==0){
    					al.get(i-9).setOption(true);
    					
    					c.repaint();
    					if((i-9)!=0&&(i-9)!=8&&(i-9)!=16&&(i-9)!=24&&(i-9)!=32&&(i-9)!=40&&(i-9)!=48&&(i-9)!=56&&(i-9)!=1&&(i-9)!=2&&(i-9)!=3&&(i-9)!=4&&(i-9)!=5&&(i-9)!=6&&(i-9)!=7){
        					if(al.get(i-18).getAvailability()==0){
    						al.get(i-18).setOption(true);
        					
        					c.repaint();
        					if((i-18)!=0&&(i-18)!=8&&(i-18)!=16&&(i-18)!=24&&(i-18)!=32&&(i-18)!=40&&(i-18)!=48&&(i-18)!=56&&(i-18)!=1&&(i-18)!=2&&(i-18)!=3&&(i-18)!=4&&(i-18)!=5&&(i-18)!=6&&(i-18)!=7){
            					if(al.get(i-27).getAvailability()==0){
        						al.get(i-27).setOption(true);
            					
            					c.repaint();
            					if((i-27)!=0&&(i-27)!=8&&(i-27)!=16&&(i-27)!=24&&(i-27)!=32&&(i-27)!=40&&(i-27)!=48&&(i-27)!=56&&(i-27)!=1&&(i-27)!=2&&(i-27)!=3&&(i-27)!=4&&(i-27)!=5&&(i-27)!=6&&(i-27)!=7){
                					if(al.get(i-36).getAvailability()==0){
            						al.get(i-36).setOption(true);
                				
                					c.repaint();
                					if((i-36)!=0&&(i-36)!=8&&(i-36)!=16&&(i-36)!=24&&(i-36)!=32&&(i-36)!=40&&(i-36)!=48&&(i-36)!=56&&(i-36)!=1&&(i-36)!=2&&(i-36)!=3&&(i-36)!=4&&(i-36)!=5&&(i-36)!=6&&(i-36)!=7){
                    					if(al.get(i-45).getAvailability()==0){
                						al.get(i-45).setOption(true);
                    					
                    					c.repaint();
                    					if((i-45)!=0&&(i-45)!=8&&(i-45)!=16&&(i-45)!=24&&(i-45)!=32&&(i-45)!=40&&(i-45)!=48&&(i-45)!=56&&(i-45)!=1&&(i-45)!=2&&(i-45)!=3&&(i-45)!=4&&(i-45)!=5&&(i-45)!=6&&(i-45)!=7){
                        					if(al.get(i-54).getAvailability()==0){
                    						al.get(i-54).setOption(true);
                        					
                        					c.repaint();
                        					if((i-54)!=0&&(i-54)!=8&&(i-54)!=16&&(i-54)!=24&&(i-54)!=32&&(i-54)!=40&&(i-54)!=48&&(i-54)!=56&&(i-54)!=1&&(i-54)!=2&&(i-54)!=3&&(i-54)!=4&&(i-54)!=5&&(i-54)!=6&&(i-54)!=7){
                            					if(al.get(i-63).getAvailability()==0){
                        						al.get(i-63).setOption(true);
                            					
                            					c.repaint();
                            					
                            					}else if((i-54)!=0&&(i-54)!=8&&(i-54)!=16&&(i-54)!=24&&(i-54)!=32&&(i-54)!=40&&(i-54)!=48&&(i-54)!=56&&(i-54)!=1&&(i-54)!=2&&(i-54)!=3&&(i-54)!=4&&(i-54)!=5&&(i-54)!=6&&(i-54)!=7){
                        						if(al.get(i-63).getAvailability()==1){
                        						al.get(i-63).setOption(true);
                        						
                        						c.repaint();}
                            				}
                        					}
                        					}else if((i-45)!=0&&(i-45)!=8&&(i-45)!=16&&(i-45)!=24&&(i-45)!=32&&(i-45)!=40&&(i-45)!=48&&(i-45)!=56&&(i-45)!=1&&(i-45)!=2&&(i-45)!=3&&(i-45)!=4&&(i-45)!=5&&(i-45)!=6&&(i-45)!=7){
                        						if(al.get(i-54).getAvailability()==1){
                        						al.get(i-54).setOption(true);
                        						
                        						c.repaint();}
                            				}
                    					}
                    					}else if((i-36)!=0&&(i-36)!=8&&(i-36)!=16&&(i-36)!=24&&(i-36)!=32&&(i-36)!=40&&(i-36)!=48&&(i-36)!=56&&(i-36)!=1&&(i-36)!=2&&(i-36)!=3&&(i-36)!=4&&(i-36)!=5&&(i-36)!=6&&(i-36)!=7){
                    						if(al.get(i-45).getAvailability()==1){
                    						al.get(i-45).setOption(true);
                    						
                    						c.repaint();}
                        				}
                					}
                					}else if((i-27)!=0&&(i-27)!=8&&(i-27)!=16&&(i-27)!=24&&(i-27)!=32&&(i-27)!=40&&(i-27)!=48&&(i-27)!=56&&(i-27)!=1&&(i-27)!=2&&(i-27)!=3&&(i-27)!=4&&(i-27)!=5&&(i-27)!=6&&(i-27)!=7){
            						if(al.get(i-36).getAvailability()==1){
            						al.get(i-36).setOption(true);
            						
            						c.repaint();}
                				}
            					}
            					}else if((i-18)!=0&&(i-18)!=8&&(i-18)!=16&&(i-18)!=24&&(i-18)!=32&&(i-18)!=40&&(i-18)!=48&&(i-18)!=56&&(i-18)!=1&&(i-18)!=2&&(i-18)!=3&&(i-18)!=4&&(i-18)!=5&&(i-18)!=6&&(i-18)!=7){
        						if(al.get(i-27).getAvailability()==1){
        						al.get(i-27).setOption(true);
        						
        						c.repaint();}
            				}
        					}
        				
    				}else if((i-9)!=0&&(i-9)!=8&&(i-9)!=16&&(i-9)!=24&&(i-9)!=32&&(i-9)!=40&&(i-9)!=48&&(i-9)!=56&&(i-9)!=1&&(i-9)!=2&&(i-9)!=3&&(i-9)!=4&&(i-9)!=5&&(i-9)!=6&&(i-9)!=7){
						if(al.get(i-18).getAvailability()==1){
    					al.get(i-18).setOption(true);
						
						c.repaint();}
    					}
    				}
    					
    					}else if(i!=0&&i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7){
						if(al.get(i-9).getAvailability()==1){
    					al.get(i-9).setOption(true);
						
						c.repaint();}
    						
    				}
    				
    			}
    				if((i)!=0&&(i)!=15&&(i)!=23&&(i)!=31&&(i)!=39&&(i)!=47&&(i)!=55&&(i)!=63&&(i)!=1&&(i)!=2&&(i)!=3&&(i)!=4&&(i)!=5&&(i)!=6&&(i)!=7){
    					if(al.get(i-7).getAvailability()==0){
    					al.get(i-7).setOption(true);
    					
    					c.repaint();
    					if((i-7)!=0&&(i-7)!=15&&(i-7)!=23&&(i-7)!=31&&(i-7)!=39&&(i-7)!=47&&(i-7)!=55&&(i-7)!=63&&(i-7)!=1&&(i-7)!=2&&(i-7)!=3&&(i-7)!=4&&(i-7)!=5&&(i-7)!=6&&(i-7)!=7){
        				if(al.get(i-14).getAvailability()==0){
    						al.get(i-14).setOption(true);
        					
        					c.repaint();
        					if((i-14)!=0&&(i-14)!=15&&(i-14)!=23&&(i-14)!=31&&(i-14)!=39&&(i-14)!=47&&(i-14)!=55&&(i-14)!=63&&(i-14)!=1&&(i-14)!=2&&(i-14)!=3&&(i-14)!=4&&(i-14)!=5&&(i-14)!=6&&(i-14)!=7){
            					if(al.get(i-21).getAvailability()==0){
        						al.get(i-21).setOption(true);
            					
            					c.repaint();
            					if((i-21)!=0&&(i-21)!=15&&(i-21)!=23&&(i-21)!=31&&(i-21)!=39&&(i-21)!=47&&(i-21)!=55&&(i-21)!=63&&(i-21)!=1&&(i-21)!=2&&(i-21)!=3&&(i-21)!=4&&(i-21)!=5&&(i-21)!=6&&(i-21)!=7){
                					if(al.get(i-28).getAvailability()==0){
            						al.get(i-28).setOption(true);
                					
                					c.repaint();
                					if((i-28)!=0&&(i-28)!=15&&(i-28)!=23&&(i-28)!=31&&(i-28)!=39&&(i-28)!=47&&(i-28)!=55&&(i-28)!=63&&(i-28)!=1&&(i-28)!=2&&(i-28)!=3&&(i-28)!=4&&(i-28)!=5&&(i-28)!=6&&(i-28)!=7){
                    					if(al.get(i-35).getAvailability()==0){
                						al.get(i-35).setOption(true);
                    					
                    					c.repaint();
                    					if((i-35)!=0&&(i-35)!=15&&(i-35)!=23&&(i-35)!=31&&(i-35)!=39&&(i-35)!=47&&(i-35)!=55&&(i-35)!=63&&(i-35)!=1&&(i-35)!=2&&(i-35)!=3&&(i-35)!=4&&(i-35)!=5&&(i-35)!=6&&(i-35)!=7){
                        					if(al.get(i-42).getAvailability()==0){
                    						al.get(i-42).setOption(true);
                        					
                        					c.repaint();
                        					if((i-42)!=0&&(i-42)!=15&&(i-42)!=23&&(i-42)!=31&&(i-42)!=39&&(i-42)!=47&&(i-42)!=55&&(i-42)!=63&&(i-42)!=1&&(i-42)!=2&&(i-42)!=3&&(i-42)!=4&&(i-42)!=5&&(i-42)!=6&&(i-42)!=7){
                            					if(al.get(i-49).getAvailability()==0){
                        						al.get(i-49).setOption(true);
                            					
                            					c.repaint();
                            					}else if((i-42)!=0&&(i-42)!=15&&(i-42)!=23&&(i-42)!=31&&(i-42)!=39&&(i-42)!=47&&(i-42)!=55&&(i-42)!=63&&(i-42)!=1&&(i-42)!=2&&(i-42)!=3&&(i-42)!=4&&(i-42)!=5&&(i-42)!=6&&(i-42)!=7){
                            					if(al.get(i-49).getAvailability()==1){
                            					al.get(i-49).setOption(true);
                            					
                            					c.repaint();}}}    //edw isws problhma
                        					}else if((i-35)!=0&&(i-35)!=15&&(i-35)!=23&&(i-35)!=31&&(i-35)!=39&&(i-35)!=47&&(i-35)!=55&&(i-35)!=63&&(i-35)!=1&&(i-35)!=2&&(i-35)!=3&&(i-35)!=4&&(i-35)!=5&&(i-35)!=6&&(i-35)!=7){
                            					if(al.get(i-42).getAvailability()==1){
                        						al.get(i-42).setOption(true);
                            					
                            					c.repaint();}}}
                    					}else if((i-28)!=0&&(i-28)!=15&&(i-28)!=23&&(i-28)!=31&&(i-28)!=39&&(i-28)!=47&&(i-28)!=55&&(i-28)!=63&&(i-28)!=1&&(i-28)!=2&&(i-28)!=3&&(i-28)!=4&&(i-28)!=5&&(i-28)!=6&&(i-28)!=7){
                        					if(al.get(i-35).getAvailability()==1){
                    						al.get(i-35).setOption(true);
                        					
                        					c.repaint();}}}
                					}else if((i-21)!=0&&(i-21)!=15&&(i-21)!=23&&(i-21)!=31&&(i-21)!=39&&(i-21)!=47&&(i-21)!=55&&(i-21)!=63&&(i-21)!=1&&(i-21)!=2&&(i-21)!=3&&(i-21)!=4&&(i-21)!=5&&(i-21)!=6&&(i-21)!=7){
                    					if(al.get(i-28).getAvailability()==1){
                						al.get(i-28).setOption(true);
                    					
                    					c.repaint();}}}
            					}else if((i-14)!=0&&(i-14)!=15&&(i-14)!=23&&(i-14)!=31&&(i-14)!=39&&(i-14)!=47&&(i-14)!=55&&(i-14)!=63&&(i-14)!=1&&(i-14)!=2&&(i-14)!=3&&(i-14)!=4&&(i-14)!=5&&(i-14)!=6&&(i-14)!=7){
                					if(al.get(i-21).getAvailability()==1){
            						al.get(i-21).setOption(true);
                					
                					c.repaint();}}}
        				}else if((i-7)!=0&&(i-7)!=15&&(i-7)!=23&&(i-7)!=31&&(i-7)!=39&&(i-7)!=47&&(i-7)!=55&&(i-7)!=63&&(i-7)!=1&&(i-7)!=2&&(i-7)!=3&&(i-7)!=4&&(i-7)!=5&&(i-7)!=6&&(i-7)!=7){
            					if(al.get(i-14).getAvailability()==1){
        						al.get(i-14).setOption(true);
            					
            					c.repaint();}}}
    					}else if((i)!=0&&(i)!=15&&(i)!=23&&(i)!=31&&(i)!=39&&(i)!=47&&(i)!=55&&(i)!=63&&(i)!=1&&(i)!=2&&(i)!=3&&(i)!=4&&(i)!=5&&(i)!=6&&(i)!=7){
        					if(al.get(i-7).getAvailability()==1){
    						al.get(i-7).setOption(true);
        					
        					c.repaint();}}}
    				if((i)!=0&&(i)!=8&&(i)!=16&&(i)!=24&&(i)!=32&&(i)!=40&&(i)!=48&&(i)!=56&&(i)!=57&&(i)!=58&&(i)!=59&&(i)!=60&&(i)!=61&&(i)!=62&&(i)!=63){
    					if(al.get(i+7).getAvailability()==0){
    					al.get(i+7).setOption(true);
    					
    					c.repaint();
    					if((i+7)!=0&&(i+7)!=8&&(i+7)!=16&&(i+7)!=24&&(i+7)!=32&&(i+7)!=40&&(i+7)!=48&&(i+7)!=56&&(i+7)!=57&&(i+7)!=58&&(i+7)!=59&&(i+7)!=60&&(i+7)!=61&&(i+7)!=62&&(i+7)!=63){
        					if(al.get(i+14).getAvailability()==0){
    						al.get(i+14).setOption(true);
        					
        					c.repaint();
        					if((i+14)!=0&&(i+14)!=8&&(i+14)!=16&&(i+14)!=24&&(i+14)!=32&&(i+14)!=40&&(i+14)!=48&&(i+14)!=56&&(i+14)!=57&&(i+14)!=58&&(i+14)!=59&&(i+14)!=60&&(i+14)!=61&&(i+14)!=62&&(i+14)!=63){
            					if(al.get(i+21).getAvailability()==0){
        						al.get(i+21).setOption(true);
            					
            					c.repaint();
            					if((i+21)!=0&&(i+21)!=8&&(i+21)!=16&&(i+21)!=24&&(i+21)!=32&&(i+21)!=40&&(i+21)!=48&&(i+21)!=56&&(i+21)!=57&&(i+21)!=58&&(i+21)!=59&&(i+21)!=60&&(i+21)!=61&&(i+21)!=62&&(i+21)!=63){
                					if(al.get(i+28).getAvailability()==0){
            						al.get(i+28).setOption(true);
                					
                					c.repaint();
                					if((i+28)!=0&&(i+28)!=8&&(i+28)!=16&&(i+28)!=24&&(i+28)!=32&&(i+28)!=40&&(i+28)!=48&&(i+28)!=56&&(i+28)!=57&&(i+28)!=58&&(i+28)!=59&&(i+28)!=60&&(i+28)!=61&&(i+28)!=62&&(i+28)!=63){
                    					if(al.get(i+35).getAvailability()==0){
                						al.get(i+35).setOption(true);
                    					
                    					c.repaint();
                    					if((i+35)!=0&&(i+35)!=8&&(i+35)!=16&&(i+35)!=24&&(i+35)!=32&&(i+35)!=40&&(i+35)!=48&&(i+35)!=56&&(i+35)!=57&&(i+35)!=58&&(i+35)!=59&&(i+35)!=60&&(i+35)!=61&&(i+35)!=62&&(i+35)!=63){
                        					if(al.get(i+42).getAvailability()==0){
                    						al.get(i+42).setOption(true);
                        					
                        					c.repaint();
                        					if((i+42)!=0&&(i+42)!=8&&(i+42)!=16&&(i+42)!=24&&(i+42)!=32&&(i+42)!=40&&(i+42)!=48&&(i+42)!=56&&(i+42)!=57&&(i+42)!=58&&(i+42)!=59&&(i+42)!=60&&(i+42)!=61&&(i+42)!=62&&(i+42)!=63){
                            					if(al.get(i+49).getAvailability()==0){
                        						al.get(i+49).setOption(true);
                            					
                            					c.repaint();
                        						}else if((i+42)!=0&&(i+42)!=8&&(i+42)!=16&&(i+42)!=24&&(i+42)!=32&&(i+42)!=40&&(i+42)!=48&&(i+42)!=56&&(i+42)!=57&&(i+42)!=58&&(i+42)!=59&&(i+42)!=60&&(i+42)!=61&&(i+42)!=62&&(i+42)!=63){
                                					if(al.get(i+49).getAvailability()==1){
                        							al.get(i+49).setOption(true);
                                					
                                					c.repaint();}}}
                        					}else if((i+35)!=0&&(i+35)!=8&&(i+35)!=16&&(i+35)!=24&&(i+35)!=32&&(i+35)!=40&&(i+35)!=48&&(i+35)!=56&&(i+35)!=57&&(i+35)!=58&&(i+35)!=59&&(i+35)!=60&&(i+35)!=61&&(i+35)!=62&&(i+35)!=63){
                            					if(al.get(i+42).getAvailability()==1){
                        						al.get(i+42).setOption(true);
                            					
                            					c.repaint();}}}
                    					}else if((i+28)!=0&&(i+28)!=8&&(i+28)!=16&&(i+28)!=24&&(i+28)!=32&&(i+28)!=40&&(i+28)!=48&&(i+28)!=56&&(i+28)!=57&&(i+28)!=58&&(i+28)!=59&&(i+28)!=60&&(i+28)!=61&&(i+28)!=62&&(i+28)!=63){
                        					if(al.get(i+35).getAvailability()==1){
                    						al.get(i+35).setOption(true);
                        					
                        					c.repaint();}}}
                					}else if((i+21)!=0&&(i+21)!=8&&(i+21)!=16&&(i+21)!=24&&(i+21)!=32&&(i+21)!=40&&(i+21)!=48&&(i+21)!=56&&(i+21)!=57&&(i+21)!=58&&(i+21)!=59&&(i+21)!=60&&(i+21)!=61&&(i+21)!=62&&(i+21)!=63){
                    					if(al.get(i+28).getAvailability()==1){
                						al.get(i+28).setOption(true);
                    					
                    					c.repaint();}}}
            					}else if((i+14)!=0&&(i+14)!=8&&(i+14)!=16&&(i+14)!=24&&(i+14)!=32&&(i+14)!=40&&(i+14)!=48&&(i+14)!=56&&(i+14)!=57&&(i+14)!=58&&(i+14)!=59&&(i+14)!=60&&(i+14)!=61&&(i+14)!=62&&(i+14)!=63){
                					if(al.get(i+21).getAvailability()==1){
            						al.get(i+21).setOption(true);
                					
                					c.repaint();}}}
        					}else if((i+7)!=0&&(i+7)!=8&&(i+7)!=16&&(i+7)!=24&&(i+7)!=32&&(i+7)!=40&&(i+7)!=48&&(i+7)!=56&&(i+7)!=57&&(i+7)!=58&&(i+7)!=59&&(i+7)!=60&&(i+7)!=61&&(i+7)!=62&&(i+7)!=63){
            					if(al.get(i+14).getAvailability()==1){
        						al.get(i+14).setOption(true);
            					
            					c.repaint();}}}
    					}else if((i)!=0&&(i)!=8&&(i)!=16&&(i)!=24&&(i)!=32&&(i)!=40&&(i)!=48&&(i)!=56&&(i)!=57&&(i)!=58&&(i)!=59&&(i)!=60&&(i)!=61&&(i)!=62&&(i)!=63){
        					if(al.get(i+7).getAvailability()==1){
    						al.get(i+7).setOption(true);
        					
        					c.repaint();}}}
    				
    				
    				if((i)!=7&&(i)!=15&&(i)!=23&&(i)!=31&&(i)!=39&&(i)!=47&&(i)!=55&&(i)!=56&&(i)!=57&&(i)!=58&&(i)!=59&&(i)!=60&&(i)!=61&&(i)!=62&&(i)!=63){
    					if(al.get(i+9).getAvailability()==0){
    					al.get(i+9).setOption(true);
    					
    					c.repaint();
    					if((i+9)!=7&&(i+9)!=15&&(i+9)!=23&&(i+9)!=31&&(i+9)!=39&&(i+9)!=47&&(i+9)!=55&&(i+9)!=56&&(i+9)!=57&&(i+9)!=58&&(i+9)!=59&&(i+9)!=60&&(i+9)!=61&&(i+9)!=62&&(i+9)!=63){
        					if(al.get(i+18).getAvailability()==0){
    						al.get(i+18).setOption(true);
        					
        					c.repaint();
    						if((i+18)!=7&&(i+18)!=15&&(i+18)!=23&&(i+18)!=31&&(i+18)!=39&&(i+18)!=47&&(i+18)!=55&&(i+18)!=56&&(i+18)!=57&&(i+18)!=58&&(i+18)!=59&&(i+18)!=60&&(i+18)!=61&&(i+18)!=62&&(i+18)!=63){
    							if(al.get(i+27).getAvailability()==0){
    							al.get(i+27).setOption(true);
    							
    							c.repaint();
    							if((i+27)!=7&&(i+27)!=15&&(i+27)!=23&&(i+27)!=31&&(i+27)!=39&&(i+27)!=47&&(i+27)!=55&&(i+27)!=56&&(i+27)!=57&&(i+27)!=58&&(i+27)!=59&&(i+27)!=60&&(i+27)!=61&&(i+27)!=62&&(i+27)!=63){
    	        					if(al.get(i+36).getAvailability()==0){
    								al.get(i+36).setOption(true);
    	        					
    	        					c.repaint();
    	        					if((i+36)!=7&&(i+36)!=15&&(i+36)!=23&&(i+36)!=31&&(i+36)!=39&&(i+36)!=47&&(i+36)!=55&&(i+36)!=56&&(i+36)!=57&&(i+36)!=58&&(i+36)!=59&&(i+36)!=60&&(i+36)!=61&&(i+36)!=62&&(i+36)!=63){
    	            					if(al.get(i+45).getAvailability()==0){
    	        						al.get(i+45).setOption(true);
    	            					
    	            					c.repaint();
    	            					if((i+45)!=7&&(i+45)!=15&&(i+45)!=23&&(i+45)!=31&&(i+45)!=39&&(i+45)!=47&&(i+45)!=55&&(i+45)!=56&&(i+45)!=57&&(i+45)!=58&&(i+45)!=59&&(i+45)!=60&&(i+45)!=61&&(i+45)!=62&&(i+45)!=63){
    	                					if(al.get(i+54).getAvailability()==0){
    	            						al.get(i+54).setOption(true);
    	                					
    	                					c.repaint();
    	                					if((i+54)!=7&&(i+54)!=15&&(i+54)!=23&&(i+54)!=31&&(i+54)!=39&&(i+54)!=47&&(i+54)!=55&&(i+54)!=56&&(i+54)!=57&&(i+54)!=58&&(i+54)!=59&&(i+54)!=60&&(i+54)!=61&&(i+54)!=62&&(i+54)!=63){
    	                    					if(al.get(i+63).getAvailability()==0){
    	                						al.get(i+63).setOption(true);
    	                    					Properties.setSelected(5);
    	                    					c.repaint();
    	                    				}else if((i+54)!=7&&(i+54)!=15&&(i+54)!=23&&(i+54)!=31&&(i+54)!=39&&(i+54)!=47&&(i+54)!=55&&(i+54)!=56&&(i+54)!=57&&(i+54)!=58&&(i+54)!=59&&(i+54)!=60&&(i+54)!=61&&(i+54)!=62&&(i+54)!=63){
        	                    				if(al.get(i+63).getAvailability()==1){	
    	                						al.get(i+63).setOption(true);
        	                    					
        	                    					c.repaint();}}}
    	                					}else if((i+45)!=7&&(i+45)!=15&&(i+45)!=23&&(i+45)!=31&&(i+45)!=39&&(i+45)!=47&&(i+45)!=55&&(i+45)!=56&&(i+45)!=57&&(i+45)!=58&&(i+45)!=59&&(i+45)!=60&&(i+45)!=61&&(i+45)!=62&&(i+45)!=63){
        	                					if(al.get(i+54).getAvailability()==1){
    	                						al.get(i+54).setOption(true);
        	                					
        	                					c.repaint();}}}
    	            					}else if((i+36)!=7&&(i+36)!=15&&(i+36)!=23&&(i+36)!=31&&(i+36)!=39&&(i+36)!=47&&(i+36)!=55&&(i+36)!=56&&(i+36)!=57&&(i+36)!=58&&(i+36)!=59&&(i+36)!=60&&(i+36)!=61&&(i+36)!=62&&(i+36)!=63){
        	            					if(al.get(i+45).getAvailability()==1){
    	            						al.get(i+45).setOption(true);
        	            					
        	            					c.repaint();}}}
    	        					}else if((i+27)!=7&&(i+27)!=15&&(i+27)!=23&&(i+27)!=31&&(i+27)!=39&&(i+27)!=47&&(i+27)!=55&&(i+27)!=56&&(i+27)!=57&&(i+27)!=58&&(i+27)!=59&&(i+27)!=60&&(i+27)!=61&&(i+27)!=62&&(i+27)!=63){
        	        					if(al.get(i+36).getAvailability()==1){
    	        						al.get(i+36).setOption(true);
        	        					
        	        					c.repaint();}}}
    							}else if((i+18)!=7&&(i+18)!=15&&(i+18)!=23&&(i+18)!=31&&(i+18)!=39&&(i+18)!=47&&(i+18)!=55&&(i+18)!=56&&(i+18)!=57&&(i+18)!=58&&(i+18)!=59&&(i+18)!=60&&(i+18)!=61&&(i+18)!=62&&(i+18)!=63){
    								if(al.get(i+27).getAvailability()==1){
    								al.get(i+27).setOption(true);
        							
        							c.repaint();}}}
    						}else if((i+9)!=7&&(i+9)!=15&&(i+9)!=23&&(i+9)!=31&&(i+9)!=39&&(i+9)!=47&&(i+9)!=55&&(i+9)!=56&&(i+9)!=57&&(i+9)!=58&&(i+9)!=59&&(i+9)!=60&&(i+9)!=61&&(i+9)!=62&&(i+9)!=63){
    	        				if(al.get(i+18).getAvailability()==1){	
    							al.get(i+18).setOption(true);
    	        					
    	        					c.repaint();}}}
    						}	else if((i)!=7&&(i)!=15&&(i)!=23&&(i)!=31&&(i)!=39&&(i)!=47&&(i)!=55&&(i)!=56&&(i)!=57&&(i)!=58&&(i)!=59&&(i)!=60&&(i)!=61&&(i)!=62&&(i)!=63){
    	    					if(al.get(i+9).getAvailability()==1){
    							al.get(i+9).setOption(true);
    	    					
    	    					c.repaint();}}}
    	}
    		//dark rook
    		
    		Properties.darkRook(al, i, g, c);
    		Properties.darkQueen(al, i, g, c);
    		Properties.darkKing(al, i, g, c);
    		Properties.darkKnight(al, i, g, c);
    		
    }
    }
    }
}


