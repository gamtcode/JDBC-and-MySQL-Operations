package db;

import java.io.Serial;

/**
 * Custom unchecked exception for database integrity errors.
 */
public class DbIntegrityException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DbIntegrityException with the specified detail message.
     * @param msg the detail message
     */
    public DbIntegrityException(String msg) {
        super(msg);
    }
}
