package dp.actional.Strategy2;

public class Strategy2Main {
	public static void main(String[] args) {
		//int[] a = {9, 5, 3, 7, 1};
		Cat[] a = {new Cat(5, 5), new Cat(3, 3), new Cat(1, 1)};
		
		java.util.Arrays.sort(a);
		DataSorter.p(a);
		
		Dog[] a2 = {new Dog(5), new Dog(3), new Dog(1)};
		DataSorter.sort(a2);
		DataSorter.p(a2);
		
		
	}
}
