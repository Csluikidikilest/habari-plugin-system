package org.qazima.habari.pluginsystem.interfaces;

import com.fasterxml.jackson.core.JsonParser;

public interface IReadOnlyConfiguration {
    int defaultPageSize();
    boolean isGetAllowed();
    String metadataUri();
    String type();
    String restUri();

    void LoadFromJsonParser(JsonParser parser, int defaultPageSize, boolean isGetAllowed);
}
