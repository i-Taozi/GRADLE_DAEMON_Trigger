package io.keen.client.java.result;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.List;
import java.util.Map;

/**
 * This abstract class represents the object returned by a Keen Query.
 * By default, all methods with boolean return values are set to return false,
 * and all getter methods are set to throw IllegalStateException.
 *
 * It is the responsibility of subclasses to return true and get the
 * appropriate object.
 *
 * @author claireyoung
 * @since 1.0.0, 07/06/15
 */
public abstract class QueryResult {
    /**
     * @return {@code false}
     */
    public boolean isDouble() {
        return false;
    }

    /**
     * @return {@code false}
     */
    public boolean isLong() {
        return false;
    }

    /**
     * @return {@code false}
     */
    public boolean isString() {
        return false;
    }

    /**
     * @return {@code false}
     */
    public boolean isListResult() {
        return false;
    }

    /**
     * @return {@code false}
     */
    public boolean isIntervalResult() {
        return false;
    }

    /**
     * @return {@code false}
     */
    public boolean isGroupResult() { return false; }

    /**
     * @return doubleValue, which is IllegalStateException in abstract class.
     */
    public double doubleValue() {
        throw new IllegalStateException();
    }

    /**
     * @return longValue, which is IllegalStateException in abstract class.
     */
    public long longValue() {
        throw new IllegalStateException();
    }

    /**
     * @return stringValue, which is IllegalStateException in abstract class.
     */
    public String stringValue() {
        throw new IllegalStateException();
    }

    /**
     * @return list results, which is IllegalStateException in abstract class.
     */
    public List<QueryResult> getListResults() {
        throw new IllegalStateException();
    }

    /**
     * @return map of AbsoluteTimeframe to QueryResult's, which is IllegalStateException in
     * abstract class.
     */
    public List<IntervalResultValue> getIntervalResults() { throw new IllegalStateException(); }

    /**
     * @return map of Group to QueryResult's, which is IllegalStateException in abstract class.
     */
    public Map<Group, QueryResult> getGroupResults() { throw new IllegalStateException(); }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }
}
