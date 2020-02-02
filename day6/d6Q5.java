import java.util.*;
public class d6Q5{
	public static void main(String[] args){
		boolean[] jdg={true,false,false,true,true};
		System.out.print("第何戦の結果を調べますか?(1~5)>");
		Scanner scanner=new Scanner(System.in);
		int inputNum=scanner.nextInt();
		if(jdg[inputNum-1]){
			System.out.println("第"+inputNum+"戦は[勝ち]です");
		}else{
			System.out.println("第"+inputNum+"戦は[負け]です");
		}
	}
}
