public class forLoopArray {
	public static void main(String[] args) {
		int grace[]={21, 16, 86, 21, 3};
		int sum=0; //ensures that code is starting the sum from 0
		
		for(int counter=0;counter<grace.length;counter++){
			sum+=grace[counter];
		}
	
		System.out.println("The sum of these numbers is " +sum);
	}
}
