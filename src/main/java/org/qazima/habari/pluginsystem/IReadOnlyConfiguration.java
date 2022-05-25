package org.qazima.habari.pluginsystem;

public interface IReadOnlyConfiguration {
    boolean getAllowGet();
    String getMetadataUri();
    String getType();
    String getRestUri();
    void LoadFromJtoken(int defaultPageSize, boolean allowGet);
}
