class Solution:
    def isPalindrome(self, s: str) -> bool:
        lastIndex = len(s) - 1
        firstIndex = 0
        while (firstIndex <= lastIndex) :

            while (not s[firstIndex].isalnum()):
                firstIndex += 1
                if (lastIndex < firstIndex) :
                    return True

            while (not s[lastIndex].isalnum()):
                lastIndex -= 1

                if (lastIndex < firstIndex) :
                    return True

            if (s[firstIndex].lower() != s[lastIndex].lower()):
                return False
            firstIndex += 1
            lastIndex -= 1

        return True
        