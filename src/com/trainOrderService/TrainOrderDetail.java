package com.trainOrderService;

//------------------------------------------------------------------------------
// <wsdl2code-generated>
//    This code was generated by http://www.wsdl2code.com version  2.5
//
// Date Of Creation: 8/8/2013 6:27:41 AM
//    Please dont change this code, regeneration will override your changes
//</wsdl2code-generated>
//
//------------------------------------------------------------------------------
//
//This source code was auto-generated by Wsdl2Code  Version
//

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;

import java.util.Hashtable;

public class TrainOrderDetail implements KvmSerializable {
    
    public String cardType;
    public String idCard;
    public double insurance;
    public boolean insuranceSpecified;
    public int orderDetailId;
    public boolean orderDetailIdSpecified;
    public int orderId;
    public boolean orderIdSpecified;
    public String seatType;
    public float ticketPrice;
    public boolean ticketPriceSpecified;
    public String userName;
    
    public TrainOrderDetail(){}
    
    public TrainOrderDetail(SoapObject soapObject)
    {
        if (soapObject == null)
            return;
        if (soapObject.hasProperty("cardType"))
        {
            Object obj = soapObject.getProperty("cardType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                cardType = j.toString();
            }else if (obj!= null && obj instanceof String){
                cardType = (String) obj;
            }
        }
        if (soapObject.hasProperty("idCard"))
        {
            Object obj = soapObject.getProperty("idCard");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                idCard = j.toString();
            }else if (obj!= null && obj instanceof String){
                idCard = (String) obj;
            }
        }
        if (soapObject.hasProperty("insurance"))
        {
            Object obj = soapObject.getProperty("insurance");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                insurance = Double.parseDouble(j.toString());
            }else if (obj!= null && obj instanceof Number){
                insurance = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("insuranceSpecified"))
        {
            Object obj = soapObject.getProperty("insuranceSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                insuranceSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                insuranceSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("orderDetailId"))
        {
            Object obj = soapObject.getProperty("orderDetailId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                orderDetailId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                orderDetailId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("orderDetailIdSpecified"))
        {
            Object obj = soapObject.getProperty("orderDetailIdSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                orderDetailIdSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                orderDetailIdSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("orderId"))
        {
            Object obj = soapObject.getProperty("orderId");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                orderId = Integer.parseInt(j.toString());
            }else if (obj!= null && obj instanceof Number){
                orderId = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("orderIdSpecified"))
        {
            Object obj = soapObject.getProperty("orderIdSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                orderIdSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                orderIdSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("seatType"))
        {
            Object obj = soapObject.getProperty("seatType");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                seatType = j.toString();
            }else if (obj!= null && obj instanceof String){
                seatType = (String) obj;
            }
        }
        if (soapObject.hasProperty("ticketPrice"))
        {
            Object obj = soapObject.getProperty("ticketPrice");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                ticketPrice = Float.parseFloat(j.toString());
            }else if (obj!= null && obj instanceof Number){
                ticketPrice = (Integer) obj;
            }
        }
        if (soapObject.hasProperty("ticketPriceSpecified"))
        {
            Object obj = soapObject.getProperty("ticketPriceSpecified");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                ticketPriceSpecified = Boolean.parseBoolean(j.toString());
            }else if (obj!= null && obj instanceof Boolean){
                ticketPriceSpecified = (Boolean) obj;
            }
        }
        if (soapObject.hasProperty("userName"))
        {
            Object obj = soapObject.getProperty("userName");
            if (obj != null && obj.getClass().equals(SoapPrimitive.class)){
                SoapPrimitive j =(SoapPrimitive) obj;
                userName = j.toString();
            }else if (obj!= null && obj instanceof String){
                userName = (String) obj;
            }
        }
    }
    @Override
    public Object getProperty(int arg0) {
        switch(arg0){
            case 0:
                return cardType;
            case 1:
                return idCard;
            case 2:
                return insurance;
            case 3:
                return insuranceSpecified;
            case 4:
                return orderDetailId;
            case 5:
                return orderDetailIdSpecified;
            case 6:
                return orderId;
            case 7:
                return orderIdSpecified;
            case 8:
                return seatType;
            case 9:
                return ticketPrice;
            case 10:
                return ticketPriceSpecified;
            case 11:
                return userName;
        }
        return null;
    }
    
    @Override
    public int getPropertyCount() {
        return 12;
    }
    
    @Override
    public void getPropertyInfo(int index, @SuppressWarnings("rawtypes") Hashtable arg1, PropertyInfo info) {
        switch(index){
            case 0:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "cardType";
                break;
            case 1:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "idCard";
                break;
            case 2:
                info.type = Double.class;
                info.name = "insurance";
                break;
            case 3:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "insuranceSpecified";
                break;
            case 4:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "orderDetailId";
                break;
            case 5:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "orderDetailIdSpecified";
                break;
            case 6:
                info.type = PropertyInfo.INTEGER_CLASS;
                info.name = "orderId";
                break;
            case 7:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "orderIdSpecified";
                break;
            case 8:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "seatType";
                break;
            case 9:
                info.type = Float.class;
                info.name = "ticketPrice";
                break;
            case 10:
                info.type = PropertyInfo.BOOLEAN_CLASS;
                info.name = "ticketPriceSpecified";
                break;
            case 11:
                info.type = PropertyInfo.STRING_CLASS;
                info.name = "userName";
                break;
        }
    }
    
    @Override
    public void setProperty(int arg0, Object arg1) {
    }
    
}
