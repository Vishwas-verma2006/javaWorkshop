public class Main
{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int num;
		int ct=0;
		System.out.println("Enter the number");
		num = sc.nextInt();
		if(num == 0)
		{
		    System.out.println("Number is 1 digit");
		}
		else
		{
    		while(num != 0)
    		{
    		    num = num/10;
    		    ct++;
    		    
    		}
    		System.out.println("Number is "+ct+" digit");
    	}
	}
}

