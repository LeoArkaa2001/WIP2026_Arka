package AprilBatch_day3;
class Voter {
    private String name;
    private boolean hasVoted;

    public void setName(String name) {
        this.name = name;
    }

    public void vote() {
        if (!hasVoted) {
            hasVoted = true;
            System.out.println(name + " voted successfully.");
        } else {
            System.out.println("Vote done");
        }
    }
}

public class encapsulateVoter {
    public static void main(String[] args) {
        Voter v = new Voter();

        v.setName("Arka");

        v.vote();  
        v.vote();  
    }
}
