package mission;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrinterServiceTest {

  private Model model;

  @BeforeEach
  void setup() {
    model = new Model();
  }

  @Test
  public void inkStartsAtMaximum() {
    assertEquals(1000, model.getInk());
  }

  @Test
  public void inkDecreasesOnPrint() {
    String[] lines = model.printDigits("0", 1);
    for (String line : lines) {
      model.useInk(line);
    }
    assertTrue(model.getInk() < 1000);
  }

  @Test
  public void canReplaceInk() {
    String[] lines = model.printDigits("88888888", 8);
    for (String line : lines) {
      model.useInk(line);
    }
    assertTrue(model.getInk() < 1000);
    model.replaceInk();
    assertEquals(1000, model.getInk());
  }

  @Test
  public void preventPrintWhenInkIsLow() {
    for (int i = 0; i < 100; i++) {
      String[] lines = model.printDigits("8", 1);
      for (String line : lines) {
        model.useInk(line);
      }
    }
    String[] lines = model.printDigits("8", 1);
    boolean result = model.useInk(lines[0]);
    assertFalse(result); // 잉크가 부족하므로 false 반환해야 함
  }

  @Test
  public void printDigitsGeneratesFiveLines() {
    String[] output = model.printDigits("123", 3);
    assertEquals(5, output.length);
  }

}
