public class Run
{
	public static void main(String args[]){
		Marker black =new Marker();		// loading marker class in memory
		Marker white =new Marker();
		Marker green =new Marker();
		System.out.println( black );
		System.out.println( white );
		System.out.println( green );

		black.write();
	}
}