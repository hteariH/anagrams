package com.mamoru.anagrams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * user: alekseyb
 * date: 05.07.18
 */
public class Tests {

    @Test
    public void anagramTest() throws Exception {
        Main main = new Main();
        assertThat(main.isAnagram("asdf", "asdf"),is(Collections.emptyList()));
        assertThat(main.isAnagram("asdf", "azdf"),is(Collections.singletonList('s')));
        assertThat(main.isAnagram("asdf", "azda"),is(Arrays.asList('s','f')));
        try {
            main.isAnagram("asdf", "asdfg");
        } catch (Exception e){
            assertEquals(e.getMessage(),"Strings must be same length");
        }

    }
}
