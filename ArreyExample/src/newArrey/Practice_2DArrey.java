package newArrey;

public class Practice_2DArrey {
	public static void main(String[] args) {
		int tk[][]=new int [3][4];
		tk[0][0]=101;
		tk[0][1]=201;
		tk[0][2]=301;
		tk[1][0]=401;
		tk[1][1]=501;
		tk[1][2]=601;
		tk[2][0]=701;
		tk[2][1]=702;
		tk[2][2]=703;
				
		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print(tk[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	

}

class Test1{
	public static void main(String[] args) {
		int a[][]= {{1,2,3,4},{2,3,4,6},{3,4,5,2}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}




