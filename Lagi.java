import java.util.Scanner;

class Task {
    String description;
    Task nextTask;

    public Task(String description) {
        this.description = description;
        this.nextTask = null;
    }

    public String getDescription() {
        return description;
    }

    static class TaskScheduler {
        Task head;

        public TaskScheduler() {
            head = null;
        }

        public void addTask(String description) {
            Task newTask = new Task(description);
            if (head == null) {
                head = newTask;
            } else {
                Task current = head;
                while (current.nextTask != null) {
                    current = current.nextTask;
                }
                current.nextTask = newTask;
            }
            System.out.println("Tugas berhasil di tambahkan.\n");
        }

        public void removeTask(String description) {
            if (head == null) {
                System.out.println("Tidak ada tugas yang di jadwalkan.");
                return;
            }

            if (head.getDescription().equals(description)) {
                head = head.nextTask;
                System.out.println("Tugas berhasil di hapus.");
                return;
            }

            Task current = head;
            Task previous = null;
            while (current != null && !current.getDescription().equals(description)) {
                previous = current;
                current = current.nextTask;
            }

            if (current == null) {
                System.out.println("Tugas tidak di temukan.");
            } else {
                previous.nextTask = current.nextTask;
                System.out.println("Tugas berhasil di hapus.");
            }
        }

        public void manipulateTask(String description, String newDescription) {
            Task current = head;
            while (current != null) {
                if (current.getDescription().equals(description)) {
                    current.description = newDescription;
                    System.out.println("Tugas berhasil di alihkan.");
                    return;
                }
                current = current.nextTask;
            }

            System.out.println("tugas tidak ditemukan.");
        }

        public void displayTasks() {
            Task current = head;
            if (current == null) {
                System.out.println("Tidak ada tugas yang di tambahkan.");
            } else {
                System.out.println("Tugas yang sudah dijadwalkan :");
                int count = 1;
                while (current != null) {
                    System.out.println(count + ". " + current.getDescription());
                    current = current.nextTask;
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println(">>>>>>>>Penjadwalan Tugas Eva<<<<<<<<<");
        System.out.println("=======================================");

        while (true) {
            System.out.println("1. Tambahkan Tugas");
            System.out.println("2. Menghapus Tugas");
            System.out.println("3. Manipulasi Tugas");
            System.out.println("4. Tampilan Tugas terjadwal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Masukkan Nama Tugas : ");
                    String addDescription = scanner.nextLine();
                    scheduler.addTask(addDescription);
                    break;
                case 2:
                    System.out.print("Masukkan Nama Tugas: ");
                    String removeDescription = scanner.nextLine();
                    scheduler.removeTask(removeDescription);
                    break;
                case 3:
                    System.out.print("Masukkan Nama Tugas: ");
                    String oldDescription = scanner.nextLine();
                    System.out.print("Masukkan Nama Tugas Baru: ");
                    String newDescription = scanner.nextLine();
                    scheduler.manipulateTask(oldDescription, newDescription);
                    break;
                case 4:
                    scheduler.displayTasks();
                    break;
                case 5:
                    System.out.println("Selamat Mengerjakan Tugas Evaa:).");
                    scanner.close();
                    System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
