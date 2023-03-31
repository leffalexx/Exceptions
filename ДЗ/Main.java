import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ФИО, дату рождения, телефон и пол через пробел: ");
        String input = scanner.nextLine();
        String[] data;
    
        try {
            data = input.split(" ");
            if (data.length != 6) {
                throw new IllegalArgumentException("Введены не все данные.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
            return;
        }

        String surname = data[0];
        String name = data[1];
        String patronymic = data[2];
        String birthDateString = data[3];
        String phoneString = data[4];
        String genderString = data[5];

        LocalDate birthDate;
        try {
            birthDate = LocalDate.parse(birthDateString, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (Exception e) {
            System.out.println("Ошибка: неверный формат даты рождения.");
            return;
        }

        long phone;
        try {
            phone = Long.parseLong(phoneString);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: неверный формат номера телефона.");
            return;
        }

        try {
            char gender = genderString.charAt(0);
            if (gender != 'f' && gender != 'm') {
                throw new InvalidInputException("Ошибка: пол должен быть задан символом f или m.");
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Ошибка: пол должен быть задан одним символом (f или m).");
            return;
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            return;
        }

        String filename = surname + ".txt";
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(surname + " " + name + " " + patronymic + " ");
            writer.write(birthDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + " ");
            writer.write(phoneString + " " + genderString + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}