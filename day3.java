
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    for(int i=2;i<=9;i++) {
      for(int j=1;j<=9;j++) {
        System.out.printf("%d x %d = %d%n", i, j, i*j);
      }
    }    // 구구단을 실행시킬 수 있는 코드. 이 코드는 통째로 외워두도록 하자!!
    
    

    // int sum = 0;  // 합계를 저장하기 위한 변수.

    // for(int i=1; i <= 10; i++) {
    //   sum += i ;  // sum = sum + i;
    //   System.out.printf("1부터 %2d 까지의 합: %2d%n", i, sum);
    // }
    
    

    // for(int i=1;i<=5;i++)
    //   System.out.println(i); // i의 값을 출력한다.

    // for(int i=1;i<=5;i++)
    //   System.out.print(i);  // print() 를 쓰면 가로로 출력된다.

    // System.out.println();


    
    // Scanner scanner = new Scanner(System.in);
    
    // System.out.println("정숫값 x, y, z의 평균을 구합니다.");

    // System.out.print("x값:");
    // int x = scanner.nextInt();
    
    // System.out.print("y값:");
    // int y = scanner.nextInt();
    
    // System.out.print("z값:");
    // int z =scanner.nextInt();

    // double ave = (double) (x + y + z) / 3;
    // System.out.printf("x, y, z의 평균은 %.3f입니다.\n", ave);
    
  
    
    // int x, y, z;
    // int absX, absY, absZ;
    // char signX, signY, signZ;

    // x = 10;
    // y = -5;
    // z = 0;

    //  absX = x >= 0 ? x : -x;
    //  absY = y >= 0 ? y : -y;
    //  absZ = z >= 0 ? z : -z;
    // signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');
    // signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');
    // signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');

    // System.out.printf("x=%c%d%n", signX, absX);
    // System.out.printf("y=%c%d%n", signY, absY);
    // System.out.printf("z=%c%d%n", signZ, absZ);


    
    // String str1 = "abc";
    // String str2 = new String("abc");

    // System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc"); // \의 기능은 큰 따옴표를 글자로 기능하도록 하게 하는 것.
    // System.out.printf(" str1==\"abc\" ? %b%n",    str1=="abc");
    // System.out.printf(" str2==\"abc\" ? %b%n",    str2=="abc");
    // System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc")); //글자가 같은지 비교할 때는 '=='를 쓰는 것이 아니라 '.equals'를 쓴다.!!!
    // System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
    // System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
    // System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC")); // '.equalsIgnoreCase'는 대소문자 상관없이 비교해 주는 것.



    
    // int x = 10;
    // int y = 8;

    // System.out.printf("%d을 %d로 나누면, %n", x, y);
    // System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x / y, x % y);

    

    // float f  = 9.12345678901234567890f;
    // float f2 = 1.2345678901234567890f;
    // double d = 9.12345678901234567890d;

    // System.out.printf("      123456789012345678901234%n");
    // System.out.printf("f  : %f%n", f); // 소수점 이하 6째자리까지 출력
    // System.out.printf("f  : %24.20f%n", f); // 소수점 뒤 숫자는 소수점 아래 숫자개수
    // System.out.printf("f2 : %24.20f%n", f2); // 소수점 앞 숫자는 총 자리칸수
    // System.out.printf("d  : %24.20f%n", d);


    
    // char ch = 'A';  // char ch = 65;
    // int code = (int)ch;  //ch에 저장된 값을 int타입으로 변환하여 저장한다.

    // System.out.printf("%c=%d(%#X)%n", ch, code, code);

    // char hch = '가'; // char hch = OxACOO;
    // System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);

  }
}
