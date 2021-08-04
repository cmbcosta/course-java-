package secao13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Department;
import entities.HourContract;
import entities.Order;
import entities.Post;
import entities.Worker;
import entities.enums.OrderStatus;
import entities.enums.WorkerLevel;

public class Program1 {

    public static void main(String[] args) throws ParseException {

        /*
         * Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
         * 
         * System.out.println(order); OrderStatus os1 = OrderStatus.DELIVERED;
         * OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); System.out.println(os1);
         * System.out.println(os2);
         */

        /*
         * Locale.setDefault(Locale.US); Scanner scanner = new Scanner(System.in);
         * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
         * 
         * System.out.print("Enter department's name: "); String departmentName =
         * scanner.nextLine(); System.out.println("Enter worker data:");
         * System.out.print("Name: "); String workerName = scanner.nextLine();
         * System.out.print("Level: "); String workerLevel = scanner.nextLine();
         * System.out.print("Base salary: "); double baseSalary = scanner.nextDouble();
         * Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),
         * baseSalary, new Department(departmentName));
         * 
         * System.out.print("How many contracts to this worker? "); int n =
         * scanner.nextInt();
         * 
         * for (int i = 0; i < n; i++) { System.out.println("Enter contract #" + i +
         * " data:"); System.out.print("Date (DD/MM/YYYY): "); Date contractDate =
         * sdf.parse(scanner.next()); System.out.print("Value per hour: "); double
         * valuePerHour = scanner.nextDouble(); System.out.print("Duration (hours): ");
         * int hours = scanner.nextInt(); HourContract contract = new
         * HourContract(contractDate, valuePerHour, hours);
         * worker.addContract(contract);
         * 
         * } System.out.println();
         * System.out.print("Enter month and year to calculate income (MM/YYYY): ");
         * String monthAndYear = scanner.next(); int month =
         * Integer.parseInt(monthAndYear.substring(0, 2)); int year =
         * Integer.parseInt(monthAndYear.substring(3)); System.out.println("Name: " +
         * worker.getName()); System.out.println("Department: " +
         * worker.getDepartment().getName()); System.out.println("Income for " +
         * monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
         * 
         * scanner.close();
         */

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("have a nice Trip!");
        Comment c2 = new Comment("wow that's awesome!");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
                "I'm going to visit this wonderful country!", 12);
        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        Post p2 = new Post(
            sdf.parse("28/07/2018 23:14:19"), 
            "Good night guys", 
            "See you tomorrow", 
            5);

            p2.addComment(c3);
            p2.addComment(c4);
            p2.removeComment(c3);
        

        System.out.println(p1);
        System.out.println(p2);
    }

}
