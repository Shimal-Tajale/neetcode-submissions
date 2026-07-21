class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if (len(s) != len(t)):
            return False
        

        s_dict = {};
        t_dict = {};

        #compile count of every item in s
        for letter in s :
            if (letter in s_dict):
                s_dict[letter] += 1
            else :
                s_dict[letter] = 1
        #compile count of every item in t
        for letter in t :
            if (letter in t_dict):
                t_dict[letter] += 1
            else :
                t_dict[letter] = 1
        for letter in s_dict.keys() : 
            if (not letter in t_dict) :
                return False
            if (s_dict[letter] != t_dict[letter]):
                return False
            

        return True