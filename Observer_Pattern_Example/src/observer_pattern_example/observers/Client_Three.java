/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_pattern_example.observers;

import observer_pattern_example.interfaces.Observer;
import observer_pattern_example.interfaces.Subject;

/**
 *
 * @author zoranhome
 */
public class Client_Three implements Observer{
    
    private String newsText;
    private double newsDate;
    private Subject newsPaper;

    public Client_Three(Subject newsPaper) {
        this.newsPaper = newsPaper;
        newsPaper.registerObserver(this);
    }
    

     @Override
    public void update(String newsText, double newsDate) {
        this.newsText=newsText;
        this.newsDate=newsDate;
        
    }
    
    
    void clientStatus(){
        System.out.println("Client 2 has been updated with the new data which is: "+newsText+" on date: "+newsDate);
    }
}
