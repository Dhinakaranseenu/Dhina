import java.util.Scanner;

class Hello{
public static void main(String[] args){

    Scanner a = new Scanner(System.in);
    int ans = 0 ;
    int num ;
    num = a.nextInt();
    for(int i=1 ; i<=10 ; i++){
    ans = num * i ;
    System.out.println(num + "X" + i + "=" + ans);
}

int z = 1 ;
int num1 ;
int ans1;
num1 = a.nextInt();

while( z <= 10){
   ans1 = num1 * z ;
System.out.println(num1 + "X"+ z + "=" + ans1);
z++;
}

int y = 0 ;
int num2;
int ans2;
num2 = a.nextInt();

do{
    y++;
   ans2 = num2 * y ;
System.out.println(num2 + "X" + y + "=" + ans2);
}while( y <= 10);
}
}