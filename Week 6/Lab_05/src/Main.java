public class Main {
    public static void main(String[] args) {
        EmployeeBeing murat = new EmployeeBeing("murat",2000);
        murat.step(3000);
        System.out.println(murat);

        EmployeeBeing kazim = new EmployeeBeing("kazim",3000);
        System.out.println(kazim);

        EmployeeBeing remzi = new EmployeeBeing("kazim",3000);
        System.out.println(remzi);

        EmployeeBeing necati = new EmployeeBeing("necati",2000);
        System.out.println(necati);

        System.out.println();
        System.out.println(murat.comparePeople(kazim));
        System.out.println(kazim.comparePeople(remzi));
        System.out.println(necati.comparePeople(murat));
        System.out.println(necati.comparePeople(remzi));
        System.out.println();

        System.out.println("Employee Population : " + EmployeeBeing.getNumberEmployee());
    }
}
