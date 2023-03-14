package SeleniumSessions;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. post increment ++
		int a=1;
		int b=a++;
		System.out.println(a);//2
		System.out.println(b);//1
		
		
		int c=-99;
		int d=c++;
		System.out.println(c);//-98
		System.out.println(d);//-99
		
		int x=10;
		int y=x++;
		System.out.println(x);//11
		System.out.println(y);//10
		
		
		//2. pre increment ++
		int t=1;
		int u=++t;
		System.out.println(t);//2
		System.out.println(u);//2
		
		int k=-99;
		int p=++k;
		System.out.println(k);//-98
		System.out.println(p);//-98
		
		//3. post decrement
		int s=2;
		int v=s--;
		System.out.println(s);//1
		System.out.println(v);//2
		
		int l1=-99;
		int l2=l1--;
		System.out.println(l1);//-100
		System.out.println(l2);//-99
		
		
		//4. pre decrement
		int r1=2;
		int r2=--r1;
		System.out.println(r1);//1
		System.out.println(r2);//1
		
		////////////////////////////
		int num=10;
		System.out.println(num++);//10
		System.out.println(num);//11
		
		int total=10;
		System.out.println(++total);//11
		System.out.println(total);//11
		
		System.out.println(2*10);//20
		System.out.println(-2*10);//-20
		System.out.println(-2*-10);//20
		
		////////////////////////////////
		
		float f=2.5f;
		float j=f++;
		System.out.println(f);//3.5
		System.out.println(j);//2.5
		
		
		char ch='a';//97
		System.out.println(++ch);//b
		System.out.println((int)++ch);//99
		
		char th='1';//49
		System.out.println((int)++th);//50
		System.out.println((int)th);//50
		System.out.println(th);//2
		
		int pop=1;
		pop=pop+1;
		System.out.println(pop);//2
		
		int pop11=pop+1;
		System.out.println(pop11);//3
		
		///////////////////////////////
		byte f1=127;
		byte f2=127;
		
		int f3= f1+f2;
		System.out.println(f3);//254
		
		char gh='1';//49
		System.out.println(gh++);//1
		System.out.println(gh);//2
		
		System.out.println(10);//10
		
		char jj='z';//122
		System.out.println(++jj);//{--ASCII 123
		
		
		
		
	}

}
