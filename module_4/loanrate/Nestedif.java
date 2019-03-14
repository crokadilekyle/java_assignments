public class Nestedif {

    public static void main(String[] args){
        amount(8,101);
    }

    public static void amount(int amount1, int amount2){
        
        if (amount1 > 10)
        {
            if(amount1 > amount2)
            {
                System.out.println("amount1");
            }
            else
            {
                System.out.println("amount2");
            }
        }
        else
        {
            if (amount2 < 100)
            {
                if (amount2 > amount1)
                {
                System.out.println("amount2");
                }
            }
            
        }
    }
}