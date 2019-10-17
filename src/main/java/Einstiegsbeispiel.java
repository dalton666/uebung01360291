public class Einstiegsbeispiel {


    public static int binary2decimal(int bin) {
        if(bin < 0) {
            return -1;
        }

        int dec = 0;
        int base = 1;

        int helper = bin;
        while (helper > 0) {
            int last_digit = helper % 10;
            helper = helper / 10;

            dec += last_digit * base;

            base *= 2;
        }

        return dec;
    }

}