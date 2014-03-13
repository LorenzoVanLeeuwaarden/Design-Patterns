/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Logiclayer.Concretes;

import designpatterns.Logiclayer.Interfaces.IComputer;
import designpatterns.Logiclayer.Interfaces.IextrasDecorator;

/**
 *
 * @author Yoran
 */
public class WebcamDecorator implements IextrasDecorator {
    
    @Override
    public void addExtras(IComputer computer, String value){
    computer.setExtras("Webcam: "+value+" ");  
    }
    
}
