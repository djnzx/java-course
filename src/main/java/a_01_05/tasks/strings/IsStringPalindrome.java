package a_01_05.tasks.strings;

public class IsStringPalindrome {

  static boolean check(String origin) {
    return new StringBuilder(origin).reverse().toString().equals(origin);
  }

}
