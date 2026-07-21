class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        for (int i = 0; i < gas.length; i++) {
            if (canComplete(i, gas, cost)) {
                return i;
            }
        }

        return -1;
    }

    private boolean canComplete(int start, int[] gas, int[] cost) {

        int tank = 0;
        int current = start;
        int n = gas.length;

        do {
            tank += gas[current];
            tank -= cost[current];

            if (tank < 0) {
                return false;
            }

            current = (current + 1) % n;

        } while (current != start);

        return true;
    }
}