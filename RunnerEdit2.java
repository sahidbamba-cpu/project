import javax.swing.JOptionPane;

public class RunnerEdit {
    public static void main(String[] args) {
        String input;
        int questions = 0;
        int missed = 0;

        // Get number of questions (handle invalid input + zero)
        while (true) {
            try {
                input = JOptionPane.showInputDialog("How many questions are on the exam?");
                questions = Integer.parseInt(input);

                if (questions <= 0) {
                    JOptionPane.showMessageDialog(null, "Questions must be greater than 0.");
                    continue;
                }

                break; // valid input
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            }
        }

        // Get number missed (handle invalid input)
        while (true) {
            try {
                input = JOptionPane.showInputDialog("How many questions did the student miss?");
                missed = Integer.parseInt(input);

                if (missed < 0 || missed > questions) {
                    JOptionPane.showMessageDialog(null, "Missed must be between 0 and total questions.");
                    continue;
                }

                break; // valid input
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            }
        }

        try {
            Exam exam = new Exam(questions, missed);

            String message = "Each question counts " + exam.getPointsEach();
            message += " points.\nThe exam score is " + exam.getScore();
            message += "\nThe exam grade is " + exam.getGrade();

            JOptionPane.showMessageDialog(null, message);

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Error: Cannot divide by zero.");
        }

        System.exit(0);
        //end
    }
}