public class Solution {
    public static boolean canPlaceFlower(int[] flowerbed, int n){
        int prev = 0;
        int cur = 1;
        int next = 2;
        if(n== 0){
            return true;
        }
        if(flowerbed.length <= 2){
            if (flowerbed[0] == 1){
                return false;
            }else if(n == flowerbed.length){
                return true;
            }else{
                return false;
            }
        }
        //Catch the starting case when [0,0,1]
        if(flowerbed[prev] == 0 && flowerbed[cur] == 0){
            flowerbed[prev] = 1;
            n = n - 1;
            prev = cur;
            cur = next;
            next = next + 1;
        }

        while(n > 0 && next < flowerbed.length){
            if (flowerbed[prev] == 0 && flowerbed[cur] == 0 && flowerbed[next] == 0) {
                flowerbed[cur] = 1;
                n = n - 1;
            }
            prev = cur;
            cur = next;
            next = next + 1;
        }

        if (n>0 && flowerbed[prev] == 0 && flowerbed[cur] == 0){
            flowerbed[cur] = 1;
            n = n-1;
        }
        return n == 0;
    }

    public static void main(String[] args) {
        int[] fb = {1,0,0,0,1};
        int[] fb2 = {1,0,0,0,1,0,0};
        //System.out.println(canPlaceFlower(fb, 1));
        System.out.println(canPlaceFlower(fb2, 2));

    }
}


