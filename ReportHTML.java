package AbstractFactory;

public class ReportHTML extends Report {

    public ReportHTML(String title, String content, String autor) {
        super(title, content, autor);
    }

    @Override
    public void createReport() {
        System.out.println("Reporte titulado: " + title + " con contenido: " + content + " creado por: " + autor);
    }

}
