public class Main {
    public static void main(String[] args) {

        int ticket = 100; // сколько стоит 1 билет
        int spent = 20; // 1 миля начисляется за 20 рублей

        System.out.println("Количество бонусных миль:");
        System.out.println((ticket / spent) + " миль");
    }
}
