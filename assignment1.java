package student;
import java.util.*;
import java.time.LocalDate; 
 //student class****************
class student1{
	int k=0,k2=0;
	int roll;
	int s=0;
	int marks[]=new int [5];
	String name;
	
	void takeinput()
	{
		
		Scanner p=new Scanner(System.in);
		name=p.next();
		roll=p.nextInt();
		for(int i=0;i<5;i++)
		{
			marks[i]=p.nextInt();
			
		}
		k++;
	}
	
	
	// total marks*****
	int totalmarks()
	{
		//int s=0;
		for(int i=0;i<5;i++)
		{
			s+=marks[i];
		}
		k++;
		return s;
		
	}
	
	String namereturn()
	{
		String nam;
		nam=name;
		return nam;
	}
	//print***************
	void print()
	{
		System.out.println(name);
		System.out.println(roll);
		for(int i=0;i<5;i++)
		{
			System.out.print(marks[i]+" ");
		}
		System.out.println();
		System.out.println(s);
		
	}
	
	
}

//bcse
class studentBcse extends student {
	static int c2=0;
	void takeinput2()
	{
		LocalDate myObj = LocalDate.now();
		System.out.println(myObj);
		c2++;
	}
}

//ece
class studentEce extends student {
	static int c3=0,sum2=0,kd=0;
	int k3=0;
	String name;int roll;int marks[]=new int[5];
	void takeinputece()
	{
		
		Scanner p=new Scanner(System.in);
		name=p.next();
		roll=p.nextInt();
		for(int i=0;i<5;i++)
		{
			marks[i]=p.nextInt();
			sum2+=marks[i];
		}
		k3++;
	}
	void takeinput3()
	{
		LocalDate myObj = LocalDate.now();
		System.out.println(myObj);
		c3++;
	}
	
	String namereturn2()
	{
		String nam;
		nam=name;
		return nam;
	}
	
	int totalmarks2()
	{
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum+=marks[i];
		}
		kd++;
		return sum;
		
	}
	
	void print()
	{
		System.out.println(name);
		System.out.println(roll);
		for(int i=0;i<5;i++)
		{
			System.out.print(marks[i]+" ");
			
		}
		System.out.println();
		//System.out.println(sum);
		
	}
}


public class student {
	public static void main(String[]args)
	 {
		 Scanner in=new Scanner(System.in);
		 student1 s[]=new student1[500];
		 studentBcse scse[]=new studentBcse[500];
		 studentEce sece[]=new studentEce[500];
		 
		 HashMap<Integer,String>stu=new HashMap<>();
		 ArrayList<Integer>ar=new ArrayList();
		 
		 HashMap<Integer,String>st=new HashMap<>();
		 ArrayList<Integer>arl=new ArrayList();
		 
		 int i=0;int i2=0;int i3=0;int i4=0;
		 while(true) {
			 System.out.println("Enter your choice");
			 int n=in.nextInt();
			 switch(n)
			 {
			  case 1: s[i]=new student1();
			  s[i].takeinput();
			  s[i++].totalmarks();
			  scse[i2]=new studentBcse();
			  scse[i2++].takeinput2();
			  break;
			  
			  
		  case 2: //s[i4]=new student1(); 
//				  s[i4++].takeinputece();
			  sece[i4]=new studentEce();
			  sece[i4++].takeinputece();
			  sece[i3++].takeinput3();
			  break;
			  
			  
			  case 3: 
				  System.out.println("Information for student of BCSE");
				  for(int j=0;j<i;j++)
				  {
					  s[j].print();
					  //scse[j].takeinput2();
				  }
				  break;
			  case 4:
				  System.out.println("Information for student of ECE");
				  for(int j=0;j<i4;j++)
				  {
					  sece[j].print();
					  //scse[j].takeinput2();
				  }
				  break;
			  case 5:
				  System.out.println("Sorted List for Bcse");
				  for(int j=0;j<i;j++)
				  {
					  stu.put(s[j].totalmarks(), s[j].namereturn());
				  }
				  for(int j=0;j<i;j++)
				  {
					  ar.add(s[j].totalmarks());
				  }
				  Collections.sort(ar);
				 System.out.println(stu);
				 break;
				 
			  case 6:
				  
				  System.out.println("Sorted List for ECE");
				  for(int j=0;j<i4;j++)
				  {
					  st.put(sece[j].totalmarks2(), sece[j].namereturn2());
				  }
				  for(int j=0;j<i4;j++)
				  {
					  arl.add(sece[j].totalmarks2());
				  }
				  Collections.sort(arl);
				 System.out.println(st);
				 break;
			  case 7:
				  System.gc();
				  System.out.println("Free memory (bytes): " + 
						  Runtime.getRuntime().freeMemory());
				  break;
			  case 8:
				  System.out.println("No. of BCSE students");
				  System.out.println(i);
				  break;
			  case 9:
				  System.out.println("No. of ECE students");
				  System.out.println(i4);
				  break;
			 }
		 }
	 }
}
