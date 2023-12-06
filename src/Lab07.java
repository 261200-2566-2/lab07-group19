public class Lab07 {
    public static void main(String[] args) {
        System.out.println("\n\n\n--------------------------------------");
        System.out.println("Set implemented by HashMap Test");
        System.out.println("Test1");
        Set s1 = new Set();
        System.out.println("is s1 empty?: " + s1.isEmpty());
        s1.printSet();
        s1.add(0);
        s1.add(12);
        s1.add(55);
        s1.add(40);
        s1.add(55);
        s1.add(-8);
        s1.printSet();
        s1.remove(14);
        s1.remove(12);
        s1.remove(55);
        s1.printSet();
        System.out.println("s1's size: " + s1.size());

        System.out.println("\n\n\nTest2");
        Set s2 = new Set();
        System.out.println("s2's size: " + s2.size());
        s2.addAll(s1);
        s2.printSet();
        s2.add(998);
        s2.add(696);
        s2.add(123);
        System.out.println("is s2 empty?: " + s2.isEmpty());
        s2.printSet();
        s2.removeAll(s1);
        s2.printSet();
        s2.clear();
        System.out.println("is s2 empty?: " + s2.isEmpty());

        System.out.println("\n\n\nTest3");
        Set s3 = new Set();
        s3.add(2);
        s3.add(1);
        s3.add(3);
        s3.add(4);
        s3.add("Patty");
        s3.add("John");
        s3.add("Alex");
        s3.printSet();
        Set s4 = new Set();
        s4.add("Alex");
        s4.add(2);
        s4.add("John");
        s4.add("Muhammad");
        s3.retainAll(s4);
        s3.printSet();

        System.out.println("\n\n\nTest3");
        Set s5 = new Set();
        Set s6 = new Set();
        s5.add(1);
        s5.add(2);
        s5.add(3);
        s5.add(72.5);
        s5.add("Jack");
        s6.add(4);
        s6.add(5);
        s6.add(6);
        s5.printSet();
        System.out.println("s5 contains Joe? " + s5.contains("Joe"));
        System.out.println("s5 contains Jack? " + s5.contains("Jack"));
        System.out.println("s5 contains 4? " + s5.contains(4));
        System.out.println("s5 contains 3? " + s5.contains(3));
        System.out.println("s6 containsAll s5? " + s6.containsAll(s5));
        s6.addAll(s5);
        s6.printSet();
        System.out.println("s6 containsAll s5? " + s6.containsAll(s5));
        s6.retainAll(s5);
        s6.printSet();
        System.out.println("s6 containsAll s5? " + s6.containsAll(s5));

    }
}
