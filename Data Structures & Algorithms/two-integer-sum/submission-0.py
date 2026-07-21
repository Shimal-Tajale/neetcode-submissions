class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        found = set()
        indexes = {}
        index = 0
        for num in nums :
            pair = target - num
            if (pair in found):
                otherIndex = indexes[pair]
                return [otherIndex, index]
            found.add(num)
            indexes[num] = index
            index += 1
        

        