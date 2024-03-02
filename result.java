// 231RDB282 Mārtiņš Rihards Zuments 2
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input file name:");
        String fileName = sc.nextLine();
        sc.close();

        // Read the file
        try {
            FileReader fileReader = new FileReader(fileName);
            Scanner fileScanner = new Scanner(fileReader);

            System.out.println("result:");

            // Read each line of the file
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(" "); // Assuming data is separated by space

                // Extract student information
                String name = parts[0];
                String surname = parts[1];
                double averageGrade = calculateAverageGrade(parts);

                // Check if average grade is less than or equal to 5
                if (averageGrade <= 5) {
                    int below4Count = countGradesBelow4(parts);
                    System.out.println(name + " " + surname + " " + below4Count);
                }
            }

            fileScanner.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    // Method to calculate average grade
    private static double calculateAverageGrade(String[] parts) {
        double sum = 0;
        for (int i = 2; i < parts.length; i++) {
            sum += Integer.parseInt(parts[i]);
        }
        return sum / (parts.length - 2);
    }

    // Method to count grades below 4
    private static int countGradesBelow4(String[] parts) {
        int count = 0;
        for (int i = 2; i < parts.length; i++) {
            int grade = Integer.parseInt(parts[i]);
            if (grade < 4) {
                count++;
            }
        }
        return count;
    }
}
