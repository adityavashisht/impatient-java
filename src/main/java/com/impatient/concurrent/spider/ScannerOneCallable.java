package com.impatient.concurrent.spider;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;


/**
 * Created by vashishta on 8/24/16.
 */
public class ScannerOneCallable implements Callable<Object> {

    @Override
    public Object call() throws Exception {

        Object content = null;
        try {
            System.out.println("Starting Callable One");
            URL url = new URL("http://www.usdirectory.com/sl/70489448/index.htm?wr=1&afid=2145");
            content = url.getContent();
            System.out.println("Ending Callable One " + content);
        } catch (MalformedURLException murl) {

        } catch (IOException ioe) {

        }

        return content;
    }
}
