public class Salary {
/*
    En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
    försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
  */
    public static void main(String[] args) {
        int monthlySalary = 8000;
        // final int PROVISIONPERCENTAGE = 9;
        // double provision = 0.09;
        int salesAmount = 20147;
        double provision = salesAmount * 0.09;
        // int newSalary = monthlySalary +(int) (salesAmount * PROVISIONPERCENTAGE) / 100;

        // System.out.println("Ny månadslön är : "+newSalary);

        System.out.println("månadslön "+(monthlySalary+provision));
    }
}
