public class FizzBuzz_While {
    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {
            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");
            i++;

        } else if (divisibleBy3) {

            System.out.println("Fizz");
            i++;

        } else if (divisibleBy5) {

            System.out.println("Buzz");
            i++;

        } else {

            System.out.println(i);
            i++;
        }
        return i;
    }
}
