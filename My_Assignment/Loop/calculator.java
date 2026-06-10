public class calculator
{
	
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int a,b;
		System.out.println("Enter the number");
		a = sc.nextInt();
		
		System.out.println("Enter the number");
		b = sc.nextInt();
		
		System.out.println("Enter the operation form [+,-,*,/,%]");
		char ch = sc.next().charAt(0);
		
		switch(ch)
		{
		    case '+':
		        System.out.println("The Addition of "+a+" and "+b+" is:- "+(a+b));
		        break;
		    
		    case '-':
		        System.out.println("The Substraction of "+a+" and "+b+" is:- "+(a-b));
		        break;
		    
		    case '*':
		        System.out.println("The Multiplication of "+a+" and "+b+" is:- "+(a*b));
		        break;
		  
		    case '/':
		        float a1 = (int)a;
		        float b1 = (int)b;
		        System.out.println("The division of "+a+" and "+b+" is:- "+(a1/b1));
		        break;
		  
		    case '%':
		        System.out.println("The Modulus of "+a+" and "+b+" is:- "+(a%b));
		        break;
		    
		    default:
		    
		        System.out.println("Invalid operation choose from [+,-,*,/,%]");
		        
		}
	}
}

