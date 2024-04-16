package tests;

import lombok.SneakyThrows;
import models.Settings;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import tests.utils.JsonHelper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
@Tag("UNIT")
public class PropertiedReaderTests {

    @Test
    @SneakyThrows
    @Tag("Smoke")
    public void simpleReaderTests(){
        Properties properties = new Properties();
        FileInputStream fs = new FileInputStream("src/test/resources/project.properties");
        properties.load(fs);

       String url = properties.getProperty("url");
       boolean isProduction = Boolean.parseBoolean(properties.getProperty("is_production"));
       int threads  = Integer.parseInt(properties.getProperty("threads"));

        System.out.println(url);
        System.out.println(isProduction);
        System.out.println(threads);
    }

    @Test
    @SneakyThrows
    public void jacksonReaderTest() {
        Properties properties = new Properties();
        FileInputStream fs = new FileInputStream("src/test/resources/project.properties");
        properties.load(fs);
        String json = JsonHelper.toJson((properties));
        System.out.println(json);
        Settings settings = JsonHelper.fromJsonString(json, Settings.class);
        System.out.println(settings.getThreads());
        System.out.println(settings.getIsProduction());
        System.out.println(settings.getUrl());

    }

}
