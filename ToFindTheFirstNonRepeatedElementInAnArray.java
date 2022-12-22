package IndividualTask2;

import java.util.ArrayList;

public class ToFindTheFirstNonRepeatedElementInAnArray {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(5);
		al.add(3);
		al.add(6);
		al.add(5);
		al.add(1);
		al.add(3);
		int count;
		for(int i=0; i < al.size(); i++)
		{
			 count=0;
			for(int j=0; j<al.size(); j++)
			{
				if(al.get(i) == al.get(j))
				{
					count = count + 1;
				}
			}
			if(count == 1)
			{
				System.out.println("The first non repeated element is: " + al.get(i));
				break;
			}
		}
	}
}