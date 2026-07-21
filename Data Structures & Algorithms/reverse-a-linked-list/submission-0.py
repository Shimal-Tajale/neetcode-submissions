# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head is None : 
            return head
        node = head
        last = None
        while (node.next is not  None):
            next = node.next
            node.next = last
            last = node
            node = next

        node.next = last
        return node
        