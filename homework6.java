
public class homework6 {
    public static void main(String[] args) {
        int[] array = new int[] { 5, 3, 1, 2, 7, 6, 11, 10,  22, 33};

        Tree Node = new Tree(null);

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                Node = new Tree(array[i]);
            } else {
                Node.NewNode(new Tree(array[i]));
            }
        }
    
    String space = "";
        System.out.println("\n\nПрямой обход:");
        Iterr.NLR(Node, space);

        System.out.println("\n\nСкобочная запись:");
        Iterr.BracketNotation(Node);

        System.out.println("\n\nЦентрированный обход:");
        Iterr.LNR(Node, space);

        System.out.println("\n\nОбратный обход:");
        Iterr.LRN(Node, space);
    }
}

class Tree {
    public Tree(Integer v) {
        value = v;
    }

    Integer value;
    Tree left;
    Tree right;

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void NewNode(Tree Node) {
        if (Node.value < value) {
            if (left != null) {
                left.NewNode(Node);
            } else {
                left = Node;
            }
        } else {
            if (right != null) {
                right.NewNode(Node);
            } else {
                right = Node;
            }
        }
    }
}

class Iterr {

    static void NLR(Tree n, String s) {
        if (n != null) {
            System.out.printf("%s%d\n", s, n.value);
            if (n.left != null) {
                NLR(n.left, s + " ");
            }
            if (n.right != null) {
                NLR(n.right, s + " ");
            }
        }
    }


    static void LNR(Tree n, String s) {
        s = " ";
        if (n != null) {
            if (n.left != null) {
                LNR(n.left, s);
            }
            System.out.printf("%s%d", s, n.value);
            if (n.right != null) {
                LNR(n.right, s);
            }
        }
    }

    static void LRN(Tree n, String s) {
        s = " ";
        if (n != null) {
            if (n.left != null) {
                LRN(n.left, s);
            }
            if (n.right != null) {
                LRN(n.right, s);
            }
            System.out.printf("%s%d", s, n.value);
        }
    }

    static void BracketNotation(Tree n) {
        String lB = "(";
        String rB = ")";
        String s = " ";
        if( n != null) {
            System.out.printf("%s%d", s,  n.value);
            if (n.left != null) {
                System.out.printf("%s%s", s, lB);
                BracketNotation(n.left);
            }
            if(n.left == null && n.right != null){
                System.out.printf("%s%s", s, lB);
            }
            if(n.left != null && n.right != null){
                System.out.printf("%s%s", s, ",");

            }
            if (n.right != null) {
                BracketNotation(n.right);
                System.out.printf("%s%s", s, rB);
            }
        }
    }
}   

// Код с семинара 
// public static void main(String[] args) {
// Node root = new Node("5");
// Node l1 = new Node("3");
// Node l11 = new Node("1");
// Node r12 = new Node("2");
// Node r2 = new Node("7");
// Node l21 = new Node("6");
// Node r21 = new Node("11");
// Node l221 = new Node("10");

// r2.left = l21;
// r2.right = r21;

// l1.left = l11;
// l1.right = r12;

// root.right = r2;
// root.left = l1;
// r21.left = l221;

// Node.Straight(root);
// System.out.println("");
// Node.Centred(root);
// System.out.println("");
// Node.Reverse(root);
// }
// }

// class Node {
// String value;
// Node left;
// Node right;

// public Node(String n) {
// value = n;
// }

// static void Straight(Node n) {
// if (n != null) {
// System.out.println(" " + n.value);
// Straight(n.left);
// Straight(n.right);
// }
// }

// static void Centred(Node n) {
// if (n != null) {
// Centred(n.left);
// System.out.println(" " + n.value);
// Centred(n.right);
// }
// }

// static void Reverse(Node n) {
// if (n!= null) {
// Reverse(n.left);
// Reverse(n.right);
// System.out.println(" " + n.value);
// }
// }
// }