package com.wschoi.practice.greedy;

/**
 * ���ɽð��� ������ ���, �Ϻ� �л��� ü������ �������߽��ϴ�. ������ ���� ü������ �ִ� �л��� �̵鿡�� ü������ �����ַ� �մϴ�. 
 * �л����� ��ȣ�� ü�� ������ �Ű��� �־�, �ٷ� �չ�ȣ�� �л��̳� �ٷ� �޹�ȣ�� �л����Ը� ü������ ������ �� �ֽ��ϴ�. ���� ���, 
 * 4�� �л��� 3�� �л��̳� 5�� �л����Ը� ü������ ������ �� �ֽ��ϴ�. ü������ ������ ������ ���� �� ���� ������ ü������ ������ 
 * ���� �ִ��� ���� �л��� ü�������� ���� �մϴ�.
 * 
 * ��ü �л��� �� n, ü������ �������� �л����� ��ȣ�� ��� �迭 lost, ������ ü������ ������ �л����� ��ȣ�� ��� �迭 reserve�� 
 * �Ű������� �־��� ��, ü�������� ���� �� �ִ� �л��� �ִ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 * 
 * @author cws86
 */
public class HowManyParticipants
{
	
	/**
	 * �迭 ó���� ���� ���� ó�����ְ� ����� �Ѳ����� ���� ������� ó��
	 * 
	 * @param n
	 * @param lost
	 * @param reserve
	 * @return
	 */
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
