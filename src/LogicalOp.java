public class LogicalOp {




    public int checkBiggerNumber(int a,int b){

        if (a > b) {
            return a;
        }
        else {
            return b;
    }}


public String textChecking(String txt){
    if(txt.equals("Fasttrackit")){
        return "Learning text comparision.";
    }
    else {
        return "Got to try some more.";}
    }





    public String anotherTextChecking(String txt2, int a){

        if(txt2.equals("FastTrackIT") && a <= 3){
            return txt2 +" "+ a;
        }
        else {
            return a +" "+ txt2;
        }
    }


    public String centimetersOfSnow (int a){

        if(a > 8 || a == 6){
           return  "The amount of snow this winter was(cm):" +" "+ a;
        }
        else{
            return "The forecast snow is(cm):"+" "+ a;

        }

    }


    public String biggestNumber (int a){

        if(a > 3 && a != 4){
            return  "The number is greater than 3 and not equal to 4";
        } else if (a == 4) {
            return "The number is equal to 4";
        }
        else {
            return "The number is lower than 3";
        }
    }


    public void findTheNumber (int a){
        switch (a) {
            case 45 :
                System.out.println("The number is:"+" "+ a);break;
            case 23 :
                System.out.println("The number is:"+" "+ a);break;
            case 90 :
                System.out.println("The number is:"+" "+ a);break;
            case 77 :
                System.out.println("The number is:"+" "+ a);break;
            case 22 :
                System.out.println("The number is:"+" "+ a);break;
            case 3 :
                System.out.println("The number is:"+" "+ a);break;
            case 101 :
                System.out.println("The number is:"+" "+ a);break;
            default:
                System.out.println("The number is:"+" "+ a);
        }

    }





    public boolean isNumberEven(int a){

        if(a % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }



    public boolean isEligibleToVote(int a){

        if(a > 18){
            return true;
        }
        else {
            return false;
        }
    }


    public int theBiggerNumber(int a, int b, int c){
        if(a > b && a > c){
            return a;
        } else if (b > a && b > c) {
            return b;}
            else{
                return c;
            }

        }






    }










