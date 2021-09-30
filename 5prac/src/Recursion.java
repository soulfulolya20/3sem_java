public class Recursion {

    public static void main(String[] args) {
        System.out.println(recursion4(0, 0, 2, 10));
        System.out.println(recursion5(1997));
        System.out.println(recursion6(587, 2));
    }

    public static int recursion4(int len, int sum, int k, int s) {
        if (len == k) if (sum == s) {
            return 1; // найдено нужное число
        } else {
            return 0; // не найдено необходимое число
        }
        int c = (len == 0 ? 1 : 0); // нач. значение sum = 0, а данные нам числа - натуральные
        int res = 0;
        for (int i = c; i < 10; i++) {
            res += recursion4(len + 1, sum + i, k, s);
        }
        return res;
    }

    public static int recursion5(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + recursion5(n / 10);
        }
    }

    public static boolean recursion6(int n, int i) {
        // i - параметр рекурсии (делитель n)
        if (n < 2) {
            return false; // не соотв. условию
        } else if (n == 2) {
            return true;
        } else if (n % i == 0) {
            return false; // делитель
        } else if (i < n / 2) {
            return recursion6(n, i + 1);
        } else {
            return true;
        }
    }
}
