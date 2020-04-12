package app;

import app.Stacks;

public class App {
    
    public static void main(String[] args) throws Exception {
        int nums[] = {40, 50, 20, 70, 50, 90, 10, 60};
        Stacks stacks = new Stacks(100);
        for(int num: nums){
            stacks.push(num);
        }
        for(int i = 0; i<=nums.length; i++) {
            System.out.println("========");
            System.out.println(stacks.min());
            System.out.println(stacks.pop());
        }
        
    }
}