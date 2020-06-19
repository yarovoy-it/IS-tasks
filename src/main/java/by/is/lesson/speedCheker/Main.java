package by.is.lesson.speedCheker;

import by.is.lesson.yaml.JiraConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Main {

    List<JiraConfiguration> jiraConfigurations = new ArrayList<>();

    public static void main(String[] args) {

        long startTime = System.nanoTime();
//        methodToTime();
        long endTime = System.nanoTime();

        long duration = endTime - startTime;
        System.out.println();
    }


}
