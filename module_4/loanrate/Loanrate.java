public class Loanrate {

    public static void main(String[] args){
          
          calculate(55000,2);
      
    }
  
      public static void calculate(double salary, double years){
  
          if (salary >= 55000)
          {
            if (years >= 2)
            {
              System.out.println("You qualify for the loan.");
            }
            else
            {
              System.out.println("You must have 2 years at your" +
  
  "                             current job");
            }
          }
          else
          {
            System.out.println("You must earn at least" +
                      "$55,000 per year to qualify.");
          }
  
      }
  
  }