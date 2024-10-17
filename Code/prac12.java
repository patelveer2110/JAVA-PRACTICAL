

public class prac12{
    static float converToRs(float pound){
        return pound*100;
    }
    public static void main(String[] args) {
        float pound;
        //System.out.println("Enter the amount in pound : ");
        //Scanner sc=new Scanner(System.in);
        pound=Float.parseFloat(args[0]);
        System.out.println("Amount is Rupees  : "+converToRs(pound));

    }
} 

