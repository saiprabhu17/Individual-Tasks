package IndividualTask2;

public class Denomination {

	public static void main(String[] args) {
		int amount = 2456;
		int count;
		int a[] = {2000, 500, 200, 100, 50, 20, 10, 5, 1};
		System.out.println("Currency Count");
		for(int i=0; i<a.length; i++)
		{
			count = amount / a[i];
			if(count > 0)
			{
				System.out.println(a[i] + " : " + count);
				amount = amount - (count * a[i]);
			}
		}		        
	}
}