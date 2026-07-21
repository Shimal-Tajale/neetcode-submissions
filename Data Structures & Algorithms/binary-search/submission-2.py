class Solution:
    def search(self, nums: List[int], target: int) -> int:
        left = 0
        right = len(nums) - 1
        
        if (len(nums) == 0):
            return -1
        

        while (left < right):
            divider = (left + right) // 2
            splitter = nums[divider]
            if (splitter == target) :
                return divider;

            if (splitter < target):
                left = divider + 1
            else : 
                right = divider

        if (nums[right] == target) :
            return right;

        return -1
        