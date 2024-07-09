import org.junit.jupiter.api.Test;

import java.sql.Struct;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class solutionTest {
    String word1 = "abc";
    String word2 = "pqr";
    @Test
    void mergeMatching(){
        String result = solution.mergeAlternately(word1,word2);
        assertEquals(result, "apbqcr");
    }
    @Test
    void mergeShortFirst(){
        String result = solution.mergeAlternately("ab","pqrs");
        assertEquals(result, "apbqrs");
    }

    @Test
    void mergeShortSecond(){
        String result = solution.mergeAlternately("abcd","pq");
        assertEquals(result, "apbqcd");
    }
}
