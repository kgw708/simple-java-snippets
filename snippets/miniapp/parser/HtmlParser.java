package snippets.miniapp.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlParser {
    
    private static Pattern htmlTagPattern = 
        Pattern.compile("(<([^ >]+)([^>]*)>)([^<]*)");
    private Matcher matcher;
    private String tagStr;
    private String tagName;
    private String tagAttribute;
    private String tagText;

    public HtmlParser(String src) {
        matcher = htmlTagPattern.matcher(src);
    }

    public boolean hasNext() {
        boolean found = matcher.find();
        if (found) {
            tagStr = matcher.group(1);
            tagName = matcher.group(2);
            tagAttribute = matcher.group(3);
            tagText = matcher.group(4);
        }
        return found;
    }

    public String next() {
        StringBuilder sb = new StringBuilder();
        sb.append("string = " + tagStr + ", ");
        sb.append("tag = " + tagName);
        if (tagAttribute != "") {
            sb.append(", attribute = " + tagAttribute);
        }
        if (tagText != "") {
            sb.append(", text = " + tagText);
        }
        return sb.toString();
    }
}
