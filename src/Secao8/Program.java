package Secao8;

import entities.Product1;
import entities.Rent;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.text.SimpleDateFormat;

import javax.swing.text.Position;

import entities.CurrencyConverter;
import entities.Employee;
import entities.Account;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        // Product p = new Product();
        /*
         * CurrencyConverter conversor = new CurrencyConverter();
         * 
         * System.out.println("Qual a cotação do dolar: "); conversor.dolar =
         * scanner.nextDouble();
         * 
         * System.out.println("Deseja comprar quantos dolares: "); conversor.dolares =
         * scanner.nextDouble();
         * 
         * System.out.printf("Valor Dolares : %.2f%n", + conversor.dolar);
         * System.out.println(" ");
         * System.out.printf("Valor que deseja comprar : %.2f%n", + conversor.dolares);
         * System.out.println(" "); System.out.printf("Valor da compra : %.2f%n", +
         * conversor.valorDolares());
         */

        /*
         * System.out.println("Enter product data: "); System.out.print("Name: ");
         * String name = scanner.nextLine(); System.out.print("Price: "); double price =
         * scanner.nextDouble(); Product product = new Product(name, price);
         * 
         * product.setName("Computer"); System.out.println("Updated name: " +
         * product.getName()); product.setPrice(1200.00);
         * System.out.println("Updated price: " + product.getPrice());
         * 
         * System.out.println(); System.out.println("Product data: " + product);
         * System.out.println();
         * System.out.print("Enter the number of products to be added in stock: "); int
         * quantity = scanner.nextInt(); product.addProducts(quantity);
         * System.out.println(); System.out.println("Updated data: " + product);
         * System.out.println();
         * System.out.print("Enter the number of products to be removed from stock: ");
         * quantity = scanner.nextInt(); product.removeProducts(quantity);
         * System.out.println(); System.out.println("Updated data: " + product);
         */

        /*
         * Account account;
         * 
         * System.out.print("Enter account number: "); int number = scanner.nextInt();
         * System.out.print("Enter account holder: "); scanner.nextLine(); String holder
         * = scanner.nextLine();
         * System.out.print("Is there an initial deposit (y/n)? "); char response =
         * scanner.next().charAt(0); if (response == 'y') {
         * System.out.print("Enter initial deposit value: "); double initialDeposit =
         * scanner.nextDouble(); account = new Account(number, holder, initialDeposit);
         * 
         * }else{ account = new Account(number, holder); }
         * 
         * System.out.println(); System.out.println("Account data: ");
         * System.out.println(account);
         * 
         * System.out.println(); System.out.println("Enter a deposit value: "); double
         * depositValue = scanner.nextDouble(); account.deposit(depositValue);
         * System.out.println("Update account data: "); System.out.println(account);
         * 
         * System.out.println(); System.out.println("Enter a withdraw value: "); double
         * withdrawValue = scanner.nextDouble(); account.withdraw(withdrawValue);
         * System.out.println("Update account data: "); System.out.println(account);
         */

        /*
         * int n = scanner.nextInt(); double[] vect = new double[n];
         * 
         * for (int i = 0; i < n; i++) { vect[i] = scanner.nextDouble(); }
         * 
         * double sum = 0; for (int i = 0; i < n; i++) { sum += vect[i];
         * 
         * } double avg = sum / n;
         * 
         * System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
         */
        /*
         * int n = scanner.nextInt(); Product1[] vect = new Product1[n]; for (int i = 0;
         * i < vect.length; i++) { scanner.nextLine(); String name = scanner.nextLine();
         * double price = scanner.nextDouble(); vect[i] = new Product1(name, price); }
         * double sum = 0.0; for (int i = 0; i < vect.length; i++) { sum +=
         * vect[i].getPrice(); } double avg = sum / vect.length;
         * System.out.printf("AVERAGE PRICE = %.2f%n", avg);
         */
        /*Rent[] vect = new Rent[10];
        System.out.print("How many rooms will be rented? ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            vect[room] = new Rent(name, email);
        }
        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }*/

        /*List <String> list = new ArrayList<>();

        list.add("maria");
        list.add("alex");
        list.add("bob");
        list.add("ana");
        list.add("caike");
        list.add(2, "marcos");
        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("________________");
        list.removeIf(x -> x.charAt(0) == 'm');
        for (String x : list) {
            System.out.println(x);
            
        }*/

        /*List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {

            System.out.println();
            System.out.println("Emplyoee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = scanner.nextInt();
            while(hasId(list, id)){
                System.out.println("Id already taken! try again: ");
                id = scanner.nextInt();
            }
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            Double salary = scanner.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase : ");
        int idSalary = scanner.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

        //Integer after = position(list, idSalary);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }else{
            System.out.print("Enter the percentage: ");
            double percent = scanner.nextDouble();
            emp.increaseSalary(percent);
        }
        System.out.println();
        System.out.println("List of employees:");
        for (Employee e : list) {
            System.out.println(e);
        }


        scanner.close();

    }

    public static Integer position(List<Employee> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id ){
                return i;
            }
        }
        return null;
    }
    public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
        */
        /*int n = scanner.nextInt();
		int[][] mat = new int[n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		System.out.println("Negative numbers = " + count);*/
        /*int m = scanner.nextInt();
		int n = scanner.nextInt();
		int[][] mat = new int[m][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = scanner.nextInt();
			}
		}
		
		int x = scanner.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}*/
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse("02/08/2021");
        Date y2 = sdf2.parse("02/08/2021 11:03:25");

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());

        System.out.println(sdf2.format(y1));
        System.out.println(sdf2.format(y2));
        System.out.println(x1);
        System.out.println(x2);
	}
}
