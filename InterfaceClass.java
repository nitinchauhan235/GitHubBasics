
public class InterfaceClass implements InterfaceEx1 {
	
	public void run() {
		System.out.println("running");
	}

	public void service()
	{
		System.out.println("override interafce service");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceEx1 i1 = new InterfaceClass();
		i1.run();
		i1.service();
//		InterfaceEx1.maintain();
		

	}

}
