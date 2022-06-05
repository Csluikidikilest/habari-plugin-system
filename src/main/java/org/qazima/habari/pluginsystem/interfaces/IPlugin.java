package org.qazima.habari.pluginsystem.interfaces;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonParser;
import com.sun.net.httpserver.HttpContext;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public interface IPlugin {
    IConfiguration configuration();
    boolean Configure(JsonParser parser, int defaultPageSize, boolean isGetAllowed, boolean isDeleteAllowed, boolean isPostAllowed, boolean isPutAllowed);
    int Process(HttpContext httpContext, StringBuilder contentType, StringBuilder content);
    int ProcessMetadata(HttpContext httpContext, StringBuilder contentType, StringBuilder content);
}
