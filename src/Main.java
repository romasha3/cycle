//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1");
        System.out.print("Цикл for ");
        for(int i=500;i<=650;i=i+10){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Цикл while ");
        int a=500;
        while(a<=650){
            System.out.print(a+" ");
            a+=10;
        }
        System.out.println();
        System.out.print("Цикл do-while ");
        int b=500;
        do{
            System.out.print(b+" ");
            b+=10;
        }while (b<=650);
        System.out.println();
        System.out.println("Завдання 2 ");
        for(int c=2;2*c-1<=5000;c++){
            System.out.print(2*c-1+" ");
        }
        System.out.println();
        System.out.println("Завдання 3 ");
        int e=10;
        for(int d=1;d<=10;d++){
            if(e%d==0){
                System.out.print(d+" ");
            }
        }
        System.out.println();
        System.out.println("Завдання 4 ");
        System.out.print("Цикл for");
        int f,factorial;
        f=1;
        factorial=10;
        for(int num=1;num<=factorial;num++){
            f=f*num;
            System.out.println(factorial+"! = "+f);
        }
        System.out.println();
        System.out.print("Цикл while ");
        int i,num1,factorial1;
        i=1;
        num1=10;
        factorial1=1;
        while(i<=num1){
            factorial1*=i;
            System.out.println(num1+"! = "+factorial1);
            i++;
        }
        System.out.println();
        System.out.println("Завдання 5 ");
        int n = 0;
        for (int hour=0;hour<24;hour++){
            for (int minute=0;minute<60;minute++){
                if (hour/10==minute%10&&hour%10==minute/10){
                    n++;
                    if (hour<10){
                        System.out.print("0");
                    }
                    System.out.print(hour+":");
                    if(minute<10){
                        System.out.println("0"+minute);
                    }else{
                        System.out.println(minute);
                    }

                }

            }
        }
        System.out.println("Кільксть співпадінь: "+n);
    }
}