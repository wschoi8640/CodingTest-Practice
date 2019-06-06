package com.wschoi.practice.hash;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 문제)
 * 
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 * 
 */
public class WhoFailedMarathon
{
	/**
	 * Sort 시킨 이후에 같은 순번끼리 비교하여 
	 * 차이점을 결과값으로 출력
	 * 
	 * @param participant
	 * @param completion
	 * @return
	 */
	public static String solution(String [] participant, String [] completion)
	{
		String answer = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for(int i = 0; i < participant.length - 1; i++)
		{
			if(!participant[i].equals(completion[i]))
			{
				answer = participant[i];
				break;
			}
		}
		
		if(answer.equals(""))
		{
			answer = participant[participant.length - 1];
		}
		return answer;
	}
	
	public static void main(String[] args)
	{
		String [] participant = {"mislav", "stanko", "mislav", "ana"};
		String [] completion = {"stanko", "ana", "mislav"};
		
		String failer = solution(participant, completion);
		System.out.println(failer);
	}
}
