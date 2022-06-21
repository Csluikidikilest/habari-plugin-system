package org.qazima.habari.pluginsystem.interfaces;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.JsonNode;

public interface IConfiguration extends IReadOnlyConfiguration {
    boolean isDeleteAllowed();

    boolean isPostAllowed();

    boolean isPutAllowed();

    void LoadFromJson(JsonNode node, int defaultPageSize, boolean isGetAllowed, boolean isDeleteAllowed, boolean isPostAllowed, boolean isPutAllowed);
}
