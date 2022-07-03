package org.qazima.habari.pluginsystem.extension;

import com.fasterxml.jackson.databind.JsonNode;

import java.util.Collections;
import java.util.Iterator;

public class NodeExtension {
    public static Iterator<JsonNode> getElements(JsonNode node, String fieldName) {
        Iterator<JsonNode> result = Collections.emptyIterator();
        if(node.get(fieldName) != null) {
            result = node.get(fieldName).elements();
        }
        return result;
    }

    public static boolean get(JsonNode node, String fieldName, boolean defaultValue) {
        boolean result = defaultValue;
        if(node.get(fieldName) != null) {
            result = node.get(fieldName).asBoolean(defaultValue);
        }
        return result;
    }

    public static int get(JsonNode node, String fieldName, int defaultValue) {
        int result = defaultValue;
        if(node.get(fieldName) != null) {
            result = node.get(fieldName).asInt(defaultValue);
        }
        return result;
    }

    public static String get(JsonNode node, String fieldName, String defaultValue) {
        String result = defaultValue;
        if(node.get(fieldName) != null) {
            result = node.get(fieldName).asText(defaultValue);
        }
        return result;
    }
}
