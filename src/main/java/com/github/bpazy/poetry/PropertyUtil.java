package com.github.bpazy.poetry;

import com.google.common.io.Resources;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Ziyuan
 * on 2018/3/10
 */
public class PropertyUtil {
    private static Properties properties = new Properties();

    static {
        try {
            properties.load(new FileReader(Resources.getResource("rules.properties").getFile()));
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public static String getValue(String key) {
        return properties.getProperty(key);
    }
}
