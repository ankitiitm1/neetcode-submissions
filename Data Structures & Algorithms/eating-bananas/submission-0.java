class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int min = 1;
        int max = 0;

        for (int x : piles) {
            max = Math.max(max, x);
        }

        while (min < max) {

            int mid = min + (max - min) / 2;

            long currentTime = currentTime(piles, mid);

            if (currentTime > h) {
                // Speed is too slow
                min = mid + 1;
            } else {
                // Speed is sufficient
                // Try smaller speed
                max = mid;
            }
        }

        return min;
    }

    public long currentTime(int[] piles, int speed) {

        long time = 0;

        for (int x : piles) {
            time += (x + (long)speed - 1) / speed;
        }

        return time;
    }
}