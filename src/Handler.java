import java.util.Scanner;

public class Handler {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Course[] c = new Course[20];
        c[0] = new Course("Computer Programming(1)", "Kuo-Yu Tsai", 5, 1, 4, 1, 1327, 2);
        c[1] = new Course("Physical Education(1)", "Ting-Wen Wang", 4, 8, 9, 1, 1325, 1);
        c[2] = new Course("Calculus(1)", "Chang-Cheng Chen", 1, 6, 8, 1, 1331, 3);
        c[3] = new Course("OOP", "Hwai-Jung Hsu", 1, 2, 4, 2, 3806, 2);
        c[4] = new Course("OOP Laboratory", "Hwai-Jung Hsu", 2, 3, 4, 2, 3807, 1);
        c[5] = new Course("Data Structure", "Yi-Feng Liu", 3, 6, 8, 2, 1359, 3);
        c[6] = new Course("Discrete Mathematics", "Chin-Sheng Yu", 3, 8, 10, 2, 1360, 3);
        c[7] = new Course("CRYPTOGRAPHY", "Jung-San Lee", 1, 6, 8, 2, 1355, 3);
        c[8] = new Course("Operating System(1)", "Jim-Min Lin", 4, 8, 10, 3, 1378, 3);
        c[9] = new Course("MICROPROCESSOR SYSTEMS", "Che-Cheng Chang", 5, 2, 4, 3, 1379,3);
        c[10] = new Course("THE EXPERIMENT OF MICRO-PROCESSOR SYSTEM", "Che-Cheng Chang", 5, 8, 10, 3, 1380, 24);
        c[11] = new Course("THIRD-YEAR ENGLISH", "Shu-Hung Chen", 5, 1, 2, 3, 1377, 2);
        c[12] = new Course("SOFTWARE ENGINEERING PRACTICES", "Hwai-Jung Hsu", 1, 6, 8, 3, 3803, 3);
        c[13] = new Course("SOFTWARE ENGINEERING PRACTICES", "Ming-Chi Liu", 4, 2, 4, 3, 1381, 3);
        c[14] = new Course("NETWORK PROGRAMMING", "Tzong-Jye Liu", 1, 7, 8 , 3, 1382, 2);
        c[15] = new Course("NETWORK PROGRAMMING LABORATORY", "Tzong-Jye Liu", 1, 9, 10, 3, 1383, 1);


        Table t = new Table();
        //加退選
        while(true) {
            System.out.println("-1.離開 , 1.加選, 2.退選 , 3.目前學分, 4.列出可選課程清單, 5.列出功課表");
            int mode = scanner.nextInt();
            if(mode == -1)
                break;
            else if(mode == 1) {
                System.out.println("The Course you want to register: ");
                int tmp = scanner.nextInt();
                int cd = 0;
                for (int i = 0; i < 16; i++) {
                    if (c[i].getNum() == tmp)
                        cd = c[i].getCredit();
                }
                if(cd == 0)
                    System.out.println("無此課程");
                else
                    t.add(tmp, cd);
            }
            else if(mode == 2) {
                System.out.println("The Course you want to drop: ");
                int tmp = scanner.nextInt();
                int cd = 0;
                for(int i=0; i<t.size; i++)
                {
                    if(t.coursesNum[i] == tmp)
                    {
                        t.delete(tmp, cd);
                    }
                }
                System.out.println("您無此課程");
            }
            else if(mode == 3)
                System.out.println("Current credits: " + t.credit);
            else if(mode == 4)
            {
                for(int i=0; i<16; i++)
                    c[i].show();
            }else if(mode == 5)
            {
                for(int i=0; i<16; i++) {
                    for(int j=0; j<t.size; j++) {
                        if(c[i].getNum() == t.coursesNum[j]) {
                            c[i].show();
                        }
                    }
                }
            }else
                System.out.println("Invalid input");
        }
    }
}
