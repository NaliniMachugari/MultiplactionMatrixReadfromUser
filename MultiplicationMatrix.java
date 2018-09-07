
import java.util.*;
public class MultiplicationMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj=new Scanner(System.in);
System.out.println("enter the size of  first matrix of row");
int m=obj.nextInt();
System.out.println("enter the size of  first matrix of column");
int n=obj.nextInt();
int [][] a= new int[m][n];
System.out.println("enter the size of second matrix of row");
int p=obj.nextInt();
System.out.println("enter the size of second matrix of column");
int q=obj.nextInt();
int [][] b= new int[p][q];
int [][] c=new int[p][q];
if(m==q)
{	
System.out.println("enter the values in the first matrix");
for(int i=0;i<m;i++)
{
	for(int j=0;j<n;j++)
	{
		a[i][j]=obj.nextInt();
	}
}
System.out.println("enter the values in the first matrix");
for(int i=0;i<p;i++)
{
	for(int j=0;j<q;j++)
	{
		b[i][j]=obj.nextInt();
	}
}
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<a[i].length;j++)
	{
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
for(int i=0;i<b.length;i++)
{
	for(int j=0;j<b[i].length;j++)
	{
		System.out.print(b[i][j]+" ");
	}
	System.out.println();
}
for(int i=0;i<a.length;i++)
{
	for(int j=0;j<b.length;j++)
	{
		for(int k=0;k<a.length;k++)
		{
			c[i][j] +=a[i][k]*b[k][j];
		}
	}
}
for(int i=0;i<c.length;i++)
{
	for(int j=0;j<c[i].length;j++)
	{
		System.out.print(c[i][j]+" ");
	}
	System.out.println();
}
}
else
{
System.out.println("invalid");
}
	}

}
