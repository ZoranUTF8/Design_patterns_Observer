/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_pattern_example;

import observer_pattern_example.observers.Client_One;
import observer_pattern_example.observers.Client_Three;
import observer_pattern_example.observers.Client_Two;
import observer_pattern_example.publishers.Newspaper;

/**
 *
 * @author zoranhome
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Newspaper np = new Newspaper();

        Client_One clientOne = new Client_One(np);

        Client_Two clientTwo = new Client_Two(np);

        Client_Three clientThree = new Client_Three(np);

//        Change news data and see how the observers get notified
        np.setNews("This is news text 1", 22.32);

        clientOne.clientStatus();

    }

}
