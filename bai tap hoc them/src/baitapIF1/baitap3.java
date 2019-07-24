package baitapIF1;
import java.util.Scanner;
public class baitap3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a,b,c,x,delta,x1,x2;
        System.out.println("nhap vao so a :");
           a = sc.nextInt();
        System.out.println("nhap vao so b :");
           b = sc.nextInt();
        System.out.println("nhap vao so c :");
           c =sc.nextInt();
        if(a == 0)
           {
        		if(b == 0)
        			{
        				System.out.println("phuong trinh vo nghiem ");
        				System.out.println("bye bye !!!");
        			}
        		 	else
        		 		{
        		 			System.out.println("phuong trinh vo nghiem ");
        		 			System.out.println("bye bye !!!");
        		 		}
           }
           else
           {
        	   x = -b/a;
        	   System.out.println("nghiem cua phuong trinh la :" + x);
           }
        if(a == 0)
        {
        	if(b!=0)
        	{
        		if(a == 0)
                {
             		if(b == 0)
             			{
             				System.out.println("phuong trinh vo nghiem ");
             				System.out.println("bye bye !!!");
             			}
             		 	else
             		 		{
             		 			System.out.println("phuong trinh vo nghiem ");
             		 			System.out.println("bye bye !!!");
             		 		}
                }
                else
                {
             	   x = -b/a;
             	   System.out.println("nghiem cua phuong trinh la :" + x);
                }
        	}
        	else
        	{
        		if(c == 0)
        		{
        			System.out.println("phuong trinh vo ngiem ");
        			System.out.println("bye bye !!!");
        		}
        		  	else
        		  	{
        		  		System.out.println("phuong trinh vo ngiem ");
        		  		System.out.println("bye bye !!!");
        		  	}
        	}
        }
        else
        {
        	delta = b*b-4*a*c;
        	if(delta < 0)
        	  {
        			System.out.println("phuong trinh vo nghiem");
        			System.out.println("bye bye");
        	  }
        		else if (delta == 0)
        			{
        		        x1 = x2 = -b/(2*a);
        		        System.out.println("ket qua  x1 :" + x1);
        		        System.out.println("ket qua  x2 :" + x2);
        			}
        		else
        		{
        			x1 = -b - 
        		}
        }
	}

}
