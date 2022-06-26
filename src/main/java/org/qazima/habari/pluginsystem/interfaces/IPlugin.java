package org.qazima.habari.pluginsystem.interfaces;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.JsonNode;
import com.sun.net.httpserver.HttpContext;
import org.qazima.habari.pluginsystem.library.Content;

public interface IPlugin {
    IReadOnlyConfiguration getConfiguration();
    boolean configure(JsonNode node, int defaultPageSize, boolean isGetAllowed, boolean isDeleteAllowed, boolean isPostAllowed, boolean isPutAllowed);
    int process(HttpContext httpContext, Content content);
    int processConfigure(HttpContext httpContext, Content content);
    int processMetadata(HttpContext httpContext, Content content);
}
