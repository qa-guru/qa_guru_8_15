package io.qaguru.owner.config;

import java.net.MalformedURLException;
import java.net.URL;

public class HugeWebDriverConfig {

    public URL getRemoteUrl() {
        //зачитываем
        String remoteUrl = System.getProperty("remoteUrl");
        //конвертируем
        try {
            return new URL(remoteUrl);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public int getPort() {
        //зачитываем
        String port = System.getProperty("port");
        //конвертируем
        return Integer.parseInt(port);
    }

    public Browser getBrowser() {
        //зачитываем
        String browserName = System.getProperty("browser");
        if (browserName == null) {
            // дефолтное значение
            return Browser.CHROME;
        } else  {
            //конвертируем
            return Browser.valueOf(browserName);
        }
    }

    public String getBaseUrl() {
        //зачитываем
        //конвертируем
        return System.getProperty("baseUrl");
    }

}
