package ELIVATE_CJ_QSN;

public class Arm_Strong {
	public static void main(String[] args) {

        int number = 153, originalNumber, remainder, result = 0;

        originalNumber = number; //15

        while (originalNumber != 0)//15, 1
        {
            remainder = originalNumber % 10;//rem =3 , 5 , 1
            result+= Math.pow(remainder, 3);//3*3*3=27 , 5*5*5 =125+27=152res, 1*1*1=1 152+1=153
            originalNumber /= 10;//153/10-->15, 15/10-->1,0
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}

