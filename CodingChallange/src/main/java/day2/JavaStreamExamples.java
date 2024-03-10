package day2;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class JavaStreamExamples {

    public static void main(String []args) {
        String[] names = {"One", "Two", "Three", "Four", "Five", "Six"};

        // Sort the array with equals ignore cse and print it
        Arrays.stream(names).sorted(String :: compareToIgnoreCase).forEach(System.out :: println);

        //Based on the length
        System.out.println("Sort by length");
        Arrays.stream(names).sorted((o1, o2) -> Integer.compare(o1.length(), o2.length())).forEach(System.out :: println);


        Employee e1 = new Employee(Date.from(LocalDate.now().minusDays(5).atStartOfDay(ZoneId.systemDefault()).toInstant()), 1);
        Employee e2 = new Employee(Date.from(LocalDate.now().minusDays(3).atStartOfDay(ZoneId.systemDefault()).toInstant()), 2);
        Employee e3 = new Employee(Date.from(LocalDate.now().minusDays(4).atStartOfDay(ZoneId.systemDefault()).toInstant()), 3);
        Employee e4 = new Employee(Date.from(LocalDate.now().minusDays(1).atStartOfDay(ZoneId.systemDefault()).toInstant()), 4);
        Employee e5 = new Employee(Date.from(LocalDate.now().minusDays(1).atStartOfDay(ZoneId.systemDefault()).toInstant()), 5);

        List<Employee> employeeList = List.of(e1, e2, e3, e5, e4);

        employeeList.stream().sorted((o1, o2) -> o1.hireData.compareTo(o2.hireData)).forEach(System.out:: println);
        System.out.println("With new Method");
        employeeList.stream().sorted(Comparator.comparing(Employee:: getHireData)).forEach(System.out :: println);
        System.out.println("With new Method - 2 - Reverse order");
        employeeList.stream().sorted(Comparator.comparing(Employee:: getHireData, Comparator.reverseOrder())).forEach(System.out :: println);

        System.out.println("With new Method - 2 - Compare with Id and HireDate");
        employeeList.stream().sorted(Comparator.comparing(Employee:: getHireData).thenComparing(Comparator.comparing(Employee :: getEmpId))).forEach(System.out :: println);
    }

    private static class Employee {
            Date hireData;
            int empId;

        public Employee(Date hireData, int empId) {
            this.hireData = hireData;
            this.empId = empId;
        }

        public Date getHireData() {
            return hireData;
        }

        public void setHireData(Date hireData) {
            this.hireData = hireData;
        }

        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "hireData=" + hireData +
                    ", empId=" + empId +
                    '}';
        }
    }
}
