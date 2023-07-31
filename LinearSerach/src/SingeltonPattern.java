import java.io.Serializable;

public class SingeltonPattern implements Serializable,Cloneable {

    private static final long serialVersionUID=1L;
    private static SingeltonPattern singeltonPattern;

    private SingeltonPattern(){

    }

    public static SingeltonPattern getInstance(){
        if(singeltonPattern==null){
           singeltonPattern=new SingeltonPattern();
         }
        return singeltonPattern;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
