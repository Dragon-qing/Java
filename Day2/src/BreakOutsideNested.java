public class BreakOutsideNested{
    public static void main(String[] args){
        Loop:for(int i=0;i<3;i++)
        {
            for(int j=0;j<6;j++) {
                if (j == 4)
                    break Loop;
                System.out.println("i=" + i + "j=" + j);
            }
        }
    }
}

