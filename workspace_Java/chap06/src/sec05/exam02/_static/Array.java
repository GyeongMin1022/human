package sec05.exam02._static;

public class Array {
	int length;
	int[] arr;
	Array(int length){
		this.length = length;
		arr = new int[length];
		
	}
	
	int get(int index) {
		return arr[index];
	}
}
