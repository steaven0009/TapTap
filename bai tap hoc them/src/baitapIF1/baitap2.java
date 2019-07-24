package baitapIF1;
import java.util.Scanner;
public class baitap2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        float TNCT;
        System.out.println("nhap vao thang cong tac :");
        TNCT = sc.nextFloat();
        if(TNCT < 12 )
             {
        		TNCT = (float) (650000 * 1.92);
        		System.out.println(" so tien luong cua ban la :" + TNCT);
             }
        	else if(36 > TNCT >= 12 )
        		{ 
        			TNCT = (float) (650000* 2.34);
        			System.out.println("so tien luong cua ban la : " + TNCT);
        		}
        		else if(36 <= TNCT < 60)
        			{	
        			   TNCT =(float)(650000 * 3);
        			   System.out.println("so tien luong cua ban la : " + TNCT);
        			}
        			else 
        			  {
        				TNCT =(float) (650000 * 4.5);
         			    System.out.println("so tien luong cua ban la : " + TNCT);
        			  }
	            
	}      

}
