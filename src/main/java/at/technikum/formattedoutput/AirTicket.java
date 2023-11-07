package at.technikum.formattedoutput;

public class AirTicket {

    public static void main(String[] args) {
        //NAME is at most 11 charcters wide
        //FIRSTNAME is at most 2 characters wide
        //SALUTATION is either MRS or MR

        System.out.printf("%.11S%.2S%S\n", "Mandl", "Thomas", "MR");
        System.out.printf("%.11S%.2S%S\n", "Hinteroberegginger", "Yolanda", "MRS");

        // MANDLTHMR
        // HINTEROBEREYOMRS
    }
}
