package com.impatient.concurrent;



import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by vashishta on 8/15/16.
 */
public class ProductService {


    private final String LOCK = new String("LOCK");

    private ReentrantLock RE_LOCK = new ReentrantLock(true);

    private static final ConcurrentHashMap<String,String> myConcurrentMap = new ConcurrentHashMap<>();

    static {
        myConcurrentMap.put("A", "Ady");
    }


    public synchronized String getNewMethod() {

        return "new Product";

    }

    public  String getFromMap(String key) {
        return  myConcurrentMap.get(key);
    }


    public String getOldBlock() {

        String value = "";


        synchronized (LOCK) {
            value = "old Product";
        }

        synchronized (this) {
            value = value.toLowerCase();
        }

        return value;


    }

    public String withLockedProduct() {
        if(!RE_LOCK.isLocked()) {
            RE_LOCK.lock();
        }
        String value = "";
        try {
            value = "With Lock";
        } finally {
            RE_LOCK.unlock();
        }
        return value;

    }

}
