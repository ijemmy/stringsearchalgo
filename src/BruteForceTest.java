import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BruteForceTest {

    @Test
    public void testFoundinFirst() throws Exception {
        Assert.assertTrue("should return true if find string in the first position", BruteForce.search("abcdefg", "abc"));
        Assert.assertTrue("should return true if find string in the first position", BruteForce.search("abcdefg", "a"));
    }

    @Test
    public void testNotFound(){
        Assert.assertFalse("should return false if found string not found", BruteForce.search("def", "abc"));
    }

    @Test
    public void testEmptyHay(){
        Assert.assertFalse("should not throw exception if hay is empty", BruteForce.search("", "abc"));
    }

    @Test
    public void testEmptyNeedle(){
        Assert.assertTrue("should not throw exception if needle is empty", BruteForce.search("abc", ""));
        Assert.assertTrue("should not throw exception if needle is empty", BruteForce.search("", ""));
    }

    @Test
    public void testFoundinTheEnd() throws Exception {
        Assert.assertTrue("should return true if find string in the last possible position", BruteForce.search("abcdefg", "efg"));
    }

    @Test
    public void testFoundinTheMiddle() throws Exception {
        Assert.assertTrue("should return true if find string in the middle of hay", BruteForce.search("abc defg", "c d"));
    }


}