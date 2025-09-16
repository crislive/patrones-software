package AbstractFactory;

public abstract class Report {

    protected String title;
    protected String content;
    protected String autor;

    public Report(String title, String content, String autor) {
        this.title = title;
        this.content = content;
        this.autor = autor;
    }

    public abstract void createReport();

}
