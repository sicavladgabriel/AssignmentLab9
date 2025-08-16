public class Main {
    public static void main(String[] args) {



 //3
    LogicalOp greaterNr = new LogicalOp();
    int biggest = greaterNr.checkBiggerNumber(75,102);
    System.out.println("The bigger number is: "+ biggest);




//4
        LogicalOp checkTxt = new LogicalOp();
        String result = checkTxt.textChecking("Fasttrackit");
        System.out.println(result);


// 5
        LogicalOp checkTxt2 = new LogicalOp();
        String result2 = checkTxt2.anotherTextChecking("FastTrackIT",3);
        System.out.println(result2);

        LogicalOp chcktxt = new LogicalOp();
        String rslt = chcktxt.anotherTextChecking("SlowTrackIT",3);
        System.out.println(rslt);


//6
        LogicalOp centimeters = new LogicalOp();
        String nrcentimeters = centimeters.centimetersOfSnow(9);
        System.out.println(nrcentimeters);

        LogicalOp centimeters2 = new LogicalOp();
        String nrcentimeters2 = centimeters2.centimetersOfSnow(6);
        System.out.println(nrcentimeters2);

        LogicalOp centimeters3 = new LogicalOp();
        String nrcentimeters3 = centimeters3.centimetersOfSnow(3);
        System.out.println(nrcentimeters3);

//7
        LogicalOp biggestNr = new LogicalOp();
        String bigger = biggestNr.biggestNumber(5);
        System.out.println(bigger);


        LogicalOp biggestNr2 = new LogicalOp();
        String bigger2 = biggestNr2.biggestNumber(4);
        System.out.println(bigger2);


        LogicalOp biggestNr3 = new LogicalOp();
        String bigger3 = biggestNr3.biggestNumber(2);
        System.out.println(bigger3);



//8
        LogicalOp findTheNr = new LogicalOp();
        findTheNr.findTheNumber(35);

        LogicalOp findTheNr2 = new LogicalOp();
        findTheNr2.findTheNumber(101);

        LogicalOp findTheNr3 = new LogicalOp();
        findTheNr3.findTheNumber(90);

        LogicalOp findTheNr4 = new LogicalOp();
        findTheNr4.findTheNumber(1);

//9
        LogicalOp evenNumber = new LogicalOp();
        boolean evnNr = evenNumber.isNumberEven(10);
        System.out.println(evnNr);


        LogicalOp evenNumber2 = new LogicalOp();
        boolean evnNr2 = evenNumber2.isNumberEven(9);
        System.out.println(evnNr2);


//10
        LogicalOp eligibleToVote = new LogicalOp();
        boolean eligibility = eligibleToVote.isEligibleToVote(17);
        System.out.println(eligibility);

        LogicalOp eligibleToVote2 = new LogicalOp();
        boolean eligibility2 = eligibleToVote.isEligibleToVote(25);
        System.out.println(eligibility2);

//11
        LogicalOp goatNr = new LogicalOp();
        int  biggerNr = goatNr.theBiggerNumber(12,35,42);
        System.out.println(biggerNr);

        LogicalOp goatNr2 = new LogicalOp();
        int  biggerNr2 = goatNr2.theBiggerNumber(1075,1,1000);
        System.out.println(biggerNr2);

        LogicalOp goatNr3 = new LogicalOp();
        int  biggerNr3 = goatNr3.theBiggerNumber(1005,10000,345);
        System.out.println(biggerNr3);


    }}