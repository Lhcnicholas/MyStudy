package com.niczo.Simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

	public static void main(String[] args) {

	}

	public static int[] sort(int[] nums) {
		if (nums.length == 0) {
			return new int[0];
		} else if (nums.length == 1) {
			return nums;
		} else {
			int flag = nums[0];
			List<Integer> before = new ArrayList<>();
			List<Integer> after = new ArrayList<>();
			for (int i = 1; i < nums.length; i++) {
				if (nums[i] < flag) {
					before.add(nums[i]);
				} else {
					after.add(nums[i]);
				}
			}
			int[] bArray = new int[before.size()];
			int[] aArray = new int[after.size()];

			for (int i = 0; i < before.size(); i++) {
				bArray[i] = before.get(i);
			}

			for (int i = 0; i < after.size(); i++) {
				aArray[i] = after.get(i);
			}
			bArray = sort(bArray);
			aArray = sort(aArray);

			Arrays.sort(nums);

		}
		return null;
	}
}
