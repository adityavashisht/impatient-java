package com.impatient.generics;

/**
 * Created by vashishta on 8/16/16.
 */
public class PaymentConnectorDriver {

    public static void main(String [] args) {

        AuthorizeRequest authorizeRequest = new AuthorizeRequest();
        AuthorizeResponse authorizeResponse = new AuthorizeResponse();

        PaymentConnector<AuthorizeRequest,AuthorizeResponse> connector = new PaymentConnector<>(authorizeRequest, authorizeResponse);

        connector.process();

        PaypalRequest paypalRequest = new PaypalRequest();
        PaypalResponse paypalResponse = new PaypalResponse();

        PaymentConnector<PaypalRequest, PaypalResponse> paymentConnector = new PaymentConnector<>(paypalRequest, paypalResponse);
        paymentConnector.process();



    }
}
