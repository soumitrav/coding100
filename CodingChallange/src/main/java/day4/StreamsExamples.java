package day4;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExamples {

    public static void main(String []args) throws ExecutionException, InterruptedException {
        Stream.iterate(3L, n -> n + 2).limit(5).forEach(System.out::println);
        Stream.generate(Math::random).map(n -> n*100).limit(5).forEach(System.out::println);
        int sum = Stream.of(1, 2, 3, 4, 5)
                .peek(e -> System.out.println("Taking integer: " + e))
                .filter(n -> n % 2 == 1)
                .peek(e -> System.out.println("Filtered integer: " + e))
                .map(n -> n * n)
                .peek(e -> System.out.println("Mapped integer: " + e))
                .reduce(0, Integer::sum);
        System.out.println("sum = " + sum);

        List<Person> people = List.of(new Person(100, "F", "R1"),
                new Person(6000, "M", "R2"));

        List<Person> femaleIncrease = people.stream().filter(n -> n.gender == "F").map(n -> {
            n.setIncome(n.getIncome() * 1.10);
            return n;
        }).collect(Collectors.toList());

        femaleIncrease.stream().forEach(System.out::println);
        System.out.println("Print name for person with income > 5000");
        people.stream().filter(p -> p.getGender() == "M" && p.getIncome() > 5000).map(p -> p.name).forEach(System.out :: println);

        Double totalIncome = people.stream().map(p -> p.getIncome()).reduce((a, b) -> a + b).get();
        System.out.println("Total income : "+totalIncome);

        ForkJoinPool forkJoinPool = new ForkJoinPool(4); // Configure the number of threads
        List<Integer> integers = forkJoinPool.submit(() -> IntStream.range(1, 1_000_000).parallel().filter(StreamsExamples::isPrime).boxed().
                collect(Collectors.toList())).get();
        integers.stream().forEach(System.out :: println);
        forkJoinPool.shutdown();

    }

    private static boolean isPrime(long n) {
        return n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(divisor -> n % divisor == 0);
    }

    private static class Person{
        double income;
        String gender;

        String name;

        public Person(double income, String gender, String name) {
            this.income = income;
            this.gender = gender;
            this.name = name;
        }

        public double getIncome() {
            return income;
        }

        public void setIncome(double income) {
            this.income = income;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "income=" + income +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }
}
