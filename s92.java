class TimeTable{
    int year;
    String[]day={"Mon","Tue","Wed","Thu","Fri","Sat"};
    int[]period={1,2,3,4,5,6,7};
    String[]batch={"24CS","23CS","22CS","21CS"};
    String[]subject= {"OOPJ"};
    String[]faculty={"kutyar sir","Chitra madom"};
    boolean isLab;
    String section;
    TimeTable(int y1,String s1){
        this.year=y1;
        this.section=s1;}
    public void printTimeTable(){
        String heading=year+"-"+batch[year-1];
        System.out.println("TimeTable of year"+heading+"section"+section);}}
       
public class s92 {
    public static void main(String[] args){
      TimeTable tt2A=new TimeTable(2,"A");
      TimeTable tt2B=new TimeTable(2,"B");
      tt2A.printTimeTable();
      tt2B.printTimeTable();
    }
    
}
