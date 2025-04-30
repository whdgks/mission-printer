package mission;
import java.util.Scanner;

public class View {
  public static void printMenu() {
    System.out.println("사용할 기능을 입력해주세요. 1) 출력, 2) 잉크 잔량 확인, 3) 잉크 교체, 4) 프로그램 종료");
  }

  public static int inputInt(Scanner scanner) {
    return Integer.parseInt(scanner.nextLine());
  }

  public static String inputDigits(Scanner scanner) {
    System.out.println("출력할 문자를 입력해주세요.");
    return scanner.nextLine();
  }

  public static int inputWidth(Scanner scanner) {
    System.out.println("용지 크기를 입력해주세요.");
    return Integer.parseInt(scanner.nextLine());
  }

  public static void printInk(int ink) {
    System.out.println("잉크 잔량 : " + ink + "/1000");
  }
}
