/* month를 입력받아 현재의 달에 해당하는 계절을 알려준다
  현재의 달에 해당하는 공휴일을 알려준다*/

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
			System.out.printf("현재의 게절은 봄입니다./n");
			break;
		case 6: case 7: case 8:
			System.out.printf("현재의 계절은 여름입니다.\n");
			break;
		case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을입니다.\n");
			break;
		case 12: case 1: case 2:
			System.out.println("현재의 계절은 겨울입니다.\n");
			break;
		}
		System.out.printf("%d월에 해당하는 공휴일은 다음과 같습니다.\n",month);
		
		if(month==1)
			System.out.println("1월 1일");
		else if(month==3)
			System.out.println("3월 1일(삼일절)");
		else if(month==4)
			System.out.println("4월 8일(석가탄신일),음력기준");
		else if(month==5)
			System.out.println("5월 5일(어린이날)");
		else if(month==6)
			System.out.println("6월 6일(현충일)");
		else if(month==8)
			System.out.println("8월 15일(광복절)");
		else if(month==10)
			System.out.println("10월 3일(개천절), 10월 9일(한글날)");
		else if(month==12)
			System.out.println("12월 25일(성탄절)");
		else
			System.out.println("해당 월에는 공휴일이 없습니다.");
	}

}
