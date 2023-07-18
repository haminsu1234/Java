package test6;

import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Test08 {

	public static void main(String[] args) {
		
		int count =0;
		for(int i=2; i<=100; i++) {
			if(isPrime(i)) {
				System.out.println(i+"");
				count++;
			}
		}
		System.out.printf("\n2~100까지 소수는 모두 %d개입니다.",count);
	}
	
	public static boolean isPrime(int x) {
		for(int i=2; i<x; i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}
		
	
}
