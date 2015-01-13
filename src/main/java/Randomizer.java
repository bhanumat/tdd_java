import java.util.Random;

public class Randomizer {
    public static final int MAX_PATTERN = 2;
    public static final int MAX_OPERATOR = 3;
    public static final int MAX_OPERAND = 9;
    private Random random;

    public Randomizer() {
        random = new Random();
    }

    public void setRandom(Random rm) {
        this.random = rm;
    }

    public int getPattern() {
        return random.nextInt(MAX_PATTERN)+1;
    }

    public int getOperator() {
        return random.nextInt(MAX_OPERATOR)+1;
    }

    public int getOperand() {
        return random.nextInt(MAX_OPERAND)+1;
    }
}
