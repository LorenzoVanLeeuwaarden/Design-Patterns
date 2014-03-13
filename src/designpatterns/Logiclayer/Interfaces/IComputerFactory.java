/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.Logiclayer.Interfaces;

import java.util.ArrayList;

/**
 *
 * @author Yoran
 */
public interface IComputerFactory {
    IComputer createComputer(ArrayList specs);
}
