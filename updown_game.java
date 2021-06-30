/* up_down 게임이며 난수의 범위는 0부터 10사이이다, 기회는 총 5번 주어진다.*/
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
				System.out.printf("정답입니다, 당신의 유추 횟수:%d\n",count+1);
				count=10; // 종료 조건
			}
			else if(guess_num<real_num)
				System.out.println("Up, 남은 유추 횟수:"+(4-count));
			else
				System.out.println("Down, 남은 유추 횟수:"+(4-count));
		}
		if(count<10)
			System.out.println("떙 5번의 횟수를 모두 사용했습니다"+"real_num:"+real_num);
	}

}
