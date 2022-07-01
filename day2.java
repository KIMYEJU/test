
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("당신의 주민번호를 입력하세요.(011231-1111222)>");
    String num = scanner.nextLine();

    char gender = num.charAt(7);

    switch(gender) {
      case '1':
        System.out.print("당신은 2000년 이전에 출생한 남자입니다.");
        break;
      case '2':
        System.out.print("당신은 2000년 이전에 출생한 여자입니다.");
        break;
      case '3':
        System.out.print("당신은 2000년 이후에 출생한 남자입니다.");
        break;
      case '4':
        System.out.print("당신은 2000년 이후에 출생한 여자입니다.");
        break;
      default:
        System.out.println("잘못 입력하셨습니다.");
    }
    

    // Scanner scanner = new Scanner(System.in);
    
    // System.out.print("당신의 점수를 입력하세요.(1~100)>");
    // int score = scanner.nextInt();

    // switch(score/10) {
    //   case 9: case 10:
    //     System.out.println("당신의 학점은 A입니다.");
    //     break;
    //   case 8:
    //     System.out.println("당신의 학점은 B입니다.");
    //     break;
    //   case 7:
    //     System.out.println("당신의 학점은 C입니다.");
    //     break;
    //   case 6:
    //     System.out.println("당신의 학점은 F입니다.");
    //     break;
        // default:
        // System.out.println("잘못 입력하셨습니다.");
    // }


    
    // Scanner scanner = new Scanner(System.in);

    // System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
    // int user = scanner.nextInt();

    // int com = (int)(Math.random()*3)+1;
    // System.out.printf("당신은 %d입니다.%n",user);
    // System.out.printf("컴은 %d입니다.%n",com);

    // switch(user - com) {
    //   case 0:
    //     System.out.println("당신은 비겼습니다.");
    //     break;
    //   case -1: case 2:
    //     System.out.println("당신은 이겼습니다.");
    //     break;
    //   case 1: case -2: 
    //     System.out.println("당신은 졌습니다.");
    //     break;
    // }

    // if (user == 1) {
    //   if (com == 1) {
    //     System.out.println("당신은 비겼습니다.");
    //   } else if (com == 2) {
    //     System.out.println("당신은 졌습니다.");
    //   } else if (com == 3) {
    //     System.out.println("당신은 졌습니다.");
    //   } 
    // }
    // if (user == 2) {
    //   if (com == 1) {
    //     System.out.println("당신은 이겼습니다.");
    //   } else if (com == 2) {
    //     System.out.println("당신은 비겼습니다.");
    //   } else if (com == 3) {
    //     System.out.println("당신은 졌습니다.");
    //   }
    // }
    // if (user == 3) {
    //   if (com == 1) {
    //     System.out.println("당신은 이겼습니다.");
    //   } else if (com == 2) {
    //     System.out.println("당신은 이겼습니다.");
    //   } else if (com ==3) {
    //     System.out.println("당신은 비겼습니다.");
    //   }
    // }
    

    // 난수 발생
    // 난수는 0 ~ 1 사이의 실수값으로 난수 발생이 기본이다.
    // 캐스팅 : 형 변환
    // [1,2,3 셋 중 하나의 정수로만 난수 발생.]
    // System.out.println(((int)Math.random()*3)+1);


    
    // System.out.println(((int)Math.random()*3)+2);
    // System.out.println(((int)Math.random()*3)+3);


    // Scanner scanner = new Scanner(System.in);
    
    // System.out.print("당신의 주민번호를 입력하세요.(011231-1111222)>");
    // String num = scanner.nextLine();

    // char gender = num.charAt(7);

    // switch(gender) {
    //   case '1': case '3':
    //     System.out.println("당신은 남성입니다.");
    //     break;
    //   case '2': case '4':
    //     System.out.println("당신은 여성입니다.");
    //     break;
    //   default:
    //     System.out.println("잘못 입력하셨습니다.");
    // }

    // System.out.println(gender);


    // int month = 0;

    // Scanner scanner = new Scanner(System.in);
    // System.out.println("현재 월을 입력하세요 : ");
    // month = scanner.nextInt();

    // switch (month){
    //   case 12:
    //   case 1:
    //   case 2:
    //     System.out.println("현재 계절은 겨울입니다.");
    //     break;
    //   case 3: case 4: case 5:
    //     System.out.println("현재 계절은 봄입니다.");
    //     break;
    //   case 6: case 7: case 8:
    //     System.out.println("현재 계절은 여름입니다.");
    //     break;
    //   case 9: case 10: case 11:
    //     System.out.println("현재 계절은 가을입니다.");
    //     break;
    // }

    //다른이------------------------------------
    //   if (score <= 2 || score >= 12 ) {
    //   name = "겨울";
    //   } else if (score >= 3) {
    //   name = "봄";
    //   } else if (score >= 6) {
    //   name = "여름";
    //   } else  {
    //   name = "가을";
    //   }
    // System.out.printf("현재의 계절은 %s입니다.", name);

    
    // int score = 0;
    // String name;
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("현재 월을 입력하세요 : ");
    // score = scanner.nextInt();
    //   if (score <= 2 || score >= 12 ) {
    //   name = "겨울";
    //   } else if (score >= 3) {
    //   name = "봄";
    //   } else if (score >= 6) {
    //   name = "여름";
    //   } else  {
    //   name = "가을";
    //   }
    // System.out.printf("현재의 계절은 %s입니다.", name);
    //다른이-------------------------------------------------
    

    // int input;
    
    // Scanner scanner = new Scanner(System.in);
    // String tmp = scanner.nextLine();
    // int = Integer.parseInt(tmp);
    
    // System.out.print("현재 월을 입력하세요.>");

    // if (input >=3) {
    //   tmp = '봄';
    //   if (input 3 >= && >= 5)
    // } else if (input >=6) {
    //   tmp = '여름';
    // } else if (input >=9) {
    //   tmp = '가을';
    // } else {
    //   tmp = '겨울';
    // }

    // System.out.printf("현재의 계절은 %d입니다." , month);

    

  //   char grade = ' ';
  //   char opt = ' ';

  // System.out.print("점수를 입력해주세요.>");
  //   Scanner scanner = new Scanner(System.in);
  //   int score = scanner.nextInt();

  //   //System.out.print("당신의 점수는 " + score + "점 입니다.");
  //   System.out.printf("당신의 점수는 %d점 입니다.%n" , score);

  //   if (score >=90) {
  //     grade = 'A';
  //     if (score >=98) {
  //       opt = '+';
  //     } else if (score >=94) {
  //       opt = '0';
  //     } else {
  //       opt = '-';
  //     }
  //   } else if (score >=80) {
  //     grade = 'B';
  //   } else if (score >=70) {
  //     grade = 'C';
  //   } else {
  //     grade = 'D';
  //   }

  //   System.out.printf("당신의 학점은 %c입니다.", grade);

    

    // System.out.print("숫자를 하나 입력하세요.>");
        // Scanner scanner = new Scanner(System.in);
        // int input = scanner.nextInt();

        // if(input==0) {
        //   System.out.println("입력하신 숫자는 0입니다.");
        // } else {
        //   System.out.println("입력하신 숫자는 0이 아닙니다.");
        // }
    
        // if(input % 2 == 0) {
        //   System.out.println("입력하신 숫자는 짝수입니다.");
        // } else {
        //   System.out.println("입력하신 숫자는 홀수입니다.");
        // }

        // if(input % 3 == 0) {
        //   System.out.println("입력하신 숫자는 3의 배수입니다.");
        // } else {
        //   System.out.println("입력하신 숫자는 3의 배수가 아닙니다.");        
        // }
    

    
    //     int score = 0;
    //     char grade = 
    
    // System.out.print("점수를 입력하세요.>");      
    //     Scanner scanner = new Scanner(System.in);
    //     int score = scanner.nextInt();
    
    //       if(score >=90) {
    //         grade = 'A';  //System.out.println("당신의 학점은 A입니다.");
    //       } else if(score >=80) {
    //         grade = 'B';  //System.out.println("당신의 학점은 B입니다.");
    //       } else if(score >=70) {
    //         grade = 'C';  //System.out.println("당신의 학점은 C입니다.");
    //     } else {
    //         grade = 'D';  //System.out.println("당신의 학점은 D입니다.");      
    //     }
    //     System.out.println("당신의 학점은 "+ grade +"입니다.");      
    
    
    // int input;

    // System.out.print("숫자를 하나 입력하세요.>");

    // Scanner scanner = new Scanner(System.in);
    // String tmp = scanner.nextLine();
    // input = Integer.parseInt(tmp);

    // if(input==0) {
    //   System.out.println("입력하신 숫자는 0입니다.");
    // }

    // if(input!=0) {
    //   System.out.println("입력하신 숫자는 0이 아닙니다.");
    //   System.out.printf("입력하신 숫자는 %d입니다.", input);
    // }

    

    // int x= 0; //정수형 변수 x 에 초기값 0을 대입
    // System.out.printf("x=%d 일 때, 참인 것은%n", x); // %d 자리표시자 d 정수 , %n 개행문자 줄바꿈

    // if(x==0) System.out.println("x==0");
    // if(x!=0) System.out.println("x!=0");
    // if(!(x==0)) System.out.println("!(x==0)");
    // if(!(x!=0)) System.out.println("!(x!=0)");

    // x = 1;
    // System.out.printf("x=%d 일 때, 참인 것은%n", x);

    // if(x==0) System.out.println("x==0");

    // // if 구문에서 true 일경우 실행 하는 구문은 중괄호를 항상 사용하자.
    // if(x!=0) {
    //   System.out.println("x!=0");
    // }

    // if(!(x==0)) System.out.println("!(x==0)");
    // if(!(x!=0)) System.out.println("!(x!=0)");
    
    

    // Scanner stdIn = new Scanner(System.in);

    // System.out.println("삼각형의 넓이를 구합니다.");

    // System.out.print("밑변:");

    // double x = stdIn.nextDouble();

    // System.out.print("높이:");

    // double y = stdIn.nextDouble();

    // System.out.println("넓이는 " + (x * y /2) +"입니다.");

    

    // System.out.print("x값:");

    // double x = stdIn.nextDouble();

    // System.out.print("y값:");

    // double y = stdIn.nextDouble();

    // System.out.println("합계는 " + (x + y) +"입니다.");
    // System.out.println("평균은 " + (x + y) / 2 + "입니다.");

    

    // System.out.println("정숫값:");

    // int x = stdIn.nextInt();
    
    // System.out.println("마지막 자릿수를 제외한 값은 " + (x / 10) + "입니다.");
    // System.out.printf("마지막 자릿수는 " + (x % 10)+ "입니다.");

    
    // System.out.println("Hello World!!!");
  }
}
