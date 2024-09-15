class MySecondProgram {
    public static void main(String entrada[]) {
        String name = "Ana";
        int age;
        double height;
        boolean isMarried;
        char gender;

        isMarried = entrada[0] == "yes" ? true : false;
        age = Integer.parseInt(entrada[1]);
        height = Double.parseDouble(entrada[2]);
        gender = entrada[3].charAt(0);

        System.out.print("I am " + name + ", my gender is " + gender + ", and I am " + age + " years old. I am " + height + "m tall");

        if(isMarried) {
            System.out.print(" and I am married.");
        } else {
            System.out.print(" and I am single.");
        }

        System.exit(0);
    }
}