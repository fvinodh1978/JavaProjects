package com.collections.java;
import java.util.*;
class StringPrograms
{
	public static void main(String args[])
	{
		
		/*1.Removing Duplicates from the given string:
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();//Hello  5

		System.out.println("Your original string is: "+s);
		String s1=s+" ";
		String s3="";
		for(int i=0;i<s.length()-1;i++)
		{		
				int count=0;
				char ch1=s.charAt(i);
				for(int j=0;j<s1.length()-1;j++)
				{	
					char ch2=s1.charAt(j);
					if(ch1==ch2)
					count++;
		     	}
     		//System.out.println(count);
			if(count==1)
			s3=s3+ch1;
		}
		System.out.println("Your uniq string is: "+s3);
		*/
		

		/*2.Finding the occurrence of a given letter in the input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();
		System.out.println("Enter a character to find frequency");
		char ch=(char)sc.next().charAt(0);
					int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			char ch1=s.charAt(i);
				if(ch==ch1)
				count++;
		}
		System.out.println("The frequency of a "+ch+" letter is "+count);
		*/


		/*3.Freequency of each character
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();
		String s1=s+" ";
		int count;
		for(int i=0;i<s.length()-1;i++)
		{		count=0;
			
				char ch1=s.charAt(i);
				for(int j=0;j<s1.length()-1;j++)
				{	
					char ch2=s1.charAt(j);
					if(ch1==ch2)
					count++;
		     	}
				System.out.println(ch1+" freequency is "+count);
		}
		*/

		/*4.Print ASCII value for each character
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();
		for(int i=0;i<s.length()-1;i++)
		{
			char ch=s.charAt(i);
				int ascii=(int)ch;
			System.out.println(ch+ "  ASCII value is "+ascii);
		}
		*/

		/*5.Program to input name, middle name and surname of a person and print only the initials:
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();//devi sri prasad

		int k=s.indexOf(' ');//4
		int k1=s.lastIndexOf(' ');//8
		int k2=s.length();

		String s3=s.substring(0,k);
		String s4=s.substring(k+1,k1);
		String s5=s.substring(k1+1,k2);

		System.out.println("Your original name is: "+s);
		System.out.print("Your short name is: ");
		System.out.println(s3.charAt(0)+"."+s4.charAt(0)+"."+s5.charAt(0));
		*/

		/*6.WAP for print first name at second name position, second name at last name position,last name at first name position
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();//devi sri prasad

		int k=s.indexOf(' ');//4
		int k1=s.lastIndexOf(' ');//8
		int k2=s.length();

		String firstName=s.substring(0,k);
		String middleName=s.substring(k+1,k1);
		String lastName=s.substring(k1+1,k2);

		System.out.println("Your original name is: "+s);
		System.out.println("Your jumbled name is: "+lastName+" "+firstName+" "+middleName);
		*/

		/*7.Reverse String
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();//devi sri prasad
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
		{
				char ch=s.charAt(i);
				s1=s1+ch;
		}
		System.out.println("Your reversed string is: "+s1);
		*/

		/*8.Finding  shortest and longest word in sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();//Hello java program=12
		s=s+" ";
		String maxw="",minw="";
		String s1="";
		char ch;
		int len=s.length();
		int maxL=0,minL=len;

		for(int i=0;i<len;i++)//Hello java program
		{
			ch=s.charAt(i);
			if(ch!=' ')
			{
				s1=s1+ch;
			}
			else
			{
				int wordLength=s1.length();//7
				if(wordLength<minL)//7<4
				{
					minL=wordLength;//4
					minw=s1;//java
				}
				if(wordLength>maxL)//7>5
				{
					maxL=wordLength;//7
					maxw=s1;//program
				}
					s1="";
			}
		}
	System.out.println("The longest word is: "+maxw+" and length is: "+maxL+"\nThe shortest word is:  "+minw+"  and length is: "+minL);
	*/
/*9.Remove vowels from a sentence

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!='A'&&ch!='E'&&ch!='I'&&ch!='O'&&ch!='U')
			{
					s1=s1+ch;
			}
		}
		System.out.println("sentence with out vowels: "+s1);
*/

/*10.Finding frequency of a given string in a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();//Hello java program java 
		System.out.println("Enter a word to find frequence");
		String f=sc.next();//java
			s=s+" ";
		String s1="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				s1=s1+ch;
			}
			else
			{
				if(s1.equalsIgnoreCase(f)==true)
				{
						count++;
				}
						s1="";
			}
		}
		System.out.println("The highest frequent word is: "+f+" frequency is "+count);
		*/


		/*11.Palindrome words finding
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();//MOM AND DAD 
		s=s+" ";
		String s1="";
		boolean flag=true;
		System.out.println("the palindrome words are: ");
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch!=' ')
			{
				s1=s1+ch;
			}
			else
			{
				 flag=true;
				int p=s1.length();//3 MOM AND
				for(int j=0,k=p-1;j<(p/2)&&k>=0;j++,k--)
				{									
					if((s1.charAt(j))==(s1.charAt(k)))
					continue;
					 else
                    {
                        flag=false;
                        break;
                    }
				}
				if(flag==true)
				System.out.print(s1+" ");
				s1="";
			}
			
		}
		*/
	/*12.Program to form a new word by extracting the first letter of each word in the input

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();// hello java program is  code language--->hjpicl
		s=" "+s;
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch==' ')
			{
				char ch1=s.charAt(i+1);
				s1=s1+ch1;
			}
		}
		System.out.println("First letters word is: "+s1);
		*/
		/*13.Program to print the following pattern:
			BLUEJ
			BLUE
			BLU
			BL
			B
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();//Hello   5
		System.out.println("Your output is: ");
		for(int i=s.length();i>=0;i--)
		{
			System.out.println(s.substring(0,i));
		}
			*/
		/*14.Program to print the following pattern:
		For Example:  if Input is BLUEJ
		Then output is :
		BBBBB
		LLLL
		UUU
		EE
		J
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();//Hello 5
		System.out.println("Your output is: ");
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);H
			for(int j=s.length()-1;j>=i;j--)
			{
				System.out.print(ch);
			}
				System.out.println();
		}
		*/

	/*15.Program to convert first letter of each word in a sentence to Uppercase and rest to lowercase:
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();// hello java
		s=" "+s;
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);H
			if(ch==' ')
			{
				s1=s1+ch+(Character.toUpperCase(s.charAt(i+1))); Hello J
				i++;
			}
			else
        s1=s1+(Character.toLowerCase(ch));
		}
		System.out.println(s1);

		*/
		/*16.Arrange the sentences in alphabetical order of words,
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");// --->animal elephant is big
		String s=sc.nextLine();
		int k=s.length();
		String s1[]=new String[k];
		s1=s.split(" " );
		int len=s1.length;
		for(int i=0;i<len-1;i++)//this loop read the string into loop from an array
		{//elephant
			for(int j=0; j<len-1-i; j++)//for sorting an array elements    elephant is big animal 
			{
				if(s1[j].compareTo(s1[j+1])>0)// animal big  elephant   is 
				{
					String temp=s1[j+1];
					s1[j+1]=s1[j];
					s1[j]=temp;
				}
			}// here compareTo()will execute when we are comparing higher character with smaller character(ex:i<e)
		}
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");
		}
		*/
		//17.Separate the words which begin with a vowel.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String s=sc.nextLine();
		int len=s.length();
		String s1[]=new String[len];
		String vowels[]=new String[len];
		String consonents[]=new String[len];

		s1=s.split(" ");//elephant is big animal
		for(int i=0;i<s1.length;i++)
		{
			char ch=s1[i].charAt(0);
			//System.out.print(ch);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				for(int j=0;j<=i;j++)
				vowels[j]=s1[i];
			}
			else
			{
				for(int j=0;j<=i;j++)
				consonents[j]=s1[i];
			}
		}
		for(int i=0;i<vowels.length;i++)
		{
			System.out.print(vowels[i]+" ");
		}
		System.out.println();
		for(int i=0;i<consonents.length;i++)
		{
			System.out.print(consonents[i]+" ");
		}
	}
}