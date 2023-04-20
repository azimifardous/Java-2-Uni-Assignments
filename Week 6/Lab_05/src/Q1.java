public class Q1 {
    public static void main(String[] args) {
        EmployeeBeing murat = new EmployeeBeing("murat",2000);
        murat.step(3000);
        System.out.println(murat);

        EmployeeBeing kazim = new EmployeeBeing("kazim",3000);
        System.out.println(kazim);
        System.out.println("Employee Population : "+ EmployeeBeing.getNumberEmployee());
    }
}
