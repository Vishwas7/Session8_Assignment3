package Assignment3;

public class AliquotSum {

	public static void main(String[] args) {
		
		//here we are taking the aliquot sum of
		int aliquotSumOf = 12;
		long aliquotSum = findAliquotSum(aliquotSumOf);
		
		System.out.println("Aliquot Sum of " + aliquotSumOf + " is " + aliquotSum + ".");
		//here we applying the if condition
		if(aliquotSum == aliquotSumOf){
			System.out.println(aliquotSumOf + " is a perfect number.");
		}else{
			System.out.println(aliquotSumOf + " is not a perfect number.");
		}
		
		//Perfect numbers between 1 to 100
		System.out.println("Perfect Numbers between 1 to 100 are: ");
		
		// initializing the number between 1 to 100
		for(int i=1; i<=100; i++){
			aliquotSumOf = i;
			if(findAliquotSum(i) == aliquotSumOf){
				System.out.print(aliquotSumOf + " ");
			}
		}
	}
// creating the another method for finding the aliquot sum
	public static long findAliquotSum(int n) {
		long result = 0;

		for (byte i = 1; i <= (n / 2); i++) {
			if (n % i == 0) {
				result += i;
			}
		}
		return result;
	}

}