# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if (list2 is None):
            return list1

        if (list1 is None):
            return list2
        
        if (list1.val > list2.val):
            merged = list2
            list2=list2.next
        else :
            merged = list1
            list1=list1.next

        right = list1
        left = list2
        
        original = merged

        while (right is not None and left is not None):
            if right is None or left.val < right.val :
                merged.next = left
                left = left.next
            else :
                merged.next = right
                right = right.next
            
            merged = merged.next
        
        if (right is None) :
            merged.next = left
        else :
            merged.next = right

        return original
