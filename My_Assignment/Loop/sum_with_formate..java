public class sum_with_formate
{
	
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a,b;
		System.out.println("Enter the number");
		a = sc.nextInt();
		int sum=0;
		
        for(int i=1; i<=a; i++)
        {   sum+=i;
            char o = '+';
            System.out.printf("%d",i);
            if(i == a)
            {
                break;
            }
            System.out.printf("%c",o);
        }
        System.out.printf("="+sum);
		
	}
}

