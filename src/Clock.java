class Time{
    final private int min;
    final private int hou;

    public int getMin() {
        return min;
    }

    public int getHou() {
        return hou;
    }
    Time(int x, int y){
        if (x>12) {hou=x-12;}
            else {hou=x;}
        min=y;

    }
}

public class Clock {
     private final static float mdegree=6f;
     private final static float hdegree=30f;
     public static float  calcAngle(Time now){
         float min1degree=mdegree*(now.getMin());
         System.out.println("minutes= "+min1degree);
         float hou1degree=hdegree*now.getHou()+mdegree*5*now.getMin()/60f;
         System.out.println("hours= "+hou1degree);

         float angle=Math.abs(hou1degree-min1degree);
         if(angle>180)
             angle=360-angle;


         return angle;

     }
     public static void main(String[] args){
        //System.out.println("Hello!");
        Time now=new Time(0,30);
        System.out.println(calcAngle(now));
    }
}
