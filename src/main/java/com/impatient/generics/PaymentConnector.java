package com.impatient.generics;

/**
 * Created by vashishta on 8/16/16.
 */
public class PaymentConnector <R,S> {

    private R r;
    private S s;

    public PaymentConnector(R r, S s) {
        this.r = r;
        this.s = s;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public void process() {
        System.out.println(r);
        System.out.println(s);
    }

}
