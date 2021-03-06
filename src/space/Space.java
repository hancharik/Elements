/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package space;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Mark
 */




public class Space {
    

    public static double universalGravitationConstant = 6.673;
    public static double universalGravitationConstantMultiplier = .001;  //this is a double value in powers of ten
    
    public static Aframe screen;// = new Aframe();
    public static double height = 1000;
    public static double width = 1880;
  
    
    public static int globalParticleSize = 16;
    public static double globalParticleMass = 10.0;
    public static double globalShipMass = 10.0;
   public static int globalAmountOfParticles = 1000;
   
   public static int gravityWellDistance = 200;
    public static double massOfCenter = 10.0;
   
    public static boolean globalSingularGravity = true; // when true, there is one point of gravity, when false, chained gravity
     public static boolean particles = false;  // when true, particles start everywhere
     public static boolean showStallman = false;
     public static boolean linearMovement = false;  // when true, this is our original movement 
     public static boolean gravityGetsStronger = true;
     public static boolean allParticlesHaveGravity = false; // leave this off until we get a fast processor!
     public static boolean thereIsAShip = false; // leave this off until we get a fast processor!
     
     public static int globalStallmanSize = 80;// * globalParticleSizeMultiplier;
    public static int globalEnemySpeed = 1;
    
    public static int globalShipSize = 20;
    
    public static int globalShipSpeedLimit = 23;
  
  public static int globalTimerSpeed = 1;
  public static  int globalSpeedlimit = 12;// + heroSize;// douglas adams is max
   public static int globalMinSpeed = 2;
    
   
   // these have yet to be added to the start panel
    public static int globalParticleSizeMultiplier = 3;
    public static int globalhelioSpeed = 10;
   public static int globalHelioSize = 40;// * globalParticleSizeMultiplier;
   
   
   
   
   
   
   
   
   
   
    public static void main(String[] args) {
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.getWidth();
        height = screenSize.getHeight();
        screen = new Aframe(); 
        
        
        
    }
}
