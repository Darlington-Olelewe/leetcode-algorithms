package dataStructures;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    static int maxArea1(int[] height) {

        int highest = Integer.MIN_VALUE;

        for(int i = 0; i < height.length; i++){

            int val = height[i];
            for(int j = (i+1); j < height.length; j++){
                int mean = Math.min(height[j],val);
                int factor = j - i;
                highest = Math.max((mean * factor), highest);
            }
        }
        return highest;
    }


    static int maxArea(int[] height) {

        int highest = Integer.MIN_VALUE;

        int min = 0; int max = height.length -1;
        while (min != max){
            int s =height[min];
            int x = height[max];

            int val = Math.min(s,x);
            int factor = max - min;
            highest = Math.max((val * factor), highest);

            if(s <= x){
                min++;
            }else{
                max--;
            }

        }


        return highest;
    }
}
