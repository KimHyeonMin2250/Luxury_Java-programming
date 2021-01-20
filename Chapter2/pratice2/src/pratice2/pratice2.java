package pratice2;
import java.util.Scanner;

public class pratice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("두자리수 정수 입력(10~99)>>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a/10 == a%10)
		{
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}
		else
		{
			System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");
		}
		scanner.close();
	}

}
