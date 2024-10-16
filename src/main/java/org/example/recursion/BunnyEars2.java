package org.example.recursion;

public class BunnyEars2 {
    public static int bunny2 (int bunnies){
        if(bunnies <= 0){
            return bunnies;
        }
        else if(bunnies % 2 == 1){
            return 2 + bunny2(bunnies - 1);
        }
        return 3 + bunny2(bunnies - 1);
    }
}
