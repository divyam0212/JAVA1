package com.cdr.bin;
import com.cdr.bin.Plan1;
public class Plan2 extends Plan1
{
    public Plan2() {
        this.baseFare=200.0f;
        this.baseTalkTime=400;
    }

    public Plan2(float baseFare, int baseTalkTime) {
        super(200.0f,400);
    }
        
}