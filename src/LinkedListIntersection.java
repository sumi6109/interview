/**
 * Created by sushantmittal on 11/10/17.
 */

class LinkedNode {
    int value;
    LinkedNode next;

    public LinkedNode(int value, LinkedNode next) {
        this.value = value;
        this.next = next;
    }
}

class LinkedList {
    public LinkedNode start;

    public LinkedList(LinkedNode start) {
        this.start = start;
    }

    public LinkedNode add(LinkedNode node) {
        LinkedNode temp = start;
        while (start.next != null) {
            start = start.next;
            start.next =null;
        }
        start.next = node;

        return temp;
    }
}

public class LinkedListIntersection {

    public int intersectValue(LinkedNode first, LinkedNode second) {
        int countFirst = size(first);
        int countSecond = size(second);

        int differenceCount = countFirst - countSecond;
        System.out.println("countSecond = " + countSecond);
        System.out.println("countFirst = " + countFirst);
        System.out.println("differenceCount = " + differenceCount);
        if (differenceCount > 0) {
            return moveListThenCommon(first, second, differenceCount);
        } else if (differenceCount < 0) {
            return moveListThenCommon(second, first, differenceCount);
        } else
            return 0;
    }

    private int moveListThenCommon(LinkedNode first, LinkedNode second, int lenghtDiff) {
        for (int i = 0; i < lenghtDiff; i++) {
            first = first.next;
        }

        while (first!=null && second !=null){
            System.out.println("first.value = " + first.value);
            System.out.println("second.value = " + second.value);
            if(first.value==second.value){
                return first.value;
            }
            first =first.next;
            second = second.next;
        }
        return 0;
    }

    private int size(LinkedNode first) {
        int count = 1;
        while (first.next != null) {
            first = first.next;
            count++;
        }
        return count;
    }


}
