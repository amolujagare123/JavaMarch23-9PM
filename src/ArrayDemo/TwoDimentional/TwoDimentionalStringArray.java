package ArrayDemo.TwoDimentional;

public class TwoDimentionalStringArray {

    public static void main(String[] args) {

        String[][] stArr = {
                {"Amol","Ankita","Ghanshyam"} ,           
                {"Jeeva","Nagayya","Nagma"} ,
                {"Praveen","Satya","Vikash"} ,
                {"Anand","Rajesh","Abhishek"} ,
                {"Rahul","Rohit","vaishali"} ,
        };

      //  stArr.length --> 5 --> row
        // stArr[0] --> {"Amol","Ankita","Ghanshyam"} -> stArr[0].length -> 3(col)
        // stArr[1] -->  {"Jeeva","Nagayya","Nagma"} -> stArr[1].length -> 3

        // a = {a1,a2,a3,a4,a5} ; .... --> a.length
     

        int row = stArr.length;
        int col = stArr[0].length;

        System.out.println("row="+row);
        System.out.println("col="+col);

        for (int i=0;i<row;i++) // row
        {
            for(int j=0;j<col;j++) // col
            {
                System.out.print(stArr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
