package StringProblems;

public class wordFrequency {
	
	public static void main(String[] args) {
		
		String str = "hello world how are you how is your cat";
		
		String arr[] = str.split(" ");
		
		int[] count = new int[arr.length];
		
		for(int j = 0; j< arr.length; j++)
		{	
			int counter = 0;
			for(int i = 0; i<arr.length; i++)
			{
				if(arr[j].equals(arr[i])) counter++;
			}
			
			count[j] = counter;
		}
		
		for(int i = 1; i<arr.length; i++)
		{
			for(int j = 0; j<i; j++)
			{
				if(arr[i].equals(arr[j])) 
				{
					count[i]=0;
				}
			}
		}
		for(int i = 0; i<arr.length; i++)
		{	if(count[i]>0)
				System.out.println(arr[i]+" : "+count[i]);
		}
	}

}
