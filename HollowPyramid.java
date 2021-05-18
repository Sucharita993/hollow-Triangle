public class HollowPyramid
{
    public static void main(String[] args) 
    {
        int n,m;
        m=n=6;   
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                if(k==1 || (k==2*i-1 || i==n))
                System.out.print("*");
                else
                System.out.print(" ");
            }
            m--;
            System.out.print("\n");
        } 
    }
}