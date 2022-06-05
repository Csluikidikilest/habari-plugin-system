package org.qazima.habari.pluginsystem.interfaces;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.core.JsonParser;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public interface IConfiguration extends IReadOnlyConfiguration {
    boolean isDeleteAllowed();

    boolean isPostAllowed();

    boolean isPutAllowed();

    void LoadFromJsonParser(JsonParser parser, int defaultPageSize, boolean isGetAllowed, boolean isDeleteAllowed, boolean isPostAllowed, boolean isPutAllowed);
}
