package by.is.lesson.yaml;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.representer.Represent;
import org.yaml.snakeyaml.representer.Representer;
import org.yaml.snakeyaml.nodes.Node;

public class MyRepresenter extends Representer {

    public MyRepresenter() {
        this.representers.put(QuotedString.class, new RepresentQuotedString());
    }

    private class RepresentQuotedString implements Represent {
        public Node representData(Object data) {
            QuotedString str = (QuotedString) data;
            return representScalar(
                    Tag.STR, str.getValue(), DumperOptions.ScalarStyle.DOUBLE_QUOTED);
        }
    }

    static class QuotedString {

        private String value;

        public QuotedString(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
