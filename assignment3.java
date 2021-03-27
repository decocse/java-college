
package ass3;

import java.util.*;
 class Stack
{
    static final int MAX = 1000;
    int top;
    char a[] = new char[MAX]; // Maximum size of Stack
 
    public boolean isEmpty()
    {
        return (top<0);
    }

    Stack()
    {
        top=-1;
    }
 
    public boolean push(char x)
    {
        if (top>=MAX)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top]=x;
            return true;
        }
    }
 
    public char pop()
    {
        //System.out.println(top);
        if (top<0)
        {
            //System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            char x=a[top--];
            return x;
        }
    }
}
 
 class pstring
{
	String p;
	Stack s=new Stack();

	public void input()
	{
		System.out.println("Enter your string of parentheses:");
		Scanner sc=new Scanner(System.in);
		p=sc.nextLine(); 
	} 

	public boolean check()
	{
		int k;
		for(k=0;k<p.length();k++)
		{
			int i=k;
			if(p.charAt(i)=='('||p.charAt(i)=='{'||p.charAt(i)=='[')
				s.push(p.charAt(i));
			else if(p.charAt(i)==')')
			{
				if(s.isEmpty()||s.pop()!='(')
				{
					return false;
				}
			}
			else if(p.charAt(i)=='}')
			{
				if(s.isEmpty()||s.pop()!='{')
				{
					return false;
				}
			}
			else if(p.charAt(i)==']')
			{
				if(s.isEmpty()||s.pop()!='[')
				{
					return false;
				}
			}
		}
		if(!s.isEmpty())
			return false;
		
		return true;
	}
}

public class assignment3 {
	public static void main(String[] args)
	{
		int resp;
		do
		{
			pstring pr=new pstring();
			pr.input();
			if(pr.check())
				System.out.println("match\n");
			else
				System.out.println("not match\n");
			System.out.println("press 1 to continue, 0 to exit");
			Scanner sc=new Scanner(System.in);
			resp=sc.nextInt();
		}while(resp==1);
	}
}
