package pratice2;
import java.util.Scanner;

public class pratice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("원화를 입력하세요(단위 원)>>");
		Scanner scanner = new Scanner(System.in);
		double w = scanner.nextDouble();
		scanner.close();
		System.out.println(w + "원은 $" + w/1100 + "입니다");
	}

}
