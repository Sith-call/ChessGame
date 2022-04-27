package prototype;

import java.util.HashMap;

public interface Operation {
    // Operation(Setter)
    public abstract boolean move(int x, int y);

    // Validation
    /**
     * Check if position entered is valid.
     * **/
    abstract boolean validation(int x, int y);
}
