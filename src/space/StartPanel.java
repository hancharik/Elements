/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package space;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Mark
 */
public class StartPanel extends JPanel implements ActionListener, ChangeListener{

    JButton startPlanetButton;
    JButton startAtomButton;
    JButton startChainedParticleButton;
    JButton stallmanHaloButton;
    JButton showElementsButton;
    JButton showrms;
    JButton startButton;
    JButton quitButton;
    JButton shipButton;
    
    JButton bigScreenButton;
    JButton littleScreenButton;
    JButton fullScreenButton;
    JButton linearMovementButton;
    JButton centeredGravityButton;
    JButton fixedParticleButton;
    JButton relativeGravityButton;
    
    JSlider numberOfParticles;
    JSlider sizeOfParticles;
    JSlider speedOfParticles;
    JSlider speedLimitMaxOfParticles;
    JSlider speedLimitMinOfParticles;
    JSlider massOfCenter;
    JSlider massOfParticles;
    JSlider massOfShip;
    JLabel massOfShipLabel;
    JLabel massOfParticlesLabel;
    JLabel massOfCenterLabel;
    JLabel numOfParticles;
    JLabel speedLimitMaxOfParticlesLabel;
    JLabel sizeOfParticlesLabel;
    JLabel speedOfParticlesMaxLabel;
    JLabel speedLimitMinOfParticlesLabel;
    
    int sliderWidth = (int)(space.Space.width*.18);
    
    
    
    public StartPanel(){
        
       super();
       setLayout(null);
       setBackground(Color.black);
       startPlanetButton = new JButton("Solar System");
       startPlanetButton.setBounds(column(6), row(2), 160, 40);
       startPlanetButton.addActionListener(this);
       add(startPlanetButton); 
       startAtomButton = new JButton("Electron Cloud");
       startAtomButton.setBounds(column(6), row(3), 160, 40);
       startAtomButton.addActionListener(this);
       add(startAtomButton); 
       startChainedParticleButton = new JButton("Chained Particles");
       startChainedParticleButton.setBounds(column(6), row(4), 160, 40);
       startChainedParticleButton.addActionListener(this);
       add(startChainedParticleButton); 
       
       stallmanHaloButton = new JButton("Stallman Halo");
       stallmanHaloButton.setBounds(column(6), row(5), 160, 40);
       stallmanHaloButton.addActionListener(this);
       add(stallmanHaloButton); 
       
       showElementsButton = new JButton("Show Elements");
       showElementsButton.setBounds(column(6), row(6), 160, 40);
       showElementsButton.addActionListener(this);
       add(showElementsButton);
       
       
       bigScreenButton = new JButton("Big Screen");
       bigScreenButton.setBounds(column(5), row(1), 120, 40);
       bigScreenButton.addActionListener(this);
       //add(bigScreenButton);
       littleScreenButton = new JButton("Little Screen");
       littleScreenButton.setBounds(column(5), row(2), 120, 40);
       littleScreenButton.addActionListener(this);
       //add(littleScreenButton);
       fullScreenButton = new JButton("Full Screen");
       fullScreenButton.setBounds(column(5), row(3), 120, 40);
       fullScreenButton.addActionListener(this);
       //add(fullScreenButton);
       
        
        massOfCenter = new JSlider(JSlider.HORIZONTAL, 0, 1000, (int)space.Space.massOfCenter);
        massOfCenter.addChangeListener(this);
        massOfCenter.setMajorTickSpacing(100);
        massOfCenter.setPaintTicks(true);
        massOfCenter.setBounds(column(1), row(4), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(column(1), 160, 40, 200);// vertical
        add(massOfCenter);
        
        massOfParticles = new JSlider(JSlider.HORIZONTAL, 1, 1000, (int)space.Space.globalParticleMass);
        massOfParticles.addChangeListener(this);
        massOfParticles.setMajorTickSpacing(100);
        massOfParticles.setPaintTicks(true);
        massOfParticles.setBounds(column(1), row(5), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(10, 160, 40, 200);// vertical
        add(massOfParticles);
        
        massOfShip = new JSlider(JSlider.HORIZONTAL, 1, 1000, (int)space.Space.globalParticleMass);
        massOfShip.addChangeListener(this);
        massOfShip.setMajorTickSpacing(100);
        massOfShip.setPaintTicks(true);
        massOfShip.setBounds(column(1), row(3), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(10, 160, 40, 200);// vertical
        add(massOfShip);
        
        
        numberOfParticles = new JSlider(JSlider.HORIZONTAL, 1, 6000, space.Space.globalAmountOfParticles);
        numberOfParticles.addChangeListener(this);
        numberOfParticles.setMajorTickSpacing(100);
        numberOfParticles.setPaintTicks(true);
        numberOfParticles.setBounds(column(1), row(6), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(column(1), 160, 40, 200);// vertical
        add(numberOfParticles);
        
        sizeOfParticles = new JSlider(JSlider.HORIZONTAL, 1, 80, space.Space.globalParticleSize);
        sizeOfParticles.addChangeListener(this);
        sizeOfParticles.setMajorTickSpacing(100);
        sizeOfParticles.setPaintTicks(true);
        sizeOfParticles.setBounds(column(1), row(7), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(10, 160, 40, 200);// vertical
        add(sizeOfParticles);
       
        
        speedOfParticles = new JSlider(JSlider.HORIZONTAL, 1, 1000, space.Space.globalTimerSpeed);
        speedOfParticles.addChangeListener(this);
        speedOfParticles.setMajorTickSpacing(100);
        speedOfParticles.setPaintTicks(true);
        speedOfParticles.setBounds(column(1), row(10), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(10, 160, 40, 200);// vertical
        add(speedOfParticles);
        
        speedLimitMaxOfParticles = new JSlider(JSlider.HORIZONTAL, 1, 100, space.Space.globalSpeedlimit);
        speedLimitMaxOfParticles.addChangeListener(this);
        speedLimitMaxOfParticles.setMajorTickSpacing(100);
        speedLimitMaxOfParticles.setPaintTicks(true);
        speedLimitMaxOfParticles.setBounds(column(1), row(8), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(10, 160, 40, 200);// vertical
        add(speedLimitMaxOfParticles);
        
        speedLimitMinOfParticles = new JSlider(JSlider.HORIZONTAL, 1, 20, space.Space.globalMinSpeed);
        speedLimitMinOfParticles.addChangeListener(this);
        speedLimitMinOfParticles.setMajorTickSpacing(100);
        speedLimitMinOfParticles.setPaintTicks(true);
        speedLimitMinOfParticles.setBounds(column(1), row(9), sliderWidth, 40);// horizontal
        //numberOfParticles.setBounds(10, 160, 40, 200);// vertical
        add(speedLimitMinOfParticles);
        
        massOfCenterLabel = new JLabel("<html><h2><font color='white'>mass of center: </font><font color='red'>" + space.Space.massOfCenter + "</font><h2></html>");
        massOfCenterLabel.setBounds(column(2), row(4), 220, 40);
        add(massOfCenterLabel);
        
        massOfParticlesLabel = new JLabel("<html><h2><font color='white'>mass of particles: </font><font color='red'>" + space.Space.globalParticleMass + "</font><h2></html>");
        massOfParticlesLabel.setBounds(column(2), row(5), 220, 40);
        add(massOfParticlesLabel);
        
        massOfShipLabel = new JLabel("<html><h2><font color='white'>mass of ship: </font><font color='red'>" + space.Space.globalShipMass + "</font><h2></html>");
        massOfShipLabel.setBounds(column(2), row(3), 220, 40);
        add(massOfShipLabel);
        
        numOfParticles = new JLabel("<html><h2><font color='white'># of particles: </font><font color='red'>" + space.Space.globalAmountOfParticles + "</font><h2></html>");
        numOfParticles.setBounds(column(2), row(6), 220, 40);
     
        add(numOfParticles);
        sizeOfParticlesLabel = new JLabel("<html><h2><font color='white'>size: </font><font color='red'>" + space.Space.globalParticleSize + "</font><h2></html>");
        sizeOfParticlesLabel.setBounds(column(2), row(7), 220, 40);
        add(sizeOfParticlesLabel);
        //speedOfParticlesMaxLabel = new JLabel("speed: " + space.Space.globalTimerSpeed);
        speedOfParticlesMaxLabel = new JLabel("<html><h2><font color='white'>ms per cycle: </font><font color='red'>" + space.Space.globalTimerSpeed + "</font><h2></html>");
        speedOfParticlesMaxLabel.setBounds(column(2), row(10), 220, 40);
        add(speedOfParticlesMaxLabel);
        
         speedLimitMaxOfParticlesLabel = new JLabel("<html><h2><font color='white'>max speed limit: </font><font color='red'>" + space.Space.globalSpeedlimit + "</font><h2></html>");
        speedLimitMaxOfParticlesLabel.setBounds(column(2), row(8), 220, 40);
        add(speedLimitMaxOfParticlesLabel);
        
         speedLimitMinOfParticlesLabel = new JLabel("<html><h2><font color='white'>min speed limit: </font><font color='red'>" + space.Space.globalMinSpeed + "</font><h2></html>");
        speedLimitMinOfParticlesLabel.setBounds(column(2), row(9), 2200, 40);
        speedLimitMinOfParticlesLabel.setBackground(Color.red);
        add(speedLimitMinOfParticlesLabel);
        
       showrms = new JButton();
       checkrmsPic();
       showrms.setBounds(column(1), row(1), 200, 100);
       showrms.addActionListener(this);
       add(showrms); 
        
       quitButton = new JButton("quit");
       quitButton.setBounds(column(6), row(11), 80, 40);
       quitButton.addActionListener(this);
       add(quitButton);
       
       shipButton = new JButton("ship = " + space.Space.thereIsAShip);
       shipButton.setBounds(column(4), row(5), 180, 40);
       shipButton.addActionListener(this);
       add(shipButton);
       
       startButton = new JButton("start");
       startButton.setBounds(column(2), row(11), 80, 40);
       startButton.addActionListener(this);
       add(startButton);
       
       
       linearMovementButton = new JButton("linear movement = " + space.Space.linearMovement);
       linearMovementButton.setBounds(column(4), row(9), 180, 40);
       linearMovementButton.addActionListener(this);
       add(linearMovementButton);
       
       centeredGravityButton = new JButton("singular gravity = " + space.Space.globalSingularGravity);
       centeredGravityButton.setBounds(column(4), row(4), 180, 40);
       centeredGravityButton.addActionListener(this);
       add(centeredGravityButton);
       
       fixedParticleButton = new JButton("diffuse particles = " + space.Space.particles);
       fixedParticleButton.setBounds(column(4), row(3), 180, 40);
       fixedParticleButton.addActionListener(this);
       add(fixedParticleButton);
       
       relativeGravityButton = new JButton();
       if(space.Space.gravityGetsStronger== false){
           relativeGravityButton.setText("quantum motion");
       }else{
           relativeGravityButton.setText("classical motion");
       }
       relativeGravityButton.setBounds(column(4), row(2), 180, 40);
       relativeGravityButton.addActionListener(this);
       add(relativeGravityButton);
       
       
       if(!space.Space.gravityGetsStronger){
            massOfCenter.setVisible(false);
            massOfShip.setVisible(false);
            massOfShipLabel.setVisible(false);
            massOfParticles.setVisible(false);
            massOfCenterLabel.setVisible(false);
            massOfParticlesLabel.setVisible(false);
       }
       
                if(!space.Space.thereIsAShip){
                massOfShip.setVisible(false);
                massOfShipLabel.setVisible(false);
                }
       
    }  // end constructor

    @Override
    public void actionPerformed(ActionEvent e) {
        
        	Object obj = e.getSource();
       
    
        
        
       	if (obj == startAtomButton){
            
          space.Space.globalSingularGravity = true;
           
          
           
                space.Space.globalParticleSize = 4;
                space.Space.globalHelioSize = checkForStallman(32);
                space.Space.globalParticleSizeMultiplier = 8;
                space.Space.globalAmountOfParticles = 6000;
                space.Space.globalSingularGravity = true;
                space.Space.particles = true;
                space.Space.globalEnemySpeed = 1;
                space.Space.gravityGetsStronger = false;
                space.Space.globalhelioSpeed = 10;
                space.Space.globalTimerSpeed = 1;
                space.Space.globalSpeedlimit = 42;// + heroSize;// douglas adams is max
                space.Space.globalMinSpeed = 12;
           
           
           
      
           
          space.Space.screen.start();  
           
           
       	}// end start atom button
        
        
        
             	if (obj == showElementsButton){
            
          space.Space.globalSingularGravity = true;
           
          
           
                space.Space.globalParticleSize = 4;
                space.Space.globalHelioSize = checkForStallman(32);
                space.Space.globalParticleSizeMultiplier = 8;
                space.Space.globalAmountOfParticles = 6000;
                space.Space.globalSingularGravity = true;
                space.Space.particles = true;
                space.Space.globalEnemySpeed = 1;
                space.Space.gravityGetsStronger = false;
                space.Space.globalhelioSpeed = 10;
                space.Space.globalTimerSpeed = 1;
                space.Space.globalSpeedlimit = 42;// + heroSize;// douglas adams is max
                space.Space.globalMinSpeed = 12;
           
           
           
      
           
          space.Space.screen.elementViewerPanel();  
           
           
       	}// end show elements button  
        
        
        
        
        
        if (obj == startPlanetButton){
            
          space.Space.globalSingularGravity = true;
          space.Space.gravityGetsStronger = false;
          space.Space.particles = false;
                   
              space.Space.globalParticleSize = 12;
    space.Space.globalHelioSize = checkForStallman(20);
space.Space.globalParticleSizeMultiplier = 2;
 space.Space.globalAmountOfParticles = (int)(Math.random() * 9) + 1;
    
    
    space.Space.globalEnemySpeed = 1;
    
   space.Space.globalhelioSpeed = 10;
  space.Space.globalTimerSpeed = 40;
  space.Space.globalSpeedlimit = 32;// + heroSize;// douglas adams is max
   space.Space.globalMinSpeed = 6;
   
    space.Space.screen.start(); 
       	}// end start planet button
   
        
        
        
        
        
        
        
        
        
        
        
        
        
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
  ////////////////////                  THE STALLMAN HALO                 //////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
        
        
        
        
        if (obj == stallmanHaloButton){
            
            
                space.Space.thereIsAShip = false;
                space.Space.globalSingularGravity = true;
                space.Space.particles = true;
                space.Space.globalParticleSize = 4;
                space.Space.showStallman = true;//.globalHelioSize = checkForStallman(18);
                space.Space.globalAmountOfParticles = 6000;
                space.Space.gravityGetsStronger = true;
                space.Space.globalParticleMass = 3;  // 3 - super important!
                space.Space.globalEnemySpeed = 1;
                space.Space.gravityWellDistance = 555;  
                space.Space.globalhelioSpeed = 10;
                space.Space.globalTimerSpeed = 1;
                space.Space.globalSpeedlimit = 42;// douglas adams (42) is max
                space.Space.globalMinSpeed = 12;
                space.Space.gravityGetsStronger = false;
                space.Space.screen.start(); 
           
            
       	} // end stallman halo
        
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
  ////////////////////                  THE STALLMAN HALO                 //////////////////////////
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////          
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
        
        
        
        
        
        
        
        
        
        
        
        
        if (obj == startChainedParticleButton){
            
           space.Space.globalSingularGravity = false;
           space.Space.particles = true;
                 space.Space.globalParticleSize = 6;
    space.Space.globalHelioSize = checkForStallman(18);
 space.Space.globalAmountOfParticles = 1000;
  
    
 space.Space.globalEnemySpeed = 1;
    
  space.Space.globalhelioSpeed = 10;
  space.Space.globalTimerSpeed = 1;
 space.Space.globalSpeedlimit = 12;// + heroSize;// douglas adams 42 is max
   space.Space.globalMinSpeed = 2;
   
    space.Space.screen.start(); 
           
            
       	}
        
        
        if (obj == showrms){
            
            
            if(space.Space.showStallman){
              //showrms.setText("Hiding rms");
                showrms.setIcon(new ImageIcon("images/be200x100.png")); 
           space.Space.showStallman = false;   
          // space.Space.gravityGetsStronger = false;
            }else{
            
           //System.exit();
            //showrms.setText("Showing rms");
           showrms.setIcon(new ImageIcon("images/rms200x100.png"));
           space.Space.showStallman = true;
                  // space.Space.gravityGetsStronger = true;

            }
       	}
        
        
       if (obj == bigScreenButton){
            
            space.Space.height = 1000;
            space.Space.width= 1880;
             space.Space.screen.dispose();
            space.Space.screen = new Aframe();
       	}
        if (obj == littleScreenButton){
            
          space.Space.height = 500;
            space.Space.width= 940;
             space.Space.screen.dispose();
            space.Space.screen = new Aframe();
       	}
            if (obj == fullScreenButton){
            
            space.Space.screen.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            space.Space.height = space.Space.screen.getHeight();
            space.Space.width= space.Space.screen.getWidth();
            space.Space.screen.dispose();
            space.Space.screen = new Aframe();
            space.Space.screen.setExtendedState(JFrame.MAXIMIZED_BOTH); 
           // space.Space.height = space.Space.screen.getHeight();
           // space.Space.width= space.Space.screen.getWidth();
            
            space.Space.screen.setVisible(true);
       	}
        
       
        if (obj == quitButton){
            
           //System.exit();
           space.Space.screen.dispose();
            
       	}
        
        
         if (obj == shipButton){
            
           if(!space.Space.thereIsAShip){
           space.Space.thereIsAShip = true;
           shipButton.setText("ship = " + space.Space.thereIsAShip);
           if(space.Space.gravityGetsStronger){
           massOfShip.setVisible(true);
            massOfShipLabel.setVisible(true);
           }
           }else{
           space.Space.thereIsAShip = false;
           shipButton.setText("ship = " + space.Space.thereIsAShip);
           massOfShip.setVisible(false);
            massOfShipLabel.setVisible(false);
           }
            
       	}
        
        
        
        
        if (obj == startButton){
            
            space.Space.screen.start(); 
            
       	}
        if (obj == centeredGravityButton){
            
           if(space.Space.globalSingularGravity){
            space.Space.globalSingularGravity = false; 
            centeredGravityButton.setText("singular gravity = " + space.Space.globalSingularGravity);
            }else{
              space.Space.globalSingularGravity = true; 
              centeredGravityButton.setText("singular gravity = " + space.Space.globalSingularGravity);
            } 
            
       	}
        
        if (obj == linearMovementButton){
            if(space.Space.linearMovement){
            space.Space.linearMovement = false; 
            linearMovementButton.setText("linear movement = " + space.Space.linearMovement);
            }else{
              space.Space.linearMovement = true; 
              linearMovementButton.setText("linear movement = " + space.Space.linearMovement);
            }
            
       	}
        
        if (obj == fixedParticleButton){
            if(space.Space.particles){
            space.Space.particles = false; 
            fixedParticleButton.setText("diffuse particles = " + space.Space.particles);
            }else{
              space.Space.particles = true; 
              fixedParticleButton.setText("diffuse particles = " + space.Space.particles);
            }
            
       	}
        
         if (obj == relativeGravityButton){
            if(space.Space.gravityGetsStronger){
            space.Space.gravityGetsStronger = false; 
            relativeGravityButton.setText("quantum motion");
            massOfCenter.setVisible(false);
            massOfParticles.setVisible(false);
            massOfCenterLabel.setVisible(false);
            massOfParticlesLabel.setVisible(false);
            if(space.Space.thereIsAShip){
            massOfShip.setVisible(false);
            massOfShipLabel.setVisible(false);
            }
            
            
            }else{
              space.Space.gravityGetsStronger = true; 
              relativeGravityButton.setText("classical motion");
                massOfCenter.setVisible(true);
                massOfParticles.setVisible(true);
                massOfCenterLabel.setVisible(true);
                massOfParticlesLabel.setVisible(true);
                if(space.Space.thereIsAShip){
                massOfShip.setVisible(true);
                massOfShipLabel.setVisible(true);
                }
            }
            
       	}
    } // end action event
    
    
  public int checkForStallman(int rtn){
      
      int size = 80;
      
      if(space.Space.showStallman){
       size = 60;   
      }else{
       size = rtn;   
      }
      
      return size;
      
  }  
    
public void checkrmsPic(){
    
     if(space.Space.showStallman){
              //showrms.setText("Hiding rms");
                showrms.setIcon(new ImageIcon("images/rms200x100.png"));
             
            }else{
            
           //System.exit();
            //showrms.setText("Showing rms");
            showrms.setIcon(new ImageIcon("images/be200x100.png"));
          
            }
    
    
}    

    @Override
        public void stateChanged(ChangeEvent e) {
        JSlider source = (JSlider)e.getSource();
       
               if (source == massOfShip) {
            space.Space.globalShipMass = source.getValue();
            massOfShipLabel.setText("<html><h2><font color='white'>mass of ship: </font><font color='red'>" + space.Space.globalShipMass + "</font><h2></html>");
        }
        if (source == massOfCenter) {
            space.Space.massOfCenter = source.getValue();
            massOfCenterLabel.setText("<html><h2><font color='white'>mass of center: </font><font color='red'>" + space.Space.massOfCenter + "</font><h2></html>");
        }
         if (source == massOfParticles) {
            space.Space.globalParticleMass = source.getValue();
            massOfParticlesLabel.setText("<html><h2><font color='white'>mass of particles: </font><font color='red'>" + space.Space.globalParticleMass + "</font><h2></html>");
        }
        if (source == numberOfParticles) {
            space.Space.globalAmountOfParticles = (int)source.getValue();
            //numOfParticles.setText(space.Space.globalAmountOfParticles + " particles");
            numOfParticles.setText("<html><h2><font color='white'># of particles: </font><font color='red'>" + space.Space.globalAmountOfParticles + "</font><h2></html>");
        }
        if (source == sizeOfParticles) {
            space.Space.globalParticleSize  = (int)source.getValue();
            
            sizeOfParticlesLabel.setText("<html><h2><font color='white'>size: </font><font color='red'>" + space.Space.globalParticleSize + "</font><h2></html>");
        }
        if (source == speedOfParticles) {
            space.Space.globalTimerSpeed = (int)source.getValue();
            speedOfParticlesMaxLabel.setText("<html><h2><font color='white'>ms per cycle: </font><font color='red'>" + space.Space.globalTimerSpeed + "</font><h2></html>");
        }
        if (source == speedLimitMaxOfParticles) {
            space.Space.globalSpeedlimit = (int)source.getValue();
            speedLimitMaxOfParticlesLabel.setText("<html><h2><font color='white'>max speed limit: </font><font color='red'>" + space.Space.globalSpeedlimit + "</font></h2></html>");
        }
         if (source == speedLimitMinOfParticles) {
            space.Space.globalMinSpeed = (int)source.getValue();
            speedLimitMinOfParticlesLabel.setText("<html><h2><font color='white'>min speed limit: </font><font color='red'>" + space.Space.globalMinSpeed + "</font></h2></html>");
        }
    } // end state changed

  
        
                //////////////////////////////////////////////////////////////////////////////////////////////////////////
 
private int row(int r){
    int pixelNumber = ((r-1)*(int)(space.Space.height/16))+20;
    return pixelNumber;
}   

private int column(int c){ 
    int columnPixelNumber = 0;
    
    switch(c){  // these arent in cardinal order, i've been readjusting layouts
        //case 1: columnPixelNumber = (space.Space.width/8)*1; break;
            
                case 1: columnPixelNumber   = (int)(space.Space.width*.02); break;
                case 2: columnPixelNumber   = (int)(space.Space.width*.22); break;
                case 3: columnPixelNumber   = (int)(space.Space.width*.32); break;
                case 4: columnPixelNumber   = (int)(space.Space.width*.42); break;
                case 5: columnPixelNumber   = (int)(space.Space.width*.52); break;
                case 6: columnPixelNumber   = (int)(space.Space.width*.62); break;
    }
    return columnPixelNumber;
} // end column
    

////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
     
        
        
        
        
        
        
        
} // end
