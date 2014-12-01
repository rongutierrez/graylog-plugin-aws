package com.graylog2.plugin;

import com.graylog2.input.AWSInput;
import com.graylog2.input.cloudtrail.CloudTrailCodec;
import com.graylog2.input.cloudtrail.CloudTrailTransport;
import org.graylog2.plugin.PluginModule;

public class AWSInputModule extends PluginModule {

    @Override
    protected void configure() {
        registerPlugin(AWSInputMetadata.class);
        installCodec(codecMapBinder(), CloudTrailCodec.NAME, CloudTrailCodec.class);
        installTransport(transportMapBinder(), "cloudtrail", CloudTrailTransport.class);
        installInput(inputsMapBinder(), AWSInput.class, AWSInput.Factory.class);
    }

}
