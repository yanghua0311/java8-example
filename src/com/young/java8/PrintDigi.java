/**
 * 
 */
package com.young.java8;

/**
 * Created by youngwa on 2018��6��25��
 *
 */
public class PrintDigi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		printOut(72364);
	}
	
	public static void printOut(int n){
		if (n >= 10) {
			printOut(n/10);
			System.out.println("��ǰ��ֵ�� " + n/10);
		}
		System.out.print(n % 10);
	}

}
