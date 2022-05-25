package org.qazima.habari.pluginsystem;

public interface IConfiguration extends IReadOnlyConfiguration {
    boolean getAllowDelete();
    boolean getAllowPost();
    boolean getAllowPut();
    void LoadFromJtoken(int defaultPageSize, boolean allowDelete, boolean allowGet, boolean allowPost, boolean allowPut);
}
