package com.wschoi.practice.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * �Ϲ����� �����ʹ� �μ� ��û�� ���� ������� �μ��մϴ�. �׷��� ������ �߿��� ������ ���߿� �μ�� �� �ֽ��ϴ�. 
 * �̷� ������ �����ϱ� ���� �߿䵵�� ���� ������ ���� �μ��ϴ� �����͸� �����߽��ϴ�. �� ���Ӱ� ������ �����ʹ� �Ʒ��� ���� ������� �μ� �۾��� �����մϴ�.
 * 
 * 1. �μ� ������� ���� �տ� �ִ� ����(J)�� ����Ͽ��� �����ϴ�.
 * 2. ������ �μ� ����Ͽ��� J���� �߿䵵�� ���� ������ �� ���� �����ϸ� J�� ������� ���� �������� �ֽ��ϴ�.
 * 3. �׷��� ������ J�� �μ��մϴ�.
 * 
 * ���� ����Ͽ� �ִ� ������ �߿䵵�� ������� ��� �迭 priorities�� ���� �μ⸦ ��û�� ������ ���� ������� � ��ġ�� �ִ����� �˷��ִ� 
 * location�� �Ű������� �־��� ��, ���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
 */
public class PriorityPrinter
{
	
	/**
	 * ����Ʈ�� �̿��ϵ� �켱������ �˸��� ���� ��� ���� �� �ٽ� �߰��ϴ� ���
	 * 
	 * @param priorities
	 * @param location
	 * @return
	 */
	public static int solution(int[] priorities, int location)
	{	
		int answer = 0;
		
		List<Integer> values = new ArrayList<Integer>();
		List<Integer> priors = new ArrayList<Integer>();
		for(int i = 0; i < priorities.length; i++)
		{
			values.add(i);
		}
		for (int i : priorities)
		{
		    priors.add(i);
		}

		int output = -1;
		int myValue = values.get(location);
		boolean isBreak = false;
		while(myValue != output)
		{
			int first_prior = priors.get(0);
			int first_value = values.get(0);
			for(int prior : priors)
			{
				if(prior > first_prior)
				{
					priors.remove(0);
					priors.add(first_prior);
					values.remove(0);
					values.add(first_value);
					isBreak = true;
					break;
				}
			}
			if(isBreak == true)
			{
				isBreak = false;
				continue;
			}
			priors.remove(0);
			values.remove(0);
			output = first_value;
			answer++;
		}
		return answer;
	}

	public static void main(String[] args)
	{
		int[] priorities = {2, 1, 3, 2};
		System.out.println(solution(priorities, 2));
	}
}
