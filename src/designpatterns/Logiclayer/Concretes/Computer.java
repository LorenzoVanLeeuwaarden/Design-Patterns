/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Logiclayer.Concretes;

import designpatterns.Logiclayer.Interfaces.IComputer;

/**
 *
 * @author Yoran
 */
public class Computer implements IComputer{
    public String Category;
    public String OS;
    public String RAM;
    public String Processor;
    public String Extras="";
    
    @Override
    public void displaySpecs(){
    System.out.println("Dit zijn mijn Specs: ");
    System.out.println(Category+" - "+OS+" - "+RAM+" - "+Processor);
    }
    
    @Override
    public void displayExtras(){
    System.out.println(Extras);
    }
    
     @Override
    public String getExtras(){
     return Extras;
     }
     
     @Override
     public void setExtras(String newExtras){
     Extras+=newExtras;
     }
    
    @Override
    public String getCategory(){
    return Category;
    }
    
    @Override
    public void setCategory(String newCategory){
    Category=newCategory;
    }
    
    @Override
    public String getOS(){
    return OS;
    }
    
    @Override
    public void setOS(String newOS){
    OS=newOS;
    }
    
    @Override
    public String getRAM(){
    return RAM;
    }
    
    @Override
    public void setRAM(String newRAM){
    RAM=newRAM;
    }
    
    @Override
    public String getProcessor(){
    return Processor;
    }
    
    @Override
    public void setProcessor(String newProcessor){
    Processor=newProcessor;
    }
    
    
    
    
}
