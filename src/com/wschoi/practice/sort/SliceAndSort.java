package com.wschoi.practice.sort;

import java.util.Arrays;

/**
 * ����)
 * 
 * �迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�. 
 * ���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��
 *
 * 1. array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
 * 2. 1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
 * 3. 2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
 * 
 * �迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, 
 * commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 * 
 * @author cws86
 *
 */
public class SliceAndSort
{
	/**
	 * �迭�� �Ϻθ� �����ϴ� ����Ƽ�� �޼ҵ�� Sort�ϴ� ����Ƽ�� �޼ҵ带 Ȱ���Ѵ�.
	 * 
	 * @param array
	 * @param commands
	 * @return
	 */
	public static int[] solution(int[] array, int[][] commands)
	{
		int[] answer = new int[commands.length];
		
		for(int i = 0; i < commands.length; i++)
		{
			int[] partOfArray = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(partOfArray);
			answer[i] = partOfArray[commands[i][2]-1];
		}
		return answer;
	}

	public static void main(String[] args)
	{
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] answer = solution(array, commands);
		for(int num : answer)
		{
			System.out.print(num + ", ");
		}
	}
}
