import java.util.Scanner;

public class Warung {
    Node head;

    class Node {
        int data;
        Node next;

        public Node(int di) {
            data = di;
            next = null;
        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertFront(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void insertBack(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
        return;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
    
    public static void main(String[] args) {
        Warung warung = new Warung();
        Scanner scanner = new Scanner(System.in);
        System.out.println("======Selamat datang di warung makan pak Samuri======");
        System.out.println("Berikut yang kami sediakan di toko kami : ");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.println("3. Cemilan");
        System.out.println("Masukkan pilihan anda : ");

        int pilih = scanner.nextInt();

        String[] makanan = {"Mie ayam (Rp 15.000)", "Mie ayam goreng (Rp 18.000)", "Nasi goreng (Rp 15.000)", "Soto ayam (Rp 20.000)", "Seblak (Rp 10.000)"};
        String[] minuman = {"Es teh (Rp 5.000)", "Es Marimas (Rp 7.000)", "Es teler (Rp 10.000)", "Kopi (Rp 8.000)"};
        String[] cemilan = {"Basreng (Rp 7.000)", "Kentang goreng (Rp 8.000)", "Tahu walik (Rp 5.000)", "Jasuke (Rp 10.000)"};

        switch (pilih) {
            case 1:
                // program pemesanan makanan
                System.out.println("Menu makanan yang dapat dipesan :");
                for (String menu : makanan) {
                    System.out.println(menu);
                }

                int count = 1; // Declare and initialize count variable
                while (count > 0) {
                    System.out.println("Masukkan nama makanan : ");
                    String nama = scanner.next();
                    if (warung.isEmpty()) {
                        System.out.println("Maaf, stok makanan habis");
                    }
                    boolean makananTersedia = false;
                    for (String menu : makanan) {
                        if (menu.contains(nama)) {
                            makananTersedia = true;
                        }
                    }
                    if (!makananTersedia) {
                        System.out.println("Makanan tidak tersedia");
                        break;
                    }
                }

                break;

            case 2:
                // program pemesanan minuman
                System.out.println("Menu minuman yang dapat dipesan :");
                for (String menu : minuman) {
                    System.out.println(menu);
                }

                System.out.println("Masukkan nama minuman : ");
                String minumanPilihan = scanner.next();
                boolean minumanTersedia = false;
                for (String menu : minuman) {
                    if (menu.contains(minumanPilihan)) {
                        minumanTersedia = true;
                        break;
                    }
                }
                if (minumanTersedia) {
                    System.out.println("Anda memesan " + minumanPilihan);
                } else {
                    System.out.println("Minuman tidak tersedia");
                }

                break;

            case 3:
                // program pemesanan cemilan
                System.out.println("Menu cemilan yang dapat dipesan :");
                for (String menu : cemilan) {
                    System.out.println(menu);
                }

                System.out.println("Masukkan nama cemilan : ");
                String cemilanPilihan = scanner.next();
                boolean cemilanTersedia = false;
                for (String menu : cemilan) {
                    if (menu.contains(cemilanPilihan)) {
                        cemilanTersedia = true;
                        break;
                    }
                }
                if (cemilanTersedia) {
                    System.out.println("Anda memesan " + cemilanPilihan);
                } else {
                    System.out.println("Cemilan tidak tersedia");
                }

                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }

        scanner.close();
    }
}
