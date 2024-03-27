import java.util.Scanner;
import java.util.Stack;

public class Main {
    //该函数用于第一小题的绘制三角形塔
    public static void showTriangle (int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //这里是第二问,根据输入输出逆序和位数
    public static void reverseSUM(String s) {
        char[] chars=s.toCharArray();
        System.out.println("您输入的正整数位数为:"+chars.length);
        Stack stack =new Stack();
        for(char ch:chars){
            stack.push(ch);
        }
        for (int i = 0; i < chars.length; i++) {
            chars[i]=(char)stack.pop();
        }
        String t=String.valueOf(chars);
        System.out.println("颠倒后字符串为:"+t);
    }
    //这里是第三问函数,回文数判断
    public static void isPalindrome(int num){
        boolean flag=true;
        String s=String.valueOf(num);
        char[] chars=s.toCharArray();
        int i=0,j=chars.length-1;
        while (i<=j){
            if(chars[i]!=chars[j]){
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if (flag==true)
            System.out.println("这个数字是回文数");
        else
            System.out.println("这个数字不是回文数");
    }
    //这里是第四题,求水仙花数
    public static void Shuixianhua() {
        for (int i = 100; i < 999; i++) {
            int a=i/100;
            int b=(i-a*100)/10;
            int c=i%10;
            if(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3)==i){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    //这里是第五题
    public static void arraysDemo(){
        int[] a=new int[]{1,2,3,4,5,6,7,8,9,10};
        int max=a[0],min=a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i]>max)
                max=a[i];
            if (a[i]<min)
                min=a[i];
        }
        System.out.println("和为"+(min+max));
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("第一周选择题答案为BBDBD");
        System.out.println("请输入你要问的题目序号:");
        int ord=sc.nextInt();
        switch (ord) {
            case 1:
                System.out.println("输入三角形行数:");
                int n=sc.nextInt();
                showTriangle(n);
                break;
            case 2:
                System.out.println("输入你想颠倒的正整数");
                String two= sc.next();
                reverseSUM(two);
                break;
            case 3:
                System.out.println("输入你想判断的数");
                int three= sc.nextInt();
                isPalindrome(three);
                break;
            case 4:
                Shuixianhua();
                break;
            case 5:
                arraysDemo();
                break;
        }
    }
}