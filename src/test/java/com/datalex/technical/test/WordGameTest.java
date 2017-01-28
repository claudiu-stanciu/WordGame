package com.datalex.technical.test;

import com.datalex.technical.WordGame;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class WordGameTest {

    private WordGame wordGame;

    @Before
    public void init() {
        wordGame = new WordGame();
    }

    @Test
    public void testValidWord() {
        String initial = "A";
        String target = "BABA";
        Assert.assertTrue(wordGame.validate(initial, target));
    }

    @Test
    public void testInvalidWord() {
        String initial = "A";
        String target = "ABBA";
        Assert.assertFalse(wordGame.validate(initial, target));
    }
}