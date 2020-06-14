package by.is.lesson.yaml;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YamlMain {

    private final static String URL = "url";
    private final static String LOGIN = "login";
    private final static String OAUTH_TOKEN = "oauthToken";


    public static void main(String[] args) throws IOException {
        List<JiraConfiguration> configurations = reader();
        System.out.println(configurations);
        write(configurations);
    }

    static List<JiraConfiguration> reader() {
        List<JiraConfiguration> configurations = new ArrayList<>();
        try (InputStream inputStream = new FileInputStream("D:\\javaWorkSpace\\is-lesson\\src\\main\\resourses\\jiras.yml")) {
            Yaml yaml = new Yaml();
            Map<String, Map<String, Object>> values = yaml.load(inputStream);
            values.forEach((name, data) -> configurations.add(new JiraConfiguration(name, data)));
            return configurations;
        } catch (IOException e) {
            throw new RuntimeException("Error parsing jira configurations", e);
        }
    }

    static void write(List<JiraConfiguration> all) throws IOException {
        DumperOptions options = new DumperOptions();
        options.setPrettyFlow(true);
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        Yaml yaml = new Yaml(options);
        FileWriter writer = new FileWriter("D:\\javaWorkSpace\\is-lesson\\src\\main\\resourses\\copeJiras.yml");
        for (JiraConfiguration temp : all) {
            Map<String, Map<String, Object>> map = new HashMap<>();
            Map<String, Object> innerMap = new HashMap<>();
            innerMap.put(URL, temp.getUrl());
            innerMap.put(LOGIN, temp.getLogin());
            innerMap.put(OAUTH_TOKEN, temp.getToken());
            map.put(temp.getName(), innerMap);
            yaml.dump(map, writer);
        }
    }

}
