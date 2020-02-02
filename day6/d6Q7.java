import java.util.*;
public class d6Q7{
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("何人?>");
		int inputNum=scanner.nextInt();
		int[] score=new int[inputNum];
		for(int i=0;i<inputNum;i++){
			System.out.print(i+1+"人目の点数を入力してください>");
			score[i]=scanner.nextInt();
		}
		int sum=0;
		for(int x:score){
			sum+=x;
		}
		System.out.println("合計点数は"+sum+"点です。");
	}
}
