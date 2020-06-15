package by.is.lesson.yaml;

import java.util.Map;

import static by.is.lesson.yaml.PassUtils.decrypto;

public class JiraConfiguration {
    public static final String OAUTH_TOKEN = "oauthToken";
    public static final String USER = "login";
    public static final String URL = "url";
    public static final String ACCOUNT = "customerAccount";
    public static final String ACCOUNT_ID = "idCustomerAccount";
    public static final String TYPE = "type";
    public static final String INDIVIDUAL = "individual";
    public static final String TRANSITIONS = "transitions";
    private final String name;
    private final String url;
    private final String oauthToken;
    private final String login;

    public JiraConfiguration(String name, Map<String, Object> data) {
        this.name = name;
        this.login = String.valueOf(data.get(USER));
        this.url = String.valueOf(data.get(URL));
//        this.oauthToken = String.valueOf(data.get(OAUTH_TOKEN));
        this.oauthToken = TokenUtils.get(String.valueOf(data.get(USER)), decrypto(String.valueOf(data.get(OAUTH_TOKEN))));
    }

    public static String getOauthToken() {
        return OAUTH_TOKEN;
    }

    public String getToken() {
        return oauthToken;
    }

    public String getLogin() {
        return login;
    }


    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "JiraConfiguration{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", oauthToken='" + oauthToken + '\'' +
                ", login='" + login + '\'' +
                '}';
    }
}
