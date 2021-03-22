import java.util.*;
import java.time.LocalDate; 
 
class student{
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
	static int c3=0;
	void takeinput3()
	{
		LocalDate myObj = LocalDate.now();
		System.out.println(myObj);
		c3++;
	}
}




 class Sol {
	
	 public static void main(String[]args)
	 {
		 Scanner in=new Scanner(System.in);
		 student s[]=new student[500];
		 studentBcse scse[]=new studentBcse[500];
		 studentEce sece[]=new studentEce[500];
		 
		 HashMap<Integer,String>stu=new HashMap<>();
		 ArrayList<Integer>ar=new ArrayList();
		 
		 
		 int i=0;int i2=0;int i3=0;int i4=0;
		 while(true) {
			 System.out.println("Enter your choice");
			 int n=in.nextInt();
			 switch(n)
			 {
			  case 1: s[i]=new student();
			  s[i].takeinput();
			  s[i++].totalmarks();
			  scse[i2]=new studentBcse();
			  scse[i2++].takeinput2();
			  break;
			  
			  
			  case 2: s[i4]=new student(); 
				  s[i4++].takeinput();
			  sece[i3]=new studentEce();
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
				  System.out.println("Information for student of BCSE");
				  for(int j=0;j<i4;j++)
				  {
					  s[j].print();
					  //scse[j].takeinput2();
				  }
				  break;
			  case 5:
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
			 }
		 }
	 }
	
}
