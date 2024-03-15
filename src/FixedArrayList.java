import java.util.ArrayList;
import java.util.List;

public class FixedArrayList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("aa");

    }
}

class custumArrayList extends ArrayList{

    List<String> list=new ArrayList<>();

    @Override
    public boolean add(Object o) {
        return list.size() <= 10;
    }

}

//        Implement Functional Interface
//        ArrayList size fix
//
//        Spring Containers
//        Qulifier and Primary
//
//        transactionManagement in Microservices
//
//    make Hasmap threadsafe
//
//AWS Services
//AuthGuard
//
//Spring Security
//Reactive form vs normal Form
//
//Why String is immutable
// config server

