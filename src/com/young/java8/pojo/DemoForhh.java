/**
 * 
 */
package com.young.java8.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by youngwa on 2018��5��11��
 *
 */
public class DemoForhh {
	Map<Integer, Integer[]> groupMap = new HashMap<Integer, Integer[]>();
	static List<List<Integer>> temparr = new ArrayList<>();

	public static void main(String[] args) {
		List<Integer> arr1 = new ArrayList<>();
		arr1.add(1);
		arr1.add(4);
		List<Integer> arr2 = new ArrayList<>();
		arr2.add(2);
		arr2.add(3);
		List<Integer> arr3 = new ArrayList<>();
		arr3.add(7);
		arr3.add(3);
		List<Integer> arr4 = new ArrayList<>();
		arr4.add(1);
		arr4.add(8);
		List<List<Integer>> arr = new ArrayList<>();
		arr.add(arr1);
		arr.add(arr2);
		arr.add(arr3);
		arr.add(arr4);
		System.out.println(test(4, 3, arr));

	}

	public static String test(int n, int m, List<List<Integer>> numarr) {
		// �����Ӵ��ݵĻ�����
		for (int i = 0; i < numarr.size(); i++) {
			for (int j = i + 1; j < numarr.size(); j++) {
				if (numarr.get(i).contains(numarr.get(j).get(0)) || numarr.get(i).contains(numarr.get(j).get(1))) {
					if (numarr.get(i).get(0) == numarr.get(j).get(0)) {
						List<Integer> arr = new ArrayList<>();
						arr.add(numarr.get(i).get(1));
						arr.add(numarr.get(j).get(1));
						temparr.add(arr);
						continue;
					} else if (numarr.get(i).get(0) == numarr.get(j).get(1)) {
						List<Integer> arr = new ArrayList<>();
						arr.add(numarr.get(i).get(1));
						arr.add(numarr.get(j).get(0));
						temparr.add(arr);
						continue;
					} else if (numarr.get(i).get(1) == numarr.get(j).get(0)) {
						List<Integer> arr = new ArrayList<>();
						arr.add(numarr.get(i).get(0));
						arr.add(numarr.get(j).get(1));
						temparr.add(arr);
						continue;
					} else {
						List<Integer> arr = new ArrayList<>();
						arr.add(numarr.get(i).get(0));
						arr.add(numarr.get(j).get(0));
						temparr.add(arr);
						continue;
					}
				}
			}
		}
		System.out.println(temparr);
		// �ó����еĻ�����
		temparr.addAll(numarr);
		for (List<Integer> list : temparr) {
			if (checkSingel(list, n)) {
				return "no";
			}
		}
		return "yes";
	}

	/**
	 * @param �жϻ������Ƿ��з���{2*i,2*i-1}�����
	 * @return
	 */
	private static Boolean checkSingel(List<Integer> list, int n) {
		int i = (list.get(0) + 1) / 2;
		if (i * 2 == list.get(1) || i * 2 - 1 == list.get(1)) {
			return true;
		}
		int k = (list.get(1) + 1) / 2;
		if (k * 2 == list.get(0) || k * 2 - 1 == list.get(0)) {
			return true;
		}
		return false;
	}
}
