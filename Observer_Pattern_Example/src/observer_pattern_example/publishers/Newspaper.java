/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_pattern_example.publishers;

import java.util.ArrayList;
import observer_pattern_example.interfaces.Observer;
import observer_pattern_example.interfaces.Subject;

/**
 *
 * @author zoranhome
 */
public class Newspaper implements Subject{
    
    private ArrayList<Observer> observers ;
    private String newsText;
    private double newsDate;

    public Newspaper() {
        observers = new ArrayList();
    }

    


    @Override
    public void registerObserver(Observer o) {

        System.out.println("New observer added. Total observers: "+observers.size());
        
        int i = observers.indexOf(o);
        
        if(i < 0){
            observers.add(o);
        }else{
            System.out.println("Observer is already subscribed.");
        }
    }

    @Override
    public void removeObserver(Observer o) {
        
        System.out.println("One observer has been removed");
        
        int i = observers.indexOf(o);

        if (i >= 0) {
            observers.remove(o);
        } else {
            System.out.println("Observer is already deleted");
        }

    }

    @Override
    public void notifyObserver() {
        
        System.out.println("All observers have been notified of the enw change.\n Total observers: "+observers.size());
        
        for (int i = 0; i < observers.size(); i++) {
            
            Observer obs = (Observer)observers.get(i);
            
            obs.update(this.newsText,this.newsDate);
        }
        
    }
    
    void newsChanged(){
        notifyObserver();
    }
    
    
    public void setNews(String newsText,double newsDate){
    this.newsDate=newsDate;
    this.newsText=newsText;
    newsChanged();
    }
    
    
    
    
    
    
}
