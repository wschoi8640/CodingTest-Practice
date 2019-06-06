package com.wschoi.practice.stack;
/**
 * ���� )
 * 
 * �� ������ ��ϵ� �ֽİ����� ��� �迭 prices�� �Ű������� �־��� ��, 
 * ������ �������� ���� �Ⱓ�� �� �������� return �ϵ��� solution �Լ��� �ϼ��ϼ���.
 */
public class PriceObserver
{
	/**
	 * ���� ������ ���� Ȯ�εǸ� �ݺ��� Ż��
	 * ������ ���� ���� ��쿡 ���� ó��
	 * 
	 * @param prices
	 * @return
	 */
	public int[] solution(int[] prices)
	{
		int[] answer = new int[prices.length];
		
		for(int i = 0; i < prices.length - 1; i++)
		{
			for(int j = i + 1; j < prices.length; j++)
			{
				if(prices[i] > prices[j])
				{
					answer[i] = j - i;
					break;
				}
			}
			if(answer[i] == 0)
			{
				answer[i] = prices.length - 1 - i;
			}
		}
		return answer;
	}

	public static void main(String[] args)
	{

	}
}
