public class Program {
    public static void main(String[] args) {
        String osname = System.getProperty("os.name");
        String arch = System.getProperty("os.arch");
        System.out.print("Name: ");
        System.out.println(osname);
        System.out.print("Arch: ");
        System.out.println(arch);

        System.out.println(RuntimeDetector.getLibraryResource("ntcore"));
    }
}