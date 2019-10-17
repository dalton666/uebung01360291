public class Einstiegsbeispiel {

    public int binary2decimal (int binary){
        int dez = 0;
        int i = 0;
        while(true){
            if(binary==0){
                break;

            }else{
                int temp = binary%10;
                dez += temp*Math.pow(2, i);
                binary = binary/10;
                i++;
            }
        }

        return dez;
    }
}
