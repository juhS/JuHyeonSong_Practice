package homeStudy.A_배열;

public class EX5_08 {

	public static void main(String[] args) {

	int[][] score = {
						{ 100 , 100, 100},
						{  20 ,  20,  20},
						{  30 ,  30,  30},
						{  40 ,  40,  40}
					};
	
	int sum = 0;
						//행 : 길이 4
	for(int i = 0; i < score.length; i++) {
							//열 : 길이 3
		for(int j = 0 ; j < score[i].length; j ++) {
			System.out.printf("score[%d][%d]=%d%n" , i , j , score[i][j]);
			
			
			sum += score[i][j];
		}
	}
		System.out.println("sum = " + sum);
		
		
		

	}

}
