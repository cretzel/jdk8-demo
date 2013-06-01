import java.util.*;
import java.util.function.*;

class Main1 {

    public static void main(String[] args) {
	System.out.println("Hello jdk8");
	testLambda1();
    }

    public static void testLambda1() {
	List<Integer> integers = new ArrayList<>();
	integers.add(1);
	integers.add(2);
	integers.add(3);

	integers.forEach(i -> System.out.println(i*2));
	
	List<Integer> result = map(integers, i->i*2);
	System.out.println(result);
    }

    public static <T,R> List<R> map(List<T> list, Function<T,R> f) {
	List<R> result = new ArrayList<>();
	for (T t : list) {
	    result.add(f.apply(t));
	}
	return result;
    } 
}