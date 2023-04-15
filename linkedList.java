public class linkedList {
    // класс для предоставления узла
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null; // предыдущий
        ListNode current = head; // настоящий
        ListNode next = null; // следующий 

        // пробегаем по списку меняя указатели
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }


    // Делаем список
    public static void main(String[] args) {
        ListNode head = new ListNode(123);
        ListNode node2 = new ListNode(22);
        ListNode node3 = new ListNode(89);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(78);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println("Исходный список: ");

        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

        head= reverseList(head); // разворачиваем

        System.out.println("\nРазвернутый список: ");

        current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

    long startTime = System.nanoTime();
    long endTime = System.nanoTime();
    long elapsedTime = endTime - startTime;

    System.out.println("\nВремя выполнения: " + elapsedTime + " нано секунд");
    }
}