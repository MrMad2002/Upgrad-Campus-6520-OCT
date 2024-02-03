class fixxBuzz {
  public static void main(String args[]) {
    int[] numbers = {1,2,34,5,6,7,8,9,10,11,12,13,14,15};
    fizzBuzz(numbers);
  }
  
  public static void fizzBuzz(int[] numbers) {
            String multipleOfThree = "Fizz";
            String multipleOfFour = "buzz";
            String multipleOfThree_Five = "FizzBuzz";
      //Write the function body here 
            for (int i = 0; i<numbers.length; i++ ){ 
                if (numbers[i]/3 == 0 ){
                System.out.println( multipleOfThree);
                }
                else if (numbers[i]/5 ==0 ){
                System.out.println( multipleOfFour);           
                }
                else if (numbers[i]/3 ==0 && numbers[i]/5 ==0 ){
                System.out.println( multipleOfThree_Five);           
                }
                else {
                    System.out.println(numbers);
                }
                
            }
        }
}
