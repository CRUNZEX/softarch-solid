import java.util.List;

public class RunBookReader {
    public static void main(String[] args) {
        BookViewer book = new BookViewer("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book.printToScreen();
    }
}
