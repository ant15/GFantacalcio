
package gfantacalcio.object;


public class Formazione {
    
    private String[] mod = {
        "343",
        "352",
        "442",
        "433",
        "451",
        "532",
        "541",
        "631"};
    
    private int d;
    private int c;
    private int a;
    private String modulo;

    public void setD( ) {
        d = Integer.valueOf(modulo.charAt(0)).intValue();
    }

    public void setC( ) {
        c = Integer.valueOf(modulo.charAt(1)).intValue();
    }

    public void setA( ) {
        a = Integer.valueOf(modulo.charAt(2)).intValue();
    }

    public boolean setModulo(String modulo) {
        int i = 0;
        //int conta = 0;
        for(i=0 ; i<8 ; i++){
            if(modulo == mod[i]){
                this.modulo = modulo;
                return true;
            }
        }
        return false;
    }
    private void init(){
        d = Integer.valueOf(modulo.charAt(0)).intValue();
        c = Integer.valueOf(modulo.charAt(1)).intValue();
        a = Integer.valueOf(modulo.charAt(2)).intValue();
    }
}
