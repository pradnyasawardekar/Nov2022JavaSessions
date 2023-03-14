package SeleniumSessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		
		int i[]= new int[4];		//declare an array
		System.out.println(i.length);  //length of an array
		
		int len=i.length;	//length
		int hi= len-1;		//higher index
		int li=0;			//lower index
		
		//initialize
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
//		i[4]=50;		//AIOB array out of bound exception
		
		//print the array
		System.out.println(i[0]);
		System.out.println(i[3]);
//		System.out.println(i[4]);		//AIOB
//		System.out.println(i[-0]);		//AIOB
		
		System.out.println("__________");
		
//print all the values from array
	//index based loop
		for(int k=0;k<=(i.length-1); k++){
			System.out.println(i[k]);	//10 20 30 40 50
		}
		
		System.out.println("__________");
		
	//without loop print
		System.out.println(Arrays.toString(i));
		
	
		System.out.println("__________");
		
	//for each
		for(int e:i){
			System.out.println(e);
			if(e==20){
				System.out.println("bbye!!");
			}
		}
	
		System.out.println("__________");
		
		System.out.println(i);//print garbage value
		
	//double
		double d[]=new double[4];
		d[0]=12.33;
		d[1]=1.3;
		d[2]=54.87;
		d[3]=87.23;
		
		System.out.println(Arrays.toString(d));
		System.out.println(d[0]+d[1]);
		
	//char
		char ch[]=new char[4];
		ch[0]='a';
		ch[1]='b';
		ch[2]='c';
		ch[3]='d';
		
		System.out.println(Arrays.toString(ch));
		
		for( char e :ch){
			System.out.println(e);
		}
		
	//string
		String st[]=new String[4];
		st[0]="Java";
		st[1]="Python";
		st[2]="C++";
		st[3]="DotNet";
		
		for(String e:st){
			System.out.println(e);
			if(e.equals("Java")){
				System.out.println("I love Java");
			}
			else{
				System.out.println("I love other prgming lang");
			}
		}
		
		System.out.println("________________");
		
	//Object Array
		//Super class of all the classes in Java
		//different data types in single array
		
	//Emp Info: Name[String], age[int], salary[double], gender[char],isPerm[boolean];
		
		Object emp[]= new Object[5];
		emp[0]="Naveen";
		emp[1]=25;
		emp[2]=12.33;
		emp[3]='M';
		emp[4]=true;
		
		System.out.println(Arrays.deepToString(emp));
		
		//to create an array:-
	//1.use new keyword
		int num1[]=new int[10];
		
	//2.array literals
		//when v already know d values of array elements
		int num[]={11,2,64,87,9,2,32};
		System.out.println(num.length);
		
		
		Object data[]={"MacBook",12.33,'y',45};
		
		System.out.println(Arrays.toString(data));
		
		for(Object e:data){
			System.out.println(e);
		}
		
		
		
		
	}

}
