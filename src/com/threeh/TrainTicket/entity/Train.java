package com.threeh.trainticket.entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: pjq
 * Date: 13-8-9
 * Time: 下午4:21
 * To change this template use File | Settings | File Templates.
 */
public class Train implements Serializable {
    private DGTicketPrice trainCodeAndPrice;

    public DGTicketPrice getTrainCodeAndPrice() {
        return trainCodeAndPrice;
    }

    public void setTrainCodeAndPrice(DGTicketPrice trainCodeAndPrice) {
        this.trainCodeAndPrice = trainCodeAndPrice;
    }
}
