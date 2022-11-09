package hexlet.code.games;

public interface Game {
    String getTask();
    String[] getData() throws RuntimeException;
}
