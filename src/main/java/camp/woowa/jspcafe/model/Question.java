package camp.woowa.jspcafe.model;

public class Question {
    private final Long id;
    private final String title;
    private final String content;
    private final String writer;
    private final Long writerId;

    public Question(Long id, String title, String content, String writer, Long writerId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.writerId = writerId;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public Long getWriterId() {
        return writerId;
    }
}