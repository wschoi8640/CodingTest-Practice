package com.wschoi.practice.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * 일반적인 프린터는 인쇄 요청이 들어온 순서대로 인쇄합니다. 그렇기 때문에 중요한 문서가 나중에 인쇄될 수 있습니다. 
 * 이런 문제를 보완하기 위해 중요도가 높은 문서를 먼저 인쇄하는 프린터를 개발했습니다. 이 새롭게 개발한 프린터는 아래와 같은 방식으로 인쇄 작업을 수행합니다.
 * 
 * 1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
 * 2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
 * 3. 그렇지 않으면 J를 인쇄합니다.
 * 
 * 현재 대기목록에 있는 문서의 중요도가 순서대로 담긴 배열 priorities와 내가 인쇄를 요청한 문서가 현재 대기목록의 어떤 위치에 있는지를 알려주는 
 * location이 매개변수로 주어질 때, 내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 return 하도록 solution 함수를 작성해주세요.
 */
public class PriorityPrinter
{
	
	/**
	 * 리스트를 이용하되 우선순위가 알맞지 않을 경우 삭제 후 다시 추가하는 방식
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
