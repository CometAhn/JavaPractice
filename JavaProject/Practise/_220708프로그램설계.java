import java.util.Scanner;

public class _220708프로그램설계 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // int x = 100;
    // int y = 50;
    // int a = x * y;
    //
    // System.out.println(a);

    // int upper = 10;
    // int low = 30;
    // int height = 20;
    // int area = (upper + low) * height / 2;
    //
    // System.out.println(area);

    // 우리나라에서 개인들은 건물이나 토지의 면적 단위로 평을 많이 사용하고 있다.
    // 그러나 정부에서는 고잇ㄱ적으로 제곱미터(m^2)를 사용하고있다.
    // 1평은 3.305785 m^2다 사용자로부터 평으로 표시된 면적을 입력 받아
    // 제곱미터로 된 면적으로 변환하여 출력하는 프로그램을 설계한 후 작성 하라.

    // Scanner sc = new Scanner(System.in);
    //
    // System.out.println("제곱미터로 변환할 평수를 적으세요. : ");
    // int a = sc.nextInt();
    //
    // float output = (float) (a * 3.305785);
    //
    // System.out.printf("%d평은 %.5f제곱미터이다.", a, output);

    // 문제4 한 사무실의 벽들과 천장을 페인트 칠하는데 필요한 페인트의 양을 계산하는 프로그램을 설계한 후 작성하라.
    // 사무실은 가로와 세로와 높이를 가진다. 1통의 페인트로 500미터를 칠할 수 있다고 가정하라.
    // 사무실의 가로와 세로와 높이를 키보드를 통해 입력 받아 칠해야 할 총 면적을 계산하여 필요한 페인트의 통수를 계산한다.
    // 페인트의 통수는 실수일 수 있다. 입력 받은 값들과 결과를 출력하라.

    /*
     * Scanner sc = new Scanner(System.in);
     * 
     * System.out.print("가로 길이는 ? "); int x = sc.nextInt(); System.out.print("세로 길이는 ? "); int y =
     * sc.nextInt(); System.out.print("높이 길이는 ? "); int height = sc.nextInt();
     * 
     * int area = (x * y) + (x * height * 2) + (y * height * 2);
     * 
     * System.out.println(area); int paint = 500;
     * 
     * float output = (float) area / paint;
     * 
     * System.out.println("바닥을 제외한 칠 할 때 필요한 페인트통 수는 : " + output + "입니다.");
     */

    // 문제5. 직각삼각형의 밑변의 길이와 높이의 길이를 키보드를 통해 입력 받아
    // 면적을 계산하여 출력하는 프로그램을 설계한 후 작성하라.

    /*
     * Scanner sc = new Scanner(System.in);
     * 
     * System.out.println("직각삼각형의 면적을 구하고자 한다.");
     * 
     * System.out.print("밑변의 길이는 ?"); int low = sc.nextInt();
     * 
     * System.out.print("높이의 길이는 ?"); int height = sc.nextInt();
     * 
     * int area = low * height / 2;
     * 
     * System.out.printf("밑변 %d, 높이 %d인 직각삼각형의 면적은 %d이다.", low, height, area);
     */

    // 문제6. 구의 부피를 계산하는 프로그램을 설계한 후 작성하라. 구의 반지름(r)은 키보드를 통해 입력 받아야 한다.
    // 구의 부피를 구하는 공식은 다음과 같다. 구의 부피 = 4/3*파이*r^3

    /*
     * Scanner sc = new Scanner(System.in); System.out.println("구의 부피를 계산하고자 한다.");
     * System.out.print("구의 반지름은?"); int r = sc.nextInt();
     * 
     * float PI = (float) 3.14; double volume = (float) (4 / 3 * PI * r * r * r);
     * 
     * System.out.printf("구의 반지름은 %.5f이다.", volume);
     */

    // 문제7. 돼지 저금통에 들어 있는 동전들의 총액을 계산하여 출력하는 프로그램을 설계한 후 작성하라.
    // 저금통에 들어 있는 500원짜리, 100원짜리, 50원짜리와 10원짜리 동전들의 수를 나타내는 정수 값들을 키보드를 통해 입력 받아야
    // 한다.
    /*
     * Scanner sc = new Scanner(System.in);
     * 
     * System.out.println("저금통에 들어있는 돈은?"); int total = sc.nextInt();
     * 
     * int baek = 0; int obaek = 0; int osip = 0; int sip = 0;
     * 
     * while (true) {
     * 
     * if (total >= 500) { total -= 500; obaek++; continue; } else if (total >= 100) { total -= 100;
     * baek++; continue; }
     * 
     * else if (total >= 50) { total -= 50; osip++; continue; } else if (total >= 10) { total -= 10;
     * sip++; continue; } else { break; } } System.out.println("오백원 : " + obaek);
     * System.out.println("백원 : " + baek); System.out.println("오십원 : " + osip);
     * System.out.println("십원 : " + sip);
     */

    /*
     * Scanner sc = new Scanner(System.in);
     * 
     * int obaek = sc.nextInt(); int baek = sc.nextInt(); int osip = sc.nextInt(); int sip =
     * sc.nextInt();
     * 
     * int total = obaek * 500 + baek * 100 + osip * 50 + sip * 10;
     * 
     * System.out.println(total);
     */

    // 문제8. 자동판매기로부터 물건을 사면 거스름돈을 계산하여 알려주는 프로그램을 설계한 후 작성하라.
    // 자동판매기 안에 있는 물건들의 가격은 모두 1,000원 이하이다. 자동판매기는 물건 값으로 1,000원짜리 지폐만을 받는다.
    // 거스름돈은 500원, 100원, 50원, 10원, 5원, 1원짜리 동전들로만 주어야 한다. 거스름 돈에 포함된 동전들의 개수는 최소가
    // 되어야 한다.
    // 프로그램 출력은 아래의 출력과 같아야 한다.

    Scanner sc = new Scanner(System.in);

    System.out.printf("물건의 가격(1,000원 이하)을 입력하세요. :");
    int price = sc.nextInt();

    System.out.printf("%d원 짜리물건을 샀고, 1,000원을 내셨습니다.\n", price);
    int odd = 1000 - price;
    System.out.printf("거스름돈은 %d원 입니다.\n", odd);
    System.out.println("거스름돈의 내역은 다음과 같습니다.\n\n");

    int o = 0;
    int b = 0;
    int so = 0;
    int sb = 0;
    int sso = 0;
    int ssb = 0;

    while (odd > 0) {

      if (odd >= 500) {
        odd -= 500;
        o++;
      } else if (odd >= 100) {
        odd -= 100;
        b++;
      } else if (odd >= 50) {
        odd -= 50;
        so++;
      } else if (odd >= 10) {
        odd -= 10;
        sb++;
      } else if (odd >= 5) {
        odd -= 5;
        sso++;
      } else if (odd >= 1) {
        odd -= 1;
        ssb++;
      }
    }

    System.out.printf("오백원 %d개\n", o);
    System.out.printf("백원 %d개\n", b);
    System.out.printf("오십원 %d개\n", so);
    System.out.printf("십원 %d개\n", sb);
    System.out.printf("오원 %d개\n", sso);
    System.out.printf("일원 %d개\n", ssb);


  }

}
