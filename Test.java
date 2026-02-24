


import java.util.Scanner;
public class Test
{
    // Instance variables (fields)
    private double Ave;

    private int count;

    private int Score;


    //these are the constructor fields they Initialize all fields to 0 when an object is created
    public Test() {
        count = 0;
        Ave = 0.0;
        Score = 0;
    }

    //accessor and getter method for the double
    public double getAve(){
        return Ave;
    }

    // Accessor method for average Returns the calculated average
    public void getAverage() {
        Scanner scan = new Scanner(System.in);

        count = 0;
        Score = 0;

        while (true) {
            System.out.println("Enter test scores (-1 to quit): ");
            int scoreinput = scan.nextInt();   // prime the loopsetScore(scoreinput);   // add score using mutaton
            if (scoreinput == -1) {
                break;
            } else {
                setScore(scoreinput);
                count++;
            }
        }
        Ave = (double) Score / count;
    }

    // Accessor method for count returns number of scores entered
    public int getCount() {
        return count;
        }

    // Accessor method for total score and returns total of all scores entered
   public int getScore() {
            return Score;
        }

    // Mutator method adds a new score to the running total
   public void setScore(int newScore) {
            Score += newScore;   // add to total
        }

    //toString method Returns formatted result as a String
    public String toString() {
        return "Result: " + Ave + "\n" +
                "The average of the " + count +
                " scores entered is " + Ave + ".";
        }
    }

