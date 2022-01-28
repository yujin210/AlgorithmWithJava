package doit.chap04;

import java.util.Scanner;

// int형 큐의 사용 예

public class IntQueueTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntQueue s = new IntQueue(64);	// 최대 64개를 인큐할 수 있는 큐
		
		while(true) {
			System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity());
			System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (0)종료 : ");
			
			int menu = sc.nextInt();
		
			if (menu == 0)
				break;
			
			switch(menu) {
				case 1:
					System.out.print("데이터 : ");
					int x = sc.nextInt();
					try {
						s.enque(x);
					} catch (IntQueue.OverflowIntQueueException e) {
						System.out.println("큐가 가득 찼습니다.");
					}
					break;
					
				case 2:
					try {
						x = s.deque();
						System.out.println("디큐한 데이터는 " + x + "입니다.");
					} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비어 있습니다.");
					} 
					break;
					
				case 3:
					try {
						x = s.peek();
						System.out.println("피크한 데이터는 " + x + "입니다.");
					} catch (IntQueue.EmptyIntQueueException e) {
						System.out.println("큐가 비어 있습니다.");
					}
					break;
					
				case 4:
					s.dump();
					break;
			}
		}
	}
}

