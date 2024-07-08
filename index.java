import java.util.*;
public class index
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int i , j=0;
        System.out.println("Enter the size of the array:");
        int n=s.nextInt();
        String str[] = new String[n];
        System.out.println("Enter the strings");
        for (i=0;i<n;i++)
        {
            str[i]=s.next();
        }
        for (i=0;i<n;i++)
        {
           for (j=i+1;j<n;j++)
           {
            if(str[i].compareTo(str[j])>0)
            {
                String temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
           }
        }
        System.out.println("Sorted string is ");
        for (i=0;i<n;i++)
        {
            System.out.println(str[i]);
        }
    }
}