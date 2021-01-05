package ex1;

import org.junit.*;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ProductRatingTest {

    private ProductRating rating;

    @BeforeClass
    public static void beforeClass() {
        System.err.println("@BeforeClass");
    }

    @Before
    public void before() {
        rating = new ProductRating(1);
        System.err.println("@Before");
    }

    @Test
    public void create() {
        Assert.assertEquals(0, rating.getScore());
        System.err.println("@Test");
    }

    @Test
    public void setScore() {
        rating.setScore(2);
        Assert.assertEquals(2, rating.getScore());
        System.err.println("@Test");

    }

    @Test
    public void setScoreFive() {
        rating.setScore(5);
        Assert.assertEquals(5, rating.getScore());
        System.err.println("@Test");
    }

    @Test(expected = IllegalArgumentException.class)
    public void exceptionTest() {
        //code which will throw the unchecked expected exception
        System.err.println("@Test");
        throw new IllegalArgumentException();
    }

    @Test(expected = IOException.class)
    public void checkedExceptionTest() throws Exception {
        //code which will throw the checked expected exception
        System.err.println("@Test");
        throw new IOException();

    }

    @Test(expected = IllegalArgumentException.class)
    public void setScoreLessThanZero() {
        System.err.println("@Test");
        rating.setScore(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setScoreMoreThanFive() {
        System.err.println("@Test");
        rating.setScore(6);
    }


    @Test
    @Ignore
    public void setScoreZero() {
        rating.setScore(0);
        Assert.assertEquals(0, rating.getScore());
        Assert.assertTrue("true", true);
        System.err.println("@Test");
    }

    @After
    public void after() {
        System.err.println("@After");
    }

    @AfterClass
    public static void afterClass() {
        System.err.println("@AfterClass");
    }
}
