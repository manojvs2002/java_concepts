package partb;

public class arrays {
	
		  public void trans()
		  {
			  int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
			  int[][] tran=new int[3][3];
			  int i,j;
			  for(i=0;i<3;i++)
			  {
				  for(j=0;j<3;j++)
				  {
					  tran[i][j]=a[j][i];
				  }
			  
			  }
			  for(i=0;i<3;i++)
			  {
				  for(j=0;j<3;j++)
				  {
					  System.out.print(a[i][j]);
				  }
			  System.out.println();
			  }
			  
			  for(i=0;i<3;i++)
			  {
				  for(j=0;j<3;j++)
				  {
					  System.out.print(tran[i][j]);
				  }
			  System.out.println();
			  }
		  }
	  }
 
			  
			   class evenodd extends arrays
			  {
				  public void trans()
				  {
				  super.trans();
				  int a[]= {1,2,3,4,5,6,7};
				  System.out.println("odd numbers");
				  for(int i=0;i<a.length;i++)
				  {
					  if(a[i]%2!=0)
					  {
						  System.out.print(a[i]);
					  }
				  }
				  System.out.println("even numbers");
				  for(int i=0;i<a.length;i++)
				  {
					  if(a[i]%2==0)
					  {
						  System.out.print(a[i]);
					  }
				  }
				  
				  }
			  
			  
		  
		  public static void main(String[] args)
		  {
			  evenodd k=new evenodd();
			  k.trans();
		  }
}
