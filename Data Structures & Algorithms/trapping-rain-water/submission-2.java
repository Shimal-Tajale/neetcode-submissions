
class Solution {
    public int trap(int[] height) {
        int wall = 0;
        int runningTotal = 0;
        int bestTotal = 0;
        int startIndex = 0;

        //Assume right wall has a left pair for every wall using running total
        for (int i = 0 ; i < height.length; i++){
            //Found end of current resvoir
            if (wall <= height[i]){

                bestTotal += runningTotal;
                runningTotal = 0;

                startIndex = i;

                wall = height[i];

            } else {

                runningTotal += wall - height[i];
            }
        }

        wall = 0;
        runningTotal = 0;

        for (int i = height.length - 1 ; i >= startIndex; i-- ){
            //Found end of current resvoir
            if (wall <= height[i]){

                wall = height[i];

                bestTotal += runningTotal;
                runningTotal = 0;


            } else {
                runningTotal += wall - height[i];
            }
        }

        return bestTotal;


    }
}
