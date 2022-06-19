package org.qazima.habari.pluginsystem.extension;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NodeExtensionTest {

    @Test
    @DisplayName("Get elements of a JsonNODE from a field name")
    void getElements() {
        String json = "{\"array\": [{\"value\": 0}, {\"value\": 1}, {\"value\": 2}]}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode node = mapper.readTree(json);
            Iterator<JsonNode> iterator = NodeExtension.getElements(node,"array");
            List<JsonNode> actualList = new ArrayList<>();
            while (iterator.hasNext()) {
                actualList.add(iterator.next());
            }
        assertAll(
                () -> assertEquals(3, actualList.size()),
                () -> assertEquals(0, actualList.get(0).get("value").asInt(-1)),
                () -> assertEquals(1, actualList.get(1).get("value").asInt(-1)),
                () -> assertEquals(2, actualList.get(2).get("value").asInt(-1))
        );
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @DisplayName("Get value of a JsonNODE from a field name")
    void get() {
        String json = "{\"boolean\": true, \"int\": 0, \"string\": \"string\"}";
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode node = mapper.readTree(json);
            assertAll(
                    () -> assertEquals(true, NodeExtension.get(node, "boolean", false)),
                    () -> assertEquals(0, NodeExtension.get(node, "int", -1)),
                    () -> assertEquals("string", NodeExtension.get(node, "string", ""))
            );
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}