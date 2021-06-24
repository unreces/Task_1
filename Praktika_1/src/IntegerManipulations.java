//#1

public class IntegerManipulations {

    public static int convert (int i){
        return i * 60;
    }

    public static int points (int two, int three){
        return (two * 2) + (three * 3);
    }
    public static int footballPoints (int winners, int draws, int defeats){
        return((winners * 3) + draws + (defeats * 0));
    }
    public static boolean divisibleByFive (int t){
        return (t % 5 == 0) ;


    }
    public static boolean and (boolean m, boolean d){
        return (m && d);
    }
    public static int howManyWalls(int n, int w, int h){
        return ( n / (h * w));
    }
    public static int square ( int l) {
        return (l * l);
    }
    public static boolean profitableGamble(float prob, float prize , float pay ){
        return (prob * prize > pay);
    }
    public static float frames (float minuts, float fps){
        return (minuts * 60) * fps;
    }
    public static int mod (int a, int b){
        return a - (b * (a/b));
    }
    public static void main(String[] args) {


        System.out.println(convert(5) + " секунд");
        System.out.println(points(17, 12) + " очков");
        System.out.println(footballPoints(3, 4,2) + " очков");
        System.out.println(divisibleByFive(37));
        System.out.println(and(true, true));
        System.out.println(howManyWalls(100,4, 5));
        System.out.println(square(100));
        System.out.println(profitableGamble(0.9f, 1, 2));
        System.out.println(frames(5, 218));
        System.out.println(mod(218, 5 ));
    }
}


//2

/*public class IntegerManipulations {
    public static void main(String[] args) {

        int two = 13;
         int three = 12;
        int points = (two * 2) + (three * 3);
        System.out.println("Количество очков:" + points);
    }
}
*/



/* 3

public class IntegerManipulations {
    public static void main(String[] args) {

        int winners = 3

        int draws = 4

        int defeats =2
        int footballPoints = (winners * 3) + draws + (defeats * 0);
        System.out.printf("Количество очков: " + footballPoints);
    }
}
*/

//#4

/*public class IntegerManipulations {
    public static void main(String[] args) {

        int number = -55;
        if (number % 5 == 0) {
            System.out.printf("true");
        } else {
            System.out.printf("false");
        }

    }
}
*/


//#5

/*public class IntegerManipulations {
    public static void main(String[] args) {


        boolean a = true;

        boolean b = true;
        System.out.println("ответ: " + (a & b));

    }
}
*/



//#6

//public class IntegerManipulations {
//    public static void main(String[] args) {
//
//        int n = 54;
//
//        int h =43;
//
//        int w = 1;
//        int howManyWalls = n / (h * w);
//        System.out.printf("Количество стен равно " + howManyWalls);
//    }
//}



//7

//public class IntegerManipulations {
//    public static void main(String[] agrs){
//        System.out.println(square(5));
//    }
//    public static int square ( int b){
//        return (b * b);
//    }
//
//
//    }


//#8

//public class IntegerManipulations {
//    public static void main(String[] args) {
//
//        float prob = 0.9f;
//
//        float prize = 1;
//
//        float pay = 2;
//        if (prob * prize > pay) {
//            System.out.printf("TRUE");
//        } else {
//            System.out.printf("FALSE");
//        }
//    }
//}



//9
/*import java.util.Scanner;
public class IntegerManipulations {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Введите количество кадров в секунду:");
        float fps = user_input.nextFloat();
        System.out.println("Введите количество минут:");
        float minuts = user_input.nextFloat(); //??
        float frames = (minuts * 60) * fps;
        System.out.println("Количество кадров за " + minuts + " минут: " + frames);
    }
}
*/








//#10
/*import java.util.Scanner;
public class IntegerManipulations {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = user_input.nextInt();
        System.out.println("Введите второе число:");
        int b = user_input.nextInt();
        int c = a / b;
        int ostatok = a - (b * c);
        System.out.printf("Остаток равен: " + ostatok);

    }
}
*/



