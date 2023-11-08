package Myjava;

import java.util.*;
public class Main
{
public static void main(String[] args) {
//System.out.println("Hello World");
Scanner sc=new Scanner(System.in);
musical [] m=new musical[2];
int z=3;
while(z-->0){
System.out.println("press 1 for play, 2 for musical");
int c=sc.nextInt();
if(c==1){
   System.out.println("Enter title director writer");
   String t=sc.next();
   String d=sc.next();
   String w=sc.next();
   play obj1=new play(t,d,w);
   
   
}
if(c==2){
   System.out.println("Enter title director writer composer lyricist");
   String t=sc.next();
   String d=sc.next();
   String w=sc.next();
   String o=sc.next();
   String l=sc.next();
   int q=0;
    m[q]=new musical(t,d,w,o,l);
   q++;
   
   
   
}
}
    //int boxoffice=obj1.price+m[0].price+m[1].price;
  //  obj1.
   System.out.println("-----------------------------------------------------");
 //  System.out.println(play.box);
 System.out.println("Play perfomance price");
 System.out.println(play.playprice);
 System.out.println("musical perfomance price");
System.out.println(musical.musicalprice);
System.out.println("total perfomance price");
  System.out.println(play.price);
  System.out.println(play.performance);



}
}
class production{
   private String title;
   private String director;
   private String writer;
    production(String title,String director,String writer){
        this.settitle(title);
        this.setdirector(director);
        this.setwriter(writer);
    }
    void settitle(String title){
        this.title=title;
    }
    void setdirector(String director){
        this.director=director;
    }
    void setwriter(String writer){
        this.writer=writer;
    }
    String gettitle(){
        return this.title;
    }
    String getdirector(){
        return this.director;
    }
    String getwriter(){
        return this.writer;
    }
   
    void toprint(){
        System.out.println(this.title);
        System.out.println(this.director);
        System.out.println(this.writer);
    }
}
class play extends production{
Scanner sc=new Scanner(System.in);
static int performance=0;
static int price=0;
static int playprice=0;
//int box=0;
//static int box;
play(String title,String director,String writer){
    super(title,director,writer);
    play.performance+=1;
    System.out.println("Enter no of tickets for play");
    int c=sc.nextInt();
    play.price=play.price+c*500;
    play.playprice=play.playprice+c*500;
   // play.box=play.box+this.price;
   
}
int getperfomance()
{
    return performance;
}
public void toprint(){
     System.out.println(performance);
    System.out.println(this.gettitle());
    System.out.println(this.getdirector());
    System.out.println(this.getwriter());
    System.out.println(this.price);
    System.out.println("-------------------------------------------");
    System.out.println("Total box office");
    System.out.println(this.price);
   
}


}
class musical extends play{
    private String composer;
    private String lyricist;
    static int musicalprice=0;
   // int price1;
    musical(String name,String director,String writer,String composer, String lyricist){
        super(name,director,writer);
        this.setcomposer(composer);
        this.setlyricist(lyricist);
        play.performance+=1;
    System.out.println("Enter no of tickets for musical");
    int c=sc.nextInt();
    play.price=play.price+c*800;
    musical.musicalprice=musical.musicalprice+c*800;
   
   // play.box=play.box+this.price;
       
    }
    void setlyricist(String lyricist){
        this.lyricist=lyricist;
    }
    void setcomposer(String composer){
        this.composer=composer;
    }
  public  void toprint(){
    System.out.println(play.performance);
    System.out.println(this.composer);
    System.out.println(this.lyricist);
    System.out.println(this.gettitle());
    System.out.println(this.getdirector());
    System.out.println(this.getwriter());
    System.out.println("-------------------------------------------");
    System.out.println("Total box office");
    System.out.println(this.price);
     
    }

   
   
   
}

