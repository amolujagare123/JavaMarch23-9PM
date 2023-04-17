package StringDemo;

public class SplitDemo4 {
    public static void main(String[] args) {

        String str = "We want to go to torranto so that i can call tom over there";
        // print only the words whose 2nd char is 'o'
        String[] stArr = str.split(" ");

        for (int i=0;i<stArr.length;i++)
        {
            String temp = stArr[i];
            int l = temp.length();

            if(l>=2){
            if(temp.charAt(1)=='o')
               System.out.println(stArr[i]);
            }
        }
    }
}
