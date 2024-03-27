// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
   /* public static void main(String[] args) {*/
       /* String [] employeeNames = new String[3];
        employeeNames [0] = "Dat";
        employeeNames [1] = "No";
        employeeNames [2] = "Big";

        for (String name: employeeNames){
            System.out.println(name);
        }

        double [] age = new double[3];
        age[0] = 32;
        age[1] = 29;
        age[2] = 5;

        for (double ageMember: age){
            System.out.println(ageMember);
        }*/

        /*int [] myList = {1,3,5,7,9,10,11,55};
        for (int num:myList) {
            if( num % 2 == 0)
                System.out.println("So chan la " + num);
        }*/

    /*}*/
    /*public int getSum ( int i1, int i2) {
        int sum;
        sum =  i1 + i2;
        return sum;
    }*/
    public static void main(String[] args) {
      /*  int num1 = 32;
        int num2 = 29;
        int sum = new Main().getSum(num1, num2);*/
//        System.out.println(sum);
        int num = 21;
        boolean req = isEven(num);
        if (req) {
            System.out.println("so chan");
        } else {
            System.out.println("so le");
        }
    }

    private static boolean  isEven(int number){
        return number % 2 ==0;
    }
}