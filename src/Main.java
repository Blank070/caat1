import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String name= "Boss";
        String name1= "Sasha";
        String name2= "Gerda";
        int year = (int)(Math.random()*18);
        int year1 = (int)(Math.random()*18);
        int year2 = (int)(Math.random()*18);
        int heal = (int)(Math.random()*100);
        int heal1 = (int)(Math.random()*100);
        int heal2 = (int)(Math.random()*100);
        int mood = (int)(Math.random()*100);
        int mood1 = (int)(Math.random()*100);
        int mood2 = (int)(Math.random()*100);
        int fullness =(int)(Math.random()*100);
        int fullness1 =(int)(Math.random()*100);
        int fullness2 =(int)(Math.random()*100);
        int r = heal+mood+fullness;
        int r1 = heal1+mood1+fullness1;
        int r2 = heal2+mood2+fullness2;
        int mid = r / 3;
        int mid1 = r1 / 3;
        int mid2 = r2 / 3;

        System.out.print("+");
        printDashes(68);
        System.out.println("+");

        System.out.printf("|  %6s  |  %6s  |  %6s  |  %6s  |  %6s  |  %6s   |\n",
                "NAME", "YEAR", "HEAL", "MOOD", "FULLNESS", "MIDLVL");

        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");

        System.out.printf("|  %6s  |  %6s  |  %6s  |  %6s  |  %6s    |  %6s   |\n",
                name, year, heal, mood, fullness, mid);
        System.out.printf("|  %6s  |  %6s  |  %6s  |  %6s  |  %6s    |  %6s   |\n",
                name1, year1, heal1, mood1, fullness1, mid1);
        System.out.printf("|  %6s  |  %6s  |  %6s  |  %6s  |  %6s    |  %6s   |\n",
                name2, year2, heal2, mood2, fullness2, mid2);
        System.out.print("+");
        printDashes(68);
        System.out.println("+");

        System.out.println("Want to add a cat?");
        System.out.println("Yes-1");
        System.out.println("No-0");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        if (s==1){
            newCat();
            catHeal(heal,fullness,mood,heal1,fullness1,mood1,heal2,fullness2,mood2);
        } else if (s==0){
            catHeal(heal,fullness,mood,heal1,fullness1,mood1,heal2,fullness2,mood2);
        }
        System.out.println("Next day");
        nextDay(year, year2,year1,heal,fullness,mood,heal1,fullness1,mood1,heal2,fullness2,mood2);
    }

    static void newCat() throws IOException {
        System.out.println("Name for the cat");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Year");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        if(year==0){
            year= (int) (Math.random()*20+80);
        }
        System.out.println("Heal");
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
        int heal = Integer.parseInt(br.readLine());
        if(heal==0){
            heal= (int) (Math.random()*20+80);
        }
        System.out.println("Mood");
        BufferedReader er = new BufferedReader(new InputStreamReader(System.in));
        int mood = Integer.parseInt(br.readLine());
        if(mood==0){
            mood= (int) (Math.random()*20+80);
        }
        System.out.println("Fullness");
        BufferedReader we = new BufferedReader(new InputStreamReader(System.in));
        int fullness = Integer.parseInt(br.readLine());
        if(fullness==0){
            fullness= (int) (Math.random()*20+80);
        }
        int r =heal+mood+fullness;
        int mid = r/3;
        printGameStats();
        System.out.printf("|  %6s  |  %6s  |  %6s  |  %6s  |  %6s    |  %6s   |\n",
                name, year, heal, mood, fullness, mid);
        System.out.print("+");
        printDashes(68);
        System.out.println("+");
            }

    static void printGameStats() throws IOException {
        String name= "Boss";
        String name1= "Sasha";
        String name2= "Gerda";
        int year = (int)(Math.random()*18);
        int year1 = (int)(Math.random()*18);
        int year2 = (int)(Math.random()*18);
        int heal = (int)(Math.random()*100);
        int heal1 = (int)(Math.random()*100);
        int heal2 = (int)(Math.random()*100);
        int mood = (int)(Math.random()*100);
        int mood1 = (int)(Math.random()*100);
        int mood2 = (int)(Math.random()*100);
        int fullness =(int)(Math.random()*100);
        int fullness1 =(int)(Math.random()*100);
        int fullness2 =(int)(Math.random()*100);
        int r = heal+mood+fullness;
        int r1 = heal1+mood1+fullness1;
        int r2 = heal2+mood2+fullness2;
        int mid = r / 3;
        int mid1 = r1 / 3;
        int mid2 = r2 / 3;

        System.out.print("+");
        printDashes(68);
        System.out.println("+");

        System.out.printf("|  %6s  |  %6s  |  %6s  |  %6s  |  %6s  |  %6s   |\n",
                "NAME", "YEAR", "HEAL", "MOOD", "FULLNESS", "MIDLVL");

        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");

        System.out.printf("|  %6s  |  %6s  |  %6s  |  %6s  |  %6s    |  %6s   |\n",
                name, year, heal, mood, fullness, mid);
        System.out.printf("|  %6s  |  %6s  |  %6s  |  %6s  |  %6s    |  %6s   |\n",
                name1, year1, heal1, mood1, fullness1, mid1);
        System.out.printf("|  %6s  |  %6s  |  %6s  |  %6s  |  %6s    |  %6s   |\n",
                name2, year2, heal2, mood2, fullness2, mid2);
        System.out.print("+");
        printDashes(68);
        System.out.println("+");
    }

    private static void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }

    static void catHeal(int heal, int fullness, int mood,int heal1, int fullness1, int mood1,int heal2, int fullness2, int mood2) throws IOException {
        System.out.println("Boss -1, Sasha -2, Gerda -3");
        BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
        int name = Integer.parseInt(be.readLine());
        if (name ==1){
            System.out.println("Boss");
            System.out.println("Heal " + heal);
            System.out.println("Fullness " + fullness);
            System.out.println("Mood " + mood);
            System.out.println("Кормить кота - 1");
            System.out.println("Играть с котом - 2");
            System.out.println("Лечить кота - 3");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int d = Integer.parseInt(br.readLine());
            if(d==1){
                fullness +=5;
                mood +=5;
                System.out.println("Fullness: " + fullness);
                System.out.println("Mood: " + mood);
            }else if (d==2){
                mood +=5;
                heal +=5;
                fullness -=5;
                System.out.println("Mood: " + mood);
                System.out.println("Heal: " + heal);
                System.out.println("Fullness: " + fullness);
            }else if  (d ==3){
                heal +=5;
                mood -=5;
                fullness -=5;
                System.out.println("Heal: " + heal);
                System.out.println("Fullness: " + fullness);
                System.out.println("Mood: " + mood);

            }else {
                System.out.println("good");
            }
            boss(heal,fullness,mood,heal1,fullness1,mood1,heal2,fullness2,mood2);
        }else if (name ==2){
            System.out.println("Sasha");
            System.out.println("Heal " + heal1);
            System.out.println("Fullness " + fullness1);
            System.out.println("Mood " + mood1);
            System.out.println("Кормить кота - 1");
            System.out.println("Играть с котом - 2");
            System.out.println("Лечить кота - 3");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int d = Integer.parseInt(br.readLine());
            if(d==1){
                fullness1 +=5;
                mood1 +=5;
                System.out.println("Fullness: " + fullness1);
                System.out.println("Mood: " + mood1);
            }else if (d==2){
                mood1 +=5;
                heal1 +=5;
                fullness1 -=5;
                System.out.println("Mood: " + mood1);
                System.out.println("Heal: " + heal1);
                System.out.println("Fullness: " + fullness1);
            }else if  (d ==3){
                heal1 +=5;
                mood1 -=5;
                fullness1 -=5;
                System.out.println("Heal: " + heal1);
                System.out.println("Fullness: " + fullness1);
                System.out.println("Mood: " + mood1);

            }else {
                System.out.println("good");
            }
            sasha(heal,fullness,mood,heal1,fullness1,mood1,heal2,fullness2,mood2);
        }else if (name ==3){
            System.out.println("Gerda");
            System.out.println("Heal " + heal2);
            System.out.println("Fullness " + fullness2);
            System.out.println("Mood " + mood2);
            System.out.println("Кормить кота - 1");
            System.out.println("Играть с котом - 2");
            System.out.println("Лечить кота - 3");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int d = Integer.parseInt(br.readLine());
            if(d==1){
                fullness2 +=5;
                mood2 +=5;
                System.out.println("Fullness: " + fullness2);
                System.out.println("Mood: " + mood2);
            }else if (d==2){
                mood2 +=5;
                heal2 +=5;
                fullness2 -=5;
                System.out.println("Mood: " + mood2);
                System.out.println("Heal: " + heal2);
                System.out.println("Fullness: " + fullness2);
            }else if  (d ==3){
                heal2 +=5;
                mood2 -=5;
                fullness2 -=5;
                System.out.println("Heal: " + heal2);
                System.out.println("Fullness: " + fullness2);
                System.out.println("Mood: " + mood2);
            }else {
                System.out.println("good");
            }
            gerda(heal,fullness,mood,heal1,fullness1,mood1,heal2,fullness2,mood2);
        }


    }
    static void nextDay(int year,int year1, int year2, int heal,int fullness,int mood,int heal1,int fullness1,int mood1,int heal2,int fullness2,int mood2) throws IOException {
        String name= "Boss";
        String name1= "Sasha";
        String name2= "Gerda";
        System.out.print("+");
        printDashes(68);
        System.out.println("+");
        fullness -= (Math.random()*5);
        fullness1 -= (Math.random()*5);
        fullness2 -= (Math.random()*5);
        mood -= (Math.random()*-3+3);
        mood1 -= (Math.random()*-3+3);
        mood2 -= (Math.random()*-3+3);
        heal -= (Math.random()*-3+3);
        heal1 -= (Math.random()*-3+3);
        heal2 -= (Math.random()*-3+3);
        int r = heal+mood+fullness;
        int r1 = heal1+mood1+fullness1;
        int r2 = heal2+mood2+fullness2;
        int mid = r / 3;
        int mid1 = r1 / 3;
        int mid2 = r2 / 3;

        System.out.printf("|  %6s  |  %6s  |  %6s  |  %6s  |  %6s  |  %6s   |\n",
                "NAME", "YEAR", "HEAL", "MOOD", "FULLNESS", "MIDLVL");

        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");

        System.out.printf("|  %6s  |  %6s  |  %6s  |  %6s  |  %6s    |  %6s   |\n",
                name, year, heal, mood, fullness, mid);
        System.out.printf("|  %6s  |  %6s  |  %6s  |  %6s  |  %6s    |  %6s   |\n",
                name1, year1, heal1, mood1, fullness1, mid1);
        System.out.printf("|  %6s  |  %6s  |  %6s  |  %6s  |  %6s    |  %6s   |\n",
                name2, year2, heal2, mood2, fullness2, mid2);
        System.out.print("+");
        printDashes(68);
        System.out.println("+");

    }
    static void boss(int heal, int fullness, int mood,int heal1, int fullness1, int mood1,int heal2, int fullness2, int mood2) throws IOException {
        System.out.println("Boss -1, Sasha -2, Gerda -3");
        BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
        int name = Integer.parseInt(be.readLine());
        if (name ==1){
            System.out.println("Performed an action with this cat on this day.");
            boss(heal,fullness,mood,heal1,fullness1,mood1,heal2,fullness2,mood2);
        }else if (name ==2){
            System.out.println("Sasha");
            System.out.println("Heal " + heal1);
            System.out.println("Fullness " + fullness1);
            System.out.println("Mood " + mood1);
            System.out.println("Кормить кота - 1");
            System.out.println("Играть с котом - 2");
            System.out.println("Лечить кота - 3");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int d = Integer.parseInt(br.readLine());
            if(d==1){
                fullness1 +=5;
                mood1 +=5;
                System.out.println("Fullness: " + fullness1);
                System.out.println("Mood: " + mood1);
            }else if (d==2){
                mood1 +=5;
                heal1 +=5;
                fullness1 -=5;
                System.out.println("Mood: " + mood1);
                System.out.println("Heal: " + heal1);
                System.out.println("Fullness: " + fullness1);
            }else if  (d ==3){
                heal1 +=5;
                mood1 -=5;
                fullness1 -=5;
                System.out.println("Heal: " + heal1);
                System.out.println("Fullness: " + fullness1);
                System.out.println("Mood: " + mood1);

            }else {
                System.out.println("good");
            }
            sasha(heal,fullness,mood,heal1,fullness1,mood1,heal2,fullness2,mood2);
        }else if (name ==3){
            System.out.println("Gerda");
            System.out.println("Heal " + heal2);
            System.out.println("Fullness " + fullness2);
            System.out.println("Mood " + mood2);
            System.out.println("Кормить кота - 1");
            System.out.println("Играть с котом - 2");
            System.out.println("Лечить кота - 3");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int d = Integer.parseInt(br.readLine());
            if(d==1){
                fullness2 +=5;
                mood2 +=5;
                System.out.println("Fullness: " + fullness2);
                System.out.println("Mood: " + mood2);
            }else if (d==2){
                mood2 +=5;
                heal2 +=5;
                fullness2 -=5;
                System.out.println("Mood: " + mood2);
                System.out.println("Heal: " + heal2);
                System.out.println("Fullness: " + fullness2);
            }else if  (d ==3){
                heal2 +=5;
                mood2 -=5;
                fullness2 -=5;
                System.out.println("Heal: " + heal2);
                System.out.println("Fullness: " + fullness2);
                System.out.println("Mood: " + mood2);
            }else {
                System.out.println("good");
            }
            gerda(heal,fullness,mood,heal1,fullness1,mood1,heal2,fullness2,mood2);
        }
    }
    static void sasha(int heal, int fullness, int mood,int heal1, int fullness1, int mood1,int heal2, int fullness2, int mood2) throws IOException {
        System.out.println("Boss -1, Sasha -2, Gerda -3");
        BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
        int name = Integer.parseInt(be.readLine());
        if (name ==1){
            System.out.println("Boss");
            System.out.println("Heal " + heal);
            System.out.println("Fullness " + fullness);
            System.out.println("Mood " + mood);
            System.out.println("Кормить кота - 1");
            System.out.println("Играть с котом - 2");
            System.out.println("Лечить кота - 3");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int d = Integer.parseInt(br.readLine());
            if(d==1){
                fullness +=5;
                mood +=5;
                System.out.println("Fullness: " + fullness);
                System.out.println("Mood: " + mood);
            }else if (d==2){
                mood +=5;
                heal +=5;
                fullness -=5;
                System.out.println("Mood: " + mood);
                System.out.println("Heal: " + heal);
                System.out.println("Fullness: " + fullness);
            }else if  (d ==3){
                heal +=5;
                mood -=5;
                fullness -=5;
                System.out.println("Heal: " + heal);
                System.out.println("Fullness: " + fullness);
                System.out.println("Mood: " + mood);

            }else {
                System.out.println("good");
            }
        }else if (name ==2){
            System.out.println("Performed an action with this cat on this day.");
            sasha(heal,fullness,mood,heal1,fullness1,mood1,heal2,fullness2,mood2);
        }else if (name ==3){
            System.out.println("Gerda");
            System.out.println("Heal " + heal2);
            System.out.println("Fullness " + fullness2);
            System.out.println("Mood " + mood2);
            System.out.println("Кормить кота - 1");
            System.out.println("Играть с котом - 2");
            System.out.println("Лечить кота - 3");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int d = Integer.parseInt(br.readLine());
            if(d==1){
                fullness2 +=5;
                mood2 +=5;
                System.out.println("Fullness: " + fullness2);
                System.out.println("Mood: " + mood2);
            }else if (d==2){
                mood2 +=5;
                heal2 +=5;
                fullness2 -=5;
                System.out.println("Mood: " + mood2);
                System.out.println("Heal: " + heal2);
                System.out.println("Fullness: " + fullness2);
            }else if  (d ==3){
                heal2 +=5;
                mood2 -=5;
                fullness2 -=5;
                System.out.println("Heal: " + heal2);
                System.out.println("Fullness: " + fullness2);
                System.out.println("Mood: " + mood2);
            }else {
                System.out.println("good");
            }
            gerda(heal,fullness,mood,heal1,fullness1,mood1,heal2,fullness2,mood2);
        }

    }
    static void gerda(int heal, int fullness, int mood,int heal1, int fullness1, int mood1,int heal2, int fullness2, int mood2) throws IOException {
        System.out.println("Boss -1, Sasha -2, Gerda -3");
        BufferedReader be = new BufferedReader(new InputStreamReader(System.in));
        int name = Integer.parseInt(be.readLine());
        if (name ==1){
            System.out.println("Boss");
            System.out.println("Heal " + heal);
            System.out.println("Fullness " + fullness);
            System.out.println("Mood " + mood);
            System.out.println("Кормить кота - 1");
            System.out.println("Играть с котом - 2");
            System.out.println("Лечить кота - 3");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int d = Integer.parseInt(br.readLine());
            if(d==1){
                fullness +=5;
                mood +=5;
                System.out.println("Fullness: " + fullness);
                System.out.println("Mood: " + mood);
            }else if (d==2){
                mood +=5;
                heal +=5;
                fullness -=5;
                System.out.println("Mood: " + mood);
                System.out.println("Heal: " + heal);
                System.out.println("Fullness: " + fullness);
            }else if  (d ==3){
                heal +=5;
                mood -=5;
                fullness -=5;
                System.out.println("Heal: " + heal);
                System.out.println("Fullness: " + fullness);
                System.out.println("Mood: " + mood);

            }else {
                System.out.println("good");
            }

        }else if (name ==2){
            System.out.println("Sasha");
            System.out.println("Heal " + heal1);
            System.out.println("Fullness " + fullness1);
            System.out.println("Mood " + mood1);
            System.out.println("Кормить кота - 1");
            System.out.println("Играть с котом - 2");
            System.out.println("Лечить кота - 3");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int d = Integer.parseInt(br.readLine());
            if(d==1){
                fullness1 +=5;
                mood1 +=5;
                System.out.println("Fullness: " + fullness1);
                System.out.println("Mood: " + mood1);
            }else if (d==2){
                mood1 +=5;
                heal1 +=5;
                fullness1 -=5;
                System.out.println("Mood: " + mood1);
                System.out.println("Heal: " + heal1);
                System.out.println("Fullness: " + fullness1);
            }else if  (d ==3){
                heal1 +=5;
                mood1 -=5;
                fullness1 -=5;
                System.out.println("Heal: " + heal1);
                System.out.println("Fullness: " + fullness1);
                System.out.println("Mood: " + mood1);

            }else {
                System.out.println("good");
            }
        }else if (name ==3){
            System.out.println("Performed an action with this cat on this day.");
            gerda(heal,fullness,mood,heal1,fullness1,mood1,heal2,fullness2,mood2);
        }else {
            System.out.println("good");
        }


    }

}

