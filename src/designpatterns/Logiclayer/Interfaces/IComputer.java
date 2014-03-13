/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Logiclayer.Interfaces;

/**
 *
 * @author Yoran
 */
public interface IComputer {
    public String Category="";
    public String OS="";
    public String RAM="";
    public String Processor="";
    
    public void displaySpecs();
    public void displayExtras();
    public String getExtras();
    public void setExtras(String newExtras);
    public void setCategory(String newCategory);
    public String getCategory();
    public void setOS(String newOS);
    public String getOS();
    public void setRAM(String newRAM);
    public String getRAM();
    public void setProcessor(String newProcessor);
    public String getProcessor();
}
