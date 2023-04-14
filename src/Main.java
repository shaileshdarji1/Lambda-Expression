public class Main {
    public static void main(String[] args) {

        MyInter myInter = () -> System.out.println("I'm watching movie");
        myInter.show();

        SumInter sumInter = (a, b) -> a + b;
        System.out.println(sumInter.sum(10, 20));

        StrLength strLength = str -> str.length();
        System.out.println(strLength.strLength("Shailesh"));
    }
}
