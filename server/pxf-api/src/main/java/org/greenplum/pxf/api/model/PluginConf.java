package org.greenplum.pxf.api.model;

import java.util.Map;

public interface PluginConf {

    Map<String, String> getPlugins(String key);
}