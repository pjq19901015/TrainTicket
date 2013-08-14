package com.threeh.trainticket.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: pjq
 * Date: 13-8-9
 * Time: 下午4:18
 * To change this template use File | Settings | File Templates.
 */
public class Trains implements Serializable {
    private List<DGTicketPrice> trainCodeAndPriceList;

    public List<DGTicketPrice> getTrainCodeAndPriceList() {
        return trainCodeAndPriceList;
    }

    public void setTrainCodeAndPriceList(List<DGTicketPrice> trainCodeAndPriceList) {
        this.trainCodeAndPriceList = trainCodeAndPriceList;
    }
}
