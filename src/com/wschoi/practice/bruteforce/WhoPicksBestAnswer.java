package com.wschoi.practice.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhoPicksBestAnswer
{
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
