/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Logiclayer.Concretes;

import designpatterns.Logiclayer.Interfaces.ICommand;
import designpatterns.Logiclayer.Interfaces.IComputer;
import java.util.ArrayList;

/**
 *
 * @author Yoran
 */
public class sendLaptopOrderCommand implements ICommand {
    ComputerBuilder compBuilder;
    ArrayList orderArray;

    public sendLaptopOrderCommand(ArrayList newOrder){
    orderArray=newOrder;
    }
    
    @Override
    public IComputer execute() {
        compBuilder=new ComputerBuilder(new LaptopFactory(), orderArray);
        IComputer comp =compBuilder.createComputer();
        return comp;
    }
    
    public ComputerBuilder getCompBuilder(){
        return compBuilder;
    }
}
