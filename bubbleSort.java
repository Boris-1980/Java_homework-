public class bubbleSort {

    public class Node {
        int data;
        Node prev;
        Node next;
        
        public Node (int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public class DoublyLinkedList {
        Node head;

        public DoublyLinkedList() {
            this.head = null;
        }

        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
                newNode.prev = current;
            }
        }

        public void bubbleSort() {
            if (head == null || head.next == null) {
                // Проверка, если список пуст или содержит только один элемент, то сортировка не требуется
                return;
            }

            boolean swapped;
            do {
                swapped = false;
                Node current = head;

                while (current != null && current.next != null) {
                    if (current.data > current.next.data) {
                        // Если элемент больше следующего, то меняем их местами
                        int temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;
                        swapped = true;
                    }
                    current = current.next;
                }
            } while (swapped);
        }

        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        bubbleSort bubbleSort = new bubbleSort();
        DoublyLinkedList list = bubbleSort.new DoublyLinkedList(); 

        list.append(354);
        list.append(23);
        list.append(80);
        list.append(241);
        list.append(46);
    
        System.out.println("Исходный список:");
        list.display();
    
        System.out.println("Список после сортировки :");
        list.bubbleSort();
        list.display();

        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        System.out.println("\nВремя выполнения: " + elapsedTime + " нано секунд");
    }
    
}


