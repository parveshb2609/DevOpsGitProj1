package test.devops.git;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		printLshapeTriangle(10);
	}
	
	public static void printLshapeTriangle(int p) {
		
		//int i = 0;
		
		for(int i = 0 ; i < p ; i++) {
			for (int j = 0 ; j <i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			
		
	}

}
