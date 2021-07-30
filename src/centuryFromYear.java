public class centuryFromYear {
    int centuryFromYears(int year) {
        if (year % 100 != 0){
            return year / 100 + 1;
        }else{
            return year / 100;
        }
    }

    public static void main(String[] args) {
        centuryFromYear centuryFromYear = new centuryFromYear();
        int num = centuryFromYear.centuryFromYears(1888);
        System.out.println(num);
    }
}

