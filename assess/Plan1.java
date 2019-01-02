package com.cdr.bin;

public class Plan1 
{
    float baseFare=100.0f;
    int baseTalkTime=200;

    public Plan1() {
        this.baseFare=100.0f;
        this.baseTalkTime=200;
    }
    public Plan1(float baseFare,int baseTalkTime){
        this.baseFare=baseFare;
        this.baseTalkTime=baseTalkTime;
    }

    public float getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(float baseFare) {
        this.baseFare = baseFare;
    }

    public int getBaseTalkTime() {
        return baseTalkTime;
    }

    public void setBaseTalkTime(int baseTalkTime) {
        this.baseTalkTime = baseTalkTime;
    }
    
}
