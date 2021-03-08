package com.codecool;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class FindTheFirstUnrepeatedCharTest {

    private FindTheFirstUnrepeatedChar findTheFirstUnrepeatedChar = new FindTheFirstUnrepeatedChar();

    @Test
    public void returnA(){
        assertEquals(java.util.Optional.of('a').get(), findTheFirstUnrepeatedChar.solution("abc"));
    }

    @Test
    public void returnA2(){
        assertEquals(java.util.Optional.of('a').get(), findTheFirstUnrepeatedChar.solution("abbcc"));
    }

    @Test
    public void returnF(){
        assertEquals(java.util.Optional.of('f').get(), findTheFirstUnrepeatedChar.solution("aabbccddeef"));
    }

    @Test
    public void returnR(){
        assertEquals(java.util.Optional.of('r').get(), findTheFirstUnrepeatedChar.solution("krokodil"));
    }

}