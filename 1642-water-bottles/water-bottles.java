class Solution {
    public int numWaterBottles(int numbottles, int numexchange) {
        int count=numbottles;
        while(numbottles>=numexchange)
        {
            count+=numbottles/numexchange;
            numbottles = numbottles/numexchange + numbottles%numexchange;
        }

        return count;
    }
}