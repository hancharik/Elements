/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package space;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Mark
 */
public class Apanel extends JPanel implements ActionListener, KeyListener, MouseListener {
    
    int playerSize = space.Space.globalParticleSize;
    int amountOfEnemies;// = space.Space.globalAmountOfEnemies;
    int helioSize = space.Space.globalHelioSize;
    int shipSize = space.Space.globalShipSize;
     //int helioSize = amountOfEnemies;
    
    int enemySpeed = space.Space.globalEnemySpeed;
    
    int helioSpeed = 10;
    int timerSpeed = space.Space.globalTimerSpeed;
    int speedlimit = space.Space.globalSpeedlimit;// + helioSize;// douglas adams is max
    int minSpeed = space.Space.globalMinSpeed;
    Sbutton helio;
    Sbutton ship;
    ArrayList<Sbutton> particles;// = new ArrayList();
    
  
    
    //Abutton[] stuffBucket = new Sbutton[space.Space.level*120];
    //BucketPanel bucket = new BucketPanel();
    
    Timer timer;
    boolean singularGravity = true;
    
    
    int Xcord;// = (int) (Math.random() * 400) + 1;
         int Ycord;/// = (int) (Math.random() * 340) + 1;
    
    
    
    
    
    
    
    
    public Apanel(){
       
       super();
       
       setLayout(null);
       setBackground(Color.black);
        addMouseListener(this);
        
        
      
      
        particles = new ArrayList();
        addHelio();
        particles.add(helio);
        
      addEnemies();
      
      
      //addMouseListener(this);
      
      
      
     /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
      // if we have this, do we need the stuff at the bottom?
      addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
                                    if(space.Space.thereIsAShip){
                                        ship.setBounds(e.getX(), e.getY(), space.Space.globalShipSize, space.Space.globalShipSize);   
                                        ship.xVel = 0.0;
                                        ship.yVel = 0.0;
                                           }else{
                                        helio.setBounds(e.getX(), e.getY(), helioSize, helioSize);
                                            }
                                    }
                                });
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
      
      
      
      
      
      
      
      

       timer = new Timer( timerSpeed, this);
       timer.start();
       helio.requestFocus();
       //requestFocus();
    }
 
    public void setVariables(){
        
        singularGravity = space.Space.globalSingularGravity;
          playerSize = space.Space.globalParticleSize;
   amountOfEnemies= space.Space.globalAmountOfParticles;
     helioSize = space.Space.globalHelioSize;
     //int helioSize = amountOfEnemies;
    
     enemySpeed = space.Space.globalEnemySpeed;
    
    helioSpeed = 10;
    timerSpeed = space.Space.globalTimerSpeed;
     speedlimit = space.Space.globalSpeedlimit;// + helioSize;// douglas adams is max
     minSpeed = space.Space.globalMinSpeed;
        
    }
    
    
    
    public void addHelio(){
        
        if(space.Space.thereIsAShip){
            ship = new Sbutton();
            ship.setBounds(20, 20, space.Space.globalShipSize, space.Space.globalShipSize);
            ship.setBackground(Color.GRAY);
            ship.addActionListener(this);
            ship.addKeyListener(this);
            ship.speedLimit = space.Space.globalShipSpeedLimit;
            ship.xVel = 5.0;
            ship.yVel = 5.0;
            particles.add(ship);  // this is how we add movement
            add(ship);
      }
        
        Xcord = space.Space.screen.width/2 - 40;
         Ycord = space.Space.screen.height/2 - 60;
         //helioSize = space.Space.globalHelioSize;
         
        helio = new Sbutton();
        helio.setBounds(Xcord, Ycord, helioSize, helioSize);
        helio.setBackground(Color.YELLOW);
        helio.addActionListener(this);
        helio.addKeyListener(this);
        if(space.Space.showStallman){
            helioSize = space.Space.globalStallmanSize;
        helio.makeHero();
        
        }
        helio.setBounds(Xcord, Ycord, helioSize, helioSize);
        helio.mass = space.Space.massOfCenter;
        add(helio);   
    }
  
      public void addEnemies(){
          
          amountOfEnemies = space.Space.globalAmountOfParticles;
         
         for(int i = 0; i < amountOfEnemies; i++){
             Xcord = helio.getX() - ((int)(Math.random() * 200) + 1);//(int) (Math.random() * (space.Space.screen.width-300)) + 200;
         Ycord = helio.getY() - ((int)(Math.random() * 100) + 100);//(int) (Math.random() * (space.Space.screen.height-300)) + 200;
         //int xsp = 30;
         //int ysp = -10;
         // this is our cast, we "throw" them to try to get an orbit
         int xsp = 20;
         int ysp = -1;
         
         if(space.Space.particles){
             Xcord = (int) (Math.random() * (space.Space.screen.width)) + 1;
         Ycord = (int) (Math.random() * (space.Space.screen.height)) + 1;  
          xsp = 0;
          ysp = 0;
         }
          Sbutton a = new Sbutton();
         
        //particles.get(i) = new Sbutton();
        a.setBounds(Xcord, Ycord, playerSize, playerSize);
        a.setBackground(Color.red);
        a.xVel = xsp;
        a.yVel = ysp;
        a.mass = space.Space.globalParticleMass;
        a.addActionListener(this);
       // a.makeZombie();
        a.speedLimit = (int)(Math.random() * speedlimit) + minSpeed;
        a.setColor(speedlimit);
         particles.add(a);
        add(a);   
        
         }
    }
 
         public void actionPerformed(ActionEvent event) 
    {

       	Object obj = event.getSource();
       
    
        
        
       	if (obj == timer){
            
            
            	
          
           
           //moveParticles();
            moveEnemy();
           // if(space.Space.thereIsAShip){
             //helio.requestFocus();
                //ship.requestFocus();
              //  ship.move();
           // }
            
       	}
        
        
       
   

		if (obj == helio) //t)
		{
                    timer.stop();
                   // space.Space.screen.dispose();
                    //if(singularGravity == false){
                    
                    
                    
                    
                    
                   //space.Space.screen.elementViewerPanel();
                 space.Space.screen.startPanel();
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  //  }else{
               //  space.Space.screen.restart();
                //    }
                
		}
    
    }

    @Override
    public void keyTyped(KeyEvent e) {
        int k = e.getKeyCode();
		if(k == e.VK_UP){
                    if(space.Space.thereIsAShip){
                        ship.yVel--;
                       // ship.setBounds(ship.getX() , ship.getY() - 10, shipSize, shipSize);
                    }else{
			helio.setBounds(helio.getX(), helio.getY() - helioSpeed, helioSize, helioSize);
                    }
		}
                if(k == e.VK_DOWN){
                        if(space.Space.thereIsAShip){
                        ship.yVel++;
                        //ship.setBounds(ship.getX() , ship.getY() + 10, shipSize, shipSize);
                    }else{
			helio.setBounds(helio.getX(), helio.getY() + helioSpeed, helioSize, helioSize);
                    }
		}
			
		
                if(k == e.VK_LEFT){
                            if(space.Space.thereIsAShip){
                        ship.xVel--;
                        //ship.setBounds(ship.getX() - 10, ship.getY(), shipSize, shipSize);
                    }else{
			helio.setBounds(helio.getX() - helioSpeed, helio.getY(), helioSize, helioSize);
		}
                   
                }
		
		if(k == e.VK_RIGHT){
                               if(space.Space.thereIsAShip){
                        ship.xVel++;
                      //  ship.setBounds(ship.getX() + 10, ship.getY(), shipSize, shipSize);
                    }else{
			helio.setBounds(helio.getX() + helioSpeed, helio.getY(),helioSize, helioSize);
		}
                  
                }
                
                if(k == e.VK_E){
                        
                  space.Space.screen.restart();      
		}
                
                if(k == e.VK_R){
                        
                     Xcord = (int) (Math.random() * (space.Space.screen.width-300)) + 200;
                    Ycord = (int) (Math.random() * (space.Space.screen.height-300)) + 200; 
                    helio.setBounds(Xcord, Ycord, helioSize, helioSize);
		} 
                
    }

    @Override
    public void keyPressed(KeyEvent e) {
                int k = e.getKeyCode();
		if(k == e.VK_UP){
                    if(space.Space.thereIsAShip){
                        ship.yVel--;
                     //   ship.setBounds(ship.getX() , ship.getY() - 10, shipSize, shipSize);
                    }else{
			helio.setBounds(helio.getX(), helio.getY() - helioSpeed, helioSize, helioSize);
                    }
		}
                if(k == e.VK_DOWN){
                        if(space.Space.thereIsAShip){
                        ship.yVel++;
                      //  ship.setBounds(ship.getX() , ship.getY() + 10, shipSize, shipSize);
                    }else{
			helio.setBounds(helio.getX(), helio.getY() + helioSpeed, helioSize, helioSize);
                    }
		}
			
		
                if(k == e.VK_LEFT){
                            if(space.Space.thereIsAShip){
                        ship.xVel--;
                     //  ship.setBounds(ship.getX() - 10, ship.getY(), shipSize, shipSize);
                    }else{
			helio.setBounds(helio.getX() - helioSpeed, helio.getY(), helioSize, helioSize);
		}
                   
                }
		
		if(k == e.VK_RIGHT){
                               if(space.Space.thereIsAShip){
                        ship.xVel++;
                     //   ship.setBounds(ship.getX() + 10, ship.getY(), shipSize, shipSize);
                    }else{
			helio.setBounds(helio.getX() + helioSpeed, helio.getY(),helioSize, helioSize);
		}
                  
                }
                    
		
		
		
                if(k == e.VK_E){
                        
                  space.Space.screen.restart();      
		}
                
                
               if(k == e.VK_R){
                        
                     Xcord = (int) (Math.random() * (space.Space.screen.width-300)) + 200;
                    Ycord = (int) (Math.random() * (space.Space.screen.height-300)) + 200; 
                    helio.setBounds(Xcord, Ycord, helioSize, helioSize);
		} 
                
                  if(k == e.VK_Q){
                        
                  ship.mass = 0.0;      
		}
                
                  if(k == e.VK_W){
                        
                  ship.mass = space.Space.globalShipMass;      
		}
                
                
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
 
    
    }
 
    
    
    
    
     public void moveParticles(){
       
         
         for(int i = 0; i < particles.size(); i++){
             
             
             
             
              for(int j = 0; j < particles.size(); j++){
      /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
                    double totalGravity = 0.0;
                    int moveX = 0;
                    int moveY = 0;
                                   
                            if(i != j){ // don't calculate gravity on yourself
                                    totalGravity  = calculateGravity(particles.get(i).getX(),particles.get(i).getY(), particles.get(j).getX(),particles.get(j).getY(), particles.get(i).mass, particles.get(j).mass);
                                    moveX = (particles.get(i).getX()+ (particles.get(i).getWidth()/2)) - (particles.get(j).getX()+ (particles.get(j).getWidth()/2));
                                    moveY = (particles.get(i).getY()+ (particles.get(i).getWidth()/2)) - (particles.get(j).getY()+ (particles.get(j).getWidth()/2));
                                   
                                   
                                        
                                    if (moveX > 0){
                                       particles.get(i).xVel = particles.get(i).xVel - totalGravity;
                                    }else if (moveX < 0){
                                       particles.get(i).xVel = particles.get(i).xVel + totalGravity;
                                    }else{
                                      // if zero, do nothing    
                                    }

                                    if (moveY > 0){
                                        particles.get(i).yVel = particles.get(i).yVel - totalGravity;
                                   }else if (moveY < 0){
                                       particles.get(i).yVel = particles.get(i).yVel + totalGravity;
                                    }else{
                                      // if zero, do nothing  
                                    }

                            }
                        
                 } // end for j loop
             
            particles.get(i).move();
            }  // end for i loop
       
   }   // end move particle


     
     

     public void moveEnemy(){
       
         
         for(int i = 0; i < particles.size(); i++){
      /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
       int moveX = (particles.get(i).getX()+ (playerSize/2)) - (helio.getX() + (helioSize/2));
       int moveY = (particles.get(i).getY()+ (playerSize/2)) - (helio.getY()+ (helioSize/2));
       // chase the tail!
           // moveX = particles.get(i).getX() - particles.get(particles.size()-1).getX();
           // moveY = particles.get(i).getY() - particles.get(particles.size()-1).getY(); 
      //int amountOfForce = getDistance(particles.get(i).getX(),particles.get(i).getY(), helio.getX(), helio.getY());
      
       
                if(!space.Space.globalSingularGravity){
                        if(i > 0){
                             moveX = particles.get(i).getX() - particles.get(i-1).getX();
                             moveY = particles.get(i).getY() - particles.get(i-1).getY(); 

                           // move = enemySpeed - i;
                        }
                }
                
                
            if(space.Space.linearMovement){
                
             
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       
                
                 int move = enemySpeed;
                
        if (moveX > 0){
                    if(Math.abs(moveX - move)>move){
                   particles.get(i).setBounds(particles.get(i).getX() - move, particles.get(i).getY(), playerSize, playerSize); 
                    }
                }else{
                    if(Math.abs(moveX - move)>move){
                  particles.get(i).setBounds(particles.get(i).getX() + move, particles.get(i).getY(), playerSize, playerSize); 
                    }
                }
                if (moveY > 0){
                    if(Math.abs(moveY - move)>move){
                   particles.get(i).setBounds(particles.get(i).getX(), particles.get(i).getY() - move, playerSize, playerSize);
                    }
                }else{
                        if(Math.abs(moveY - move)>move){
                    
                  particles.get(i).setBounds(particles.get(i).getX(), particles.get(i).getY() + move, playerSize, playerSize);  
                        }
                }
       
              
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
                
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        } else{ 
                 double amountOfForce; 
                 
                 amountOfForce = calculateGravity(particles.get(i).getX(),particles.get(i).getY(), helio.getX(), helio.getY(), particles.get(i).mass, helio.mass);
                 
                 // check all particles for gravity
                 double totalGravity = 0.0;
                 if(space.Space.allParticlesHaveGravity){
                
                 
                        for(int j = 0; j < particles.size(); j++){
                                   if(i != j){ // don't calculate gravity on yourself
                                  totalGravity  = calculateGravity(particles.get(i).getX(),particles.get(i).getY(), particles.get(j).getX(),particles.get(j).getY(), particles.get(i).mass, particles.get(j).mass);
                                  }
                        }
                 }
                 
                // double  amountOfXForce = calculateSingleVectorGravity(particles.get(i).getX(), helio.getX(),  particles.get(i).mass, helio.mass);
               // double amountOfYForce = calculateSingleVectorGravity(particles.get(i).getY(), helio.getY(), particles.get(i).mass, helio.mass);
                 
                if(!space.Space.gravityGetsStronger){
                amountOfForce = 1;
                }
                if(space.Space.showStallman){
                amountOfForce = getDistance(particles.get(i).getX(),particles.get(i).getY(), helio.getX(), helio.getY());
                }
                // first run gravity on x vector
               // amountOfForce = calculateSingleVectorGravity(particles.get(i).getX(), helio.getX(),  particles.get(i).mass, helio.mass);
                
                                    if (moveX > 0){
                                       particles.get(i).xVel = particles.get(i).xVel - (amountOfForce + totalGravity);
                                    }else if (moveX < 0){
                                       particles.get(i).xVel = particles.get(i).xVel + (amountOfForce + totalGravity);
                                    }else{
                                      // if zero, do nothing    
                                    }

                                    if (moveY > 0){
                                        particles.get(i).yVel = particles.get(i).yVel - (amountOfForce + totalGravity);
                                   }else if (moveY < 0){
                                       particles.get(i).yVel = particles.get(i).yVel + (amountOfForce + totalGravity);
                                    }else{
                                      // if zero, do nothing  
                                    }
              ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////            
                
               //  particles.get(0).setBackground(Color.WHITE);
                particles.get(i).move();
                particles.get(i).checkCollision();
            }
            
           
            
            
            }  // end for loop
        //if(space.Space.thereIsAShip){
      // ship.move();
       // }
   }   // end move enemy
     
  
     
    public int getDistance(int x, int y, int dx, int dy){
        
        int forceAmount = 1;
        
        
        double gravityWell = space.Space.gravityWellDistance;
        double mass = 3;//space.Space.massOfCenter;
        double distance = Math.sqrt((dx-x)*(dx-x)+(dy-y)*(dy-y));
      
        
        
        
       
        
        
        
        
       
        if(distance < gravityWell){
           forceAmount = (int)(mass * .2); 
        }
        if(distance < gravityWell * .9){
          forceAmount = (int)(mass * .3); 
        }
        if(distance < gravityWell * .8){
           forceAmount = (int)(mass * .4); 
        }
        if(distance < gravityWell * .7){
            forceAmount = (int)(mass * .5); 
        }
        if(distance < gravityWell * .6){
            forceAmount = (int)(mass * .6); 
        }
        if(distance < gravityWell * .5){
          forceAmount = (int)(mass * .7); 
        }
        if(distance < gravityWell * .4){
           forceAmount = (int)(mass * .8); 
        }
        if(distance < gravityWell * .3){
            forceAmount = (int)(mass * .9); 
        }
        if(distance < gravityWell * .2){
            forceAmount = (int)(mass); 
        }
        
        
        
       return forceAmount; 
    } //end get distance
     
    
    
    
    
    
    
    
    
    
        public double calculateGravity(int x, int y, int dx, int dy, double m1, double m2){
        
        double forceAmount = 1;
        
        
        
        double distance = Math.sqrt((dx-x)*(dx-x)+(dy-y)*(dy-y));
        
        double uniGravConst = space.Space.universalGravitationConstant;
        
        double gravitationalAttraction = (uniGravConst * m1 * m2) / (distance * distance);
        
        forceAmount = gravitationalAttraction; 
        
        return forceAmount; 
       
    } //end calculate gravity
     
     
     
        
        
        
        
        
           public double calculateSingleVectorGravity(int x,  int dx,  double m1, double m2){
        // i don't know if this is anywhere near right, i think it's correct, it's my feeling - gravity should have different values on x and y
              // so if you call this on the x and y individually, it should be more accurate movement
        double forceAmount = 1;
        
        double distance = x-dx;
        double uniGravConst = space.Space.universalGravitationConstant;
        
         double gravitationalAttraction = (uniGravConst * m1 * m2) / (distance * distance);
        
        
        
        forceAmount = gravitationalAttraction; 
        
        
        
    
       return forceAmount; 
       
    } //end calculate gravity  
     
     
     
     
     
     
   public void gameOver(){
      
       
        for(int i = 0; i < particles.size(); i++){
            
            
       
      if (helio.getBounds().intersects(particles.get(i).getBounds())){
          
          timer.stop();
          
          remove(helio);
          remove(particles.get(i));
          
          //singularGravity = false;
          //gameOverButton.removeActionListener(this);
          //hideTreasureButtons();
          repaint();
          
          
          
          
      }

     }
   }  

    @Override
    public void mouseClicked(MouseEvent e) {
        if(space.Space.thereIsAShip){
     ship.setBounds(e.getX(), e.getY(), space.Space.globalShipSize, space.Space.globalShipSize);      
        }else{
     helio.setBounds(e.getX(), e.getY(), helioSize, helioSize);
        }
    // helio.setBackground(Color.red);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(space.Space.thereIsAShip){
     ship.setBounds(e.getX(), e.getY(), space.Space.globalShipSize, space.Space.globalShipSize);      
        }else{
         helio.setBounds(e.getX(), e.getY(), helioSize, helioSize);
        }
        //  helio.setBackground(Color.red);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(space.Space.thereIsAShip){
     ship.setBounds(e.getX(), e.getY(), space.Space.globalShipSize, space.Space.globalShipSize);      
        }else{
         helio.setBounds(e.getX(), e.getY(), helioSize, helioSize);
        }
        // helio.setBackground(Color.red);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 //http://stackoverflow.com/questions/20011091/move-over-a-jpanel-with-mouse-dragged
                public void mouseDragged(MouseEvent e) {
                   // Point p = e.getPoint();
                    //int x = p.x - startPoint.x;
                   // int y = p.y - startPoint.x;
                   // offset = new Point(x, y);
                     //ship.setBounds((int) me.getPoint().getX(), (int) me.getPoint().getY(), space.Space.globalShipSize, space.Space.globalShipSize);  
                   // repaint();
                }
       
      public void mouseMoved(MouseEvent me) {
   ship.setBounds((int) me.getPoint().getX(), (int) me.getPoint().getY(), space.Space.globalShipSize, space.Space.globalShipSize);  
    repaint();
  }

    
}
