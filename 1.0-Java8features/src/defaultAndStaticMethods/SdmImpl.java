package defaultAndStaticMethods;

public class SdmImpl implements StaticDefaultMethods {
	
	public static void main(String[] args) {
		
		StaticDefaultMethods.mul(3, 4);
		SdmImpl obj = new SdmImpl();
		obj.sum(5, 3);
		obj.print();
		obj.sub(6, 2);
	}

	@Override
	public void sum(int a, int b) {
		System.out.println("sum is : "+(a+b));
	}


}
