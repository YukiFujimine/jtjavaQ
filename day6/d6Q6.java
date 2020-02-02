import java.util.*;
public class d6Q6{
	public static void main(String[] args){
		int[] num=new int[5];
		Random random=new Random();
		for(int i=0;i<num.length;i++){
			num[i]=random.nextInt(101);
		}
		for(int i=0;i<num.length;i++){
			System.out.println("num["+i+"]:"+num[i]);
		}
	}
}
