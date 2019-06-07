package com.wschoi.practice.greedy;

public class HowManyParticipants
{
	public int solution(int n, int[] lost, int[] reserve)
	{
		int [] origin = new int[n];
		
		for(int i = 0; i < origin.length; i++)
		{
			origin[i] = 1;
		}
		
		for(int lostIndex : lost)
		{
			origin[lostIndex - 1] = origin[lostIndex - 1] - 1;
		}
		
		for(int reserveIndex : reserve)
		{
			origin[reserveIndex - 1] = origin[reserveIndex - 1] + 1;
		}
		
		
		for(int i = 0; i < origin.length; i++)
		{
			if(i >= 0 && i != origin.length - 1)
			{
				if(origin[i] == 2 && origin[i + 1] == 0)
				{
					origin[i] = 1;
					origin[i + 1] = 1; 
				}
				else if(origin[i] == 0 && origin[i + 1] == 2)
				{
					origin[i] = 1;
					origin[i + 1] = 1;
				}
			}
			else if(i == origin.length - 1)
			{
				if(origin[i] == 2 && origin[i - 1] == 0)
				{
					origin[i] = 1;
					origin[i - 1] = 1;
				}
				else if(origin[i] == 0 && origin[i - 1] == 2)
				{
					origin[i] = 1;
					origin[i - 1] = 1;
				}
			}
		}
		
		int total = 0;
		for(int val : origin)
		{
			if(val > 0) total++;
		}
		
		int answer = total;
		return answer;
	}

	public static void main(String[] args)
	{

	}
}
