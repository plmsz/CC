class MyFirstProgram {
    public static void main(String[] args) {
        String name = "Ana";
        int age = 26;
        double height = 1.75;
        boolean isMarried = false;

        System.out.print("I am " + name + ", and I am " + age + " years old. I am " + height + "m tall");
        if(isMarried) {
            System.out.print(" and I am married.");
        } else {
            System.out.print(" and I am single.");
        }

        System.exit(0);
    }
}