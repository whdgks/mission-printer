package mission;

public class Model {
  private static final int MAX_INK = 1000;
  private int ink = MAX_INK;

  public String[] printDigits(String input, int width) {
    StringBuilder[] result = new StringBuilder[0];

    int numChunks = (int) Math.ceil((double) input.length() / width);
    result = new StringBuilder[numChunks * 5];
    for (int i = 0; i < result.length; i++) {
      result[i] = new StringBuilder();
    }

    for (int chunkIdx = 0; chunkIdx < numChunks; chunkIdx++) {
      int start = chunkIdx * width;
      int end = Math.min(start + width, input.length());
      String chunk = input.substring(start, end);

      for (int row = 0; row < 5; row++) {
        for (int j = 0; j < chunk.length(); j++) {
          char digit = chunk.charAt(j);
          String[] art = AsciiDigit.get(digit);
          result[chunkIdx * 5 + row].append(art[row]).append(" ");
        }
      }
    }

    String[] output = new String[result.length];
    for (int i = 0; i < result.length; i++) {
      output[i] = result[i].toString();
    }
    return output;
  }

  public boolean useInk(String line) {
    int count = (int) line.codePoints()
        .mapToObj(cp -> String.valueOf((char) cp))
        .filter(s -> s.equals("◼"))
        .count();
    if (ink < count) return false;
    ink -= count;
    return true;
  }

  public int getInk() {
    return ink;
  }

  public void replaceInk() {
    ink = MAX_INK;
  }
}
