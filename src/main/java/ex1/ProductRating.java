package ex1;

import ex2.Note;

import java.io.Serializable;
import java.util.Arrays;

public final class ProductRating implements Serializable {

    private static final int MIN_SCORE = 0;
    private static final int MAX_SCORE = 5;
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(final int score) {
        if (score < MIN_SCORE || score > MAX_SCORE) {
            throw new IllegalArgumentException("Invalid score!");
        }
        this.score = score;
    }

    public ProductRating(int score) {
        this.score = score;
    }

    public static int getMinScore() {
        return MIN_SCORE;
    }

    public static int getMaxScore() {
        return MAX_SCORE;
    }

    public static void main(String[] args) {
        //ProductRating productRating = new ProductRating(123);

        //System.out.println(Arrays.toString(productRating.getClass().getInterfaces()));

    }
}
