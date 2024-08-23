class Add2{
public static void main(String args[]){
int len,sum=0,i;
len=args.length;
for(i=0;i<len;i++)
sum=sum+Integer.parseInt(args[i]);
System.out.println("Sum is:" +sum);
}
}
