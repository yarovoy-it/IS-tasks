package by.is.lesson.yaml;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static by.is.lesson.yaml.Coder.encrypto;
import static by.is.lesson.yaml.TokenUtils.encoding;

public class YamlMain {

    private final static String URL = "url";
    private final static String LOGIN = "login";
    private final static String OAUTH_TOKEN = "oauthToken";


    public static void main(String[] args) throws Exception {
//        writeTest();
        String[] code = parseToken("Basic dml0YWxpaS5zZXJnZXk6dGVtcHJvODY=");
        System.out.println(code);
        List<JiraConfiguration> configurations = reader();
        System.out.println(configurations);
        write(configurations);
    }

    static List<JiraConfiguration> reader() {
        List<JiraConfiguration> configurations = new ArrayList<>();
        try (InputStream inputStream = new FileInputStream("src/main/resourses/jiras.yml")) {
            Yaml yaml = new Yaml();
            Map<String, Map<String, Object>> values = yaml.load(inputStream);
            values.forEach((name, data) -> configurations.add(new JiraConfiguration(name, data)));
            return configurations;
        } catch (IOException e) {
            throw new RuntimeException("Error parsing jira configurations", e);
        }
    }

    static String[] parseToken(String token) throws Exception {
        byte[] encodeToken = org.apache.commons.codec.binary.Base64.decodeBase64(token.split(" ")[1]);
        String[] pass = new String(encodeToken).split(":");
        return new String[]{pass[0], encrypto(pass[1])};

    }

    static void writeTest() throws IOException {

        FileWriter inputStream = new FileWriter("src/main/resourses/copeJiras.yml");
//        Map<String, Object> yamlMap = yaml.load(inputStream);
//        yamlMap.put("version", "v-1.0");
//        Map<String, Object> metadata = (Map<String, Object>) yamlMap.get("metadata");
//        metadata.put("name", "XYZ");

        Map<String, Object> groups = new HashMap<>();
//        groups.put("id", new QuotedString("5000Z"));
//        groups.put("category", new QuotedString("newCategory"));
        DumperOptions options = new DumperOptions();
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        options.setPrettyFlow(true);
        Yaml yaml = new Yaml(new MyRepresenter(), options);

//        Yaml yaml = new Yaml(options);
        yaml.dump(groups, inputStream);
//        System.out.println(output);
    }


    static void write(List<JiraConfiguration> all) throws Exception {
        DumperOptions options = new DumperOptions();
        options.setPrettyFlow(true);
        options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        Yaml yaml = new Yaml(new MyRepresenter(), options);
        FileWriter writer = new FileWriter("src/main/resourses/copeJiras.yml");
//        Map<String, Map<String, Object>> map = StreamSupport.stream(all.spliterator(), false)
//                .collect(Collectors.toMap(JiraConfiguration::getName,
//                        val -> Stream.of(val.getClass().getDeclaredFields())
//                                .filter(field -> {
//                                    field.setAccessible(true);
//                                    return Modifier.isPrivate(field.getModifiers());
//                                } )
//                                .collect(
//                                        Collectors.toMap(Field::getName, valField -> {
//                                            try {
//                                                return valField.get(val);
//                                            } catch (IllegalAccessException e) {
//                                                e.printStackTrace();
//                                            }
//                                            return null;
//                                        }))));

        for (JiraConfiguration temp : all) {
            Map<String, Map<String, Object>> map = new HashMap<>();
            Map<String, Object> innerMap = new HashMap<>();
            innerMap.put(URL, new MyRepresenter.QuotedString(temp.getUrl()));
            innerMap.put(LOGIN, new MyRepresenter.QuotedString(temp.getLogin()));
            String token = encrypto(temp.getToken());
            innerMap.put(OAUTH_TOKEN, new MyRepresenter.QuotedString(temp.getToken()));
            map.put(temp.getName(), innerMap);
            yaml.dump(map, writer);

        }


    }
}


