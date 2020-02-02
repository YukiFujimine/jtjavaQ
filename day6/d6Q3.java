import java.util.*;
public class d6Q3{
	public static void main(String[] args){
			double[] num={22.3,33.1,11.5};
			System.out.println(Arrays.toString(num));

			num[0]=22.5;
			for(int i=0;i<num.length;i++){
			System.out.println("num["+i+"]:"+num[i]);
			}
	}
}
