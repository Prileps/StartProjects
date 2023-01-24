public class Main {
    public static void main(String[] args) {
        //Task #1
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        //Task #2
        for (char c = 'А'; c <= 'Е'; c++) {
            System.out.println(c + " - " + (int) c);
        }
        System.out.println('Ё' + " - " + (int) 'Ё');
        for (char c = 'Ж'; c <= 'е'; c++) {
            System.out.println(c + " - " + (int) c);
        }
        System.out.println('ё' + " - " + (int) 'ё');
        for (char c = 'ж'; c <= 'я'; c++) {
            System.out.println(c + " - " + (int) c);
        }
    }
}