
/**
 * Write a description of class FindPrimes here.
 * 
 * @Daniel Jones
 * @1.0 (4/4/19)
 */
import java.util.*;
public class FindPrimes
{
    ArrayList<Double> primes = new ArrayList();
    /**
     * Constructor for objects of class FindPrimes
     */
    public FindPrimes()
    {
        double choice;
        primes.add(2.0);
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to find all primies upto a number of check if a number is prime(1 or 2)");
        int split=in.nextInt();
        if(split==1){
            System.out.println("What maximum range would you like to check for (put in a number)? ");

            choice=Double.parseDouble(in.next());
            System.out.println("Here we go: " + "\n" + 2.0);
            muchPrime(choice);
            makeString();
        }
        else{
            System.out.println("What number?");
            choice=Double.parseDouble(in.next());
            muchPrime(choice);
            if(isPrime(choice)){
                System.out.println("Congrats " + choice + " is a prime number");
            }
            else{
                System.out.println("Sorry that's not a prime number");
            }
        }
    }

    public void muchPrime(double choice){
        for(double d=3.0; d<choice;d++){    //iterates over all numbers upto double value Double.MAX_VALUE
                if(isPrime(d)){
                    primes.add(d);
                    System.out.println((int)(d)); //don't need this but looks like l337 hacker stuff
                }
                else{
                    continue;
                }

            }
    }
    
    public boolean isPrime(double num){
        for(int j=0; j<primes.size(); j++){     //checks if prime
            if(num%primes.get(j)==0){ //if num divisible by a prime break
                return false;
            }
        }
        return true;
    }

    public void makeString(){
        String str="";
        for(int k=0; k<primes.size()/10;k++){
            for(int m=0; m<10; m++){
                str+=primes.get(k*10 + m) + "  ";
            }
            str+="\n";
        }
        System.out.println(str);
    }
}
