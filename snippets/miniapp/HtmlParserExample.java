package snippets.miniapp;

public class HtmlParserExample {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>demo page</title>");
        sb.append("<meta name=\"Description\" content=\"デモページです\">");
        sb.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"../../css/style.css\">");
        sb.append("<link rel=\"shortcut icon\" href=\"favicon.ico\" type=\"image/x-icon\">");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Hello world!</h1>");
        sb.append("<p>This is demo page.</p>");
        sb.append("</body>");
        sb.append("</html>");

        HtmlParser parser = new HtmlParser(sb.toString());
        while (parser.hasNext()) {
            System.out.println(parser.next());
        }
    }
}
