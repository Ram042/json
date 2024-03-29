package com.github.ram042.json;

import com.github.ram042.json.exceptions.JsonCastException;

public final class JsonBoolean extends Json {

    public static final JsonBoolean TRUE = new JsonBoolean(true);
    public static final JsonBoolean FALSE = new JsonBoolean(false);
    public final boolean value;

    public JsonBoolean(boolean value) {
        this.value = value;
    }

    @Override
    public JsonType getType() {
        return JsonType.BOOLEAN;
    }

    @Override
    public JsonBoolean getAsBoolean() throws JsonCastException {
        return this;
    }

    @Override
    public String toString() {
        if (value) {
            return "true";
        } else {
            return "false";
        }
    }

    @Override
    public JsonBoolean clone() {
        return this;
    }

    @Override
    public int hashCode() {
        return Boolean.hashCode(value);
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof JsonBoolean) && (value == ((JsonBoolean) obj).value);
    }
}
