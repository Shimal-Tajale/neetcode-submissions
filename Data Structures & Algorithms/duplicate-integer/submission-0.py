class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        foundWords = {};

        for num in nums :
            if (num in foundWords):
                return True;
            foundWords[num] = True;
        

        return False;
        