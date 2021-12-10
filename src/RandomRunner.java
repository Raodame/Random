//Comment out the line below when you begin

public class RandomRunner {
	public static void main(String args[]){
		Random r = new Random();
		System.out.println("Integer=" + r.nextInt(5) );
		System.out.println("Double=" + r.nextDouble() );
		System.out.println("Boolean=" + r.nextBoolean() );
	}
}
