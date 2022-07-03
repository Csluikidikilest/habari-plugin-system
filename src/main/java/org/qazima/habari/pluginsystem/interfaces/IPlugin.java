package org.qazima.habari.pluginsystem.interfaces;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.net.httpserver.HttpExchange;
import org.qazima.habari.pluginsystem.library.Content;

public interface IPlugin {
    IReadOnlyConfiguration getConfiguration();
    boolean configure(JsonNode node, int defaultPageSize, boolean isGetAllowed, boolean isDeleteAllowed, boolean isPostAllowed, boolean isPutAllowed);
    int process(HttpExchange exchange, Content content);
    int processConfigure(HttpExchange exchange, Content content);
    int processMetadata(HttpExchange exchange, Content content);
}
