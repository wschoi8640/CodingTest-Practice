package com.wschoi.practice.sort;

import java.util.Arrays;

public class BiggestNumber
{
	public static String solution(int[] numbers) {
		       String answer = "";

		        int[] tmp = new int[numbers.length];

		        for (int i = 0; i < numbers.length; i++) {
		            if (numbers[i] == 0) {
		                tmp[i] = 0;
		            } else if (numbers[i] < 10) {
		                tmp[i] = (numbers[i] * 1111) * 10;
		            } else if (numbers[i] < 100) {
		                tmp[i] = ((numbers[i] * 100) + numbers[i]) * 10 + 1;
		            } else if (numbers[i] < 1000) {
		                tmp[i] = ((numbers[i] * 10) + (numbers[i] / 100)) * 10 + 2;
		            } else {
		                tmp[i] = numbers[i] * 10 + 3;
		            }
		        }

		        Arrays.sort(tmp);

		        for (int i = numbers.length - 1; i >= 0; i--) {
		            answer += (int) (tmp[i] / Math.pow(10, 4 - tmp[i] % 10));
		        }

		        if (answer.charAt(0) == '0') {
		            answer = "0";
		        }

		        return answer;
		    }

	public static void main(String[] args)
	{
		int[] numbers = {21, 212};
		System.out.println(solution(numbers));
	}
}
