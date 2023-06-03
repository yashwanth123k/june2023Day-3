import java.util.Scanner;
class CountingDigits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n[]={'0','1','2','3','4','5','6','7','8','9'};
int count=0;
String str=sc.nextLine();
for(int i=0;i<=ch.length-1;i++){
for(int j=0;j<=str.length()-1;j++){
if(str.charAt(j)==ch[i]){
count++;
}
}
System.out.println("number of digits in a string is :"+countn);
}
}