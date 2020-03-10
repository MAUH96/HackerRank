static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
    if(head==null){
        head =  new SinglyLinkedListNode(data);
        head.next=null;   
    } else {
         head.next = insertNodeAtTail(head.next, data);
     }  
     return head;      
    }