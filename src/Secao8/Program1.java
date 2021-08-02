package Secao8;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        student.name = sc.nextLine();
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();
        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
/*
 * import java.util.Locale; import java.util.Scanner; import entities.Employee;
 * public class Program { public static void main(String[] args) {
 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in); Employee
 * emp = new Employee(); System.out.print("Name: "); emp.name = sc.nextLine();
 * System.out.print("Gross salary: "); emp.grossSalary = sc.nextDouble();
 * System.out.print("Tax: "); emp.tax = sc.nextDouble(); System.out.println();
 * System.out.println("Employee: " + emp); System.out.println();
 * System.out.print("Which percentage to increase salary? "); double percentage
 * = sc.nextDouble(); emp.increaseSalary(percentage); System.out.println();
 * System.out.println("Updated data: " + emp); sc.close(); } }
 */

/*
 * import java.util.Locale; import java.util.Scanner; import entities.Rectangle;
 * 
 * public class Program { public static void main(String[] args) {
 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in); Rectangle
 * rect = new Rectangle();
 * System.out.println("Enter rectangle width and height:"); rect.width =
 * sc.nextDouble(); rect.height = sc.nextDouble();
 * System.out.printf("AREA = %.2f%n", rect.area());
 * System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
 * System.out.printf("DIAGONAL = %.2f%n", rect.diagonal()); sc.close(); } }
 */

/*
 * import java.util.Locale; import java.util.Scanner;
 * 
 * import entities.Product;
 * 
 * public class Program { public static void main(String[] args) {
 * /*Locale.setDefault(Locale.US); Scanner scanner = new Scanner(System.in);
 * Product product = new Product(); System.out.println("Enter product data: ");
 * System.out.print("Name: "); product.name = scanner.nextLine();
 * System.out.print("Price: "); product.price = scanner.nextDouble();
 * System.out.print("Quantity in stock: "); product.quantity =
 * scanner.nextInt(); System.out.println(); System.out.println("Product data: "
 * + product); System.out.println();
 * System.out.print("Enter the number of products to be added in stock: "); int
 * quantity = scanner.nextInt(); product.addProducts(quantity);
 * System.out.println(); System.out.println("Updated data: " + product);
 * System.out.println();
 * System.out.print("Enter the number of products to be removed from stock: ");
 * quantity = scanner.nextInt(); product.removeProducts(quantity);
 * System.out.println(); System.out.println("Updated data: " + product);
 * scanner.close();
 * 
 * } }
 */