public class ArrayDemo1
{
public static void main(String []args)
{
int [][]matrix = {{1,2,3},{1,2,3,},{1,2,3}};
for(int i = 0; i < 3;i++)
{
for(int j = 0; j < 3;j++)
{
System.out.println(matrix[i][j] + " ");
}
System.out.println();
}



for(int i = 0; i < 3;i++)
{
int rsum = 0;
for(int j = 0; j < 3;j++)
{
rsum += matrix[i][j];
}
System.out.println("row" + (i + 1) + "sum = " + rsum);
}


for(int i = 0; i < 3;i++)
{

int csum = 0;
for(int j = 0; j < 3;j++)
{
csum += matrix[j][i];
}
System.out.println("column" + (i + 1) + "sum = " + csum);
}
}
}