public class Menu {
    public String menu(){
        return "- OPERATIONS - " +
                "\n[1] - Sum" +
                "\n[2] - Subtraction" +
                "\n[3] - Transpose" +
                "\n[4] - Multiplication" +
                "\n[5] - Ok, that's enough";
    }
    private String menuTranspose(){
        return "- TRANSPOSE -" +
                "\nWhich matrix you want to transpose?" +
                "\n[1] - Matrix A" +
                "\n[2] - Matrix B";
    }
    public int chooseTranspose(){
        System.out.println(menuTranspose());
        System.out.print("\nChoose a matrix -> ");
        int choose = Integer.parseInt(Main.input.nextLine());
        return choose;
    }
}
