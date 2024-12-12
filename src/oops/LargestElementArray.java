package oops;

public class LargestElementArray {

	public static void main(String[] args) {
		int[]array= {10,45,23,56,12};
		int largest =array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		}
		System.out.println("Largest elements:"+largest);

	}

}
