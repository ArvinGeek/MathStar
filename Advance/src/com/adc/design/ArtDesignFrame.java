package com.adc.design;

//package com.example.artdesign.ui;

import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import com.adc.advance.SevenGraphic;
public class ArtDesignFrame extends JFrame{

    /**
     * 
     */
    private static final long serialVersionUID = -1760723807752896879L;
    
    public ArtDesignFrame() {
        // TODO Auto-generated constructor stub
        this.add(new ArtDesignPanel());
        this.addWindowListener(new WindowListener() {
            
            @Override
            public void windowOpened(WindowEvent arg0) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void windowIconified(WindowEvent arg0) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void windowDeiconified(WindowEvent arg0) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void windowDeactivated(WindowEvent arg0) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void windowClosing(WindowEvent arg0) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void windowClosed(WindowEvent arg0) {
                // TODO Auto-generated method stub
                System.exit(0);
            }
            
            @Override
            public void windowActivated(WindowEvent arg0) {
                // TODO Auto-generated method stub
                
            }
        });
        this.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        ArtDesignFrame frame = new ArtDesignFrame();
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setSize(360, 360);
    }

}