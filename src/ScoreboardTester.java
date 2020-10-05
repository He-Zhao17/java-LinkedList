public class ScoreboardTester {
    public static void main(String args[]) {
        Scoreboard s1 = new Scoreboard();
        s1.display();
        Scoreboard s2 = new Scoreboard("ABC", "*A*B*C");
        s2.display();

        Player p1 = new Player();
        p1.display();
        Player p2 = new Player("Chris");
        p2.display();
        Player p3 = new Player("Chris", 3, 1);
        p3.display();
        p3=p2;
        System.out.println("Assigning");
        p3.setName("Joe");
        p3.display();
        p2.display();
        System.out.println("Copying");
        p2 = new Player("Chris");
        p3=p2.copy();
        p3.setName("Joe");
        p3.display();
        p2.display();
    }
}
