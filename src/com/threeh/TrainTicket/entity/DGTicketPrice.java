package com.threeh.trainticket.entity;

import java.io.Serializable;

public class DGTicketPrice implements Serializable {
    public String beginCityPy;
    public String beginStationPy;
    public String costTime;
    public int distance;
    public boolean distanceSpecified;
    public int dzDay;
    public boolean dzDaySpecified;
    public String endCity;
    public String endStationPy;
    public String endTime;
    public int fdPriceId;
    public boolean fdPriceIdSpecified;
    public int gwYp;
    public boolean gwYpSpecified;
    public String gws;
    public int gwsOk;
    public boolean gwsOkSpecified;
    public String gwx;
    public int gwxOk;
    public boolean gwxOkSpecified;
    public int hasYpInfo;
    public boolean hasYpInfoSpecified;
    public int isOk;
    public boolean isOkSpecified;
    public int isSf;
    public boolean isSfSpecified;
    public int isZd;
    public boolean isZdSpecified;
    public int rwYp;
    public boolean rwYpSpecified;
    public String rws;
    public int rwsOk;
    public boolean rwsOkSpecified;
    public String rwx;
    public int rwxOk;
    public boolean rwxOkSpecified;
    public String rz;
    public String rz1;
    public int rz1Ok;
    public boolean rz1OkSpecified;
    public int rz1Yp;
    public boolean rz1YpSpecified;
    public String rz2;
    public int rz2Ok;
    public boolean rz2OkSpecified;
    public int rz2Yp;
    public boolean rz2YpSpecified;
    public int rzOk;
    public boolean rzOkSpecified;
    public int rzYp;
    public boolean rzYpSpecified;
    public String seatType;
    public String sfz;
    public String startCity;
    public String startTime;
    public String tdz;
    public int tdzOk;
    public boolean tdzOkSpecified;
    public int tdzYp;
    public boolean tdzYpSpecified;
    public String trainCode;
    public String trainType;
    public int typeId;
    public boolean typeIdSpecified;
    public String wz;
    public int wzOk;
    public boolean wzOkSpecified;
    public int wzYp;
    public boolean wzYpSpecified;
    public int ywYp;
    public boolean ywYpSpecified;
    public String yws;
    public int ywsOk;
    public boolean ywsOkSpecified;
    public String ywx;
    public int ywxOk;
    public boolean ywxOkSpecified;
    public String ywz;
    public int ywzOk;
    public boolean ywzOkSpecified;
    public String yz;
    public int yzOk;
    public boolean yzOkSpecified;
    public int yzYp;
    public boolean yzYpSpecified;
    public String zdz;
    private boolean  isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public DGTicketPrice(){}

    public DGTicketPrice(String trainCode, String trainType) {
        this.trainCode = trainCode;
        this.trainType = trainType;
    }

    public String getBeginCityPy() {
        return beginCityPy;
    }

    public void setBeginCityPy(String beginCityPy) {
        this.beginCityPy = beginCityPy;
    }

    public String getBeginStationPy() {
        return beginStationPy;
    }

    public void setBeginStationPy(String beginStationPy) {
        this.beginStationPy = beginStationPy;
    }

    public String getCostTime() {
        return costTime;
    }

    public void setCostTime(String costTime) {
        this.costTime = costTime;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isDistanceSpecified() {
        return distanceSpecified;
    }

    public void setDistanceSpecified(boolean distanceSpecified) {
        this.distanceSpecified = distanceSpecified;
    }

    public int getDzDay() {
        return dzDay;
    }

    public void setDzDay(int dzDay) {
        this.dzDay = dzDay;
    }

    public boolean isDzDaySpecified() {
        return dzDaySpecified;
    }

    public void setDzDaySpecified(boolean dzDaySpecified) {
        this.dzDaySpecified = dzDaySpecified;
    }

    public String getEndCity() {
        return endCity;
    }

    public void setEndCity(String endCity) {
        this.endCity = endCity;
    }

    public String getEndStationPy() {
        return endStationPy;
    }

    public void setEndStationPy(String endStationPy) {
        this.endStationPy = endStationPy;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getFdPriceId() {
        return fdPriceId;
    }

    public void setFdPriceId(int fdPriceId) {
        this.fdPriceId = fdPriceId;
    }

    public boolean isFdPriceIdSpecified() {
        return fdPriceIdSpecified;
    }

    public void setFdPriceIdSpecified(boolean fdPriceIdSpecified) {
        this.fdPriceIdSpecified = fdPriceIdSpecified;
    }

    public int getGwYp() {
        return gwYp;
    }

    public void setGwYp(int gwYp) {
        this.gwYp = gwYp;
    }

    public boolean isGwYpSpecified() {
        return gwYpSpecified;
    }

    public void setGwYpSpecified(boolean gwYpSpecified) {
        this.gwYpSpecified = gwYpSpecified;
    }

    public String getGws() {
        return gws;
    }

    public void setGws(String gws) {
        this.gws = gws;
    }

    public int getGwsOk() {
        return gwsOk;
    }

    public void setGwsOk(int gwsOk) {
        this.gwsOk = gwsOk;
    }

    public boolean isGwsOkSpecified() {
        return gwsOkSpecified;
    }

    public void setGwsOkSpecified(boolean gwsOkSpecified) {
        this.gwsOkSpecified = gwsOkSpecified;
    }

    public String getGwx() {
        return gwx;
    }

    public void setGwx(String gwx) {
        this.gwx = gwx;
    }

    public int getGwxOk() {
        return gwxOk;
    }

    public void setGwxOk(int gwxOk) {
        this.gwxOk = gwxOk;
    }

    public boolean isGwxOkSpecified() {
        return gwxOkSpecified;
    }

    public void setGwxOkSpecified(boolean gwxOkSpecified) {
        this.gwxOkSpecified = gwxOkSpecified;
    }

    public int getHasYpInfo() {
        return hasYpInfo;
    }

    public void setHasYpInfo(int hasYpInfo) {
        this.hasYpInfo = hasYpInfo;
    }

    public boolean isHasYpInfoSpecified() {
        return hasYpInfoSpecified;
    }

    public void setHasYpInfoSpecified(boolean hasYpInfoSpecified) {
        this.hasYpInfoSpecified = hasYpInfoSpecified;
    }

    public int getOk() {
        return isOk;
    }

    public void setOk(int ok) {
        isOk = ok;
    }

    public boolean isOkSpecified() {
        return isOkSpecified;
    }

    public void setOkSpecified(boolean okSpecified) {
        isOkSpecified = okSpecified;
    }

    public int getSf() {
        return isSf;
    }

    public void setSf(int sf) {
        isSf = sf;
    }

    public boolean isSfSpecified() {
        return isSfSpecified;
    }

    public void setSfSpecified(boolean sfSpecified) {
        isSfSpecified = sfSpecified;
    }

    public int getZd() {
        return isZd;
    }

    public void setZd(int zd) {
        isZd = zd;
    }

    public boolean isZdSpecified() {
        return isZdSpecified;
    }

    public void setZdSpecified(boolean zdSpecified) {
        isZdSpecified = zdSpecified;
    }

    public int getRwYp() {
        return rwYp;
    }

    public void setRwYp(int rwYp) {
        this.rwYp = rwYp;
    }

    public boolean isRwYpSpecified() {
        return rwYpSpecified;
    }

    public void setRwYpSpecified(boolean rwYpSpecified) {
        this.rwYpSpecified = rwYpSpecified;
    }

    public String getRws() {
        return rws;
    }

    public void setRws(String rws) {
        this.rws = rws;
    }

    public int getRwsOk() {
        return rwsOk;
    }

    public void setRwsOk(int rwsOk) {
        this.rwsOk = rwsOk;
    }

    public boolean isRwsOkSpecified() {
        return rwsOkSpecified;
    }

    public void setRwsOkSpecified(boolean rwsOkSpecified) {
        this.rwsOkSpecified = rwsOkSpecified;
    }

    public String getRwx() {
        return rwx;
    }

    public void setRwx(String rwx) {
        this.rwx = rwx;
    }

    public int getRwxOk() {
        return rwxOk;
    }

    public void setRwxOk(int rwxOk) {
        this.rwxOk = rwxOk;
    }

    public boolean isRwxOkSpecified() {
        return rwxOkSpecified;
    }

    public void setRwxOkSpecified(boolean rwxOkSpecified) {
        this.rwxOkSpecified = rwxOkSpecified;
    }

    public String getRz() {
        return rz;
    }

    public void setRz(String rz) {
        this.rz = rz;
    }

    public String getRz1() {
        return rz1;
    }

    public void setRz1(String rz1) {
        this.rz1 = rz1;
    }

    public int getRz1Ok() {
        return rz1Ok;
    }

    public void setRz1Ok(int rz1Ok) {
        this.rz1Ok = rz1Ok;
    }

    public boolean isRz1OkSpecified() {
        return rz1OkSpecified;
    }

    public void setRz1OkSpecified(boolean rz1OkSpecified) {
        this.rz1OkSpecified = rz1OkSpecified;
    }

    public int getRz1Yp() {
        return rz1Yp;
    }

    public void setRz1Yp(int rz1Yp) {
        this.rz1Yp = rz1Yp;
    }

    public boolean isRz1YpSpecified() {
        return rz1YpSpecified;
    }

    public void setRz1YpSpecified(boolean rz1YpSpecified) {
        this.rz1YpSpecified = rz1YpSpecified;
    }

    public String getRz2() {
        return rz2;
    }

    public void setRz2(String rz2) {
        this.rz2 = rz2;
    }

    public int getRz2Ok() {
        return rz2Ok;
    }

    public void setRz2Ok(int rz2Ok) {
        this.rz2Ok = rz2Ok;
    }

    public boolean isRz2OkSpecified() {
        return rz2OkSpecified;
    }

    public void setRz2OkSpecified(boolean rz2OkSpecified) {
        this.rz2OkSpecified = rz2OkSpecified;
    }

    public int getRz2Yp() {
        return rz2Yp;
    }

    public void setRz2Yp(int rz2Yp) {
        this.rz2Yp = rz2Yp;
    }

    public boolean isRz2YpSpecified() {
        return rz2YpSpecified;
    }

    public void setRz2YpSpecified(boolean rz2YpSpecified) {
        this.rz2YpSpecified = rz2YpSpecified;
    }

    public int getRzOk() {
        return rzOk;
    }

    public void setRzOk(int rzOk) {
        this.rzOk = rzOk;
    }

    public boolean isRzOkSpecified() {
        return rzOkSpecified;
    }

    public void setRzOkSpecified(boolean rzOkSpecified) {
        this.rzOkSpecified = rzOkSpecified;
    }

    public int getRzYp() {
        return rzYp;
    }

    public void setRzYp(int rzYp) {
        this.rzYp = rzYp;
    }

    public boolean isRzYpSpecified() {
        return rzYpSpecified;
    }

    public void setRzYpSpecified(boolean rzYpSpecified) {
        this.rzYpSpecified = rzYpSpecified;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getSfz() {
        return sfz;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    public String getStartCity() {
        return startCity;
    }

    public void setStartCity(String startCity) {
        this.startCity = startCity;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getTdz() {
        return tdz;
    }

    public void setTdz(String tdz) {
        this.tdz = tdz;
    }

    public int getTdzOk() {
        return tdzOk;
    }

    public void setTdzOk(int tdzOk) {
        this.tdzOk = tdzOk;
    }

    public boolean isTdzOkSpecified() {
        return tdzOkSpecified;
    }

    public void setTdzOkSpecified(boolean tdzOkSpecified) {
        this.tdzOkSpecified = tdzOkSpecified;
    }

    public int getTdzYp() {
        return tdzYp;
    }

    public void setTdzYp(int tdzYp) {
        this.tdzYp = tdzYp;
    }

    public boolean isTdzYpSpecified() {
        return tdzYpSpecified;
    }

    public void setTdzYpSpecified(boolean tdzYpSpecified) {
        this.tdzYpSpecified = tdzYpSpecified;
    }

    public String getTrainCode() {
        return trainCode;
    }

    public void setTrainCode(String trainCode) {
        this.trainCode = trainCode;
    }

    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public boolean isTypeIdSpecified() {
        return typeIdSpecified;
    }

    public void setTypeIdSpecified(boolean typeIdSpecified) {
        this.typeIdSpecified = typeIdSpecified;
    }

    public String getWz() {
        return wz;
    }

    public void setWz(String wz) {
        this.wz = wz;
    }

    public int getWzOk() {
        return wzOk;
    }

    public void setWzOk(int wzOk) {
        this.wzOk = wzOk;
    }

    public boolean isWzOkSpecified() {
        return wzOkSpecified;
    }

    public void setWzOkSpecified(boolean wzOkSpecified) {
        this.wzOkSpecified = wzOkSpecified;
    }

    public int getWzYp() {
        return wzYp;
    }

    public void setWzYp(int wzYp) {
        this.wzYp = wzYp;
    }

    public boolean isWzYpSpecified() {
        return wzYpSpecified;
    }

    public void setWzYpSpecified(boolean wzYpSpecified) {
        this.wzYpSpecified = wzYpSpecified;
    }

    public int getYwYp() {
        return ywYp;
    }

    public void setYwYp(int ywYp) {
        this.ywYp = ywYp;
    }

    public boolean isYwYpSpecified() {
        return ywYpSpecified;
    }

    public void setYwYpSpecified(boolean ywYpSpecified) {
        this.ywYpSpecified = ywYpSpecified;
    }

    public String getYws() {
        return yws;
    }

    public void setYws(String yws) {
        this.yws = yws;
    }

    public int getYwsOk() {
        return ywsOk;
    }

    public void setYwsOk(int ywsOk) {
        this.ywsOk = ywsOk;
    }

    public boolean isYwsOkSpecified() {
        return ywsOkSpecified;
    }

    public void setYwsOkSpecified(boolean ywsOkSpecified) {
        this.ywsOkSpecified = ywsOkSpecified;
    }

    public String getYwx() {
        return ywx;
    }

    public void setYwx(String ywx) {
        this.ywx = ywx;
    }

    public int getYwxOk() {
        return ywxOk;
    }

    public void setYwxOk(int ywxOk) {
        this.ywxOk = ywxOk;
    }

    public boolean isYwxOkSpecified() {
        return ywxOkSpecified;
    }

    public void setYwxOkSpecified(boolean ywxOkSpecified) {
        this.ywxOkSpecified = ywxOkSpecified;
    }

    public String getYwz() {
        return ywz;
    }

    public void setYwz(String ywz) {
        this.ywz = ywz;
    }

    public int getYwzOk() {
        return ywzOk;
    }

    public void setYwzOk(int ywzOk) {
        this.ywzOk = ywzOk;
    }

    public boolean isYwzOkSpecified() {
        return ywzOkSpecified;
    }

    public void setYwzOkSpecified(boolean ywzOkSpecified) {
        this.ywzOkSpecified = ywzOkSpecified;
    }

    public String getYz() {
        return yz;
    }

    public void setYz(String yz) {
        this.yz = yz;
    }

    public int getYzOk() {
        return yzOk;
    }

    public void setYzOk(int yzOk) {
        this.yzOk = yzOk;
    }

    public boolean isYzOkSpecified() {
        return yzOkSpecified;
    }

    public void setYzOkSpecified(boolean yzOkSpecified) {
        this.yzOkSpecified = yzOkSpecified;
    }

    public int getYzYp() {
        return yzYp;
    }

    public void setYzYp(int yzYp) {
        this.yzYp = yzYp;
    }

    public boolean isYzYpSpecified() {
        return yzYpSpecified;
    }

    public void setYzYpSpecified(boolean yzYpSpecified) {
        this.yzYpSpecified = yzYpSpecified;
    }

    public String getZdz() {
        return zdz;
    }

    public void setZdz(String zdz) {
        this.zdz = zdz;
    }
}
