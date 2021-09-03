public class TestAuthor {
    public static void main(String[] args) {
        Author ob1 = new Author("Tatarincsev", "krutoynick01@gmail.com", 'm');
        Author ob2 = new Author("Kashirskaya", "krutoynick02@gmail.com",'f');
        Author ob3 = new Author("Beleberda", "krutoynick03@gmail.com", 'f');
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
        System.out.println(ob3.toString());
        System.out.println();
    }
}
