package com.src.GenerateBill;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import com.cdr.bin.*;
public class GenerateBill 
{
    public void printBill(Map<String,List<Customer>> mapCustomer)
    {
        Set<String> setCustomer=mapCustomer.keySet();
        Iterator<String> iterate=setCustomer.iterator();
        Plan1 planOne=null;
        
        String message=null;
        String path=null;
        String line=null;
        int duration=0;
        int totDuration=0;
        int plan;
        while(iterate.hasNext())
        {
            String custNo=iterate.next();
            List<Customer> custList=mapCustomer.get(custNo);
            Iterator<Customer> iter=custList.iterator();
            ReaderWriterFile wr=new ReaderWriterFile();
            path="C:\\Users\\divya\\Desktop\\"+custNo+".txt";
            
            while(iter.hasNext())
            {
                Customer customer=iter.next();
                plan=customer.getPlan();
                message="Bill for "+customer.getCustNo()+"(Plan "+plan+")";
                if(plan==1)
                {
                    planOne=new Plan1();
                }
                else if(plan==2)
                {
                    planOne=new Plan2();
                }
                wr.writeFile(path,message,false);
            } 
            iter=custList.iterator();
            message=String.format("%1$-50s","Item Description");
            wr.writeFile(path,message,true);
            message=String.format("%1$-10s","Amount");
            wr.writeFile(path,message,true);
            message="\n";
            wr.writeFile(path,message,true);
            
            message=String.format("%1$-50s","Base Fare");
            wr.writeFile(path, message, true);
            message=String.format("%1$-10s",planOne.getBaseFare());
            wr.writeFile(path, message, true);
            message="\n";
            wr.writeFile(path, message, true);
            
            while(iter.hasNext())
            {
                Customer customer=iter.next();
                duration=customer.getDuration();
                totDuration+=duration;
            }   
            line="Additional TalkTime Fare "+"("+totDuration+")";
            message=String.format("%1$-50s",line);
            wr.writeFile(path, message,true);
            message=String.format("%1$-10s",totDuration);
            wr.writeFile(path, message, true);
            message="\n";
            wr.writeFile(path, message, true);
            float amountPayable=planOne.getBaseFare()+totDuration;
            String amount=null;
            amount = String.valueOf(amountPayable);
            message=String.format("%1$-10s",amount);
            wr.writeFile(path, message, true);
            message="\n";
            wr.writeFile(path, message, true);
            message="Call Details:\n";
            wr.writeFile(path, message, true);
            message="===============";
            wr.writeFile(path, message, true);
            message=String.format("%1$-30s","Date");
            wr.writeFile(path, message, true);
            message=String.format("%1$-20s","Called Number");
            wr.writeFile(path, message, true);
            message=String.format("%1$-100s","Duration\n");
            wr.writeFile(path, message, true);
            message=String.format("%1$-30s","==============");
            wr.writeFile(path, message, true);
            message=String.format("%1$-20s","==============");
            wr.writeFile(path, message, true);
            message=String.format("%1$-10s","========");
            wr.writeFile(path, message, true);
            message="\n";
            wr.writeFile(path, message, true);
            totDuration=0;
            while(iter.hasNext())
            {
                Customer customer=iter.next();
                LocalDateTime date=customer.getDate();
                DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                String text=date.format(formatter);
                String mobileNo=customer.getMobileNo();
                duration=customer.getDuration();
                
                message=String.format("%1$-30",text);
                wr.writeFile(path, message, true);
                message=String.format("%1$-20",mobileNo);
                wr.writeFile(path, message, true);
                message=String.format("%1$-100",duration);
                wr.writeFile(path, message, true);
                message="\n";
                wr.writeFile(path, message, true);
                totDuration+=duration;
                
            }
            message=String.format("%1$ 70s","==========");
            wr.writeFile(path, message, true);
            message="\n";
            wr.writeFile(path, message, true);
            
            message=String.format("%1$-50s","Total Amount Payable");
            wr.writeFile(path, message,true);
            message=String.format("%1$-20s",totDuration);
            wr.writeFile(path, message,true);
            message=String.format("%1$ 70s","==========");
            wr.writeFile(path, message, true);
            message="\n";
            wr.writeFile(path, message, true);
            
            line="Additional Minutes: "+"("+totDuration+"-"+planOne.getBaseTalkTime()+")";
            message=String.format("%1$-50s",line);
            wr.writeFile(path, message,true);
            
            message=String.format("%1$-20s",totDuration);
            wr.writeFile(path, message,true);
            message="\n";
            wr.writeFile(path, message, true);
            message=String.format("%1$ 70s","==========");
            wr.writeFile(path, message, true);
        }
    }
}
