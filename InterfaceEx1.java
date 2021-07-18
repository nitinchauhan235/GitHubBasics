
public interface InterfaceEx1 {

	public void run();
	default void service()
	{
		System.out.println("servicing");
	}
	
	static void maintain()
	{
		System.out.println("maintainance");
	}
}
