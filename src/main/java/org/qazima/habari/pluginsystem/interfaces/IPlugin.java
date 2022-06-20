package org.qazima.habari.pluginsystem.interfaces;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.JsonNode;
import com.sun.net.httpserver.HttpContext;
import org.qazima.habari.pluginsystem.library.ContentManager;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public interface IPlugin {
    IConfiguration getConfiguration();
    boolean Configure(JsonNode node, int defaultPageSize, boolean isGetAllowed, boolean isDeleteAllowed, boolean isPostAllowed, boolean isPutAllowed);
    int Process(HttpContext httpContext, ContentManager contentManager);
    int ProcessConfigure(HttpContext httpContext, ContentManager contentManager);
    int ProcessMetadata(HttpContext httpContext, ContentManager contentManager);
}
