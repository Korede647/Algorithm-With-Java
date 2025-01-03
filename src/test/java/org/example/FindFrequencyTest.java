package org.example;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FindFrequencyTest {
    FindFrequency frequency = new FindFrequency();
   @Test
   public void KoredeShouldReturnKeyValuePair(){
       assertEquals("{K: 1, O: 1, R: 1, E: 2, D: 1}",frequency.Frequency());
   }

}