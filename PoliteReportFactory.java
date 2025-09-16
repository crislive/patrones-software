package AbstractFactory;

public class PoliteReportFactory implements ReportFactory {

    @Override
    public Report createReport(String title, String content, String autor) {
        return new ReportPDF(title, content, autor);
    }

}
