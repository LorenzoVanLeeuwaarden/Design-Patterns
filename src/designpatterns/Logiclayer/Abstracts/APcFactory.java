/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Logiclayer.Abstracts;

import designpatterns.Logiclayer.Concretes.Computer;
import designpatterns.Logiclayer.Concretes.ComputerFactory;
import designpatterns.Logiclayer.Interfaces.IComputer;
import java.util.ArrayList;

/**
 *
 * @author Yoran
 */
public abstract class APcFactory extends ComputerFactory{
    @Override
    public IComputer createComputer(ArrayList specs){
        Computer computer = new Computer();
        
        computer.setCategory("Category: PC");
        return computer;
    
    }
}
