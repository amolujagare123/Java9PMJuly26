package Methods;

public class MethodsReturning {

    int getNumber(int a)
    {
       // int a = 10;

        return a;
    }

    String reverseString(String str)
    {
        String temp = "";
        for (int i=str.length()-1 ; i>=0 ;i--)
        {
            temp = temp + str.charAt(i);
        }

        return temp;
    }

    char[] getAllVowels(char[] allAlphabets)
    {
        // a,e,i,o,u
        char[] ch = new char[5];
        int i=0;
        for (char c : allAlphabets)
        {
            if(c=='a' || c=='e' || c=='i'|| c=='o'|| c=='u')
            {
                ch[i] = c;
                i++ ;
            }
        }
        return ch;
    }

    public static void main(String[] args) {


        MethodsReturning ob = new MethodsReturning();
        int x = ob.getNumber(12);

        System.out.println(x);

        String reverseStr = ob.reverseString("Abhijeet");

        System.out.println("reverseStr="+reverseStr);

        char[] alphabets = new char[26];
        int j=0;
        for (int i='a' ; i<='z' ;i ++ )
        {
            alphabets[j] = (char) i;
            j++;
        }

        char[] arr = ob.getAllVowels(alphabets);

        for (char y : arr)
            System.out.println(y);
    }
}
