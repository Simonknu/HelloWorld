package First2Weeks;

public class Tid {
    public static void main(String[] args) {
        int second = 34;
        int minute = 56;
        int hour = 9;
        System.out.println("Hour: " + hour + ", Minute: " + minute + ", Second: " + second);
        int SecondsSinceMidnight = hour * 3600 + minute * 60 + second;
        System.out.println("Since midnight it has been: " + SecondsSinceMidnight + " seconds" );
        int secondsleft = 24 * 3600 - SecondsSinceMidnight;
        System.out.println("There are " + secondsleft + " seconds left in the day");
        int secondnow = 46;
        int minutenow = 13;
        int hournow = 10;
        int timetofinish = (hournow * 3600 + minutenow * 60 + secondnow) - SecondsSinceMidnight;

        System.out.println("It took " + (hournow - hour) + " hours, "
                + (minutenow - minute) + " minutes and " + (secondnow - second)
                + " seconds to finish this task.");

        System.out.println("It took " + timetofinish + " seconds to finish this task");

    }
}
