package main;

public class BubbleSort
{
	
	
	public static int[] BubbleSrt( int [ ] num )
	{
	     int j;
	     boolean flag = true;   // set flag to true to begin first pass
	     int temp;   //holding variable

	     while ( flag )
	     {
	            flag= false;    //set flag to false awaiting a possible swap
	            for( j=0;  j < num.length -1;  j++ )
	            {
	                   if ( num[ j ] > num[j+1] )   // change to > for ascending sort
	                   {
	                           temp = num[ j ];                //swap elements
	                           num[ j ] = num[ j+1 ];
	                           num[ j+1 ] = temp;
	                          flag = true;              //shows a swap occurred  
	                  } 
	            } 
	      }
		return num; 
	} 

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int[] nums = {5,7,3,6,8,2,4,9,8,6,4,3,2};
		BubbleSort.BubbleSrt(nums);
		
		for(int x: nums)
		{
			System.out.print(x);
		}
	}

}
