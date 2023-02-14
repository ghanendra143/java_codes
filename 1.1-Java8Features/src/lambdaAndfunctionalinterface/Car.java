package lambdaAndfunctionalinterface;

interface CabBooking {
	public void Booking();
}

interface Cab {
	public void Book(String pickup, String drop);
}

interface Sum {
	public int Addition(int a,int b);
}

interface Sqr{
	public int num(int a);
}

class Math implements Sum {

	@Override
	public int Addition(int a, int b) {
		return a+b;
	}
	
}

public class Car {

	public static void main(String[] args) {
//		CabBooking cb = ()->{System.out.println("cab is booked");};
//		cb.Booking();
		
		CabBooking cb = ()->System.out.println("booking...");
		cb.Booking();
		
		Cab cab = (pickup,drop)->System.out.println("picking from : "+pickup+" And Droped at : "+drop);
		cab.Book("airoli", "thane");
		
		Sum add = (a,b)->(a+b);
		System.out.println(add.Addition(5, 3));
		
		Sum obj2 = (a,b)-> {return a+b;};
		System.out.println(obj2.Addition(12, 13));
		
		Sum obj = new Math();
		System.out.println(obj.Addition(6, 8));
		
		Math mt = new Math();
		System.out.println(mt.Addition(12, 10));
		
		Sqr sqr = i->i*i;
		System.out.println("square is : "+sqr.num(17));
	}

}
