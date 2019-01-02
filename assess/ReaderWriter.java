

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReaderWriterFile 
{
    /*public void writeFile(String path,String message,boolean flag) 
    {
        FileWriter fw=null;
        BufferedWriter bw=null;
        try
        {
            fw=new FileWriter(path,flag);
            bw=new BufferedWriter(fw);
        
            bw.write(message);
            bw.close();
        }
        catch(FileNotFoundException fio)
        {
            System.out.println("PLEASE CHECK LOG FILE"+fio.getMessage());
            
        }
        catch(IOException io)
        {
            System.out.println("PLEASE CHECK LOG FILE"+io.getMessage());
        }
        finally{
            try{
                if(bw!=null){
                    bw.close();
                }
            }
            catch(IOException io)
            {
                System.out.println("PLEASE CHECK LOG FILE"+io.getMessage());
            }
        }
        
    }*/
    public List<Customer> readFile(String path)
    {
        String line=null;
        FileReader fr=null;
        BufferedReader br=null;
        List<Customer> custList=new ArrayList<>();
        try
        {
            fr=new FileReader(path);
            br=new BufferedReader(fr);
            while((line=br.readLine())!=null)
            {
                String data[]=line.split(",");
                int transId=Integer.parseInt(data[0]);
                String custNo=data[1];
                String mobileNo=data[2];
                int plan=Integer.parseInt(data[3]);
                String text=data[4];
                DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
                LocalDateTime date=LocalDateTime.parse(text,formatter);
                int duration=Integer.parseInt(data[5]);
             
                Customer customer=new Customer(transId,custNo,mobileNo,plan,date,duration);
                custList.add(customer);
            }
            br.close();
        }
        catch(FileNotFoundException fio)
        {
            System.out.println(fio.getMessage());
        }
        catch(IOException io)
        {
            System.out.println(io.getMessage());
        }
        finally
        {
            try
            {
                if(br!=null)
                {
                    br.close();
                }
            }
            catch(IOException io)
            {
                System.out.println(io.getMessage());
            }
        }
        return custList;
    }
    public void writeFile(String path,String message)
    {
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
					fw=new FileWriter(path);
					bw=new BufferedWriter(fw);

					bw.write(message);
		}
		catch(FileNotFoundException fio)
        	{
            		System.out.println(fio.getMessage());
       		}
        	catch(IOException io)
        	{
            		System.out.println(io.getMessage());
        	}
        	finally
        	{
            		try
            		{
                		if(br!=null)
                		{
                    			br.close();
                		}
            		}
            		catch(IOException io)
            		{
                		System.out.println(io.getMessage());
            		}
        	}
    }
}