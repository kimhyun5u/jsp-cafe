package repository;

import camp.woowa.jspcafe.models.Question;
import camp.woowa.jspcafe.repository.InMemQuestionRepository;
import camp.woowa.jspcafe.repository.QuestionRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuestionRepositoryTest {
    QuestionRepository questionRepository;
    @BeforeEach
    void setUp() {
        questionRepository = new InMemQuestionRepository();
    }
    @Test
    void TestSave() {
        // given
        String title = "title";
        String content = "content";
        String writer = "1234";
        Long expectedId = 1L;

        // when
        Long id = questionRepository.save(title, content, writer);

        // then
        assertEquals(expectedId, id);
    }

    @Test
    void findAll() {
        // given
        String title = "title";
        String content = "content";
        String writer = "1234";
        questionRepository.save(title, content, writer);

        int expectedSize = 1;

        // when
        List<Question> questions = questionRepository.findAll();

        // then
        assertEquals(expectedSize, questions.size());
    }
}
