package org.qazima.habari.pluginsystem.interfaces;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.JsonNode;
import com.sun.net.httpserver.HttpContext;
import org.qazima.habari.pluginsystem.library.Content;

public interface IPlugin {
    IConfiguration getConfiguration();
    boolean Configure(JsonNode node, int defaultPageSize, boolean isGetAllowed, boolean isDeleteAllowed, boolean isPostAllowed, boolean isPutAllowed);
    int Process(HttpContext httpContext, Content content);
    int ProcessConfigure(HttpContext httpContext, Content content);
    int ProcessMetadata(HttpContext httpContext, Content content);
}
