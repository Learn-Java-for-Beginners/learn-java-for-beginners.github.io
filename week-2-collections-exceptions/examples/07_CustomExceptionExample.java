class InvalidMarksException extends RuntimeException {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {

    public static void main(String[] args) {

        try {
            validateMarks(150);
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validateMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100");
        }
    }
}
