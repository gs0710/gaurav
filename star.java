public class star
{
public static void main(String []args)
{
System.out.println("Star ");
int n=3;
for(int i=1; i<=n; i++)
{
for(int j=1; j<=n;j++)
{
if(j<=i){
System.out.println("*");
}
else
{
System.out.println(" ");
}
}
System.out.println();
}
}
}
