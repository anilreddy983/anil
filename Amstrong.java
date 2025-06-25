class Number
{
   public int powerfunction(int base,int exp)
   {
int power=1;
for( int i=0;i <= exp;i++)
{
    power=power*base;
}
return power;
   }
   public  int countfunction( int num)
   {
int count=0;
while(num != 0)
{
    count++;
    num=num/10; 

}
return count;
   }
   public  boolean amstrongfunction(int num)
   {
    int temp=num;
    int sum=0;
    
    int count=countfunction(num);
    while(num != 0)
    {
        int base=num % 10;
        sum=sum+powerfunction( base,count);
        num=num/10;

   }
return temp==sum;
   }}
   class Amstrong{
    public static void main(String args[])
    {
         Number obj=new Number();
        int  num=123;
       boolean  result=obj.amstrongfunction( num);
         System.out.println(result?"amstrong":"not amstrong");
    }
   }
