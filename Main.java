import java.util.Scanner;

public class Main {
    //第一题实现函数，打印三角形塔
    public static void showTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    //第二题实现函数，输出逆序
    public static void reverseSUM(String s) {
        char[] chars = s.toCharArray();
        int len= chars.length;
        System.out.printf("您输入的正整数位数为:%d\n",len) ;
        System.out.println("您输入的正整数的逆序为：");
        for (int i = len-1; i >=0 ; i--) {
            System.out.print(chars[i]);
        }
        System.out.print("");
    }
    //第三题函数的实现，判断回文数
    public static void isPalindrome(int num) {
        boolean flag = true;
        String numStr=Integer.toString(num);
        int left=0;
        int right=numStr.length()-1;
        while (left<right){
            if(numStr.charAt(left) != numStr.charAt(right)) {
                flag = false;
                break;
            }
            left++;
            right--;
        }
        if (flag) {
            System.out.println("是的") ;
        }
        else
            System.out.println("不是") ;
    }
    //第四题,打印水仙花数
    public static void ShuiXianHua() {
        int ge,shi,bai;
        for (int i = 100; i <1000 ; i++) {
            bai=i/100;
            shi=i/10%10;
            ge=i%10;
            if (Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3)==i)
                System.out.print(i+" ");
        }
        System.out.println();
    }
    //第五题函数实现
    public static void arraysDemo() {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入十个数字：");
        int[] num=new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextInt();
        }
        int min = num[0];
        int max = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] > max) {
                max = num[i];
            }
        }

        System.out.println("最小值和最大值之和:"+(max+min));;

    }
    public static void main(String[] args) {
        System.out.println("以下是选择题答案：");
        System.out.println("CBDBD");
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("请输入一个题号，输入0结束程序：");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("输入三角行的行数：");
                    int n=sc.nextInt();
                    showTriangle(n);
                    break;
                case 2:
                    System.out.println("输入一个正整数：");
                    String num= sc.nextLine();
                    reverseSUM(num);
                    break;
                case 3:
                    System.out.println("请输入要判断的整数：");
                    int df= sc.nextInt();
                    isPalindrome(df);
                    break;
                case 4:
                    ShuiXianHua();
                    break;
                case 5:
                    arraysDemo();
                    break;
                case 0:
                    System.out.println("程序结束。");
                    break;
                default:
                    System.out.println("无效的输入，请重新输入。");
            }

        } while (choice != 0);

    }
}