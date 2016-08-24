package com.impatient.concurrent.spider;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by vashishta on 8/24/16.
 */
public class ScannerOne implements Runnable {
    @Override
    public void run() {

        try {
            System.out.println("Starting Scanner One");
            URL url = new URL("http://www.usdirectory.com/sl/70489448/index.htm?wr=1&afid=2145");
            System.out.println(url.getContent());
            System.out.println("Ending Scanner One");
        } catch (MalformedURLException murl) {

        } catch (IOException ioe) {

        }

    }
}
