package chess;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Properties {
private static boolean whoseturn;
private int whichpawn ;
private int availability;
private boolean option ;
private static int Selected;
private static int dlocation;
	/*whoseTurn είναι ποιανού είναι η σειρά
	 * whichPawn , τι πιόνι είναι , πχ αλογάκι
	 * availability αν στο κουτάκι υπάρχει μαύρο, άσπρο ή κανένα πιόνι
	 * 
	 * Εδώ είναι λοιπόν οι κωδικοί
	 * Στρατιωτάκι 0			availability: 0 χωρίς πιονι   whoseturn false--μαυρα
	 * Ιππος 2								1 άσπρο πιονι
	 * Αξιωματικος 3						2 Μαυρο πιονι
	 * Βασιλισσα 4
	 * Βασιλιας 5
	 * Πύργος 1
	 * 6 tipota
	 * 
	 * Selected 				3-4 ιππος		5-6 αξιωματικος 7-8 βασιλισσα 9-10 βασιλιας 11-12 pyrgos
	 * 0 τίποτα 
	 * 1-2 ασπρο/μαυρο στρατιωτακι
	 */
	public Properties(boolean Option,int Whichpawn,int Availability){
		option=Option;
		whichpawn=Whichpawn;
		availability=Availability;
		
	}
	public static void setWhoseTurn(boolean k){
		whoseturn=k;
	}
	public static boolean getWhoseTurn(){
		return whoseturn;
	}
	public void setWhichPawn(int Whichpawn){
		whichpawn=Whichpawn;
	}
	public int getWhichPawn(){
		return whichpawn;
	}
	public void setAvailability(int Availability){
		availability=Availability;
	}
	public int getAvailability(){
		return availability;
	}
	public boolean getOption(){
		return option;
	}
	public void setOption(boolean Option){
		option=Option;
	}
	public static int getSelected(){
		return Selected;
	}
	public static void setSelected(int a){
		Selected =a;
		
	}
	public static int getdLocation(){
		return dlocation;
	}
	public static void setdLocation(int a){
		dlocation=a;
	}
	public static void darkRook(ArrayList<Properties> al,int i,Graphics g,JComponent c){
		
		if(al.get(i).getWhichPawn()==1&&al.get(i).getAvailability()==2&&Properties.getWhoseTurn()==false&&al.get(i).getOption()==false){
			for(int k=0; k<64; k++){
				al.get(k).setOption(false);
				Properties.setSelected(0);
				c.repaint();
			}
			dlocation=i;
			System.out.println("Εκτελείται");
			Properties.setSelected(12);
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
	    	    	    	    	    						}else if(al.get(i-56).getAvailability()==1){
	    	    	    	    	    	    					al.get(i-56).setOption(true);
	    	    	    	    	    	    				
	    	    	    	    	    	    					c.repaint();}
	    	    	    	    	    					}
	    	    	    	    						}else if(al.get(i-48).getAvailability()==1){
	    	    	    	    	    					al.get(i-48).setOption(true);
	    	    	    	    	    					
	    	    	    	    	    					c.repaint();}
	    	    	    	    					}
	    	    	    						}else if(al.get(i-40).getAvailability()==1){
	    	    	    	    					al.get(i-40).setOption(true);
	    	    	    	    					
	    	    	    	    					c.repaint();}
	    	    	    					}
	    	    						}else if(al.get(i-32).getAvailability()==1){
	    	    	    					al.get(i-32).setOption(true);
	    	    	    					
	    	    	    					c.repaint();}
	    	    					}
	    						}else if(al.get(i-24).getAvailability()==1){
	    	    					al.get(i-24).setOption(true);
	    	    					
	    	    					c.repaint();}
	    					}
						}else if(al.get(i-16).getAvailability()==1){
	    					al.get(i-16).setOption(true);
	    					
	    					c.repaint();
						}
					}
				}else if(al.get(i-8).getAvailability()==1){
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
	    	    	    	    	    	    				}else if(al.get(i+56).getAvailability()==1){
	    	    	    	    	    	    					al.get(i+56).setOption(true);
	    	    	    	    	    	    					
	    	    	    	    	    	    					c.repaint();}
	    	    	    	    	    					}
	    	    	    	    	    				}else if(al.get(i+48).getAvailability()==1){
	    	    	    	    	    					al.get(i+48).setOption(true);
	    	    	    	    	    					
	    	    	    	    	    					c.repaint();}
	    	    	    	    					}
	    	    	    	    				}else if(al.get(i+40).getAvailability()==1){
	    	    	    	    					al.get(i+40).setOption(true);
	    	    	    	    					
	    	    	    	    					c.repaint();}
	    	    	    					}
	    	    	    				}else if(al.get(i+32).getAvailability()==1){
	    	    	    					al.get(i+32).setOption(true);
	    	    	    					
	    	    	    					c.repaint();}
	    	    					}
	    	    				}else if(al.get(i+24).getAvailability()==1){
	    	    					al.get(i+24).setOption(true);
	    	    				
	    	    					c.repaint();}
	    					}
	    				}else if(al.get(i+16).getAvailability()==1){
	    					al.get(i+16).setOption(true);
	    					
	    					c.repaint();}
					}
				}else if(al.get(i+8).getAvailability()==1){
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
	    	    	    	    	    	    				}else if(al.get(i+7).getAvailability()==1){
	    	    	    	    	    	    					al.get(i+7).setOption(true);
	    	    	    	    	    	    					
	    	    	    	    	    	    					c.repaint();}
	    	    	    	    	    					}
	    	    	    	    	    				}else if(al.get(i+6).getAvailability()==1){
	    	    	    	    	    					al.get(i+6).setOption(true);
	    	    	    	    	    					
	    	    	    	    	    					c.repaint();}
	    	    	    	    					}
	    	    	    	    				}else if(al.get(i+5).getAvailability()==1){
	    	    	    	    					al.get(i+5).setOption(true);
	    	    	    	    					
	    	    	    	    					c.repaint();}
	    	    	    					}
	    	    	    				}else if(al.get(i+4).getAvailability()==1){
	    	    	    					al.get(i+4).setOption(true);
	    	    	    					
	    	    	    					c.repaint();}
	    	    					}
	    	    				}else if(al.get(i+3).getAvailability()==1){
	    	    					al.get(i+3).setOption(true);
	    	    					
	    	    					c.repaint();}
	    					}
	    				}else if(al.get(i+2).getAvailability()==1){
	    					al.get(i+2).setOption(true);
	    					
	    					c.repaint();}
					}
				}else if(al.get(i+1).getAvailability()==1){
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
	    	    	    	    	    	    				}else if(al.get(i-7).getAvailability()==1){
	    	    	    	    	    	    					al.get(i-7).setOption(true);
	    	    	    	    	    	    					
	    	    	    	    	    	    					c.repaint();}
	    	    	    	    	    					}
	    	    	    	    	    				}else if(al.get(i-6).getAvailability()==1){
	    	    	    	    	    					al.get(i-6).setOption(true);
	    	    	    	    	    					
	    	    	    	    	    					c.repaint();}
	    	    	    	    					}
	    	    	    	    				}else if(al.get(i-5).getAvailability()==1){
	    	    	    	    					al.get(i-5).setOption(true);
	    	    	    	    					
	    	    	    	    					c.repaint();}
	    	    	    					}
	    	    	    				}else if(al.get(i-4).getAvailability()==1){
	    	    	    					al.get(i-4).setOption(true);
	    	    	    					
	    	    	    					c.repaint();}
	    	    					}
	    	    				}else if(al.get(i-3).getAvailability()==1){
	    	    					al.get(i-3).setOption(true);
	    	    					
	    	    					c.repaint();}
	    					}
	    				}else if(al.get(i-2).getAvailability()==1){
	    					al.get(i-2).setOption(true);
	    					
	    					c.repaint();}
					}
				}else if(al.get(i-1).getAvailability()==1){
					al.get(i-1).setOption(true);
					
					c.repaint();}
			}
			
			
		}
	}
	public static void darkQueen(ArrayList<Properties> al,int i,Graphics g,JComponent c){
		if(al.get(i).getWhichPawn()==4&&al.get(i).getAvailability()==2&&Properties.getWhoseTurn()==false&&al.get(i).getOption()==false){
			for(int k=0; k<64; k++){
				al.get(k).setOption(false);
				Properties.setSelected(0);
				c.repaint();
			}
			dlocation=i;
			System.out.println("Εκτελείται");
			Properties.setSelected(8);
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
	    	    	    	    	    						}else if(al.get(i-56).getAvailability()==1){
	    	    	    	    	    	    					al.get(i-56).setOption(true);
	    	    	    	    	    	    				
	    	    	    	    	    	    					c.repaint();}
	    	    	    	    	    					}
	    	    	    	    						}else if(al.get(i-48).getAvailability()==1){
	    	    	    	    	    					al.get(i-48).setOption(true);
	    	    	    	    	    					
	    	    	    	    	    					c.repaint();}
	    	    	    	    					}
	    	    	    						}else if(al.get(i-40).getAvailability()==1){
	    	    	    	    					al.get(i-40).setOption(true);
	    	    	    	    					
	    	    	    	    					c.repaint();}
	    	    	    					}
	    	    						}else if(al.get(i-32).getAvailability()==1){
	    	    	    					al.get(i-32).setOption(true);
	    	    	    					
	    	    	    					c.repaint();}
	    	    					}
	    						}else if(al.get(i-24).getAvailability()==1){
	    	    					al.get(i-24).setOption(true);
	    	    					
	    	    					c.repaint();}
	    					}
						}else if(al.get(i-16).getAvailability()==1){
	    					al.get(i-16).setOption(true);
	    					
	    					c.repaint();
						}
					}
				}else if(al.get(i-8).getAvailability()==1){
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
	    	    	    	    	    	    				}else if(al.get(i+56).getAvailability()==1){
	    	    	    	    	    	    					al.get(i+56).setOption(true);
	    	    	    	    	    	    					
	    	    	    	    	    	    					c.repaint();}
	    	    	    	    	    					}
	    	    	    	    	    				}else if(al.get(i+48).getAvailability()==1){
	    	    	    	    	    					al.get(i+48).setOption(true);
	    	    	    	    	    					
	    	    	    	    	    					c.repaint();}
	    	    	    	    					}
	    	    	    	    				}else if(al.get(i+40).getAvailability()==1){
	    	    	    	    					al.get(i+40).setOption(true);
	    	    	    	    					
	    	    	    	    					c.repaint();}
	    	    	    					}
	    	    	    				}else if(al.get(i+32).getAvailability()==1){
	    	    	    					al.get(i+32).setOption(true);
	    	    	    					
	    	    	    					c.repaint();}
	    	    					}
	    	    				}else if(al.get(i+24).getAvailability()==1){
	    	    					al.get(i+24).setOption(true);
	    	    				
	    	    					c.repaint();}
	    					}
	    				}else if(al.get(i+16).getAvailability()==1){
	    					al.get(i+16).setOption(true);
	    					
	    					c.repaint();}
					}
				}else if(al.get(i+8).getAvailability()==1){
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
	    	    	    	    	    	    				}else if(al.get(i+7).getAvailability()==1){
	    	    	    	    	    	    					al.get(i+7).setOption(true);
	    	    	    	    	    	    					
	    	    	    	    	    	    					c.repaint();}
	    	    	    	    	    					}
	    	    	    	    	    				}else if(al.get(i+6).getAvailability()==1){
	    	    	    	    	    					al.get(i+6).setOption(true);
	    	    	    	    	    					
	    	    	    	    	    					c.repaint();}
	    	    	    	    					}
	    	    	    	    				}else if(al.get(i+5).getAvailability()==1){
	    	    	    	    					al.get(i+5).setOption(true);
	    	    	    	    					
	    	    	    	    					c.repaint();}
	    	    	    					}
	    	    	    				}else if(al.get(i+4).getAvailability()==1){
	    	    	    					al.get(i+4).setOption(true);
	    	    	    					
	    	    	    					c.repaint();}
	    	    					}
	    	    				}else if(al.get(i+3).getAvailability()==1){
	    	    					al.get(i+3).setOption(true);
	    	    					
	    	    					c.repaint();}
	    					}
	    				}else if(al.get(i+2).getAvailability()==1){
	    					al.get(i+2).setOption(true);
	    					
	    					c.repaint();}
					}
				}else if(al.get(i+1).getAvailability()==1){
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
	    	    	    	    	    	    				}else if(al.get(i-7).getAvailability()==1){
	    	    	    	    	    	    					al.get(i-7).setOption(true);
	    	    	    	    	    	    					
	    	    	    	    	    	    					c.repaint();}
	    	    	    	    	    					}
	    	    	    	    	    				}else if(al.get(i-6).getAvailability()==1){
	    	    	    	    	    					al.get(i-6).setOption(true);
	    	    	    	    	    					
	    	    	    	    	    					c.repaint();}
	    	    	    	    					}
	    	    	    	    				}else if(al.get(i-5).getAvailability()==1){
	    	    	    	    					al.get(i-5).setOption(true);
	    	    	    	    					
	    	    	    	    					c.repaint();}
	    	    	    					}
	    	    	    				}else if(al.get(i-4).getAvailability()==1){
	    	    	    					al.get(i-4).setOption(true);
	    	    	    					
	    	    	    					c.repaint();}
	    	    					}
	    	    				}else if(al.get(i-3).getAvailability()==1){
	    	    					al.get(i-3).setOption(true);
	    	    					
	    	    					c.repaint();}
	    					}
	    				}else if(al.get(i-2).getAvailability()==1){
	    					al.get(i-2).setOption(true);
	    					
	    					c.repaint();}
					}
				}else if(al.get(i-1).getAvailability()==1){
					al.get(i-1).setOption(true);
					
					c.repaint();}
			}
		
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
	}
	public static void darkKing(ArrayList<Properties> al,int i,Graphics g,JComponent c){
		if(al.get(i).getWhichPawn()==5&&al.get(i).getAvailability()==2&&Properties.getWhoseTurn()==false&&al.get(i).getOption()==false){
			for(int k=0; k<64; k++){
				al.get(k).setOption(false);
				Properties.setSelected(0);
				c.repaint();
			}
			dlocation=i;
			Properties.setSelected(10);
			if(i!=0&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7){
				if(al.get(i-8).getAvailability()==0||al.get(i-8).getAvailability()==1){
					al.get(i-8).setOption(true);
					
					c.repaint();
				}
		}
			if(i!=56&&i!=57&&i!=58&&i!=59&&i!=60&&i!=61&&i!=62&&i!=63){
				if(al.get(i+8).getAvailability()==0||al.get(i+8).getAvailability()==1){
					al.get(i+8).setOption(true);
					
					c.repaint();
				}
			}
			if(i!=0&&i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56){
				if(al.get(i-1).getAvailability()==0||al.get(i-1).getAvailability()==1){
					al.get(i-1).setOption(true);
					
					c.repaint();
				}
			}
			if(i!=7&&i!=15&&i!=23&&i!=31&&i!=39&&i!=47&&i!=55&&i!=63){
				if(al.get(i+1).getAvailability()==0||al.get(i+1).getAvailability()==1){
					al.get(i+1).setOption(true);
					
					c.repaint();
				}
			}
			if(i!=0&&i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7){
				if(al.get(i-9).getAvailability()==0||al.get(i-9).getAvailability()==1){
				al.get(i-9).setOption(true);
				
				c.repaint();
				}
			}
			if((i)!=7&&(i)!=15&&(i)!=23&&(i)!=31&&(i)!=39&&(i)!=47&&(i)!=55&&(i)!=56&&(i)!=57&&(i)!=58&&(i)!=59&&(i)!=60&&(i)!=61&&(i)!=62&&(i)!=63){
				if(al.get(i+9).getAvailability()==0||al.get(i+9).getAvailability()==1){
				al.get(i+9).setOption(true);
				
				c.repaint();
				}
			}
			if((i)!=0&&(i)!=8&&(i)!=16&&(i)!=24&&(i)!=32&&(i)!=40&&(i)!=48&&(i)!=56&&(i)!=57&&(i)!=58&&(i)!=59&&(i)!=60&&(i)!=61&&(i)!=62&&(i)!=63){
				if(al.get(i+7).getAvailability()==0||al.get(i+7).getAvailability()==1){
				al.get(i+7).setOption(true);
			
				c.repaint();
				}
			}
			if((i)!=0&&(i)!=15&&(i)!=23&&(i)!=31&&(i)!=39&&(i)!=47&&(i)!=55&&(i)!=63&&(i)!=1&&(i)!=2&&(i)!=3&&(i)!=4&&(i)!=5&&(i)!=6&&(i)!=7){
				if(al.get(i-7).getAvailability()==0||al.get(i-7).getAvailability()==1){
				al.get(i-7).setOption(true);
				
				c.repaint();
				}
			}
	}
	}
	public static void darkKnight(ArrayList<Properties> al,int i,Graphics g,JComponent c){
		if(al.get(i).getWhichPawn()==2&&al.get(i).getAvailability()==2&&Properties.getWhoseTurn()==false&&al.get(i).getOption()==false){
			for(int k=0; k<64; k++){
				al.get(k).setOption(false);
				Properties.setSelected(0);
				c.repaint();
			}
			dlocation=i;
			Properties.setSelected(4);
			if(i!=0&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7&& i!=8&&i!=9&&i!=10&&i!=11&&i!=12&&i!=13&&i!=14&&i!=15&& i!=23&&i!=31&&i!=39&&i!=47&&i!=55&&i!=63){
				if(al.get(i-15).getAvailability()==0||al.get(i-15).getAvailability()==1){
					al.get(i-15).setOption(true);
					
					c.repaint();
				}
			}
			if(i!=0&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7&& i!=8&&i!=9&&i!=10&&i!=11&&i!=12&&i!=13&&i!=14&&i!=15&& i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56){
				if(al.get(i-17).getAvailability()==0||al.get(i-15).getAvailability()==1){
					al.get(i-17).setOption(true);
					
					c.repaint();
				}
			}
			if(i!=0&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7&& i!=14&&i!=22&&i!=30&&i!=38&&i!=46&&i!=54&&i!=62&&i!=15&& i!=23&&i!=31&&i!=39&&i!=47&&i!=55&&i!=63){
				if(al.get(i-6).getAvailability()==0||al.get(i-6).getAvailability()==1){
					al.get(i-6).setOption(true);
					
					c.repaint();
				}
			}
			if(i!=0&&i!=1&&i!=2&&i!=3&&i!=4&&i!=5&&i!=6&&i!=7&& i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=56&& i!=9&&i!=17&&i!=25&&i!=33&&i!=41&&i!=49&&i!=57){
				if(al.get(i-10).getAvailability()==0||al.get(i-10).getAvailability()==1){
					al.get(i-10).setOption(true);
					
					c.repaint();
				}
			}
			if(i!=56&&i!=57&&i!=58&&i!=59&&i!=60&&i!=61&&i!=62&&i!=63&&i!=0&& i!=8&&i!=16&&i!=24&&i!=32&&i!=40&&i!=48&&i!=1&& i!=9&&i!=17&&i!=25&&i!=33&&i!=41&&i!=49){
				if(al.get(i+6).getAvailability()==0||al.get(i+6).getAvailability()==1){
					al.get(i+6).setOption(true);
					
					c.repaint();
				}
			}
			if(i!=56&&i!=57&&i!=58&&i!=59&&i!=60&&i!=61&&i!=62&&i!=63&&i!=7&& i!=15&&i!=23&&i!=31&&i!=39&&i!=47&&i!=55&&i!=63&& i!=6&&i!=14&&i!=22&&i!=30&&i!=38&&i!=54){
				if(al.get(i+10).getAvailability()==0||al.get(i+10).getAvailability()==1){
					al.get(i+10).setOption(true);
					
					c.repaint();
				}
			}
			if(i!=56&&i!=57&&i!=58&&i!=59&&i!=60&&i!=61&&i!=62&&i!=63&&i!=48&& i!=49&&i!=50&&i!=51&&i!=52&&i!=53&&i!=54&&i!=55&& i!=7&&i!=15&&i!=23&&i!=31&&i!=39&&i!=47){
				if(al.get(i+17).getAvailability()==0||al.get(i+17).getAvailability()==1){
					al.get(i+17).setOption(true);
					
					c.repaint();
				}
			}
			if(i!=56&&i!=57&&i!=58&&i!=59&&i!=60&&i!=61&&i!=62&&i!=63&&i!=48&& i!=49&&i!=50&&i!=51&&i!=52&&i!=53&&i!=54&&i!=55&& i!=0&&i!=8&&i!=16&&i!=24&&i!=32&&i!=48){
				if(al.get(i+15).getAvailability()==0||al.get(i+15).getAvailability()==1){
					al.get(i+15).setOption(true);
					
					c.repaint();
				}
			}
		}
	}
}
