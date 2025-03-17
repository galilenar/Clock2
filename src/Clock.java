public class Clock {

     private final static float MDEGREE =6f;
     private final static float HDEGREE =30f;
     public static float  calcAngle(Time now){
         float min1degree= MDEGREE *(now.getMin());
         System.out.println("minutes= "+min1degree);
         float hou1degree= HDEGREE *now.getHou()+ MDEGREE *5*now.getMin()/60f;
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

    private static class Time{
        final private int min;
        final private int hou;

        public int getMin() {
            return min;
        }

        public int getHou() {
            return hou;
        }
        public Time(int hou, int min){
            if (hou>12) {this.hou=hou-12;}
                else {this.hou=hou;}
            this.min=min;

        }
    }
}
