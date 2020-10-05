public class Scoreboard {
    private String correctGuesses;
    private String incorrectGuesses;
    private String partialSolution;

    public Scoreboard() {
        correctGuesses = "";
        incorrectGuesses = "";
        partialSolution = "";
    }
    public Scoreboard(String initialGuesses, String initialSolution) {
        correctGuesses = initialGuesses;
        incorrectGuesses = "";
        partialSolution = initialSolution;
    }

    public String getCorrectGuesses() {
        return correctGuesses;
    }

    public String getIncorrectGuesses() {
        return incorrectGuesses;
    }

    public String getPartialSolution() {
        return partialSolution;
    }

    public void setCorrectGuesses(String guesses) {
        correctGuesses = guesses;
    }
    public void setIncorrectGuesses(String guesses) {
        incorrectGuesses = guesses;
    }
    public void setPartialSolution(String psol) {
        partialSolution = psol;
    }

    public void display() {
        System.out.println("Correct guesses: " + correctGuesses + " Incorrect Guesses: " + incorrectGuesses + " Solution so far: " + partialSolution);
    }


}

