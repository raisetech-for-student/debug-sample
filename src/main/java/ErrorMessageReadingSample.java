import java.util.List;
import java.util.Map;

public class ErrorMessageReadingSample {

  public static void main(String[] args) {
    Map<Integer, String> studentById = Map.of(123, "takahashi", 234, "yamamoto", 345, "nakamura");
    System.out.println(studentById.get(2));

    List<Integer> ids = List.of(123, 234, 345, 456);

    for (int i = 0; i <= ids.size(); i++) {
      String name = studentById.get(ids.get(i));
      System.out.println(name.toUpperCase());
    }
  }
}
