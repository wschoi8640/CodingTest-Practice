package com.wschoi.practice.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 * 
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

 * @author cws86
 */

public class WhoPicksBestAnswer
{
	/**
	 * 배열 크기에 맞게 % 연산자를 잘 이용해서 반복문 처리
	 * 
	 * @param answers
	 * @return
	 */
	public static int[] solution(int[] answers)
	{
		int[] student1 = {1, 2, 3, 4, 5};
		int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		
		int[] scores = new int[3];
		
		for(int i = 0; i < answers.length; i++)
		{
			if(answers[i] == student1[i % student1.length]) scores[0] = scores[0] + 1;
			if(answers[i] == student2[i % student2.length]) scores[1] = scores[1] + 1;
			if(answers[i] == student3[i % student3.length]) scores[2] = scores[2] + 1;
		}
		
		int max = -1;
		
		List <Integer> answerList = new ArrayList<Integer>();
		
		for(int score : scores)
		{
			if(score > max) max = score;
		}

		for(int i = 0; i < scores.length; i++)
		{
			if(scores[i] == max) answerList.add(i + 1);
		}
		int[] answer = new int[answerList.size()];
		
		for(int i = 0; i < answerList.size(); i++)
		{
			answer[i] = answerList.get(i);
		}
		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args)
	{
		int[] answers = {1, 3, 2, 4, 2};
		int[] answer = solution(answers);
		
		for(int num : answer)
		{
			System.out.println(num + ", ");
		}
	}
}
