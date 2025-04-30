package mission;

public class AsciiDigit {
  public static String[] get(char c){
    // 각 숫자 문자에 대한 ASCII 아트 정의 (한 줄씩 개행 없이 표현)
    return switch (c) {
      case '0' -> new String[]{"◼◼◼", "◼ ◼", "◼ ◼", "◼ ◼", "◼◼◼"};
      case '1' -> new String[]{"◼", "◼", "◼", "◼", "◼"};
      case '2' -> new String[]{"◼◼◼", "  ◼", "◼◼◼", "◼  ", "◼◼◼"};
      case '3' -> new String[]{"◼◼◼", "◼  ", "◼◼◼", "◼  ", "◼◼◼"};
      case '4' -> new String[]{"◼ ◼", "◼ ◼", "◼◼◼", "  ◼", "  ◼"};
      case '5' -> new String[]{"◼◼◼", "◼  ", "◼◼◼", "  ◼", "◼◼◼"};
      case '6' -> new String[]{"◼  ", "◼  ", "◼◼◼", "◼ ◼", "◼◼◼"};
      case '7' -> new String[]{"◼◼◼", "  ◼", "  ◼", "  ◼", "  ◼"};
      case '8' -> new String[]{"◼◼◼", "◼ ◼", "◼◼◼", "◼ ◼", "◼◼◼"};
      case '9' -> new String[]{"◼◼◼", "◼ ◼", "◼◼◼", "  ◼", "  ◼"};
      default -> new String[]{"   ", "   ", "   ", "   ", "   "};
    };
  }
}
