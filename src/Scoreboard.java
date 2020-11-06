public class Scoreboard {
    private LinkedList correctGuesses;
    private LinkedList incorrectGuesses;
    private LinkedList partialSolution;

    public Scoreboard() {
        correctGuesses = new LinkedList();
        incorrectGuesses = new LinkedList();
        partialSolution = new LinkedList();
    }
    public Scoreboard(String initialGuesses, String initialSolution) {
        LinkedList.Node temp = correctGuesses.new Node(initialGuesses.charAt(0));
        for (int i = 0; i < initialGuesses.length(); i++) {
            temp = correctGuesses.new Node(initialGuesses.charAt(i));
            correctGuesses.enqueue(temp);
        }
        for (int i = 0; i < initialSolution.length(); i++) {
            temp = partialSolution.new Node(initialSolution.charAt(i));
            partialSolution.enqueue(temp);
        }
    }

    public LinkedList getCorrectGuesses() {
        return correctGuesses;
    }

    public LinkedList getIncorrectGuesses() {
        return incorrectGuesses;
    }

    public LinkedList getPartialSolution() {
        return partialSolution;
    }

    public void setCorrectGuesses(LinkedList guesses) {
        correctGuesses = guesses;
    }
    public void setIncorrectGuesses(LinkedList guesses) {
        incorrectGuesses = guesses;
    }
    public void setPartialSolution(LinkedList psol) {
        partialSolution = psol;
    }

    public void display() {
        System.out.println("Correct guesses: " + correctGuesses + " Incorrect Guesses: " + incorrectGuesses + " Solution so far: " + partialSolution);
    }


}

