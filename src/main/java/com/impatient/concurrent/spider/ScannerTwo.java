package com.impatient.concurrent.spider;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by vashishta on 8/24/16.
 */
public class ScannerTwo implements Runnable {


    @Override
    public void run() {

        try {
            System.out.println("Starting Scanner Two");
            String link ="http://www.usdirectory.com/sl/70489621/index.htm?wr=1&afid=2145";
            URL url = new URL(link);
            System.out.println(url.getContent());
            System.out.println("Ending Scanner Two");

        } catch (MalformedURLException murl) {

        } catch (IOException ioe) {

        }

    }
}
