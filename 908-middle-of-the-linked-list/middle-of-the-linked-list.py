# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        cnt=0
        temp=head
        while head:
            head=head.next
            cnt+=1
        head=temp
        a=cnt
        mid=a//2
        for i in range(1,mid+1):
            head=head.next
        return head

        