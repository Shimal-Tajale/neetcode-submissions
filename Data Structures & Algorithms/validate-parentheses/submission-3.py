class Solution:
    def isValid(self, s: str) -> bool:
        stack = []

        pairs = {"(":")","[":"]","{":"}"}


        for letter in s:
            if letter in pairs.keys():
                stack.append(letter)
            elif letter in pairs.values():
                if (len(stack) == 0) :
                    return False
                opener = stack.pop()
                if (pairs[opener] != letter) :
                    return False
            
            

                
            
        return len(stack) == 0