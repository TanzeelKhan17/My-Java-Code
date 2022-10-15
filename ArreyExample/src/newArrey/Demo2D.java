package newArrey;

public class Demo2D {
	public static void main(String[] args) {
		int [][] tanzeel=new int[2][3];
		tanzeel[0][0]=101;
		tanzeel[0][1]=10;
		tanzeel[0][2]=15;
		tanzeel[1][0]=20;
		tanzeel[1][1]=30;
		tanzeel[1][2]=400;
		
		
		//System.out.println(tanzeel.length);
		
		for(int i=0;i<tanzeel.length;i++) {
		
			//System.out.println(tanzeel[i].length);
			for(int j=0;j<=tanzeel.length;j++) {
				System.out.print(tanzeel[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
