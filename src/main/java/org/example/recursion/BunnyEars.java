package org.example.recursion;

public class BunnyEars {
    public static int bunny(int bunnies){
        if(bunnies < 0){
            return bunnies;
        } else if (bunnies % 2 == 1) {
            return 2 + bunny(bunnies - 1);
        }
        return 3 + bunny(bunnies - 1);
    }
}
