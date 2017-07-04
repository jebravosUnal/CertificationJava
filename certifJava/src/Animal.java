/**
 * Created by EBR3556 on 03/07/2017.
 */
public interface Animal{ public default String getName(){ return null; }}
interface Mammal { public default String getName(){ return null; }}
abstract class Otter implements Mammal, Animal{
//    @Override
//    public String getName() {
//        return null;
//    }
    @Override
    public abstract String getName();
}
