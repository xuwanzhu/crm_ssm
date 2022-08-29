package com.qidi.crm_ssm.bean;

public class IndustryStatistics {
	public int educate;//教育
	public int electric;//电子
	public int outtrade;//贸易
	public int hotel;//酒店
	public int estate;//房地产

    public IndustryStatistics() {
    }

    public IndustryStatistics(int educate, int electric, int outtrade, int hotel, int estate) {
        this.educate = educate;
        this.electric = electric;
        this.outtrade = outtrade;
        this.hotel = hotel;
        this.estate = estate;
    }

    public int getEducate() {
        return educate;
    }

    public void setEducate(int educate) {
        this.educate = educate;
    }

    public int getElectric() {
        return electric;
    }

    public void setElectric(int electric) {
        this.electric = electric;
    }

    public int getOuttrade() {
        return outtrade;
    }

    public void setOuttrade(int outtrade) {
        this.outtrade = outtrade;
    }

    public int getHotel() {
        return hotel;
    }

    public void setHotel(int hotel) {
        this.hotel = hotel;
    }

    public int getEstate() {
        return estate;
    }

    public void setEstate(int estate) {
        this.estate = estate;
    }

    @Override
    public String toString() {
        return "IndustryStatistics{" +
                "educate=" + educate +
                ", electric=" + electric +
                ", outtrade=" + outtrade +
                ", hotel=" + hotel +
                ", estate=" + estate +
                '}';
    }
}
