import java.io.*;
import java.text.DecimalFormat;

public class opener{
    public static void main(String[] args) throws IOException {

        String inputFile = "pay.csv";
        String outputFile = "output.csv";

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

        DecimalFormat df = new DecimalFormat("$0.00");

        String line;

        reader.readLine();
        // Optional: write header
        writer.write("Name,Pay Rate,Hours Worked,Weekly Pay");
        writer.newLine();

        while ((line = reader.readLine()) != null) {

            String[] data = line.split(",");

            String name = data[0];
            double payRate = Double.parseDouble(data[1]);
            double hours = Double.parseDouble(data[2]);

            double weeklyPay;

            if (hours > 40) {
                weeklyPay = (40 * payRate) + ((hours - 40) * payRate * 1.5);
            } else {
                weeklyPay = hours * payRate;
            }

            // Format pay as String
            String formattedPay = df.format(weeklyPay);

            // Build output line (IMPORTANT: everything must be String)
            String outputLine = name + "," + payRate + "," + hours + "," + formattedPay;

            writer.write(outputLine);
            writer.newLine();
        }

        reader.close();
        writer.close();

        System.out.println("File processed successfully.");
    }
}
