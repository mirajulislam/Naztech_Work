package Array;

public class Array_2D {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if(arr[i][j]==arr[2][2]) {
					System.out.println("Right");
					break;
				}
				
				
			}
		}	

}
	}
