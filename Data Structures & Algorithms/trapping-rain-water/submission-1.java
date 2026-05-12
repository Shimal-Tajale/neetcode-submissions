
class Solution {
    public int trap(int[] height) {
        int[] modifiedCopy = Arrays.copyOf(height,height.length);
        int wall = 0;
        int runningTotal = 0;
        int bestTotal = 0;
        int startIndex = 0;

        //Assume right wall has a left pair for every wall using running total
        for (int i = 0 ; i < height.length; i++){
            //Found end of current resvoir
            if (wall <= modifiedCopy[i]){

                bestTotal += runningTotal;
                runningTotal = 0;

                //filling in the holes
                
                for (int j = startIndex + 1; j < i; j++){
                    modifiedCopy[j] = wall;
                }
                

                startIndex = i;

                wall = modifiedCopy[i];

            } else {

            runningTotal += wall - modifiedCopy[i];
            }
        }

        wall = 0;
        runningTotal = 0;

        for (int i = height.length - 1 ; i >= 0; i-- ){
            //Found end of current resvoir
            if (wall <= modifiedCopy[i]){

                wall = modifiedCopy[i];

                bestTotal += runningTotal;
                runningTotal = 0;


            } else {
                runningTotal += wall - modifiedCopy[i];
            }
        }

        return bestTotal;


    }
}
