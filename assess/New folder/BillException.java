public class BillException extends RuntimeException
{
	public BillException(String message)
	{
			System.out.println("PLEASE CHECK THE LOG FILE");
			writerFile.writeFile("D:\\divya\\assess\\log.txt",message);
	}
}