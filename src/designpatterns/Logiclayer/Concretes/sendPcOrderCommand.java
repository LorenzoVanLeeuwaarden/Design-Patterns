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
public class sendPcOrderCommand implements ICommand {
    ComputerBuilder compBuilder;
    ArrayList orderArray;

    public sendPcOrderCommand(ArrayList newOrder){
    orderArray=newOrder;
    }
    
    @Override
    public IComputer execute() {
        compBuilder=new ComputerBuilder(new PcFactory(), orderArray);
        IComputer comp =compBuilder.createComputer();
        return comp;
    }
    
    public ComputerBuilder getCompBuilder(){
        return compBuilder;
    }
}
