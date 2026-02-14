package Arrays;

public class remove_duplicate_elements {
	
	public static void main(String[] args) {
		
		int []numbers = {45,71,92,80,36,71,92};
		int[]remove_duplicate_elements=new int [numbers.length];
		int count;
		System.out.println("after removing duplicate element: ");
		
		for(int i=0;i<numbers.length;i++)
		{
			count=0;
			for(int j=1;j<numbers.length;j++)
			{
				if(numbers[i]==numbers[j])
				{
					count++;
				}
				if(count==0)
				{
					remove_duplicate_elements[i]=numbers[i];
				}
				if(remove_duplicate_elements[i]!=0)
				System.out.print(remove_duplicate_elements[i]+" ");
			}
		}
	}

}
