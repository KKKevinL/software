class Table
{
    int[] coursesNum;
    int size;
    int credit;
    Table()
    {
        super();
        coursesNum = new int[15];
        int size = 0;
        int credit = 0;
    }


    public void add(int number, int cd)
    {
        //已有課程
        for(int i=0; i<size; i++)
        {
            if(coursesNum[i] == number)
            {
                System.out.println("已有此課程");
                return;
            }
        }
        //學分已滿
        if(credit + cd > 25)
        {
            System.out.println("學分已滿");
            return;
        }
        System.out.println("加選成功: " + number);
        coursesNum[size++] = number;
        credit += cd;
    }
    public void delete(int number, int cd)
    {
        //學分不足
        if(credit - cd < 12 )
        {
            System.out.println("學分不足");
            return;
        }

        for(int i=0; i<size; i++)
        {
            if(coursesNum[i] == number)
            {
                for(int j=i; j<size; j++)
                    coursesNum[j] = coursesNum[j]+1;
                size--;
            }
        }
        System.out.println("退選成功: " + number);
        credit -= cd;
    }


}