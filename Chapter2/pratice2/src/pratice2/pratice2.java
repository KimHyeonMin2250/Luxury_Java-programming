package pratice2;
import java.util.Scanner;

public class pratice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���ڸ��� ���� �Է�(10~99)>>");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		if(a/10 == a%10)
		{
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else
		{
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		}
		scanner.close();
	}

}
