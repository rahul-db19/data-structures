package com.java.interview;


public final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // No mutator methods (methods that modify the internal state)

    public ImmutablePerson withNewAge(int newAge) {
        return new ImmutablePerson(this.name, newAge);
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

    }

    public static void main(String[] args) {

        String name = "rahul";
        System.out.println(name.hashCode());
        System.out.println("Hello world");
//        ImmutablePerson immutablePerson1 = new ImmutablePerson("Rahul",25);
//        System.out.println(immutablePerson1);
//        int hashCode1 = System.identityHashCode(immutablePerson1);
//        System.out.println(hashCode1);
//
//        ImmutablePerson immutablePerson2 = new ImmutablePerson("Vinayak",26);
//        System.out.println(immutablePerson2);
//        int hashCode2 = System.identityHashCode(immutablePerson2);
//        System.out.println(hashCode2);
    }
}
