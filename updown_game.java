/* up_down �����̸� ������ ������ 0���� 10�����̴�, ��ȸ�� �� 5�� �־�����.*/
import java.util.*;
public class updown_game {

	public static void main(String[] args) {
		int guess_num;
		int real_num=0;
		int count=0;
		
		Scanner scanner=new Scanner(System.in);
		
		real_num=(int)((Math.random()*10)+1);
		for(count=0;count<4;count++)
		{
			System.out.printf("guess real number:");
			guess_num=scanner.nextInt();
			
			if(guess_num==real_num)
			{
				System.out.printf("�����Դϴ�, ����� ���� Ƚ��:%d\n",count+1);
				count=10; // ���� ����
			}
			else if(guess_num<real_num)
				System.out.println("Up, ���� ���� Ƚ��:"+(4-count));
			else
				System.out.println("Down, ���� ���� Ƚ��:"+(4-count));
		}
		if(count<10)
			System.out.println("�� 5���� Ƚ���� ��� ����߽��ϴ�"+"real_num:"+real_num);
	}

}
