package com.collections.java;
class StringMethods
{
public static void main(String args[])
{
String s1="hello this is java program";
System.out.println("s1= "+s1);
int length=s1.length();
System.out.println("s1.length(): "+length);

String s2="hello";
String s3="hai";
System.out.println("s2 ="+s2);
System.out.println("s3= "+s3);
 s2=s2.concat(s3);
System.out.println("s2.concat(s3) "+s2);
System.out.println("s2 ="+s2);

char ch=s2.charAt(4);
System.out.println("s2.charAt(4) "+ch);

int i=s3.compareTo(s2);
System.out.println("s3.compareTo(s2) "+i);
String s4="Hello";
String s5="hello";
System.out.println("s4="+s4);
System.out.println("s5="+s5);
System.out.println("s4.compareToIgnoreCase(s5) "+s4.compareToIgnoreCase(s5));
System.out.println("s4.equals(s5)  "+s4.equals(s5));
System.out.println("s4.equalsIgnoreCase(s5)  "+s4.equalsIgnoreCase(s5));
System.out.println("s4.startsWith("+"H"+")  "+s4.startsWith("H"));
System.out.println("s4.endsWith("+"o"+")  "+s4.endsWith("o"));

System.out.println("s4.indexOf('l')  "+s4.indexOf('l'));
System.out.println("s4.lastIndexOf('l')  "+s4.lastIndexOf('l'));
System.out.println("s4 ="+s4);
System.out.println("s4.replace('l','k') "+s4.replace('l','k'));

//s1="hello this is java program";

System.out.println("s1.substring(15) "+s1.substring(15));
System.out.println("s1.substring(0,12) "+s1.substring(0,12));

String s10="        java program      ";
System.out.println("s10= "+s10);
System.out.println("s10.length() "+s10.length());
String s11=s10.trim( );
System.out.println("s11=s10.trim( )= "+s11);
System.out.println("s11.length(): "+s11.length());


String s20="hello this is";
System.out.println("s20 ="+s20);
char ch1[]=new char[10];
	ch1[0]='a';
	ch1[1]='b';
s20.getChars(5,8,ch1,2);
System.out.print("ch1[]= s20.getChars(5,8,ch1,2);");
for(int j=0;j<ch1.length;j++){
System.out.print(ch1[j]);
}
System.out.println();

String s21="hello this is java book";
System.out.println("s21 ="+s21);
String str[];
str=s21.split(" ");
System.out.println("str=s21.split( space)");

for(int j=0;j<str.length;j++)
{
System.out.println("\t\t"+str[j]);
}
}
}