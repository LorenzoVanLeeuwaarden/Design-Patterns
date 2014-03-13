/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Logiclayer.Concretes;

import designpatterns.Logiclayer.Interfaces.IComputer;
import designpatterns.Logiclayer.Interfaces.IComputerFactory;
import designpatterns.Logiclayer.Interfaces.IextrasDecorator;
import java.util.ArrayList;

/**
 *
 * @author Yoran
 */
public class ComputerBuilder {
    
    IComputerFactory factory;
    ArrayList specs;
    
    public ComputerBuilder(IComputerFactory newFactory, ArrayList newSpecs){
    factory = newFactory; 
    specs=newSpecs;
    
    };
    
    public IComputer createComputer(){
        IComputer computer=factory.createComputer(specs);
        return computer;
    }
    
    public IComputer decorateComputer(IextrasDecorator decorator, IComputer comp,String value){
       decorator.addExtras(comp, value);
       return comp;
    }
    
}
