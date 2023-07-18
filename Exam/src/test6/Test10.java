package test6;

import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Test10 {

	private static GregorianCalendar greInstance = new GregorianCalendar();
	
	public static GregorianCalendar getGreInstance() {
		return greInstance;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		
		System.out.print("생일 입력 (yyyy/mm/dd) : ");
		String birth = sc.next();
		String[] bArr = birth.split("/");
		
		int bYear = Integer.parseInt(bArr[0]);
		int bMonth=Integer.parseInt(bArr[1]);
		int bDay=Integer.parseInt(bArr[2]);
		
		int tYear =Calendar.getInstance().get(Calendar.YEAR);
		int tMonth =Calendar.getInstance().get(Calendar.MONTH)+1;
		int tDay =Calendar.getInstance().get(Calendar.DATE);
	
		int totalDays =0;
		
		totalDays+= dayOfYear(tYear,tMonth,tDay);
		
		int yearDays = isLeapYear(bYear) ?  366 :365;
		totalDays += yearDays - dayOfYear(bYear, bMonth, bDay);
		
		for(int year = bYear +1; year < tYear; year++) {
			if(isLeapYear(year)) {
				totalDays+=366;
			}else {
				totalDays+=365;
			}
		}
		System.out.printf("태어난 날 부터 오늘까지 일수 : %d", totalDays);
	
	}

	public static int[] days = { 0, 31, 69, 90, 120, 151, 181, 212, 243, 273, 304, 334};
	
	private static boolean isLeapYear(int year) {
		
		return getGreInstance().isLeapYear(year);
	}

	private static int dayOfYear(int year, int month, int day) {
		return days[month-1] +day + (month >2 && isLeapYear(year) ? 1:0);
	}


	
	
}
