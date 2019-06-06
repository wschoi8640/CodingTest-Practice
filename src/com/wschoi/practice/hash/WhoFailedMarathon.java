package com.wschoi.practice.hash;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * ����)
 * 
 * ������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
 * �����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, 
 * �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 * 
 */
public class WhoFailedMarathon
{
	/**
	 * Sort ��Ų ���Ŀ� ���� �������� ���Ͽ� 
	 * �������� ��������� ���
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
