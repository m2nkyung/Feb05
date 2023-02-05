//10개의  숫자를  입력  받아서  배열에  저장 / 10개의  숫자를  화면에  1줄로  출력 / 10개  중에서  가장  큰  숫자를  출력
import java.util.Scanner;
public class Practice45 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int[] arr = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력하세요 : ");
			arr[i] = input.nextInt();
		}
		
		displayArray(arr);

		System.out.println("\n가장 큰 숫자는 " + findMax(arr) + "입니다.");
	}
	
	public static void displayArray(int[] iArray) {
		System.out.println("입력된 숫자는 다음과 같습니다.");
		
		for(int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + "\t");
		}
	}

	public static int findMax(int[] iArray) {
		int max = iArray[0];
		
		for(int i = 1; i < iArray.length; i++) {
			if (max < iArray[i]) {
				max = iArray[i];
			}
		}
		
		return max;
	}
	

}
