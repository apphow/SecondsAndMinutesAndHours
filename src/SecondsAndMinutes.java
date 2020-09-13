public class SecondsAndMinutes {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            System.out.println("Invalid value.");
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;

        long remainingMinutes = minutes % 60;

        String hoursString = hours + "";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minuteString = remainingMinutes + "";
        if(remainingMinutes < 10) {
            minuteString = "0" + minuteString;
        }

        String secondString = seconds + "";
        if(seconds < 10) {
            secondString = "0" + secondString;
        }

        return hoursString + "h " + minuteString + "m " + secondString + "s";

    }

    public static String getDurationString(long seconds){
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;

        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

    public static void main(String[] args) {

        System.out.println(getDurationString(65L, 45L));

        System.out.println(getDurationString(3945L));
        System.out.println(getDurationString(145));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));
    }
}
