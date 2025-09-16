package AbstractFactory;

public class WebReportFactory implements ReportFactory {
    
    @Override
    public Report createReport(String title, String content, String autor) {
        return new ReportHTML(title, content, autor);
    }
}
