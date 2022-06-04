import java.util.ArrayList;
import java.util.Scanner;

public class Myclass
{
public static String MatchingCharacters(String str)
{
int result=0;
for(int i=0;i<str.length();i++)
{
Character c=str.charAt(i);
for(int j=i+1;j<str.length();j++)
{
if((str.charAt(j)+"").equals(c+"")&i!=j)
{
ArrayList<Character> list=new ArrayList<>();
for(int k=i+1;k<j;k++)
{
if(!list.contains(str.charAt(k)))
{
list.add(str.charAt(k));
}
}
if(result<list.size())
{
result=list.size();
}
}
}
}
return result+"";
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.print(MatchingCharacters(s.nextLine()));
}
}
