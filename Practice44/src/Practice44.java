import java.util.Arrays;
public class Practice44 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] intArray =  {{1, 2, 3, 4}, {10, 20, 30, 40}, {100, 200, 300, 400}};
		int[] colArray = new int[4];
		int[] rowArray = new int[3];
		int total = 0;
		
		Arrays.fill(colArray, 0);
		Arrays.fill(rowArray, 0);
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(intArray[i][j] + "\t");
				colArray[j] += intArray[i][j];
				rowArray[i] += intArray[i][j];
			}
			System.out.println(rowArray[i]);
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.print(colArray[i] + "\t");
			total += colArray[i];
		} System.out.println(total);

	}

}
