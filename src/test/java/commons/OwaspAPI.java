package commons;

public class OwaspAPI {
    public static final String SCAN_PROPERTY="scan";
    public static final String STATUS_PERCENTAGE="status";
    public static String owaspHost="http://localhost:8080";
    public static final String START_SCAN_OWASP="/JSON/ascan/action/scan/?url=%s";
    public static final String GET_STATUS_SCAN="/JSON/ascan/view/status/?scanId=%s";
    public static final String GET_SCAN_PROGRESS="/HTML/ascan/view/scanProgress/?scanId=%s";
    public static final String GENERATE_REPORT_HTML="/OTHER/core/other/htmlreport/?";
    public static final String GET_ALERTS="/JSON/alert/view/alerts/?baseurl=%s";
}