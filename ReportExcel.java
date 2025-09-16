package AbstractFactory;

public class ReportExcel extends Report {

    public ReportExcel(String title, String content, String autor) {
        super(title, content, autor);
    }

    @Override
    public void createReport() {
        System.out.println("Reporte titulado: " + title + " con contenido: " + content + " creado por: " + autor);
    }

}
