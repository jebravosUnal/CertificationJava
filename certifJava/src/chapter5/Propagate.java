package chapter5;

/**
 * Created by EBR3556 on 05/07/2017.
 */
public class Propagate {
    public static void main(String[] args) {
        Propagate p = new Propagate();
        try{
            System.out.println(p.reverse(""));
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Main has ended");
        }
    }

    public String reverse(String s) throws Exception{

        if(s.length() == 0){
            throw  new Exception("Lenght is 0");
        }

        String reverse = "";
        for (int i = s.length()-1; i>=0; i--){
            reverse += s.charAt(i);
        }
        return reverse;
    }
}
