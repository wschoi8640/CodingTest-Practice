package com.wschoi.practice.hash;

import java.math.BigInteger;

/**
 * ����)
 * 
 * ��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�. ��ȭ��ȣ�� ������ ���� ���, ������
 * ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�. ������ : 119 ���ؿ� : 97 674 223 ������ : 11 9552 4421 ��ȭ��ȣ�ο�
 * ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, � ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡
 * ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 */
public class WhoContainsMyNumber
{
	/**
	 * String �� startsWith�� ���� ���� ���� üũ ����
	 * 
	 * @param phone_book
	 * @return
	 */
	public static boolean solution(String[] phone_book)
	{
		boolean answer = true;

		for (int i = 0; i < phone_book.length; i++)
		{
			for (int j = 0; j < phone_book.length; j++)
			{

				if (i == j) continue;
				if (phone_book[i].startsWith(phone_book[j]))
				{
					answer = false;
					return answer;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args)
	{
		String[] phone_book = { "12", "123", "1235", "567", "88" };
		System.out.println(solution(phone_book));
	}
}
