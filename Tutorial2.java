import java.util.Arrays;

public class Tutorial2 {

	public static void main(String[] args) {
		// initiate some variables
		int x = 45;
		int y = 85;
		// do stuff with them
		double a = x*y;
		double b = x+y;
		double c = (double)y/x;
		// print out results and combine with strings for effect
		System.out.println("the answer is "+a);
		System.out.println("I think that "+b+" is the correct answer");
		System.out.println(c+" is the correct answer");
		// make arrays in 2 different ways
		int[] myarray2 = new int[] {3,7,1,0,3,6}; //1
		System.out.println(Arrays.toString(myarray2));
		int[] myarray = new int[5]; //2
		myarray[0]= 3;
		myarray[1]= 5;
		myarray[2]= 8;
		myarray[3]= 0;
		myarray[4]= 12;
		System.out.println(Arrays.toString(myarray));
		
		//do some math with the arrays
		for (int i =0;i<myarray.length; i++) 
		{
			myarray[i]= myarray[i] * 5;
		}
		for (int i =0;i<myarray2.length; i++) 
		{
			myarray2[i]= myarray2[i] * 5;
		}
		//print results
		System.out.println(Arrays.toString(myarray));
		System.out.println(Arrays.toString(myarray2));
	}

}
