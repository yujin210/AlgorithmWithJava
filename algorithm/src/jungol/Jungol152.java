package jungol;

import java.util.Scanner;

public class Jungol152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int odd = 0;
		int even = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(i == 0 || i % 2 == 0) { // Ȧ�� ��° �Է� (�ε����� 0���� �����ϹǷ� �ε����� 0 Ȥ�� ¦���� ���� Ȧ�� ��° �Է��̴�.)
				odd += arr[i];
			} else { // ¦�� ��° �Է�
				even += arr[i]; 
			}
		}
		
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}