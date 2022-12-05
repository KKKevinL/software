class Course
{
    public String courseName;
    public String profName;
    public int week;
    public int[] time;
    public int year;
    public int number;
    public int credit;

    Course(String cName, String pName, int wk, int start, int end, int yr, int num, int c)
    {
        time = new int[2];
        courseName = cName;
        profName = pName;
        week = wk;
        time[0] = start;
        time[1] = end;
        year = yr;
        number = num;
        credit = c;
    }
    public void show()
    {
        System.out.println(courseName + ", " + profName + ", week:" + week
                + ", start:" + time[0] + ", end:" + time[1] + ", year: " + year
                    +  ", num: " + number + ", credit: " + credit);
    }

    public int getNum()
    {
        return number;
    }

    public int getCredit()
    {
        return credit;
    }

}