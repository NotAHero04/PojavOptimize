public class POEasterEgg {
  public static void main(String[] args) {
    for (int i = 0; i < 13; i++) {
      double n = 0.000053077066966 * pow(i, 12) - 0.003927794813211 * pow(i, 11) + 0.128374026308054 * pow(i, 10) - 2.438312940917108 * pow(i, 9) + 29.791615961199295 * pow(i, 8) - 244.72905505905238 * pow(i, 7) + 1371.5105510545268 * pow(i, 6) - 5207.339225088183 * pow(i, 5) + 13012.435084692828 * pow(i, 4) - 20151.481073633156 * pow(i, 3) + 17137.13432118807 * pow(i, 2) - 5914.008405483405 * i + 80.0;
     System.out.print(String.valueOf(Character.toChars(rnd(n))));
    }
  }

  static int rnd(double n) {
    if (n - (int) n < 0.5) {
      return (int) n;
    } else return (int) (n+1);
  }

  static double pow(double a, int i) {
    return Math.pow(a, (double) i);
  }
}
