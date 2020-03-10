static void printLinkedList(SinglyLinkedListNode head) {
        
    int temp = head.data;

    System.out.println(temp);

        while(head.next!=null){
            
            head= head.next;
            System.out.println( head.data);
        }
    }