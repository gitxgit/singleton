//Java Singelton class used by multi-threading
public class SingleLog {
	private static SingleLog myLog;

	static{
	    myLog = new SingleLog();
	}
	private SingleLog(){
	}
    public static SingleLog getInstance() {
         return myLog;
    }
    public void testLog(){
    	System.out.println("right...there is only one Log.")
    }
    public static void main(String[] args){
    	SingleLog log = getInstance();
    	log.testLog();
    }
}