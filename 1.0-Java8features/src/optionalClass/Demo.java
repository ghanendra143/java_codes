package optionalClass;

import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		String str = "I am using lenovo thinkpad";
		Optional<String> check = Optional.of(str);
		System.out.println(check);
		
		String str2 = null;
		Optional<String> ch = Optional.ofNullable(str2);
		System.out.println(ch);
		
		String s = ch.orElse("\nnull value is present");
		System.out.println(s);
		
	}

}
