package org.qazima.habari.pluginsystem;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.net.httpserver.HttpContext;
import org.apache.http.HttpStatus;

public interface IPlugin {
    IReadOnlyConfiguration getConfiguration();
    boolean Configure(JsonNode node, int defaultPageSize, boolean allowDelete, boolean allowGet, boolean allowPost, boolean allowPut);
    HttpStatus Process(HttpContext httpContext, StringBuilder contentType, StringBuilder content);
    HttpStatus ProcessMetadata(HttpContext httpContext, StringBuilder contentType, StringBuilder content);
}
