package com.wschoi.practice.stack;

/**
 * ����)
 * 
 * ���� ������ ž N�븦 �������ϴ�. ��� ž�� ����⿡�� ��ȣ�� ��/�����ϴ� ��ġ�� ��ġ�߽��ϴ�. �߻��� ��ȣ�� ��ȣ�� ���� ž���� ���� ž������ �����մϴ�. 
 * ����, �� �� ���ŵ� ��ȣ�� �ٸ� ž���� �۽ŵ��� �ʽ��ϴ�.���� ��� ���̰� 6, 9, 5, 7, 4�� �ټ� ž�� �������� ���ÿ� ������ ��ȣ�� �߻��մϴ�. 
 * �׷���, ž�� ������ ���� ��ȣ�� �ְ�޽��ϴ�. ���̰� 4�� �ټ� ��° ž���� �߻��� ��ȣ�� ���̰� 7�� �� ��° ž�� �����ϰ�, 
 * ���̰� 7�� �� ��° ž�� ��ȣ�� ���̰� 9�� �� ��° ž��, ���̰� 5�� �� ��° ž�� ��ȣ�� ���̰� 9�� �� ��° ž�� �����մϴ�. 
 * ���̰� 9�� �� ��° ž�� ���̰� 6�� ù ��° ž�� ���� ������ ��ȣ�� � ž������ ������ �� �����ϴ�.
 * @author cws86
 *
 */
public class WhichTowerTakesSignal
{
	/**
	 * �ݺ����� �Ųٷ� Ÿ�� ��
	 * ������ �����ҽ� Ż���ϴ� ��
	 * 
	 * @param heights
	 * @return
	 */
	public static int[] solution(int[] heights)
	{
		int[] answer = new int[heights.length];
		
		for(int i = 0; i < heights.length; i++)
		{
			for(int j = i; j >= 0; j--)
			{
				if(heights[i] < heights[j])
				{
					answer[i] = j + 1;
					break;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args)
	{
		int[] heights = {3, 9, 9, 3, 5, 7, 2};
		int[] answer = solution(heights);
		for(int num : answer) 
		{
			System.out.print(num + ",");
		}
	}
}
