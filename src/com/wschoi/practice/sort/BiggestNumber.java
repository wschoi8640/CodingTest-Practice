package com.wschoi.practice.sort;

import java.util.Arrays;

/**
 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
 * 
 * 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 
 * 이중 가장 큰 수는 6210입니다.
 * 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 
 * 바꾸어 return 하도록 solution 함수를 작성해주세요.
 * 
 * @author cws86
 */
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
