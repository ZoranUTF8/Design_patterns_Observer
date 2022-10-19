/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_pattern_example.interfaces;

/**
 *
 * @author zoranhome
 */
public interface Subject {
    
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
    
}
