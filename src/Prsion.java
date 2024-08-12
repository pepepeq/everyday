import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * name：Prsion
 * date：2024/8/12
 * user：nl593
 * description：
 */
public class Prsion {
    public   List<Integer> shengcheng(){
        List<Integer> list = new ArrayList<Integer>();
        boolean l=true;
        while (l){
         Integer m = (int)(Math.random()*200);
         int flg=0;
            for (int j=0 ;j<list.size();j++) {
                if (list.get(j).equals(m) && m != 0) {
                    flg=1;
                }
            }
            if (flg==0) {
                list.add(m);
            }
            if (list.size()==100) {
                l=false;
            }

        }
        return list;

    }
    public List  chudiao(List<Integer> list){
        for (int i=0;i<list.size();i++){
            if(i%2==1){
                list.remove(i);
            }
        }
        if (list.size()==1) {
            return list;
        }
        return chudiao(list);
    }
    public static void main(String[] args) {
        Prsion p = new Prsion();
        System.out.println(p.shengcheng());
        p.chudiao(p.shengcheng());
        System.out.println(p.chudiao(p.shengcheng()));
    }
}
