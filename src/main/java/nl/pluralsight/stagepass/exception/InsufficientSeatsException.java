package nl.pluralsight.stagepass.exception;

public class InsufficientSeatsException extends RuntimeException {
    public InsufficientSeatsException(int available, int requested) {
        super("Not enough seats available. Requested: " + requested + ", Available: " + available);
    }
}