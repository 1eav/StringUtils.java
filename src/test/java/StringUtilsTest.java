import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {
    // Добавьте свои тестовые методы здесь
    @Test
    public void Reverse() {
        String result = "!dlrow ,olleH";
        String revers = StringUtils.reverse("Hello, world!");
        Assertions.assertEquals(result, revers);
    }

    @Test
    public void testIsPalindrome() {
        String str = "Bob bob";
        assertTrue(StringUtils.isPalindrome(str));
    }

    @Test
    public void testCountOccurrences() {
        String str = "abracadabra";
        char target = 'a';
        int res = 5;
        Assertions.assertEquals(res, StringUtils.countOccurrences(str, target));
    }

    @Test
    public void testRemoveDuplicates() {
        String str = "bubbles";
        String rem = "bules";
        Assertions.assertEquals(rem, StringUtils.removeDuplicates(str));
    }

    @Test
    public void testSplitByDelimiter() {
        String str = "driver";
        String del = "r";
        String[] res = {"d", "ive"};
        Assertions.assertEquals(Arrays.stream(res).toList(), Arrays.stream(StringUtils.splitByDelimiter(str, del)).toList());
    }

    @Test
    public void testIsAnagram() {
        String str1 = "lime";
        String str2 = "mile";
        Assertions.assertTrue(StringUtils.isAnagram(str1, str2));
    }
}