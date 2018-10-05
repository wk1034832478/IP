package hyywk.home;

public class Main {
	public static void main(String[] args) {
		IPGet ipGet = new IPGet();
		try{
			System.out.println( ipGet.getIP() );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
