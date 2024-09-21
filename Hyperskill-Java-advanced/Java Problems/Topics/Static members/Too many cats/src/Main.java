class Cat {
    public String name;
    public int age;

    public static int counter;
    private static final String AAA = "";

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
        if (isManyCats()) {
            System.out.println("You have too many cats");
        }
    }

    public boolean isManyCats() {
        return counter > 5;
    }

    public static int getNumberOfCats() {
        return counter;
    }
}
