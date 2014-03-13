/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Logiclayer.Concretes;

import designpatterns.Logiclayer.Interfaces.IComputer;
import designpatterns.Logiclayer.Interfaces.IComputerFactory;
import java.util.ArrayList;

/**
 *
 * @author Yoran
 */
public class ComputerFactory implements IComputerFactory {
    
    @Override
    public IComputer createComputer(ArrayList specs){
        Computer computer = new Computer();
        
        computer.setCategory("Category: Normale computer niks speciaals");
        computer.setOS(specs.get(0).toString());
        computer.setRAM(specs.get(1).toString());
        computer.setProcessor(specs.get(2).toString());
        return computer;
    
    }
}
