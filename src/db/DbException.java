package db;

import java.io.Serial;

/**
 * Custom unchecked exception for database errors.
 */
public class DbException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new DbException with the specified detail message.
     * @param msg the detail message
     */
    public DbException(String msg) {
        super(msg);
    }
}
