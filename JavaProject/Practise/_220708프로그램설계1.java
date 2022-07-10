importjava.util.Scanner;

publicclass_220708프로그램설계1{

ublicstaticvoidmain(String[]args){
//intx=100;
//inty=50;
//inta=x*y;
//
//System.out.println(a);

//intupper=10;
//intlow=30;
//intheight=20;
//intarea=(upper+low)*height/2;
//
//System.out.println(area);

//우리나라에서개인들은건물이나토지의면적단위로평을많이사용하고있다.
//그러나정부에서는고잇ㄱ적으로제곱미터(m^2)를사용하고있다.
//1평은3.305785m^2다사용자로부터평으로표시된면적을입력받아
//제곱미터로된면적으로변환하여출력하는프로그램을설계한후작성하라.

//Scannersc=newScanner(System.in);
//
//System.out.println("제곱미터로변환할평수를적으세요.:");
//inta=sc.nextInt();
//
//floatoutput=(float)(a*3.305785);
//
//System.out.printf("%d평은%.5f제곱미터이다.",a,output);

//문제4한사무실의벽들과천장을페인트칠하는데필요한페인트의양을계산하는프로그램을설계한후작성하라.
//사무실은가로와세로와높이를가진다.1통의페인트로500미터를칠할수있다고가정하라.
//사무실의가로와세로와높이를키보드를통해입력받아칠해야할총면적을계산하여필요한페인트의통수를계산한다.
//페인트의통수는실수일수있다.입력받은값들과결과를출력하라.

/*
*Scannersc=newScanner(System.in);
*
*System.out.print("가로길이는?");intx=sc.nextInt();System.out.print("세로길이는?");inty=
*sc.nextInt();System.out.print("높이길이는?");intheight=sc.nextInt();
*
*intarea=(x*y)+(x*height*2)+(y*height*2);
*
*System.out.println(area);intpaint=500;
*
*floatoutput=(float)area/paint;
*
*System.out.println("바닥을제외한칠할때필요한페인트통수는:"+output+"입니다.");
*/

//문제5.직각삼각형의밑변의길이와높이의길이를키보드를통해입력받아
//면적을계산하여출력하는프로그램을설계한후작성하라.

/*
*Scannersc=newScanner(System.in);
*
*System.out.println("직각삼각형의면적을구하고자한다.");
*
*System.out.print("밑변의길이는?");intlow=sc.nextInt();
*
*System.out.print("높이의길이는?");intheight=sc.nextInt();
*
*intarea=low*height/2;
*
*System.out.printf("밑변%d,높이%d인직각삼각형의면적은%d이다.",low,height,area);
*/

//문제6.구의부피를계산하는프로그램을설계한후작성하라.구의반지름(r)은키보드를통해입력받아야한다.
//구의부피를구하는공식은다음과같다.구의부피=4/3*파이*r^3

/*
*Scannersc=newScanner(System.in);System.out.println("구의부피를계산하고자한다.");
*System.out.print("구의반지름은?");intr=sc.nextInt();
*
*floatPI=(float)3.14;doublevolume=(float)(4/3*PI*r*r*r);
*
*System.out.printf("구의반지름은%.5f이다.",volume);
*/ 
	
	
//문제7.돼지저금통에들어있는동전들의총액을계산하여출력하는프로그램을설계한후작성하라.
//저금통에들어있는500원짜리,100원짜리,50원짜리와10원짜리동전들의수를나타내는정수값들을키보드를통해입력받아야
//한다.
/*
*Scannersc=newScanner(System.in);
*
*System.out.println("저금통에들어있는돈은?");inttotal=sc.nextInt();
*
*intbaek=0;intobaek=0;intosip=0;intsip=0;
*
*while(true){
*
*if(total>=500){total-=500;obaek++;continue;}elseif(total>=100){total-=100;
*baek++;continue;}
*
*elseif(total>=50){total-=50;osip++;continue;}elseif(total>=10){total-=10;
*sip++;continue;}else{break;}}System.out.println("오백원:"+obaek);
*System.out.println("백원:"+baek);System.out.println("오십원:"+osip);
*System.out.println("십원:"+sip);
*/
  
/*
*Scannersc=newScanner(System.in);
*
*intobaek=sc.nextInt();intbaek=sc.nextInt();intosip=sc.nextInt();intsip=
*sc.nextInt();
*
*inttotal=obaek*500+baek*100+osip*50+sip*10;
*
*System.out.println(total);
*/

//문제8.자동판매기로부터물건을사면거스름돈을계산하여알려주는프로그램을설계한후작성하라.
//자동판매기안에있는물건들의가격은모두1,000원이하이다.자동판매기는물건값으로1,000원짜리지폐만을받는다.
//거스름돈은500원,100원,50원,10원,5원,1원짜리동전들로만주어야한다.거스름돈에포함된동전들의개수는최소가
//되어야한다.
//프로그램출력은아래의출력과같아야한다.

Scannersc=newScanner(System.in);

System.out.printf("물건의가격(1,000원이하)을입력하세요.:");
intprice=sc.nextInt();

System.out.printf("%d원짜리물건을샀고,1,000원을내셨습니다.\n",price);
intodd=1000-price;
System.out.printf("거스름돈은%d원입니다.\n",odd);
System.out.println("거스름돈의내역은다음과같습니다.\n\n");

into=0;
intb=0;
intso=0;
intsb=0;
intsso=0;
intssb=0;

while(odd>0){

if(odd>=500){
odd-=500;
o++;
}elseif(odd>=100) {
odd-=100;
b++;
}elseif(odd>=50) {
odd-=50;
so++;
}elseif(odd>=10) {
odd-=10;
sb++;
}elseif(odd>=5) {
odd-=5;
sso++;
}elseif(odd>=1) {
odd-=1;
ssb++;
}
}



System.out.printf("오백원%d개\n",o);
System.out.printf("백원%d개\n",b);
System.out.printf("오십원%d개\n",so);
System.out.printf("십원%d개\n",sb);
System.out.printf("오원%d개\n",sso);
System.out.printf("일원%d개\n",ssb);


}

}
