import java.util.List;

public class RunBookPublisher {
    public static void main(String[] args) {
        BookFilePublisher book = new BookFilePublisher("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToFile();
    }
}
