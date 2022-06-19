package org.qazima.habari.pluginsystem.interfaces;

import com.fasterxml.jackson.databind.JsonNode;

public interface IReadOnlyConfiguration {
    int getDefaultPageSize();
    boolean isGetAllowed();
    String getMetadataUri();
    String getType();
    String getRestUri();

    void LoadFromJson(JsonNode node, int defaultPageSize, boolean isGetAllowed);
}
