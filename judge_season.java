/* month�� �Է¹޾� ������ �޿� �ش��ϴ� ������ �˷��ش�
  ������ �޿� �ش��ϴ� �������� �˷��ش�*/

import java.util.*;
public class judge_season {

	public static void main(String[] args) {
		int month;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("input month:");
		month= scanner.nextInt();
	
		switch(month)
		{
		case 3: case 4: case 5:
			System.out.printf("������ ������ ���Դϴ�./n");
			break;
		case 6: case 7: case 8:
			System.out.printf("������ ������ �����Դϴ�.\n");
			break;
		case 9: case 10: case 11:
			System.out.println("������ ������ �����Դϴ�.\n");
			break;
		case 12: case 1: case 2:
			System.out.println("������ ������ �ܿ��Դϴ�.\n");
			break;
		}
		System.out.printf("%d���� �ش��ϴ� �������� ������ �����ϴ�.\n",month);
		
		if(month==1)
			System.out.println("1�� 1��");
		else if(month==3)
			System.out.println("3�� 1��(������)");
		else if(month==4)
			System.out.println("4�� 8��(����ź����),���±���");
		else if(month==5)
			System.out.println("5�� 5��(��̳�)");
		else if(month==6)
			System.out.println("6�� 6��(������)");
		else if(month==8)
			System.out.println("8�� 15��(������)");
		else if(month==10)
			System.out.println("10�� 3��(��õ��), 10�� 9��(�ѱ۳�)");
		else if(month==12)
			System.out.println("12�� 25��(��ź��)");
		else
			System.out.println("�ش� ������ �������� �����ϴ�.");
	}

}
