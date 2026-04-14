public class Exam extends Assessment {

    private int numQuestions;
    private int pointsEach;
    private int numMissed;

    public Exam(int questions, int missed) {
        numQuestions = questions;
        numMissed = missed;

        pointsEach = 100 / numQuestions;
        int numericScore = 100 - (numMissed * pointsEach);

        setScore(numericScore);
    }

    public int getNumMissed() {
        return numMissed;
    }

    public int getPointsEach() {
        return pointsEach;
    }
}