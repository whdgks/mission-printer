package mission;
import java.util.Scanner;
public class Controller {
  private final Scanner scanner = new Scanner(System.in);
  private final Model model = new Model();

  public void run() {
    System.out.println("프린터를 실행합니다.");
    while (true) {
      View.printMenu();
      int option = View.inputInt(scanner);
      if (option == 1) print();
      if (option == 2) View.printInk(model.getInk());
      if (option == 3) {
        model.replaceInk();
        System.out.println("잉크를 교체하였습니다.");
      }
      if (option == 4) break;
    }
  }

  private void print() {
    String digits = View.inputDigits(scanner);
    int width = View.inputWidth(scanner);
    String[] output = model.printDigits(digits, width);
    for (String line : output) {
      if (!model.useInk(line)) {
        System.out.println("잉크가 부족해 출력이 중단되었습니다.");
        return;
      }
      System.out.println(line);
    }
    System.out.println("출력이 완료되었습니다.");
  }
}
