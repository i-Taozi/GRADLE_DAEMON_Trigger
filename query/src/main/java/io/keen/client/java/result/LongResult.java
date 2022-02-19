package io.keen.client.java.result;

/**
 * LongResult is for if the QueryResult object is of type Long.
 *
 * @author claireyoung
 * @since 1.0.0, 07/06/15
 */
public class LongResult extends QueryResult {
    private final long result;

    /**
     * @param result the result.
     */
    public LongResult(long result) {
        this.result = result;
    }

    /**
     * @return  {@code true}
     */
    @Override
    public boolean isLong() {
        return true;
    }

    /**
     * @return long value
     */
    @Override
    public long longValue() {
        return result;
    }
}
