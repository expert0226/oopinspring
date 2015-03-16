package reference;

public class CallByReference2 {
	public static void main(String[] args) {
		Animal ref_a = new Animal();
		Animal ref_b = ref_a;

		System.out.println(ref_a); // reference.Animal@15db9742
		System.out.println(ref_b); // 바로 위와 같은 값이 출력된다.
	}
}