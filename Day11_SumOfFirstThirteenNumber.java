class SumOfFirstThirteenNumber{
public static void main(String args[]){

int sum = 0;

for(int i=1; i<=26; i++)
if(i%2==0)
{
	System.out.println(i);
	sum = sum + i;
}
 	System.out.println("sum="+sum);

   }
}