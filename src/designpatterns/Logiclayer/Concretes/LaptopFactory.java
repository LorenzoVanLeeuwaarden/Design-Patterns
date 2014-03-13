/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Logiclayer.Concretes;

import designpatterns.Logiclayer.Abstracts.ALaptopFactory;
import designpatterns.Logiclayer.Interfaces.IComputer;
import java.util.ArrayList;

/**
 *
 * @author Lorenzo
 */
public class LaptopFactory extends ALaptopFactory{
    @Override
    public IComputer createComputer(ArrayList specs){
        IComputer computer = super.createComputer(specs);
        computer.setOS(specs.get(0).toString());
        computer.setRAM(specs.get(1).toString());
        computer.setProcessor(specs.get(2).toString());
        return computer;
    
    }
}
