package AbstractFactory;

public class NumericReportFactory implements ReportFactory {

    @Override
    public Report createReport(String title, String content, String autor) {
        return new ReportExcel(title, content, autor);
    }

}
