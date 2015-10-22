/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package space;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Mark
 */
public class ElementViewer extends JPanel{
   
    
    public ElementViewer(){
            super();
       setLayout(null);
       setBackground(Color.red);
            PeriodicTable pt = new PeriodicTable();
           
            pt.setBounds(0, 0, (int)space.Space.width, (int)space.Space.height);
             add(pt);
             
    }
    
    
    
    
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    
    
   public void getElement(int e){

     String elementName = "test";  
     String elementSymbol = "te";
     int elementNumber = 0; 
     double atomicMass = 0.0;
       
       switch(e){
           
            case 1 :  elementName = "Hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 2 :  elementName = "Helium"; elementSymbol = "He"; elementNumber = e; break;
            case 3 :  elementName = "Lithium"; elementSymbol = "Li"; elementNumber = e; break;
            case 4 :  elementName = "Boron"; elementSymbol = "B"; elementNumber = e; break;
            case 5 :  elementName = "Carbon"; elementSymbol = "C"; elementNumber = e; break;
            case 6 :  elementName = "Nitrogen"; elementSymbol = "N"; elementNumber = e; break;
            case 7 :  elementName = "Oxygen"; elementSymbol = "O"; elementNumber = e; break;
            case 8 :  elementName = "Flourine"; elementSymbol = "F"; elementNumber = e; break;
            case 9 :  elementName = "Neon"; elementSymbol = "Ne"; elementNumber = e; break;
	    case 10 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 11 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 12 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 13 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 14 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 15 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 16 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 17 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 18 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 19 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
	    case 20 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
	    case 21 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 22 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 23 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 24 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 25 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 26 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 27 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 28 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 29 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
	    case 30 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
	    case 31 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 32 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 33 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 34 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 35 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 36 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 37 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 38 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 39 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
	    case 40 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
	    case 41 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 42 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 43 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 44 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 45 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 46 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 47 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 48 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 49 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
	    case 50 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
	    case 51 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 52 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 53 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 54 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 55 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 56 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 57 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 58 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 59 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
	    case 60 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 61 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 62 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 63 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 64 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 65 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 66 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 67 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 168 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 69 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
	    case 70 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 71 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 72 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 73 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 74 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 75 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 76 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 77 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 78 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 79 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
	    case 80 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 81 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 82 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 83 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 84 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 85 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 86 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 87 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 88 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 89 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
	    case 90 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 91 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 92 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 93 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 94 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 95 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 96 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 97 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 98:  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 99 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
	    case 100 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
	    case 101 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 102 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 103 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 104 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 105 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 106 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 107 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 108 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 109 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
	    case 110 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 111 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 112 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 113 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 114 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 115 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 116 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 117 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            case 118 :  elementName = "hydrogen"; elementSymbol = "H"; elementNumber = e; break;
            
            default : elementName = "not an element"; elementSymbol = "NO"; elementNumber = e; break;
       }
       
       
       
       
       
       
       
       
}  // end get element 
    
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    
    
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
    
    
    
    
}
