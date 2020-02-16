package moe.orangelabs.json.types;

import moe.orangelabs.json.Json;
import moe.orangelabs.json.JsonCastException;
import moe.orangelabs.json.JsonType;

import java.math.BigDecimal;

import static java.util.Objects.requireNonNull;

public final class JsonNumber implements Comparable<JsonNumber>, Json {

    public final BigDecimal value;

    public JsonNumber(double value) {
        this(BigDecimal.valueOf(value));
    }

    public JsonNumber(long value) {
        this(BigDecimal.valueOf(value));
    }

    public JsonNumber(BigDecimal value) {
        requireNonNull(value);
        this.value = value;
    }

    public JsonNumber(String value) {
        this.value = new BigDecimal(value);
    }

    @Override
    public JsonType getType() {
        return JsonType.NUMBER;
    }

    @Override
    public JsonNumber getAsNumber() throws JsonCastException {
        return this;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    @Override
    public JsonNumber clone() {
        return this;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof JsonNumber) && (value.equals(((JsonNumber) obj).value));
    }

    @Override
    public int compareTo(JsonNumber o) {
        return value.compareTo(requireNonNull(o).value);
    }

    public JsonNumber add(JsonNumber value) {
        requireNonNull(value);
        return new JsonNumber(this.value.add(value.value));
    }

    public JsonNumber substract(JsonNumber value) {
        requireNonNull(value);
        return new JsonNumber(this.value.subtract(value.value));
    }
}