package camp.woowa.jspcafe.repository;

import camp.woowa.jspcafe.models.Question;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class InMemQuestionRepository implements QuestionRepository {
    private static final AtomicLong sequence_id = new AtomicLong(1L);
    private static final Map<Long, Question> questions = new ConcurrentHashMap<>();

    @Override
    public Long save(String title, String content, String writer) {
        Long id = sequence_id.getAndIncrement();
        questions.put(id, new Question(id, title, content, writer));
        return id;
    }
}