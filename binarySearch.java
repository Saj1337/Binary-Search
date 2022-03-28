package week5Question2;

public class binarySearch {

	public static void main(String[] args) {
		
	    System.out.println(binary(new int[] {3, 4, 5, 6, 7, 8, 9},8));
	}
	private static int binary(int[] array, int target) {
	    int x = 0;
	    int y = array.length - 1;
	    int z;

	    while (x <= y) {
	    	
	        z = (x + y) / 2;
	        
	        if (array[z] == target) {
	        	
	            System.out.println("Number chosen: " + array[z]);
	            return z;
	        }
	        if (array[z] > target) {
	            y = z - 1;
	        } else {
	            x = z + 1;
	        }
	    }
	    return -1;
}}
