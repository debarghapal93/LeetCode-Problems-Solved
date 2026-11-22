class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        int totalDays = 0;
        for (int y = 1971; y < year; y++){
            if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) totalDays += 366;
            else totalDays += 365;
        }
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) months[1] = 29;
        for (int i = 0; i < month - 1; i++){
            totalDays += months[i];
        }
        totalDays += day - 1;
        return days[totalDays % 7];

        
    }
}