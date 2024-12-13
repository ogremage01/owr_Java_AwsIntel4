
public class ArrayTest1 {
	public static void main(String[] args) {

//		배열에 
//		20, 40, 60, 80, 100, 13점을 넣고
//		
//		총점과 평균점수를 구하시오 
//		(평균의 경우 소수점 3번째 자리에서 반올림한다)
//		
//		총점: 313
//		평균: 52.166666,,,
//		평균 반올림: 52.17
		int[] scoreArr = { 20, 40, 60, 80, 100, 13 };
		int sum = 0;
		double avgOri = 0;
		double avg = 0;

		for (int i = 0; i < 6; i++) {
			sum = sum + scoreArr[i];
		}
		avgOri = (sum / 6.0);
		avg = ((int) ((sum / 6.0 + 0.005) * 100)) / 100.0;

		System.out.println("총점: " + sum);
		System.out.println("평균: " + avgOri);
		System.out.println("평균반올림: " + avg);

	}
}
