// Lucas Pardede - 12S24015

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String soal = sc.next();

        switch (soal) {

            case "Soal1": {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int sum = a + b;

                if ((a > 0 && b > 0 && sum < 0) ||
                    (a < 0 && b < 0 && sum > 0)) {
                    System.out.println("OVERFLOW");
                } else {
                    System.out.println(sum);
                }
                break;
            }

    case "Soal2": {
    String xs = sc.next();
    String ys = sc.next();

    float xf = Float.parseFloat(xs);
    float yf = Float.parseFloat(ys);
    float fsum = xf + yf;

    double xd = Double.parseDouble(xs);
    double yd = Double.parseDouble(ys);
    double dsum = xd + yd;

    double diff = Math.abs(dsum - (double)fsum);
    System.out.printf("%.6f\n", diff);
    break;
}


            case "Soal3": {
                int N = sc.nextInt();
                Integer a = N;
                Integer b = a;
                a = a + 1;
                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));
                break;
            }

            case "Soal4": {
                String S = sc.next();
                String a = S;
                String b = new String(S);
                a = a + "X";
                System.out.println("==: " + (a == b));
                System.out.println("equals: " + a.equals(b));
                break;
            }

            case "Soal5": {
                String iStr = sc.next();
                String dStr = sc.next();
                String bStr = sc.next();

                int i = Integer.parseInt(iStr);
                double d = Double.parseDouble(dStr);
                boolean flag = Boolean.parseBoolean(bStr);

                double result = i * d;
                if (!flag) result *= -1;

                System.out.printf("%.2f\n", result);
                break;
            }
        }

        sc.close();
    }
}

update trigger autograding