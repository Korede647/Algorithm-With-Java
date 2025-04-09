package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FindFrequencyTest {
    FindFrequency frequency = new FindFrequency();
   @Test
   public void KoredeShouldReturnKeyValuePair(){
       LinkedList <String> words = new LinkedList<>();
       words.add("K");
       words.add("O");
       words.add("R");
       words.add("E");
       words.add("D");
       words.add("E");
       assertEquals("{R=1, D=1, E=2, K=1, O=1}",frequency.Frequency(words));
   }

}