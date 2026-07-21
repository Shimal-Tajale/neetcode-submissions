# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        log = set()
        node = head
        while (node != None):
            if (node in log) :
                return True
            log.add(node)
            node = node.next

        return False