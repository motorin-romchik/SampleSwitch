public class SampleSwitch {
    public static void main (String args[]){
        for(int i = 0; i < 6; i++){
            switch(i){
                case 0:
                    System.out.println("число равно 0");
                    break;
                case 1:
                    System.out.println("число равно 1");
                    break;
                case 2:
                    System.out.println("число равно 2");
                    break;
                case 3:
                    System.out.println("число равно 3");
                    break;
                default:
                        System.out.println("число больше 3");
                        break;
            }
        }
    }
}
