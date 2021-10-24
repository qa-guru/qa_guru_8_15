package io.qaguru.owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface SimpleWebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("remoteUrl")
    URL getRemoteUrl();

    @Key("port")
    int getPort();

}
